package p000;

import android.content.Context;
import android.view.ViewGroup;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.map.MapObject;
import com.yandex.mapkit.map.MapObjectTapListener;
import com.yandex.mapkit.map.PolylineMapObject;
import java.util.ArrayList;

/* renamed from: yp1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11847yp1 extends ViewGroup implements MapObjectTapListener, UK0 {

    /* renamed from: a */
    public Polyline f46494a;

    /* renamed from: b */
    public ArrayList f46495b;

    /* renamed from: c */
    public MapObject f46496c;

    /* renamed from: d */
    public int f46497d;

    /* renamed from: e */
    public int f46498e;

    /* renamed from: f */
    public int f46499f;

    /* renamed from: g */
    public float f46500g;

    /* renamed from: h */
    public int f46501h;

    /* renamed from: i */
    public int f46502i;

    /* renamed from: j */
    public float f46503j;

    /* renamed from: k */
    public int f46504k;

    /* renamed from: a */
    public final void m26264a() {
        if (getRnMapObject() != null) {
            MapObject rnMapObject = getRnMapObject();
            O90.m5966d(rnMapObject, "null cannot be cast to non-null type com.yandex.mapkit.map.PolylineMapObject");
            ((PolylineMapObject) rnMapObject).setGeometry(this.f46494a);
            MapObject rnMapObject2 = getRnMapObject();
            O90.m5966d(rnMapObject2, "null cannot be cast to non-null type com.yandex.mapkit.map.PolylineMapObject");
            ((PolylineMapObject) rnMapObject2).setStrokeWidth(this.f46500g);
            MapObject rnMapObject3 = getRnMapObject();
            O90.m5966d(rnMapObject3, "null cannot be cast to non-null type com.yandex.mapkit.map.PolylineMapObject");
            ((PolylineMapObject) rnMapObject3).setStrokeColor(this.f46498e);
            MapObject rnMapObject4 = getRnMapObject();
            O90.m5966d(rnMapObject4, "null cannot be cast to non-null type com.yandex.mapkit.map.PolylineMapObject");
            ((PolylineMapObject) rnMapObject4).setZIndex(this.f46499f);
            MapObject rnMapObject5 = getRnMapObject();
            O90.m5966d(rnMapObject5, "null cannot be cast to non-null type com.yandex.mapkit.map.PolylineMapObject");
            ((PolylineMapObject) rnMapObject5).setDashLength(this.f46501h);
            MapObject rnMapObject6 = getRnMapObject();
            O90.m5966d(rnMapObject6, "null cannot be cast to non-null type com.yandex.mapkit.map.PolylineMapObject");
            ((PolylineMapObject) rnMapObject6).setGapLength(this.f46502i);
            MapObject rnMapObject7 = getRnMapObject();
            O90.m5966d(rnMapObject7, "null cannot be cast to non-null type com.yandex.mapkit.map.PolylineMapObject");
            ((PolylineMapObject) rnMapObject7).setDashOffset(this.f46503j);
            MapObject rnMapObject8 = getRnMapObject();
            O90.m5966d(rnMapObject8, "null cannot be cast to non-null type com.yandex.mapkit.map.PolylineMapObject");
            ((PolylineMapObject) rnMapObject8).setOutlineColor(this.f46497d);
            MapObject rnMapObject9 = getRnMapObject();
            O90.m5966d(rnMapObject9, "null cannot be cast to non-null type com.yandex.mapkit.map.PolylineMapObject");
            ((PolylineMapObject) rnMapObject9).setOutlineWidth(this.f46504k);
        }
    }

    @Override // p000.UK0
    public MapObject getRnMapObject() {
        return this.f46496c;
    }

    public final ArrayList<Point> get_points() {
        return this.f46495b;
    }

    @Override // com.yandex.mapkit.map.MapObjectTapListener
    public final boolean onMapObjectTap(MapObject mapObject, Point point) {
        O90.m5968f(mapObject, "mapObject");
        O90.m5968f(point, "point");
        WritableMap writableMapCreateMap = Arguments.createMap();
        Context context = getContext();
        O90.m5966d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ((RCTEventEmitter) ((ReactContext) context).getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), "onPress", writableMapCreateMap);
        return false;
    }

    public final void setDashLength(int i) {
        this.f46501h = i;
        m26264a();
    }

    public final void setDashOffset(float f) {
        this.f46503j = f;
        m26264a();
    }

    public final void setGapLength(int i) {
        this.f46502i = i;
        m26264a();
    }

    public final void setOutlineColor(int i) {
        this.f46497d = i;
        m26264a();
    }

    public final void setOutlineWidth(int i) {
        this.f46504k = i;
        m26264a();
    }

    public final void setPolygonPoints(ArrayList<Point> arrayList) {
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.f46495b = arrayList;
        this.f46494a = new Polyline(arrayList);
        m26264a();
    }

    public final void setPolylineMapObject(MapObject mapObject) {
        setRnMapObject((PolylineMapObject) mapObject);
        MapObject rnMapObject = getRnMapObject();
        O90.m5965c(rnMapObject);
        rnMapObject.addTapListener(this);
        m26264a();
    }

    public void setRnMapObject(MapObject mapObject) {
        this.f46496c = mapObject;
    }

    public final void setStrokeColor(int i) {
        this.f46498e = i;
        m26264a();
    }

    public final void setStrokeWidth(float f) {
        this.f46500g = f;
        m26264a();
    }

    public final void setZIndex(int i) {
        this.f46499f = i;
        m26264a();
    }

    public final void set_points(ArrayList<Point> arrayList) {
        O90.m5968f(arrayList, "<set-?>");
        this.f46495b = arrayList;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
