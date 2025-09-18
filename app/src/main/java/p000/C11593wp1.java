package p000;

import android.content.Context;
import android.view.ViewGroup;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.yandex.mapkit.geometry.LinearRing;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polygon;
import com.yandex.mapkit.map.MapObject;
import com.yandex.mapkit.map.MapObjectTapListener;
import com.yandex.mapkit.map.PolygonMapObject;
import java.util.ArrayList;
import java.util.List;

/* renamed from: wp1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11593wp1 extends ViewGroup implements MapObjectTapListener, UK0 {

    /* renamed from: a */
    public Polygon f45123a;

    /* renamed from: b */
    public ArrayList f45124b;

    /* renamed from: c */
    public ArrayList f45125c;

    /* renamed from: d */
    public MapObject f45126d;

    /* renamed from: e */
    public int f45127e;

    /* renamed from: f */
    public int f45128f;

    /* renamed from: g */
    public int f45129g;

    /* renamed from: h */
    public float f45130h;

    /* renamed from: a */
    public final void m25719a() {
        if (getRnMapObject() != null) {
            MapObject rnMapObject = getRnMapObject();
            O90.m5966d(rnMapObject, "null cannot be cast to non-null type com.yandex.mapkit.map.PolygonMapObject");
            ((PolygonMapObject) rnMapObject).setGeometry(this.f45123a);
            MapObject rnMapObject2 = getRnMapObject();
            O90.m5966d(rnMapObject2, "null cannot be cast to non-null type com.yandex.mapkit.map.PolygonMapObject");
            ((PolygonMapObject) rnMapObject2).setStrokeWidth(this.f45130h);
            MapObject rnMapObject3 = getRnMapObject();
            O90.m5966d(rnMapObject3, "null cannot be cast to non-null type com.yandex.mapkit.map.PolygonMapObject");
            ((PolygonMapObject) rnMapObject3).setStrokeColor(this.f45128f);
            MapObject rnMapObject4 = getRnMapObject();
            O90.m5966d(rnMapObject4, "null cannot be cast to non-null type com.yandex.mapkit.map.PolygonMapObject");
            ((PolygonMapObject) rnMapObject4).setFillColor(this.f45127e);
            MapObject rnMapObject5 = getRnMapObject();
            O90.m5966d(rnMapObject5, "null cannot be cast to non-null type com.yandex.mapkit.map.PolygonMapObject");
            ((PolygonMapObject) rnMapObject5).setZIndex(this.f45129g);
        }
    }

    /* renamed from: b */
    public final void m25720b() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f45125c;
        if (arrayList2 != null) {
            O90.m5965c(arrayList2);
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                ArrayList arrayList3 = this.f45125c;
                O90.m5965c(arrayList3);
                arrayList.add(new LinearRing((List<Point>) arrayList3.get(i)));
            }
        }
        this.f45123a = new Polygon(new LinearRing(this.f45124b), arrayList);
    }

    public final ArrayList<ArrayList<Point>> getInnerRings() {
        return this.f45125c;
    }

    @Override // p000.UK0
    public MapObject getRnMapObject() {
        return this.f45126d;
    }

    public final ArrayList<Point> get_points() {
        return this.f45124b;
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

    public final void setFillColor(int i) {
        this.f45127e = i;
        m25719a();
    }

    public final void setInnerRings(ArrayList<ArrayList<Point>> arrayList) {
        this.f45125c = arrayList;
    }

    public final void setPolygonInnerRings(ArrayList<ArrayList<Point>> arrayList) {
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.f45125c = arrayList;
        m25720b();
        m25719a();
    }

    public final void setPolygonMapObject(MapObject mapObject) {
        setRnMapObject((PolygonMapObject) mapObject);
        MapObject rnMapObject = getRnMapObject();
        O90.m5965c(rnMapObject);
        rnMapObject.addTapListener(this);
        m25719a();
    }

    public final void setPolygonPoints(ArrayList<Point> arrayList) {
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.f45124b = arrayList;
        m25720b();
        m25719a();
    }

    public void setRnMapObject(MapObject mapObject) {
        this.f45126d = mapObject;
    }

    public final void setStrokeColor(int i) {
        this.f45128f = i;
        m25719a();
    }

    public final void setStrokeWidth(float f) {
        this.f45130h = f;
        m25719a();
    }

    public final void setZIndex(int i) {
        this.f45129g = i;
        m25719a();
    }

    public final void set_points(ArrayList<Point> arrayList) {
        O90.m5968f(arrayList, "<set-?>");
        this.f45124b = arrayList;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
