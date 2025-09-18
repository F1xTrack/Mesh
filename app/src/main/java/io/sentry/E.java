package io.sentry;

/* loaded from: classes2.dex */
public final class E implements J {
    public static final E a = new E();

    @Override // io.sentry.J
    public final D1 A() {
        return S0.c().A();
    }

    @Override // io.sentry.J
    public final U B() {
        return S0.c().B();
    }

    @Override // io.sentry.J
    public final io.sentry.protocol.t C(io.sentry.protocol.A a2, Y1 y1, C5185y c5185y, E0 e0) {
        return S0.c().C(a2, y1, c5185y, e0);
    }

    @Override // io.sentry.J
    public final void D() {
        S0.c().D();
    }

    @Override // io.sentry.J
    public final void E() {
        S0.c().E();
    }

    @Override // io.sentry.J
    public final io.sentry.protocol.t F(C5133i1 c5133i1, C5185y c5185y) {
        return S0.c().F(c5133i1, c5185y);
    }

    public final void a(C5122f c5122f) {
        v(c5122f, new C5185y());
    }

    @Override // io.sentry.J
    public final void b(boolean z) {
        S0.a();
    }

    @Override // io.sentry.J
    public final boolean isEnabled() {
        return S0.c().isEnabled();
    }

    @Override // io.sentry.J
    public final io.sentry.transport.m q() {
        return S0.c().q();
    }

    @Override // io.sentry.J
    public final boolean s() {
        return S0.c().s();
    }

    @Override // io.sentry.J
    public final void t(long j) {
        S0.c().t(j);
    }

    @Override // io.sentry.J
    public final U u(Z1 z1, a2 a2Var) {
        return S0.c().u(z1, a2Var);
    }

    @Override // io.sentry.J
    public final void v(C5122f c5122f, C5185y c5185y) {
        S0.c().v(c5122f, c5185y);
    }

    @Override // io.sentry.J
    public final void w(M0 m0) {
        S0.b(m0);
    }

    @Override // io.sentry.J
    public final Boolean x() {
        return S0.c().x();
    }

    @Override // io.sentry.J
    public final io.sentry.protocol.t y(io.sentry.internal.debugmeta.c cVar, C5185y c5185y) {
        return S0.c().y(cVar, c5185y);
    }

    @Override // io.sentry.J
    public final io.sentry.protocol.t z(F1 f1, C5185y c5185y) {
        return S0.c().z(f1, c5185y);
    }

    @Override // io.sentry.J
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final J m93clone() {
        return S0.c().m93clone();
    }
}
