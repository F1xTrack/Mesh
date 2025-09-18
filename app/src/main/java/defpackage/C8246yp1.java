package defpackage;

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
public final class C8246yp1 extends ViewGroup implements MapObjectTapListener, UK0 {
    public Polyline a;
    public ArrayList b;
    public MapObject c;
    public int d;
    public int e;
    public int f;
    public float g;
    public int h;
    public int i;
    public float j;
    public int k;

    public final void a() {
        if (getRnMapObject() != null) {
            MapObject rnMapObject = getRnMapObject();
            O90.d(rnMapObject, "null cannot be cast to non-null type com.yandex.mapkit.map.PolylineMapObject");
            ((PolylineMapObject) rnMapObject).setGeometry(this.a);
            MapObject rnMapObject2 = getRnMapObject();
            O90.d(rnMapObject2, "null cannot be cast to non-null type com.yandex.mapkit.map.PolylineMapObject");
            ((PolylineMapObject) rnMapObject2).setStrokeWidth(this.g);
            MapObject rnMapObject3 = getRnMapObject();
            O90.d(rnMapObject3, "null cannot be cast to non-null type com.yandex.mapkit.map.PolylineMapObject");
            ((PolylineMapObject) rnMapObject3).setStrokeColor(this.e);
            MapObject rnMapObject4 = getRnMapObject();
            O90.d(rnMapObject4, "null cannot be cast to non-null type com.yandex.mapkit.map.PolylineMapObject");
            ((PolylineMapObject) rnMapObject4).setZIndex(this.f);
            MapObject rnMapObject5 = getRnMapObject();
            O90.d(rnMapObject5, "null cannot be cast to non-null type com.yandex.mapkit.map.PolylineMapObject");
            ((PolylineMapObject) rnMapObject5).setDashLength(this.h);
            MapObject rnMapObject6 = getRnMapObject();
            O90.d(rnMapObject6, "null cannot be cast to non-null type com.yandex.mapkit.map.PolylineMapObject");
            ((PolylineMapObject) rnMapObject6).setGapLength(this.i);
            MapObject rnMapObject7 = getRnMapObject();
            O90.d(rnMapObject7, "null cannot be cast to non-null type com.yandex.mapkit.map.PolylineMapObject");
            ((PolylineMapObject) rnMapObject7).setDashOffset(this.j);
            MapObject rnMapObject8 = getRnMapObject();
            O90.d(rnMapObject8, "null cannot be cast to non-null type com.yandex.mapkit.map.PolylineMapObject");
            ((PolylineMapObject) rnMapObject8).setOutlineColor(this.d);
            MapObject rnMapObject9 = getRnMapObject();
            O90.d(rnMapObject9, "null cannot be cast to non-null type com.yandex.mapkit.map.PolylineMapObject");
            ((PolylineMapObject) rnMapObject9).setOutlineWidth(this.k);
        }
    }

    @Override // defpackage.UK0
    public MapObject getRnMapObject() {
        return this.c;
    }

    public final ArrayList<Point> get_points() {
        return this.b;
    }

    @Override // com.yandex.mapkit.map.MapObjectTapListener
    public final boolean onMapObjectTap(MapObject mapObject, Point point) {
        O90.f(mapObject, "mapObject");
        O90.f(point, "point");
        WritableMap writableMapCreateMap = Arguments.createMap();
        Context context = getContext();
        O90.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ((RCTEventEmitter) ((ReactContext) context).getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), "onPress", writableMapCreateMap);
        return false;
    }

    public final void setDashLength(int i) {
        this.h = i;
        a();
    }

    public final void setDashOffset(float f) {
        this.j = f;
        a();
    }

    public final void setGapLength(int i) {
        this.i = i;
        a();
    }

    public final void setOutlineColor(int i) {
        this.d = i;
        a();
    }

    public final void setOutlineWidth(int i) {
        this.k = i;
        a();
    }

    public final void setPolygonPoints(ArrayList<Point> arrayList) {
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.b = arrayList;
        this.a = new Polyline(arrayList);
        a();
    }

    public final void setPolylineMapObject(MapObject mapObject) {
        setRnMapObject((PolylineMapObject) mapObject);
        MapObject rnMapObject = getRnMapObject();
        O90.c(rnMapObject);
        rnMapObject.addTapListener(this);
        a();
    }

    public void setRnMapObject(MapObject mapObject) {
        this.c = mapObject;
    }

    public final void setStrokeColor(int i) {
        this.e = i;
        a();
    }

    public final void setStrokeWidth(float f) {
        this.g = f;
        a();
    }

    public final void setZIndex(int i) {
        this.f = i;
        a();
    }

    public final void set_points(ArrayList<Point> arrayList) {
        O90.f(arrayList, "<set-?>");
        this.b = arrayList;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
