package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.views.view.a;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.map.MapObject;
import com.yandex.mapkit.map.MapObjectTapListener;
import com.yandex.mapkit.map.PlacemarkMapObject;
import com.yandex.mapkit.map.RotationType;
import com.yandex.runtime.image.ImageProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* renamed from: up1 */
/* loaded from: classes2.dex */
public final class C7485up1 extends a implements MapObjectTapListener, UK0 {
    public Point a;
    public int b;
    public float c;
    public boolean d;
    public boolean e;
    public PointF f;
    public String g;
    public View h;
    public MapObject i;
    public final ArrayList j;
    public final ViewOnLayoutChangeListenerC7486uq k;

    public C7485up1(S91 s91) {
        super(s91);
        this.b = 1;
        this.c = 1.0f;
        this.d = true;
        this.j = new ArrayList();
        this.k = new ViewOnLayoutChangeListenerC7486uq(4, this);
    }

    @Override // defpackage.UK0
    public MapObject getRnMapObject() {
        return this.i;
    }

    public final void l() {
        if (getRnMapObject() != null) {
            MapObject rnMapObject = getRnMapObject();
            O90.c(rnMapObject);
            if (rnMapObject.isValid()) {
                IconStyle iconStyle = new IconStyle();
                iconStyle.setScale(Float.valueOf(this.c));
                iconStyle.setRotationType(this.e ? RotationType.ROTATE : RotationType.NO_ROTATION);
                iconStyle.setVisible(Boolean.valueOf(this.d));
                PointF pointF = this.f;
                if (pointF != null) {
                    iconStyle.setAnchor(pointF);
                }
                MapObject rnMapObject2 = getRnMapObject();
                O90.d(rnMapObject2, "null cannot be cast to non-null type com.yandex.mapkit.map.PlacemarkMapObject");
                Point point = this.a;
                O90.c(point);
                ((PlacemarkMapObject) rnMapObject2).setGeometry(point);
                MapObject rnMapObject3 = getRnMapObject();
                O90.d(rnMapObject3, "null cannot be cast to non-null type com.yandex.mapkit.map.PlacemarkMapObject");
                ((PlacemarkMapObject) rnMapObject3).setZIndex(this.b);
                MapObject rnMapObject4 = getRnMapObject();
                O90.d(rnMapObject4, "null cannot be cast to non-null type com.yandex.mapkit.map.PlacemarkMapObject");
                ((PlacemarkMapObject) rnMapObject4).setIconStyle(iconStyle);
                View view = this.h;
                if (view != null) {
                    try {
                        O90.c(view);
                        int width = view.getWidth();
                        View view2 = this.h;
                        O90.c(view2);
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, view2.getHeight(), Bitmap.Config.ARGB_8888);
                        O90.e(bitmapCreateBitmap, "createBitmap(...)");
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        View view3 = this.h;
                        O90.c(view3);
                        view3.draw(canvas);
                        MapObject rnMapObject5 = getRnMapObject();
                        O90.d(rnMapObject5, "null cannot be cast to non-null type com.yandex.mapkit.map.PlacemarkMapObject");
                        ((PlacemarkMapObject) rnMapObject5).setIcon(ImageProvider.fromBitmap(bitmapCreateBitmap));
                        MapObject rnMapObject6 = getRnMapObject();
                        O90.d(rnMapObject6, "null cannot be cast to non-null type com.yandex.mapkit.map.PlacemarkMapObject");
                        ((PlacemarkMapObject) rnMapObject6).setIconStyle(iconStyle);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (this.j.size() != 0 || O90.a(this.g, "")) {
                    return;
                }
                ViewParent parent = getParent();
                O90.d(parent, "null cannot be cast to non-null type ru.vvdev.yamap.view.YamapView");
                C0223Cp1 c0223Cp1 = (C0223Cp1) parent;
                String str = this.g;
                if (str != null) {
                    MapObject rnMapObject7 = getRnMapObject();
                    O90.d(rnMapObject7, "null cannot be cast to non-null type com.yandex.mapkit.map.PlacemarkMapObject");
                    PlacemarkMapObject placemarkMapObject = (PlacemarkMapObject) rnMapObject7;
                    HashMap map = C0223Cp1.k;
                    if (map.get(str) == null) {
                        Context context = c0223Cp1.getContext();
                        O90.e(context, "getContext(...)");
                        new P60(context, str, new C0145Bp1(placemarkMapObject, str, iconStyle)).start();
                    } else {
                        Object obj = map.get(str);
                        Objects.requireNonNull(obj);
                        placemarkMapObject.setIcon((ImageProvider) obj);
                        placemarkMapObject.setIconStyle(iconStyle);
                    }
                }
            }
        }
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

    public final void setAnchor(PointF pointF) {
        this.f = pointF;
        l();
    }

    public final void setChildView(View view) {
        ViewOnLayoutChangeListenerC7486uq viewOnLayoutChangeListenerC7486uq = this.k;
        if (view != null) {
            this.h = view;
            view.addOnLayoutChangeListener(viewOnLayoutChangeListenerC7486uq);
            return;
        }
        View view2 = this.h;
        O90.c(view2);
        view2.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC7486uq);
        this.h = null;
        l();
    }

    public final void setIconSource(String str) {
        this.g = str;
        l();
    }

    public final void setMarkerMapObject(MapObject mapObject) {
        setRnMapObject((PlacemarkMapObject) mapObject);
        MapObject rnMapObject = getRnMapObject();
        O90.c(rnMapObject);
        rnMapObject.addTapListener(this);
        l();
    }

    public final void setPoint(Point point) {
        this.a = point;
        l();
    }

    public void setRnMapObject(MapObject mapObject) {
        this.i = mapObject;
    }

    public final void setRotated(boolean z) {
        this.e = z;
        l();
    }

    public final void setScale(float f) {
        this.c = f;
        l();
    }

    public final void setVisible(boolean z) {
        this.d = z;
        l();
    }

    public final void setZIndex(int i) {
        this.b = i;
        l();
    }

    @Override // com.facebook.react.views.view.a, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
