package com.yandex.mapkit.layers;

/* loaded from: classes2.dex */
public interface DataSourceLayer {
    void clear();

    void invalidate(String str);

    boolean isActive();

    boolean isValid();

    void remove();

    void resetStyles();

    void setActive(boolean z);

    void setDataSourceListener(DataSourceListener dataSourceListener);

    void setLayerLoadedListener(LayerLoadedListener layerLoadedListener);

    boolean setStyle(int i, String str);
}
