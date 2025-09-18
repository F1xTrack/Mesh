package com.yandex.mapkit.layers.internal;

import com.yandex.mapkit.layers.DataSource;
import com.yandex.runtime.NativeObject;

/* loaded from: classes2.dex */
public class DataSourceBinding implements DataSource {
    private final NativeObject nativeObject;

    public DataSourceBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.layers.DataSource
    public native String getId();

    @Override // com.yandex.mapkit.layers.DataSource
    public native void invalidate(String str);

    @Override // com.yandex.mapkit.layers.DataSource
    public native boolean isValid();
}
