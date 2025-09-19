package com.bumptech.glide.load;

import p000.F60;

/* loaded from: classes.dex */
public enum ImageHeaderParser$ImageType {
    GIF(true),
    JPEG(false),
    RAW(false),
    PNG_A(true),
    PNG(false),
    WEBP_A(true),
    WEBP(false),
    ANIMATED_WEBP(true),
    AVIF(true),
    UNKNOWN(false);


    /* renamed from: a */
    public final boolean f17785a;

    ImageHeaderParser$ImageType(boolean z) {
        this.f17785a = z;
    }

    public boolean hasAlpha() {
        return this.f17785a;
    }

    public boolean isWebp() {
        int i = F60.f3068a[ordinal()];
        return i == 1 || i == 2 || i == 3;
    }
}
