package com.brodyagiby.hopit.repository;

import com.brodyagiby.hopit.domain.TrailPath;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the TrailPath entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TrailPathRepository extends JpaRepository<TrailPath, Long> {}
