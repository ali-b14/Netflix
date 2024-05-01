package com.bodleian.repository;

import com.bodleian.domain.VideoMetaData;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the VideoMetaData entity.
 */
@SuppressWarnings("unused")
@Repository
public interface VideoMetaDataRepository extends JpaRepository<VideoMetaData, Long> {}
