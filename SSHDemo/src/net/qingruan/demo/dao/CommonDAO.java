package net.qingruan.demo.dao;

import java.util.List;

import net.qingruan.demo.util.Pager;

public interface CommonDAO<T> {
	void save(T object);
	void delete(T object);
	void delete(Integer id);
	void update(T object);
	T findById(Integer id);
	List<T> findAll();
	List<T> findAll(T object);	
	long getDataCount();
	List<T> findAll(Pager pager);
	List<T> findAll(Pager pager,T object);
	
}
