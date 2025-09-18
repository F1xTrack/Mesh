package io.sentry;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* renamed from: io.sentry.v0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5177v0 implements G0, H0, Q, b2, V, W, ILogger {
    public static final C5177v0 b = new C5177v0(0);
    public static final C5177v0 c = new C5177v0(1);
    public static final C5177v0 d = new C5177v0(2);
    public static final C5177v0 e = new C5177v0(3);
    public static final C5177v0 f = new C5177v0(4);
    public final /* synthetic */ int a;

    public /* synthetic */ C5177v0(int i) {
        this.a = i;
    }

    @Override // io.sentry.ILogger
    public void c(EnumC5148n1 enumC5148n1, Throwable th, String str, Object... objArr) {
        PrintStream printStream = System.out;
        String str2 = String.format(str, objArr);
        String string = th.toString();
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        printStream.println(enumC5148n1 + ": " + str2 + " \n " + string + "\n" + stringWriter.toString());
    }

    @Override // io.sentry.b2
    public void close() {
        int i = this.a;
    }

    @Override // io.sentry.ILogger
    public void d(EnumC5148n1 enumC5148n1, String str, Throwable th) {
        if (th == null) {
            k(enumC5148n1, str, new Object[0]);
            return;
        }
        PrintStream printStream = System.out;
        String str2 = String.format(str, th.toString());
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        printStream.println(enumC5148n1 + ": " + str2 + "\n" + stringWriter.toString());
    }

    @Override // io.sentry.V
    public E0 i(M1 m1, List list, D1 d1) {
        return null;
    }

    @Override // io.sentry.Q
    public boolean isClosed() {
        return false;
    }

    @Override // io.sentry.V
    public boolean isRunning() {
        return false;
    }

    @Override // io.sentry.b2
    public List j(U u) {
        return null;
    }

    @Override // io.sentry.ILogger
    public void k(EnumC5148n1 enumC5148n1, String str, Object... objArr) {
        System.out.println(enumC5148n1 + ": " + String.format(str, objArr));
    }

    @Override // io.sentry.ILogger
    public boolean l(EnumC5148n1 enumC5148n1) {
        return true;
    }

    @Override // io.sentry.G0
    public io.sentry.rrweb.b m(C5122f c5122f) {
        return null;
    }

    @Override // io.sentry.W
    public io.sentry.transport.f n(D1 d1, io.sentry.internal.debugmeta.c cVar) {
        return new io.sentry.transport.c(d1, new io.sentry.transport.m(d1), d1.getTransportGate(), cVar);
    }

    @Override // io.sentry.H0
    /* renamed from: p */
    public G0 getM() {
        return b;
    }

    @Override // io.sentry.H0
    public void start() {
        int i = this.a;
    }

    @Override // io.sentry.Q
    public Future submit(Runnable runnable) {
        return new FutureTask(new CallableC5188z(1));
    }

    @Override // io.sentry.Q
    public Future t(Runnable runnable, long j) {
        return new FutureTask(new CallableC5188z(1));
    }

    private final void q() {
    }

    private final void r() {
    }

    private final void s() {
    }

    private final void u() {
    }

    @Override // io.sentry.H0
    public void pause() {
    }

    @Override // io.sentry.H0
    public void resume() {
    }

    @Override // io.sentry.H0
    public void stop() {
    }

    @Override // io.sentry.H0
    public void a(Boolean bool) {
    }

    @Override // io.sentry.b2
    public void b(P1 p1) {
    }

    @Override // io.sentry.Q
    public void e(long j) {
    }

    @Override // io.sentry.b2
    public void f(P1 p1) {
    }

    @Override // io.sentry.b2
    public void g(M1 m1) {
    }

    @Override // io.sentry.V
    public void h(M1 m1) {
    }

    @Override // io.sentry.H0
    public void o(G0 g0) {
    }
}
