package defpackage;

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
import com.huawei.hms.rn.push.constants.LocalNotification;
import com.huawei.hms.rn.push.constants.NotificationConstants;
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
public class C0223Cp1 extends MapView implements UserLocationObjectListener, CameraListener, InputListener, TrafficListener, MapLoadedListener {
    public static final HashMap k;
    public ViewParent a;
    public String b;
    public float c;
    public Bitmap d;
    public UserLocationLayer e;
    public int f;
    public int g;
    public float h;
    public TrafficLayer i;
    public UserLocationView j;

    static {
        C0067Ap1 c0067Ap1 = new C0067Ap1();
        c0067Ap1.put("bus", "#59ACFF");
        c0067Ap1.put("railway", "#F8634F");
        c0067Ap1.put("tramway", "#C86DD7");
        c0067Ap1.put("suburban", "#3023AE");
        c0067Ap1.put("underground", "#BDCCDC");
        c0067Ap1.put("trolleybus", "#55CfDC");
        c0067Ap1.put("walk", "#333333");
        k = new HashMap();
    }

    public C0223Cp1(S91 s91) {
        super(s91);
        this.b = "";
        this.c = 1.0f;
        getMapWindow().getMap().addCameraListener(this);
        getMapWindow().getMap().addInputListener(this);
        getMapWindow().getMap().setMapLoadedListener(this);
    }

    public static WritableMap h(CameraPosition cameraPosition, CameraUpdateReason cameraUpdateReason, boolean z) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        Point target = cameraPosition.getTarget();
        O90.e(target, "getTarget(...)");
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

    public void a(View view) {
        if (view instanceof C7866wp1) {
            C7866wp1 c7866wp1 = (C7866wp1) view;
            PolygonMapObject polygonMapObjectAddPolygon = getMapWindow().getMap().getMapObjects().addPolygon(c7866wp1.a);
            O90.e(polygonMapObjectAddPolygon, "addPolygon(...)");
            c7866wp1.setPolygonMapObject(polygonMapObjectAddPolygon);
            return;
        }
        if (view instanceof C8246yp1) {
            C8246yp1 c8246yp1 = (C8246yp1) view;
            PolylineMapObject polylineMapObjectAddPolyline = getMapWindow().getMap().getMapObjects().addPolyline(c8246yp1.a);
            O90.e(polylineMapObjectAddPolyline, "addPolyline(...)");
            c8246yp1.setPolylineMapObject(polylineMapObjectAddPolyline);
            return;
        }
        if (!(view instanceof C7485up1)) {
            if (view instanceof C6722qp1) {
                C6722qp1 c6722qp1 = (C6722qp1) view;
                CircleMapObject circleMapObjectAddCircle = getMapWindow().getMap().getMapObjects().addCircle(c6722qp1.a);
                O90.e(circleMapObjectAddCircle, "addCircle(...)");
                c6722qp1.setCircleMapObject(circleMapObjectAddCircle);
                return;
            }
            return;
        }
        MapObjectCollection mapObjects = getMapWindow().getMap().getMapObjects();
        C7485up1 c7485up1 = (C7485up1) view;
        Point point = c7485up1.a;
        O90.c(point);
        PlacemarkMapObject placemarkMapObjectAddPlacemark = mapObjects.addPlacemark(point);
        O90.e(placemarkMapObjectAddPlacemark, "addPlacemark(...)");
        c7485up1.setMarkerMapObject(placemarkMapObjectAddPlacemark);
    }

    public final void b(String str) {
        CameraPosition cameraPosition = getMapWindow().getMap().getCameraPosition();
        O90.e(cameraPosition, "getCameraPosition(...)");
        WritableMap writableMapH = h(cameraPosition, CameraUpdateReason.valueOf("APPLICATION"), true);
        writableMapH.putString(NotificationConstants.ID, str);
        Context context = getContext();
        O90.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ((RCTEventEmitter) ((ReactContext) context).getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), "cameraPosition", writableMapH);
    }

    public final void c(ReadableArray readableArray, String str) {
        O90.f(readableArray, "screenPoints");
        WritableArray writableArrayCreateArray = Arguments.createArray();
        int size = readableArray.size();
        for (int i = 0; i < size; i++) {
            ReadableMap map = readableArray.getMap(i);
            Point pointScreenToWorld = getMapWindow().screenToWorld(new ScreenPoint((float) map.getDouble("x"), (float) map.getDouble("y")));
            WritableMap writableMapCreateMap = Arguments.createMap();
            O90.c(pointScreenToWorld);
            writableMapCreateMap.putDouble("lat", pointScreenToWorld.getLatitude());
            writableMapCreateMap.putDouble("lon", pointScreenToWorld.getLongitude());
            writableArrayCreateArray.pushMap(writableMapCreateMap);
        }
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putString(NotificationConstants.ID, str);
        writableMapCreateMap2.putArray("worldPoints", writableArrayCreateArray);
        Context context = getContext();
        O90.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ((RCTEventEmitter) ((ReactContext) context).getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), "screenToWorldPoints", writableMapCreateMap2);
    }

    public final void d(String str) {
        VisibleRegion visibleRegion = getMapWindow().getMap().getVisibleRegion();
        O90.e(visibleRegion, "getVisibleRegion(...)");
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
        writableMapCreateMap.putString(NotificationConstants.ID, str);
        Context context = getContext();
        O90.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ((RCTEventEmitter) ((ReactContext) context).getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), "visibleRegion", writableMapCreateMap);
    }

    public final void e(ReadableArray readableArray, String str) {
        O90.f(readableArray, "worldPoints");
        WritableArray writableArrayCreateArray = Arguments.createArray();
        int size = readableArray.size();
        for (int i = 0; i < size; i++) {
            ReadableMap map = readableArray.getMap(i);
            ScreenPoint screenPointWorldToScreen = getMapWindow().worldToScreen(new Point(map.getDouble("lat"), map.getDouble("lon")));
            WritableMap writableMapCreateMap = Arguments.createMap();
            O90.c(screenPointWorldToScreen);
            writableMapCreateMap.putDouble("x", screenPointWorldToScreen.getX());
            writableMapCreateMap.putDouble("y", screenPointWorldToScreen.getY());
            writableArrayCreateArray.pushMap(writableMapCreateMap);
        }
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putString(NotificationConstants.ID, str);
        writableMapCreateMap2.putArray("screenPoints", writableArrayCreateArray);
        Context context = getContext();
        O90.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ((RCTEventEmitter) ((ReactContext) context).getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), "worldToScreenPoints", writableMapCreateMap2);
    }

    public final void f() {
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            O90.e(childAt, "getChildAt(...)");
            if (childAt instanceof C7485up1) {
                arrayList.add(((C7485up1) childAt).a);
            }
        }
        g(arrayList);
    }

    public final void g(ArrayList arrayList) {
        if (arrayList.size() == 0) {
            return;
        }
        if (arrayList.size() == 1) {
            Object obj = arrayList.get(0);
            O90.c(obj);
            double latitude = ((Point) obj).getLatitude();
            Object obj2 = arrayList.get(0);
            O90.c(obj2);
            getMapWindow().getMap().move(new CameraPosition(new Point(latitude, ((Point) obj2).getLongitude()), 15.0f, 0.0f, 0.0f));
            return;
        }
        Map map = getMapWindow().getMap();
        Object obj3 = arrayList.get(0);
        O90.c(obj3);
        double longitude = ((Point) obj3).getLongitude();
        Object obj4 = arrayList.get(0);
        O90.c(obj4);
        double longitude2 = ((Point) obj4).getLongitude();
        Object obj5 = arrayList.get(0);
        O90.c(obj5);
        double latitude2 = ((Point) obj5).getLatitude();
        Object obj6 = arrayList.get(0);
        O90.c(obj6);
        double latitude3 = ((Point) obj6).getLatitude();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj7 = arrayList.get(i);
            O90.c(obj7);
            if (((Point) obj7).getLongitude() > longitude2) {
                Object obj8 = arrayList.get(i);
                O90.c(obj8);
                longitude2 = ((Point) obj8).getLongitude();
            }
            Object obj9 = arrayList.get(i);
            O90.c(obj9);
            if (((Point) obj9).getLongitude() < longitude) {
                Object obj10 = arrayList.get(i);
                O90.c(obj10);
                longitude = ((Point) obj10).getLongitude();
            }
            Object obj11 = arrayList.get(i);
            O90.c(obj11);
            if (((Point) obj11).getLatitude() > latitude3) {
                Object obj12 = arrayList.get(i);
                O90.c(obj12);
                latitude3 = ((Point) obj12).getLatitude();
            }
            Object obj13 = arrayList.get(i);
            O90.c(obj13);
            if (((Point) obj13).getLatitude() < latitude2) {
                Object obj14 = arrayList.get(i);
                O90.c(obj14);
                latitude2 = ((Point) obj14).getLatitude();
            }
        }
        CameraPosition cameraPosition = map.cameraPosition(Geometry.fromBoundingBox(new BoundingBox(new Point(latitude2, longitude), new Point(latitude3, longitude2))));
        O90.e(cameraPosition, "cameraPosition(...)");
        getMapWindow().getMap().move(new CameraPosition(cameraPosition.getTarget(), cameraPosition.getZoom() - 1.8f, cameraPosition.getAzimuth(), cameraPosition.getTilt()), new Animation(Animation.Type.SMOOTH, 0.7f), null);
    }

    public void i(int i) {
        if (getChildAt(i) instanceof UK0) {
            KeyEvent.Callback childAt = getChildAt(i);
            O90.d(childAt, "null cannot be cast to non-null type ru.vvdev.yamap.models.ReactMapObject");
            MapObject rnMapObject = ((UK0) childAt).getRnMapObject();
            if (rnMapObject == null || !rnMapObject.isValid()) {
                return;
            }
            getMapWindow().getMap().getMapObjects().remove(rnMapObject);
        }
    }

    public final void j(CameraPosition cameraPosition, float f, int i) {
        if (f > 0.0f) {
            getMapWindow().getMap().move(cameraPosition, new Animation(i == 0 ? Animation.Type.SMOOTH : Animation.Type.LINEAR, f), null);
        } else {
            getMapWindow().getMap().move(cameraPosition);
        }
    }

    public final void k(Float f, float f2, int i) {
        CameraPosition cameraPosition = getMapWindow().getMap().getCameraPosition();
        O90.e(cameraPosition, "getCameraPosition(...)");
        j(new CameraPosition(cameraPosition.getTarget(), f.floatValue(), cameraPosition.getAzimuth(), cameraPosition.getTilt()), f2, i);
    }

    public final void l() {
        if (this.j != null) {
            IconStyle iconStyle = new IconStyle();
            iconStyle.setScale(Float.valueOf(this.c));
            UserLocationView userLocationView = this.j;
            O90.c(userLocationView);
            PlacemarkMapObject pin = userLocationView.getPin();
            O90.e(pin, "getPin(...)");
            UserLocationView userLocationView2 = this.j;
            O90.c(userLocationView2);
            PlacemarkMapObject arrow = userLocationView2.getArrow();
            O90.e(arrow, "getArrow(...)");
            Bitmap bitmap = this.d;
            if (bitmap != null) {
                pin.setIcon(ImageProvider.fromBitmap(bitmap), iconStyle);
                arrow.setIcon(ImageProvider.fromBitmap(this.d), iconStyle);
            }
            UserLocationView userLocationView3 = this.j;
            O90.c(userLocationView3);
            CircleMapObject accuracyCircle = userLocationView3.getAccuracyCircle();
            O90.e(accuracyCircle, "getAccuracyCircle(...)");
            int i = this.f;
            if (i != 0) {
                accuracyCircle.setFillColor(i);
            }
            int i2 = this.g;
            if (i2 != 0) {
                accuracyCircle.setStrokeColor(i2);
            }
            accuracyCircle.setStrokeWidth(this.h);
        }
    }

    @Override // com.yandex.mapkit.map.CameraListener
    public final void onCameraPositionChanged(Map map, CameraPosition cameraPosition, CameraUpdateReason cameraUpdateReason, boolean z) {
        O90.f(map, "map");
        O90.f(cameraPosition, "cameraPosition");
        O90.f(cameraUpdateReason, "reason");
        WritableMap writableMapH = h(cameraPosition, cameraUpdateReason, z);
        WritableMap writableMapH2 = h(cameraPosition, cameraUpdateReason, z);
        Context context = getContext();
        O90.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        ((RCTEventEmitter) reactContext.getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), "cameraPositionChange", writableMapH);
        if (z) {
            ((RCTEventEmitter) reactContext.getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), "cameraPositionChangeEnd", writableMapH2);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        O90.f(motionEvent, "event");
        int action = motionEvent.getAction();
        if (action == 0) {
            ViewParent viewParent = this.a;
            if (viewParent == null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            } else {
                O90.c(viewParent);
                viewParent.requestDisallowInterceptTouchEvent(true);
            }
        } else if (action == 1) {
            ViewParent viewParent2 = this.a;
            if (viewParent2 == null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            } else {
                O90.c(viewParent2);
                viewParent2.requestDisallowInterceptTouchEvent(false);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.yandex.mapkit.map.MapLoadedListener
    public final void onMapLoaded(MapLoadStatistics mapLoadStatistics) {
        O90.f(mapLoadStatistics, "statistics");
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
        O90.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ((RCTEventEmitter) ((ReactContext) context).getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), "onMapLoaded", writableMapCreateMap);
    }

    @Override // com.yandex.mapkit.map.InputListener
    public final void onMapLongTap(Map map, Point point) {
        O90.f(map, "map");
        O90.f(point, "point");
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("lat", point.getLatitude());
        writableMapCreateMap.putDouble("lon", point.getLongitude());
        Context context = getContext();
        O90.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ((RCTEventEmitter) ((ReactContext) context).getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), "onMapLongPress", writableMapCreateMap);
    }

    @Override // com.yandex.mapkit.map.InputListener
    public final void onMapTap(Map map, Point point) {
        O90.f(map, "map");
        O90.f(point, "point");
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("lat", point.getLatitude());
        writableMapCreateMap.putDouble("lon", point.getLongitude());
        Context context = getContext();
        O90.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ((RCTEventEmitter) ((ReactContext) context).getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), "onMapPress", writableMapCreateMap);
    }

    @Override // com.yandex.mapkit.user_location.UserLocationObjectListener
    public final void onObjectAdded(UserLocationView userLocationView) {
        O90.f(userLocationView, "_userLocationView");
        this.j = userLocationView;
        l();
    }

    @Override // com.yandex.mapkit.user_location.UserLocationObjectListener
    public final void onObjectRemoved(UserLocationView userLocationView) {
        O90.f(userLocationView, "userLocationView");
    }

    @Override // com.yandex.mapkit.user_location.UserLocationObjectListener
    public final void onObjectUpdated(UserLocationView userLocationView, ObjectEvent objectEvent) {
        O90.f(userLocationView, "_userLocationView");
        O90.f(objectEvent, "objectEvent");
        this.j = userLocationView;
        l();
    }

    public final void setFastTapEnabled(Boolean bool) {
        Map map = getMapWindow().getMap();
        O90.c(bool);
        map.setFastTapEnabled(bool.booleanValue());
    }

    public final void setFollowUser(boolean z) {
        if (this.e == null) {
            setShowUserPosition(true);
        }
        if (z) {
            UserLocationLayer userLocationLayer = this.e;
            O90.c(userLocationLayer);
            userLocationLayer.setAutoZoomEnabled(true);
            UserLocationLayer userLocationLayer2 = this.e;
            O90.c(userLocationLayer2);
            userLocationLayer2.setAnchor(new PointF((float) (getWidth() * 0.5d), (float) (getHeight() * 0.5d)), new PointF((float) (getWidth() * 0.5d), (float) (getHeight() * 0.83d)));
            return;
        }
        UserLocationLayer userLocationLayer3 = this.e;
        O90.c(userLocationLayer3);
        userLocationLayer3.setAutoZoomEnabled(false);
        UserLocationLayer userLocationLayer4 = this.e;
        O90.c(userLocationLayer4);
        userLocationLayer4.resetAnchor();
    }

    public final void setInitialRegion(ReadableMap readableMap) {
        O90.c(readableMap);
        if (!readableMap.hasKey("lat") || readableMap.isNull("lat")) {
            return;
        }
        if (readableMap.hasKey("lon") || !readableMap.isNull("lon")) {
            j(new CameraPosition(new Point(readableMap.getDouble("lat"), readableMap.getDouble("lon")), (!readableMap.hasKey("zoom") || readableMap.isNull("zoom")) ? 10.0f : (float) readableMap.getDouble("zoom"), (!readableMap.hasKey("azimuth") || readableMap.isNull("azimuth")) ? 0.0f : (float) readableMap.getDouble("azimuth"), (!readableMap.hasKey("tilt") || readableMap.isNull("tilt")) ? 0.0f : (float) readableMap.getDouble("tilt")), 0.0f, 0);
        }
    }

    public final void setInteractive(boolean z) {
        setNoninteractive(!z);
    }

    public final void setLogoPadding(ReadableMap readableMap) {
        O90.c(readableMap);
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
        O90.c(readableMap);
        if (readableMap.hasKey("horizontal") && !readableMap.isNull("horizontal")) {
            String string = readableMap.getString("horizontal");
            if (O90.a(string, "left")) {
                horizontalAlignment = HorizontalAlignment.LEFT;
            } else if (O90.a(string, "center")) {
                horizontalAlignment = HorizontalAlignment.CENTER;
            }
        }
        if (readableMap.hasKey("vertical") && !readableMap.isNull("vertical") && O90.a(readableMap.getString("vertical"), "top")) {
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
        O90.c(bool);
        map.setNightModeEnabled(bool.booleanValue());
    }

    public final void setRotateGesturesEnabled(Boolean bool) {
        Map map = getMapWindow().getMap();
        O90.c(bool);
        map.setRotateGesturesEnabled(bool.booleanValue());
    }

    public final void setScrollGesturesEnabled(Boolean bool) {
        Map map = getMapWindow().getMap();
        O90.c(bool);
        map.setScrollGesturesEnabled(bool.booleanValue());
    }

    public final void setShowUserPosition(boolean z) {
        if (this.e == null) {
            this.e = MapKitFactory.getInstance().createUserLocationLayer(getMapWindow());
        }
        if (z) {
            UserLocationLayer userLocationLayer = this.e;
            O90.c(userLocationLayer);
            userLocationLayer.setObjectListener(this);
            UserLocationLayer userLocationLayer2 = this.e;
            O90.c(userLocationLayer2);
            userLocationLayer2.setVisible(true);
            UserLocationLayer userLocationLayer3 = this.e;
            O90.c(userLocationLayer3);
            userLocationLayer3.setHeadingEnabled(true);
            return;
        }
        UserLocationLayer userLocationLayer4 = this.e;
        O90.c(userLocationLayer4);
        userLocationLayer4.setVisible(false);
        UserLocationLayer userLocationLayer5 = this.e;
        O90.c(userLocationLayer5);
        userLocationLayer5.setHeadingEnabled(false);
        UserLocationLayer userLocationLayer6 = this.e;
        O90.c(userLocationLayer6);
        userLocationLayer6.setObjectListener(null);
    }

    public final void setTiltGesturesEnabled(Boolean bool) {
        Map map = getMapWindow().getMap();
        O90.c(bool);
        map.setTiltGesturesEnabled(bool.booleanValue());
    }

    public final void setTrafficVisible(boolean z) {
        if (this.i == null) {
            this.i = MapKitFactory.getInstance().createTrafficLayer(getMapWindow());
        }
        if (z) {
            TrafficLayer trafficLayer = this.i;
            O90.c(trafficLayer);
            trafficLayer.addTrafficListener(this);
            TrafficLayer trafficLayer2 = this.i;
            O90.c(trafficLayer2);
            trafficLayer2.setTrafficVisible(true);
            return;
        }
        TrafficLayer trafficLayer3 = this.i;
        O90.c(trafficLayer3);
        trafficLayer3.setTrafficVisible(false);
        TrafficLayer trafficLayer4 = this.i;
        O90.c(trafficLayer4);
        trafficLayer4.removeTrafficListener(this);
    }

    public final void setUserLocationAccuracyFillColor(int i) {
        this.f = i;
        l();
    }

    public final void setUserLocationAccuracyStrokeColor(int i) {
        this.g = i;
        l();
    }

    public final void setUserLocationAccuracyStrokeWidth(float f) {
        this.h = f;
        l();
    }

    public final void setUserLocationIcon(String str) {
        O90.f(str, "iconSource");
        this.b = str;
        Context context = getContext();
        O90.e(context, "getContext(...)");
        new P60(context, str, new C1296Qj1(str, this)).start();
    }

    public final void setUserLocationIconScale(float f) {
        this.c = f;
        l();
    }

    public final void setViewParent(ViewParent viewParent) {
        this.a = viewParent;
    }

    public final void setZoomGesturesEnabled(Boolean bool) {
        Map map = getMapWindow().getMap();
        O90.c(bool);
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
