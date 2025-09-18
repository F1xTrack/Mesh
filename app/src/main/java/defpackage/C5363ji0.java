package defpackage;

import java.util.TreeSet;

/* renamed from: ji0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5363ji0 {
    public final long a;
    public final TreeSet b = new TreeSet(new C0350Eg(15));
    public long c;

    public C5363ji0(long j) {
        this.a = j;
    }

    public final void a(N01 n01, long j) {
        while (this.c + j > this.a && !this.b.isEmpty()) {
            AbstractC5371jl abstractC5371jl = (AbstractC5371jl) this.b.first();
            synchronized (n01) {
                n01.k(abstractC5371jl);
            }
        }
    }

    public final void b(N01 n01, P01 p01) {
        this.b.add(p01);
        this.c += p01.c;
        a(n01, 0L);
    }
}
