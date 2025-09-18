package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.appmetrica.analytics.impl.P1 */
/* loaded from: classes2.dex */
public final class C4722P1 implements Thread.UncaughtExceptionHandler {

    /* renamed from: e */
    public static final AtomicBoolean f30593e = new AtomicBoolean();

    /* renamed from: a */
    public final InterfaceC4417Ca f30594a;

    /* renamed from: b */
    public final C4851Ub f30595b = C5388q4.m20928h().m20940k();

    /* renamed from: c */
    public final C5390q6 f30596c = new C5390q6();

    /* renamed from: d */
    public final C5631zm f30597d = new C5631zm();

    public C4722P1(C5315n6 c5315n6) {
        this.f30594a = c5315n6;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        StackTraceElement[] stackTrace;
        try {
            f30593e.set(true);
            InterfaceC4417Ca interfaceC4417Ca = this.f30594a;
            C5456sm c5456smApply = this.f30596c.apply(thread);
            C5631zm c5631zm = this.f30597d;
            Thread threadM21188a = ((C5556wm) c5631zm.f32938a).m21188a();
            ArrayList arrayListM21249a = c5631zm.m21249a(threadM21188a, thread);
            if (thread != threadM21188a) {
                try {
                    stackTrace = threadM21188a.getStackTrace();
                } catch (SecurityException unused) {
                    stackTrace = null;
                }
                arrayListM21249a.add(0, (C5456sm) c5631zm.f32939b.apply(threadM21188a, stackTrace));
            }
            interfaceC4417Ca.mo19267a(th, new C4815T(c5456smApply, arrayListM21249a, this.f30595b.m19886b()));
        } catch (Throwable th2) {
            LoggerStorage.getMainPublicOrAnonymousLogger().error(th2, th2.getMessage(), new Object[0]);
        }
    }
}
