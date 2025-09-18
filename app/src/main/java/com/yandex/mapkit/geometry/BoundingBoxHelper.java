package com.yandex.mapkit.geometry;

/* loaded from: classes2.dex */
public class BoundingBoxHelper {
    public static native BoundingBox getBounds(BoundingBox boundingBox);

    public static native BoundingBox getBounds(BoundingBox boundingBox, BoundingBox boundingBox2);

    public static native BoundingBox getBounds(LinearRing linearRing);

    public static native BoundingBox getBounds(Point point);

    public static native BoundingBox getBounds(Polygon polygon);

    public static native BoundingBox getBounds(Polyline polyline);
}
