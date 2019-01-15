package com.hxzy.controller;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.lang.Integer;
import com.hxzy.dao.BookDao;
import com.hxzy.entity.Book;

@Controller
@RequestMapping("/book")
public class BookController {
	@Resource
	private BookDao bookDao;
	/**
	 * * jsp
	 * 在动态HTML实现上，SpringBoot 提供了多种
	 * 模版引擎，默认配置支持，
	 * 所以在推荐的模版引擎下，可以很快的上手开发动态网页
	 * 主要提供如下几种模板引擎
	 * Thymeleaf
	 * FreeMarker
	 * Velocity
	 * Groovy
	 * Mustache
	 * SpringBoot建议使用以上这些模板引擎，避免使用jsp,如果一定要使用则无法实现
	 * SpringBoot的多种特性。如果使用了以上模版引擎，默认的配置路径
	 * src/main/resources/templates
	 * @return
	 */
	@RequestMapping("/list")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("bookList",bookDao.findAll());
		mav.setViewName("bookList");
		return mav;
	}
	@GetMapping("/delete")
	public String delete(
			Integer id) {
		System.out.println("删除方法"+id);
		Book bok = new Book();
		bok.setId(id);
		bookDao.delete(bok);
		return "redirect:/book/list";
	}
	@GetMapping("/preupdate/{id}")
	public ModelAndView preupdate(
		@PathVariable("id")	Integer id) {
		ModelAndView mav = new ModelAndView();
		System.out.println(bookDao.getOne(id).getName());
		mav.addObject("book",bookDao.getOne(id));
		mav.setViewName("bookUpdate");
		return mav;
	}
	@PostMapping("/addBook")
	public String update(Book book) {
		bookDao.save(book);
		return "redirect:/book/list";
	}
	@PostMapping("/doupdate")
	public String doupdate(Book book) {
			bookDao.save(book);
		return "redirect:/book/list";
	}
	@GetMapping("/add")
	public String add() {
		return "bookAdd";
	}
}
