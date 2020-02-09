package demo.audit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.audit.entity.Comment;
import demo.audit.entity.Image;
import demo.audit.entity.Post;
import demo.audit.entity.User;
import demo.audit.service.BlogService;

@RestController()
@RequestMapping("/blog")
public class BlogController {

	@Autowired
	private BlogService blogService;
	
	@GetMapping( path="/user")
	public List<User> getAllUsers(){
		return blogService.getAllUsers();
	}
	
	@PostMapping( path="/user")
	public User createNewUser(@RequestBody User user){
		return blogService.createNewUser(user);
	}
	
	@GetMapping( path="/post")
	public List<Post> getAllPosts(){
		return blogService.getAllPosts();
	}
	
	@PostMapping( path="/post")
	public Post creaeNewPost(@RequestBody Post post){
		return blogService.createNewPost(post);
	}
	
	@PatchMapping( path="/post/{postID}")
	public Post updatePost(@PathVariable Integer postID, @RequestBody Post post){
		return blogService.editPost(postID, post);
	}
	
	@GetMapping( path="/post/{postID}/history")
	public List<Post> getPostEditHistory(@PathVariable Integer postID){
		return blogService.getPostEditHistory(postID);
	}
	
	@PostMapping( path="/post/{postID}/comment")
	public List<Comment> creaeNewComment(@PathVariable Integer postID, @RequestBody Comment comment){
		return blogService.createComment(postID, comment);
	}
	
	@PostMapping( path="/post/{postID}/image")
	public Image addNewImage(@PathVariable Integer postID, @RequestBody Image image){
		return blogService.addNewImage(postID, image);
	}
}
