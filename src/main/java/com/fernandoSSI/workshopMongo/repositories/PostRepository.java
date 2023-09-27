package com.fernandoSSI.workshopMongo.repositories;

import com.fernandoSSI.workshopMongo.domain.Post;
import com.fernandoSSI.workshopMongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
