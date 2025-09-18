package p000;

import com.facebook.react.bridge.Dynamic;
import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;
import com.swmansion.reanimated.layoutReanimation.Snapshot;

/* renamed from: lh0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10169lh0 extends EM0 {

    /* renamed from: y */
    public final C10041kh0 f37250y = new C10041kh0();

    /* renamed from: I */
    public final int m22531I(int i) {
        S91 s91 = this.f2652d;
        UN1.m7999c(s91);
        if (!s91.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean("RCTI18nUtil_makeRTLFlipLeftAndRightStyles", true)) {
            return i;
        }
        if (i == 0) {
            return 4;
        }
        if (i != 2) {
            return i;
        }
        return 5;
    }

    @InterfaceC9871jM0(name = "alignContent")
    public void setAlignContent(String str) {
        if (mo1653c()) {
        }
        if (str == null) {
            m2194w(2);
            return;
        }
        switch (str) {
            case "stretch":
                m2194w(5);
                break;
            case "baseline":
                m2194w(6);
                break;
            case "center":
                m2194w(3);
                break;
            case "flex-start":
                m2194w(2);
                break;
            case "auto":
                m2194w(1);
                break;
            case "space-between":
                m2194w(7);
                break;
            case "flex-end":
                m2194w(4);
                break;
            case "space-around":
                m2194w(8);
                break;
            case "space-evenly":
                m2194w(9);
                break;
            default:
                "invalid value for alignContent: ".concat(str);
                AbstractC3929dS.m17683p("ReactNative");
                m2194w(2);
                break;
        }
    }

    @InterfaceC9871jM0(name = "alignItems")
    public void setAlignItems(String str) {
        if (mo1653c()) {
        }
        if (str == null) {
            m2195x(5);
            return;
        }
        switch (str) {
            case "stretch":
                m2195x(5);
                break;
            case "baseline":
                m2195x(6);
                break;
            case "center":
                m2195x(3);
                break;
            case "flex-start":
                m2195x(2);
                break;
            case "auto":
                m2195x(1);
                break;
            case "space-between":
                m2195x(7);
                break;
            case "flex-end":
                m2195x(4);
                break;
            case "space-around":
                m2195x(8);
                break;
            default:
                "invalid value for alignItems: ".concat(str);
                AbstractC3929dS.m17683p("ReactNative");
                m2195x(5);
                break;
        }
    }

    @InterfaceC9871jM0(name = "alignSelf")
    public void setAlignSelf(String str) {
        if (mo1653c()) {
        }
        if (str == null) {
            m2196y(1);
            return;
        }
        switch (str) {
            case "stretch":
                m2196y(5);
                break;
            case "baseline":
                m2196y(6);
                break;
            case "center":
                m2196y(3);
                break;
            case "flex-start":
                m2196y(2);
                break;
            case "auto":
                m2196y(1);
                break;
            case "space-between":
                m2196y(7);
                break;
            case "flex-end":
                m2196y(4);
                break;
            case "space-around":
                m2196y(8);
                break;
            default:
                "invalid value for alignSelf: ".concat(str);
                AbstractC3929dS.m17683p("ReactNative");
                m2196y(1);
                break;
        }
    }

    @InterfaceC9871jM0(defaultFloat = Float.NaN, name = "aspectRatio")
    public void setAspectRatio(float f) {
        YogaNative.jni_YGNodeStyleSetAspectRatioJNI(this.f2669u.f17997e, f);
    }

    @InterfaceC9999kM0(defaultFloat = Float.NaN, names = {"borderWidth", "borderStartWidth", "borderEndWidth", "borderTopWidth", "borderBottomWidth", "borderLeftWidth", "borderRightWidth"})
    public void setBorderWidths(int i, float f) {
        if (mo1653c()) {
            return;
        }
        int iM22531I = m22531I(AbstractC11074sl1.f42585a[i]);
        YogaNative.jni_YGNodeStyleSetBorderJNI(this.f2669u.f17997e, AbstractC7222ym.m26247x(F91.m2534q(iM22531I)), AbstractC11406vL1.m25403b(f));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    @p000.InterfaceC9871jM0(name = "columnGap")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setColumnGap(com.facebook.react.bridge.Dynamic r6) {
        /*
            r5 = this;
            boolean r0 = r5.mo1653c()
            if (r0 == 0) goto L7
            return
        L7:
            kh0 r0 = r5.f37250y
            r0.m22241a(r6)
            int r1 = r0.f36610b
            int r1 = p000.AbstractC7222ym.m26247x(r1)
            com.facebook.yoga.YogaNodeJNIBase r2 = r5.f2669u
            r3 = 0
            if (r1 == 0) goto L29
            r4 = 1
            if (r1 == r4) goto L29
            r4 = 2
            if (r1 == r4) goto L21
            r4 = 3
            if (r1 == r4) goto L29
            goto L30
        L21:
            float r0 = r0.f36609a
            long r1 = r2.f17997e
            com.facebook.yoga.YogaNative.jni_YGNodeStyleSetGapPercentJNI(r1, r3, r0)
            goto L30
        L29:
            float r0 = r0.f36609a
            long r1 = r2.f17997e
            com.facebook.yoga.YogaNative.jni_YGNodeStyleSetGapJNI(r1, r3, r0)
        L30:
            r6.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10169lh0.setColumnGap(com.facebook.react.bridge.Dynamic):void");
    }

    @InterfaceC9871jM0(name = "display")
    public void setDisplay(String str) {
        YogaNodeJNIBase yogaNodeJNIBase = this.f2669u;
        if (mo1653c()) {
            return;
        }
        if (str == null) {
            YogaNative.jni_YGNodeStyleSetDisplayJNI(yogaNodeJNIBase.f17997e, AbstractC7222ym.m26247x(1));
            return;
        }
        if (str.equals("flex")) {
            YogaNative.jni_YGNodeStyleSetDisplayJNI(yogaNodeJNIBase.f17997e, AbstractC7222ym.m26247x(1));
        } else {
            if (str.equals(LocalNotification.Importance.NONE)) {
                YogaNative.jni_YGNodeStyleSetDisplayJNI(yogaNodeJNIBase.f17997e, AbstractC7222ym.m26247x(2));
                return;
            }
            "invalid value for display: ".concat(str);
            AbstractC3929dS.m17683p("ReactNative");
            YogaNative.jni_YGNodeStyleSetDisplayJNI(yogaNodeJNIBase.f17997e, AbstractC7222ym.m26247x(1));
        }
    }

    @InterfaceC9871jM0(defaultFloat = 0.0f, name = "flex")
    public void setFlex(float f) {
        if (mo1653c()) {
            return;
        }
        YogaNative.jni_YGNodeStyleSetFlexJNI(this.f2669u.f17997e, f);
    }

    @InterfaceC9871jM0(name = "flexBasis")
    public void setFlexBasis(Dynamic dynamic) {
        if (mo1653c()) {
            return;
        }
        C10041kh0 c10041kh0 = this.f37250y;
        c10041kh0.m22241a(dynamic);
        int iM26247x = AbstractC7222ym.m26247x(c10041kh0.f36610b);
        YogaNodeJNIBase yogaNodeJNIBase = this.f2669u;
        if (iM26247x == 0 || iM26247x == 1) {
            YogaNative.jni_YGNodeStyleSetFlexBasisJNI(yogaNodeJNIBase.f17997e, c10041kh0.f36609a);
        } else if (iM26247x == 2) {
            YogaNative.jni_YGNodeStyleSetFlexBasisPercentJNI(yogaNodeJNIBase.f17997e, c10041kh0.f36609a);
        } else if (iM26247x == 3) {
            YogaNative.jni_YGNodeStyleSetFlexBasisAutoJNI(yogaNodeJNIBase.f17997e);
        }
        dynamic.recycle();
    }

    @InterfaceC9871jM0(name = "flexDirection")
    public void setFlexDirection(String str) {
        if (mo1653c()) {
        }
        if (str == null) {
            m2197z(1);
            return;
        }
        switch (str) {
            case "row-reverse":
                m2197z(4);
                break;
            case "column":
                m2197z(1);
                break;
            case "row":
                m2197z(3);
                break;
            case "column-reverse":
                m2197z(2);
                break;
            default:
                "invalid value for flexDirection: ".concat(str);
                AbstractC3929dS.m17683p("ReactNative");
                m2197z(1);
                break;
        }
    }

    @InterfaceC9871jM0(defaultFloat = 0.0f, name = "flexGrow")
    public void setFlexGrow(float f) {
        if (mo1653c()) {
            return;
        }
        YogaNative.jni_YGNodeStyleSetFlexGrowJNI(this.f2669u.f17997e, f);
    }

    @InterfaceC9871jM0(defaultFloat = 0.0f, name = "flexShrink")
    public void setFlexShrink(float f) {
        if (mo1653c()) {
            return;
        }
        YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(this.f2669u.f17997e, f);
    }

    @InterfaceC9871jM0(name = "flexWrap")
    public void setFlexWrap(String str) {
        YogaNodeJNIBase yogaNodeJNIBase = this.f2669u;
        if (mo1653c()) {
        }
        if (str == null) {
            YogaNative.jni_YGNodeStyleSetFlexWrapJNI(yogaNodeJNIBase.f17997e, AbstractC7222ym.m26247x(1));
            return;
        }
        switch (str) {
            case "nowrap":
                YogaNative.jni_YGNodeStyleSetFlexWrapJNI(yogaNodeJNIBase.f17997e, AbstractC7222ym.m26247x(1));
                break;
            case "wrap-reverse":
                YogaNative.jni_YGNodeStyleSetFlexWrapJNI(yogaNodeJNIBase.f17997e, AbstractC7222ym.m26247x(3));
                break;
            case "wrap":
                YogaNative.jni_YGNodeStyleSetFlexWrapJNI(yogaNodeJNIBase.f17997e, AbstractC7222ym.m26247x(2));
                break;
            default:
                "invalid value for flexWrap: ".concat(str);
                AbstractC3929dS.m17683p("ReactNative");
                YogaNative.jni_YGNodeStyleSetFlexWrapJNI(yogaNodeJNIBase.f17997e, AbstractC7222ym.m26247x(1));
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    @p000.InterfaceC9871jM0(name = "gap")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setGap(com.facebook.react.bridge.Dynamic r6) {
        /*
            r5 = this;
            boolean r0 = r5.mo1653c()
            if (r0 == 0) goto L7
            return
        L7:
            kh0 r0 = r5.f37250y
            r0.m22241a(r6)
            int r1 = r0.f36610b
            int r1 = p000.AbstractC7222ym.m26247x(r1)
            com.facebook.yoga.YogaNodeJNIBase r2 = r5.f2669u
            r3 = 2
            if (r1 == 0) goto L28
            r4 = 1
            if (r1 == r4) goto L28
            if (r1 == r3) goto L20
            r4 = 3
            if (r1 == r4) goto L28
            goto L2f
        L20:
            float r0 = r0.f36609a
            long r1 = r2.f17997e
            com.facebook.yoga.YogaNative.jni_YGNodeStyleSetGapJNI(r1, r3, r0)
            goto L2f
        L28:
            float r0 = r0.f36609a
            long r1 = r2.f17997e
            com.facebook.yoga.YogaNative.jni_YGNodeStyleSetGapJNI(r1, r3, r0)
        L2f:
            r6.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10169lh0.setGap(com.facebook.react.bridge.Dynamic):void");
    }

    @InterfaceC9871jM0(name = Snapshot.HEIGHT)
    public void setHeight(Dynamic dynamic) {
        if (mo1653c()) {
            return;
        }
        C10041kh0 c10041kh0 = this.f37250y;
        c10041kh0.m22241a(dynamic);
        int iM26247x = AbstractC7222ym.m26247x(c10041kh0.f36610b);
        if (iM26247x == 0 || iM26247x == 1) {
            YogaNative.jni_YGNodeStyleSetHeightJNI(this.f2669u.f17997e, c10041kh0.f36609a);
        } else {
            YogaNodeJNIBase yogaNodeJNIBase = this.f2669u;
            if (iM26247x == 2) {
                YogaNative.jni_YGNodeStyleSetHeightPercentJNI(yogaNodeJNIBase.f17997e, c10041kh0.f36609a);
            } else if (iM26247x == 3) {
                YogaNative.jni_YGNodeStyleSetHeightAutoJNI(yogaNodeJNIBase.f17997e);
            }
        }
        dynamic.recycle();
    }

    @InterfaceC9871jM0(name = "justifyContent")
    public void setJustifyContent(String str) {
        if (mo1653c()) {
        }
        if (str == null) {
            m2171B(1);
            return;
        }
        switch (str) {
            case "center":
                m2171B(2);
                break;
            case "flex-start":
                m2171B(1);
                break;
            case "space-between":
                m2171B(4);
                break;
            case "flex-end":
                m2171B(3);
                break;
            case "space-around":
                m2171B(5);
                break;
            case "space-evenly":
                m2171B(6);
                break;
            default:
                "invalid value for justifyContent: ".concat(str);
                AbstractC3929dS.m17683p("ReactNative");
                m2171B(1);
                break;
        }
    }

    @InterfaceC9999kM0(names = {"margin", "marginVertical", "marginHorizontal", "marginStart", "marginEnd", "marginTop", "marginBottom", "marginLeft", "marginRight"})
    public void setMargins(int i, Dynamic dynamic) {
        if (mo1653c()) {
            return;
        }
        int iM22531I = m22531I(AbstractC11074sl1.f42586b[i]);
        C10041kh0 c10041kh0 = this.f37250y;
        c10041kh0.m22241a(dynamic);
        int iM26247x = AbstractC7222ym.m26247x(c10041kh0.f36610b);
        if (iM26247x == 0 || iM26247x == 1) {
            m2172C(c10041kh0.f36609a, iM22531I);
        } else {
            YogaNodeJNIBase yogaNodeJNIBase = this.f2669u;
            if (iM26247x == 2) {
                YogaNative.jni_YGNodeStyleSetMarginPercentJNI(yogaNodeJNIBase.f17997e, AbstractC7222ym.m26247x(F91.m2534q(iM22531I)), c10041kh0.f36609a);
            } else if (iM26247x == 3) {
                YogaNative.jni_YGNodeStyleSetMarginAutoJNI(yogaNodeJNIBase.f17997e, AbstractC7222ym.m26247x(F91.m2534q(iM22531I)));
            }
        }
        dynamic.recycle();
    }

    @InterfaceC9871jM0(name = "maxHeight")
    public void setMaxHeight(Dynamic dynamic) {
        if (mo1653c()) {
            return;
        }
        C10041kh0 c10041kh0 = this.f37250y;
        c10041kh0.m22241a(dynamic);
        int iM26247x = AbstractC7222ym.m26247x(c10041kh0.f36610b);
        YogaNodeJNIBase yogaNodeJNIBase = this.f2669u;
        if (iM26247x == 0 || iM26247x == 1) {
            YogaNative.jni_YGNodeStyleSetMaxHeightJNI(yogaNodeJNIBase.f17997e, c10041kh0.f36609a);
        } else if (iM26247x == 2) {
            YogaNative.jni_YGNodeStyleSetMaxHeightPercentJNI(yogaNodeJNIBase.f17997e, c10041kh0.f36609a);
        }
        dynamic.recycle();
    }

    @InterfaceC9871jM0(name = "maxWidth")
    public void setMaxWidth(Dynamic dynamic) {
        if (mo1653c()) {
            return;
        }
        C10041kh0 c10041kh0 = this.f37250y;
        c10041kh0.m22241a(dynamic);
        int iM26247x = AbstractC7222ym.m26247x(c10041kh0.f36610b);
        YogaNodeJNIBase yogaNodeJNIBase = this.f2669u;
        if (iM26247x == 0 || iM26247x == 1) {
            YogaNative.jni_YGNodeStyleSetMaxWidthJNI(yogaNodeJNIBase.f17997e, c10041kh0.f36609a);
        } else if (iM26247x == 2) {
            YogaNative.jni_YGNodeStyleSetMaxWidthPercentJNI(yogaNodeJNIBase.f17997e, c10041kh0.f36609a);
        }
        dynamic.recycle();
    }

    @InterfaceC9871jM0(name = "minHeight")
    public void setMinHeight(Dynamic dynamic) {
        if (mo1653c()) {
            return;
        }
        C10041kh0 c10041kh0 = this.f37250y;
        c10041kh0.m22241a(dynamic);
        int iM26247x = AbstractC7222ym.m26247x(c10041kh0.f36610b);
        YogaNodeJNIBase yogaNodeJNIBase = this.f2669u;
        if (iM26247x == 0 || iM26247x == 1) {
            YogaNative.jni_YGNodeStyleSetMinHeightJNI(yogaNodeJNIBase.f17997e, c10041kh0.f36609a);
        } else if (iM26247x == 2) {
            YogaNative.jni_YGNodeStyleSetMinHeightPercentJNI(yogaNodeJNIBase.f17997e, c10041kh0.f36609a);
        }
        dynamic.recycle();
    }

    @InterfaceC9871jM0(name = "minWidth")
    public void setMinWidth(Dynamic dynamic) {
        if (mo1653c()) {
            return;
        }
        C10041kh0 c10041kh0 = this.f37250y;
        c10041kh0.m22241a(dynamic);
        int iM26247x = AbstractC7222ym.m26247x(c10041kh0.f36610b);
        YogaNodeJNIBase yogaNodeJNIBase = this.f2669u;
        if (iM26247x == 0 || iM26247x == 1) {
            YogaNative.jni_YGNodeStyleSetMinWidthJNI(yogaNodeJNIBase.f17997e, c10041kh0.f36609a);
        } else if (iM26247x == 2) {
            YogaNative.jni_YGNodeStyleSetMinWidthPercentJNI(yogaNodeJNIBase.f17997e, c10041kh0.f36609a);
        }
        dynamic.recycle();
    }

    @InterfaceC9871jM0(name = "overflow")
    public void setOverflow(String str) {
        YogaNodeJNIBase yogaNodeJNIBase = this.f2669u;
        if (mo1653c()) {
        }
        if (str == null) {
            YogaNative.jni_YGNodeStyleSetOverflowJNI(yogaNodeJNIBase.f17997e, AbstractC7222ym.m26247x(1));
            return;
        }
        switch (str) {
            case "hidden":
                YogaNative.jni_YGNodeStyleSetOverflowJNI(yogaNodeJNIBase.f17997e, AbstractC7222ym.m26247x(2));
                break;
            case "scroll":
                YogaNative.jni_YGNodeStyleSetOverflowJNI(yogaNodeJNIBase.f17997e, AbstractC7222ym.m26247x(3));
                break;
            case "visible":
                YogaNative.jni_YGNodeStyleSetOverflowJNI(yogaNodeJNIBase.f17997e, AbstractC7222ym.m26247x(1));
                break;
            default:
                "invalid value for overflow: ".concat(str);
                AbstractC3929dS.m17683p("ReactNative");
                YogaNative.jni_YGNodeStyleSetOverflowJNI(yogaNodeJNIBase.f17997e, AbstractC7222ym.m26247x(1));
                break;
        }
    }

    @InterfaceC9999kM0(names = {"padding", "paddingVertical", "paddingHorizontal", "paddingStart", "paddingEnd", "paddingTop", "paddingBottom", "paddingLeft", "paddingRight"})
    public void setPaddings(int i, Dynamic dynamic) {
        if (mo1653c()) {
            return;
        }
        int iM22531I = m22531I(AbstractC11074sl1.f42586b[i]);
        C10041kh0 c10041kh0 = this.f37250y;
        c10041kh0.m22241a(dynamic);
        int iM26247x = AbstractC7222ym.m26247x(c10041kh0.f36610b);
        if (iM26247x == 0 || iM26247x == 1) {
            mo2174E(c10041kh0.f36609a, iM22531I);
        } else if (iM26247x == 2) {
            this.f2667s[iM22531I] = c10041kh0.f36609a;
            this.f2668t[iM22531I] = !AbstractC11619x12.m25735a(r0);
            m2176G();
        }
        dynamic.recycle();
    }

    @InterfaceC9871jM0(name = "position")
    public void setPosition(String str) {
        YogaNodeJNIBase yogaNodeJNIBase = this.f2669u;
        if (mo1653c()) {
            return;
        }
        if (str == null) {
            YogaNative.jni_YGNodeStyleSetPositionTypeJNI(yogaNodeJNIBase.f17997e, AbstractC7222ym.m26247x(2));
            return;
        }
        if (str.equals("relative")) {
            YogaNative.jni_YGNodeStyleSetPositionTypeJNI(yogaNodeJNIBase.f17997e, AbstractC7222ym.m26247x(2));
        } else {
            if (str.equals("absolute")) {
                YogaNative.jni_YGNodeStyleSetPositionTypeJNI(yogaNodeJNIBase.f17997e, AbstractC7222ym.m26247x(3));
                return;
            }
            "invalid value for position: ".concat(str);
            AbstractC3929dS.m17683p("ReactNative");
            YogaNative.jni_YGNodeStyleSetPositionTypeJNI(yogaNodeJNIBase.f17997e, AbstractC7222ym.m26247x(2));
        }
    }

    @InterfaceC9999kM0(names = {"start", "end", "left", "right", "top", "bottom"})
    public void setPositionValues(int i, Dynamic dynamic) {
        if (mo1653c()) {
            return;
        }
        int iM22531I = m22531I(new int[]{4, 5, 0, 2, 1, 3}[i]);
        C10041kh0 c10041kh0 = this.f37250y;
        c10041kh0.m22241a(dynamic);
        int iM26247x = AbstractC7222ym.m26247x(c10041kh0.f36610b);
        YogaNodeJNIBase yogaNodeJNIBase = this.f2669u;
        if (iM26247x == 0 || iM26247x == 1) {
            YogaNative.jni_YGNodeStyleSetPositionJNI(yogaNodeJNIBase.f17997e, AbstractC7222ym.m26247x(F91.m2534q(iM22531I)), c10041kh0.f36609a);
        } else if (iM26247x == 2) {
            YogaNative.jni_YGNodeStyleSetPositionPercentJNI(yogaNodeJNIBase.f17997e, AbstractC7222ym.m26247x(F91.m2534q(iM22531I)), c10041kh0.f36609a);
        }
        dynamic.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    @p000.InterfaceC9871jM0(name = "rowGap")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setRowGap(com.facebook.react.bridge.Dynamic r6) {
        /*
            r5 = this;
            boolean r0 = r5.mo1653c()
            if (r0 == 0) goto L7
            return
        L7:
            kh0 r0 = r5.f37250y
            r0.m22241a(r6)
            int r1 = r0.f36610b
            int r1 = p000.AbstractC7222ym.m26247x(r1)
            com.facebook.yoga.YogaNodeJNIBase r2 = r5.f2669u
            r3 = 1
            if (r1 == 0) goto L28
            if (r1 == r3) goto L28
            r4 = 2
            if (r1 == r4) goto L20
            r4 = 3
            if (r1 == r4) goto L28
            goto L2f
        L20:
            float r0 = r0.f36609a
            long r1 = r2.f17997e
            com.facebook.yoga.YogaNative.jni_YGNodeStyleSetGapPercentJNI(r1, r3, r0)
            goto L2f
        L28:
            float r0 = r0.f36609a
            long r1 = r2.f17997e
            com.facebook.yoga.YogaNative.jni_YGNodeStyleSetGapJNI(r1, r3, r0)
        L2f:
            r6.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10169lh0.setRowGap(com.facebook.react.bridge.Dynamic):void");
    }

    @InterfaceC9871jM0(name = "onLayout")
    public void setShouldNotifyOnLayout(boolean z) {
        this.f2653e = z;
    }

    @InterfaceC9871jM0(name = Snapshot.WIDTH)
    public void setWidth(Dynamic dynamic) {
        if (mo1653c()) {
            return;
        }
        C10041kh0 c10041kh0 = this.f37250y;
        c10041kh0.m22241a(dynamic);
        int iM26247x = AbstractC7222ym.m26247x(c10041kh0.f36610b);
        if (iM26247x == 0 || iM26247x == 1) {
            YogaNative.jni_YGNodeStyleSetWidthJNI(this.f2669u.f17997e, c10041kh0.f36609a);
        } else {
            YogaNodeJNIBase yogaNodeJNIBase = this.f2669u;
            if (iM26247x == 2) {
                YogaNative.jni_YGNodeStyleSetWidthPercentJNI(yogaNodeJNIBase.f17997e, c10041kh0.f36609a);
            } else if (iM26247x == 3) {
                YogaNative.jni_YGNodeStyleSetWidthAutoJNI(yogaNodeJNIBase.f17997e);
            }
        }
        dynamic.recycle();
    }

    @InterfaceC9871jM0(name = "collapsable")
    public void setCollapsable(boolean z) {
    }

    @InterfaceC9871jM0(name = "collapsableChildren")
    public void setCollapsableChildren(boolean z) {
    }

    @InterfaceC9871jM0(name = "inset")
    public void setInset(Dynamic dynamic) {
    }

    @InterfaceC9871jM0(name = "experimental_layoutConformance")
    public void setLayoutConformance(String str) {
    }

    @InterfaceC9871jM0(name = "onPointerEnter")
    public void setShouldNotifyPointerEnter(boolean z) {
    }

    @InterfaceC9871jM0(name = "onPointerLeave")
    public void setShouldNotifyPointerLeave(boolean z) {
    }

    @InterfaceC9871jM0(name = "onPointerMove")
    public void setShouldNotifyPointerMove(boolean z) {
    }

    @InterfaceC9999kM0(names = {"insetBlock", "insetBlockEnd", "insetBlockStart"})
    public void setInsetBlock(int i, Dynamic dynamic) {
    }

    @InterfaceC9999kM0(names = {"insetInline", "insetInlineEnd", "insetInlineStart"})
    public void setInsetInline(int i, Dynamic dynamic) {
    }

    @InterfaceC9999kM0(names = {"marginBlock", "marginBlockEnd", "marginBlockStart"})
    public void setMarginBlock(int i, Dynamic dynamic) {
    }

    @InterfaceC9999kM0(names = {"marginInline", "marginInlineEnd", "marginInlineStart"})
    public void setMarginInline(int i, Dynamic dynamic) {
    }

    @InterfaceC9999kM0(names = {"paddingBlock", "paddingBlockEnd", "paddingBlockStart"})
    public void setPaddingBlock(int i, Dynamic dynamic) {
    }

    @InterfaceC9999kM0(names = {"paddingInline", "paddingInlineEnd", "paddingInlineStart"})
    public void setPaddingInline(int i, Dynamic dynamic) {
    }
}
