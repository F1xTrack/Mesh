package defpackage;

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
    public static final C0613Hp1 x;
    public int a;
    public String b;
    public int c;
    public S91 d;
    public boolean e;
    public ArrayList g;
    public EM0 h;
    public KJ0 i;
    public boolean j;
    public EM0 l;
    public ArrayList m;
    public int n;
    public int o;
    public int p;
    public int q;
    public final float[] s;
    public final YogaNodeJNIBase u;
    public Integer v;
    public Integer w;
    public boolean f = true;
    public int k = 0;
    public final boolean[] t = new boolean[9];
    public final Y21 r = new Y21(0.0f);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    static {
        Object value = AbstractC5682lN0.a.getValue();
        O90.e(value, "getValue(...)");
        x = (C0613Hp1) value;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    public EM0() {
        float[] fArr = new float[9];
        this.s = fArr;
        if (c()) {
            this.u = null;
            return;
        }
        YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) ((C1945Ys) AbstractC0925Lp1.a.getValue()).i();
        this.u = yogaNodeJNIBase == null ? new C0847Kp1(YogaNative.jni_YGNodeNewWithConfigJNI(x.a)) : yogaNodeJNIBase;
        Arrays.fill(fArr, Float.NaN);
    }

    public final void A(boolean z) {
        UN1.b(this.h == null, "Must remove from no opt parent first");
        UN1.b(this.l == null, "Must remove from native parent first");
        ArrayList arrayList = this.m;
        UN1.b((arrayList == null ? 0 : arrayList.size()) == 0, "Must remove all native children first");
        this.j = z;
    }

    public final void B(int i) {
        YogaNative.jni_YGNodeStyleSetJustifyContentJNI(this.u.e, AbstractC8235ym.x(i));
    }

    public final void C(float f, int i) {
        YogaNative.jni_YGNodeStyleSetMarginJNI(this.u.e, AbstractC8235ym.x(F91.q(i)), f);
    }

    public final void D(InterfaceC0691Ip1 interfaceC0691Ip1) {
        YogaNodeJNIBase yogaNodeJNIBase = this.u;
        yogaNodeJNIBase.c = interfaceC0691Ip1;
        YogaNative.jni_YGNodeSetHasMeasureFuncJNI(yogaNodeJNIBase.e, true);
    }

    public void E(float f, int i) {
        this.s[i] = f;
        this.t[i] = false;
        G();
    }

    public final void F(int i) {
        if (l() != EnumC5972mu0.a) {
            for (EM0 em0 = this.h; em0 != null; em0 = em0.h) {
                em0.k += i;
                if (em0.l() == EnumC5972mu0.a) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G() {
        /*
            r6 = this;
            r0 = 0
        L1:
            r1 = 8
            if (r0 > r1) goto Lb8
            com.facebook.yoga.YogaNodeJNIBase r2 = r6.u
            float[] r3 = r6.s
            Y21 r4 = r6.r
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
            boolean r1 = defpackage.AbstractC7905x12.a(r1)
            if (r1 == 0) goto L8f
            int r1 = defpackage.F91.q(r0)
            float[] r3 = r4.b
            r3 = r3[r0]
            long r4 = r2.e
            int r1 = defpackage.AbstractC8235ym.x(r1)
            com.facebook.yoga.YogaNative.jni_YGNodeStyleSetPaddingJNI(r4, r1, r3)
            goto Lb4
        L39:
            r5 = r3[r0]
            boolean r5 = defpackage.AbstractC7905x12.a(r5)
            if (r5 == 0) goto L8f
            r5 = 7
            r5 = r3[r5]
            boolean r5 = defpackage.AbstractC7905x12.a(r5)
            if (r5 == 0) goto L8f
            r1 = r3[r1]
            boolean r1 = defpackage.AbstractC7905x12.a(r1)
            if (r1 == 0) goto L8f
            int r1 = defpackage.F91.q(r0)
            float[] r3 = r4.b
            r3 = r3[r0]
            long r4 = r2.e
            int r1 = defpackage.AbstractC8235ym.x(r1)
            com.facebook.yoga.YogaNative.jni_YGNodeStyleSetPaddingJNI(r4, r1, r3)
            goto Lb4
        L64:
            r5 = r3[r0]
            boolean r5 = defpackage.AbstractC7905x12.a(r5)
            if (r5 == 0) goto L8f
            r5 = 6
            r5 = r3[r5]
            boolean r5 = defpackage.AbstractC7905x12.a(r5)
            if (r5 == 0) goto L8f
            r1 = r3[r1]
            boolean r1 = defpackage.AbstractC7905x12.a(r1)
            if (r1 == 0) goto L8f
            int r1 = defpackage.F91.q(r0)
            float[] r3 = r4.b
            r3 = r3[r0]
            long r4 = r2.e
            int r1 = defpackage.AbstractC8235ym.x(r1)
            com.facebook.yoga.YogaNative.jni_YGNodeStyleSetPaddingJNI(r4, r1, r3)
            goto Lb4
        L8f:
            boolean[] r1 = r6.t
            boolean r1 = r1[r0]
            if (r1 == 0) goto La5
            int r1 = defpackage.F91.q(r0)
            r3 = r3[r0]
            long r4 = r2.e
            int r1 = defpackage.AbstractC8235ym.x(r1)
            com.facebook.yoga.YogaNative.jni_YGNodeStyleSetPaddingPercentJNI(r4, r1, r3)
            goto Lb4
        La5:
            int r1 = defpackage.F91.q(r0)
            r3 = r3[r0]
            long r4 = r2.e
            int r1 = defpackage.AbstractC8235ym.x(r1)
            com.facebook.yoga.YogaNative.jni_YGNodeStyleSetPaddingJNI(r4, r1, r3)
        Lb4:
            int r0 = r0 + 1
            goto L1
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.EM0.G():void");
    }

    public final void H(NM0 nm0) {
        Object[] objArr;
        HashMap map = AbstractC0676Ik1.a;
        C0520Gk1 c0520Gk1D = AbstractC0676Ik1.d(getClass());
        Iterator<Map.Entry<String, Object>> entryIterator = nm0.a.getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            String key = next.getKey();
            Object value = next.getValue();
            AbstractC1455Sk1 abstractC1455Sk1 = (AbstractC1455Sk1) c0520Gk1D.a.get(key);
            if (abstractC1455Sk1 != null) {
                Integer num = abstractC1455Sk1.d;
                if (num == null) {
                    try {
                        objArr = (Object[]) AbstractC1455Sk1.g.get();
                        S91 s91 = this.d;
                        UN1.c(s91);
                        objArr[0] = abstractC1455Sk1.a(s91, value);
                    } catch (Throwable th) {
                        AbstractC3393dS.g(ViewManager.class);
                        StringBuilder sb = new StringBuilder("Error while updating property '");
                        sb.append(abstractC1455Sk1.a);
                        sb.append("' in shadow node of type: ");
                        String str = this.b;
                        UN1.c(str);
                        sb.append(str);
                        throw new JSApplicationIllegalArgumentException(sb.toString(), th);
                    }
                } else {
                    Object[] objArr2 = (Object[]) AbstractC1455Sk1.h.get();
                    objArr2[0] = num;
                    S91 s912 = this.d;
                    UN1.c(s912);
                    objArr2[1] = abstractC1455Sk1.a(s912, value);
                    objArr = objArr2;
                }
                abstractC1455Sk1.c.invoke(this, objArr);
                Arrays.fill(objArr, (Object) null);
            }
        }
    }

    @Override // defpackage.DM0
    public ArrayList a() {
        if (r()) {
            return null;
        }
        return this.g;
    }

    @Override // defpackage.DM0
    public boolean c() {
        return this instanceof C5679lM0;
    }

    @Override // defpackage.DM0
    public void d(S91 s91) {
        this.d = s91;
    }

    @Override // defpackage.DM0
    /* renamed from: g */
    public void f(EM0 em0, int i) {
        if (this.g == null) {
            this.g = new ArrayList(4);
        }
        this.g.add(i, em0);
        em0.h = this;
        YogaNodeJNIBase yogaNodeJNIBase = this.u;
        if (yogaNodeJNIBase != null && !s()) {
            YogaNodeJNIBase yogaNodeJNIBase2 = em0.u;
            if (yogaNodeJNIBase2 == null) {
                throw new RuntimeException("Cannot add a child that doesn't have a YogaNode to a parent without a measure function! (Trying to add a '" + em0.toString() + "' to a '" + toString() + "')");
            }
            if (yogaNodeJNIBase2.a != null) {
                throw new IllegalStateException("Child already has a parent, it must be removed first.");
            }
            if (yogaNodeJNIBase.b == null) {
                yogaNodeJNIBase.b = new ArrayList(4);
            }
            yogaNodeJNIBase.b.add(i, yogaNodeJNIBase2);
            yogaNodeJNIBase2.a = yogaNodeJNIBase;
            YogaNative.jni_YGNodeInsertChildJNI(yogaNodeJNIBase.e, yogaNodeJNIBase2.e, i);
        }
        t();
        int iO = em0.o();
        this.k += iO;
        F(iO);
    }

    public final void h(float f, float f2) {
        YogaNodeJNIBase yogaNodeJNIBase = this.u;
        yogaNodeJNIBase.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(yogaNodeJNIBase);
        for (int i = 0; i < arrayList.size(); i++) {
            ArrayList arrayList2 = ((YogaNodeJNIBase) arrayList.get(i)).b;
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
            jArr[i2] = yogaNodeJNIBaseArr[i2].e;
        }
        YogaNative.jni_YGNodeCalculateLayoutJNI(yogaNodeJNIBase.e, f, f2, jArr, yogaNodeJNIBaseArr);
    }

    public final void i() {
        if (!c()) {
            YogaNative.jni_YGNodeMarkDirtyJNI(this.u.e);
            return;
        }
        EM0 em0 = this.h;
        if (em0 != null) {
            em0.i();
        }
    }

    public final EM0 j(int i) {
        ArrayList arrayList = this.g;
        if (arrayList != null) {
            return (EM0) arrayList.get(i);
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC8235ym.g(i, "Index ", " out of bounds: node has no children"));
    }

    public final int k() {
        ArrayList arrayList = this.g;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final EnumC5972mu0 l() {
        return (c() || this.j) ? EnumC5972mu0.c : q() ? EnumC5972mu0.b : EnumC5972mu0.a;
    }

    public final int m(EM0 em0) {
        int iO = 0;
        for (int i = 0; i < k(); i++) {
            EM0 em0J = j(i);
            if (em0 == em0J) {
                return iO;
            }
            iO += em0J.o();
        }
        throw new RuntimeException("Child " + em0.a + " was not a child of " + this.a);
    }

    public final float n(int i) {
        return this.u.f(F91.q(i));
    }

    public final int o() {
        EnumC5972mu0 enumC5972mu0L = l();
        if (enumC5972mu0L == EnumC5972mu0.c) {
            return this.k;
        }
        if (enumC5972mu0L == EnumC5972mu0.b) {
            return this.k + 1;
        }
        return 1;
    }

    public final boolean p() {
        YogaNodeJNIBase yogaNodeJNIBase = this.u;
        return yogaNodeJNIBase != null && yogaNodeJNIBase.k();
    }

    public boolean q() {
        return false;
    }

    public boolean r() {
        return this instanceof C2122aN0;
    }

    public boolean s() {
        return this.u.c != null;
    }

    public void t() {
        if (this.f) {
            return;
        }
        this.f = true;
        EM0 em0 = this.h;
        if (em0 != null) {
            em0.t();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.b);
        sb.append(" ");
        return AbstractC1705Vq.j(sb, this.a, "]");
    }

    public final EM0 v(int i) {
        ArrayList arrayList = this.g;
        if (arrayList == null) {
            throw new ArrayIndexOutOfBoundsException(AbstractC8235ym.g(i, "Index ", " out of bounds: node has no children"));
        }
        EM0 em0 = (EM0) arrayList.remove(i);
        em0.h = null;
        YogaNodeJNIBase yogaNodeJNIBase = this.u;
        if (yogaNodeJNIBase != null && !s()) {
            yogaNodeJNIBase.m(i);
        }
        t();
        int iO = em0.o();
        this.k -= iO;
        F(-iO);
        return em0;
    }

    public final void w(int i) {
        YogaNative.jni_YGNodeStyleSetAlignContentJNI(this.u.e, AbstractC8235ym.x(i));
    }

    public final void x(int i) {
        YogaNative.jni_YGNodeStyleSetAlignItemsJNI(this.u.e, AbstractC8235ym.x(i));
    }

    public final void y(int i) {
        YogaNative.jni_YGNodeStyleSetAlignSelfJNI(this.u.e, AbstractC8235ym.x(i));
    }

    public final void z(int i) {
        YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(this.u.e, AbstractC8235ym.x(i));
    }

    @Override // defpackage.DM0
    public void b(C6846rT1 c6846rT1) {
    }

    @Override // defpackage.DM0
    public void e(Object obj) {
    }

    public void u(C8216yf1 c8216yf1) {
    }
}
