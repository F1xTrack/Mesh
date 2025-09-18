package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.yandex.mapkit.geometry.Circle;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.CircleMapObject;
import com.yandex.mapkit.map.MapObject;
import com.yandex.mapkit.map.MapObjectTapListener;

/* renamed from: qp1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6722qp1 extends ViewGroup implements MapObjectTapListener, UK0 {
    public Circle a;
    public MapObject b;
    public int c;
    public int d;
    public int e;
    public float f;
    public Point g;
    public float h;

    public final void a() {
        if (getRnMapObject() != null) {
            MapObject rnMapObject = getRnMapObject();
            O90.d(rnMapObject, "null cannot be cast to non-null type com.yandex.mapkit.map.CircleMapObject");
            ((CircleMapObject) rnMapObject).setGeometry(this.a);
            MapObject rnMapObject2 = getRnMapObject();
            O90.d(rnMapObject2, "null cannot be cast to non-null type com.yandex.mapkit.map.CircleMapObject");
            ((CircleMapObject) rnMapObject2).setStrokeWidth(this.f);
            MapObject rnMapObject3 = getRnMapObject();
            O90.d(rnMapObject3, "null cannot be cast to non-null type com.yandex.mapkit.map.CircleMapObject");
            ((CircleMapObject) rnMapObject3).setStrokeColor(this.d);
            MapObject rnMapObject4 = getRnMapObject();
            O90.d(rnMapObject4, "null cannot be cast to non-null type com.yandex.mapkit.map.CircleMapObject");
            ((CircleMapObject) rnMapObject4).setFillColor(this.c);
            MapObject rnMapObject5 = getRnMapObject();
            O90.d(rnMapObject5, "null cannot be cast to non-null type com.yandex.mapkit.map.CircleMapObject");
            ((CircleMapObject) rnMapObject5).setZIndex(this.e);
        }
    }

    @Override // defpackage.UK0
    public MapObject getRnMapObject() {
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

    public final void setCenter(Point point) {
        O90.f(point, "point");
        this.g = point;
        this.a = new Circle(point, this.h);
        a();
    }

    public final void setCircleMapObject(MapObject mapObject) {
        setRnMapObject((CircleMapObject) mapObject);
        MapObject rnMapObject = getRnMapObject();
        O90.c(rnMapObject);
        rnMapObject.addTapListener(this);
        a();
    }

    public final void setFillColor(int i) {
        this.c = i;
        a();
    }

    public final void setRadius(float f) {
        this.h = f;
        this.a = new Circle(this.g, f);
        a();
    }

    public void setRnMapObject(MapObject mapObject) {
        this.b = mapObject;
    }

    public final void setStrokeColor(int i) {
        this.d = i;
        a();
    }

    public final void setStrokeWidth(float f) {
        this.f = f;
        a();
    }

    public final void setZIndex(int i) {
        this.e = i;
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
