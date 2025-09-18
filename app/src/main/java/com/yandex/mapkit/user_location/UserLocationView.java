package com.yandex.mapkit.user_location;

import com.yandex.mapkit.map.CircleMapObject;
import com.yandex.mapkit.map.PlacemarkMapObject;

/* loaded from: classes2.dex */
public interface UserLocationView {
    CircleMapObject getAccuracyCircle();

    PlacemarkMapObject getArrow();

    PlacemarkMapObject getPin();

    boolean isValid();
}
