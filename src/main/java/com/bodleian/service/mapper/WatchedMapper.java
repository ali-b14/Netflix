package com.bodleian.service.mapper;

import com.bodleian.domain.Video;
import com.bodleian.domain.Watched;
import com.bodleian.service.dto.VideoDTO;
import com.bodleian.service.dto.WatchedDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Watched} and its DTO {@link WatchedDTO}.
 */
@Mapper(componentModel = "spring")
public interface WatchedMapper extends EntityMapper<WatchedDTO, Watched> {
    @Mapping(target = "video", source = "video", qualifiedByName = "videoId")
    WatchedDTO toDto(Watched s);

    @Named("videoId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    VideoDTO toDtoVideoId(Video video);
}
