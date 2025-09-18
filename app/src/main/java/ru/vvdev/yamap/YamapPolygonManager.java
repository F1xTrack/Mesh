package ru.vvdev.yamap;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewGroupManager;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import com.yandex.mapkit.geometry.LinearRing;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polygon;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import p000.AbstractC0852NX;
import p000.AbstractC10889rJ0;
import p000.C0926Oi;
import p000.C11593wp1;
import p000.C11720xp1;
import p000.InterfaceC9871jM0;
import p000.O90;
import p000.S91;

@Metadata(m22266d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)B\t\b\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u0019\u0010\u0014\u001a\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0016H\u0007¢\u0006\u0004\b\u001c\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b%\u0010$J\u001f\u0010'\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010&\u001a\u00020!H\u0007¢\u0006\u0004\b'\u0010$¨\u0006*"}, m22267d2 = {"Lru/vvdev/yamap/YamapPolygonManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lwp1;", "<init>", "()V", "Landroid/view/View;", "view", "castToPolygonView", "(Landroid/view/View;)Lwp1;", "", "getName", "()Ljava/lang/String;", "", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "", "getExportedCustomBubblingEventTypeConstants", "LS91;", "context", "createViewInstance", "(LS91;)Lwp1;", "Lcom/facebook/react/bridge/ReadableArray;", "points", "LTf1;", "setPoints", "(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V", "_rings", "setInnerRings", "", Snapshot.WIDTH, "setStrokeWidth", "(Landroid/view/View;F)V", "", "color", "setStrokeColor", "(Landroid/view/View;I)V", "setFillColor", "zIndex", "setZIndex", "Companion", "xp1", "react-native-yamap_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class YamapPolygonManager extends ViewGroupManager<C11593wp1> {
    public static final C11720xp1 Companion = new C11720xp1();
    public static final String REACT_CLASS = "YamapPolygon";

    private final C11593wp1 castToPolygonView(View view) {
        O90.m5966d(view, "null cannot be cast to non-null type ru.vvdev.yamap.view.YamapPolygon");
        return (C11593wp1) view;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        return AbstractC10889rJ0.m24254a().m6122h();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        C0926Oi c0926OiM24254a = AbstractC10889rJ0.m24254a();
        c0926OiM24254a.m6125k("onPress", AbstractC10889rJ0.m24256c("registrationName", "onPress"));
        return c0926OiM24254a.m6122h();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, p000.I50
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        AbstractC0852NX.m5754c(this, view);
    }

    @InterfaceC9871jM0(name = "fillColor")
    public final void setFillColor(View view, int color) {
        O90.m5968f(view, "view");
        castToPolygonView(view).setFillColor(color);
    }

    @InterfaceC9871jM0(name = "innerRings")
    public final void setInnerRings(View view, ReadableArray _rings) {
        O90.m5968f(view, "view");
        ArrayList<ArrayList<Point>> arrayList = new ArrayList<>();
        if (_rings != null) {
            int size = _rings.size();
            for (int i = 0; i < size; i++) {
                ReadableArray array = _rings.getArray(i);
                if (array != null) {
                    ArrayList<Point> arrayList2 = new ArrayList<>();
                    int size2 = array.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ReadableMap map = array.getMap(i2);
                        if (map != null) {
                            arrayList2.add(new Point(map.getDouble("lat"), map.getDouble("lon")));
                        }
                    }
                    arrayList.add(arrayList2);
                }
            }
        }
        castToPolygonView(view).setPolygonInnerRings(arrayList);
    }

    @InterfaceC9871jM0(name = "points")
    public final void setPoints(View view, ReadableArray points) {
        O90.m5968f(view, "view");
        if (points != null) {
            ArrayList<Point> arrayList = new ArrayList<>();
            int size = points.size();
            for (int i = 0; i < size; i++) {
                ReadableMap map = points.getMap(i);
                if (map != null) {
                    arrayList.add(new Point(map.getDouble("lat"), map.getDouble("lon")));
                }
            }
            castToPolygonView(view).setPolygonPoints(arrayList);
        }
    }

    @InterfaceC9871jM0(name = "strokeColor")
    public final void setStrokeColor(View view, int color) {
        O90.m5968f(view, "view");
        castToPolygonView(view).setStrokeColor(color);
    }

    @InterfaceC9871jM0(name = "strokeWidth")
    public final void setStrokeWidth(View view, float width) {
        O90.m5968f(view, "view");
        castToPolygonView(view).setStrokeWidth(width);
    }

    @InterfaceC9871jM0(name = "zIndex")
    public final void setZIndex(View view, int zIndex) {
        O90.m5968f(view, "view");
        castToPolygonView(view).setZIndex(zIndex);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C11593wp1 createViewInstance(S91 context) {
        O90.m5968f(context, "context");
        C11593wp1 c11593wp1 = new C11593wp1(context);
        c11593wp1.f45124b = new ArrayList();
        c11593wp1.f45125c = new ArrayList();
        c11593wp1.f45127e = -16777216;
        c11593wp1.f45128f = -16777216;
        c11593wp1.f45129g = 1;
        c11593wp1.f45130h = 1.0f;
        c11593wp1.f45123a = new Polygon(new LinearRing(new ArrayList()), new ArrayList());
        return c11593wp1;
    }
}
