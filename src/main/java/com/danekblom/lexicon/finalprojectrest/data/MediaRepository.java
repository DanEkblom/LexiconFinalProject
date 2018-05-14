package com.danekblom.lexicon.finalprojectrest.data;

import com.danekblom.lexicon.finalprojectrest.model.Media;
import com.danekblom.lexicon.finalprojectrest.utils.Language;
import com.danekblom.lexicon.finalprojectrest.utils.MediaType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface MediaRepository<T extends Media> extends JpaRepository<Media, Integer> {

    public T findByTitle(String title);

    public T findByYear(int year);

    public T findByMediaType(MediaType mediaType);

    public T findByLanguage(Language language);

    public T findByBarCode(String barCode);

    // TODO: If more fields are added to Media, write methods that apply to all subclasses.
}
