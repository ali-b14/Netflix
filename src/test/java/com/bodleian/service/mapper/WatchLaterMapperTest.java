package com.bodleian.service.mapper;

import static com.bodleian.domain.WatchLaterAsserts.*;
import static com.bodleian.domain.WatchLaterTestSamples.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WatchLaterMapperTest {

    private WatchLaterMapper watchLaterMapper;

    @BeforeEach
    void setUp() {
        watchLaterMapper = new WatchLaterMapperImpl();
    }

    @Test
    void shouldConvertToDtoAndBack() {
        var expected = getWatchLaterSample1();
        var actual = watchLaterMapper.toEntity(watchLaterMapper.toDto(expected));
        assertWatchLaterAllPropertiesEquals(expected, actual);
    }
}
