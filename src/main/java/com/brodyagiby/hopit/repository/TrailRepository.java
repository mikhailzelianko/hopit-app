package com.brodyagiby.hopit.repository;

import com.brodyagiby.hopit.domain.Trail;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the Trail entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TrailRepository extends JpaRepository<Trail, Long> {}
