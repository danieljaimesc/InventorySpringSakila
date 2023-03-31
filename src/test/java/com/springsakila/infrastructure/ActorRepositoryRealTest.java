package com.springsakila.infrastructure;

import com.springsakila.domain.contracts.repositories.ActorRepository;
import com.springsakila.domain.entities.Actor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DataJpaTest
public class ActorRepositoryRealTest {
    @Autowired
    ActorRepository dao;
    @Autowired
    private TestEntityManager em;

    @BeforeEach
    void setUp() throws Exception {
        /*
        TODO - Actor constructor
        em.persist(new Actor(0, "", ""));
        em.persist(new Actor(0, "", ""));
        em.persist(new Actor(0, "", ""));
        */
    }

    @Test
    void testAll() {
        assertEquals(3, dao.findAll().size());
    }

    @Test
    void testOne() {
        var item = dao.findById(1);
        assertTrue(item.isPresent());
        assertEquals("Pepito", item.get().getFirstName());
    }

    @Test
    void testSave() {
        var item = dao.save(new Actor());
    }
}
