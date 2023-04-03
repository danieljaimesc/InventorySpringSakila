package com.springsakila.application;

import com.springsakila.domain.contracts.services.ActorService;
import com.springsakila.domain.contracts.services.CategoryService;
import com.springsakila.domain.contracts.services.FilmService;
import com.springsakila.domain.contracts.services.LanguageService;
import com.springsakila.infrastructure.dto.ActorDTO;
import com.springsakila.infrastructure.dto.FilmEditDTO;
import com.springsakila.infrastructure.dto.NovedadesDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.Instant;

@Service
public class CatalogService {
    @Autowired
    private FilmService filmSrv;
    @Autowired
    private ActorService artorSrv;
    @Autowired
    private CategoryService categorySrv;
    @Autowired
    private LanguageService languageSrv;

    public NovedadesDTO novedades(Timestamp fecha) {
        // Timestamp fecha = Timestamp.valueOf("2019-01-01 00:00:00");
        if (fecha == null)
            fecha = Timestamp.from(Instant.now().minusSeconds(36000));
        return new NovedadesDTO(
                filmSrv.novedades(fecha).stream().map(item -> FilmEditDTO.from(item)).toList(),
                artorSrv.novedades(fecha).stream().map(item -> ActorDTO.from(item)).toList(),
                categorySrv.novedades(fecha),
                languageSrv.novedades(fecha)
        );
    }

}
