package com.yandex.mapkit;

import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.location.DummyLocationManager;
import com.yandex.mapkit.location.LocationManager;
import com.yandex.mapkit.location.LocationSimulator;
import com.yandex.mapkit.map.MapWindow;
import com.yandex.mapkit.offline_cache.OfflineCacheManager;
import com.yandex.mapkit.storage.StorageManager;
import com.yandex.mapkit.traffic.TrafficLayer;
import com.yandex.mapkit.user_location.UserLocationLayer;
import com.yandex.runtime.sensors.LocationActivityType;
import com.yandex.runtime.view.PlatformView;

/* loaded from: classes2.dex */
public interface MapKit {
    DummyLocationManager createDummyLocationManager();

    LocationManager createLocationManager();

    LocationManager createLocationManager(LocationActivityType locationActivityType);

    LocationSimulator createLocationSimulator();

    LocationSimulator createLocationSimulator(Polyline polyline);

    MapWindow createMapWindow(PlatformView platformView);

    MapWindow createMapWindow(PlatformView platformView, float f);

    TrafficLayer createTrafficLayer(MapWindow mapWindow);

    UserLocationLayer createUserLocationLayer(MapWindow mapWindow);

    OfflineCacheManager getOfflineCacheManager();

    StorageManager getStorageManager();

    String getVersion();

    boolean isValid();

    void onStart();

    void onStop();

    void resetLocationManagerToDefault();

    void setApiKey(String str);

    void setLocationManager(LocationManager locationManager);

    void setUserId(String str);
}
