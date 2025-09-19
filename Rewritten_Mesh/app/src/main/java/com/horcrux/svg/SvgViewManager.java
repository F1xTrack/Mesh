package com.horcrux.svg;

import android.graphics.Rect;
import android.util.SparseArray;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.views.view.C1932a;
import com.facebook.react.views.view.ReactViewManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.Objects;
import p000.AbstractC11406vL1;
import p000.AbstractC3929dS;
import p000.AbstractC9842j71;
import p000.C11780yI0;
import p000.II0;
import p000.InterfaceC7543Ek1;
import p000.InterfaceC9871jM0;
import p000.S91;
import p000.XB0;

/* loaded from: classes.dex */
class SvgViewManager extends ReactViewManager implements II0 {
    public static final String REACT_CLASS = "RNSVGSvgViewAndroid";
    private final InterfaceC7543Ek1 mDelegate = new C11780yI0(this, 8);
    private static final SparseArray<SvgView> mTagToSvgView = new SparseArray<>();
    private static final SparseArray<Runnable> mTagToRunnable = new SparseArray<>();

    public static SvgView getSvgViewByTag(int i) {
        return mTagToSvgView.get(i);
    }

    public static void runWhenViewIsAvailable(int i, Runnable runnable) {
        mTagToRunnable.put(i, runnable);
    }

    public static void setSvgView(int i, SvgView svgView) {
        mTagToSvgView.put(i, svgView);
        SparseArray<Runnable> sparseArray = mTagToRunnable;
        Runnable runnable = sparseArray.get(i);
        if (runnable != null) {
            runnable.run();
            sparseArray.delete(i);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public InterfaceC7543Ek1 getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, p000.J50
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public C1932a createViewInstance(S91 s91) {
        return new SvgView(s91);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(C1932a c1932a) {
        super.onDropViewInstance((SvgViewManager) c1932a);
        mTagToSvgView.remove(c1932a.getId());
    }

    @Override // p000.II0
    public void setAccessible(SvgView svgView, boolean z) {
        super.setAccessible((C1932a) svgView, z);
    }

    @Override // p000.II0
    @InterfaceC9871jM0(name = "align")
    public void setAlign(SvgView svgView, String str) {
        svgView.setAlign(str);
    }

    @Override // p000.II0
    public void setBackfaceVisibility(SvgView svgView, String str) {
        super.setBackfaceVisibility((C1932a) svgView, str);
    }

    @Override // p000.II0
    @InterfaceC9871jM0(name = "bbHeight")
    public void setBbHeight(SvgView svgView, Dynamic dynamic) {
        svgView.setBbHeight(dynamic);
    }

    @Override // p000.II0
    @InterfaceC9871jM0(name = "bbWidth")
    public void setBbWidth(SvgView svgView, Dynamic dynamic) {
        svgView.setBbWidth(dynamic);
    }

    @Override // p000.II0
    public void setBorderBlockColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 9, num);
    }

    @Override // p000.II0
    public void setBorderBlockEndColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 10, num);
    }

    @Override // p000.II0
    public void setBorderBlockStartColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 11, num);
    }

    @Override // p000.II0
    public void setBorderBottomColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 4, num);
    }

    @Override // p000.II0
    public void setBorderBottomEndRadius(SvgView svgView, Dynamic dynamic) throws NumberFormatException {
        super.setBorderRadius(svgView, 8, dynamic);
    }

    @Override // p000.II0
    public void setBorderBottomLeftRadius(SvgView svgView, Dynamic dynamic) throws NumberFormatException {
        super.setBorderRadius(svgView, 4, dynamic);
    }

    @Override // p000.II0
    public void setBorderBottomRightRadius(SvgView svgView, Dynamic dynamic) throws NumberFormatException {
        super.setBorderRadius(svgView, 3, dynamic);
    }

    @Override // p000.II0
    public void setBorderBottomStartRadius(SvgView svgView, Dynamic dynamic) throws NumberFormatException {
        super.setBorderRadius(svgView, 7, dynamic);
    }

    @Override // p000.II0
    public void setBorderColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 0, num);
    }

    @Override // p000.II0
    public void setBorderEndColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 6, num);
    }

    @Override // p000.II0
    public void setBorderEndEndRadius(SvgView svgView, Dynamic dynamic) throws NumberFormatException {
        super.setBorderRadius(svgView, 9, dynamic);
    }

    @Override // p000.II0
    public void setBorderEndStartRadius(SvgView svgView, Dynamic dynamic) throws NumberFormatException {
        super.setBorderRadius(svgView, 10, dynamic);
    }

    @Override // p000.II0
    public void setBorderLeftColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 1, num);
    }

    @Override // p000.II0
    public void setBorderRadius(SvgView svgView, Dynamic dynamic) throws NumberFormatException {
        super.setBorderRadius(svgView, 0, dynamic);
    }

    @Override // p000.II0
    public void setBorderRightColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 2, num);
    }

    @Override // p000.II0
    public void setBorderStartColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 5, num);
    }

    @Override // p000.II0
    public void setBorderStartEndRadius(SvgView svgView, Dynamic dynamic) throws NumberFormatException {
        super.setBorderRadius(svgView, 11, dynamic);
    }

    @Override // p000.II0
    public void setBorderStartStartRadius(SvgView svgView, Dynamic dynamic) throws NumberFormatException {
        super.setBorderRadius(svgView, 12, dynamic);
    }

    @Override // p000.II0
    public void setBorderStyle(SvgView svgView, String str) {
        super.setBorderStyle((C1932a) svgView, str);
    }

    @Override // p000.II0
    public void setBorderTopColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 3, num);
    }

    @Override // p000.II0
    public void setBorderTopEndRadius(SvgView svgView, Dynamic dynamic) throws NumberFormatException {
        super.setBorderRadius(svgView, 6, dynamic);
    }

    @Override // p000.II0
    public void setBorderTopLeftRadius(SvgView svgView, Dynamic dynamic) throws NumberFormatException {
        super.setBorderRadius(svgView, 1, dynamic);
    }

    @Override // p000.II0
    public void setBorderTopRightRadius(SvgView svgView, Dynamic dynamic) throws NumberFormatException {
        super.setBorderRadius(svgView, 2, dynamic);
    }

    @Override // p000.II0
    public void setBorderTopStartRadius(SvgView svgView, Dynamic dynamic) throws NumberFormatException {
        super.setBorderRadius(svgView, 5, dynamic);
    }

    @Override // p000.II0
    @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, name = "color")
    public void setColor(SvgView svgView, Integer num) {
        svgView.setCurrentColor(num);
    }

    @Override // p000.II0
    public void setFocusable(SvgView svgView, boolean z) {
        super.setFocusable((C1932a) svgView, z);
    }

    @Override // p000.II0
    public void setHasTVPreferredFocus(SvgView svgView, boolean z) {
        super.setTVPreferredFocus(svgView, z);
    }

    @Override // p000.II0
    public void setHitSlop(SvgView svgView, Dynamic dynamic) {
        int i = AbstractC9842j71.f34930a[dynamic.getType().ordinal()];
        if (i == 1) {
            ReadableMap readableMapAsMap = dynamic.asMap();
            svgView.setHitSlopRect(new Rect(readableMapAsMap.hasKey("left") ? (int) AbstractC11406vL1.m25403b((float) readableMapAsMap.getDouble("left")) : 0, readableMapAsMap.hasKey("top") ? (int) AbstractC11406vL1.m25403b((float) readableMapAsMap.getDouble("top")) : 0, readableMapAsMap.hasKey("right") ? (int) AbstractC11406vL1.m25403b((float) readableMapAsMap.getDouble("right")) : 0, readableMapAsMap.hasKey("bottom") ? (int) AbstractC11406vL1.m25403b((float) readableMapAsMap.getDouble("bottom")) : 0));
        } else if (i == 2) {
            int iM25403b = (int) AbstractC11406vL1.m25403b((float) dynamic.asDouble());
            svgView.setHitSlopRect(new Rect(iM25403b, iM25403b, iM25403b, iM25403b));
        } else {
            if (i != 3) {
                Objects.toString(dynamic.getType());
                AbstractC3929dS.m17683p("ReactNative");
            }
            svgView.setHitSlopRect(null);
        }
    }

    @Override // p000.II0
    @InterfaceC9871jM0(name = "meetOrSlice")
    public void setMeetOrSlice(SvgView svgView, int i) {
        svgView.setMeetOrSlice(i);
    }

    @Override // p000.II0
    @InterfaceC9871jM0(name = "minX")
    public void setMinX(SvgView svgView, float f) {
        svgView.setMinX(f);
    }

    @Override // p000.II0
    @InterfaceC9871jM0(name = "minY")
    public void setMinY(SvgView svgView, float f) {
        svgView.setMinY(f);
    }

    @Override // p000.II0
    public void setNativeBackgroundAndroid(SvgView svgView, ReadableMap readableMap) {
        super.setNativeBackground(svgView, readableMap);
    }

    @Override // p000.II0
    public void setNativeForegroundAndroid(SvgView svgView, ReadableMap readableMap) {
        super.setNativeForeground(svgView, readableMap);
    }

    @Override // p000.II0
    public void setNeedsOffscreenAlphaCompositing(SvgView svgView, boolean z) {
        super.setNeedsOffscreenAlphaCompositing((C1932a) svgView, z);
    }

    @Override // p000.II0
    public void setNextFocusDown(SvgView svgView, int i) {
        super.nextFocusDown(svgView, i);
    }

    @Override // p000.II0
    public void setNextFocusForward(SvgView svgView, int i) {
        super.nextFocusForward(svgView, i);
    }

    @Override // p000.II0
    public void setNextFocusLeft(SvgView svgView, int i) {
        super.nextFocusLeft(svgView, i);
    }

    @Override // p000.II0
    public void setNextFocusRight(SvgView svgView, int i) {
        super.nextFocusRight(svgView, i);
    }

    @Override // p000.II0
    public void setNextFocusUp(SvgView svgView, int i) {
        super.nextFocusUp(svgView, i);
    }

    @Override // p000.II0
    @InterfaceC9871jM0(name = "pointerEvents")
    public void setPointerEvents(SvgView svgView, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Class<? super Object> superclass = svgView.getClass().getSuperclass();
            if (superclass != null) {
                Method declaredMethod = superclass.getDeclaredMethod("setPointerEvents", XB0.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(svgView, XB0.valueOf(str.toUpperCase(Locale.US).replace("-", "_")));
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Override // p000.II0
    public void setRemoveClippedSubviews(SvgView svgView, boolean z) {
        super.setRemoveClippedSubviews((SvgViewManager) svgView, z);
    }

    @Override // p000.II0
    @InterfaceC9871jM0(name = "vbHeight")
    public void setVbHeight(SvgView svgView, float f) {
        svgView.setVbHeight(f);
    }

    @Override // p000.II0
    @InterfaceC9871jM0(name = "vbWidth")
    public void setVbWidth(SvgView svgView, float f) {
        svgView.setVbWidth(f);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void updateExtraData(C1932a c1932a, Object obj) {
        super.updateExtraData((SvgViewManager) c1932a, obj);
        c1932a.invalidate();
    }
}
