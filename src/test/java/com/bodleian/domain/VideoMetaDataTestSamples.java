package com.bodleian.domain;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

public class VideoMetaDataTestSamples {

    private static final Random random = new Random();
    private static final AtomicLong longCount = new AtomicLong(random.nextInt() + (2 * Integer.MAX_VALUE));

    public static VideoMetaData getVideoMetaDataSample1() {
        return new VideoMetaData().id(1L).type("type1").description("description1");
    }

    public static VideoMetaData getVideoMetaDataSample2() {
        return new VideoMetaData().id(2L).type("type2").description("description2");
    }

    public static VideoMetaData getVideoMetaDataRandomSampleGenerator() {
        return new VideoMetaData()
            .id(longCount.incrementAndGet())
            .type(UUID.randomUUID().toString())
            .description(UUID.randomUUID().toString());
    }
}
