package com.yandex.mapkit.layers;

/* loaded from: classes2.dex */
public interface DataSource {
    String getId();

    void invalidate(String str);

    boolean isValid();
}
