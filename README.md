# Spring Boot Audit Demo

Hibernate Envers project aimed to track data changes at the entity level with easy configurations in properties level and entity class level using annotations. The spring-data-envers project builds on top of Hibernate Envers and comes up as an extension of the Spring Data JPA project.

## Build with Maven
Minimum dependencies need to implement the project.
```
<dependency>
	<groupId>org.springframework.data</groupId>
	<artifactId>spring-data-envers</artifactId>
</dependency>
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
```

## Get the Revisions History
findRevisions(postID) Returns all Revisions of an entity with the given post id. 

    public List<Post> getPostEditHistory(Integer postID) {
    
	    List<Post> historyList = new ArrayList<Post>();
    
	    postRepository.findRevisions(postID).get().forEach(x -> {
		    x.getEntity().setEditVersion(x.getMetadata());
			historyList.add(x.getEntity());
		});
	    
	    return historyList;
    }

