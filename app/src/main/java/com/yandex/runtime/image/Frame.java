package com.yandex.runtime.image;

/* loaded from: classes2.dex */
public class Frame {
    private final long duration;
    private final ImageProvider image;

    public Frame(ImageProvider imageProvider, long j) {
        this.image = imageProvider;
        this.duration = j;
    }

    public long getDuration() {
        return this.duration;
    }

    public ImageProvider getImage() {
        return this.image;
    }
}
