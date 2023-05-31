package com.example.ss8.dto;

import com.example.ss8.model.User;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;


import javax.validation.constraints.*;


public class UserDTO implements Validator {
    private  Integer id;
    @NotBlank(message = "không được để trống")
    @Size(min = 5,max = 45,message = "Tên tối thiểu 5 ký tự và tối đa 45 ký tự")
    private String firstName;
    @NotBlank(message = "không được để trống")
    @Size(min = 5,max = 45,message = "Tên tối thiểu 5 ký tự và tối đa 45 ký tự")
    private String lastName;
    @NotBlank(message = "không được để trống")
    private String phoneNumber;
    @Min(value = 18,message = "tối thiểu là 18 tuổi ")
    @Max(value = 100,message = "Số tuổi không được quá 100")
    @NotNull(message = "không được để trống")
    private Integer age;
    @NotBlank(message = "không được để trống")
    @Email(message = "không đúng định dạng email")
    private String email;

    public UserDTO() {
    }

    public UserDTO(Integer id, String firstName, String lastName, String phoneNumber, Integer age, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        UserDTO userDTO = (UserDTO) target;
        String regexPhone = "^0[1-9][0-9]{8}$";
        if(!userDTO.phoneNumber.matches(regexPhone)){
            errors.rejectValue("phoneNumber","","số điện thoại không đúng định dạng");
        }

    }
}
