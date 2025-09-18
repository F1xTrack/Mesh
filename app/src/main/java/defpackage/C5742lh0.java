package defpackage;

import com.facebook.react.bridge.Dynamic;
import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;
import com.huawei.hms.rn.push.constants.LocalNotification;
import com.swmansion.reanimated.layoutReanimation.Snapshot;

/* renamed from: lh0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5742lh0 extends EM0 {
    public final C5551kh0 y = new C5551kh0();

    public final int I(int i) {
        S91 s91 = this.d;
        UN1.c(s91);
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

    @InterfaceC5297jM0(name = "alignContent")
    public void setAlignContent(String str) {
        if (c()) {
        }
        if (str == null) {
            w(2);
            return;
        }
        switch (str) {
            case "stretch":
                w(5);
                break;
            case "baseline":
                w(6);
                break;
            case "center":
                w(3);
                break;
            case "flex-start":
                w(2);
                break;
            case "auto":
                w(1);
                break;
            case "space-between":
                w(7);
                break;
            case "flex-end":
                w(4);
                break;
            case "space-around":
                w(8);
                break;
            case "space-evenly":
                w(9);
                break;
            default:
                "invalid value for alignContent: ".concat(str);
                AbstractC3393dS.p("ReactNative");
                w(2);
                break;
        }
    }

    @InterfaceC5297jM0(name = "alignItems")
    public void setAlignItems(String str) {
        if (c()) {
        }
        if (str == null) {
            x(5);
            return;
        }
        switch (str) {
            case "stretch":
                x(5);
                break;
            case "baseline":
                x(6);
                break;
            case "center":
                x(3);
                break;
            case "flex-start":
                x(2);
                break;
            case "auto":
                x(1);
                break;
            case "space-between":
                x(7);
                break;
            case "flex-end":
                x(4);
                break;
            case "space-around":
                x(8);
                break;
            default:
                "invalid value for alignItems: ".concat(str);
                AbstractC3393dS.p("ReactNative");
                x(5);
                break;
        }
    }

    @InterfaceC5297jM0(name = "alignSelf")
    public void setAlignSelf(String str) {
        if (c()) {
        }
        if (str == null) {
            y(1);
            return;
        }
        switch (str) {
            case "stretch":
                y(5);
                break;
            case "baseline":
                y(6);
                break;
            case "center":
                y(3);
                break;
            case "flex-start":
                y(2);
                break;
            case "auto":
                y(1);
                break;
            case "space-between":
                y(7);
                break;
            case "flex-end":
                y(4);
                break;
            case "space-around":
                y(8);
                break;
            default:
                "invalid value for alignSelf: ".concat(str);
                AbstractC3393dS.p("ReactNative");
                y(1);
                break;
        }
    }

    @InterfaceC5297jM0(defaultFloat = Float.NaN, name = "aspectRatio")
    public void setAspectRatio(float f) {
        YogaNative.jni_YGNodeStyleSetAspectRatioJNI(this.u.e, f);
    }

    @InterfaceC5488kM0(defaultFloat = Float.NaN, names = {"borderWidth", "borderStartWidth", "borderEndWidth", "borderTopWidth", "borderBottomWidth", "borderLeftWidth", "borderRightWidth"})
    public void setBorderWidths(int i, float f) {
        if (c()) {
            return;
        }
        int I = I(AbstractC7091sl1.a[i]);
        YogaNative.jni_YGNodeStyleSetBorderJNI(this.u.e, AbstractC8235ym.x(F91.q(I)), AbstractC7586vL1.b(f));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    @defpackage.InterfaceC5297jM0(name = "columnGap")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setColumnGap(com.facebook.react.bridge.Dynamic r6) {
        /*
            r5 = this;
            boolean r0 = r5.c()
            if (r0 == 0) goto L7
            return
        L7:
            kh0 r0 = r5.y
            r0.a(r6)
            int r1 = r0.b
            int r1 = defpackage.AbstractC8235ym.x(r1)
            com.facebook.yoga.YogaNodeJNIBase r2 = r5.u
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
            float r0 = r0.a
            long r1 = r2.e
            com.facebook.yoga.YogaNative.jni_YGNodeStyleSetGapPercentJNI(r1, r3, r0)
            goto L30
        L29:
            float r0 = r0.a
            long r1 = r2.e
            com.facebook.yoga.YogaNative.jni_YGNodeStyleSetGapJNI(r1, r3, r0)
        L30:
            r6.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5742lh0.setColumnGap(com.facebook.react.bridge.Dynamic):void");
    }

    @InterfaceC5297jM0(name = "display")
    public void setDisplay(String str) {
        YogaNodeJNIBase yogaNodeJNIBase = this.u;
        if (c()) {
            return;
        }
        if (str == null) {
            YogaNative.jni_YGNodeStyleSetDisplayJNI(yogaNodeJNIBase.e, AbstractC8235ym.x(1));
            return;
        }
        if (str.equals("flex")) {
            YogaNative.jni_YGNodeStyleSetDisplayJNI(yogaNodeJNIBase.e, AbstractC8235ym.x(1));
        } else {
            if (str.equals(LocalNotification.Importance.NONE)) {
                YogaNative.jni_YGNodeStyleSetDisplayJNI(yogaNodeJNIBase.e, AbstractC8235ym.x(2));
                return;
            }
            "invalid value for display: ".concat(str);
            AbstractC3393dS.p("ReactNative");
            YogaNative.jni_YGNodeStyleSetDisplayJNI(yogaNodeJNIBase.e, AbstractC8235ym.x(1));
        }
    }

    @InterfaceC5297jM0(defaultFloat = 0.0f, name = "flex")
    public void setFlex(float f) {
        if (c()) {
            return;
        }
        YogaNative.jni_YGNodeStyleSetFlexJNI(this.u.e, f);
    }

    @InterfaceC5297jM0(name = "flexBasis")
    public void setFlexBasis(Dynamic dynamic) {
        if (c()) {
            return;
        }
        C5551kh0 c5551kh0 = this.y;
        c5551kh0.a(dynamic);
        int iX = AbstractC8235ym.x(c5551kh0.b);
        YogaNodeJNIBase yogaNodeJNIBase = this.u;
        if (iX == 0 || iX == 1) {
            YogaNative.jni_YGNodeStyleSetFlexBasisJNI(yogaNodeJNIBase.e, c5551kh0.a);
        } else if (iX == 2) {
            YogaNative.jni_YGNodeStyleSetFlexBasisPercentJNI(yogaNodeJNIBase.e, c5551kh0.a);
        } else if (iX == 3) {
            YogaNative.jni_YGNodeStyleSetFlexBasisAutoJNI(yogaNodeJNIBase.e);
        }
        dynamic.recycle();
    }

    @InterfaceC5297jM0(name = "flexDirection")
    public void setFlexDirection(String str) {
        if (c()) {
        }
        if (str == null) {
            z(1);
            return;
        }
        switch (str) {
            case "row-reverse":
                z(4);
                break;
            case "column":
                z(1);
                break;
            case "row":
                z(3);
                break;
            case "column-reverse":
                z(2);
                break;
            default:
                "invalid value for flexDirection: ".concat(str);
                AbstractC3393dS.p("ReactNative");
                z(1);
                break;
        }
    }

    @InterfaceC5297jM0(defaultFloat = 0.0f, name = "flexGrow")
    public void setFlexGrow(float f) {
        if (c()) {
            return;
        }
        YogaNative.jni_YGNodeStyleSetFlexGrowJNI(this.u.e, f);
    }

    @InterfaceC5297jM0(defaultFloat = 0.0f, name = "flexShrink")
    public void setFlexShrink(float f) {
        if (c()) {
            return;
        }
        YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(this.u.e, f);
    }

    @InterfaceC5297jM0(name = "flexWrap")
    public void setFlexWrap(String str) {
        YogaNodeJNIBase yogaNodeJNIBase = this.u;
        if (c()) {
        }
        if (str == null) {
            YogaNative.jni_YGNodeStyleSetFlexWrapJNI(yogaNodeJNIBase.e, AbstractC8235ym.x(1));
            return;
        }
        switch (str) {
            case "nowrap":
                YogaNative.jni_YGNodeStyleSetFlexWrapJNI(yogaNodeJNIBase.e, AbstractC8235ym.x(1));
                break;
            case "wrap-reverse":
                YogaNative.jni_YGNodeStyleSetFlexWrapJNI(yogaNodeJNIBase.e, AbstractC8235ym.x(3));
                break;
            case "wrap":
                YogaNative.jni_YGNodeStyleSetFlexWrapJNI(yogaNodeJNIBase.e, AbstractC8235ym.x(2));
                break;
            default:
                "invalid value for flexWrap: ".concat(str);
                AbstractC3393dS.p("ReactNative");
                YogaNative.jni_YGNodeStyleSetFlexWrapJNI(yogaNodeJNIBase.e, AbstractC8235ym.x(1));
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    @defpackage.InterfaceC5297jM0(name = "gap")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setGap(com.facebook.react.bridge.Dynamic r6) {
        /*
            r5 = this;
            boolean r0 = r5.c()
            if (r0 == 0) goto L7
            return
        L7:
            kh0 r0 = r5.y
            r0.a(r6)
            int r1 = r0.b
            int r1 = defpackage.AbstractC8235ym.x(r1)
            com.facebook.yoga.YogaNodeJNIBase r2 = r5.u
            r3 = 2
            if (r1 == 0) goto L28
            r4 = 1
            if (r1 == r4) goto L28
            if (r1 == r3) goto L20
            r4 = 3
            if (r1 == r4) goto L28
            goto L2f
        L20:
            float r0 = r0.a
            long r1 = r2.e
            com.facebook.yoga.YogaNative.jni_YGNodeStyleSetGapJNI(r1, r3, r0)
            goto L2f
        L28:
            float r0 = r0.a
            long r1 = r2.e
            com.facebook.yoga.YogaNative.jni_YGNodeStyleSetGapJNI(r1, r3, r0)
        L2f:
            r6.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5742lh0.setGap(com.facebook.react.bridge.Dynamic):void");
    }

    @InterfaceC5297jM0(name = Snapshot.HEIGHT)
    public void setHeight(Dynamic dynamic) {
        if (c()) {
            return;
        }
        C5551kh0 c5551kh0 = this.y;
        c5551kh0.a(dynamic);
        int iX = AbstractC8235ym.x(c5551kh0.b);
        if (iX == 0 || iX == 1) {
            YogaNative.jni_YGNodeStyleSetHeightJNI(this.u.e, c5551kh0.a);
        } else {
            YogaNodeJNIBase yogaNodeJNIBase = this.u;
            if (iX == 2) {
                YogaNative.jni_YGNodeStyleSetHeightPercentJNI(yogaNodeJNIBase.e, c5551kh0.a);
            } else if (iX == 3) {
                YogaNative.jni_YGNodeStyleSetHeightAutoJNI(yogaNodeJNIBase.e);
            }
        }
        dynamic.recycle();
    }

    @InterfaceC5297jM0(name = "justifyContent")
    public void setJustifyContent(String str) {
        if (c()) {
        }
        if (str == null) {
            B(1);
            return;
        }
        switch (str) {
            case "center":
                B(2);
                break;
            case "flex-start":
                B(1);
                break;
            case "space-between":
                B(4);
                break;
            case "flex-end":
                B(3);
                break;
            case "space-around":
                B(5);
                break;
            case "space-evenly":
                B(6);
                break;
            default:
                "invalid value for justifyContent: ".concat(str);
                AbstractC3393dS.p("ReactNative");
                B(1);
                break;
        }
    }

    @InterfaceC5488kM0(names = {"margin", "marginVertical", "marginHorizontal", "marginStart", "marginEnd", "marginTop", "marginBottom", "marginLeft", "marginRight"})
    public void setMargins(int i, Dynamic dynamic) {
        if (c()) {
            return;
        }
        int I = I(AbstractC7091sl1.b[i]);
        C5551kh0 c5551kh0 = this.y;
        c5551kh0.a(dynamic);
        int iX = AbstractC8235ym.x(c5551kh0.b);
        if (iX == 0 || iX == 1) {
            C(c5551kh0.a, I);
        } else {
            YogaNodeJNIBase yogaNodeJNIBase = this.u;
            if (iX == 2) {
                YogaNative.jni_YGNodeStyleSetMarginPercentJNI(yogaNodeJNIBase.e, AbstractC8235ym.x(F91.q(I)), c5551kh0.a);
            } else if (iX == 3) {
                YogaNative.jni_YGNodeStyleSetMarginAutoJNI(yogaNodeJNIBase.e, AbstractC8235ym.x(F91.q(I)));
            }
        }
        dynamic.recycle();
    }

    @InterfaceC5297jM0(name = "maxHeight")
    public void setMaxHeight(Dynamic dynamic) {
        if (c()) {
            return;
        }
        C5551kh0 c5551kh0 = this.y;
        c5551kh0.a(dynamic);
        int iX = AbstractC8235ym.x(c5551kh0.b);
        YogaNodeJNIBase yogaNodeJNIBase = this.u;
        if (iX == 0 || iX == 1) {
            YogaNative.jni_YGNodeStyleSetMaxHeightJNI(yogaNodeJNIBase.e, c5551kh0.a);
        } else if (iX == 2) {
            YogaNative.jni_YGNodeStyleSetMaxHeightPercentJNI(yogaNodeJNIBase.e, c5551kh0.a);
        }
        dynamic.recycle();
    }

    @InterfaceC5297jM0(name = "maxWidth")
    public void setMaxWidth(Dynamic dynamic) {
        if (c()) {
            return;
        }
        C5551kh0 c5551kh0 = this.y;
        c5551kh0.a(dynamic);
        int iX = AbstractC8235ym.x(c5551kh0.b);
        YogaNodeJNIBase yogaNodeJNIBase = this.u;
        if (iX == 0 || iX == 1) {
            YogaNative.jni_YGNodeStyleSetMaxWidthJNI(yogaNodeJNIBase.e, c5551kh0.a);
        } else if (iX == 2) {
            YogaNative.jni_YGNodeStyleSetMaxWidthPercentJNI(yogaNodeJNIBase.e, c5551kh0.a);
        }
        dynamic.recycle();
    }

    @InterfaceC5297jM0(name = "minHeight")
    public void setMinHeight(Dynamic dynamic) {
        if (c()) {
            return;
        }
        C5551kh0 c5551kh0 = this.y;
        c5551kh0.a(dynamic);
        int iX = AbstractC8235ym.x(c5551kh0.b);
        YogaNodeJNIBase yogaNodeJNIBase = this.u;
        if (iX == 0 || iX == 1) {
            YogaNative.jni_YGNodeStyleSetMinHeightJNI(yogaNodeJNIBase.e, c5551kh0.a);
        } else if (iX == 2) {
            YogaNative.jni_YGNodeStyleSetMinHeightPercentJNI(yogaNodeJNIBase.e, c5551kh0.a);
        }
        dynamic.recycle();
    }

    @InterfaceC5297jM0(name = "minWidth")
    public void setMinWidth(Dynamic dynamic) {
        if (c()) {
            return;
        }
        C5551kh0 c5551kh0 = this.y;
        c5551kh0.a(dynamic);
        int iX = AbstractC8235ym.x(c5551kh0.b);
        YogaNodeJNIBase yogaNodeJNIBase = this.u;
        if (iX == 0 || iX == 1) {
            YogaNative.jni_YGNodeStyleSetMinWidthJNI(yogaNodeJNIBase.e, c5551kh0.a);
        } else if (iX == 2) {
            YogaNative.jni_YGNodeStyleSetMinWidthPercentJNI(yogaNodeJNIBase.e, c5551kh0.a);
        }
        dynamic.recycle();
    }

    @InterfaceC5297jM0(name = "overflow")
    public void setOverflow(String str) {
        YogaNodeJNIBase yogaNodeJNIBase = this.u;
        if (c()) {
        }
        if (str == null) {
            YogaNative.jni_YGNodeStyleSetOverflowJNI(yogaNodeJNIBase.e, AbstractC8235ym.x(1));
            return;
        }
        switch (str) {
            case "hidden":
                YogaNative.jni_YGNodeStyleSetOverflowJNI(yogaNodeJNIBase.e, AbstractC8235ym.x(2));
                break;
            case "scroll":
                YogaNative.jni_YGNodeStyleSetOverflowJNI(yogaNodeJNIBase.e, AbstractC8235ym.x(3));
                break;
            case "visible":
                YogaNative.jni_YGNodeStyleSetOverflowJNI(yogaNodeJNIBase.e, AbstractC8235ym.x(1));
                break;
            default:
                "invalid value for overflow: ".concat(str);
                AbstractC3393dS.p("ReactNative");
                YogaNative.jni_YGNodeStyleSetOverflowJNI(yogaNodeJNIBase.e, AbstractC8235ym.x(1));
                break;
        }
    }

    @InterfaceC5488kM0(names = {"padding", "paddingVertical", "paddingHorizontal", "paddingStart", "paddingEnd", "paddingTop", "paddingBottom", "paddingLeft", "paddingRight"})
    public void setPaddings(int i, Dynamic dynamic) {
        if (c()) {
            return;
        }
        int I = I(AbstractC7091sl1.b[i]);
        C5551kh0 c5551kh0 = this.y;
        c5551kh0.a(dynamic);
        int iX = AbstractC8235ym.x(c5551kh0.b);
        if (iX == 0 || iX == 1) {
            E(c5551kh0.a, I);
        } else if (iX == 2) {
            this.s[I] = c5551kh0.a;
            this.t[I] = !AbstractC7905x12.a(r0);
            G();
        }
        dynamic.recycle();
    }

    @InterfaceC5297jM0(name = "position")
    public void setPosition(String str) {
        YogaNodeJNIBase yogaNodeJNIBase = this.u;
        if (c()) {
            return;
        }
        if (str == null) {
            YogaNative.jni_YGNodeStyleSetPositionTypeJNI(yogaNodeJNIBase.e, AbstractC8235ym.x(2));
            return;
        }
        if (str.equals("relative")) {
            YogaNative.jni_YGNodeStyleSetPositionTypeJNI(yogaNodeJNIBase.e, AbstractC8235ym.x(2));
        } else {
            if (str.equals("absolute")) {
                YogaNative.jni_YGNodeStyleSetPositionTypeJNI(yogaNodeJNIBase.e, AbstractC8235ym.x(3));
                return;
            }
            "invalid value for position: ".concat(str);
            AbstractC3393dS.p("ReactNative");
            YogaNative.jni_YGNodeStyleSetPositionTypeJNI(yogaNodeJNIBase.e, AbstractC8235ym.x(2));
        }
    }

    @InterfaceC5488kM0(names = {"start", "end", "left", "right", "top", "bottom"})
    public void setPositionValues(int i, Dynamic dynamic) {
        if (c()) {
            return;
        }
        int I = I(new int[]{4, 5, 0, 2, 1, 3}[i]);
        C5551kh0 c5551kh0 = this.y;
        c5551kh0.a(dynamic);
        int iX = AbstractC8235ym.x(c5551kh0.b);
        YogaNodeJNIBase yogaNodeJNIBase = this.u;
        if (iX == 0 || iX == 1) {
            YogaNative.jni_YGNodeStyleSetPositionJNI(yogaNodeJNIBase.e, AbstractC8235ym.x(F91.q(I)), c5551kh0.a);
        } else if (iX == 2) {
            YogaNative.jni_YGNodeStyleSetPositionPercentJNI(yogaNodeJNIBase.e, AbstractC8235ym.x(F91.q(I)), c5551kh0.a);
        }
        dynamic.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    @defpackage.InterfaceC5297jM0(name = "rowGap")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setRowGap(com.facebook.react.bridge.Dynamic r6) {
        /*
            r5 = this;
            boolean r0 = r5.c()
            if (r0 == 0) goto L7
            return
        L7:
            kh0 r0 = r5.y
            r0.a(r6)
            int r1 = r0.b
            int r1 = defpackage.AbstractC8235ym.x(r1)
            com.facebook.yoga.YogaNodeJNIBase r2 = r5.u
            r3 = 1
            if (r1 == 0) goto L28
            if (r1 == r3) goto L28
            r4 = 2
            if (r1 == r4) goto L20
            r4 = 3
            if (r1 == r4) goto L28
            goto L2f
        L20:
            float r0 = r0.a
            long r1 = r2.e
            com.facebook.yoga.YogaNative.jni_YGNodeStyleSetGapPercentJNI(r1, r3, r0)
            goto L2f
        L28:
            float r0 = r0.a
            long r1 = r2.e
            com.facebook.yoga.YogaNative.jni_YGNodeStyleSetGapJNI(r1, r3, r0)
        L2f:
            r6.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5742lh0.setRowGap(com.facebook.react.bridge.Dynamic):void");
    }

    @InterfaceC5297jM0(name = "onLayout")
    public void setShouldNotifyOnLayout(boolean z) {
        this.e = z;
    }

    @InterfaceC5297jM0(name = Snapshot.WIDTH)
    public void setWidth(Dynamic dynamic) {
        if (c()) {
            return;
        }
        C5551kh0 c5551kh0 = this.y;
        c5551kh0.a(dynamic);
        int iX = AbstractC8235ym.x(c5551kh0.b);
        if (iX == 0 || iX == 1) {
            YogaNative.jni_YGNodeStyleSetWidthJNI(this.u.e, c5551kh0.a);
        } else {
            YogaNodeJNIBase yogaNodeJNIBase = this.u;
            if (iX == 2) {
                YogaNative.jni_YGNodeStyleSetWidthPercentJNI(yogaNodeJNIBase.e, c5551kh0.a);
            } else if (iX == 3) {
                YogaNative.jni_YGNodeStyleSetWidthAutoJNI(yogaNodeJNIBase.e);
            }
        }
        dynamic.recycle();
    }

    @InterfaceC5297jM0(name = "collapsable")
    public void setCollapsable(boolean z) {
    }

    @InterfaceC5297jM0(name = "collapsableChildren")
    public void setCollapsableChildren(boolean z) {
    }

    @InterfaceC5297jM0(name = "inset")
    public void setInset(Dynamic dynamic) {
    }

    @InterfaceC5297jM0(name = "experimental_layoutConformance")
    public void setLayoutConformance(String str) {
    }

    @InterfaceC5297jM0(name = "onPointerEnter")
    public void setShouldNotifyPointerEnter(boolean z) {
    }

    @InterfaceC5297jM0(name = "onPointerLeave")
    public void setShouldNotifyPointerLeave(boolean z) {
    }

    @InterfaceC5297jM0(name = "onPointerMove")
    public void setShouldNotifyPointerMove(boolean z) {
    }

    @InterfaceC5488kM0(names = {"insetBlock", "insetBlockEnd", "insetBlockStart"})
    public void setInsetBlock(int i, Dynamic dynamic) {
    }

    @InterfaceC5488kM0(names = {"insetInline", "insetInlineEnd", "insetInlineStart"})
    public void setInsetInline(int i, Dynamic dynamic) {
    }

    @InterfaceC5488kM0(names = {"marginBlock", "marginBlockEnd", "marginBlockStart"})
    public void setMarginBlock(int i, Dynamic dynamic) {
    }

    @InterfaceC5488kM0(names = {"marginInline", "marginInlineEnd", "marginInlineStart"})
    public void setMarginInline(int i, Dynamic dynamic) {
    }

    @InterfaceC5488kM0(names = {"paddingBlock", "paddingBlockEnd", "paddingBlockStart"})
    public void setPaddingBlock(int i, Dynamic dynamic) {
    }

    @InterfaceC5488kM0(names = {"paddingInline", "paddingInlineEnd", "paddingInlineStart"})
    public void setPaddingInline(int i, Dynamic dynamic) {
    }
}
