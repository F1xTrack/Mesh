package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.huawei.hms.p015rn.push.constants.LocalNotification;
import com.huawei.hms.p015rn.push.constants.NotificationConstants;
import com.yandex.mapkit.Animation;
import com.yandex.mapkit.MapKitFactory;
import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.Geometry;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.layers.ObjectEvent;
import com.yandex.mapkit.logo.Alignment;
import com.yandex.mapkit.logo.HorizontalAlignment;
import com.yandex.mapkit.logo.Padding;
import com.yandex.mapkit.logo.VerticalAlignment;
import com.yandex.mapkit.map.CameraListener;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.map.CameraUpdateReason;
import com.yandex.mapkit.map.CircleMapObject;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.map.InputListener;
import com.yandex.mapkit.map.Map;
import com.yandex.mapkit.map.MapLoadStatistics;
import com.yandex.mapkit.map.MapLoadedListener;
import com.yandex.mapkit.map.MapObject;
import com.yandex.mapkit.map.MapObjectCollection;
import com.yandex.mapkit.map.MapType;
import com.yandex.mapkit.map.PlacemarkMapObject;
import com.yandex.mapkit.map.PolygonMapObject;
import com.yandex.mapkit.map.PolylineMapObject;
import com.yandex.mapkit.map.VisibleRegion;
import com.yandex.mapkit.mapview.MapView;
import com.yandex.mapkit.traffic.TrafficLayer;
import com.yandex.mapkit.traffic.TrafficLevel;
import com.yandex.mapkit.traffic.TrafficListener;
import com.yandex.mapkit.user_location.UserLocationLayer;
import com.yandex.mapkit.user_location.UserLocationObjectListener;
import com.yandex.mapkit.user_location.UserLocationView;
import com.yandex.runtime.image.ImageProvider;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: Cp1 */
/* loaded from: classes2.dex */
public class C7449Cp1 extends MapView implements UserLocationObjectListener, CameraListener, InputListener, TrafficListener, MapLoadedListener {

    /* renamed from: k */
    public static final HashMap f1688k;

    /* renamed from: a */
    public ViewParent f1689a;

    /* renamed from: b */
    public String f1690b;

    /* renamed from: c */
    public float f1691c;

    /* renamed from: d */
    public Bitmap f1692d;

    /* renamed from: e */
    public UserLocationLayer f1693e;

    /* renamed from: f */
    public int f1694f;

    /* renamed from: g */
    public int f1695g;

    /* renamed from: h */
    public float f1696h;

    /* renamed from: i */
    public TrafficLayer f1697i;

    /* renamed from: j */
    public UserLocationView f1698j;

    static {
        C7345Ap1 c7345Ap1 = new C7345Ap1();
        c7345Ap1.put("bus", "#59ACFF");
        c7345Ap1.put("railway", "#F8634F");
        c7345Ap1.put("tramway", "#C86DD7");
        c7345Ap1.put("suburban", "#3023AE");
        c7345Ap1.put("underground", "#BDCCDC");
        c7345Ap1.put("trolleybus", "#55CfDC");
        c7345Ap1.put("walk", "#333333");
        f1688k = new HashMap();
    }

    public C7449Cp1(S91 s91) {
        super(s91);
        this.f1690b = "";
        this.f1691c = 1.0f;
        getMapWindow().getMap().addCameraListener(this);
        getMapWindow().getMap().addInputListener(this);
        getMapWindow().getMap().setMapLoadedListener(this);
    }

    /* renamed from: h */
    public static WritableMap m1390h(CameraPosition cameraPosition, CameraUpdateReason cameraUpdateReason, boolean z) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        Point target = cameraPosition.getTarget();
        O90.m5967e(target, "getTarget(...)");
        writableMapCreateMap.putDouble("azimuth", cameraPosition.getAzimuth());
        writableMapCreateMap.putDouble("tilt", cameraPosition.getTilt());
        writableMapCreateMap.putDouble("zoom", cameraPosition.getZoom());
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putDouble("lat", target.getLatitude());
        writableMapCreateMap2.putDouble("lon", target.getLongitude());
        writableMapCreateMap.putMap("point", writableMapCreateMap2);
        writableMapCreateMap.putString("reason", cameraUpdateReason.toString());
        writableMapCreateMap.putBoolean("finished", z);
        return writableMapCreateMap;
    }

    /* renamed from: a */
    public void mo1391a(View view) {
        if (view instanceof C11593wp1) {
            C11593wp1 c11593wp1 = (C11593wp1) view;
            PolygonMapObject polygonMapObjectAddPolygon = getMapWindow().getMap().getMapObjects().addPolygon(c11593wp1.f45123a);
            O90.m5967e(polygonMapObjectAddPolygon, "addPolygon(...)");
            c11593wp1.setPolygonMapObject(polygonMapObjectAddPolygon);
            return;
        }
        if (view instanceof C11847yp1) {
            C11847yp1 c11847yp1 = (C11847yp1) view;
            PolylineMapObject polylineMapObjectAddPolyline = getMapWindow().getMap().getMapObjects().addPolyline(c11847yp1.f46494a);
            O90.m5967e(polylineMapObjectAddPolyline, "addPolyline(...)");
            c11847yp1.setPolylineMapObject(polylineMapObjectAddPolyline);
            return;
        }
        if (!(view instanceof C11338up1)) {
            if (view instanceof C10826qp1) {
                C10826qp1 c10826qp1 = (C10826qp1) view;
                CircleMapObject circleMapObjectAddCircle = getMapWindow().getMap().getMapObjects().addCircle(c10826qp1.f41191a);
                O90.m5967e(circleMapObjectAddCircle, "addCircle(...)");
                c10826qp1.setCircleMapObject(circleMapObjectAddCircle);
                return;
            }
            return;
        }
        MapObjectCollection mapObjects = getMapWindow().getMap().getMapObjects();
        C11338up1 c11338up1 = (C11338up1) view;
        Point point = c11338up1.f43958a;
        O90.m5965c(point);
        PlacemarkMapObject placemarkMapObjectAddPlacemark = mapObjects.addPlacemark(point);
        O90.m5967e(placemarkMapObjectAddPlacemark, "addPlacemark(...)");
        c11338up1.setMarkerMapObject(placemarkMapObjectAddPlacemark);
    }

    /* renamed from: b */
    public final void m1392b(String str) {
        CameraPosition cameraPosition = getMapWindow().getMap().getCameraPosition();
        O90.m5967e(cameraPosition, "getCameraPosition(...)");
        WritableMap writableMapM1390h = m1390h(cameraPosition, CameraUpdateReason.valueOf("APPLICATION"), true);
        writableMapM1390h.putString(NotificationConstants.f19487ID, str);
        Context context = getContext();
        O90.m5966d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ((RCTEventEmitter) ((ReactContext) context).getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), "cameraPosition", writableMapM1390h);
    }

    /* renamed from: c */
    public final void m1393c(ReadableArray readableArray, String str) {
        O90.m5968f(readableArray, "screenPoints");
        WritableArray writableArrayCreateArray = Arguments.createArray();
        int size = readableArray.size();
        for (int i = 0; i < size; i++) {
            ReadableMap map = readableArray.getMap(i);
            Point pointScreenToWorld = getMapWindow().screenToWorld(new ScreenPoint((float) map.getDouble("x"), (float) map.getDouble("y")));
            WritableMap writableMapCreateMap = Arguments.createMap();
            O90.m5965c(pointScreenToWorld);
            writableMapCreateMap.putDouble("lat", pointScreenToWorld.getLatitude());
            writableMapCreateMap.putDouble("lon", pointScreenToWorld.getLongitude());
            writableArrayCreateArray.pushMap(writableMapCreateMap);
        }
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putString(NotificationConstants.f19487ID, str);
        writableMapCreateMap2.putArray("worldPoints", writableArrayCreateArray);
        Context context = getContext();
        O90.m5966d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ((RCTEventEmitter) ((ReactContext) context).getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), "screenToWorldPoints", writableMapCreateMap2);
    }

    /* renamed from: d */
    public final void m1394d(String str) {
        VisibleRegion visibleRegion = getMapWindow().getMap().getVisibleRegion();
        O90.m5967e(visibleRegion, "getVisibleRegion(...)");
        WritableMap writableMapCreateMap = Arguments.createMap();
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putDouble("lat", visibleRegion.getBottomLeft().getLatitude());
        writableMapCreateMap2.putDouble("lon", visibleRegion.getBottomLeft().getLongitude());
        writableMapCreateMap.putMap("bottomLeft", writableMapCreateMap2);
        WritableMap writableMapCreateMap3 = Arguments.createMap();
        writableMapCreateMap3.putDouble("lat", visibleRegion.getBottomRight().getLatitude());
        writableMapCreateMap3.putDouble("lon", visibleRegion.getBottomRight().getLongitude());
        writableMapCreateMap.putMap("bottomRight", writableMapCreateMap3);
        WritableMap writableMapCreateMap4 = Arguments.createMap();
        writableMapCreateMap4.putDouble("lat", visibleRegion.getTopLeft().getLatitude());
        writableMapCreateMap4.putDouble("lon", visibleRegion.getTopLeft().getLongitude());
        writableMapCreateMap.putMap("topLeft", writableMapCreateMap4);
        WritableMap writableMapCreateMap5 = Arguments.createMap();
        writableMapCreateMap5.putDouble("lat", visibleRegion.getTopRight().getLatitude());
        writableMapCreateMap5.putDouble("lon", visibleRegion.getTopRight().getLongitude());
        writableMapCreateMap.putMap("topRight", writableMapCreateMap5);
        writableMapCreateMap.putString(NotificationConstants.f19487ID, str);
        Context context = getContext();
        O90.m5966d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ((RCTEventEmitter) ((ReactContext) context).getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), "visibleRegion", writableMapCreateMap);
    }

    /* renamed from: e */
    public final void m1395e(ReadableArray readableArray, String str) {
        O90.m5968f(readableArray, "worldPoints");
        WritableArray writableArrayCreateArray = Arguments.createArray();
        int size = readableArray.size();
        for (int i = 0; i < size; i++) {
            ReadableMap map = readableArray.getMap(i);
            ScreenPoint screenPointWorldToScreen = getMapWindow().worldToScreen(new Point(map.getDouble("lat"), map.getDouble("lon")));
            WritableMap writableMapCreateMap = Arguments.createMap();
            O90.m5965c(screenPointWorldToScreen);
            writableMapCreateMap.putDouble("x", screenPointWorldToScreen.getX());
            writableMapCreateMap.putDouble("y", screenPointWorldToScreen.getY());
            writableArrayCreateArray.pushMap(writableMapCreateMap);
        }
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putString(NotificationConstants.f19487ID, str);
        writableMapCreateMap2.putArray("screenPoints", writableArrayCreateArray);
        Context context = getContext();
        O90.m5966d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ((RCTEventEmitter) ((ReactContext) context).getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), "worldToScreenPoints", writableMapCreateMap2);
    }

    /* renamed from: f */
    public final void m1396f() {
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            O90.m5967e(childAt, "getChildAt(...)");
            if (childAt instanceof C11338up1) {
                arrayList.add(((C11338up1) childAt).f43958a);
            }
        }
        m1397g(arrayList);
    }

    /* renamed from: g */
    public final void m1397g(ArrayList arrayList) {
        if (arrayList.size() == 0) {
            return;
        }
        if (arrayList.size() == 1) {
            Object obj = arrayList.get(0);
            O90.m5965c(obj);
            double latitude = ((Point) obj).getLatitude();
            Object obj2 = arrayList.get(0);
            O90.m5965c(obj2);
            getMapWindow().getMap().move(new CameraPosition(new Point(latitude, ((Point) obj2).getLongitude()), 15.0f, 0.0f, 0.0f));
            return;
        }
        Map map = getMapWindow().getMap();
        Object obj3 = arrayList.get(0);
        O90.m5965c(obj3);
        double longitude = ((Point) obj3).getLongitude();
        Object obj4 = arrayList.get(0);
        O90.m5965c(obj4);
        double longitude2 = ((Point) obj4).getLongitude();
        Object obj5 = arrayList.get(0);
        O90.m5965c(obj5);
        double latitude2 = ((Point) obj5).getLatitude();
        Object obj6 = arrayList.get(0);
        O90.m5965c(obj6);
        double latitude3 = ((Point) obj6).getLatitude();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj7 = arrayList.get(i);
            O90.m5965c(obj7);
            if (((Point) obj7).getLongitude() > longitude2) {
                Object obj8 = arrayList.get(i);
                O90.m5965c(obj8);
                longitude2 = ((Point) obj8).getLongitude();
            }
            Object obj9 = arrayList.get(i);
            O90.m5965c(obj9);
            if (((Point) obj9).getLongitude() < longitude) {
                Object obj10 = arrayList.get(i);
                O90.m5965c(obj10);
                longitude = ((Point) obj10).getLongitude();
            }
            Object obj11 = arrayList.get(i);
            O90.m5965c(obj11);
            if (((Point) obj11).getLatitude() > latitude3) {
                Object obj12 = arrayList.get(i);
                O90.m5965c(obj12);
                latitude3 = ((Point) obj12).getLatitude();
            }
            Object obj13 = arrayList.get(i);
            O90.m5965c(obj13);
            if (((Point) obj13).getLatitude() < latitude2) {
                Object obj14 = arrayList.get(i);
                O90.m5965c(obj14);
                latitude2 = ((Point) obj14).getLatitude();
            }
        }
        CameraPosition cameraPosition = map.cameraPosition(Geometry.fromBoundingBox(new BoundingBox(new Point(latitude2, longitude), new Point(latitude3, longitude2))));
        O90.m5967e(cameraPosition, "cameraPosition(...)");
        getMapWindow().getMap().move(new CameraPosition(cameraPosition.getTarget(), cameraPosition.getZoom() - 1.8f, cameraPosition.getAzimuth(), cameraPosition.getTilt()), new Animation(Animation.Type.SMOOTH, 0.7f), null);
    }

    /* renamed from: i */
    public void mo1398i(int i) {
        if (getChildAt(i) instanceof UK0) {
            KeyEvent.Callback childAt = getChildAt(i);
            O90.m5966d(childAt, "null cannot be cast to non-null type ru.vvdev.yamap.models.ReactMapObject");
            MapObject rnMapObject = ((UK0) childAt).getRnMapObject();
            if (rnMapObject == null || !rnMapObject.isValid()) {
                return;
            }
            getMapWindow().getMap().getMapObjects().remove(rnMapObject);
        }
    }

    /* renamed from: j */
    public final void m1399j(CameraPosition cameraPosition, float f, int i) {
        if (f > 0.0f) {
            getMapWindow().getMap().move(cameraPosition, new Animation(i == 0 ? Animation.Type.SMOOTH : Animation.Type.LINEAR, f), null);
        } else {
            getMapWindow().getMap().move(cameraPosition);
        }
    }

    /* renamed from: k */
    public final void m1400k(Float f, float f2, int i) {
        CameraPosition cameraPosition = getMapWindow().getMap().getCameraPosition();
        O90.m5967e(cameraPosition, "getCameraPosition(...)");
        m1399j(new CameraPosition(cameraPosition.getTarget(), f.floatValue(), cameraPosition.getAzimuth(), cameraPosition.getTilt()), f2, i);
    }

    /* renamed from: l */
    public final void m1401l() {
        if (this.f1698j != null) {
            IconStyle iconStyle = new IconStyle();
            iconStyle.setScale(Float.valueOf(this.f1691c));
            UserLocationView userLocationView = this.f1698j;
            O90.m5965c(userLocationView);
            PlacemarkMapObject pin = userLocationView.getPin();
            O90.m5967e(pin, "getPin(...)");
            UserLocationView userLocationView2 = this.f1698j;
            O90.m5965c(userLocationView2);
            PlacemarkMapObject arrow = userLocationView2.getArrow();
            O90.m5967e(arrow, "getArrow(...)");
            Bitmap bitmap = this.f1692d;
            if (bitmap != null) {
                pin.setIcon(ImageProvider.fromBitmap(bitmap), iconStyle);
                arrow.setIcon(ImageProvider.fromBitmap(this.f1692d), iconStyle);
            }
            UserLocationView userLocationView3 = this.f1698j;
            O90.m5965c(userLocationView3);
            CircleMapObject accuracyCircle = userLocationView3.getAccuracyCircle();
            O90.m5967e(accuracyCircle, "getAccuracyCircle(...)");
            int i = this.f1694f;
            if (i != 0) {
                accuracyCircle.setFillColor(i);
            }
            int i2 = this.f1695g;
            if (i2 != 0) {
                accuracyCircle.setStrokeColor(i2);
            }
            accuracyCircle.setStrokeWidth(this.f1696h);
        }
    }

    @Override // com.yandex.mapkit.map.CameraListener
    public final void onCameraPositionChanged(Map map, CameraPosition cameraPosition, CameraUpdateReason cameraUpdateReason, boolean z) {
        O90.m5968f(map, "map");
        O90.m5968f(cameraPosition, "cameraPosition");
        O90.m5968f(cameraUpdateReason, "reason");
        WritableMap writableMapM1390h = m1390h(cameraPosition, cameraUpdateReason, z);
        WritableMap writableMapM1390h2 = m1390h(cameraPosition, cameraUpdateReason, z);
        Context context = getContext();
        O90.m5966d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        ((RCTEventEmitter) reactContext.getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), "cameraPositionChange", writableMapM1390h);
        if (z) {
            ((RCTEventEmitter) reactContext.getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), "cameraPositionChangeEnd", writableMapM1390h2);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        O90.m5968f(motionEvent, "event");
        int action = motionEvent.getAction();
        if (action == 0) {
            ViewParent viewParent = this.f1689a;
            if (viewParent == null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            } else {
                O90.m5965c(viewParent);
                viewParent.requestDisallowInterceptTouchEvent(true);
            }
        } else if (action == 1) {
            ViewParent viewParent2 = this.f1689a;
            if (viewParent2 == null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            } else {
                O90.m5965c(viewParent2);
                viewParent2.requestDisallowInterceptTouchEvent(false);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.yandex.mapkit.map.MapLoadedListener
    public final void onMapLoaded(MapLoadStatistics mapLoadStatistics) {
        O90.m5968f(mapLoadStatistics, "statistics");
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("renderObjectCount", mapLoadStatistics.getRenderObjectCount());
        writableMapCreateMap.putDouble("curZoomModelsLoaded", mapLoadStatistics.getCurZoomModelsLoaded());
        writableMapCreateMap.putDouble("curZoomPlacemarksLoaded", mapLoadStatistics.getCurZoomPlacemarksLoaded());
        writableMapCreateMap.putDouble("curZoomLabelsLoaded", mapLoadStatistics.getCurZoomLabelsLoaded());
        writableMapCreateMap.putDouble("curZoomGeometryLoaded", mapLoadStatistics.getCurZoomGeometryLoaded());
        writableMapCreateMap.putDouble("tileMemoryUsage", mapLoadStatistics.getTileMemoryUsage());
        writableMapCreateMap.putDouble("delayedGeometryLoaded", mapLoadStatistics.getDelayedGeometryLoaded());
        writableMapCreateMap.putDouble("fullyAppeared", mapLoadStatistics.getFullyAppeared());
        writableMapCreateMap.putDouble("fullyLoaded", mapLoadStatistics.getFullyLoaded());
        Context context = getContext();
        O90.m5966d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ((RCTEventEmitter) ((ReactContext) context).getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), "onMapLoaded", writableMapCreateMap);
    }

    @Override // com.yandex.mapkit.map.InputListener
    public final void onMapLongTap(Map map, Point point) {
        O90.m5968f(map, "map");
        O90.m5968f(point, "point");
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("lat", point.getLatitude());
        writableMapCreateMap.putDouble("lon", point.getLongitude());
        Context context = getContext();
        O90.m5966d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ((RCTEventEmitter) ((ReactContext) context).getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), "onMapLongPress", writableMapCreateMap);
    }

    @Override // com.yandex.mapkit.map.InputListener
    public final void onMapTap(Map map, Point point) {
        O90.m5968f(map, "map");
        O90.m5968f(point, "point");
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("lat", point.getLatitude());
        writableMapCreateMap.putDouble("lon", point.getLongitude());
        Context context = getContext();
        O90.m5966d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ((RCTEventEmitter) ((ReactContext) context).getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), "onMapPress", writableMapCreateMap);
    }

    @Override // com.yandex.mapkit.user_location.UserLocationObjectListener
    public final void onObjectAdded(UserLocationView userLocationView) {
        O90.m5968f(userLocationView, "_userLocationView");
        this.f1698j = userLocationView;
        m1401l();
    }

    @Override // com.yandex.mapkit.user_location.UserLocationObjectListener
    public final void onObjectRemoved(UserLocationView userLocationView) {
        O90.m5968f(userLocationView, "userLocationView");
    }

    @Override // com.yandex.mapkit.user_location.UserLocationObjectListener
    public final void onObjectUpdated(UserLocationView userLocationView, ObjectEvent objectEvent) {
        O90.m5968f(userLocationView, "_userLocationView");
        O90.m5968f(objectEvent, "objectEvent");
        this.f1698j = userLocationView;
        m1401l();
    }

    public final void setFastTapEnabled(Boolean bool) {
        Map map = getMapWindow().getMap();
        O90.m5965c(bool);
        map.setFastTapEnabled(bool.booleanValue());
    }

    public final void setFollowUser(boolean z) {
        if (this.f1693e == null) {
            setShowUserPosition(true);
        }
        if (z) {
            UserLocationLayer userLocationLayer = this.f1693e;
            O90.m5965c(userLocationLayer);
            userLocationLayer.setAutoZoomEnabled(true);
            UserLocationLayer userLocationLayer2 = this.f1693e;
            O90.m5965c(userLocationLayer2);
            userLocationLayer2.setAnchor(new PointF((float) (getWidth() * 0.5d), (float) (getHeight() * 0.5d)), new PointF((float) (getWidth() * 0.5d), (float) (getHeight() * 0.83d)));
            return;
        }
        UserLocationLayer userLocationLayer3 = this.f1693e;
        O90.m5965c(userLocationLayer3);
        userLocationLayer3.setAutoZoomEnabled(false);
        UserLocationLayer userLocationLayer4 = this.f1693e;
        O90.m5965c(userLocationLayer4);
        userLocationLayer4.resetAnchor();
    }

    public final void setInitialRegion(ReadableMap readableMap) {
        O90.m5965c(readableMap);
        if (!readableMap.hasKey("lat") || readableMap.isNull("lat")) {
            return;
        }
        if (readableMap.hasKey("lon") || !readableMap.isNull("lon")) {
            m1399j(new CameraPosition(new Point(readableMap.getDouble("lat"), readableMap.getDouble("lon")), (!readableMap.hasKey("zoom") || readableMap.isNull("zoom")) ? 10.0f : (float) readableMap.getDouble("zoom"), (!readableMap.hasKey("azimuth") || readableMap.isNull("azimuth")) ? 0.0f : (float) readableMap.getDouble("azimuth"), (!readableMap.hasKey("tilt") || readableMap.isNull("tilt")) ? 0.0f : (float) readableMap.getDouble("tilt")), 0.0f, 0);
        }
    }

    public final void setInteractive(boolean z) {
        setNoninteractive(!z);
    }

    public final void setLogoPadding(ReadableMap readableMap) {
        O90.m5965c(readableMap);
        int i = 0;
        int i2 = (!readableMap.hasKey("horizontal") || readableMap.isNull("horizontal")) ? 0 : readableMap.getInt("horizontal");
        if (readableMap.hasKey("vertical") && !readableMap.isNull("vertical")) {
            i = readableMap.getInt("vertical");
        }
        getMapWindow().getMap().getLogo().setPadding(new Padding(i2, i));
    }

    public final void setLogoPosition(ReadableMap readableMap) {
        HorizontalAlignment horizontalAlignment = HorizontalAlignment.RIGHT;
        VerticalAlignment verticalAlignment = VerticalAlignment.BOTTOM;
        O90.m5965c(readableMap);
        if (readableMap.hasKey("horizontal") && !readableMap.isNull("horizontal")) {
            String string = readableMap.getString("horizontal");
            if (O90.m5963a(string, "left")) {
                horizontalAlignment = HorizontalAlignment.LEFT;
            } else if (O90.m5963a(string, "center")) {
                horizontalAlignment = HorizontalAlignment.CENTER;
            }
        }
        if (readableMap.hasKey("vertical") && !readableMap.isNull("vertical") && O90.m5963a(readableMap.getString("vertical"), "top")) {
            verticalAlignment = VerticalAlignment.TOP;
        }
        getMapWindow().getMap().getLogo().setAlignment(new Alignment(horizontalAlignment, verticalAlignment));
    }

    public final void setMapStyle(String str) {
        if (str != null) {
            getMapWindow().getMap().setMapStyle(str);
        }
    }

    public final void setMapType(String str) {
        if (str != null) {
            if (str.equals(LocalNotification.Importance.NONE)) {
                getMapWindow().getMap().setMapType(MapType.NONE);
            } else if (str.equals("raster")) {
                getMapWindow().getMap().setMapType(MapType.MAP);
            } else {
                getMapWindow().getMap().setMapType(MapType.VECTOR_MAP);
            }
        }
    }

    public final void setNightMode(Boolean bool) {
        Map map = getMapWindow().getMap();
        O90.m5965c(bool);
        map.setNightModeEnabled(bool.booleanValue());
    }

    public final void setRotateGesturesEnabled(Boolean bool) {
        Map map = getMapWindow().getMap();
        O90.m5965c(bool);
        map.setRotateGesturesEnabled(bool.booleanValue());
    }

    public final void setScrollGesturesEnabled(Boolean bool) {
        Map map = getMapWindow().getMap();
        O90.m5965c(bool);
        map.setScrollGesturesEnabled(bool.booleanValue());
    }

    public final void setShowUserPosition(boolean z) {
        if (this.f1693e == null) {
            this.f1693e = MapKitFactory.getInstance().createUserLocationLayer(getMapWindow());
        }
        if (z) {
            UserLocationLayer userLocationLayer = this.f1693e;
            O90.m5965c(userLocationLayer);
            userLocationLayer.setObjectListener(this);
            UserLocationLayer userLocationLayer2 = this.f1693e;
            O90.m5965c(userLocationLayer2);
            userLocationLayer2.setVisible(true);
            UserLocationLayer userLocationLayer3 = this.f1693e;
            O90.m5965c(userLocationLayer3);
            userLocationLayer3.setHeadingEnabled(true);
            return;
        }
        UserLocationLayer userLocationLayer4 = this.f1693e;
        O90.m5965c(userLocationLayer4);
        userLocationLayer4.setVisible(false);
        UserLocationLayer userLocationLayer5 = this.f1693e;
        O90.m5965c(userLocationLayer5);
        userLocationLayer5.setHeadingEnabled(false);
        UserLocationLayer userLocationLayer6 = this.f1693e;
        O90.m5965c(userLocationLayer6);
        userLocationLayer6.setObjectListener(null);
    }

    public final void setTiltGesturesEnabled(Boolean bool) {
        Map map = getMapWindow().getMap();
        O90.m5965c(bool);
        map.setTiltGesturesEnabled(bool.booleanValue());
    }

    public final void setTrafficVisible(boolean z) {
        if (this.f1697i == null) {
            this.f1697i = MapKitFactory.getInstance().createTrafficLayer(getMapWindow());
        }
        if (z) {
            TrafficLayer trafficLayer = this.f1697i;
            O90.m5965c(trafficLayer);
            trafficLayer.addTrafficListener(this);
            TrafficLayer trafficLayer2 = this.f1697i;
            O90.m5965c(trafficLayer2);
            trafficLayer2.setTrafficVisible(true);
            return;
        }
        TrafficLayer trafficLayer3 = this.f1697i;
        O90.m5965c(trafficLayer3);
        trafficLayer3.setTrafficVisible(false);
        TrafficLayer trafficLayer4 = this.f1697i;
        O90.m5965c(trafficLayer4);
        trafficLayer4.removeTrafficListener(this);
    }

    public final void setUserLocationAccuracyFillColor(int i) {
        this.f1694f = i;
        m1401l();
    }

    public final void setUserLocationAccuracyStrokeColor(int i) {
        this.f1695g = i;
        m1401l();
    }

    public final void setUserLocationAccuracyStrokeWidth(float f) {
        this.f1696h = f;
        m1401l();
    }

    public final void setUserLocationIcon(String str) {
        O90.m5968f(str, "iconSource");
        this.f1690b = str;
        Context context = getContext();
        O90.m5967e(context, "getContext(...)");
        new P60(context, str, new C8165Qj1(str, this)).start();
    }

    public final void setUserLocationIconScale(float f) {
        this.f1691c = f;
        m1401l();
    }

    public final void setViewParent(ViewParent viewParent) {
        this.f1689a = viewParent;
    }

    public final void setZoomGesturesEnabled(Boolean bool) {
        Map map = getMapWindow().getMap();
        O90.m5965c(bool);
        map.setZoomGesturesEnabled(bool.booleanValue());
    }

    @Override // com.yandex.mapkit.traffic.TrafficListener
    public final void onTrafficExpired() {
    }

    @Override // com.yandex.mapkit.traffic.TrafficListener
    public final void onTrafficLoading() {
    }

    @Override // com.yandex.mapkit.traffic.TrafficListener
    public final void onTrafficChanged(TrafficLevel trafficLevel) {
    }

    public final void setMaxFps(float f) {
    }
}
