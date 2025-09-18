package ru.vvdev.yamap;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewGroupManager;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import p000.AbstractC0852NX;
import p000.AbstractC10889rJ0;
import p000.C0926Oi;
import p000.C11847yp1;
import p000.C11974zp1;
import p000.InterfaceC9871jM0;
import p000.O90;
import p000.S91;

@Metadata(m22266d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-B\t\b\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u0019\u0010\u0014\u001a\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b!\u0010\"J\u001f\u0010$\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u001fH\u0007¢\u0006\u0004\b$\u0010\"J\u001f\u0010&\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u001fH\u0007¢\u0006\u0004\b&\u0010\"J\u001f\u0010(\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u001fH\u0007¢\u0006\u0004\b(\u0010\"J\u001f\u0010)\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u001fH\u0007¢\u0006\u0004\b)\u0010\"J\u001f\u0010*\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001fH\u0007¢\u0006\u0004\b*\u0010\"J\u001f\u0010+\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b+\u0010\"¨\u0006."}, m22267d2 = {"Lru/vvdev/yamap/YamapPolylineManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lyp1;", "<init>", "()V", "Landroid/view/View;", "view", "castToPolylineView", "(Landroid/view/View;)Lyp1;", "", "getName", "()Ljava/lang/String;", "", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "", "getExportedCustomBubblingEventTypeConstants", "LS91;", "context", "createViewInstance", "(LS91;)Lyp1;", "Lcom/facebook/react/bridge/ReadableArray;", "points", "LTf1;", "setPoints", "(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V", "", Snapshot.WIDTH, "setStrokeWidth", "(Landroid/view/View;F)V", "", "color", "setStrokeColor", "(Landroid/view/View;I)V", "zIndex", "setZIndex", "length", "setDashLength", "offset", "setDashOffset", "setGapLength", "setOutlineWidth", "setOutlineColor", "Companion", "zp1", "react-native-yamap_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class YamapPolylineManager extends ViewGroupManager<C11847yp1> {
    public static final C11974zp1 Companion = new C11974zp1();
    public static final String REACT_CLASS = "YamapPolyline";

    private final C11847yp1 castToPolylineView(View view) {
        O90.m5966d(view, "null cannot be cast to non-null type ru.vvdev.yamap.view.YamapPolyline");
        return (C11847yp1) view;
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

    @InterfaceC9871jM0(name = "dashLength")
    public final void setDashLength(View view, int length) {
        O90.m5968f(view, "view");
        castToPolylineView(view).setDashLength(length);
    }

    @InterfaceC9871jM0(name = "dashOffset")
    public final void setDashOffset(View view, int offset) {
        O90.m5968f(view, "view");
        castToPolylineView(view).setDashOffset(offset);
    }

    @InterfaceC9871jM0(name = "gapLength")
    public final void setGapLength(View view, int length) {
        O90.m5968f(view, "view");
        castToPolylineView(view).setGapLength(length);
    }

    @InterfaceC9871jM0(name = "outlineColor")
    public final void setOutlineColor(View view, int color) {
        O90.m5968f(view, "view");
        castToPolylineView(view).setOutlineColor(color);
    }

    @InterfaceC9871jM0(name = "outlineWidth")
    public final void setOutlineWidth(View view, int width) {
        O90.m5968f(view, "view");
        castToPolylineView(view).setOutlineWidth(width);
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
            castToPolylineView(view).setPolygonPoints(arrayList);
        }
    }

    @InterfaceC9871jM0(name = "strokeColor")
    public final void setStrokeColor(View view, int color) {
        O90.m5968f(view, "view");
        castToPolylineView(view).setStrokeColor(color);
    }

    @InterfaceC9871jM0(name = "strokeWidth")
    public final void setStrokeWidth(View view, float width) {
        O90.m5968f(view, "view");
        castToPolylineView(view).setStrokeWidth(width);
    }

    @InterfaceC9871jM0(name = "zIndex")
    public final void setZIndex(View view, int zIndex) {
        O90.m5968f(view, "view");
        castToPolylineView(view).setZIndex(zIndex);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C11847yp1 createViewInstance(S91 context) {
        O90.m5968f(context, "context");
        C11847yp1 c11847yp1 = new C11847yp1(context);
        c11847yp1.f46495b = new ArrayList();
        c11847yp1.f46497d = -16777216;
        c11847yp1.f46498e = -16777216;
        c11847yp1.f46499f = 1;
        c11847yp1.f46500g = 1.0f;
        c11847yp1.f46501h = 1;
        c11847yp1.f46494a = new Polyline(new ArrayList());
        return c11847yp1;
    }
}
