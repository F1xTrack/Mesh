package p000;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: HX */
/* loaded from: classes2.dex */
public final class C0475HX extends C7523Ea1 {

    /* renamed from: e */
    public C7523Ea1 f4333e;

    public C0475HX(C7523Ea1 c7523Ea1) {
        O90.m5968f(c7523Ea1, "delegate");
        this.f4333e = c7523Ea1;
    }

    @Override // p000.C7523Ea1
    /* renamed from: a */
    public final C7523Ea1 mo2356a() {
        return this.f4333e.mo2356a();
    }

    @Override // p000.C7523Ea1
    /* renamed from: b */
    public final C7523Ea1 mo2357b() {
        return this.f4333e.mo2357b();
    }

    @Override // p000.C7523Ea1
    /* renamed from: c */
    public final long mo2358c() {
        return this.f4333e.mo2358c();
    }

    @Override // p000.C7523Ea1
    /* renamed from: d */
    public final C7523Ea1 mo1728d(long j) {
        return this.f4333e.mo1728d(j);
    }

    @Override // p000.C7523Ea1
    /* renamed from: e */
    public final boolean mo2359e() {
        return this.f4333e.mo2359e();
    }

    @Override // p000.C7523Ea1
    /* renamed from: f */
    public final void mo1729f() throws InterruptedIOException {
        this.f4333e.mo1729f();
    }

    @Override // p000.C7523Ea1
    /* renamed from: g */
    public final C7523Ea1 mo1730g(long j, TimeUnit timeUnit) {
        O90.m5968f(timeUnit, "unit");
        return this.f4333e.mo1730g(j, timeUnit);
    }

    @Override // p000.C7523Ea1
    /* renamed from: h */
    public final long mo2360h() {
        return this.f4333e.mo2360h();
    }
}
