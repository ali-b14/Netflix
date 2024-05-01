package com.bodleian.service.mapper;

import com.bodleian.domain.Video;
import com.bodleian.domain.WatchLater;
import com.bodleian.service.dto.VideoDTO;
import com.bodleian.service.dto.WatchLaterDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link WatchLater} and its DTO {@link WatchLaterDTO}.
 */
@Mapper(componentModel = "spring")
public interface WatchLaterMapper extends EntityMapper<WatchLaterDTO, WatchLater> {
    @Mapping(target = "video", source = "video", qualifiedByName = "videoId")
    WatchLaterDTO toDto(WatchLater s);

    @Named("videoId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    VideoDTO toDtoVideoId(Video video);
}
