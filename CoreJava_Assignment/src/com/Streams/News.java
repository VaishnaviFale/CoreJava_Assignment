package com.Streams;

public class News {
	
     int newsId; 
     String postedByUser;
     String commentByUser; 
     String comment;
     
	public News(int newsId, String postedByUser, String commentByUser, String comment) {
		super();
		this.newsId = newsId;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}

	/**
	 * @return the newsId
	 */
	public int getNewsId() {
		return newsId;
	}

	/**
	 * @param newsId the newsId to set
	 */
	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}

	/**
	 * @return the postedByUser
	 */
	public String getPostedByUser() {
		return postedByUser;
	}

	/**
	 * @param postedByUser the postedByUser to set
	 */
	public void setPostedByUser(String postedByUser) {
		this.postedByUser = postedByUser;
	}

	/**
	 * @return the commentByUser
	 */
	public String getCommentByUser() {
		return commentByUser;
	}

	/**
	 * @param commentByUser the commentByUser to set
	 */
	public void setCommentByUser(String commentByUser) {
		this.commentByUser = commentByUser;
	}

	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}
     
	
     

}
