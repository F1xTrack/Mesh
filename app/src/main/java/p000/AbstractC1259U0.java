package p000;

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

/* renamed from: U0 */
/* loaded from: classes2.dex */
public abstract class AbstractC1259U0 implements QN0, InterfaceC6595p5, InterfaceC1074R4, IB0, InterfaceC7543Ek1, InterfaceC1560Yn, InterfaceC7482Dg0, OQ1 {

    /* renamed from: a */
    public final /* synthetic */ int f11614a;

    /* renamed from: b */
    public final Object f11615b;

    public /* synthetic */ AbstractC1259U0(int i, Object obj) {
        this.f11614a = i;
        this.f11615b = obj;
    }

    /* renamed from: b1 */
    public static /* synthetic */ void m7836b1(int i) {
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

    /* renamed from: c1 */
    public static /* synthetic */ void m7837c1(int i) {
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

    @Override // p000.InterfaceC1560Yn
    /* renamed from: E */
    public void mo903E(InterfaceC6854sw interfaceC6854sw) {
        ((InterfaceC1560Yn) this.f11615b).mo903E(interfaceC6854sw);
    }

    /* renamed from: L */
    public InterfaceFutureC7800Jj0 mo904L(float f) {
        return ((InterfaceC1560Yn) this.f11615b).mo904L(f);
    }

    @Override // p000.InterfaceC1560Yn
    /* renamed from: P */
    public Rect mo905P() {
        return ((InterfaceC1560Yn) this.f11615b).mo905P();
    }

    @Override // p000.InterfaceC1560Yn
    /* renamed from: P0 */
    public void mo906P0() {
        ((InterfaceC1560Yn) this.f11615b).mo906P0();
    }

    @Override // p000.InterfaceC1560Yn
    /* renamed from: R */
    public void mo907R(int i) {
        ((InterfaceC1560Yn) this.f11615b).mo907R(i);
    }

    @Override // p000.InterfaceC1560Yn
    /* renamed from: T */
    public void mo908T(InterfaceC11119t60 interfaceC11119t60) {
        ((InterfaceC1560Yn) this.f11615b).mo908T(interfaceC11119t60);
    }

    /* renamed from: T0 */
    public void mo2373T0(View view, String str, Object obj) {
        InterfaceC0798Mg interfaceC0798Mg;
        str.getClass();
        interfaceC0798Mg = (InterfaceC0798Mg) this.f11615b;
        switch (str) {
            case "translateX":
                interfaceC0798Mg.setTranslateX(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "translateY":
                interfaceC0798Mg.setTranslateY(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "shadowColor":
                interfaceC0798Mg.setShadowColor(view, obj != null ? ColorPropConverter.getColor(obj, view.getContext()).intValue() : 0);
                break;
            case "opacity":
                interfaceC0798Mg.setOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "borderTopLeftRadius":
                interfaceC0798Mg.setBorderTopLeftRadius(view, obj != null ? ((Double) obj).floatValue() : Float.NaN);
                break;
            case "scaleX":
                interfaceC0798Mg.setScaleX(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "scaleY":
                interfaceC0798Mg.setScaleY(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "testID":
                interfaceC0798Mg.setTestId(view, (String) obj);
                break;
            case "transformOrigin":
                interfaceC0798Mg.setTransformOrigin(view, (ReadableArray) obj);
                break;
            case "zIndex":
                interfaceC0798Mg.setZIndex(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "accessibilityHint":
                interfaceC0798Mg.setAccessibilityHint(view, (String) obj);
                break;
            case "accessibilityRole":
                interfaceC0798Mg.setAccessibilityRole(view, (String) obj);
                break;
            case "renderToHardwareTextureAndroid":
                interfaceC0798Mg.setRenderToHardwareTexture(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "rotation":
                interfaceC0798Mg.setRotation(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "elevation":
                interfaceC0798Mg.setElevation(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "role":
                interfaceC0798Mg.setRole(view, (String) obj);
                break;
            case "accessibilityLiveRegion":
                interfaceC0798Mg.setAccessibilityLiveRegion(view, (String) obj);
                break;
            case "borderTopRightRadius":
                interfaceC0798Mg.setBorderTopRightRadius(view, obj != null ? ((Double) obj).floatValue() : Float.NaN);
                break;
            case "borderBottomLeftRadius":
                interfaceC0798Mg.setBorderBottomLeftRadius(view, obj != null ? ((Double) obj).floatValue() : Float.NaN);
                break;
            case "borderBottomRightRadius":
                interfaceC0798Mg.setBorderBottomRightRadius(view, obj != null ? ((Double) obj).floatValue() : Float.NaN);
                break;
            case "importantForAccessibility":
                interfaceC0798Mg.setImportantForAccessibility(view, (String) obj);
                break;
            case "transform":
                interfaceC0798Mg.setTransform(view, (ReadableArray) obj);
                break;
            case "accessibilityLabel":
                interfaceC0798Mg.setAccessibilityLabel(view, (String) obj);
                break;
            case "accessibilityState":
                interfaceC0798Mg.setViewState(view, (ReadableMap) obj);
                break;
            case "backgroundColor":
                interfaceC0798Mg.setBackgroundColor(view, obj != null ? ColorPropConverter.getColor(obj, view.getContext()).intValue() : 0);
                break;
            case "borderRadius":
                interfaceC0798Mg.setBorderRadius(view, obj != null ? ((Double) obj).floatValue() : Float.NaN);
                break;
            case "accessibilityActions":
                interfaceC0798Mg.setAccessibilityActions(view, (ReadableArray) obj);
                break;
            case "accessibilityCollection":
                interfaceC0798Mg.setAccessibilityCollection(view, (ReadableMap) obj);
                break;
            case "accessibilityLabelledBy":
                interfaceC0798Mg.setAccessibilityLabelledBy(view, new DynamicFromObject(obj));
                break;
            case "accessibilityCollectionItem":
                interfaceC0798Mg.setAccessibilityCollectionItem(view, (ReadableMap) obj);
                break;
            case "nativeID":
                interfaceC0798Mg.setNativeId(view, (String) obj);
                break;
        }
    }

    @Override // p000.InterfaceC7482Dg0
    /* renamed from: U0 */
    public void mo1747U0(C0181Cs c0181Cs) {
    }

    @Override // p000.InterfaceC1074R4
    /* renamed from: V0 */
    public List mo5469V0() {
        return (List) this.f11615b;
    }

    @Override // p000.InterfaceC1074R4
    /* renamed from: Z0 */
    public boolean mo5470Z0() {
        List list = (List) this.f11615b;
        if (list.isEmpty()) {
            return true;
        }
        return list.size() == 1 && ((C10551og0) list.get(0)).m23519c();
    }

    /* renamed from: a0 */
    public InterfaceFutureC7800Jj0 mo910a0(ArrayList arrayList, int i, int i2) {
        return ((InterfaceC1560Yn) this.f11615b).mo910a0(arrayList, i, i2);
    }

    @Override // p000.InterfaceC1560Yn
    /* renamed from: b0 */
    public void mo912b0(C11303uY0 c11303uY0) {
        ((InterfaceC1560Yn) this.f11615b).mo912b0(c11303uY0);
    }

    /* renamed from: d1 */
    public abstract C11731xv0 mo3655d1(char c);

    @Override // p000.InterfaceC7482Dg0
    /* renamed from: e0 */
    public void mo1748e0(Object obj) {
        if (obj instanceof String) {
            ((ArrayList) this.f11615b).add((String) obj);
        }
    }

    /* renamed from: e1 */
    public C11731xv0 mo6078e1() {
        return null;
    }

    /* renamed from: f1 */
    public abstract Object mo198f1(Object obj);

    /* renamed from: g1 */
    public Object m7838g1(Object obj) {
        synchronized (((HashMap) this.f11615b)) {
            try {
                if (((HashMap) this.f11615b).containsKey(obj)) {
                    return ((HashMap) this.f11615b).get(obj);
                }
                Object objMo198f1 = mo198f1(obj);
                ((HashMap) this.f11615b).put(obj, objMo198f1);
                return objMo198f1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public InterfaceC0510I5 getAnnotations() {
        InterfaceC0510I5 interfaceC0510I5 = (InterfaceC0510I5) this.f11615b;
        if (interfaceC0510I5 != null) {
            return interfaceC0510I5;
        }
        m7837c1(1);
        throw null;
    }

    @Override // p000.QN0
    public AbstractC7742Ig0 getType() {
        AbstractC7742Ig0 abstractC7742Ig0 = (AbstractC7742Ig0) this.f11615b;
        if (abstractC7742Ig0 != null) {
            return abstractC7742Ig0;
        }
        m7836b1(1);
        throw null;
    }

    /* renamed from: h0 */
    public InterfaceFutureC7800Jj0 mo918h0(boolean z) {
        return ((InterfaceC1560Yn) this.f11615b).mo918h0(z);
    }

    /* renamed from: h1 */
    public void m7839h1() {
        ((C1474XQ) this).m9035g2();
    }

    @Override // p000.InterfaceC7482Dg0
    /* renamed from: i0 */
    public void mo1749i0(C0055As c0055As, C8340Tt0 c8340Tt0) {
    }

    /* renamed from: i1 */
    public boolean m7840i1(int i) {
        C1474XQ c1474xq = (C1474XQ) this;
        c1474xq.m9035g2();
        return c1474xq.f13702N.f2534a.f12594a.get(i);
    }

    /* renamed from: j0 */
    public InterfaceFutureC7800Jj0 mo921j0(C0974PT c0974pt) {
        return ((InterfaceC1560Yn) this.f11615b).mo921j0(c0974pt);
    }

    /* renamed from: j1 */
    public boolean m7841j1() {
        C1474XQ c1474xq = (C1474XQ) this;
        AbstractC7419Ca1 abstractC7419Ca1M9010G1 = c1474xq.m9010G1();
        return !abstractC7419Ca1M9010G1.m1259p() && abstractC7419Ca1M9010G1.mo1256m(c1474xq.m9007D1(), (C7367Ba1) this.f11615b, 0L).f922i;
    }

    @Override // p000.InterfaceC7482Dg0
    /* renamed from: k */
    public void mo1750k() {
        mo7850s1((String[]) ((ArrayList) this.f11615b).toArray(new String[0]));
    }

    /* renamed from: k1 */
    public boolean m7842k1() {
        C1474XQ c1474xq = (C1474XQ) this;
        AbstractC7419Ca1 abstractC7419Ca1M9010G1 = c1474xq.m9010G1();
        return !abstractC7419Ca1M9010G1.m1259p() && abstractC7419Ca1M9010G1.mo1256m(c1474xq.m9007D1(), (C7367Ba1) this.f11615b, 0L).m772a();
    }

    @Override // p000.InterfaceC1560Yn
    /* renamed from: l0 */
    public InterfaceFutureC7800Jj0 mo922l0(int i, int i2) {
        return ((InterfaceC1560Yn) this.f11615b).mo922l0(i, i2);
    }

    /* renamed from: l1 */
    public boolean m7843l1() {
        C1474XQ c1474xq = (C1474XQ) this;
        AbstractC7419Ca1 abstractC7419Ca1M9010G1 = c1474xq.m9010G1();
        return !abstractC7419Ca1M9010G1.m1259p() && abstractC7419Ca1M9010G1.mo1256m(c1474xq.m9007D1(), (C7367Ba1) this.f11615b, 0L).f921h;
    }

    /* renamed from: m1 */
    public AbstractC1259U0 mo7844m1() {
        AbstractC1259U0 abstractC1259U0 = (AbstractC1259U0) this.f11615b;
        if (abstractC1259U0 != null) {
            return abstractC1259U0;
        }
        C7586Fg0 c7586Fg0 = new C7586Fg0();
        O90.m5975m(c7586Fg0, O90.class.getName());
        throw c7586Fg0;
    }

    @Override // p000.OQ1
    /* renamed from: n */
    public OL1 mo6070n() {
        OL1 ol1 = ((C9110dP1) this.f11615b).f26039i;
        C9110dP1.m17592e(ol1);
        return ol1;
    }

    @Override // p000.InterfaceC1560Yn
    /* renamed from: n0 */
    public InterfaceC6854sw mo923n0() {
        return ((InterfaceC1560Yn) this.f11615b).mo923n0();
    }

    /* renamed from: n1 */
    public void m7845n1(InterfaceC9467gC0 interfaceC9467gC0) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f11615b;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(interfaceC9467gC0);
        }
    }

    /* renamed from: o1 */
    public abstract void mo7846o1(int i, long j, boolean z);

    @Override // p000.OQ1
    /* renamed from: p0 */
    public C11412vO1 mo6071p0() {
        C11412vO1 c11412vO1 = ((C9110dP1) this.f11615b).f26040j;
        C9110dP1.m17592e(c11412vO1);
        return c11412vO1;
    }

    /* renamed from: p1 */
    public void m7847p1() {
        int iMo1248e;
        int iMo1248e2;
        C1474XQ c1474xq = (C1474XQ) this;
        if (c1474xq.m9010G1().m1259p() || c1474xq.m9015M1()) {
            m7839h1();
            return;
        }
        AbstractC7419Ca1 abstractC7419Ca1M9010G1 = c1474xq.m9010G1();
        if (abstractC7419Ca1M9010G1.m1259p()) {
            iMo1248e = -1;
        } else {
            int iM9007D1 = c1474xq.m9007D1();
            c1474xq.m9035g2();
            int i = c1474xq.f13694F;
            if (i == 1) {
                i = 0;
            }
            c1474xq.m9035g2();
            iMo1248e = abstractC7419Ca1M9010G1.mo1248e(iM9007D1, i, c1474xq.f13695G);
        }
        if (!(iMo1248e != -1)) {
            if (m7842k1() && m7841j1()) {
                mo7846o1(c1474xq.m9007D1(), -9223372036854775807L, false);
                return;
            } else {
                m7839h1();
                return;
            }
        }
        AbstractC7419Ca1 abstractC7419Ca1M9010G12 = c1474xq.m9010G1();
        if (abstractC7419Ca1M9010G12.m1259p()) {
            iMo1248e2 = -1;
        } else {
            int iM9007D12 = c1474xq.m9007D1();
            c1474xq.m9035g2();
            int i2 = c1474xq.f13694F;
            if (i2 == 1) {
                i2 = 0;
            }
            c1474xq.m9035g2();
            iMo1248e2 = abstractC7419Ca1M9010G12.mo1248e(iM9007D12, i2, c1474xq.f13695G);
        }
        if (iMo1248e2 == -1) {
            m7839h1();
        } else if (iMo1248e2 == c1474xq.m9007D1()) {
            mo7846o1(c1474xq.m9007D1(), -9223372036854775807L, true);
        } else {
            mo7846o1(iMo1248e2, -9223372036854775807L, false);
        }
    }

    /* renamed from: q1 */
    public void m7848q1(int i, long j) {
        C1474XQ c1474xq = (C1474XQ) this;
        long jM9008E1 = c1474xq.m9008E1() + j;
        long jM9012I1 = c1474xq.m9012I1();
        if (jM9012I1 != -9223372036854775807L) {
            jM9008E1 = Math.min(jM9008E1, jM9012I1);
        }
        mo7846o1(c1474xq.m9007D1(), Math.max(jM9008E1, 0L), false);
    }

    @Override // p000.InterfaceC7482Dg0
    /* renamed from: r */
    public InterfaceC7430Cg0 mo1751r(C0055As c0055As) {
        return null;
    }

    /* renamed from: r0 */
    public InterfaceFutureC7800Jj0 mo924r0(int i) {
        return ((InterfaceC1560Yn) this.f11615b).mo924r0(i);
    }

    /* renamed from: r1 */
    public void m7849r1() {
        int iMo1254k;
        int iMo1254k2;
        int iMo1254k3;
        C1474XQ c1474xq = (C1474XQ) this;
        if (c1474xq.m9010G1().m1259p() || c1474xq.m9015M1()) {
            m7839h1();
            return;
        }
        AbstractC7419Ca1 abstractC7419Ca1M9010G1 = c1474xq.m9010G1();
        if (abstractC7419Ca1M9010G1.m1259p()) {
            iMo1254k = -1;
        } else {
            int iM9007D1 = c1474xq.m9007D1();
            c1474xq.m9035g2();
            int i = c1474xq.f13694F;
            if (i == 1) {
                i = 0;
            }
            c1474xq.m9035g2();
            iMo1254k = abstractC7419Ca1M9010G1.mo1254k(iM9007D1, i, c1474xq.f13695G);
        }
        boolean z = iMo1254k != -1;
        if (m7842k1() && !m7843l1()) {
            if (!z) {
                m7839h1();
                return;
            }
            AbstractC7419Ca1 abstractC7419Ca1M9010G12 = c1474xq.m9010G1();
            if (abstractC7419Ca1M9010G12.m1259p()) {
                iMo1254k3 = -1;
            } else {
                int iM9007D12 = c1474xq.m9007D1();
                c1474xq.m9035g2();
                int i2 = c1474xq.f13694F;
                if (i2 == 1) {
                    i2 = 0;
                }
                c1474xq.m9035g2();
                iMo1254k3 = abstractC7419Ca1M9010G12.mo1254k(iM9007D12, i2, c1474xq.f13695G);
            }
            if (iMo1254k3 == -1) {
                m7839h1();
                return;
            } else if (iMo1254k3 == c1474xq.m9007D1()) {
                mo7846o1(c1474xq.m9007D1(), -9223372036854775807L, true);
                return;
            } else {
                mo7846o1(iMo1254k3, -9223372036854775807L, false);
                return;
            }
        }
        if (z) {
            long jM9008E1 = c1474xq.m9008E1();
            c1474xq.m9035g2();
            if (jM9008E1 <= c1474xq.f13746w) {
                AbstractC7419Ca1 abstractC7419Ca1M9010G13 = c1474xq.m9010G1();
                if (abstractC7419Ca1M9010G13.m1259p()) {
                    iMo1254k2 = -1;
                } else {
                    int iM9007D13 = c1474xq.m9007D1();
                    c1474xq.m9035g2();
                    int i3 = c1474xq.f13694F;
                    if (i3 == 1) {
                        i3 = 0;
                    }
                    c1474xq.m9035g2();
                    iMo1254k2 = abstractC7419Ca1M9010G13.mo1254k(iM9007D13, i3, c1474xq.f13695G);
                }
                if (iMo1254k2 == -1) {
                    m7839h1();
                    return;
                } else if (iMo1254k2 == c1474xq.m9007D1()) {
                    mo7846o1(c1474xq.m9007D1(), -9223372036854775807L, true);
                    return;
                } else {
                    mo7846o1(iMo1254k2, -9223372036854775807L, false);
                    return;
                }
            }
        }
        mo7846o1(c1474xq.m9007D1(), 0L, false);
    }

    /* renamed from: s1 */
    public abstract void mo7850s1(String[] strArr);

    @Override // p000.InterfaceC1560Yn
    /* renamed from: t */
    public void mo925t() {
        ((InterfaceC1560Yn) this.f11615b).mo925t();
    }

    /* renamed from: t1 */
    public UM1 m7851t1() {
        UM1 um1 = ((C9110dP1) this.f11615b).f26038h;
        C9110dP1.m17589b(um1);
        return um1;
    }

    public String toString() {
        switch (this.f11614a) {
            case 2:
                StringBuilder sb = new StringBuilder();
                List list = (List) this.f11615b;
                if (!list.isEmpty()) {
                    sb.append("values=");
                    sb.append(Arrays.toString(list.toArray()));
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* renamed from: u1 */
    public C10282mZ1 m7852u1() {
        C10282mZ1 c10282mZ1 = ((C9110dP1) this.f11615b).f26042l;
        C9110dP1.m17589b(c10282mZ1);
        return c10282mZ1;
    }

    /* renamed from: v1 */
    public void mo7681v1() {
        C11412vO1 c11412vO1 = ((C9110dP1) this.f11615b).f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.mo7681v1();
    }

    @Override // p000.InterfaceC1560Yn
    /* renamed from: z0 */
    public void mo926z0() {
        ((InterfaceC1560Yn) this.f11615b).mo926z0();
    }

    @Override // p000.OQ1
    public Context zza() {
        return ((C9110dP1) this.f11615b).f26031a;
    }

    @Override // p000.OQ1
    public Clock zzb() {
        return ((C9110dP1) this.f11615b).f26044n;
    }

    @Override // p000.OQ1
    public C4049fN zzd() {
        return ((C9110dP1) this.f11615b).f26036f;
    }

    public AbstractC1259U0(int i) {
        this.f11614a = i;
        switch (i) {
            case 4:
                this.f11615b = new C7367Ba1();
                break;
            case 8:
                this.f11615b = new HashMap();
                break;
            case 9:
                this.f11615b = new ArrayList();
                break;
            default:
                char[] cArr = AbstractC7381Bh1.f976a;
                this.f11615b = new ArrayDeque(20);
                break;
        }
    }

    public AbstractC1259U0(C9110dP1 c9110dP1) {
        this.f11614a = 12;
        Preconditions.checkNotNull(c9110dP1);
        this.f11615b = c9110dP1;
    }

    public AbstractC1259U0(InterfaceC0510I5 interfaceC0510I5) {
        this.f11614a = 1;
        if (interfaceC0510I5 != null) {
            this.f11615b = interfaceC0510I5;
        } else {
            m7837c1(0);
            throw null;
        }
    }

    public AbstractC1259U0(AbstractC7742Ig0 abstractC7742Ig0) {
        this.f11614a = 0;
        if (abstractC7742Ig0 != null) {
            this.f11615b = abstractC7742Ig0;
        } else {
            m7836b1(0);
            throw null;
        }
    }

    public AbstractC1259U0(MediaCodecInfo mediaCodecInfo, String str) throws U90 {
        this.f11614a = 6;
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
            Objects.requireNonNull(capabilitiesForType);
            this.f11615b = capabilitiesForType;
        } catch (RuntimeException e) {
            throw new U90(AbstractC7222ym.m26245v("Unable to get CodecCapabilities for mime: ", str), e);
        }
    }

    @Override // p000.InterfaceC7543Ek1
    /* renamed from: I */
    public void mo2372I(View view, String str, ReadableArray readableArray) {
    }
}
