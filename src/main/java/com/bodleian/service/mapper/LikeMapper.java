package com.bodleian.service.mapper;

import com.bodleian.domain.Like;
import com.bodleian.domain.Video;
import com.bodleian.service.dto.LikeDTO;
import com.bodleian.service.dto.VideoDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Like} and its DTO {@link LikeDTO}.
 */
@Mapper(componentModel = "spring")
public interface LikeMapper extends EntityMapper<LikeDTO, Like> {
    @Mapping(target = "video", source = "video", qualifiedByName = "videoId")
    LikeDTO toDto(Like s);

    @Named("videoId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    VideoDTO toDtoVideoId(Video video);
}
