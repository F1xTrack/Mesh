package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.media.MediaCodecInfo;
import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public abstract class U0 implements QN0, InterfaceC6391p5, R4, IB0, InterfaceC0364Ek1, InterfaceC1930Yn, InterfaceC0273Dg0, OQ1 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ U0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static /* synthetic */ void b1(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i == 1) {
            objArr[1] = "getType";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i != 1 && i != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static /* synthetic */ void c1(int i) {
        String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 1 ? 3 : 2];
        if (i != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i != 1) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i == 1) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // defpackage.InterfaceC1930Yn
    public void E(InterfaceC7122sw interfaceC7122sw) {
        ((InterfaceC1930Yn) this.b).E(interfaceC7122sw);
    }

    public InterfaceFutureC0750Jj0 L(float f) {
        return ((InterfaceC1930Yn) this.b).L(f);
    }

    @Override // defpackage.InterfaceC1930Yn
    public Rect P() {
        return ((InterfaceC1930Yn) this.b).P();
    }

    @Override // defpackage.InterfaceC1930Yn
    public void P0() {
        ((InterfaceC1930Yn) this.b).P0();
    }

    @Override // defpackage.InterfaceC1930Yn
    public void R(int i) {
        ((InterfaceC1930Yn) this.b).R(i);
    }

    @Override // defpackage.InterfaceC1930Yn
    public void T(InterfaceC7158t60 interfaceC7158t60) {
        ((InterfaceC1930Yn) this.b).T(interfaceC7158t60);
    }

    public void T0(View view, String str, Object obj) {
        InterfaceC0973Mg interfaceC0973Mg;
        str.getClass();
        interfaceC0973Mg = (InterfaceC0973Mg) this.b;
        switch (str) {
            case "translateX":
                interfaceC0973Mg.setTranslateX(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "translateY":
                interfaceC0973Mg.setTranslateY(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "shadowColor":
                interfaceC0973Mg.setShadowColor(view, obj != null ? ColorPropConverter.getColor(obj, view.getContext()).intValue() : 0);
                break;
            case "opacity":
                interfaceC0973Mg.setOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "borderTopLeftRadius":
                interfaceC0973Mg.setBorderTopLeftRadius(view, obj != null ? ((Double) obj).floatValue() : Float.NaN);
                break;
            case "scaleX":
                interfaceC0973Mg.setScaleX(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "scaleY":
                interfaceC0973Mg.setScaleY(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "testID":
                interfaceC0973Mg.setTestId(view, (String) obj);
                break;
            case "transformOrigin":
                interfaceC0973Mg.setTransformOrigin(view, (ReadableArray) obj);
                break;
            case "zIndex":
                interfaceC0973Mg.setZIndex(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "accessibilityHint":
                interfaceC0973Mg.setAccessibilityHint(view, (String) obj);
                break;
            case "accessibilityRole":
                interfaceC0973Mg.setAccessibilityRole(view, (String) obj);
                break;
            case "renderToHardwareTextureAndroid":
                interfaceC0973Mg.setRenderToHardwareTexture(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "rotation":
                interfaceC0973Mg.setRotation(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "elevation":
                interfaceC0973Mg.setElevation(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "role":
                interfaceC0973Mg.setRole(view, (String) obj);
                break;
            case "accessibilityLiveRegion":
                interfaceC0973Mg.setAccessibilityLiveRegion(view, (String) obj);
                break;
            case "borderTopRightRadius":
                interfaceC0973Mg.setBorderTopRightRadius(view, obj != null ? ((Double) obj).floatValue() : Float.NaN);
                break;
            case "borderBottomLeftRadius":
                interfaceC0973Mg.setBorderBottomLeftRadius(view, obj != null ? ((Double) obj).floatValue() : Float.NaN);
                break;
            case "borderBottomRightRadius":
                interfaceC0973Mg.setBorderBottomRightRadius(view, obj != null ? ((Double) obj).floatValue() : Float.NaN);
                break;
            case "importantForAccessibility":
                interfaceC0973Mg.setImportantForAccessibility(view, (String) obj);
                break;
            case "transform":
                interfaceC0973Mg.setTransform(view, (ReadableArray) obj);
                break;
            case "accessibilityLabel":
                interfaceC0973Mg.setAccessibilityLabel(view, (String) obj);
                break;
            case "accessibilityState":
                interfaceC0973Mg.setViewState(view, (ReadableMap) obj);
                break;
            case "backgroundColor":
                interfaceC0973Mg.setBackgroundColor(view, obj != null ? ColorPropConverter.getColor(obj, view.getContext()).intValue() : 0);
                break;
            case "borderRadius":
                interfaceC0973Mg.setBorderRadius(view, obj != null ? ((Double) obj).floatValue() : Float.NaN);
                break;
            case "accessibilityActions":
                interfaceC0973Mg.setAccessibilityActions(view, (ReadableArray) obj);
                break;
            case "accessibilityCollection":
                interfaceC0973Mg.setAccessibilityCollection(view, (ReadableMap) obj);
                break;
            case "accessibilityLabelledBy":
                interfaceC0973Mg.setAccessibilityLabelledBy(view, new DynamicFromObject(obj));
                break;
            case "accessibilityCollectionItem":
                interfaceC0973Mg.setAccessibilityCollectionItem(view, (ReadableMap) obj);
                break;
            case "nativeID":
                interfaceC0973Mg.setNativeId(view, (String) obj);
                break;
        }
    }

    @Override // defpackage.InterfaceC0273Dg0
    public void U0(C0230Cs c0230Cs) {
    }

    @Override // defpackage.R4
    public List V0() {
        return (List) this.b;
    }

    @Override // defpackage.R4
    public boolean Z0() {
        List list = (List) this.b;
        if (list.isEmpty()) {
            return true;
        }
        return list.size() == 1 && ((C6312og0) list.get(0)).c();
    }

    public InterfaceFutureC0750Jj0 a0(ArrayList arrayList, int i, int i2) {
        return ((InterfaceC1930Yn) this.b).a0(arrayList, i, i2);
    }

    @Override // defpackage.InterfaceC1930Yn
    public void b0(C7433uY0 c7433uY0) {
        ((InterfaceC1930Yn) this.b).b0(c7433uY0);
    }

    public abstract C8073xv0 d1(char c);

    @Override // defpackage.InterfaceC0273Dg0
    public void e0(Object obj) {
        if (obj instanceof String) {
            ((ArrayList) this.b).add((String) obj);
        }
    }

    public C8073xv0 e1() {
        return null;
    }

    public abstract Object f1(Object obj);

    public Object g1(Object obj) {
        synchronized (((HashMap) this.b)) {
            try {
                if (((HashMap) this.b).containsKey(obj)) {
                    return ((HashMap) this.b).get(obj);
                }
                Object objF1 = f1(obj);
                ((HashMap) this.b).put(obj, objF1);
                return objF1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public I5 getAnnotations() {
        I5 i5 = (I5) this.b;
        if (i5 != null) {
            return i5;
        }
        c1(1);
        throw null;
    }

    @Override // defpackage.QN0
    public AbstractC0663Ig0 getType() {
        AbstractC0663Ig0 abstractC0663Ig0 = (AbstractC0663Ig0) this.b;
        if (abstractC0663Ig0 != null) {
            return abstractC0663Ig0;
        }
        b1(1);
        throw null;
    }

    public InterfaceFutureC0750Jj0 h0(boolean z) {
        return ((InterfaceC1930Yn) this.b).h0(z);
    }

    public void h1() {
        ((XQ) this).g2();
    }

    @Override // defpackage.InterfaceC0273Dg0
    public void i0(C0074As c0074As, C1559Tt0 c1559Tt0) {
    }

    public boolean i1(int i) {
        XQ xq = (XQ) this;
        xq.g2();
        return xq.N.a.a.get(i);
    }

    public InterfaceFutureC0750Jj0 j0(PT pt) {
        return ((InterfaceC1930Yn) this.b).j0(pt);
    }

    public boolean j1() {
        XQ xq = (XQ) this;
        AbstractC0178Ca1 abstractC0178Ca1G1 = xq.G1();
        return !abstractC0178Ca1G1.p() && abstractC0178Ca1G1.m(xq.D1(), (C0100Ba1) this.b, 0L).i;
    }

    @Override // defpackage.InterfaceC0273Dg0
    public void k() {
        s1((String[]) ((ArrayList) this.b).toArray(new String[0]));
    }

    public boolean k1() {
        XQ xq = (XQ) this;
        AbstractC0178Ca1 abstractC0178Ca1G1 = xq.G1();
        return !abstractC0178Ca1G1.p() && abstractC0178Ca1G1.m(xq.D1(), (C0100Ba1) this.b, 0L).a();
    }

    @Override // defpackage.InterfaceC1930Yn
    public InterfaceFutureC0750Jj0 l0(int i, int i2) {
        return ((InterfaceC1930Yn) this.b).l0(i, i2);
    }

    public boolean l1() {
        XQ xq = (XQ) this;
        AbstractC0178Ca1 abstractC0178Ca1G1 = xq.G1();
        return !abstractC0178Ca1G1.p() && abstractC0178Ca1G1.m(xq.D1(), (C0100Ba1) this.b, 0L).h;
    }

    public U0 m1() {
        U0 u0 = (U0) this.b;
        if (u0 != null) {
            return u0;
        }
        C0429Fg0 c0429Fg0 = new C0429Fg0();
        O90.m(c0429Fg0, O90.class.getName());
        throw c0429Fg0;
    }

    @Override // defpackage.OQ1
    public OL1 n() {
        OL1 ol1 = ((C3386dP1) this.b).i;
        C3386dP1.e(ol1);
        return ol1;
    }

    @Override // defpackage.InterfaceC1930Yn
    public InterfaceC7122sw n0() {
        return ((InterfaceC1930Yn) this.b).n0();
    }

    public void n1(InterfaceC3918gC0 interfaceC3918gC0) {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(interfaceC3918gC0);
        }
    }

    public abstract void o1(int i, long j, boolean z);

    @Override // defpackage.OQ1
    public C7595vO1 p0() {
        C7595vO1 c7595vO1 = ((C3386dP1) this.b).j;
        C3386dP1.e(c7595vO1);
        return c7595vO1;
    }

    public void p1() {
        int iE;
        int iE2;
        XQ xq = (XQ) this;
        if (xq.G1().p() || xq.M1()) {
            h1();
            return;
        }
        AbstractC0178Ca1 abstractC0178Ca1G1 = xq.G1();
        if (abstractC0178Ca1G1.p()) {
            iE = -1;
        } else {
            int iD1 = xq.D1();
            xq.g2();
            int i = xq.F;
            if (i == 1) {
                i = 0;
            }
            xq.g2();
            iE = abstractC0178Ca1G1.e(iD1, i, xq.G);
        }
        if (!(iE != -1)) {
            if (k1() && j1()) {
                o1(xq.D1(), -9223372036854775807L, false);
                return;
            } else {
                h1();
                return;
            }
        }
        AbstractC0178Ca1 abstractC0178Ca1G12 = xq.G1();
        if (abstractC0178Ca1G12.p()) {
            iE2 = -1;
        } else {
            int iD12 = xq.D1();
            xq.g2();
            int i2 = xq.F;
            if (i2 == 1) {
                i2 = 0;
            }
            xq.g2();
            iE2 = abstractC0178Ca1G12.e(iD12, i2, xq.G);
        }
        if (iE2 == -1) {
            h1();
        } else if (iE2 == xq.D1()) {
            o1(xq.D1(), -9223372036854775807L, true);
        } else {
            o1(iE2, -9223372036854775807L, false);
        }
    }

    public void q1(int i, long j) {
        XQ xq = (XQ) this;
        long jE1 = xq.E1() + j;
        long jI1 = xq.I1();
        if (jI1 != -9223372036854775807L) {
            jE1 = Math.min(jE1, jI1);
        }
        o1(xq.D1(), Math.max(jE1, 0L), false);
    }

    @Override // defpackage.InterfaceC0273Dg0
    public InterfaceC0195Cg0 r(C0074As c0074As) {
        return null;
    }

    public InterfaceFutureC0750Jj0 r0(int i) {
        return ((InterfaceC1930Yn) this.b).r0(i);
    }

    public void r1() {
        int iK;
        int iK2;
        int iK3;
        XQ xq = (XQ) this;
        if (xq.G1().p() || xq.M1()) {
            h1();
            return;
        }
        AbstractC0178Ca1 abstractC0178Ca1G1 = xq.G1();
        if (abstractC0178Ca1G1.p()) {
            iK = -1;
        } else {
            int iD1 = xq.D1();
            xq.g2();
            int i = xq.F;
            if (i == 1) {
                i = 0;
            }
            xq.g2();
            iK = abstractC0178Ca1G1.k(iD1, i, xq.G);
        }
        boolean z = iK != -1;
        if (k1() && !l1()) {
            if (!z) {
                h1();
                return;
            }
            AbstractC0178Ca1 abstractC0178Ca1G12 = xq.G1();
            if (abstractC0178Ca1G12.p()) {
                iK3 = -1;
            } else {
                int iD12 = xq.D1();
                xq.g2();
                int i2 = xq.F;
                if (i2 == 1) {
                    i2 = 0;
                }
                xq.g2();
                iK3 = abstractC0178Ca1G12.k(iD12, i2, xq.G);
            }
            if (iK3 == -1) {
                h1();
                return;
            } else if (iK3 == xq.D1()) {
                o1(xq.D1(), -9223372036854775807L, true);
                return;
            } else {
                o1(iK3, -9223372036854775807L, false);
                return;
            }
        }
        if (z) {
            long jE1 = xq.E1();
            xq.g2();
            if (jE1 <= xq.w) {
                AbstractC0178Ca1 abstractC0178Ca1G13 = xq.G1();
                if (abstractC0178Ca1G13.p()) {
                    iK2 = -1;
                } else {
                    int iD13 = xq.D1();
                    xq.g2();
                    int i3 = xq.F;
                    if (i3 == 1) {
                        i3 = 0;
                    }
                    xq.g2();
                    iK2 = abstractC0178Ca1G13.k(iD13, i3, xq.G);
                }
                if (iK2 == -1) {
                    h1();
                    return;
                } else if (iK2 == xq.D1()) {
                    o1(xq.D1(), -9223372036854775807L, true);
                    return;
                } else {
                    o1(iK2, -9223372036854775807L, false);
                    return;
                }
            }
        }
        o1(xq.D1(), 0L, false);
    }

    public abstract void s1(String[] strArr);

    @Override // defpackage.InterfaceC1930Yn
    public void t() {
        ((InterfaceC1930Yn) this.b).t();
    }

    public UM1 t1() {
        UM1 um1 = ((C3386dP1) this.b).h;
        C3386dP1.b(um1);
        return um1;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                StringBuilder sb = new StringBuilder();
                List list = (List) this.b;
                if (!list.isEmpty()) {
                    sb.append("values=");
                    sb.append(Arrays.toString(list.toArray()));
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public C5910mZ1 u1() {
        C5910mZ1 c5910mZ1 = ((C3386dP1) this.b).l;
        C3386dP1.b(c5910mZ1);
        return c5910mZ1;
    }

    public void v1() {
        C7595vO1 c7595vO1 = ((C3386dP1) this.b).j;
        C3386dP1.e(c7595vO1);
        c7595vO1.v1();
    }

    @Override // defpackage.InterfaceC1930Yn
    public void z0() {
        ((InterfaceC1930Yn) this.b).z0();
    }

    @Override // defpackage.OQ1
    public Context zza() {
        return ((C3386dP1) this.b).a;
    }

    @Override // defpackage.OQ1
    public Clock zzb() {
        return ((C3386dP1) this.b).n;
    }

    @Override // defpackage.OQ1
    public C3759fN zzd() {
        return ((C3386dP1) this.b).f;
    }

    public U0(int i) {
        this.a = i;
        switch (i) {
            case 4:
                this.b = new C0100Ba1();
                break;
            case 8:
                this.b = new HashMap();
                break;
            case 9:
                this.b = new ArrayList();
                break;
            default:
                char[] cArr = AbstractC0121Bh1.a;
                this.b = new ArrayDeque(20);
                break;
        }
    }

    public U0(C3386dP1 c3386dP1) {
        this.a = 12;
        Preconditions.checkNotNull(c3386dP1);
        this.b = c3386dP1;
    }

    public U0(I5 i5) {
        this.a = 1;
        if (i5 != null) {
            this.b = i5;
        } else {
            c1(0);
            throw null;
        }
    }

    public U0(AbstractC0663Ig0 abstractC0663Ig0) {
        this.a = 0;
        if (abstractC0663Ig0 != null) {
            this.b = abstractC0663Ig0;
        } else {
            b1(0);
            throw null;
        }
    }

    public U0(MediaCodecInfo mediaCodecInfo, String str) throws U90 {
        this.a = 6;
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
            Objects.requireNonNull(capabilitiesForType);
            this.b = capabilitiesForType;
        } catch (RuntimeException e) {
            throw new U90(AbstractC8235ym.v("Unable to get CodecCapabilities for mime: ", str), e);
        }
    }

    @Override // defpackage.InterfaceC0364Ek1
    public void I(View view, String str, ReadableArray readableArray) {
    }
}
