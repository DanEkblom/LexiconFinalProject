package com.danekblom.lexicon.finalprojectrest.services;

import com.danekblom.lexicon.finalprojectrest.model.Audio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AudioRepository extends JpaRepository<Audio, Integer> {
}
