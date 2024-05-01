package com.bodleian.domain;

import static com.bodleian.domain.CommentTestSamples.*;
import static com.bodleian.domain.VideoTestSamples.*;
import static org.assertj.core.api.Assertions.assertThat;

import com.bodleian.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class CommentTest {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Comment.class);
        Comment comment1 = getCommentSample1();
        Comment comment2 = new Comment();
        assertThat(comment1).isNotEqualTo(comment2);

        comment2.setId(comment1.getId());
        assertThat(comment1).isEqualTo(comment2);

        comment2 = getCommentSample2();
        assertThat(comment1).isNotEqualTo(comment2);
    }

    @Test
    void videoTest() throws Exception {
        Comment comment = getCommentRandomSampleGenerator();
        Video videoBack = getVideoRandomSampleGenerator();

        comment.setVideo(videoBack);
        assertThat(comment.getVideo()).isEqualTo(videoBack);

        comment.video(null);
        assertThat(comment.getVideo()).isNull();
    }
}
