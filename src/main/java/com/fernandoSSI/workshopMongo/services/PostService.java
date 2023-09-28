package com.fernandoSSI.workshopMongo.services;

import com.fernandoSSI.workshopMongo.domain.Post;
import com.fernandoSSI.workshopMongo.domain.User;
import com.fernandoSSI.workshopMongo.dto.UserDTO;
import com.fernandoSSI.workshopMongo.repositories.PostRepository;
import com.fernandoSSI.workshopMongo.repositories.UserRepository;
import com.fernandoSSI.workshopMongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<Post> findByTitle(String text){
        return repo.findByTitleContainingIgnoreCase(text);
    }
}
