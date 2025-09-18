package com.swmansion.rnscreens;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewGroupManager;
import com.huawei.hms.p015rn.push.constants.LocalNotification;
import com.huawei.hms.p015rn.push.constants.RemoteMessageAttributes;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import p000.AbstractC0852NX;
import p000.AbstractC10784qU1;
import p000.AbstractC10889rJ0;
import p000.AbstractC11077sn0;
import p000.AbstractC11406vL1;
import p000.AbstractC7167xu;
import p000.AbstractC7222ym;
import p000.AbstractC8593Yp1;
import p000.AbstractC9639hY0;
import p000.BW0;
import p000.C10115lG0;
import p000.C10439no0;
import p000.C11948zc1;
import p000.C4049fN;
import p000.C6340l4;
import p000.C7110x;
import p000.C7319Ac1;
import p000.C8435Vo1;
import p000.C9205e90;
import p000.C9251eW0;
import p000.G41;
import p000.GT0;
import p000.InterfaceC7543Ek1;
import p000.InterfaceC9101dL0;
import p000.InterfaceC9479gI0;
import p000.InterfaceC9871jM0;
import p000.LV0;
import p000.LZ0;
import p000.MV0;
import p000.NM0;
import p000.O90;
import p000.OV0;
import p000.RV0;
import p000.S91;
import p000.VV0;

@InterfaceC9101dL0(name = ScreenViewManager.REACT_CLASS)
@Metadata(m22266d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000 c2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001dB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b%\u0010&J\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0011\u0010\u001bJ!\u0010(\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b(\u0010)J!\u0010+\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010*\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b+\u0010)J\u001f\u0010.\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010-\u001a\u00020,H\u0017¢\u0006\u0004\b.\u0010/J!\u00100\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010*\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b0\u0010)J!\u00102\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u00101\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b2\u0010)J!\u00104\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u00103\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b4\u0010)J!\u00106\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u00105\u001a\u0004\u0018\u00010\u0016H\u0017¢\u0006\u0004\b6\u00107J!\u00109\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u00108\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b9\u0010)J\u001f\u0010;\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010:\u001a\u00020,H\u0017¢\u0006\u0004\b;\u0010/J\u001f\u0010=\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010<\u001a\u00020,H\u0017¢\u0006\u0004\b=\u0010/J!\u0010?\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010>\u001a\u0004\u0018\u00010\u0016H\u0017¢\u0006\u0004\b?\u00107J\u001f\u0010A\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010@\u001a\u00020,H\u0017¢\u0006\u0004\bA\u0010/J\u001f\u0010C\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010B\u001a\u00020,H\u0017¢\u0006\u0004\bC\u0010/J\u001f\u0010E\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010D\u001a\u00020,H\u0017¢\u0006\u0004\bE\u0010/J!\u0010G\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010F\u001a\u00020\u0016H\u0017¢\u0006\u0004\bG\u0010\u001bJ!\u0010H\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010F\u001a\u00020,H\u0016¢\u0006\u0004\bH\u0010/J!\u0010I\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010F\u001a\u00020,H\u0016¢\u0006\u0004\bI\u0010/J!\u0010J\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010F\u001a\u00020\u0016H\u0016¢\u0006\u0004\bJ\u0010\u001bJ!\u0010K\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010F\u001a\u00020,H\u0016¢\u0006\u0004\bK\u0010/J!\u0010L\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010F\u001a\u00020,H\u0016¢\u0006\u0004\bL\u0010/J#\u0010N\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010F\u001a\u0004\u0018\u00010MH\u0016¢\u0006\u0004\bN\u0010OJ!\u0010P\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010F\u001a\u00020,H\u0016¢\u0006\u0004\bP\u0010/J!\u0010Q\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010F\u001a\u00020,H\u0016¢\u0006\u0004\bQ\u0010/J#\u0010R\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010F\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bR\u0010)J!\u0010T\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010F\u001a\u0004\u0018\u00010SH\u0017¢\u0006\u0004\bT\u0010UJ\u001f\u0010V\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010F\u001a\u00020\u0016H\u0017¢\u0006\u0004\bV\u0010\u001bJ\u001f\u0010W\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010F\u001a\u00020,H\u0017¢\u0006\u0004\bW\u0010/J\u001f\u0010X\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010F\u001a\u00020\u000eH\u0017¢\u0006\u0004\bX\u0010\u0012J\u001f\u0010Y\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010F\u001a\u00020,H\u0017¢\u0006\u0004\bY\u0010/J\u001f\u0010Z\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010F\u001a\u00020\u0016H\u0017¢\u0006\u0004\bZ\u0010\u001bJ\u001b\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\"0[H\u0016¢\u0006\u0004\b\\\u0010]J\u0015\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00020^H\u0014¢\u0006\u0004\b_\u0010`R\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010b¨\u0006e"}, m22267d2 = {"Lcom/swmansion/rnscreens/ScreenViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "LRV0;", "LgI0;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "LS91;", "reactContext", "createViewInstance", "(LS91;)LRV0;", "view", "", "activityState", "LTf1;", "setActivityState", "(LRV0;F)V", "parent", "Landroid/view/View;", "child", "", "index", "addView", "(LRV0;Landroid/view/View;I)V", "removeViewAt", "(LRV0;I)V", "removeView", "(LRV0;Landroid/view/View;)V", "LNM0;", "props", "LG41;", "stateWrapper", "", "updateState", "(LRV0;LNM0;LG41;)Ljava/lang/Object;", "onAfterUpdateTransaction", "(LRV0;)V", "presentation", "setStackPresentation", "(LRV0;Ljava/lang/String;)V", "animation", "setStackAnimation", "", "gestureEnabled", "setGestureEnabled", "(LRV0;Z)V", "setReplaceAnimation", "screenOrientation", "setScreenOrientation", "statusBarAnimation", "setStatusBarAnimation", "statusBarColor", "setStatusBarColor", "(LRV0;Ljava/lang/Integer;)V", "statusBarStyle", "setStatusBarStyle", "statusBarTranslucent", "setStatusBarTranslucent", "statusBarHidden", "setStatusBarHidden", "navigationBarColor", "setNavigationBarColor", "navigationBarTranslucent", "setNavigationBarTranslucent", "navigationBarHidden", "setNavigationBarHidden", "nativeBackButtonDismissalEnabled", "setNativeBackButtonDismissalEnabled", "value", "setSheetElevation", "setFullScreenSwipeEnabled", "setFullScreenSwipeShadowEnabled", "setTransitionDuration", "setHideKeyboardOnSwipe", "setCustomAnimationOnSwipe", "Lcom/facebook/react/bridge/ReadableMap;", "setGestureResponseDistance", "(LRV0;Lcom/facebook/react/bridge/ReadableMap;)V", "setHomeIndicatorHidden", "setPreventNativeDismiss", "setSwipeDirection", "Lcom/facebook/react/bridge/ReadableArray;", "setSheetAllowedDetents", "(LRV0;Lcom/facebook/react/bridge/ReadableArray;)V", "setSheetLargestUndimmedDetent", "setSheetGrabberVisible", "setSheetCornerRadius", "setSheetExpandsWhenScrolledToEdge", "setSheetInitialDetent", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "LEk1;", "getDelegate", "()LEk1;", "delegate", "LEk1;", "Companion", "BW0", "react-native-screens_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public class ScreenViewManager extends ViewGroupManager<RV0> implements InterfaceC9479gI0 {
    public static final BW0 Companion = new BW0();
    public static final String REACT_CLASS = "RNSScreen";
    private final InterfaceC7543Ek1 delegate = new C6340l4(this, 11);

    @Override // com.facebook.react.uimanager.ViewManager
    public InterfaceC7543Ek1 getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return AbstractC11077sn0.m24781i(new Pair("topDismissed", AbstractC10889rJ0.m24256c("registrationName", "onDismissed")), new Pair("topWillAppear", AbstractC10889rJ0.m24256c("registrationName", "onWillAppear")), new Pair("topAppear", AbstractC10889rJ0.m24256c("registrationName", "onAppear")), new Pair("topWillDisappear", AbstractC10889rJ0.m24256c("registrationName", "onWillDisappear")), new Pair("topDisappear", AbstractC10889rJ0.m24256c("registrationName", "onDisappear")), new Pair("topHeaderHeightChange", AbstractC10889rJ0.m24256c("registrationName", "onHeaderHeightChange")), new Pair("topHeaderBackButtonClicked", AbstractC10889rJ0.m24256c("registrationName", "onHeaderBackButtonClicked")), new Pair("topTransitionProgress", AbstractC10889rJ0.m24256c("registrationName", "onTransitionProgress")), new Pair("topSheetDetentChanged", AbstractC10889rJ0.m24256c("registrationName", "onSheetDetentChanged")));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, p000.I50
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        AbstractC0852NX.m5754c(this, view);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public RV0 createViewInstance(S91 reactContext) {
        O90.m5968f(reactContext, "reactContext");
        return new RV0(reactContext);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(RV0 view) {
        O90.m5968f(view, "view");
        super.onAfterUpdateTransaction((ScreenViewManager) view);
        if (view.f10231m) {
            view.f10231m = false;
            if (view.f10225g != OV0.f8463d || view.getBackground() == null) {
                return;
            }
            Drawable background = view.getBackground();
            C10439no0 c10439no0 = background instanceof C10439no0 ? (C10439no0) background : null;
            if (c10439no0 != null) {
                float fM25402a = AbstractC11406vL1.m25402a(view.f10232n);
                GT0 gt0 = new GT0();
                GT0 gt02 = new GT0();
                C7110x c7110x = new C7110x(0.0f);
                C7110x c7110x2 = new C7110x(0.0f);
                C4049fN c4049fN = new C4049fN(0);
                C4049fN c4049fN2 = new C4049fN(0);
                C4049fN c4049fN3 = new C4049fN(0);
                C4049fN c4049fN4 = new C4049fN(0);
                AbstractC10784qU1 abstractC10784qU1M9385a = AbstractC8593Yp1.m9385a(0);
                C8435Vo1.m8558d(abstractC10784qU1M9385a);
                C7110x c7110x3 = new C7110x(fM25402a);
                AbstractC10784qU1 abstractC10784qU1M9385a2 = AbstractC8593Yp1.m9385a(0);
                C8435Vo1.m8558d(abstractC10784qU1M9385a2);
                C7110x c7110x4 = new C7110x(fM25402a);
                LZ0 lz0 = new LZ0();
                lz0.f6714a = abstractC10784qU1M9385a;
                lz0.f6715b = abstractC10784qU1M9385a2;
                lz0.f6716c = gt0;
                lz0.f6717d = gt02;
                lz0.f6718e = c7110x3;
                lz0.f6719f = c7110x4;
                lz0.f6720g = c7110x;
                lz0.f6721h = c7110x2;
                lz0.f6722i = c4049fN;
                lz0.f6723j = c4049fN2;
                lz0.f6724k = c4049fN3;
                lz0.f6725l = c4049fN4;
                c10439no0.setShapeAppearanceModel(lz0);
            }
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeView(RV0 parent, View view) {
        O90.m5968f(parent, "parent");
        O90.m5968f(view, "view");
        super.removeView((ScreenViewManager) parent, view);
        if (view instanceof C9251eW0) {
            parent.setFooter(null);
        }
    }

    @Override // p000.InterfaceC9479gI0
    public void setActivityState(RV0 view, float activityState) {
        O90.m5968f(view, "view");
        setActivityState(view, (int) activityState);
    }

    @Override // p000.InterfaceC9479gI0
    public void setCustomAnimationOnSwipe(RV0 view, boolean value) {
    }

    @Override // p000.InterfaceC9479gI0
    public void setFullScreenSwipeEnabled(RV0 view, boolean value) {
    }

    @Override // p000.InterfaceC9479gI0
    public void setFullScreenSwipeShadowEnabled(RV0 view, boolean value) {
    }

    @Override // p000.InterfaceC9479gI0
    @InterfaceC9871jM0(defaultBoolean = true, name = "gestureEnabled")
    public void setGestureEnabled(RV0 view, boolean gestureEnabled) {
        O90.m5968f(view, "view");
        view.setGestureEnabled(gestureEnabled);
    }

    @Override // p000.InterfaceC9479gI0
    public void setGestureResponseDistance(RV0 view, ReadableMap value) {
    }

    @Override // p000.InterfaceC9479gI0
    public void setHideKeyboardOnSwipe(RV0 view, boolean value) {
    }

    @Override // p000.InterfaceC9479gI0
    public void setHomeIndicatorHidden(RV0 view, boolean value) {
    }

    @Override // p000.InterfaceC9479gI0
    @InterfaceC9871jM0(name = "nativeBackButtonDismissalEnabled")
    public void setNativeBackButtonDismissalEnabled(RV0 view, boolean nativeBackButtonDismissalEnabled) {
        O90.m5968f(view, "view");
        view.setNativeBackButtonDismissalEnabled(nativeBackButtonDismissalEnabled);
    }

    @Override // p000.InterfaceC9479gI0
    @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, name = "navigationBarColor")
    public void setNavigationBarColor(RV0 view, Integer navigationBarColor) {
        O90.m5968f(view, "view");
        view.setNavigationBarColor(navigationBarColor);
    }

    @Override // p000.InterfaceC9479gI0
    @InterfaceC9871jM0(name = "navigationBarHidden")
    public void setNavigationBarHidden(RV0 view, boolean navigationBarHidden) {
        O90.m5968f(view, "view");
        view.setNavigationBarHidden(Boolean.valueOf(navigationBarHidden));
    }

    @Override // p000.InterfaceC9479gI0
    @InterfaceC9871jM0(name = "navigationBarTranslucent")
    public void setNavigationBarTranslucent(RV0 view, boolean navigationBarTranslucent) {
        O90.m5968f(view, "view");
        view.setNavigationBarTranslucent(Boolean.valueOf(navigationBarTranslucent));
    }

    @Override // p000.InterfaceC9479gI0
    public void setPreventNativeDismiss(RV0 view, boolean value) {
    }

    @Override // p000.InterfaceC9479gI0
    @InterfaceC9871jM0(name = "replaceAnimation")
    public void setReplaceAnimation(RV0 view, String animation) {
        MV0 mv0;
        O90.m5968f(view, "view");
        if (animation == null ? true : animation.equals("pop")) {
            mv0 = MV0.f7198b;
        } else {
            if (!O90.m5963a(animation, "push")) {
                throw new JSApplicationIllegalArgumentException(AbstractC7222ym.m26245v("Unknown replace animation type ", animation));
            }
            mv0 = MV0.f7197a;
        }
        view.setReplaceAnimation(mv0);
    }

    @Override // p000.InterfaceC9479gI0
    @InterfaceC9871jM0(name = "screenOrientation")
    public void setScreenOrientation(RV0 view, String screenOrientation) {
        O90.m5968f(view, "view");
        view.setScreenOrientation(screenOrientation);
    }

    @Override // p000.InterfaceC9479gI0
    @InterfaceC9871jM0(name = "sheetAllowedDetents")
    public void setSheetAllowedDetents(RV0 view, ReadableArray value) {
        O90.m5968f(view, "view");
        view.getSheetDetents().clear();
        if (value == null || value.size() == 0) {
            view.getSheetDetents().add(Double.valueOf(1.0d));
            return;
        }
        C7319Ac1 c7319Ac1M18833l = AbstractC9639hY0.m18833l(AbstractC7167xu.m25992t(new C9205e90(0, value.size() - 1, 1)), new C10115lG0(3, value));
        Collection sheetDetents = view.getSheetDetents();
        O90.m5968f(sheetDetents, "destination");
        Iterator it = c7319Ac1M18833l.iterator();
        while (true) {
            C11948zc1 c11948zc1 = (C11948zc1) it;
            if (!c11948zc1.hasNext()) {
                return;
            } else {
                sheetDetents.add(c11948zc1.next());
            }
        }
    }

    @Override // p000.InterfaceC9479gI0
    @InterfaceC9871jM0(name = "sheetCornerRadius")
    public void setSheetCornerRadius(RV0 view, float value) {
        O90.m5968f(view, "view");
        view.setSheetCornerRadius(value);
    }

    @Override // p000.InterfaceC9479gI0
    @InterfaceC9871jM0(name = "sheetElevation")
    public void setSheetElevation(RV0 view, int value) {
        if (view == null) {
            return;
        }
        view.setSheetElevation(value);
    }

    @Override // p000.InterfaceC9479gI0
    @InterfaceC9871jM0(name = "sheetExpandsWhenScrolledToEdge")
    public void setSheetExpandsWhenScrolledToEdge(RV0 view, boolean value) {
        O90.m5968f(view, "view");
        view.setSheetExpandsWhenScrolledToEdge(value);
    }

    @Override // p000.InterfaceC9479gI0
    @InterfaceC9871jM0(name = "sheetGrabberVisible")
    public void setSheetGrabberVisible(RV0 view, boolean value) {
        O90.m5968f(view, "view");
        view.setSheetGrabberVisible(value);
    }

    @Override // p000.InterfaceC9479gI0
    @InterfaceC9871jM0(name = "sheetInitialDetent")
    public void setSheetInitialDetent(RV0 view, int value) {
        O90.m5968f(view, "view");
        view.setSheetInitialDetentIndex(value);
    }

    @Override // p000.InterfaceC9479gI0
    @InterfaceC9871jM0(name = "sheetLargestUndimmedDetent")
    public void setSheetLargestUndimmedDetent(RV0 view, int value) {
        O90.m5968f(view, "view");
        if (-1 > value || value >= 3) {
            throw new IllegalStateException("[RNScreens] sheetLargestUndimmedDetent on Android supports values between -1 and 2");
        }
        view.setSheetLargestUndimmedDetentIndex(value);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (r3.equals("default") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
    
        if (r3.equals("flip") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0082, code lost:
    
        if (r3.equals("simple_push") != false) goto L42;
     */
    @Override // p000.InterfaceC9479gI0
    @p000.InterfaceC9871jM0(name = "stackAnimation")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setStackAnimation(p000.RV0 r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "view"
            p000.O90.m5968f(r2, r0)
            if (r3 == 0) goto L91
            int r0 = r3.hashCode()
            switch(r0) {
                case -1418955385: goto L7c;
                case -1198710326: goto L71;
                case -427095442: goto L66;
                case -349395819: goto L5b;
                case 3135100: goto L50;
                case 3145837: goto L47;
                case 3387192: goto L3c;
                case 182437661: goto L31;
                case 1500346553: goto L26;
                case 1544803905: goto L1c;
                case 1601504978: goto L10;
                default: goto Le;
            }
        Le:
            goto L85
        L10:
            java.lang.String r0 = "slide_from_bottom"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L85
            NV0 r3 = p000.NV0.f7829d
            goto L93
        L1c:
            java.lang.String r0 = "default"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L85
            goto L91
        L26:
            java.lang.String r0 = "ios_from_right"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L85
            NV0 r3 = p000.NV0.f7833h
            goto L93
        L31:
            java.lang.String r0 = "fade_from_bottom"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L85
            NV0 r3 = p000.NV0.f7832g
            goto L93
        L3c:
            java.lang.String r0 = "none"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L85
            NV0 r3 = p000.NV0.f7827b
            goto L93
        L47:
            java.lang.String r0 = "flip"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L85
            goto L91
        L50:
            java.lang.String r0 = "fade"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L85
            NV0 r3 = p000.NV0.f7828c
            goto L93
        L5b:
            java.lang.String r0 = "slide_from_right"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L85
            NV0 r3 = p000.NV0.f7830e
            goto L93
        L66:
            java.lang.String r0 = "slide_from_left"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L85
            NV0 r3 = p000.NV0.f7831f
            goto L93
        L71:
            java.lang.String r0 = "ios_from_left"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L85
            NV0 r3 = p000.NV0.f7834i
            goto L93
        L7c:
            java.lang.String r0 = "simple_push"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L85
            goto L91
        L85:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r2 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.String r0 = "Unknown animation type "
            java.lang.String r3 = r0.concat(r3)
            r2.<init>(r3)
            throw r2
        L91:
            NV0 r3 = p000.NV0.f7826a
        L93:
            r2.setStackAnimation(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.ScreenViewManager.setStackAnimation(RV0, java.lang.String):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r3.equals("fullScreenModal") != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        if (r3.equals("containedTransparentModal") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (r3.equals("containedModal") != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
    
        if (r3.equals("modal") != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
    
        r3 = p000.OV0.f8461b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
    
        if (r3.equals("transparentModal") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
    
        r3 = p000.OV0.f8462c;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // p000.InterfaceC9479gI0
    @p000.InterfaceC9871jM0(name = "stackPresentation")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setStackPresentation(p000.RV0 r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "view"
            p000.O90.m5968f(r2, r0)
            if (r3 == 0) goto L59
            int r0 = r3.hashCode()
            switch(r0) {
                case -76271493: goto L4b;
                case 3452698: goto L40;
                case 104069805: goto L35;
                case 438078970: goto L2c;
                case 955284238: goto L23;
                case 1171936146: goto L1a;
                case 1798290171: goto Lf;
                default: goto Le;
            }
        Le:
            goto L59
        Lf:
            java.lang.String r0 = "formSheet"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L59
            OV0 r3 = p000.OV0.f8463d
            goto L55
        L1a:
            java.lang.String r0 = "fullScreenModal"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L59
            goto L3d
        L23:
            java.lang.String r0 = "containedTransparentModal"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L59
            goto L53
        L2c:
            java.lang.String r0 = "containedModal"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L59
            goto L3d
        L35:
            java.lang.String r0 = "modal"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L59
        L3d:
            OV0 r3 = p000.OV0.f8461b
            goto L55
        L40:
            java.lang.String r0 = "push"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L59
            OV0 r3 = p000.OV0.f8460a
            goto L55
        L4b:
            java.lang.String r0 = "transparentModal"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L59
        L53:
            OV0 r3 = p000.OV0.f8462c
        L55:
            r2.setStackPresentation(r3)
            return
        L59:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r2 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.String r0 = "Unknown presentation type "
            java.lang.String r3 = p000.AbstractC7222ym.m26245v(r0, r3)
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.ScreenViewManager.setStackPresentation(RV0, java.lang.String):void");
    }

    @Override // p000.InterfaceC9479gI0
    @InterfaceC9871jM0(name = "statusBarAnimation")
    public void setStatusBarAnimation(RV0 view, String statusBarAnimation) {
        O90.m5968f(view, "view");
        view.setStatusBarAnimated(Boolean.valueOf((statusBarAnimation == null || LocalNotification.Importance.NONE.equals(statusBarAnimation)) ? false : true));
    }

    @Override // p000.InterfaceC9479gI0
    @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, name = "statusBarColor")
    public void setStatusBarColor(RV0 view, Integer statusBarColor) {
        O90.m5968f(view, "view");
        view.setStatusBarColor(statusBarColor);
    }

    @Override // p000.InterfaceC9479gI0
    @InterfaceC9871jM0(name = "statusBarHidden")
    public void setStatusBarHidden(RV0 view, boolean statusBarHidden) {
        O90.m5968f(view, "view");
        view.setStatusBarHidden(Boolean.valueOf(statusBarHidden));
    }

    @Override // p000.InterfaceC9479gI0
    @InterfaceC9871jM0(name = "statusBarStyle")
    public void setStatusBarStyle(RV0 view, String statusBarStyle) {
        O90.m5968f(view, "view");
        view.setStatusBarStyle(statusBarStyle);
    }

    @Override // p000.InterfaceC9479gI0
    @InterfaceC9871jM0(name = "statusBarTranslucent")
    public void setStatusBarTranslucent(RV0 view, boolean statusBarTranslucent) {
        O90.m5968f(view, "view");
        view.setStatusBarTranslucent(Boolean.valueOf(statusBarTranslucent));
    }

    @Override // p000.InterfaceC9479gI0
    public void setSwipeDirection(RV0 view, String value) {
    }

    @Override // p000.InterfaceC9479gI0
    public void setTransitionDuration(RV0 view, int value) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(RV0 view, NM0 props, G41 stateWrapper) {
        O90.m5968f(view, "view");
        return super.updateState((ScreenViewManager) view, props, stateWrapper);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(RV0 parent, View child, int index) {
        O90.m5968f(parent, "parent");
        O90.m5968f(child, "child");
        if (child instanceof VV0) {
            VV0 vv0 = (VV0) child;
            vv0.setDelegate$react_native_screens_release(parent);
            parent.f10220b = new WeakReference(vv0);
        } else if (child instanceof C9251eW0) {
            parent.setFooter((C9251eW0) child);
        }
        super.addView((ScreenViewManager) parent, child, index);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(RV0 parent, int index) {
        O90.m5968f(parent, "parent");
        if (parent.getChildAt(index) instanceof C9251eW0) {
            parent.setFooter(null);
        }
        super.removeViewAt((ScreenViewManager) parent, index);
    }

    @InterfaceC9871jM0(name = "activityState")
    public final void setActivityState(RV0 view, int activityState) {
        O90.m5968f(view, "view");
        if (activityState == -1) {
            return;
        }
        if (activityState == 0) {
            view.setActivityState(LV0.f6675a);
        } else if (activityState == 1) {
            view.setActivityState(LV0.f6676b);
        } else {
            if (activityState != 2) {
                return;
            }
            view.setActivityState(LV0.f6677c);
        }
    }
}
