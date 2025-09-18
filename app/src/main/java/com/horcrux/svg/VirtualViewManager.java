package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.ViewGroupManager;
import com.horcrux.svg.VirtualView;
import com.yandex.varioqub.config.model.ConfigValue;
import java.lang.reflect.Array;
import java.util.Locale;
import p000.AbstractC0852NX;
import p000.AbstractC10672pc1;
import p000.AbstractC11276uK1;
import p000.AbstractC11406vL1;
import p000.AbstractC8301Sz1;
import p000.B91;
import p000.C0596JS;
import p000.C0659KS;
import p000.C0721LS;
import p000.C0784MS;
import p000.C0847NS;
import p000.C10169lh0;
import p000.C11383vA0;
import p000.C11931zU0;
import p000.C6876tH;
import p000.C8169Ql1;
import p000.C8221Rl1;
import p000.InterfaceC7543Ek1;
import p000.InterfaceC9871jM0;
import p000.S91;
import p000.XB0;
import p000.XZ1;

/* loaded from: classes.dex */
class VirtualViewManager<V extends VirtualView> extends ViewGroupManager<VirtualView> {
    private static final float CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER = 5.0f;
    private static final double EPSILON = 1.0E-5d;
    private static final int PERSPECTIVE_ARRAY_INVERTED_CAMERA_DISTANCE_INDEX = 2;
    protected final String mClassName;
    protected InterfaceC7543Ek1 mDelegate;
    protected final SVGClass svgClass;
    private static final C8169Ql1 sMatrixDecompositionContext = new C8169Ql1();
    private static final double[] sTransformDecompositionArray = new double[16];
    private static final SparseArray<RenderableView> mTagToRenderableView = new SparseArray<>();
    private static final SparseArray<Runnable> mTagToRunnable = new SparseArray<>();

    public enum SVGClass {
        RNSVGGroup,
        RNSVGPath,
        RNSVGText,
        RNSVGTSpan,
        RNSVGTextPath,
        RNSVGImage,
        RNSVGCircle,
        RNSVGEllipse,
        RNSVGLine,
        RNSVGRect,
        RNSVGClipPath,
        RNSVGDefs,
        RNSVGUse,
        RNSVGSymbol,
        RNSVGLinearGradient,
        RNSVGRadialGradient,
        RNSVGPattern,
        RNSVGMask,
        RNSVGFilter,
        RNSVGFeBlend,
        RNSVGFeColorMatrix,
        RNSVGFeFlood,
        RNSVGFeGaussianBlur,
        RNSVGFeMerge,
        RNSVGFeOffset,
        RNSVGMarker,
        RNSVGForeignObject
    }

    public VirtualViewManager(SVGClass sVGClass) {
        this.svgClass = sVGClass;
        this.mClassName = sVGClass.toString();
    }

    private static void decomposeMatrix() {
        C8169Ql1 c8169Ql1 = sMatrixDecompositionContext;
        double[] dArr = c8169Ql1.f9762f;
        double[] dArr2 = c8169Ql1.f9763g;
        double[] dArr3 = c8169Ql1.f9764h;
        double[] dArr4 = c8169Ql1.f9765i;
        double[] dArr5 = c8169Ql1.f9766j;
        if (isZero(sTransformDecompositionArray[15])) {
            return;
        }
        double[][] dArr6 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, 4, 4);
        double[] dArr7 = new double[16];
        for (int i = 0; i < 4; i++) {
            for (int i2 = 0; i2 < 4; i2++) {
                double[] dArr8 = sTransformDecompositionArray;
                int i3 = (i * 4) + i2;
                double d = dArr8[i3] / dArr8[15];
                dArr6[i][i2] = d;
                if (i2 == 3) {
                    d = ConfigValue.DOUBLE_DEFAULT_VALUE;
                }
                dArr7[i3] = d;
            }
        }
        dArr7[15] = 1.0d;
        if (isZero(AbstractC8301Sz1.m7481d(dArr7))) {
            return;
        }
        if (isZero(dArr6[0][3]) && isZero(dArr6[1][3]) && isZero(dArr6[2][3])) {
            dArr[2] = 0.0d;
            dArr[1] = 0.0d;
            dArr[0] = 0.0d;
            dArr[3] = 1.0d;
        } else {
            AbstractC8301Sz1.m7488k(new double[]{dArr6[0][3], dArr6[1][3], dArr6[2][3], dArr6[3][3]}, AbstractC8301Sz1.m7496s(AbstractC8301Sz1.m7485h(dArr7)), dArr);
        }
        System.arraycopy(dArr6[3], 0, dArr4, 0, 3);
        double[][] dArr9 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, 3, 3);
        for (int i4 = 0; i4 < 3; i4++) {
            double[] dArr10 = dArr9[i4];
            double[] dArr11 = dArr6[i4];
            dArr10[0] = dArr11[0];
            dArr10[1] = dArr11[1];
            dArr10[2] = dArr11[2];
        }
        double dM7500w = AbstractC8301Sz1.m7500w(dArr9[0]);
        dArr2[0] = dM7500w;
        double[] dArrM7501x = AbstractC8301Sz1.m7501x(dM7500w, dArr9[0]);
        dArr9[0] = dArrM7501x;
        double dM7499v = AbstractC8301Sz1.m7499v(dArrM7501x, dArr9[1]);
        dArr3[0] = dM7499v;
        double[] dArrM7497t = AbstractC8301Sz1.m7497t(dArr9[1], dArr9[0], -dM7499v);
        dArr9[1] = dArrM7497t;
        double dM7499v2 = AbstractC8301Sz1.m7499v(dArr9[0], dArrM7497t);
        dArr3[0] = dM7499v2;
        double[] dArrM7497t2 = AbstractC8301Sz1.m7497t(dArr9[1], dArr9[0], -dM7499v2);
        dArr9[1] = dArrM7497t2;
        double dM7500w2 = AbstractC8301Sz1.m7500w(dArrM7497t2);
        dArr2[1] = dM7500w2;
        dArr9[1] = AbstractC8301Sz1.m7501x(dM7500w2, dArr9[1]);
        dArr3[0] = dArr3[0] / dArr2[1];
        double dM7499v3 = AbstractC8301Sz1.m7499v(dArr9[0], dArr9[2]);
        dArr3[1] = dM7499v3;
        double[] dArrM7497t3 = AbstractC8301Sz1.m7497t(dArr9[2], dArr9[0], -dM7499v3);
        dArr9[2] = dArrM7497t3;
        double dM7499v4 = AbstractC8301Sz1.m7499v(dArr9[1], dArrM7497t3);
        dArr3[2] = dM7499v4;
        double[] dArrM7497t4 = AbstractC8301Sz1.m7497t(dArr9[2], dArr9[1], -dM7499v4);
        dArr9[2] = dArrM7497t4;
        double dM7500w3 = AbstractC8301Sz1.m7500w(dArrM7497t4);
        dArr2[2] = dM7500w3;
        double[] dArrM7501x2 = AbstractC8301Sz1.m7501x(dM7500w3, dArr9[2]);
        dArr9[2] = dArrM7501x2;
        double d2 = dArr3[1];
        double d3 = dArr2[2];
        dArr3[1] = d2 / d3;
        dArr3[2] = dArr3[2] / d3;
        if (AbstractC8301Sz1.m7499v(dArr9[0], AbstractC8301Sz1.m7498u(dArr9[1], dArrM7501x2)) < ConfigValue.DOUBLE_DEFAULT_VALUE) {
            for (int i5 = 0; i5 < 3; i5++) {
                dArr2[i5] = dArr2[i5] * (-1.0d);
                double[] dArr12 = dArr9[i5];
                dArr12[0] = dArr12[0] * (-1.0d);
                dArr12[1] = dArr12[1] * (-1.0d);
                dArr12[2] = dArr12[2] * (-1.0d);
            }
        }
        double[] dArr13 = dArr9[2];
        dArr5[0] = AbstractC8301Sz1.m7493p((-Math.atan2(dArr13[1], dArr13[2])) * 57.29577951308232d);
        double[] dArr14 = dArr9[2];
        double d4 = -dArr14[0];
        double d5 = dArr14[1];
        double d6 = dArr14[2];
        dArr5[1] = AbstractC8301Sz1.m7493p((-Math.atan2(d4, Math.sqrt((d6 * d6) + (d5 * d5)))) * 57.29577951308232d);
        dArr5[2] = AbstractC8301Sz1.m7493p((-Math.atan2(dArr9[1][0], dArr9[0][0])) * 57.29577951308232d);
    }

    public static RenderableView getRenderableViewByTag(int i) {
        return mTagToRenderableView.get(i);
    }

    public void invalidateSvgView(V v) {
        SvgView svgView = v.getSvgView();
        if (svgView != null) {
            svgView.invalidate();
        }
        if (v instanceof C1983Y) {
            C1983Y c1983y = (C1983Y) v;
            ViewParent parent = c1983y.getParent();
            while (parent instanceof C1983Y) {
                c1983y = (C1983Y) parent;
                parent = c1983y.getParent();
            }
            c1983y.clearChildCache();
        }
    }

    private static boolean isZero(double d) {
        return !Double.isNaN(d) && Math.abs(d) < EPSILON;
    }

    private static void resetTransformProperty(View view) {
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setRotation(0.0f);
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setCameraDistance(0.0f);
    }

    public static void runWhenViewIsAvailable(int i, Runnable runnable) {
        mTagToRunnable.put(i, runnable);
    }

    public static void setRenderableView(int i, RenderableView renderableView) {
        mTagToRenderableView.put(i, renderableView);
        SparseArray<Runnable> sparseArray = mTagToRunnable;
        Runnable runnable = sparseArray.get(i);
        if (runnable != null) {
            runnable.run();
            sparseArray.delete(i);
        }
    }

    private static void setTransformProperty(View view, ReadableArray readableArray) {
        AbstractC10672pc1.m23823c(readableArray, sTransformDecompositionArray, 0.0f, 0.0f, null, false);
        decomposeMatrix();
        C8169Ql1 c8169Ql1 = sMatrixDecompositionContext;
        view.setTranslationX(AbstractC11406vL1.m25403b((float) c8169Ql1.f9765i[0]));
        view.setTranslationY(AbstractC11406vL1.m25403b((float) c8169Ql1.f9765i[1]));
        double[] dArr = c8169Ql1.f9766j;
        view.setRotation((float) dArr[2]);
        view.setRotationX((float) dArr[0]);
        view.setRotationY((float) dArr[1]);
        double[] dArr2 = c8169Ql1.f9763g;
        view.setScaleX((float) dArr2[0]);
        view.setScaleY((float) dArr2[1]);
        double[] dArr3 = c8169Ql1.f9762f;
        if (dArr3.length > 2) {
            float f = (float) dArr3[2];
            if (f == 0.0f) {
                f = 7.8125E-4f;
            }
            float f2 = (-1.0f) / f;
            float f3 = XZ1.m9087c().density;
            view.setCameraDistance(f3 * f3 * f2 * CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: getDelegate */
    public InterfaceC7543Ek1 getMDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return this.mClassName;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<? extends C10169lh0> getShadowNodeClass() {
        return C8221Rl1.class;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, p000.I50
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        AbstractC0852NX.m5754c(this, view);
    }

    @InterfaceC9871jM0(name = "clipPath")
    public void setClipPath(V v, String str) {
        v.setClipPath(str);
    }

    @InterfaceC9871jM0(name = "clipRule")
    public void setClipRule(V v, int i) {
        v.setClipRule(i);
    }

    @InterfaceC9871jM0(name = "display")
    public void setDisplay(V v, String str) {
        v.setDisplay(str);
    }

    @InterfaceC9871jM0(name = "markerEnd")
    public void setMarkerEnd(V v, String str) {
        v.setMarkerEnd(str);
    }

    @InterfaceC9871jM0(name = "markerMid")
    public void setMarkerMid(V v, String str) {
        v.setMarkerMid(str);
    }

    @InterfaceC9871jM0(name = "markerStart")
    public void setMarkerStart(V v, String str) {
        v.setMarkerStart(str);
    }

    @InterfaceC9871jM0(name = "mask")
    public void setMask(V v, String str) {
        v.setMask(str);
    }

    @InterfaceC9871jM0(name = "matrix")
    public void setMatrix(V v, Dynamic dynamic) {
        v.setMatrix(dynamic);
    }

    @InterfaceC9871jM0(name = "name")
    public void setName(V v, String str) {
        v.setName(str);
    }

    @InterfaceC9871jM0(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(V v, float f) {
        v.setOpacity(f);
    }

    @InterfaceC9871jM0(name = "pointerEvents")
    public void setPointerEvents(V v, String str) {
        if (str == null) {
            v.setPointerEvents(XB0.f13610e);
        } else {
            v.setPointerEvents(XB0.valueOf(str.toUpperCase(Locale.US).replace("-", "_")));
        }
    }

    @InterfaceC9871jM0(name = "responsible")
    public void setResponsible(V v, boolean z) {
        v.setResponsible(z);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(S91 s91, VirtualView virtualView) {
        super.addEventEmitters(s91, (S91) virtualView);
        virtualView.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC1986a0(this));
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public C10169lh0 createShadowNodeInstance() {
        return new C8221Rl1();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public VirtualView createViewInstance(S91 s91) {
        switch (AbstractC1988b0.f18585a[this.svgClass.ordinal()]) {
            case 1:
                return new C1993g(s91);
            case 2:
                C11383vA0 c11383vA0 = new C11383vA0(s91);
                AbstractC11276uK1.f43656d = c11383vA0.mScale;
                c11383vA0.f44219a = new Path();
                return c11383vA0;
            case 3:
                return new C1985a(s91);
            case 4:
                return new C1989c(s91);
            case 5:
                return new C1996j(s91);
            case 6:
                return new C2002p(s91);
            case 7:
                return new C1983Y(s91);
            case 8:
                return new C1982X(s91);
            case 9:
                return new B91(s91);
            case 10:
                return new C1995i(s91);
            case 11:
                return new C1987b(s91);
            case 12:
                return new C6876tH(s91);
            case 13:
                return new C1984Z(s91);
            case 14:
                return new C1981W(s91);
            case 15:
                C1997k c1997k = new C1997k(s91);
                c1997k.f18629g = null;
                return c1997k;
            case 16:
                C2001o c2001o = new C2001o(s91);
                c2001o.f18672i = null;
                return c2001o;
            case 17:
                C2000n c2000n = new C2000n(s91);
                c2000n.f18662r = null;
                return c2000n;
            case 18:
                return new C1999m(s91);
            case 19:
                return new C1991e(s91);
            case 20:
                C0596JS c0596js = new C0596JS(s91);
                C11931zU0 c11931zU0 = new C11931zU0(ConfigValue.DOUBLE_DEFAULT_VALUE);
                FilterRegion filterRegion = c0596js.f40112b;
                filterRegion.f18539mX = c11931zU0;
                filterRegion.f18540mY = new C11931zU0(ConfigValue.DOUBLE_DEFAULT_VALUE);
                filterRegion.f18538mW = new C11931zU0("100%");
                filterRegion.f18537mH = new C11931zU0("100%");
                return c0596js;
            case 21:
                return new C0659KS(s91);
            case 22:
                C1990d c1990d = new C1990d(s91);
                c1990d.f18592d = 1.0f;
                return c1990d;
            case 23:
                return new C0721LS(s91);
            case 24:
                return new C0784MS(s91);
            case 25:
                return new C0847NS(s91);
            case 26:
                C1998l c1998l = new C1998l(s91);
                c1998l.f18642r = new Matrix();
                return c1998l;
            case 27:
                C1992f c1992f = new C1992f(s91);
                c1992f.f18601j = new Canvas(Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888));
                return c1992f;
            default:
                throw new IllegalStateException("Unexpected type " + this.svgClass.toString());
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(VirtualView virtualView) {
        super.onAfterUpdateTransaction((VirtualViewManager<V>) virtualView);
        invalidateSvgView(virtualView);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(VirtualView virtualView) {
        super.onDropViewInstance((VirtualViewManager<V>) virtualView);
        mTagToRenderableView.remove(virtualView.getId());
    }

    public void setMatrix(V v, ReadableArray readableArray) {
        v.setMatrix(readableArray);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, p000.InterfaceC0798Mg
    public void setTransform(VirtualView virtualView, ReadableArray readableArray) {
        if (readableArray == null) {
            resetTransformProperty(virtualView);
        } else {
            setTransformProperty(virtualView, readableArray);
        }
        Matrix matrix = virtualView.getMatrix();
        virtualView.mTransform = matrix;
        virtualView.mTransformInvertible = matrix.invert(virtualView.mInvTransform);
    }

    @InterfaceC9871jM0(name = "transform")
    public void setTransform(V v, Dynamic dynamic) {
        if (dynamic.getType() != ReadableType.Array) {
            return;
        }
        setTransform((VirtualView) v, dynamic.asArray());
    }
}
