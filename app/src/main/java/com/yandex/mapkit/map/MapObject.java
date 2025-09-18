package com.yandex.mapkit.map;

import com.yandex.mapkit.Animation;

/* loaded from: classes2.dex */
public interface MapObject {
    void addTapListener(MapObjectTapListener mapObjectTapListener);

    BaseMapObjectCollection getParent();

    Object getUserData();

    float getZIndex();

    boolean isDraggable();

    boolean isValid();

    boolean isVisible();

    void removeTapListener(MapObjectTapListener mapObjectTapListener);

    void setDragListener(MapObjectDragListener mapObjectDragListener);

    void setDraggable(boolean z);

    void setUserData(Object obj);

    void setVisible(boolean z);

    void setVisible(boolean z, Animation animation, Callback callback);

    void setZIndex(float f);
}
