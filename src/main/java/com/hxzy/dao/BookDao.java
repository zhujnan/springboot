package com.hxzy.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import com.hxzy.entity.Book;
/**
 * 该接口中没有实现类，继承基础CRUD实现 
 * 泛型1：实体类
 * 泛型2：主键映射类型
 * @author Administrator
 *
 */
public interface BookDao 
	extends JpaRepository<Book, Integer>  {


}
