package com.yandex.mapkit.internal;

import com.yandex.mapkit.MapKit;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.location.DummyLocationManager;
import com.yandex.mapkit.location.LocationManager;
import com.yandex.mapkit.location.LocationSimulator;
import com.yandex.mapkit.map.MapWindow;
import com.yandex.mapkit.offline_cache.OfflineCacheManager;
import com.yandex.mapkit.storage.StorageManager;
import com.yandex.mapkit.traffic.TrafficLayer;
import com.yandex.mapkit.user_location.UserLocationLayer;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.sensors.LocationActivityType;
import com.yandex.runtime.view.PlatformView;

/* loaded from: classes2.dex */
public class MapKitBinding implements MapKit {
    private final NativeObject nativeObject;

    public MapKitBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.MapKit
    public native DummyLocationManager createDummyLocationManager();

    @Override // com.yandex.mapkit.MapKit
    public native LocationManager createLocationManager();

    @Override // com.yandex.mapkit.MapKit
    public native LocationManager createLocationManager(LocationActivityType locationActivityType);

    @Override // com.yandex.mapkit.MapKit
    public native LocationSimulator createLocationSimulator();

    @Override // com.yandex.mapkit.MapKit
    public native LocationSimulator createLocationSimulator(Polyline polyline);

    @Override // com.yandex.mapkit.MapKit
    public native MapWindow createMapWindow(PlatformView platformView);

    @Override // com.yandex.mapkit.MapKit
    public native MapWindow createMapWindow(PlatformView platformView, float f);

    @Override // com.yandex.mapkit.MapKit
    public native TrafficLayer createTrafficLayer(MapWindow mapWindow);

    @Override // com.yandex.mapkit.MapKit
    public native UserLocationLayer createUserLocationLayer(MapWindow mapWindow);

    @Override // com.yandex.mapkit.MapKit
    public native OfflineCacheManager getOfflineCacheManager();

    @Override // com.yandex.mapkit.MapKit
    public native StorageManager getStorageManager();

    @Override // com.yandex.mapkit.MapKit
    public native String getVersion();

    @Override // com.yandex.mapkit.MapKit
    public native boolean isValid();

    @Override // com.yandex.mapkit.MapKit
    public native void onStart();

    @Override // com.yandex.mapkit.MapKit
    public native void onStop();

    @Override // com.yandex.mapkit.MapKit
    public native void resetLocationManagerToDefault();

    @Override // com.yandex.mapkit.MapKit
    public native void setApiKey(String str);

    @Override // com.yandex.mapkit.MapKit
    public native void setLocationManager(LocationManager locationManager);

    @Override // com.yandex.mapkit.MapKit
    public native void setUserId(String str);
}
