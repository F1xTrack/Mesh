package com.yandex.mapkit.geometry.geo;

import com.yandex.mapkit.geometry.Point;

/* loaded from: classes2.dex */
public interface Projection {
    boolean isValid();

    XYPoint worldToXY(Point point, int i);

    Point xyToWorld(XYPoint xYPoint, int i);
}
