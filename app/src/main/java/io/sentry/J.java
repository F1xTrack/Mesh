package io.sentry;

/* loaded from: classes2.dex */
public interface J {
    D1 A();

    U B();

    io.sentry.protocol.t C(io.sentry.protocol.A a, Y1 y1, C5185y c5185y, E0 e0);

    void D();

    void E();

    io.sentry.protocol.t F(C5133i1 c5133i1, C5185y c5185y);

    void b(boolean z);

    /* renamed from: clone */
    J m93clone();

    boolean isEnabled();

    io.sentry.transport.m q();

    boolean s();

    void t(long j);

    U u(Z1 z1, a2 a2Var);

    void v(C5122f c5122f, C5185y c5185y);

    void w(M0 m0);

    Boolean x();

    io.sentry.protocol.t y(io.sentry.internal.debugmeta.c cVar, C5185y c5185y);

    io.sentry.protocol.t z(F1 f1, C5185y c5185y);
}
