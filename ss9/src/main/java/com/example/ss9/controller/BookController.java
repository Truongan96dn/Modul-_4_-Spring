package com.example.ss9.controller;

import com.example.ss9.Exeption.CheckBookZero;
import com.example.ss9.Exeption.CheckCode;
import com.example.ss9.model.Book;
import com.example.ss9.model.Orders;
import com.example.ss9.service.IBookService;
import com.example.ss9.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

@Controller
public class BookController {
    @Autowired
    private IBookService iBookService;
    @Autowired
    private IOrderService iOrderService;

    @GetMapping("/")
    public String getBooks(Model model) {
        model.addAttribute("listBook", iBookService.findAll());
        return "homepage";
    }


    @GetMapping("/form-givebookback/{id}")
    public String showFormgiveBookBack(@PathVariable(value = "id") int id, Model model) {
        Book book = iBookService.findById(id);
        model.addAttribute("book", book);
        return "return_book";
    }

    @GetMapping("/givebookback")
    public String giveBookBack(@RequestParam(value = "code") int code ,
                               @RequestParam(value = "id") int id ) throws CheckCode {
        Book book = iBookService.findById(id);
        List<Orders> list = iOrderService.findAll();
        for (int i = 0; i < list.size(); i++) {
            if(code == list.get(i).getCode()){
                book.setCount(book.getCount() + 1);
                iBookService.createBook(book);
                return "redirect:/";
            }
        }
        throw new CheckCode();
    }


    @GetMapping("/oder/{id}")
    public String oderBook(@PathVariable(name = "id") int id, Model model) throws CheckBookZero {
        Book book;
        Orders order = new Orders();

        int codeBook = iOrderService.getCodeBook();
        model.addAttribute("codeBook", codeBook);
        Date borrowedTime = new Date();

        order.setCode(codeBook);
        order.setDate(borrowedTime);

        model.addAttribute("listOder", iBookService.findAll());

        book = iBookService.findById(id);
        if (book.getCount() == 0) {
            throw new CheckBookZero();
        }
        book.setCount(book.getCount() - 1);
        List<Orders> orders = book.getList();
        orders.add(order);
        book.setList(orders);
        iOrderService.createOder(order);
        iBookService.createBook(book);


        return "notification";
    }

    @ExceptionHandler(CheckBookZero.class)
    public ModelAndView checkBook() {
        ModelAndView modelAndView = new ModelAndView("errors");
        return modelAndView;
    }
    @ExceptionHandler(CheckCode.class)
    public String checkCode() {
        return "check_code";
    }

}
