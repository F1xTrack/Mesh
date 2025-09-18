package com.facebook.react.views.view;

import android.graphics.Rect;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.Map;
import java.util.Objects;
import p000.AbstractC10889rJ0;
import p000.AbstractC11406vL1;
import p000.AbstractC11619x12;
import p000.AbstractC3929dS;
import p000.AbstractC9873jN0;
import p000.InterfaceC9101dL0;
import p000.InterfaceC9871jM0;
import p000.InterfaceC9999kM0;
import p000.S91;
import p000.ViewOnClickListenerC1822c2;
import p000.WJ0;
import p000.XB0;

@InterfaceC9101dL0(name = ReactViewManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactViewManager extends ReactClippingViewManager<C1932a> {
    private static final int CMD_HOTSPOT_UPDATE = 1;
    private static final int CMD_SET_PRESSED = 2;
    private static final String HOTSPOT_UPDATE_KEY = "hotspotUpdate";
    public static final String REACT_CLASS = "RCTView";
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3, 4, 5, 9, 10, 11};

    public ReactViewManager() {
        setupViewRecycling();
    }

    private void handleHotspotUpdate(C1932a c1932a, ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() != 2) {
            throw new JSApplicationIllegalArgumentException("Illegal number of arguments for 'updateHotspot' command");
        }
        c1932a.drawableHotspotChanged(AbstractC11406vL1.m25403b((float) readableArray.getDouble(0)), AbstractC11406vL1.m25403b((float) readableArray.getDouble(1)));
    }

    private void handleSetPressed(C1932a c1932a, ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() != 1) {
            throw new JSApplicationIllegalArgumentException("Illegal number of arguments for 'setPressed' command");
        }
        c1932a.setPressed(readableArray.getBoolean(0));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return AbstractC10889rJ0.m24257d(HOTSPOT_UPDATE_KEY, 1, "setPressed", 2);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @InterfaceC9871jM0(defaultInt = -1, name = "nextFocusDown")
    public void nextFocusDown(C1932a c1932a, int i) {
        c1932a.setNextFocusDownId(i);
    }

    @InterfaceC9871jM0(defaultInt = -1, name = "nextFocusForward")
    public void nextFocusForward(C1932a c1932a, int i) {
        c1932a.setNextFocusForwardId(i);
    }

    @InterfaceC9871jM0(defaultInt = -1, name = "nextFocusLeft")
    public void nextFocusLeft(C1932a c1932a, int i) {
        c1932a.setNextFocusLeftId(i);
    }

    @InterfaceC9871jM0(defaultInt = -1, name = "nextFocusRight")
    public void nextFocusRight(C1932a c1932a, int i) {
        c1932a.setNextFocusRightId(i);
    }

    @InterfaceC9871jM0(defaultInt = -1, name = "nextFocusUp")
    public void nextFocusUp(C1932a c1932a, int i) {
        c1932a.setNextFocusUpId(i);
    }

    @InterfaceC9871jM0(name = "accessible")
    public void setAccessible(C1932a c1932a, boolean z) {
        c1932a.setFocusable(z);
    }

    @InterfaceC9871jM0(name = "backfaceVisibility")
    public void setBackfaceVisibility(C1932a c1932a, String str) {
        c1932a.setBackfaceVisibility(str);
    }

    @InterfaceC9999kM0(customType = RemoteMessageAttributes.COLOR, names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor", "borderStartColor", "borderEndColor", "borderBlockColor", "borderBlockEndColor", "borderBlockStartColor"})
    public void setBorderColor(C1932a c1932a, int i, Integer num) {
        c1932a.setBorderColor(SPACING_TYPES[i], num == null ? Float.NaN : num.intValue() & 16777215, num != null ? num.intValue() >>> 24 : Float.NaN);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    @p000.InterfaceC9999kM0(names = {com.swmansion.reanimated.layoutReanimation.Snapshot.BORDER_RADIUS, com.swmansion.reanimated.layoutReanimation.Snapshot.BORDER_TOP_LEFT_RADIUS, com.swmansion.reanimated.layoutReanimation.Snapshot.BORDER_TOP_RIGHT_RADIUS, com.swmansion.reanimated.layoutReanimation.Snapshot.BORDER_BOTTOM_RIGHT_RADIUS, com.swmansion.reanimated.layoutReanimation.Snapshot.BORDER_BOTTOM_LEFT_RADIUS, "borderTopStartRadius", "borderTopEndRadius", "borderBottomStartRadius", "borderBottomEndRadius", "borderEndEndRadius", "borderEndStartRadius", "borderStartEndRadius", "borderStartStartRadius"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setBorderRadius(com.facebook.react.views.view.C1932a r8, int r9, com.facebook.react.bridge.Dynamic r10) throws java.lang.NumberFormatException {
        /*
            r7 = this;
            java.lang.String r0 = "dynamic"
            p000.O90.m5968f(r10, r0)
            com.facebook.react.bridge.ReadableType r0 = r10.getType()
            int[] r1 = p000.AbstractC11195ti0.f43223a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == r3) goto L64
            java.lang.String r4 = "ReactNative"
            if (r0 == r1) goto L26
            com.facebook.react.bridge.ReadableType r10 = r10.getType()
            java.util.Objects.toString(r10)
            p000.AbstractC3929dS.m17683p(r4)
        L24:
            r3 = r2
            goto L7b
        L26:
            java.lang.String r10 = r10.asString()
            java.lang.String r0 = "%"
            boolean r0 = p000.D51.m1550i(r10, r0)
            if (r0 == 0) goto L5b
            int r0 = r10.length()     // Catch: java.lang.NumberFormatException -> L52
            int r0 = r0 - r3
            r3 = 0
            java.lang.String r0 = r10.substring(r3, r0)     // Catch: java.lang.NumberFormatException -> L52
            java.lang.String r3 = "substring(...)"
            p000.O90.m5967e(r0, r3)     // Catch: java.lang.NumberFormatException -> L52
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L52
            r3 = 0
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 < 0) goto L24
            ui0 r3 = new ui0     // Catch: java.lang.NumberFormatException -> L52
            vi0 r5 = p000.EnumC11451vi0.f44500b     // Catch: java.lang.NumberFormatException -> L52
            r3.<init>(r0, r5)     // Catch: java.lang.NumberFormatException -> L52
            goto L7b
        L52:
            java.lang.String r0 = "Invalid percentage format: "
            r0.concat(r10)
            p000.AbstractC3929dS.m17683p(r4)
            goto L24
        L5b:
            java.lang.String r0 = "Invalid string value: "
            r0.concat(r10)
            p000.AbstractC3929dS.m17683p(r4)
            goto L24
        L64:
            double r3 = r10.asDouble()
            r5 = 0
            int r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r10 < 0) goto L24
            ui0 r10 = new ui0
            float r0 = (float) r3
            float r0 = p000.AbstractC11406vL1.m25403b(r0)
            vi0 r3 = p000.EnumC11451vi0.f44499a
            r10.<init>(r0, r3)
            r3 = r10
        L7b:
            java.lang.String r10 = "view"
            p000.O90.m5968f(r8, r10)
            int r10 = r8.getId()
            int r10 = p000.R02.m6874b(r10)
            if (r10 == r1) goto L93
            if (r3 == 0) goto L93
            vi0 r10 = p000.EnumC11451vi0.f44500b
            vi0 r0 = r3.f43799b
            if (r0 != r10) goto L93
            goto L94
        L93:
            r2 = r3
        L94:
            Ki[] r10 = p000.EnumC0675Ki.values()
            r9 = r10[r9]
            r8.setBorderRadius(r9, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.view.ReactViewManager.setBorderRadius(com.facebook.react.views.view.a, int, com.facebook.react.bridge.Dynamic):void");
    }

    @InterfaceC9871jM0(name = "borderStyle")
    public void setBorderStyle(C1932a c1932a, String str) {
        c1932a.setBorderStyle(str);
    }

    @InterfaceC9999kM0(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth", "borderStartWidth", "borderEndWidth"})
    public void setBorderWidth(C1932a c1932a, int i, float f) {
        if (!AbstractC11619x12.m25735a(f) && f < 0.0f) {
            f = Float.NaN;
        }
        if (!AbstractC11619x12.m25735a(f)) {
            f = AbstractC11406vL1.m25403b(f);
        }
        c1932a.setBorderWidth(SPACING_TYPES[i], f);
    }

    @InterfaceC9871jM0(name = "collapsable")
    public void setCollapsable(C1932a c1932a, boolean z) {
    }

    @InterfaceC9871jM0(name = "collapsableChildren")
    public void setCollapsableChildren(C1932a c1932a, boolean z) {
    }

    @InterfaceC9871jM0(name = "focusable")
    public void setFocusable(C1932a c1932a, boolean z) {
        if (z) {
            c1932a.setOnClickListener(new ViewOnClickListenerC1822c2(3, c1932a));
            c1932a.setFocusable(true);
        } else {
            c1932a.setOnClickListener(null);
            c1932a.setClickable(false);
        }
    }

    @InterfaceC9871jM0(name = "hitSlop")
    public void setHitSlop(C1932a c1932a, Dynamic dynamic) {
        int i = AbstractC9873jN0.f35104a[dynamic.getType().ordinal()];
        if (i == 1) {
            ReadableMap readableMapAsMap = dynamic.asMap();
            c1932a.setHitSlopRect(new Rect(readableMapAsMap.hasKey("left") ? (int) AbstractC11406vL1.m25403b((float) readableMapAsMap.getDouble("left")) : 0, readableMapAsMap.hasKey("top") ? (int) AbstractC11406vL1.m25403b((float) readableMapAsMap.getDouble("top")) : 0, readableMapAsMap.hasKey("right") ? (int) AbstractC11406vL1.m25403b((float) readableMapAsMap.getDouble("right")) : 0, readableMapAsMap.hasKey("bottom") ? (int) AbstractC11406vL1.m25403b((float) readableMapAsMap.getDouble("bottom")) : 0));
        } else if (i == 2) {
            int iM25403b = (int) AbstractC11406vL1.m25403b((float) dynamic.asDouble());
            c1932a.setHitSlopRect(new Rect(iM25403b, iM25403b, iM25403b, iM25403b));
        } else {
            if (i != 3) {
                Objects.toString(dynamic.getType());
                AbstractC3929dS.m17683p("ReactNative");
            }
            c1932a.setHitSlopRect(null);
        }
    }

    @InterfaceC9871jM0(name = "nativeBackgroundAndroid")
    public void setNativeBackground(C1932a c1932a, ReadableMap readableMap) {
        c1932a.setTranslucentBackgroundDrawable(readableMap == null ? null : WJ0.m8747a(c1932a.getContext(), readableMap));
    }

    @InterfaceC9871jM0(name = "nativeForegroundAndroid")
    public void setNativeForeground(C1932a c1932a, ReadableMap readableMap) {
        c1932a.setForeground(readableMap == null ? null : WJ0.m8747a(c1932a.getContext(), readableMap));
    }

    @InterfaceC9871jM0(name = "needsOffscreenAlphaCompositing")
    public void setNeedsOffscreenAlphaCompositing(C1932a c1932a, boolean z) {
        c1932a.setNeedsOffscreenAlphaCompositing(z);
    }

    @InterfaceC9871jM0(name = "overflow")
    public void setOverflow(C1932a c1932a, String str) {
        c1932a.setOverflow(str);
    }

    @InterfaceC9871jM0(name = "pointerEvents")
    public void setPointerEvents(C1932a c1932a, String str) {
        c1932a.setPointerEvents(XB0.m8951c(str));
    }

    @InterfaceC9871jM0(name = "hasTVPreferredFocus")
    public void setTVPreferredFocus(C1932a c1932a, boolean z) {
        if (z) {
            c1932a.setFocusable(true);
            c1932a.setFocusableInTouchMode(true);
            c1932a.requestFocus();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C1932a createViewInstance(S91 s91) {
        return new C1932a(s91);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public C1932a prepareToRecycleView(S91 s91, C1932a c1932a) {
        super.prepareToRecycleView(s91, (S91) c1932a);
        c1932a.recycleView();
        return c1932a;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, p000.InterfaceC0798Mg
    public void setOpacity(C1932a c1932a, float f) {
        c1932a.setOpacityIfPossible(f);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public void setTransformProperty(C1932a c1932a, ReadableArray readableArray, ReadableArray readableArray2) {
        super.setTransformProperty((ReactViewManager) c1932a, readableArray, readableArray2);
        c1932a.setBackfaceVisibilityDependantOpacity();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(C1932a c1932a, int i, ReadableArray readableArray) {
        if (i == 1) {
            handleHotspotUpdate(c1932a, readableArray);
        } else {
            if (i != 2) {
                return;
            }
            handleSetPressed(c1932a, readableArray);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(C1932a c1932a, String str, ReadableArray readableArray) {
        str.getClass();
        if (str.equals("setPressed")) {
            handleSetPressed(c1932a, readableArray);
        } else if (str.equals(HOTSPOT_UPDATE_KEY)) {
            handleHotspotUpdate(c1932a, readableArray);
        }
    }

    public void setBorderRadius(C1932a c1932a, int i, float f) throws NumberFormatException {
        setBorderRadius(c1932a, i, new DynamicFromObject(Float.valueOf(f)));
    }
}
