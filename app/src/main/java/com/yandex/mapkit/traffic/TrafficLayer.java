package com.yandex.mapkit.traffic;

/* loaded from: classes2.dex */
public interface TrafficLayer {
    void addTrafficListener(TrafficListener trafficListener);

    boolean isTrafficVisible();

    boolean isValid();

    void removeTrafficListener(TrafficListener trafficListener);

    void resetTrafficStyles();

    boolean setTrafficStyle(int i, String str);

    boolean setTrafficStyle(String str);

    void setTrafficVisible(boolean z);
}
