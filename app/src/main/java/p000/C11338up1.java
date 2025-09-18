package p000;

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
import com.facebook.react.views.view.C1932a;
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
public final class C11338up1 extends C1932a implements MapObjectTapListener, UK0 {

    /* renamed from: a */
    public Point f43958a;

    /* renamed from: b */
    public int f43959b;

    /* renamed from: c */
    public float f43960c;

    /* renamed from: d */
    public boolean f43961d;

    /* renamed from: e */
    public boolean f43962e;

    /* renamed from: f */
    public PointF f43963f;

    /* renamed from: g */
    public String f43964g;

    /* renamed from: h */
    public View f43965h;

    /* renamed from: i */
    public MapObject f43966i;

    /* renamed from: j */
    public final ArrayList f43967j;

    /* renamed from: k */
    public final ViewOnLayoutChangeListenerC6974uq f43968k;

    public C11338up1(S91 s91) {
        super(s91);
        this.f43959b = 1;
        this.f43960c = 1.0f;
        this.f43961d = true;
        this.f43967j = new ArrayList();
        this.f43968k = new ViewOnLayoutChangeListenerC6974uq(4, this);
    }

    @Override // p000.UK0
    public MapObject getRnMapObject() {
        return this.f43966i;
    }

    /* renamed from: l */
    public final void m25249l() {
        if (getRnMapObject() != null) {
            MapObject rnMapObject = getRnMapObject();
            O90.m5965c(rnMapObject);
            if (rnMapObject.isValid()) {
                IconStyle iconStyle = new IconStyle();
                iconStyle.setScale(Float.valueOf(this.f43960c));
                iconStyle.setRotationType(this.f43962e ? RotationType.ROTATE : RotationType.NO_ROTATION);
                iconStyle.setVisible(Boolean.valueOf(this.f43961d));
                PointF pointF = this.f43963f;
                if (pointF != null) {
                    iconStyle.setAnchor(pointF);
                }
                MapObject rnMapObject2 = getRnMapObject();
                O90.m5966d(rnMapObject2, "null cannot be cast to non-null type com.yandex.mapkit.map.PlacemarkMapObject");
                Point point = this.f43958a;
                O90.m5965c(point);
                ((PlacemarkMapObject) rnMapObject2).setGeometry(point);
                MapObject rnMapObject3 = getRnMapObject();
                O90.m5966d(rnMapObject3, "null cannot be cast to non-null type com.yandex.mapkit.map.PlacemarkMapObject");
                ((PlacemarkMapObject) rnMapObject3).setZIndex(this.f43959b);
                MapObject rnMapObject4 = getRnMapObject();
                O90.m5966d(rnMapObject4, "null cannot be cast to non-null type com.yandex.mapkit.map.PlacemarkMapObject");
                ((PlacemarkMapObject) rnMapObject4).setIconStyle(iconStyle);
                View view = this.f43965h;
                if (view != null) {
                    try {
                        O90.m5965c(view);
                        int width = view.getWidth();
                        View view2 = this.f43965h;
                        O90.m5965c(view2);
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, view2.getHeight(), Bitmap.Config.ARGB_8888);
                        O90.m5967e(bitmapCreateBitmap, "createBitmap(...)");
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        View view3 = this.f43965h;
                        O90.m5965c(view3);
                        view3.draw(canvas);
                        MapObject rnMapObject5 = getRnMapObject();
                        O90.m5966d(rnMapObject5, "null cannot be cast to non-null type com.yandex.mapkit.map.PlacemarkMapObject");
                        ((PlacemarkMapObject) rnMapObject5).setIcon(ImageProvider.fromBitmap(bitmapCreateBitmap));
                        MapObject rnMapObject6 = getRnMapObject();
                        O90.m5966d(rnMapObject6, "null cannot be cast to non-null type com.yandex.mapkit.map.PlacemarkMapObject");
                        ((PlacemarkMapObject) rnMapObject6).setIconStyle(iconStyle);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (this.f43967j.size() != 0 || O90.m5963a(this.f43964g, "")) {
                    return;
                }
                ViewParent parent = getParent();
                O90.m5966d(parent, "null cannot be cast to non-null type ru.vvdev.yamap.view.YamapView");
                C7449Cp1 c7449Cp1 = (C7449Cp1) parent;
                String str = this.f43964g;
                if (str != null) {
                    MapObject rnMapObject7 = getRnMapObject();
                    O90.m5966d(rnMapObject7, "null cannot be cast to non-null type com.yandex.mapkit.map.PlacemarkMapObject");
                    PlacemarkMapObject placemarkMapObject = (PlacemarkMapObject) rnMapObject7;
                    HashMap map = C7449Cp1.f1688k;
                    if (map.get(str) == null) {
                        Context context = c7449Cp1.getContext();
                        O90.m5967e(context, "getContext(...)");
                        new P60(context, str, new C7397Bp1(placemarkMapObject, str, iconStyle)).start();
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
        O90.m5968f(mapObject, "mapObject");
        O90.m5968f(point, "point");
        WritableMap writableMapCreateMap = Arguments.createMap();
        Context context = getContext();
        O90.m5966d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ((RCTEventEmitter) ((ReactContext) context).getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), "onPress", writableMapCreateMap);
        return false;
    }

    public final void setAnchor(PointF pointF) {
        this.f43963f = pointF;
        m25249l();
    }

    public final void setChildView(View view) {
        ViewOnLayoutChangeListenerC6974uq viewOnLayoutChangeListenerC6974uq = this.f43968k;
        if (view != null) {
            this.f43965h = view;
            view.addOnLayoutChangeListener(viewOnLayoutChangeListenerC6974uq);
            return;
        }
        View view2 = this.f43965h;
        O90.m5965c(view2);
        view2.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC6974uq);
        this.f43965h = null;
        m25249l();
    }

    public final void setIconSource(String str) {
        this.f43964g = str;
        m25249l();
    }

    public final void setMarkerMapObject(MapObject mapObject) {
        setRnMapObject((PlacemarkMapObject) mapObject);
        MapObject rnMapObject = getRnMapObject();
        O90.m5965c(rnMapObject);
        rnMapObject.addTapListener(this);
        m25249l();
    }

    public final void setPoint(Point point) {
        this.f43958a = point;
        m25249l();
    }

    public void setRnMapObject(MapObject mapObject) {
        this.f43966i = mapObject;
    }

    public final void setRotated(boolean z) {
        this.f43962e = z;
        m25249l();
    }

    public final void setScale(float f) {
        this.f43960c = f;
        m25249l();
    }

    public final void setVisible(boolean z) {
        this.f43961d = z;
        m25249l();
    }

    public final void setZIndex(int i) {
        this.f43959b = i;
        m25249l();
    }

    @Override // com.facebook.react.views.view.C1932a, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
