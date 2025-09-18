package p000;

import android.util.Pair;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;

/* renamed from: Ap0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7344Ap0 {

    /* renamed from: a */
    public final Object f383a;

    /* renamed from: b */
    public final Object f384b;

    /* renamed from: c */
    public final InterfaceC9121dV0[] f385c;

    /* renamed from: d */
    public boolean f386d;

    /* renamed from: e */
    public boolean f387e;

    /* renamed from: f */
    public C7396Bp0 f388f;

    /* renamed from: g */
    public boolean f389g;

    /* renamed from: h */
    public final boolean[] f390h;

    /* renamed from: i */
    public final AbstractC0043Ag[] f391i;

    /* renamed from: j */
    public final AbstractC10821qn0 f392j;

    /* renamed from: k */
    public final C8332Tp0 f393k;

    /* renamed from: l */
    public C7344Ap0 f394l;

    /* renamed from: m */
    public C8201Rb1 f395m;

    /* renamed from: n */
    public C8875bc1 f396n;

    /* renamed from: o */
    public long f397o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v9, types: [lt] */
    public C7344Ap0(AbstractC0043Ag[] abstractC0043AgArr, long j, AbstractC10821qn0 abstractC10821qn0, C6224jE c6224jE, C8332Tp0 c8332Tp0, C7396Bp0 c7396Bp0, C8875bc1 c8875bc1) {
        this.f391i = abstractC0043AgArr;
        this.f397o = j;
        this.f392j = abstractC10821qn0;
        this.f393k = c8332Tp0;
        C7604Fp0 c7604Fp0 = c7396Bp0.f1042a;
        this.f384b = c7604Fp0.f3430a;
        this.f388f = c7396Bp0;
        this.f395m = C8201Rb1.f10320d;
        this.f396n = c8875bc1;
        this.f385c = new InterfaceC9121dV0[abstractC0043AgArr.length];
        this.f390h = new boolean[abstractC0043AgArr.length];
        c8332Tp0.getClass();
        int i = SB0.f10610k;
        Pair pair = (Pair) c7604Fp0.f3430a;
        Object obj = pair.first;
        C7604Fp0 c7604Fp0M2790a = c7604Fp0.m2790a(pair.second);
        C8280Sp0 c8280Sp0 = (C8280Sp0) ((HashMap) c8332Tp0.f11540e).get(obj);
        c8280Sp0.getClass();
        ((HashSet) c8332Tp0.f11543h).add(c8280Sp0);
        C8228Rp0 c8228Rp0 = (C8228Rp0) ((HashMap) c8332Tp0.f11541f).get(c8280Sp0);
        if (c8228Rp0 != null) {
            c8228Rp0.f10440a.m24440e(c8228Rp0.f10441b);
        }
        c8280Sp0.f10998c.add(c7604Fp0M2790a);
        C7496Dn0 c7496Dn0Mo3162b = c8280Sp0.f10996a.mo3162b(c7604Fp0M2790a, c6224jE, c7396Bp0.f1043b);
        ((IdentityHashMap) c8332Tp0.f11539d).put(c7496Dn0Mo3162b, c8280Sp0);
        c8332Tp0.m7780d();
        long j2 = c7396Bp0.f1045d;
        this.f383a = j2 != -9223372036854775807L ? new C6391lt(c7496Dn0Mo3162b, true, 0L, j2) : c7496Dn0Mo3162b;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, zp0] */
    /* renamed from: a */
    public final long m325a(C8875bc1 c8875bc1, long j, boolean z, boolean[] zArr) {
        AbstractC0043Ag[] abstractC0043AgArr;
        InterfaceC9121dV0[] interfaceC9121dV0Arr;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= c8875bc1.f17088a) {
                break;
            }
            if (z || !c8875bc1.m10466f(this.f396n, i)) {
                z2 = false;
            }
            this.f390h[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            abstractC0043AgArr = this.f391i;
            int length = abstractC0043AgArr.length;
            interfaceC9121dV0Arr = this.f385c;
            if (i2 >= length) {
                break;
            }
            if (abstractC0043AgArr[i2].f307b == -2) {
                interfaceC9121dV0Arr[i2] = null;
            }
            i2++;
        }
        m326b();
        this.f396n = c8875bc1;
        m327c();
        long jMo1879d = this.f383a.mo1879d((InterfaceC6237jR[]) c8875bc1.f17090c, this.f390h, this.f385c, zArr, j);
        for (int i3 = 0; i3 < abstractC0043AgArr.length; i3++) {
            if (abstractC0043AgArr[i3].f307b == -2 && this.f396n.m10467g(i3)) {
                interfaceC9121dV0Arr[i3] = new C1031QN();
            }
        }
        this.f387e = false;
        for (int i4 = 0; i4 < interfaceC9121dV0Arr.length; i4++) {
            if (interfaceC9121dV0Arr[i4] != null) {
                YN1.m9281f(c8875bc1.m10467g(i4));
                if (abstractC0043AgArr[i4].f307b != -2) {
                    this.f387e = true;
                }
            } else {
                YN1.m9281f(((InterfaceC6237jR[]) c8875bc1.f17090c)[i4] == null);
            }
        }
        return jMo1879d;
    }

    /* renamed from: b */
    public final void m326b() {
        if (this.f394l != null) {
            return;
        }
        int i = 0;
        while (true) {
            C8875bc1 c8875bc1 = this.f396n;
            if (i >= c8875bc1.f17088a) {
                return;
            }
            boolean zM10467g = c8875bc1.m10467g(i);
            InterfaceC6237jR interfaceC6237jR = ((InterfaceC6237jR[]) this.f396n.f17090c)[i];
            if (zM10467g && interfaceC6237jR != null) {
                interfaceC6237jR.disable();
            }
            i++;
        }
    }

    /* renamed from: c */
    public final void m327c() {
        if (this.f394l != null) {
            return;
        }
        int i = 0;
        while (true) {
            C8875bc1 c8875bc1 = this.f396n;
            if (i >= c8875bc1.f17088a) {
                return;
            }
            boolean zM10467g = c8875bc1.m10467g(i);
            InterfaceC6237jR interfaceC6237jR = ((InterfaceC6237jR[]) this.f396n.f17090c)[i];
            if (zM10467g && interfaceC6237jR != null) {
                interfaceC6237jR.enable();
            }
            i++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [gY0, java.lang.Object] */
    /* renamed from: d */
    public final long m328d() {
        if (!this.f386d) {
            return this.f388f.f1043b;
        }
        long jMo1890s = this.f387e ? this.f383a.mo1890s() : Long.MIN_VALUE;
        return jMo1890s == Long.MIN_VALUE ? this.f388f.f1046e : jMo1890s;
    }

    /* renamed from: e */
    public final long m329e() {
        return this.f388f.f1043b + this.f397o;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [gY0, java.lang.Object] */
    /* renamed from: f */
    public final boolean m330f() {
        return this.f386d && (!this.f387e || this.f383a.mo1890s() == Long.MIN_VALUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, zp0] */
    /* renamed from: g */
    public final void m331g() {
        m326b();
        ?? r0 = this.f383a;
        try {
            boolean z = r0 instanceof C6391lt;
            C8332Tp0 c8332Tp0 = this.f393k;
            if (z) {
                c8332Tp0.m7784h(((C6391lt) r0).f37332a);
            } else {
                c8332Tp0.m7784h(r0);
            }
        } catch (RuntimeException e) {
            AbstractC10872rA1.m24172e("Period release failed.", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x034a  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.C8875bc1 m332h(float r33, p000.AbstractC7419Ca1 r34) {
        /*
            Method dump skipped, instructions count: 1976
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C7344Ap0.m332h(float, Ca1):bc1");
    }

    /* renamed from: i */
    public final void m333i() {
        Object obj = this.f383a;
        if (obj instanceof C6391lt) {
            long j = this.f388f.f1045d;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            C6391lt c6391lt = (C6391lt) obj;
            c6391lt.f37336e = 0L;
            c6391lt.f37337f = j;
        }
    }
}
