package com.yandex.mapkit.location;

/* loaded from: classes2.dex */
public interface LocationManager {
    void requestSingleUpdate(LocationListener locationListener);

    void resume();

    void subscribeForLocationUpdates(double d, long j, double d2, boolean z, FilteringMode filteringMode, LocationListener locationListener);

    void suspend();

    void unsubscribe(LocationListener locationListener);
}
