package com.bodleian.repository;

import com.bodleian.domain.WatchLater;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the WatchLater entity.
 */
@SuppressWarnings("unused")
@Repository
public interface WatchLaterRepository extends JpaRepository<WatchLater, Long> {}
