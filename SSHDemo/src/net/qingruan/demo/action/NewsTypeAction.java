package net.qingruan.demo.action;

import org.apache.struts2.ServletActionContext;

import net.qingruan.demo.dao.NewsTypeDAO;

import com.opensymphony.xwork2.ActionSupport;

public class NewsTypeAction extends ActionSupport {

	//д�ӿ�����,����ӿڱ��,�����ڽӿ�
	private NewsTypeDAO newsTypeDAO;
	
	public void setNewsTypeDAO(NewsTypeDAO newsTypeDAO) {
		this.newsTypeDAO = newsTypeDAO;
	}

	public String findAll() 
	{
//		�����Լ�ʵ����,��Ϊ����Ҫ����sessionFactory,��Ҫ��springҪһ��
//		
//		NewsTypeDAO dao = new NewsTypeDAOImpl();
		ServletActionContext.getRequest().setAttribute("newsTypes",newsTypeDAO.findAll());
		return null;
	}
}
