package com.yandex.mapkit.map;

import com.yandex.mapkit.geometry.PolylinePosition;

/* loaded from: classes2.dex */
public interface Arrow {
    int getFillColor();

    float getLength();

    int getOutlineColor();

    float getOutlineWidth();

    PolylinePosition getPosition();

    float getTriangleHeight();

    boolean isValid();

    boolean isVisible();

    void setFillColor(int i);

    void setLength(float f);

    void setOutlineColor(int i);

    void setOutlineWidth(float f);

    void setTriangleHeight(float f);

    void setVisible(boolean z);
}
