package demo.audit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.envers.Audited;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Audited
public class Image {

	@Id
	@GeneratedValue
	@Column(name = "image_ID")
	private Integer imageID;
	
	@Column(name = "image_caption")
	private String imageCaption;
	
	@Column(name = "image_URL")
	private String imageURL;
	
	@ManyToOne
    @JoinColumn(name="post_ID", nullable=false)
	@JsonIgnore
	private Post post;

	/**
	 * @return the imageID
	 */
	public Integer getImageID() {
		return imageID;
	}

	/**
	 * @param imageID the imageID to set
	 */
	public void setImageID(Integer imageID) {
		this.imageID = imageID;
	}

	/**
	 * @return the imageCaption
	 */
	public String getImageCaption() {
		return imageCaption;
	}

	/**
	 * @param imageCaption the imageCaption to set
	 */
	public void setImageCaption(String imageCaption) {
		this.imageCaption = imageCaption;
	}

	/**
	 * @return the imageURL
	 */
	public String getImageURL() {
		return imageURL;
	}

	/**
	 * @param imageURL the imageURL to set
	 */
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	/**
	 * @return the post
	 */
	public Post getPost() {
		return post;
	}

	/**
	 * @param post the post to set
	 */
	public void setPost(Post post) {
		this.post = post;
	}
	
	
}
