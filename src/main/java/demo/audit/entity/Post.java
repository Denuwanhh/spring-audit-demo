package demo.audit.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import org.hibernate.envers.Audited;
import org.hibernate.envers.NotAudited;
import org.springframework.data.history.RevisionMetadata;

@Entity
@Audited
public class Post {
	
	@Id
	@GeneratedValue
	@Column(name = "post_ID")
	private Integer postID;
	
	@Column(name = "post_Title")
	private String postTitle;
	
	@Column(name = "post_Content")
	private String postContent;
	
	@ManyToOne
    @JoinColumn(name="user_ID", nullable=false)
	private User postBy;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name = "post_ID")
	@NotAudited
	private List<Comment> comments;
	
	@ManyToOne
	@JoinColumn(name = "category_ID", nullable = false)
	@NotAudited
	private Category category;
	
	@OneToMany(mappedBy="post", cascade=CascadeType.ALL)
	private List<Image> images;
	
	@Transient
	private RevisionMetadata<Integer> editVersion;
	
	/**
	 * @return the postTitle
	 */
	public String getPostTitle() {
		return postTitle;
	}
	/**
	 * @param postTitle the postTitle to set
	 */
	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
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
	/**
	 * @return the postContent
	 */
	public String getPostContent() {
		return postContent;
	}
	/**
	 * @param postContent the postContent to set
	 */
	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}
	/**
	 * @return the postBy
	 */
	public User getPostBy() {
		return postBy;
	}
	/**
	 * @param postBy the postBy to set
	 */
	public void setPostBy(User postBy) {
		this.postBy = postBy;
	}
	/**
	 * @return the comments
	 */
	public List<Comment> getComments() {
		return comments;
	}
	/**
	 * @param comments the comments to set
	 */
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	/**
	 * @return the category
	 */
	public Category getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(Category category) {
		this.category = category;
	}
				
	/**
	 * @return the editVersion
	 */
	public RevisionMetadata<Integer> getEditVersion() {
		return editVersion;
	}
	/**
	 * @param editVersion the editVersion to set
	 */
	public void setEditVersion(RevisionMetadata<Integer> editVersion) {
		this.editVersion = editVersion;
	}
		
	/**
	 * @return the images
	 */
	public List<Image> getImages() {
		return images;
	}
	/**
	 * @param images the images to set
	 */
	public void setImages(List<Image> images) {
		this.images = images;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Post [postID=" + postID + ", postTitle=" + postTitle + ", postContent=" + postContent + ", postBy="
				+ postBy + ", comments=" + comments + ", category=" + category + "]";
	}
		
}
