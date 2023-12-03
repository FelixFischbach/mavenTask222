package ru.test2.spring.repo;

import org.springframework.data.repository.CrudRepository;
import ru.test2.spring.models.Post;

public interface PostRepository extends CrudRepository<Post, Long> {



}
