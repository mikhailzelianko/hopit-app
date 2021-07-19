package com.brodyagiby.hopit.repository;

import com.brodyagiby.hopit.domain.AdditionalMapObject;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the AdditionalMapObject entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AdditionalMapObjectRepository extends JpaRepository<AdditionalMapObject, Long> {}
