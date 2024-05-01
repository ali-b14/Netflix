package com.bodleian.service.mapper;

import com.bodleian.domain.Comment;
import com.bodleian.domain.Video;
import com.bodleian.service.dto.CommentDTO;
import com.bodleian.service.dto.VideoDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Comment} and its DTO {@link CommentDTO}.
 */
@Mapper(componentModel = "spring")
public interface CommentMapper extends EntityMapper<CommentDTO, Comment> {
    @Mapping(target = "video", source = "video", qualifiedByName = "videoId")
    CommentDTO toDto(Comment s);

    @Named("videoId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    VideoDTO toDtoVideoId(Video video);
}
