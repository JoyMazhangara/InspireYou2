package com.brightpaths.InspireYou2.repositories;

import com.brightpaths.InspireYou2.entities.Compliment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComplimentRepository extends JpaRepository<Compliment, Long> {
}
