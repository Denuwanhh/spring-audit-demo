package demo.audit.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.history.RevisionRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends RevisionRepository<Image, Integer, Integer>, JpaRepository<Image, Integer>{

}
