package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class HX extends C0334Ea1 {
    public C0334Ea1 e;

    public HX(C0334Ea1 c0334Ea1) {
        O90.f(c0334Ea1, "delegate");
        this.e = c0334Ea1;
    }

    @Override // defpackage.C0334Ea1
    public final C0334Ea1 a() {
        return this.e.a();
    }

    @Override // defpackage.C0334Ea1
    public final C0334Ea1 b() {
        return this.e.b();
    }

    @Override // defpackage.C0334Ea1
    public final long c() {
        return this.e.c();
    }

    @Override // defpackage.C0334Ea1
    public final C0334Ea1 d(long j) {
        return this.e.d(j);
    }

    @Override // defpackage.C0334Ea1
    public final boolean e() {
        return this.e.e();
    }

    @Override // defpackage.C0334Ea1
    public final void f() throws InterruptedIOException {
        this.e.f();
    }

    @Override // defpackage.C0334Ea1
    public final C0334Ea1 g(long j, TimeUnit timeUnit) {
        O90.f(timeUnit, "unit");
        return this.e.g(j, timeUnit);
    }

    @Override // defpackage.C0334Ea1
    public final long h() {
        return this.e.h();
    }
}
