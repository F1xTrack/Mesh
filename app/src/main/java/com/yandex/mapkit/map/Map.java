package com.yandex.mapkit.map;

import com.yandex.mapkit.Animation;
import com.yandex.mapkit.ScreenRect;
import com.yandex.mapkit.geometry.Geometry;
import com.yandex.mapkit.geometry.geo.Projection;
import com.yandex.mapkit.layers.GeoObjectTapListener;
import com.yandex.mapkit.layers.Layer;
import com.yandex.mapkit.layers.LayerOptions;
import com.yandex.mapkit.logo.Logo;

/* loaded from: classes2.dex */
public interface Map {

    public interface CameraCallback {
        void onMoveFinished(boolean z);
    }

    public interface MapReadyCallback {
        void onMapReady();
    }

    void addCameraListener(CameraListener cameraListener);

    void addInputListener(InputListener inputListener);

    void addTapListener(GeoObjectTapListener geoObjectTapListener);

    Layer addTileLayer(String str, LayerOptions layerOptions, CreateTileDataSource createTileDataSource);

    CameraPosition cameraPosition(Geometry geometry);

    CameraPosition cameraPosition(Geometry geometry, float f, float f2, ScreenRect screenRect);

    CameraPosition cameraPosition(Geometry geometry, ScreenRect screenRect);

    void deselectGeoObject();

    CameraBounds getCameraBounds();

    CameraPosition getCameraPosition();

    Logo getLogo();

    MapObjectCollection getMapObjects();

    MapType getMapType();

    Integer getPoiLimit();

    VisibleRegion getVisibleRegion();

    boolean isFastTapEnabled();

    boolean isNightModeEnabled();

    boolean isRotateGesturesEnabled();

    boolean isScrollGesturesEnabled();

    boolean isTiltGesturesEnabled();

    boolean isValid();

    boolean isZoomGesturesEnabled();

    void move(CameraPosition cameraPosition);

    void move(CameraPosition cameraPosition, Animation animation, CameraCallback cameraCallback);

    Projection projection();

    void removeCameraListener(CameraListener cameraListener);

    void removeInputListener(InputListener inputListener);

    void removeTapListener(GeoObjectTapListener geoObjectTapListener);

    void resetMapStyles();

    void selectGeoObject(GeoObjectSelectionMetadata geoObjectSelectionMetadata);

    void set2DMode(boolean z);

    void setFastTapEnabled(boolean z);

    void setMapLoadedListener(MapLoadedListener mapLoadedListener);

    boolean setMapStyle(int i, String str);

    boolean setMapStyle(String str);

    void setMapType(MapType mapType);

    void setNightModeEnabled(boolean z);

    void setPoiLimit(Integer num);

    void setRotateGesturesEnabled(boolean z);

    void setScrollGesturesEnabled(boolean z);

    void setTiltGesturesEnabled(boolean z);

    void setZoomGesturesEnabled(boolean z);

    VisibleRegion visibleRegion(CameraPosition cameraPosition);

    void wipe();
}
