package ru.vvdev.yamap;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewGroupManager;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.MapObject;
import com.yandex.mapkit.map.PlacemarkMapObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import p000.AbstractC0852NX;
import p000.AbstractC10889rJ0;
import p000.C0926Oi;
import p000.C11338up1;
import p000.C11466vp1;
import p000.InterfaceC9871jM0;
import p000.O90;
import p000.S91;

@Metadata(m22266d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 :2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001;B\t\b\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u0019\u0010\u0014\u001a\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b!\u0010\"J!\u0010%\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010#H\u0007¢\u0006\u0004\b%\u0010&J!\u0010(\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010'\u001a\u0004\u0018\u00010#H\u0007¢\u0006\u0004\b(\u0010&J!\u0010*\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010)\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b*\u0010+J!\u0010-\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010,\u001a\u0004\u0018\u00010\u0016H\u0007¢\u0006\u0004\b-\u0010\u001aJ'\u00101\u001a\u00020\u00182\u0006\u0010.\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u001bH\u0016¢\u0006\u0004\b1\u00102J\u001f\u00103\u001a\u00020\u00182\u0006\u0010.\u001a\u00020\u00022\u0006\u00100\u001a\u00020\u001bH\u0016¢\u0006\u0004\b3\u00104J)\u00108\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u00105\u001a\u00020\t2\b\u00107\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b8\u00109¨\u0006<"}, m22267d2 = {"Lru/vvdev/yamap/YamapMarkerManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lup1;", "<init>", "()V", "Landroid/view/View;", "view", "castToMarkerView", "(Landroid/view/View;)Lup1;", "", "getName", "()Ljava/lang/String;", "", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "", "getExportedCustomBubblingEventTypeConstants", "LS91;", "context", "createViewInstance", "(LS91;)Lup1;", "Lcom/facebook/react/bridge/ReadableMap;", "markerPoint", "LTf1;", "setPoint", "(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V", "", "zIndex", "setZIndex", "(Landroid/view/View;I)V", "", "scale", "setScale", "(Landroid/view/View;F)V", "", "rotated", "setRotated", "(Landroid/view/View;Ljava/lang/Boolean;)V", "visible", "setVisible", "source", "setSource", "(Landroid/view/View;Ljava/lang/String;)V", "anchor", "setAnchor", "parent", "child", "index", "addView", "(Lup1;Landroid/view/View;I)V", "removeViewAt", "(Lup1;I)V", "commandType", "Lcom/facebook/react/bridge/ReadableArray;", "args", "receiveCommand", "(Lup1;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "Companion", "vp1", "react-native-yamap_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class YamapMarkerManager extends ViewGroupManager<C11338up1> {
    public static final C11466vp1 Companion = new C11466vp1();
    public static final String REACT_CLASS = "YamapMarker";

    private final C11338up1 castToMarkerView(View view) {
        O90.m5966d(view, "null cannot be cast to non-null type ru.vvdev.yamap.view.YamapMarker");
        return (C11338up1) view;
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

    @InterfaceC9871jM0(name = "anchor")
    public final void setAnchor(View view, ReadableMap anchor) {
        O90.m5968f(view, "view");
        castToMarkerView(view).setAnchor(anchor != null ? new PointF((float) anchor.getDouble("x"), (float) anchor.getDouble("y")) : null);
    }

    @InterfaceC9871jM0(name = "point")
    public final void setPoint(View view, ReadableMap markerPoint) {
        O90.m5968f(view, "view");
        if (markerPoint != null) {
            castToMarkerView(view).setPoint(new Point(markerPoint.getDouble("lat"), markerPoint.getDouble("lon")));
        }
    }

    @InterfaceC9871jM0(name = "rotated")
    public final void setRotated(View view, Boolean rotated) {
        O90.m5968f(view, "view");
        castToMarkerView(view).setRotated(rotated != null ? rotated.booleanValue() : true);
    }

    @InterfaceC9871jM0(name = "scale")
    public final void setScale(View view, float scale) {
        O90.m5968f(view, "view");
        castToMarkerView(view).setScale(scale);
    }

    @InterfaceC9871jM0(name = "source")
    public final void setSource(View view, String source) {
        O90.m5968f(view, "view");
        if (source != null) {
            castToMarkerView(view).setIconSource(source);
        }
    }

    @InterfaceC9871jM0(name = "visible")
    public final void setVisible(View view, Boolean visible) {
        O90.m5968f(view, "view");
        castToMarkerView(view).setVisible(visible != null ? visible.booleanValue() : true);
    }

    @InterfaceC9871jM0(name = "zIndex")
    public final void setZIndex(View view, int zIndex) {
        O90.m5968f(view, "view");
        castToMarkerView(view).setZIndex(zIndex);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C11338up1 createViewInstance(S91 context) {
        O90.m5968f(context, "context");
        return new C11338up1(context);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(C11338up1 view, String commandType, ReadableArray args) {
        O90.m5968f(view, "view");
        O90.m5968f(commandType, "commandType");
        if (!commandType.equals("animatedMoveTo")) {
            if (!commandType.equals("animatedRotateTo")) {
                throw new IllegalArgumentException(String.format("Unsupported command %d received by %s.", Arrays.copyOf(new Object[]{commandType, "YamapMarkerManager"}, 2)));
            }
            O90.m5965c(args);
            int i = args.getInt(0);
            int i2 = args.getInt(1);
            final C11338up1 c11338up1CastToMarkerView = castToMarkerView(view);
            MapObject rnMapObject = c11338up1CastToMarkerView.getRnMapObject();
            O90.m5966d(rnMapObject, "null cannot be cast to non-null type com.yandex.mapkit.map.PlacemarkMapObject");
            PlacemarkMapObject placemarkMapObject = (PlacemarkMapObject) rnMapObject;
            final float direction = placemarkMapObject.getDirection();
            final float direction2 = i - placemarkMapObject.getDirection();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(i2);
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tp1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C11338up1 c11338up1 = c11338up1CastToMarkerView;
                    O90.m5968f(c11338up1, "this$0");
                    O90.m5968f(valueAnimator, "animation");
                    try {
                        float animatedFraction = direction + (valueAnimator.getAnimatedFraction() * direction2);
                        MapObject rnMapObject2 = c11338up1.getRnMapObject();
                        O90.m5966d(rnMapObject2, "null cannot be cast to non-null type com.yandex.mapkit.map.PlacemarkMapObject");
                        ((PlacemarkMapObject) rnMapObject2).setDirection(animatedFraction);
                    } catch (Exception unused) {
                    }
                }
            });
            valueAnimatorOfFloat.start();
            return;
        }
        O90.m5965c(args);
        ReadableMap map = args.getMap(0);
        int i3 = args.getInt(1);
        Point point = new Point((float) map.getDouble("lat"), (float) map.getDouble("lon"));
        final C11338up1 c11338up1CastToMarkerView2 = castToMarkerView(view);
        float f = i3;
        c11338up1CastToMarkerView2.getClass();
        MapObject rnMapObject2 = c11338up1CastToMarkerView2.getRnMapObject();
        O90.m5966d(rnMapObject2, "null cannot be cast to non-null type com.yandex.mapkit.map.PlacemarkMapObject");
        Point geometry = ((PlacemarkMapObject) rnMapObject2).getGeometry();
        O90.m5967e(geometry, "getGeometry(...)");
        final double latitude = geometry.getLatitude();
        final double longitude = geometry.getLongitude();
        final double latitude2 = point.getLatitude() - latitude;
        final double longitude2 = point.getLongitude() - longitude;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setDuration((long) f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sp1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C11338up1 c11338up1 = c11338up1CastToMarkerView2;
                O90.m5968f(c11338up1, "this$0");
                O90.m5968f(valueAnimator, "animation");
                try {
                    double animatedFraction = valueAnimator.getAnimatedFraction();
                    double d = (latitude2 * animatedFraction) + latitude;
                    double d2 = (animatedFraction * longitude2) + longitude;
                    MapObject rnMapObject3 = c11338up1.getRnMapObject();
                    O90.m5966d(rnMapObject3, "null cannot be cast to non-null type com.yandex.mapkit.map.PlacemarkMapObject");
                    ((PlacemarkMapObject) rnMapObject3).setGeometry(new Point(d, d2));
                } catch (Exception unused) {
                }
            }
        });
        valueAnimatorOfFloat2.start();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(C11338up1 parent, View child, int index) {
        O90.m5968f(parent, "parent");
        O90.m5968f(child, "child");
        ArrayList arrayList = parent.f43967j;
        arrayList.add(index, child);
        parent.setChildView((View) arrayList.get(0));
        super.addView((YamapMarkerManager) parent, child, index);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(C11338up1 parent, int index) {
        O90.m5968f(parent, "parent");
        ArrayList arrayList = parent.f43967j;
        arrayList.remove(index);
        parent.setChildView(arrayList.size() > 0 ? (View) arrayList.get(0) : null);
        super.removeViewAt((YamapMarkerManager) parent, index);
    }
}
