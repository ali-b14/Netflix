package com.bodleian.service.mapper;

import com.bodleian.domain.Video;
import com.bodleian.domain.VideoMetaData;
import com.bodleian.service.dto.VideoDTO;
import com.bodleian.service.dto.VideoMetaDataDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Video} and its DTO {@link VideoDTO}.
 */
@Mapper(componentModel = "spring")
public interface VideoMapper extends EntityMapper<VideoDTO, Video> {
    @Mapping(target = "metaData", source = "metaData", qualifiedByName = "videoMetaDataId")
    VideoDTO toDto(Video s);

    @Named("videoMetaDataId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    VideoMetaDataDTO toDtoVideoMetaDataId(VideoMetaData videoMetaData);
}
