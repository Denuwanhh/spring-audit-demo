package demo.audit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Comment {

	@Id
	@GeneratedValue
	@Column(name = "comment_ID")
	private Integer commentID;
	@Column(name = "comment_content")
	private String commentContent;
	@OneToOne
	@JoinColumn(name = "user_ID", nullable = false)
	private User commentBy;
	@Column(name = "post_ID")
	private Integer postID;
	
	/**
	 * @return the commentID
	 */
	public Integer getCommentID() {
		return commentID;
	}
	/**
	 * @param commentID the commentID to set
	 */
	public void setCommentID(Integer commentID) {
		this.commentID = commentID;
	}
	/**
	 * @return the commentContent
	 */
	public String getCommentContent() {
		return commentContent;
	}
	/**
	 * @param commentContent the commentContent to set
	 */
	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}
	/**
	 * @return the commentBy
	 */
	public User getCommentBy() {
		return commentBy;
	}
	/**
	 * @param commentBy the commentBy to set
	 */
	public void setCommentBy(User commentBy) {
		this.commentBy = commentBy;
	}
	/**
	 * @return the postID
	 */
	public Integer getPostID() {
		return postID;
	}
	/**
	 * @param postID the postID to set
	 */
	public void setPostID(Integer postID) {
		this.postID = postID;
	}
	
}
