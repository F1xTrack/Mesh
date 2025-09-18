package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class P1 implements Thread.UncaughtExceptionHandler {
    public static final AtomicBoolean e = new AtomicBoolean();
    public final Ca a;
    public final Ub b = C4805q4.h().k();
    public final C4807q6 c = new C4807q6();
    public final C5038zm d = new C5038zm();

    public P1(C4735n6 c4735n6) {
        this.a = c4735n6;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        StackTraceElement[] stackTrace;
        try {
            e.set(true);
            Ca ca = this.a;
            C4870sm c4870smApply = this.c.apply(thread);
            C5038zm c5038zm = this.d;
            Thread threadA = ((C4966wm) c5038zm.a).a();
            ArrayList arrayListA = c5038zm.a(threadA, thread);
            if (thread != threadA) {
                try {
                    stackTrace = threadA.getStackTrace();
                } catch (SecurityException unused) {
                    stackTrace = null;
                }
                arrayListA.add(0, (C4870sm) c5038zm.b.apply(threadA, stackTrace));
            }
            ca.a(th, new T(c4870smApply, arrayListA, this.b.b()));
        } catch (Throwable th2) {
            LoggerStorage.getMainPublicOrAnonymousLogger().error(th2, th2.getMessage(), new Object[0]);
        }
    }
}
