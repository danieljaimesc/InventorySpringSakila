package com.springsakila.application;

import com.springsakila.domain.contracts.services.CategoryService;
import com.springsakila.domain.contracts.services.CharacterService;
import com.springsakila.domain.contracts.services.FilmService;
import com.springsakila.domain.contracts.services.LanguageService;
import com.springsakila.infrastructure.dto.CharacterDTO;
import com.springsakila.infrastructure.dto.FilmEditDTO;
import com.springsakila.infrastructure.dto.NewsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.Instant;

@Service
public class CatalogService {
    @Autowired
    private FilmService filmSrv;
    @Autowired
    private CharacterService characterSrv;
    @Autowired
    private CategoryService categorySrv;
    @Autowired
    private LanguageService languageSrv;

    public NewsDTO news(Timestamp date) {
        // Timestamp valid format: "2019-01-01 00:00:00"
        if (date == null)
            date = Timestamp.from(Instant.now().minusSeconds(36000));
        return new NewsDTO(
                filmSrv.news(date).stream().map(FilmEditDTO::from).toList(),
                characterSrv.news(date).stream().map(CharacterDTO::from).toList(),
                categorySrv.news(date),
                languageSrv.news(date)
        );
    }

}
