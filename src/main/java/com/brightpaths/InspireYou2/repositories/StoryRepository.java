package com.brightpaths.InspireYou2.repositories;

import com.brightpaths.InspireYou2.entities.Story;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoryRepository extends JpaRepository<Story,Long> {
}
