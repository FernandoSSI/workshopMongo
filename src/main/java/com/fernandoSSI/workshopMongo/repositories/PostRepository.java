package com.fernandoSSI.workshopMongo.repositories;

import com.fernandoSSI.workshopMongo.domain.Post;
import com.fernandoSSI.workshopMongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {


    List<Post> findByTitleContainingIgnoreCase(String text);


}
