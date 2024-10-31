package com.example.roma.controller;

// ЭТО ФАЙЛ ДЛЯ КОНТРОЛЛЕРОВ КОТОРЫЙ ОБРАБАТЫВАЮТ ЗАПРОСЫ ТВОИ

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model) {
        // TODO: Реализовать логику аутентификации
        // Проверьте, существует ли пользователь с указанным логином и паролем
        // Если пользователь существует, перенаправьте на главную страницу
        // Если пользователь не существует, верните сообщение об ошибке
        return "login";
    }

    @GetMapping("/register")
    public String showRegistrationForm() {
        return "registration";
    }

    @PostMapping("/register")
    public String register(@RequestParam String username, @RequestParam String password, @RequestParam String name, @RequestParam int age, Model model) {
        // TODO: Реализовать логику регистрации
        // Проверьте, существует ли пользователь с указанным логином
        // Если пользователь не существует, создайте нового пользователя
        // Если пользователь существует, верните сообщение об ошибке
        return "login";
    }
}