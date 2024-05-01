package com.bodleian.service.mapper;

import static com.bodleian.domain.WatchedAsserts.*;
import static com.bodleian.domain.WatchedTestSamples.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WatchedMapperTest {

    private WatchedMapper watchedMapper;

    @BeforeEach
    void setUp() {
        watchedMapper = new WatchedMapperImpl();
    }

    @Test
    void shouldConvertToDtoAndBack() {
        var expected = getWatchedSample1();
        var actual = watchedMapper.toEntity(watchedMapper.toDto(expected));
        assertWatchedAllPropertiesEquals(expected, actual);
    }
}
