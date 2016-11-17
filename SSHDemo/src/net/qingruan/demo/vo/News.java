package net.qingruan.demo.vo;

import java.sql.Timestamp;

/**
 * News entity. @author MyEclipse Persistence Tools
 */

public class News implements java.io.Serializable {

	// Fields

	private Integer id;
	private NewsType newsType;
	private String title;
	private Integer adminId;
	private String info;
	private Timestamp inputTime;
	private Integer commentCount;
	private String pic;
	private Integer hitCount;
	private Boolean isHot;
	private Boolean isTop;
	private String keyword;
	private String description;
	private Boolean enable;

	// Constructors

	/** default constructor */
	public News() {
	}

	/** full constructor */
	public News(NewsType newsType, String title, Integer adminId, String info,
			Timestamp inputTime, Integer commentCount, String pic,
			Integer hitCount, Boolean isHot, Boolean isTop, String keyword,
			String description, Boolean enable) {
		this.newsType = newsType;
		this.title = title;
		this.adminId = adminId;
		this.info = info;
		this.inputTime = inputTime;
		this.commentCount = commentCount;
		this.pic = pic;
		this.hitCount = hitCount;
		this.isHot = isHot;
		this.isTop = isTop;
		this.keyword = keyword;
		this.description = description;
		this.enable = enable;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public NewsType getNewsType() {
		return this.newsType;
	}

	public void setNewsType(NewsType newsType) {
		this.newsType = newsType;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getAdminId() {
		return this.adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public String getInfo() {
		return this.info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Timestamp getInputTime() {
		return this.inputTime;
	}

	public void setInputTime(Timestamp inputTime) {
		this.inputTime = inputTime;
	}

	public Integer getCommentCount() {
		return this.commentCount;
	}

	public void setCommentCount(Integer commentCount) {
		this.commentCount = commentCount;
	}

	public String getPic() {
		return this.pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public Integer getHitCount() {
		return this.hitCount;
	}

	public void setHitCount(Integer hitCount) {
		this.hitCount = hitCount;
	}

	public Boolean getIsHot() {
		return this.isHot;
	}

	public void setIsHot(Boolean isHot) {
		this.isHot = isHot;
	}

	public Boolean getIsTop() {
		return this.isTop;
	}

	public void setIsTop(Boolean isTop) {
		this.isTop = isTop;
	}

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getEnable() {
		return this.enable;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
	}

}