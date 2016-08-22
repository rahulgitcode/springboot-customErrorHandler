package com.example.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {
	
	@Secured({"ROLE_GUEST","ROLE_USER"})
	@RequestMapping("/posts/view")
	public String viewPosts(){
		return "these are the posts available ....";
	}
	
	@Secured("ROLE_USER")
	@RequestMapping("/posts/list")
	public String listPosts(){
		return "you can list posts here ....";
	}
	
	@Secured({"ROLE_ADMIN","ROLE_USER"})
	@RequestMapping("/admin/add")
	public String addPosts(){
		return "you can add posts here ....";
	}
	
	@Secured("ROLE_ADMIN")
	@RequestMapping("/admin/delete")
	public String deletePosts(){
		return "you can delete posts here ....";
	}

}
