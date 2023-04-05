package com.springsakila.application;

import com.springsakila.domain.contracts.repositories.CategoryRepository;
import com.springsakila.domain.contracts.repositories.CharacterRepository;
import com.springsakila.domain.contracts.repositories.FilmRepository;
import com.springsakila.domain.contracts.repositories.LanguageRepository;
import com.springsakila.domain.entities.Category;
import com.springsakila.domain.entities.Language;
import com.springsakila.infrastructure.dto.CharacterDTO;
import com.springsakila.infrastructure.dto.FilmEditDTO;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Timestamp;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CatalogServiceTest {
    @Autowired
    private CatalogService catalogService;

    @Autowired
    private FilmRepository filmRepository;
    @Autowired
    private CharacterRepository characterRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private LanguageRepository languageRepository;


    @Nested
    class OK {

        @Test
        void testNews_ReturnPropertiesAndNewsOfEachServiceAreEquals() {
            Timestamp date = null;
            List<FilmEditDTO> filmEditDTOList =
                    filmRepository.findByLastUpdateGreaterThanEqualOrderByLastUpdate(date).stream().map(FilmEditDTO::from).toList();
            List<CharacterDTO> characterDTOList =
                    characterRepository.findByLastUpdateGreaterThanEqualOrderByLastUpdate(date).stream().map(CharacterDTO::from).toList();
            List<Category> categoryList = categoryRepository.findByLastUpdateGreaterThanEqualOrderByLastUpdate(date);
            List<Language> languageList = languageRepository.findByLastUpdateGreaterThanEqualOrderByLastUpdate(date);
            var newsDTO = catalogService.news(date);
            assertAll("Verify NewsDTO properties and list of each Repository",
                    () -> assertEquals(filmEditDTOList, newsDTO.getFilms()),
                    () -> assertEquals(characterDTOList, newsDTO.getCharacters()),
                    () -> assertEquals(categoryList, newsDTO.getCategories()),
                    () -> assertEquals(languageList, newsDTO.getLanguages()));
        }
    }

    @Nested
    class KO {
        @Test
        void news() {

        }
    }

}