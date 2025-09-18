package com.yandex.mapkit.layers.internal;

import com.yandex.mapkit.layers.DataSourceLayer;
import com.yandex.mapkit.layers.Layer;
import com.yandex.runtime.NativeObject;

/* loaded from: classes2.dex */
public class LayerBinding implements Layer {
    private final NativeObject nativeObject;

    public LayerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.layers.Layer
    public native DataSourceLayer dataSourceLayer();

    @Override // com.yandex.mapkit.layers.Layer
    public native boolean isValid();

    @Override // com.yandex.mapkit.layers.Layer
    public native void remove();
}
