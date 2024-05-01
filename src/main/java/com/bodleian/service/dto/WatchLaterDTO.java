package com.bodleian.service.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.bodleian.domain.WatchLater} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class WatchLaterDTO implements Serializable {

    private Long id;

    private VideoDTO video;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public VideoDTO getVideo() {
        return video;
    }

    public void setVideo(VideoDTO video) {
        this.video = video;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WatchLaterDTO)) {
            return false;
        }

        WatchLaterDTO watchLaterDTO = (WatchLaterDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, watchLaterDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "WatchLaterDTO{" +
            "id=" + getId() +
            ", video=" + getVideo() +
            "}";
    }
}
