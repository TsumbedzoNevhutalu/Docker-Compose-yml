package com.example.dockercompose.repo;

import com.example.dockercompose.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
