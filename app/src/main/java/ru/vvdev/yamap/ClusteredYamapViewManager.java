package ru.vvdev.yamap;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewGroupManager;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import com.yandex.mapkit.MapKitFactory;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.CameraPosition;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import p000.AbstractC0852NX;
import p000.AbstractC10889rJ0;
import p000.C0434Gt;
import p000.C0497Ht;
import p000.C0926Oi;
import p000.InterfaceC9871jM0;
import p000.O90;
import p000.S91;
import p000.UN1;

@Metadata(m22266d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b!\u0018\u0000 c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001dB\t\b\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0018\u00010\fH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u001d\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u000bJ)\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\u00022\b\b\u0001\u0010\u001f\u001a\u00020\u001eH\u0017¢\u0006\u0004\b \u0010!J!\u0010#\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00172\b\u0010\"\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b#\u0010$J\u001f\u0010'\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00172\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u000eH\u0007¢\u0006\u0004\b)\u0010\u001dJ\u001f\u0010*\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u000eH\u0007¢\u0006\u0004\b*\u0010\u001dJ\u001f\u0010,\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00172\u0006\u0010+\u001a\u00020%H\u0007¢\u0006\u0004\b,\u0010(J!\u0010/\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00172\b\u0010.\u001a\u0004\u0018\u00010-H\u0007¢\u0006\u0004\b/\u00100J!\u00102\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00172\b\u00101\u001a\u0004\u0018\u00010-H\u0007¢\u0006\u0004\b2\u00100J!\u00104\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00172\b\u00103\u001a\u0004\u0018\u00010-H\u0007¢\u0006\u0004\b4\u00100J\u001f\u00106\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00172\u0006\u00105\u001a\u00020-H\u0007¢\u0006\u0004\b6\u00107J\u001f\u00109\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00172\u0006\u00108\u001a\u00020-H\u0007¢\u0006\u0004\b9\u00107J\u001f\u0010;\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00172\u0006\u0010:\u001a\u00020-H\u0007¢\u0006\u0004\b;\u00107J\u001f\u0010=\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00172\u0006\u0010<\u001a\u00020-H\u0007¢\u0006\u0004\b=\u00107J\u001f\u0010?\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00172\u0006\u0010>\u001a\u00020-H\u0007¢\u0006\u0004\b?\u00107J!\u0010A\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00172\b\u0010@\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\bA\u0010$J!\u0010C\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00172\b\u0010B\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\bC\u0010$J!\u0010F\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00172\b\u0010E\u001a\u0004\u0018\u00010DH\u0007¢\u0006\u0004\bF\u0010GJ\u001f\u0010I\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00172\u0006\u0010H\u001a\u00020%H\u0007¢\u0006\u0004\bI\u0010(J\u001f\u0010K\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00172\u0006\u0010J\u001a\u00020-H\u0007¢\u0006\u0004\bK\u00107J!\u0010L\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00172\b\u0010E\u001a\u0004\u0018\u00010DH\u0007¢\u0006\u0004\bL\u0010GJ!\u0010M\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00172\b\u0010E\u001a\u0004\u0018\u00010DH\u0007¢\u0006\u0004\bM\u0010GJ'\u0010Q\u001a\u00020\u00142\u0006\u0010N\u001a\u00020\u00022\u0006\u0010O\u001a\u00020\u00172\u0006\u0010P\u001a\u00020\u000eH\u0016¢\u0006\u0004\bQ\u0010RJ\u001f\u0010S\u001a\u00020\u00142\u0006\u0010N\u001a\u00020\u00022\u0006\u0010P\u001a\u00020\u000eH\u0016¢\u0006\u0004\bS\u0010TJ\u0017\u0010U\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0017H\u0002¢\u0006\u0004\bU\u0010VJI\u0010]\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010W\u001a\u0004\u0018\u00010D2\u0006\u0010X\u001a\u00020%2\u0006\u0010Y\u001a\u00020%2\u0006\u0010Z\u001a\u00020%2\u0006\u0010[\u001a\u00020%2\u0006\u0010\\\u001a\u00020\u000eH\u0002¢\u0006\u0004\b]\u0010^J\u0017\u0010_\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0017H\u0002¢\u0006\u0004\b_\u0010`J!\u0010b\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00172\b\u0010a\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\bb\u0010\u001a¨\u0006e"}, m22267d2 = {"Lru/vvdev/yamap/ClusteredYamapViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "LGt;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "", "getExportedCustomBubblingEventTypeConstants", "", "getCommandsMap", "view", "commandType", "Lcom/facebook/react/bridge/ReadableArray;", "args", "LTf1;", "receiveCommand", "(LGt;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "Landroid/view/View;", "points", "setClusteredMarkers", "(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V", "color", "setClusterColor", "(Landroid/view/View;I)V", "LS91;", "context", "createViewInstance", "(LS91;)LGt;", "icon", "setUserLocationIcon", "(Landroid/view/View;Ljava/lang/String;)V", "", "scale", "setUserLocationIconScale", "(Landroid/view/View;F)V", "setUserLocationAccuracyFillColor", "setUserLocationAccuracyStrokeColor", Snapshot.WIDTH, "setUserLocationAccuracyStrokeWidth", "", "show", "setShowUserPosition", "(Landroid/view/View;Ljava/lang/Boolean;)V", "follow", "setFollowUser", "nightMode", "setNightMode", "scrollGesturesEnabled", "setScrollGesturesEnabled", "(Landroid/view/View;Z)V", "rotateGesturesEnabled", "setRotateGesturesEnabled", "zoomGesturesEnabled", "setZoomGesturesEnabled", "tiltGesturesEnabled", "setTiltGesturesEnabled", "fastTapEnabled", "setFastTapEnabled", "style", "setMapStyle", "type", "setMapType", "Lcom/facebook/react/bridge/ReadableMap;", "params", "setInitialRegion", "(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V", "maxFps", "setMaxFps", "interactive", "setInteractive", "setLogoPosition", "setLogoPadding", "parent", "child", "index", "addView", "(LGt;Landroid/view/View;I)V", "removeViewAt", "(LGt;I)V", "castToYaMapView", "(Landroid/view/View;)LGt;", "center", "zoom", "azimuth", "tilt", "duration", "animation", "setCenter", "(LGt;Lcom/facebook/react/bridge/ReadableMap;FFFFI)V", "fitAllMarkers", "(Landroid/view/View;)V", "jsPoints", "fitMarkers", "Companion", "Ht", "react-native-yamap_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class ClusteredYamapViewManager extends ViewGroupManager<C0434Gt> {
    public static final C0497Ht Companion = new C0497Ht();
    private static final int FIT_ALL_MARKERS = 2;
    private static final int FIT_MARKERS = 8;
    private static final int GET_CAMERA_POSITION = 5;
    private static final int GET_SCREEN_POINTS = 9;
    private static final int GET_VISIBLE_REGION = 6;
    private static final int GET_WORLD_POINTS = 10;
    public static final String REACT_CLASS = "ClusteredYamapView";
    private static final int SET_CENTER = 1;
    private static final int SET_TRAFFIC_VISIBLE = 7;
    private static final int SET_ZOOM = 4;

    private final C0434Gt castToYaMapView(View view) {
        O90.m5966d(view, "null cannot be cast to non-null type ru.vvdev.yamap.view.ClusteredYamapView");
        return (C0434Gt) view;
    }

    private final void fitAllMarkers(View view) {
        castToYaMapView(view).m1396f();
    }

    private final void fitMarkers(View view, ReadableArray jsPoints) {
        if (jsPoints != null) {
            ArrayList arrayList = new ArrayList();
            int size = jsPoints.size();
            for (int i = 0; i < size; i++) {
                ReadableMap map = jsPoints.getMap(i);
                if (map != null) {
                    arrayList.add(new Point(map.getDouble("lat"), map.getDouble("lon")));
                }
            }
            castToYaMapView(view).m1397g(arrayList);
        }
    }

    private final void setCenter(C0434Gt view, ReadableMap center, float zoom, float azimuth, float tilt, float duration, int animation) {
        if (center != null) {
            view.m1399j(new CameraPosition(new Point(center.getDouble("lat"), center.getDouble("lon")), zoom, azimuth, tilt), duration, animation);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        HashMap map = new HashMap();
        map.put("setCenter", 1);
        map.put("fitAllMarkers", 2);
        map.put("setZoom", 4);
        map.put("getCameraPosition", 5);
        map.put("getVisibleRegion", 6);
        map.put("setTrafficVisible", 7);
        map.put("fitMarkers", 8);
        map.put("getScreenPoints", 9);
        map.put("getWorldPoints", 10);
        return map;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        C0926Oi c0926OiM24254a = AbstractC10889rJ0.m24254a();
        c0926OiM24254a.m6125k("cameraPosition", AbstractC10889rJ0.m24256c("phasedRegistrationNames", AbstractC10889rJ0.m24256c("bubbled", "onCameraPositionReceived")));
        c0926OiM24254a.m6125k("cameraPositionChange", AbstractC10889rJ0.m24256c("phasedRegistrationNames", AbstractC10889rJ0.m24256c("bubbled", "onCameraPositionChange")));
        c0926OiM24254a.m6125k("cameraPositionChangeEnd", AbstractC10889rJ0.m24256c("phasedRegistrationNames", AbstractC10889rJ0.m24256c("bubbled", "onCameraPositionChangeEnd")));
        c0926OiM24254a.m6125k("visibleRegion", AbstractC10889rJ0.m24256c("phasedRegistrationNames", AbstractC10889rJ0.m24256c("bubbled", "onVisibleRegionReceived")));
        c0926OiM24254a.m6125k("onMapPress", AbstractC10889rJ0.m24256c("phasedRegistrationNames", AbstractC10889rJ0.m24256c("bubbled", "onMapPress")));
        c0926OiM24254a.m6125k("onMapLongPress", AbstractC10889rJ0.m24256c("phasedRegistrationNames", AbstractC10889rJ0.m24256c("bubbled", "onMapLongPress")));
        c0926OiM24254a.m6125k("onMapLoaded", AbstractC10889rJ0.m24256c("phasedRegistrationNames", AbstractC10889rJ0.m24256c("bubbled", "onMapLoaded")));
        c0926OiM24254a.m6125k("screenToWorldPoints", AbstractC10889rJ0.m24256c("phasedRegistrationNames", AbstractC10889rJ0.m24256c("bubbled", "onScreenToWorldPointsReceived")));
        c0926OiM24254a.m6125k("worldToScreenPoints", AbstractC10889rJ0.m24256c("phasedRegistrationNames", AbstractC10889rJ0.m24256c("bubbled", "onWorldToScreenPointsReceived")));
        return c0926OiM24254a.m6122h();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return AbstractC10889rJ0.m24254a().m6122h();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, p000.I50
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        AbstractC0852NX.m5754c(this, view);
    }

    @InterfaceC9871jM0(name = "clusterColor")
    public final void setClusterColor(View view, int color) {
        O90.m5968f(view, "view");
        castToYaMapView(view).setClustersColor(color);
    }

    @InterfaceC9871jM0(name = "clusteredMarkers")
    public final void setClusteredMarkers(View view, ReadableArray points) {
        O90.m5968f(view, "view");
        O90.m5968f(points, "points");
        castToYaMapView(view).setClusteredMarkers(points.toArrayList());
    }

    @InterfaceC9871jM0(name = "fastTapEnabled")
    public final void setFastTapEnabled(View view, boolean fastTapEnabled) {
        O90.m5968f(view, "view");
        castToYaMapView(view).setFastTapEnabled(Boolean.valueOf(fastTapEnabled));
    }

    @InterfaceC9871jM0(name = "followUser")
    public final void setFollowUser(View view, Boolean follow) {
        O90.m5968f(view, "view");
        C0434Gt c0434GtCastToYaMapView = castToYaMapView(view);
        O90.m5965c(follow);
        c0434GtCastToYaMapView.setFollowUser(follow.booleanValue());
    }

    @InterfaceC9871jM0(name = "initialRegion")
    public final void setInitialRegion(View view, ReadableMap params) {
        O90.m5968f(view, "view");
        if (params != null) {
            castToYaMapView(view).setInitialRegion(params);
        }
    }

    @InterfaceC9871jM0(name = "interactive")
    public final void setInteractive(View view, boolean interactive) {
        O90.m5968f(view, "view");
        castToYaMapView(view).setInteractive(interactive);
    }

    @InterfaceC9871jM0(name = "logoPadding")
    public final void setLogoPadding(View view, ReadableMap params) {
        O90.m5968f(view, "view");
        if (params != null) {
            castToYaMapView(view).setLogoPadding(params);
        }
    }

    @InterfaceC9871jM0(name = "logoPosition")
    public final void setLogoPosition(View view, ReadableMap params) {
        O90.m5968f(view, "view");
        if (params != null) {
            castToYaMapView(view).setLogoPosition(params);
        }
    }

    @InterfaceC9871jM0(name = "mapStyle")
    public final void setMapStyle(View view, String style) {
        O90.m5968f(view, "view");
        if (style != null) {
            castToYaMapView(view).setMapStyle(style);
        }
    }

    @InterfaceC9871jM0(name = "mapType")
    public final void setMapType(View view, String type) {
        O90.m5968f(view, "view");
        if (type != null) {
            castToYaMapView(view).setMapType(type);
        }
    }

    @InterfaceC9871jM0(name = "maxFps")
    public final void setMaxFps(View view, float maxFps) {
        O90.m5968f(view, "view");
        castToYaMapView(view).setMaxFps(maxFps);
    }

    @InterfaceC9871jM0(name = "nightMode")
    public final void setNightMode(View view, Boolean nightMode) {
        O90.m5968f(view, "view");
        castToYaMapView(view).setNightMode(Boolean.valueOf(nightMode != null ? nightMode.booleanValue() : false));
    }

    @InterfaceC9871jM0(name = "rotateGesturesEnabled")
    public final void setRotateGesturesEnabled(View view, boolean rotateGesturesEnabled) {
        O90.m5968f(view, "view");
        castToYaMapView(view).setRotateGesturesEnabled(Boolean.valueOf(rotateGesturesEnabled));
    }

    @InterfaceC9871jM0(name = "scrollGesturesEnabled")
    public final void setScrollGesturesEnabled(View view, boolean scrollGesturesEnabled) {
        O90.m5968f(view, "view");
        castToYaMapView(view).setScrollGesturesEnabled(Boolean.valueOf(scrollGesturesEnabled));
    }

    @InterfaceC9871jM0(name = "showUserPosition")
    public final void setShowUserPosition(View view, Boolean show) {
        O90.m5968f(view, "view");
        C0434Gt c0434GtCastToYaMapView = castToYaMapView(view);
        O90.m5965c(show);
        c0434GtCastToYaMapView.setShowUserPosition(show.booleanValue());
    }

    @InterfaceC9871jM0(name = "tiltGesturesEnabled")
    public final void setTiltGesturesEnabled(View view, boolean tiltGesturesEnabled) {
        O90.m5968f(view, "view");
        castToYaMapView(view).setTiltGesturesEnabled(Boolean.valueOf(tiltGesturesEnabled));
    }

    @InterfaceC9871jM0(name = "userLocationAccuracyFillColor")
    public final void setUserLocationAccuracyFillColor(View view, int color) {
        O90.m5968f(view, "view");
        castToYaMapView(view).setUserLocationAccuracyFillColor(color);
    }

    @InterfaceC9871jM0(name = "userLocationAccuracyStrokeColor")
    public final void setUserLocationAccuracyStrokeColor(View view, int color) {
        O90.m5968f(view, "view");
        castToYaMapView(view).setUserLocationAccuracyStrokeColor(color);
    }

    @InterfaceC9871jM0(name = "userLocationAccuracyStrokeWidth")
    public final void setUserLocationAccuracyStrokeWidth(View view, float width) {
        O90.m5968f(view, "view");
        castToYaMapView(view).setUserLocationAccuracyStrokeWidth(width);
    }

    @InterfaceC9871jM0(name = "userLocationIcon")
    public final void setUserLocationIcon(View view, String icon) {
        O90.m5968f(view, "view");
        if (icon != null) {
            castToYaMapView(view).setUserLocationIcon(icon);
        }
    }

    @InterfaceC9871jM0(name = "userLocationIconScale")
    public final void setUserLocationIconScale(View view, float scale) {
        O90.m5968f(view, "view");
        castToYaMapView(view).setUserLocationIconScale(scale);
    }

    @InterfaceC9871jM0(name = "zoomGesturesEnabled")
    public final void setZoomGesturesEnabled(View view, boolean zoomGesturesEnabled) {
        O90.m5968f(view, "view");
        castToYaMapView(view).setZoomGesturesEnabled(Boolean.valueOf(zoomGesturesEnabled));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C0434Gt createViewInstance(S91 context) {
        O90.m5968f(context, "context");
        C0434Gt c0434Gt = new C0434Gt(context);
        MapKitFactory.getInstance().onStart();
        c0434Gt.onStart();
        return c0434Gt;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(C0434Gt view, String commandType, ReadableArray args) {
        O90.m5968f(view, "view");
        O90.m5968f(commandType, "commandType");
        UN1.m7999c(args);
        switch (commandType.hashCode()) {
            case -1552649847:
                if (commandType.equals("fitAllMarkers")) {
                    fitAllMarkers(view);
                    return;
                }
                break;
            case -862225880:
                if (commandType.equals("fitMarkers")) {
                    fitMarkers(view, args.getArray(0));
                    return;
                }
                break;
            case -756049820:
                if (commandType.equals("getCameraPosition")) {
                    view.m1392b(args.getString(0));
                    return;
                }
                break;
            case -265215408:
                if (commandType.equals("getVisibleRegion")) {
                    view.m1394d(args.getString(0));
                    return;
                }
                break;
            case -142959899:
                if (commandType.equals("getScreenPoints")) {
                    view.m1395e(args.getArray(0), args.getString(1));
                    return;
                }
                break;
            case 117384023:
                if (commandType.equals("setCenter")) {
                    setCenter(castToYaMapView(view), args.getMap(0), (float) args.getDouble(1), (float) args.getDouble(2), (float) args.getDouble(3), (float) args.getDouble(4), args.getInt(5));
                    return;
                }
                break;
            case 238433759:
                if (commandType.equals("getWorldPoints")) {
                    view.m1393c(args.getArray(0), args.getString(1));
                    return;
                }
                break;
            case 1397281975:
                if (commandType.equals("setTrafficVisible")) {
                    view.setTrafficVisible(args.getBoolean(0));
                    return;
                }
                break;
            case 1985172309:
                if (commandType.equals("setZoom")) {
                    view.m1400k(Float.valueOf((float) args.getDouble(0)), (float) args.getDouble(1), args.getInt(2));
                    return;
                }
                break;
        }
        throw new IllegalArgumentException(String.format("Unsupported command %d received by %s.", Arrays.copyOf(new Object[]{commandType, "ClusteredYamapViewManager"}, 2)));
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(C0434Gt parent, View child, int index) {
        O90.m5968f(parent, "parent");
        O90.m5968f(child, "child");
        parent.mo1391a(child);
        super.addView((ClusteredYamapViewManager) parent, child, index);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(C0434Gt parent, int index) {
        O90.m5968f(parent, "parent");
        parent.mo1398i(index);
        super.removeViewAt((ClusteredYamapViewManager) parent, index);
    }
}
