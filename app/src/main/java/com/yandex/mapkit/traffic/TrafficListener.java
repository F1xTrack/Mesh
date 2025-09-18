package com.yandex.mapkit.traffic;

/* loaded from: classes2.dex */
public interface TrafficListener {
    void onTrafficChanged(TrafficLevel trafficLevel);

    void onTrafficExpired();

    void onTrafficLoading();
}
