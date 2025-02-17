package com.fastcampus.board_admin_project.controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/management/articles")
@Controller
public class ArticleManagementController {

    @GetMapping
    public String articles(
            @PageableDefault(size = 10, sort = "createdAt", direction = Sort.Direction.DESC) Pageable pageable,
            HttpServletRequest request, // HttpServletRequest 추가
            Model model
    ) {
        model.addAttribute("request", request);
        return "management/articles";
    }

}
