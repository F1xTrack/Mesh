package com.yandex.mapkit.map;

import com.yandex.mapkit.geometry.Circle;

/* loaded from: classes2.dex */
public interface CircleMapObject extends MapObject {
    int getFillColor();

    Circle getGeometry();

    int getStrokeColor();

    float getStrokeWidth();

    boolean isGeodesic();

    void setFillColor(int i);

    void setGeodesic(boolean z);

    void setGeometry(Circle circle);

    void setStrokeColor(int i);

    void setStrokeWidth(float f);
}
