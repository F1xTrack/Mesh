package io.sentry;

import io.sentry.internal.debugmeta.C6042c;
import io.sentry.rrweb.AbstractC6131b;
import io.sentry.transport.C6151c;
import io.sentry.transport.C6161m;
import io.sentry.transport.InterfaceC6154f;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* renamed from: io.sentry.v0 */
/* loaded from: classes2.dex */
public final class C6180v0 implements InterfaceC5767G0, InterfaceC5770H0, InterfaceC5796Q, InterfaceC5982b2, InterfaceC5810V, InterfaceC5813W, ILogger {

    /* renamed from: b */
    public static final C6180v0 f34672b = new C6180v0(0);

    /* renamed from: c */
    public static final C6180v0 f34673c = new C6180v0(1);

    /* renamed from: d */
    public static final C6180v0 f34674d = new C6180v0(2);

    /* renamed from: e */
    public static final C6180v0 f34675e = new C6180v0(3);

    /* renamed from: f */
    public static final C6180v0 f34676f = new C6180v0(4);

    /* renamed from: a */
    public final /* synthetic */ int f34677a;

    public /* synthetic */ C6180v0(int i) {
        this.f34677a = i;
    }

    @Override // io.sentry.ILogger
    /* renamed from: c */
    public void mo21405c(EnumC6069n1 enumC6069n1, Throwable th, String str, Object... objArr) {
        PrintStream printStream = System.out;
        String str2 = String.format(str, objArr);
        String string = th.toString();
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        printStream.println(enumC6069n1 + ": " + str2 + " \n " + string + "\n" + stringWriter.toString());
    }

    @Override // io.sentry.InterfaceC5982b2
    public void close() {
        int i = this.f34677a;
    }

    @Override // io.sentry.ILogger
    /* renamed from: d */
    public void mo21406d(EnumC6069n1 enumC6069n1, String str, Throwable th) {
        if (th == null) {
            mo21407k(enumC6069n1, str, new Object[0]);
            return;
        }
        PrintStream printStream = System.out;
        String str2 = String.format(str, th.toString());
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        printStream.println(enumC6069n1 + ": " + str2 + "\n" + stringWriter.toString());
    }

    @Override // io.sentry.InterfaceC5810V
    /* renamed from: i */
    public C5761E0 mo21472i(C5786M1 c5786m1, List list, C5759D1 c5759d1) {
        return null;
    }

    @Override // io.sentry.InterfaceC5796Q
    public boolean isClosed() {
        return false;
    }

    @Override // io.sentry.InterfaceC5810V
    public boolean isRunning() {
        return false;
    }

    @Override // io.sentry.InterfaceC5982b2
    /* renamed from: j */
    public List mo21697j(InterfaceC5807U interfaceC5807U) {
        return null;
    }

    @Override // io.sentry.ILogger
    /* renamed from: k */
    public void mo21407k(EnumC6069n1 enumC6069n1, String str, Object... objArr) {
        System.out.println(enumC6069n1 + ": " + String.format(str, objArr));
    }

    @Override // io.sentry.ILogger
    /* renamed from: l */
    public boolean mo21408l(EnumC6069n1 enumC6069n1) {
        return true;
    }

    @Override // io.sentry.InterfaceC5767G0
    /* renamed from: m */
    public AbstractC6131b mo21387m(C6017f c6017f) {
        return null;
    }

    @Override // io.sentry.InterfaceC5813W
    /* renamed from: n */
    public InterfaceC6154f mo21474n(C5759D1 c5759d1, C6042c c6042c) {
        return new C6151c(c5759d1, new C6161m(c5759d1), c5759d1.getTransportGate(), c6042c);
    }

    @Override // io.sentry.InterfaceC5770H0
    /* renamed from: p */
    public InterfaceC5767G0 getF33890m() {
        return f34672b;
    }

    @Override // io.sentry.InterfaceC5770H0
    public void start() {
        int i = this.f34677a;
    }

    @Override // io.sentry.InterfaceC5796Q
    public Future submit(Runnable runnable) {
        return new FutureTask(new CallableC6196z(1));
    }

    @Override // io.sentry.InterfaceC5796Q
    /* renamed from: t */
    public Future mo13827t(Runnable runnable, long j) {
        return new FutureTask(new CallableC6196z(1));
    }

    /* renamed from: q */
    private final void m21885q() {
    }

    /* renamed from: r */
    private final void m21886r() {
    }

    /* renamed from: s */
    private final void m21887s() {
    }

    /* renamed from: u */
    private final void m21888u() {
    }

    @Override // io.sentry.InterfaceC5770H0
    public void pause() {
    }

    @Override // io.sentry.InterfaceC5770H0
    public void resume() {
    }

    @Override // io.sentry.InterfaceC5770H0
    public void stop() {
    }

    @Override // io.sentry.InterfaceC5770H0
    /* renamed from: a */
    public void mo21392a(Boolean bool) {
    }

    @Override // io.sentry.InterfaceC5982b2
    /* renamed from: b */
    public void mo21694b(C5795P1 c5795p1) {
    }

    @Override // io.sentry.InterfaceC5796Q
    /* renamed from: e */
    public void mo13812e(long j) {
    }

    @Override // io.sentry.InterfaceC5982b2
    /* renamed from: f */
    public void mo21695f(C5795P1 c5795p1) {
    }

    @Override // io.sentry.InterfaceC5982b2
    /* renamed from: g */
    public void mo21696g(C5786M1 c5786m1) {
    }

    @Override // io.sentry.InterfaceC5810V
    /* renamed from: h */
    public void mo21471h(C5786M1 c5786m1) {
    }

    @Override // io.sentry.InterfaceC5770H0
    /* renamed from: o */
    public void mo21393o(InterfaceC5767G0 interfaceC5767G0) {
    }
}
