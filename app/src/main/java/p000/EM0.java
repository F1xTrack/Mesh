package p000;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class EM0 implements DM0 {

    /* renamed from: x */
    public static final C7709Hp1 f2648x;

    /* renamed from: a */
    public int f2649a;

    /* renamed from: b */
    public String f2650b;

    /* renamed from: c */
    public int f2651c;

    /* renamed from: d */
    public S91 f2652d;

    /* renamed from: e */
    public boolean f2653e;

    /* renamed from: g */
    public ArrayList f2655g;

    /* renamed from: h */
    public EM0 f2656h;

    /* renamed from: i */
    public KJ0 f2657i;

    /* renamed from: j */
    public boolean f2658j;

    /* renamed from: l */
    public EM0 f2660l;

    /* renamed from: m */
    public ArrayList f2661m;

    /* renamed from: n */
    public int f2662n;

    /* renamed from: o */
    public int f2663o;

    /* renamed from: p */
    public int f2664p;

    /* renamed from: q */
    public int f2665q;

    /* renamed from: s */
    public final float[] f2667s;

    /* renamed from: u */
    public final YogaNodeJNIBase f2669u;

    /* renamed from: v */
    public Integer f2670v;

    /* renamed from: w */
    public Integer f2671w;

    /* renamed from: f */
    public boolean f2654f = true;

    /* renamed from: k */
    public int f2659k = 0;

    /* renamed from: t */
    public final boolean[] f2668t = new boolean[9];

    /* renamed from: r */
    public final Y21 f2666r = new Y21(0.0f);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    static {
        Object value = AbstractC10129lN0.f37027a.getValue();
        O90.m5967e(value, "getValue(...)");
        f2648x = (C7709Hp1) value;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    public EM0() {
        float[] fArr = new float[9];
        this.f2667s = fArr;
        if (mo1653c()) {
            this.f2669u = null;
            return;
        }
        YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) ((C1565Ys) AbstractC7917Lp1.f6883a.getValue()).mo4581i();
        this.f2669u = yogaNodeJNIBase == null ? new C7865Kp1(YogaNative.jni_YGNodeNewWithConfigJNI(f2648x.f4521a)) : yogaNodeJNIBase;
        Arrays.fill(fArr, Float.NaN);
    }

    /* renamed from: A */
    public final void m2170A(boolean z) {
        UN1.m7998b(this.f2656h == null, "Must remove from no opt parent first");
        UN1.m7998b(this.f2660l == null, "Must remove from native parent first");
        ArrayList arrayList = this.f2661m;
        UN1.m7998b((arrayList == null ? 0 : arrayList.size()) == 0, "Must remove all native children first");
        this.f2658j = z;
    }

    /* renamed from: B */
    public final void m2171B(int i) {
        YogaNative.jni_YGNodeStyleSetJustifyContentJNI(this.f2669u.f17997e, AbstractC7222ym.m26247x(i));
    }

    /* renamed from: C */
    public final void m2172C(float f, int i) {
        YogaNative.jni_YGNodeStyleSetMarginJNI(this.f2669u.f17997e, AbstractC7222ym.m26247x(F91.m2534q(i)), f);
    }

    /* renamed from: D */
    public final void m2173D(InterfaceC7761Ip1 interfaceC7761Ip1) {
        YogaNodeJNIBase yogaNodeJNIBase = this.f2669u;
        yogaNodeJNIBase.f17995c = interfaceC7761Ip1;
        YogaNative.jni_YGNodeSetHasMeasureFuncJNI(yogaNodeJNIBase.f17997e, true);
    }

    /* renamed from: E */
    public void mo2174E(float f, int i) {
        this.f2667s[i] = f;
        this.f2668t[i] = false;
        m2176G();
    }

    /* renamed from: F */
    public final void m2175F(int i) {
        if (m2183l() != EnumC10323mu0.f37985a) {
            for (EM0 em0 = this.f2656h; em0 != null; em0 = em0.f2656h) {
                em0.f2659k += i;
                if (em0.m2183l() == EnumC10323mu0.f37985a) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x008f  */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2176G() {
        /*
            r6 = this;
            r0 = 0
        L1:
            r1 = 8
            if (r0 > r1) goto Lb8
            com.facebook.yoga.YogaNodeJNIBase r2 = r6.f2669u
            float[] r3 = r6.f2667s
            Y21 r4 = r6.f2666r
            if (r0 == 0) goto L64
            r5 = 2
            if (r0 == r5) goto L64
            r5 = 4
            if (r0 == r5) goto L64
            r5 = 5
            if (r0 != r5) goto L17
            goto L64
        L17:
            r5 = 1
            if (r0 == r5) goto L39
            r5 = 3
            if (r0 != r5) goto L1e
            goto L39
        L1e:
            r1 = r3[r0]
            boolean r1 = p000.AbstractC11619x12.m25735a(r1)
            if (r1 == 0) goto L8f
            int r1 = p000.F91.m2534q(r0)
            float[] r3 = r4.f14122b
            r3 = r3[r0]
            long r4 = r2.f17997e
            int r1 = p000.AbstractC7222ym.m26247x(r1)
            com.facebook.yoga.YogaNative.jni_YGNodeStyleSetPaddingJNI(r4, r1, r3)
            goto Lb4
        L39:
            r5 = r3[r0]
            boolean r5 = p000.AbstractC11619x12.m25735a(r5)
            if (r5 == 0) goto L8f
            r5 = 7
            r5 = r3[r5]
            boolean r5 = p000.AbstractC11619x12.m25735a(r5)
            if (r5 == 0) goto L8f
            r1 = r3[r1]
            boolean r1 = p000.AbstractC11619x12.m25735a(r1)
            if (r1 == 0) goto L8f
            int r1 = p000.F91.m2534q(r0)
            float[] r3 = r4.f14122b
            r3 = r3[r0]
            long r4 = r2.f17997e
            int r1 = p000.AbstractC7222ym.m26247x(r1)
            com.facebook.yoga.YogaNative.jni_YGNodeStyleSetPaddingJNI(r4, r1, r3)
            goto Lb4
        L64:
            r5 = r3[r0]
            boolean r5 = p000.AbstractC11619x12.m25735a(r5)
            if (r5 == 0) goto L8f
            r5 = 6
            r5 = r3[r5]
            boolean r5 = p000.AbstractC11619x12.m25735a(r5)
            if (r5 == 0) goto L8f
            r1 = r3[r1]
            boolean r1 = p000.AbstractC11619x12.m25735a(r1)
            if (r1 == 0) goto L8f
            int r1 = p000.F91.m2534q(r0)
            float[] r3 = r4.f14122b
            r3 = r3[r0]
            long r4 = r2.f17997e
            int r1 = p000.AbstractC7222ym.m26247x(r1)
            com.facebook.yoga.YogaNative.jni_YGNodeStyleSetPaddingJNI(r4, r1, r3)
            goto Lb4
        L8f:
            boolean[] r1 = r6.f2668t
            boolean r1 = r1[r0]
            if (r1 == 0) goto La5
            int r1 = p000.F91.m2534q(r0)
            r3 = r3[r0]
            long r4 = r2.f17997e
            int r1 = p000.AbstractC7222ym.m26247x(r1)
            com.facebook.yoga.YogaNative.jni_YGNodeStyleSetPaddingPercentJNI(r4, r1, r3)
            goto Lb4
        La5:
            int r1 = p000.F91.m2534q(r0)
            r3 = r3[r0]
            long r4 = r2.f17997e
            int r1 = p000.AbstractC7222ym.m26247x(r1)
            com.facebook.yoga.YogaNative.jni_YGNodeStyleSetPaddingJNI(r4, r1, r3)
        Lb4:
            int r0 = r0 + 1
            goto L1
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.EM0.m2176G():void");
    }

    /* renamed from: H */
    public final void m2177H(NM0 nm0) {
        Object[] objArr;
        HashMap map = AbstractC7751Ik1.f5122a;
        C7647Gk1 c7647Gk1M3998d = AbstractC7751Ik1.m3998d(getClass());
        Iterator<Map.Entry<String, Object>> entryIterator = nm0.f7734a.getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            String key = next.getKey();
            Object value = next.getValue();
            AbstractC8271Sk1 abstractC8271Sk1 = (AbstractC8271Sk1) c7647Gk1M3998d.f3871a.get(key);
            if (abstractC8271Sk1 != null) {
                Integer num = abstractC8271Sk1.f10965d;
                if (num == null) {
                    try {
                        objArr = (Object[]) AbstractC8271Sk1.f10960g.get();
                        S91 s91 = this.f2652d;
                        UN1.m7999c(s91);
                        objArr[0] = abstractC8271Sk1.mo5830a(s91, value);
                    } catch (Throwable th) {
                        AbstractC3929dS.m17674g(ViewManager.class);
                        StringBuilder sb = new StringBuilder("Error while updating property '");
                        sb.append(abstractC8271Sk1.f10962a);
                        sb.append("' in shadow node of type: ");
                        String str = this.f2650b;
                        UN1.m7999c(str);
                        sb.append(str);
                        throw new JSApplicationIllegalArgumentException(sb.toString(), th);
                    }
                } else {
                    Object[] objArr2 = (Object[]) AbstractC8271Sk1.f10961h.get();
                    objArr2[0] = num;
                    S91 s912 = this.f2652d;
                    UN1.m7999c(s912);
                    objArr2[1] = abstractC8271Sk1.mo5830a(s912, value);
                    objArr = objArr2;
                }
                abstractC8271Sk1.f10964c.invoke(this, objArr);
                Arrays.fill(objArr, (Object) null);
            }
        }
    }

    @Override // p000.DM0
    /* renamed from: a */
    public ArrayList mo1651a() {
        if (mo2189r()) {
            return null;
        }
        return this.f2655g;
    }

    @Override // p000.DM0
    /* renamed from: c */
    public boolean mo1653c() {
        return this instanceof C10127lM0;
    }

    @Override // p000.DM0
    /* renamed from: d */
    public void mo1654d(S91 s91) {
        this.f2652d = s91;
    }

    @Override // p000.DM0
    /* renamed from: g */
    public void mo1656f(EM0 em0, int i) {
        if (this.f2655g == null) {
            this.f2655g = new ArrayList(4);
        }
        this.f2655g.add(i, em0);
        em0.f2656h = this;
        YogaNodeJNIBase yogaNodeJNIBase = this.f2669u;
        if (yogaNodeJNIBase != null && !mo2190s()) {
            YogaNodeJNIBase yogaNodeJNIBase2 = em0.f2669u;
            if (yogaNodeJNIBase2 == null) {
                throw new RuntimeException("Cannot add a child that doesn't have a YogaNode to a parent without a measure function! (Trying to add a '" + em0.toString() + "' to a '" + toString() + "')");
            }
            if (yogaNodeJNIBase2.f17993a != null) {
                throw new IllegalStateException("Child already has a parent, it must be removed first.");
            }
            if (yogaNodeJNIBase.f17994b == null) {
                yogaNodeJNIBase.f17994b = new ArrayList(4);
            }
            yogaNodeJNIBase.f17994b.add(i, yogaNodeJNIBase2);
            yogaNodeJNIBase2.f17993a = yogaNodeJNIBase;
            YogaNative.jni_YGNodeInsertChildJNI(yogaNodeJNIBase.f17997e, yogaNodeJNIBase2.f17997e, i);
        }
        mo2191t();
        int iM2186o = em0.m2186o();
        this.f2659k += iM2186o;
        m2175F(iM2186o);
    }

    /* renamed from: h */
    public final void m2179h(float f, float f2) {
        YogaNodeJNIBase yogaNodeJNIBase = this.f2669u;
        yogaNodeJNIBase.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(yogaNodeJNIBase);
        for (int i = 0; i < arrayList.size(); i++) {
            ArrayList arrayList2 = ((YogaNodeJNIBase) arrayList.get(i)).f17994b;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    YogaNodeJNIBase yogaNodeJNIBase2 = (YogaNodeJNIBase) it.next();
                    yogaNodeJNIBase2.getClass();
                    arrayList.add(yogaNodeJNIBase2);
                }
            }
        }
        YogaNodeJNIBase[] yogaNodeJNIBaseArr = (YogaNodeJNIBase[]) arrayList.toArray(new YogaNodeJNIBase[arrayList.size()]);
        long[] jArr = new long[yogaNodeJNIBaseArr.length];
        for (int i2 = 0; i2 < yogaNodeJNIBaseArr.length; i2++) {
            jArr[i2] = yogaNodeJNIBaseArr[i2].f17997e;
        }
        YogaNative.jni_YGNodeCalculateLayoutJNI(yogaNodeJNIBase.f17997e, f, f2, jArr, yogaNodeJNIBaseArr);
    }

    /* renamed from: i */
    public final void m2180i() {
        if (!mo1653c()) {
            YogaNative.jni_YGNodeMarkDirtyJNI(this.f2669u.f17997e);
            return;
        }
        EM0 em0 = this.f2656h;
        if (em0 != null) {
            em0.m2180i();
        }
    }

    /* renamed from: j */
    public final EM0 m2181j(int i) {
        ArrayList arrayList = this.f2655g;
        if (arrayList != null) {
            return (EM0) arrayList.get(i);
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC7222ym.m26230g(i, "Index ", " out of bounds: node has no children"));
    }

    /* renamed from: k */
    public final int m2182k() {
        ArrayList arrayList = this.f2655g;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    /* renamed from: l */
    public final EnumC10323mu0 m2183l() {
        return (mo1653c() || this.f2658j) ? EnumC10323mu0.f37987c : mo2188q() ? EnumC10323mu0.f37986b : EnumC10323mu0.f37985a;
    }

    /* renamed from: m */
    public final int m2184m(EM0 em0) {
        int iM2186o = 0;
        for (int i = 0; i < m2182k(); i++) {
            EM0 em0M2181j = m2181j(i);
            if (em0 == em0M2181j) {
                return iM2186o;
            }
            iM2186o += em0M2181j.m2186o();
        }
        throw new RuntimeException("Child " + em0.f2649a + " was not a child of " + this.f2649a);
    }

    /* renamed from: n */
    public final float m2185n(int i) {
        return this.f2669u.m11094f(F91.m2534q(i));
    }

    /* renamed from: o */
    public final int m2186o() {
        EnumC10323mu0 enumC10323mu0M2183l = m2183l();
        if (enumC10323mu0M2183l == EnumC10323mu0.f37987c) {
            return this.f2659k;
        }
        if (enumC10323mu0M2183l == EnumC10323mu0.f37986b) {
            return this.f2659k + 1;
        }
        return 1;
    }

    /* renamed from: p */
    public final boolean m2187p() {
        YogaNodeJNIBase yogaNodeJNIBase = this.f2669u;
        return yogaNodeJNIBase != null && yogaNodeJNIBase.m11098k();
    }

    /* renamed from: q */
    public boolean mo2188q() {
        return false;
    }

    /* renamed from: r */
    public boolean mo2189r() {
        return this instanceof C8716aN0;
    }

    /* renamed from: s */
    public boolean mo2190s() {
        return this.f2669u.f17995c != null;
    }

    /* renamed from: t */
    public void mo2191t() {
        if (this.f2654f) {
            return;
        }
        this.f2654f = true;
        EM0 em0 = this.f2656h;
        if (em0 != null) {
            em0.mo2191t();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.f2650b);
        sb.append(" ");
        return AbstractC1374Vq.m8591j(sb, this.f2649a, "]");
    }

    /* renamed from: v */
    public final EM0 m2193v(int i) {
        ArrayList arrayList = this.f2655g;
        if (arrayList == null) {
            throw new ArrayIndexOutOfBoundsException(AbstractC7222ym.m26230g(i, "Index ", " out of bounds: node has no children"));
        }
        EM0 em0 = (EM0) arrayList.remove(i);
        em0.f2656h = null;
        YogaNodeJNIBase yogaNodeJNIBase = this.f2669u;
        if (yogaNodeJNIBase != null && !mo2190s()) {
            yogaNodeJNIBase.m11100m(i);
        }
        mo2191t();
        int iM2186o = em0.m2186o();
        this.f2659k -= iM2186o;
        m2175F(-iM2186o);
        return em0;
    }

    /* renamed from: w */
    public final void m2194w(int i) {
        YogaNative.jni_YGNodeStyleSetAlignContentJNI(this.f2669u.f17997e, AbstractC7222ym.m26247x(i));
    }

    /* renamed from: x */
    public final void m2195x(int i) {
        YogaNative.jni_YGNodeStyleSetAlignItemsJNI(this.f2669u.f17997e, AbstractC7222ym.m26247x(i));
    }

    /* renamed from: y */
    public final void m2196y(int i) {
        YogaNative.jni_YGNodeStyleSetAlignSelfJNI(this.f2669u.f17997e, AbstractC7222ym.m26247x(i));
    }

    /* renamed from: z */
    public final void m2197z(int i) {
        YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(this.f2669u.f17997e, AbstractC7222ym.m26247x(i));
    }

    @Override // p000.DM0
    /* renamed from: b */
    public void mo1652b(C10910rT1 c10910rT1) {
    }

    @Override // p000.DM0
    /* renamed from: e */
    public void mo1655e(Object obj) {
    }

    /* renamed from: u */
    public void mo2192u(C11827yf1 c11827yf1) {
    }
}
