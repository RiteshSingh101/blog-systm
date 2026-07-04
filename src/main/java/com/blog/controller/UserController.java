package com.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.blog.constant.AppUiPages;
import com.blog.service.BlogService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

	private final BlogService blogService;

	@GetMapping("/dashboard")
	public String dashBoardPage(Model model, @RequestParam(required = false, defaultValue = "0") Integer pageno,
			@RequestParam(required = false, defaultValue = "null") String search,
			@RequestParam(required = false, defaultValue = "null") String sort) {
		return blogService.dashboard(model, pageno, search, sort);
	}
	
	
	@GetMapping("/post")
	public String search() {
		return AppUiPages.POST;
	}

	
	@GetMapping("/profile")
	public String profilePage() {
		return "profile.jsp";
	}
	
	
}
