package com.yandex.mapkit.user_location;

import android.graphics.PointF;
import com.yandex.mapkit.location.LocationViewSource;
import com.yandex.mapkit.map.CameraPosition;

/* loaded from: classes2.dex */
public interface UserLocationLayer {
    CameraPosition cameraPosition();

    boolean isAnchorEnabled();

    boolean isAutoZoomEnabled();

    boolean isHeadingEnabled();

    boolean isValid();

    boolean isVisible();

    void resetAnchor();

    void setAnchor(PointF pointF, PointF pointF2);

    void setAutoZoomEnabled(boolean z);

    void setDefaultSource();

    void setHeadingEnabled(boolean z);

    void setObjectListener(UserLocationObjectListener userLocationObjectListener);

    void setSource(LocationViewSource locationViewSource);

    void setTapListener(UserLocationTapListener userLocationTapListener);

    void setVisible(boolean z);
}
