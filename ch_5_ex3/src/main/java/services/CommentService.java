package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    public CommentService() {

        System.out.println("CommentService instance created");
    }

}
