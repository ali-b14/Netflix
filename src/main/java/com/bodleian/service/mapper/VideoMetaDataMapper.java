package com.bodleian.service.mapper;

import com.bodleian.domain.VideoMetaData;
import com.bodleian.service.dto.VideoMetaDataDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link VideoMetaData} and its DTO {@link VideoMetaDataDTO}.
 */
@Mapper(componentModel = "spring")
public interface VideoMetaDataMapper extends EntityMapper<VideoMetaDataDTO, VideoMetaData> {}
