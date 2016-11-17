package net.qingruan.demo.action;

import org.apache.struts2.ServletActionContext;

import net.qingruan.demo.dao.NewsTypeDAO;

import com.opensymphony.xwork2.ActionSupport;

public class NewsTypeAction extends ActionSupport {

	//写接口类型,面向接口编程,依赖于接口
	private NewsTypeDAO newsTypeDAO;
	
	public void setNewsTypeDAO(NewsTypeDAO newsTypeDAO) {
		this.newsTypeDAO = newsTypeDAO;
	}

	public String findAll() 
	{
//		不能自己实例化,因为还需要设置sessionFactory,需要给spring要一个
//		
//		NewsTypeDAO dao = new NewsTypeDAOImpl();
		ServletActionContext.getRequest().setAttribute("newsTypes",newsTypeDAO.findAll());
		return null;
	}
}
