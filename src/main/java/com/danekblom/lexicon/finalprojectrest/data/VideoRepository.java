package com.danekblom.lexicon.finalprojectrest.data;

import com.danekblom.lexicon.finalprojectrest.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Integer> {
}
