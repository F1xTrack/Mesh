package p000;

import java.util.TreeSet;

/* renamed from: ji0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9915ji0 {

    /* renamed from: a */
    public final long f35340a;

    /* renamed from: b */
    public final TreeSet f35341b = new TreeSet(new C0295Eg(15));

    /* renamed from: c */
    public long f35342c;

    public C9915ji0(long j) {
        this.f35340a = j;
    }

    /* renamed from: a */
    public final void m22093a(N01 n01, long j) {
        while (this.f35342c + j > this.f35340a && !this.f35341b.isEmpty()) {
            AbstractC6257jl abstractC6257jl = (AbstractC6257jl) this.f35341b.first();
            synchronized (n01) {
                n01.m5502k(abstractC6257jl);
            }
        }
    }

    /* renamed from: b */
    public final void m22094b(N01 n01, P01 p01) {
        this.f35341b.add(p01);
        this.f35342c += p01.f35355c;
        m22093a(n01, 0L);
    }
}
