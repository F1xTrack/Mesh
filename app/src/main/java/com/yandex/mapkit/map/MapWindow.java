package com.yandex.mapkit.map;

import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.ScreenRect;
import com.yandex.mapkit.geometry.Point;

/* loaded from: classes2.dex */
public interface MapWindow {
    void addSizeChangedListener(SizeChangedListener sizeChangedListener);

    ScreenPoint getFocusPoint();

    ScreenRect getFocusRect();

    VisibleRegion getFocusRegion();

    ScreenPoint getGestureFocusPoint();

    GestureFocusPointMode getGestureFocusPointMode();

    Map getMap();

    PointOfView getPointOfView();

    float getScaleFactor();

    int height();

    boolean isValid();

    void removeSizeChangedListener(SizeChangedListener sizeChangedListener);

    Point screenToWorld(ScreenPoint screenPoint);

    void setFocusPoint(ScreenPoint screenPoint);

    void setFocusRect(ScreenRect screenRect);

    void setGestureFocusPoint(ScreenPoint screenPoint);

    void setGestureFocusPointMode(GestureFocusPointMode gestureFocusPointMode);

    void setPointOfView(PointOfView pointOfView);

    void setScaleFactor(float f);

    int width();

    ScreenPoint worldToScreen(Point point);
}
