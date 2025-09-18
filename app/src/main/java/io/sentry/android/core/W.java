package io.sentry.android.core;

import defpackage.C8329zG;
import io.sentry.D1;
import io.sentry.EnumC5134j;
import io.sentry.EnumC5148n1;

/* loaded from: classes2.dex */
public final /* synthetic */ class W implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ W(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.c;
                SendCachedEnvelopeIntegration sendCachedEnvelopeIntegration = (SendCachedEnvelopeIntegration) this.b;
                sendCachedEnvelopeIntegration.getClass();
                try {
                    if (sendCachedEnvelopeIntegration.i.get()) {
                        sentryAndroidOptions.getLogger().k(EnumC5148n1.INFO, "SendCachedEnvelopeIntegration, not trying to send after closing.", new Object[0]);
                        return;
                    }
                    boolean andSet = sendCachedEnvelopeIntegration.h.getAndSet(true);
                    io.sentry.E e = (io.sentry.E) this.d;
                    if (!andSet) {
                        io.sentry.H connectionStatusProvider = sentryAndroidOptions.getConnectionStatusProvider();
                        sendCachedEnvelopeIntegration.d = connectionStatusProvider;
                        connectionStatusProvider.c(sendCachedEnvelopeIntegration);
                        sendCachedEnvelopeIntegration.g = sendCachedEnvelopeIntegration.a.a(e, sentryAndroidOptions);
                    }
                    io.sentry.H h = sendCachedEnvelopeIntegration.d;
                    if (h != null && h.b() == io.sentry.F.DISCONNECTED) {
                        sentryAndroidOptions.getLogger().k(EnumC5148n1.INFO, "SendCachedEnvelopeIntegration, no connection.", new Object[0]);
                        return;
                    }
                    io.sentry.transport.m mVarQ = e.q();
                    if (mVarQ != null && mVarQ.c(EnumC5134j.All)) {
                        sentryAndroidOptions.getLogger().k(EnumC5148n1.INFO, "SendCachedEnvelopeIntegration, rate limiting active.", new Object[0]);
                        return;
                    }
                    C8329zG c8329zG = sendCachedEnvelopeIntegration.g;
                    if (c8329zG == null) {
                        sentryAndroidOptions.getLogger().k(EnumC5148n1.ERROR, "SendCachedEnvelopeIntegration factory is null.", new Object[0]);
                        return;
                    } else {
                        c8329zG.a();
                        return;
                    }
                } catch (Throwable th) {
                    sentryAndroidOptions.getLogger().d(EnumC5148n1.ERROR, "Failed trying to send cached events.", th);
                    return;
                }
            case 1:
                Runnable runnable = (Runnable) this.c;
                C5088e c5088e = (C5088e) this.b;
                c5088e.getClass();
                try {
                    runnable.run();
                    return;
                } catch (Throwable unused) {
                    String str = (String) this.d;
                    if (str != null) {
                        c5088e.b.getLogger().k(EnumC5148n1.WARNING, "Failed to execute ".concat(str), new Object[0]);
                        return;
                    }
                    return;
                }
            default:
                EnvelopeFileObserverIntegration envelopeFileObserverIntegration = (EnvelopeFileObserverIntegration) this.b;
                D1 d1 = (D1) this.c;
                String str2 = (String) this.d;
                synchronized (envelopeFileObserverIntegration.d) {
                    try {
                        if (!envelopeFileObserverIntegration.c) {
                            envelopeFileObserverIntegration.n(d1, str2);
                        }
                    } finally {
                    }
                }
                return;
        }
    }
}
