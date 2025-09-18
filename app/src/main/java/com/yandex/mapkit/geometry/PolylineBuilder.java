package com.yandex.mapkit.geometry;

import com.yandex.runtime.NativeObject;

/* loaded from: classes2.dex */
public class PolylineBuilder {
    private NativeObject nativeObject = init();

    private native NativeObject init();

    public native void append(Point point);

    public native void append(Polyline polyline);

    public native Polyline build();
}
