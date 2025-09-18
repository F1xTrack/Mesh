package defpackage;

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
public final class C7866wp1 extends ViewGroup implements MapObjectTapListener, UK0 {
    public Polygon a;
    public ArrayList b;
    public ArrayList c;
    public MapObject d;
    public int e;
    public int f;
    public int g;
    public float h;

    public final void a() {
        if (getRnMapObject() != null) {
            MapObject rnMapObject = getRnMapObject();
            O90.d(rnMapObject, "null cannot be cast to non-null type com.yandex.mapkit.map.PolygonMapObject");
            ((PolygonMapObject) rnMapObject).setGeometry(this.a);
            MapObject rnMapObject2 = getRnMapObject();
            O90.d(rnMapObject2, "null cannot be cast to non-null type com.yandex.mapkit.map.PolygonMapObject");
            ((PolygonMapObject) rnMapObject2).setStrokeWidth(this.h);
            MapObject rnMapObject3 = getRnMapObject();
            O90.d(rnMapObject3, "null cannot be cast to non-null type com.yandex.mapkit.map.PolygonMapObject");
            ((PolygonMapObject) rnMapObject3).setStrokeColor(this.f);
            MapObject rnMapObject4 = getRnMapObject();
            O90.d(rnMapObject4, "null cannot be cast to non-null type com.yandex.mapkit.map.PolygonMapObject");
            ((PolygonMapObject) rnMapObject4).setFillColor(this.e);
            MapObject rnMapObject5 = getRnMapObject();
            O90.d(rnMapObject5, "null cannot be cast to non-null type com.yandex.mapkit.map.PolygonMapObject");
            ((PolygonMapObject) rnMapObject5).setZIndex(this.g);
        }
    }

    public final void b() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.c;
        if (arrayList2 != null) {
            O90.c(arrayList2);
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                ArrayList arrayList3 = this.c;
                O90.c(arrayList3);
                arrayList.add(new LinearRing((List<Point>) arrayList3.get(i)));
            }
        }
        this.a = new Polygon(new LinearRing(this.b), arrayList);
    }

    public final ArrayList<ArrayList<Point>> getInnerRings() {
        return this.c;
    }

    @Override // defpackage.UK0
    public MapObject getRnMapObject() {
        return this.d;
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

    public final void setFillColor(int i) {
        this.e = i;
        a();
    }

    public final void setInnerRings(ArrayList<ArrayList<Point>> arrayList) {
        this.c = arrayList;
    }

    public final void setPolygonInnerRings(ArrayList<ArrayList<Point>> arrayList) {
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.c = arrayList;
        b();
        a();
    }

    public final void setPolygonMapObject(MapObject mapObject) {
        setRnMapObject((PolygonMapObject) mapObject);
        MapObject rnMapObject = getRnMapObject();
        O90.c(rnMapObject);
        rnMapObject.addTapListener(this);
        a();
    }

    public final void setPolygonPoints(ArrayList<Point> arrayList) {
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.b = arrayList;
        b();
        a();
    }

    public void setRnMapObject(MapObject mapObject) {
        this.d = mapObject;
    }

    public final void setStrokeColor(int i) {
        this.f = i;
        a();
    }

    public final void setStrokeWidth(float f) {
        this.h = f;
        a();
    }

    public final void setZIndex(int i) {
        this.g = i;
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
