package p000;

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
public final class C10826qp1 extends ViewGroup implements MapObjectTapListener, UK0 {

    /* renamed from: a */
    public Circle f41191a;

    /* renamed from: b */
    public MapObject f41192b;

    /* renamed from: c */
    public int f41193c;

    /* renamed from: d */
    public int f41194d;

    /* renamed from: e */
    public int f41195e;

    /* renamed from: f */
    public float f41196f;

    /* renamed from: g */
    public Point f41197g;

    /* renamed from: h */
    public float f41198h;

    /* renamed from: a */
    public final void m24071a() {
        if (getRnMapObject() != null) {
            MapObject rnMapObject = getRnMapObject();
            O90.m5966d(rnMapObject, "null cannot be cast to non-null type com.yandex.mapkit.map.CircleMapObject");
            ((CircleMapObject) rnMapObject).setGeometry(this.f41191a);
            MapObject rnMapObject2 = getRnMapObject();
            O90.m5966d(rnMapObject2, "null cannot be cast to non-null type com.yandex.mapkit.map.CircleMapObject");
            ((CircleMapObject) rnMapObject2).setStrokeWidth(this.f41196f);
            MapObject rnMapObject3 = getRnMapObject();
            O90.m5966d(rnMapObject3, "null cannot be cast to non-null type com.yandex.mapkit.map.CircleMapObject");
            ((CircleMapObject) rnMapObject3).setStrokeColor(this.f41194d);
            MapObject rnMapObject4 = getRnMapObject();
            O90.m5966d(rnMapObject4, "null cannot be cast to non-null type com.yandex.mapkit.map.CircleMapObject");
            ((CircleMapObject) rnMapObject4).setFillColor(this.f41193c);
            MapObject rnMapObject5 = getRnMapObject();
            O90.m5966d(rnMapObject5, "null cannot be cast to non-null type com.yandex.mapkit.map.CircleMapObject");
            ((CircleMapObject) rnMapObject5).setZIndex(this.f41195e);
        }
    }

    @Override // p000.UK0
    public MapObject getRnMapObject() {
        return this.f41192b;
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

    public final void setCenter(Point point) {
        O90.m5968f(point, "point");
        this.f41197g = point;
        this.f41191a = new Circle(point, this.f41198h);
        m24071a();
    }

    public final void setCircleMapObject(MapObject mapObject) {
        setRnMapObject((CircleMapObject) mapObject);
        MapObject rnMapObject = getRnMapObject();
        O90.m5965c(rnMapObject);
        rnMapObject.addTapListener(this);
        m24071a();
    }

    public final void setFillColor(int i) {
        this.f41193c = i;
        m24071a();
    }

    public final void setRadius(float f) {
        this.f41198h = f;
        this.f41191a = new Circle(this.f41197g, f);
        m24071a();
    }

    public void setRnMapObject(MapObject mapObject) {
        this.f41192b = mapObject;
    }

    public final void setStrokeColor(int i) {
        this.f41194d = i;
        m24071a();
    }

    public final void setStrokeWidth(float f) {
        this.f41196f = f;
        m24071a();
    }

    public final void setZIndex(int i) {
        this.f41195e = i;
        m24071a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
