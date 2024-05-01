package com.bodleian.repository;

import com.bodleian.domain.Watched;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the Watched entity.
 */
@SuppressWarnings("unused")
@Repository
public interface WatchedRepository extends JpaRepository<Watched, Long> {}
