package com.example.assignment.springboot.sample.repository;

import com.example.assignment.springboot.sample.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import static javax.swing.text.html.HTML.Tag.SELECT;
import static org.hibernate.hql.internal.antlr.HqlTokenTypes.*;

@Repository
@EnableJpaRepositories
public interface LocationRepository extends JpaRepository<Location, Long> {

    List<Location> findByState(String state);

    List<Location> findByNameStartingWith(String name);
}
