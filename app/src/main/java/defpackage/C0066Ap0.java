package defpackage;

import android.util.Pair;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;

/* renamed from: Ap0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0066Ap0 {
    public final Object a;
    public final Object b;
    public final InterfaceC3403dV0[] c;
    public boolean d;
    public boolean e;
    public C0144Bp0 f;
    public boolean g;
    public final boolean[] h;
    public final AbstractC0038Ag[] i;
    public final AbstractC6715qn0 j;
    public final C1547Tp0 k;
    public C0066Ap0 l;
    public C1350Rb1 m;
    public C2359bc1 n;
    public long o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v9, types: [lt] */
    public C0066Ap0(AbstractC0038Ag[] abstractC0038AgArr, long j, AbstractC6715qn0 abstractC6715qn0, C5272jE c5272jE, C1547Tp0 c1547Tp0, C0144Bp0 c0144Bp0, C2359bc1 c2359bc1) {
        this.i = abstractC0038AgArr;
        this.o = j;
        this.j = abstractC6715qn0;
        this.k = c1547Tp0;
        C0456Fp0 c0456Fp0 = c0144Bp0.a;
        this.b = c0456Fp0.a;
        this.f = c0144Bp0;
        this.m = C1350Rb1.d;
        this.n = c2359bc1;
        this.c = new InterfaceC3403dV0[abstractC0038AgArr.length];
        this.h = new boolean[abstractC0038AgArr.length];
        c1547Tp0.getClass();
        int i = SB0.k;
        Pair pair = (Pair) c0456Fp0.a;
        Object obj = pair.first;
        C0456Fp0 c0456Fp0A = c0456Fp0.a(pair.second);
        C1469Sp0 c1469Sp0 = (C1469Sp0) ((HashMap) c1547Tp0.e).get(obj);
        c1469Sp0.getClass();
        ((HashSet) c1547Tp0.h).add(c1469Sp0);
        C1391Rp0 c1391Rp0 = (C1391Rp0) ((HashMap) c1547Tp0.f).get(c1469Sp0);
        if (c1391Rp0 != null) {
            c1391Rp0.a.e(c1391Rp0.b);
        }
        c1469Sp0.c.add(c0456Fp0A);
        C0294Dn0 c0294Dn0B = c1469Sp0.a.b(c0456Fp0A, c5272jE, c0144Bp0.b);
        ((IdentityHashMap) c1547Tp0.d).put(c0294Dn0B, c1469Sp0);
        c1547Tp0.d();
        long j2 = c0144Bp0.d;
        this.a = j2 != -9223372036854775807L ? new C5777lt(c0294Dn0B, true, 0L, j2) : c0294Dn0B;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, zp0] */
    public final long a(C2359bc1 c2359bc1, long j, boolean z, boolean[] zArr) {
        AbstractC0038Ag[] abstractC0038AgArr;
        InterfaceC3403dV0[] interfaceC3403dV0Arr;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= c2359bc1.a) {
                break;
            }
            if (z || !c2359bc1.f(this.n, i)) {
                z2 = false;
            }
            this.h[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            abstractC0038AgArr = this.i;
            int length = abstractC0038AgArr.length;
            interfaceC3403dV0Arr = this.c;
            if (i2 >= length) {
                break;
            }
            if (abstractC0038AgArr[i2].b == -2) {
                interfaceC3403dV0Arr[i2] = null;
            }
            i2++;
        }
        b();
        this.n = c2359bc1;
        c();
        long jD = this.a.d((InterfaceC5311jR[]) c2359bc1.c, this.h, this.c, zArr, j);
        for (int i3 = 0; i3 < abstractC0038AgArr.length; i3++) {
            if (abstractC0038AgArr[i3].b == -2 && this.n.g(i3)) {
                interfaceC3403dV0Arr[i3] = new QN();
            }
        }
        this.e = false;
        for (int i4 = 0; i4 < interfaceC3403dV0Arr.length; i4++) {
            if (interfaceC3403dV0Arr[i4] != null) {
                YN1.f(c2359bc1.g(i4));
                if (abstractC0038AgArr[i4].b != -2) {
                    this.e = true;
                }
            } else {
                YN1.f(((InterfaceC5311jR[]) c2359bc1.c)[i4] == null);
            }
        }
        return jD;
    }

    public final void b() {
        if (this.l != null) {
            return;
        }
        int i = 0;
        while (true) {
            C2359bc1 c2359bc1 = this.n;
            if (i >= c2359bc1.a) {
                return;
            }
            boolean zG = c2359bc1.g(i);
            InterfaceC5311jR interfaceC5311jR = ((InterfaceC5311jR[]) this.n.c)[i];
            if (zG && interfaceC5311jR != null) {
                interfaceC5311jR.disable();
            }
            i++;
        }
    }

    public final void c() {
        if (this.l != null) {
            return;
        }
        int i = 0;
        while (true) {
            C2359bc1 c2359bc1 = this.n;
            if (i >= c2359bc1.a) {
                return;
            }
            boolean zG = c2359bc1.g(i);
            InterfaceC5311jR interfaceC5311jR = ((InterfaceC5311jR[]) this.n.c)[i];
            if (zG && interfaceC5311jR != null) {
                interfaceC5311jR.enable();
            }
            i++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [gY0, java.lang.Object] */
    public final long d() {
        if (!this.d) {
            return this.f.b;
        }
        long jS = this.e ? this.a.s() : Long.MIN_VALUE;
        return jS == Long.MIN_VALUE ? this.f.e : jS;
    }

    public final long e() {
        return this.f.b + this.o;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [gY0, java.lang.Object] */
    public final boolean f() {
        return this.d && (!this.e || this.a.s() == Long.MIN_VALUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, zp0] */
    public final void g() {
        b();
        ?? r0 = this.a;
        try {
            boolean z = r0 instanceof C5777lt;
            C1547Tp0 c1547Tp0 = this.k;
            if (z) {
                c1547Tp0.h(((C5777lt) r0).a);
            } else {
                c1547Tp0.h(r0);
            }
        } catch (RuntimeException e) {
            AbstractC6789rA1.e("Period release failed.", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x034a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.C2359bc1 h(float r33, defpackage.AbstractC0178Ca1 r34) {
        /*
            Method dump skipped, instructions count: 1976
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0066Ap0.h(float, Ca1):bc1");
    }

    public final void i() {
        Object obj = this.a;
        if (obj instanceof C5777lt) {
            long j = this.f.d;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            C5777lt c5777lt = (C5777lt) obj;
            c5777lt.e = 0L;
            c5777lt.f = j;
        }
    }
}
