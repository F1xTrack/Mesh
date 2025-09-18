package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: q30, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6576q30 extends AbstractC7530v30 {
    public final int d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final boolean i;
    public final int j;
    public final long k;
    public final int l;
    public final long m;
    public final long n;
    public final boolean o;
    public final boolean p;
    public final JL q;
    public final P70 r;
    public final P70 s;
    public final C5500kQ0 t;
    public final long u;
    public final C6385p30 v;

    public C6576q30(int i, String str, List list, long j, boolean z, long j2, boolean z2, int i2, long j3, int i3, long j4, long j5, boolean z3, boolean z4, boolean z5, JL jl, List list2, List list3, C6385p30 c6385p30, Map map) {
        super(str, list, z3);
        this.d = i;
        this.h = j2;
        this.g = z;
        this.i = z2;
        this.j = i2;
        this.k = j3;
        this.l = i3;
        this.m = j4;
        this.n = j5;
        this.o = z4;
        this.p = z5;
        this.q = jl;
        this.r = P70.u(list2);
        this.s = P70.u(list3);
        this.t = C5500kQ0.b(map);
        if (!list3.isEmpty()) {
            C5621l30 c5621l30 = (C5621l30) AbstractC7337u22.b(list3);
            this.u = c5621l30.e + c5621l30.c;
        } else if (list2.isEmpty()) {
            this.u = 0L;
        } else {
            C6003n30 c6003n30 = (C6003n30) AbstractC7337u22.b(list2);
            this.u = c6003n30.e + c6003n30.c;
        }
        this.e = j != -9223372036854775807L ? j >= 0 ? Math.min(this.u, j) : Math.max(0L, this.u + j) : -9223372036854775807L;
        this.f = j >= 0;
        this.v = c6385p30;
    }

    @Override // defpackage.InterfaceC7420uU
    public final Object a(List list) {
        return this;
    }
}
