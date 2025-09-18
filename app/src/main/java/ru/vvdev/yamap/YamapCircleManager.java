package ru.vvdev.yamap;

import android.view.View;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewGroupManager;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import com.yandex.mapkit.geometry.Circle;
import com.yandex.mapkit.geometry.Point;
import com.yandex.varioqub.config.model.ConfigValue;
import java.util.Map;
import kotlin.Metadata;
import p000.AbstractC0852NX;
import p000.AbstractC10889rJ0;
import p000.C0926Oi;
import p000.C10826qp1;
import p000.C10954rp1;
import p000.InterfaceC9871jM0;
import p000.O90;
import p000.S91;

@Metadata(m22266d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&B\t\b\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0018\u00010\fH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u0019\u0010\u0010\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001d\u0010\u001bJ\u001f\u0010 \u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b\"\u0010!J\u001f\u0010$\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u001eH\u0007¢\u0006\u0004\b$\u0010!¨\u0006'"}, m22267d2 = {"Lru/vvdev/yamap/YamapCircleManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lqp1;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "", "getExportedCustomBubblingEventTypeConstants", "LS91;", "context", "createViewInstance", "(LS91;)Lqp1;", "view", "Lcom/facebook/react/bridge/ReadableMap;", "center", "LTf1;", "setCenter", "(Lqp1;Lcom/facebook/react/bridge/ReadableMap;)V", "", "radius", "setRadius", "(Lqp1;F)V", Snapshot.WIDTH, "setStrokeWidth", "", "color", "setStrokeColor", "(Lqp1;I)V", "setFillColor", "zIndex", "setZIndex", "Companion", "rp1", "react-native-yamap_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class YamapCircleManager extends ViewGroupManager<C10826qp1> {
    public static final C10954rp1 Companion = new C10954rp1();
    public static final String REACT_CLASS = "YamapCircle";

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

    @InterfaceC9871jM0(name = "center")
    public final void setCenter(C10826qp1 view, ReadableMap center) {
        O90.m5968f(view, "view");
        if (center != null) {
            view.setCenter(new Point(center.getDouble("lat"), center.getDouble("lon")));
        }
    }

    @InterfaceC9871jM0(name = "fillColor")
    public final void setFillColor(C10826qp1 view, int color) {
        O90.m5968f(view, "view");
        view.setFillColor(color);
    }

    @InterfaceC9871jM0(name = "radius")
    public final void setRadius(C10826qp1 view, float radius) {
        O90.m5968f(view, "view");
        view.setRadius(radius);
    }

    @InterfaceC9871jM0(name = "strokeColor")
    public final void setStrokeColor(C10826qp1 view, int color) {
        O90.m5968f(view, "view");
        view.setStrokeColor(color);
    }

    @InterfaceC9871jM0(name = "strokeWidth")
    public final void setStrokeWidth(C10826qp1 view, float width) {
        O90.m5968f(view, "view");
        view.setStrokeWidth(width);
    }

    @InterfaceC9871jM0(name = "zIndex")
    public final void setZIndex(C10826qp1 view, int zIndex) {
        O90.m5968f(view, "view");
        view.setZIndex(zIndex);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C10826qp1 createViewInstance(S91 context) {
        O90.m5968f(context, "context");
        C10826qp1 c10826qp1 = new C10826qp1(context);
        c10826qp1.f41193c = -16777216;
        c10826qp1.f41194d = -16777216;
        c10826qp1.f41195e = 1;
        c10826qp1.f41196f = 1.0f;
        Point point = new Point(ConfigValue.DOUBLE_DEFAULT_VALUE, ConfigValue.DOUBLE_DEFAULT_VALUE);
        c10826qp1.f41197g = point;
        c10826qp1.f41191a = new Circle(point, c10826qp1.f41198h);
        return c10826qp1;
    }
}
