package io.sentry.android.core;

import io.sentry.C5759D1;
import io.sentry.C5760E;
import io.sentry.EnumC5763F;
import io.sentry.EnumC6051j;
import io.sentry.EnumC6069n1;
import io.sentry.InterfaceC5769H;
import io.sentry.transport.C6161m;
import p000.C7253zG;

/* renamed from: io.sentry.android.core.W */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5850W implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f33631a;

    /* renamed from: b */
    public final /* synthetic */ Object f33632b;

    /* renamed from: c */
    public final /* synthetic */ Object f33633c;

    /* renamed from: d */
    public final /* synthetic */ Object f33634d;

    public /* synthetic */ RunnableC5850W(Object obj, Object obj2, Object obj3, int i) {
        this.f33631a = i;
        this.f33632b = obj;
        this.f33633c = obj2;
        this.f33634d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f33631a) {
            case 0:
                SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f33633c;
                SendCachedEnvelopeIntegration sendCachedEnvelopeIntegration = (SendCachedEnvelopeIntegration) this.f33632b;
                sendCachedEnvelopeIntegration.getClass();
                try {
                    if (sendCachedEnvelopeIntegration.f33603i.get()) {
                        sentryAndroidOptions.getLogger().mo21407k(EnumC6069n1.INFO, "SendCachedEnvelopeIntegration, not trying to send after closing.", new Object[0]);
                        return;
                    }
                    boolean andSet = sendCachedEnvelopeIntegration.f33602h.getAndSet(true);
                    C5760E c5760e = (C5760E) this.f33634d;
                    if (!andSet) {
                        InterfaceC5769H connectionStatusProvider = sentryAndroidOptions.getConnectionStatusProvider();
                        sendCachedEnvelopeIntegration.f33598d = connectionStatusProvider;
                        connectionStatusProvider.mo21390c(sendCachedEnvelopeIntegration);
                        sendCachedEnvelopeIntegration.f33601g = sendCachedEnvelopeIntegration.f33595a.m21452a(c5760e, sentryAndroidOptions);
                    }
                    InterfaceC5769H interfaceC5769H = sendCachedEnvelopeIntegration.f33598d;
                    if (interfaceC5769H != null && interfaceC5769H.mo21389b() == EnumC5763F.DISCONNECTED) {
                        sentryAndroidOptions.getLogger().mo21407k(EnumC6069n1.INFO, "SendCachedEnvelopeIntegration, no connection.", new Object[0]);
                        return;
                    }
                    C6161m c6161mMo21372q = c5760e.mo21372q();
                    if (c6161mMo21372q != null && c6161mMo21372q.m21873c(EnumC6051j.All)) {
                        sentryAndroidOptions.getLogger().mo21407k(EnumC6069n1.INFO, "SendCachedEnvelopeIntegration, rate limiting active.", new Object[0]);
                        return;
                    }
                    C7253zG c7253zG = sendCachedEnvelopeIntegration.f33601g;
                    if (c7253zG == null) {
                        sentryAndroidOptions.getLogger().mo21407k(EnumC6069n1.ERROR, "SendCachedEnvelopeIntegration factory is null.", new Object[0]);
                        return;
                    } else {
                        c7253zG.m26353a();
                        return;
                    }
                } catch (Throwable th) {
                    sentryAndroidOptions.getLogger().mo21406d(EnumC6069n1.ERROR, "Failed trying to send cached events.", th);
                    return;
                }
            case 1:
                Runnable runnable = (Runnable) this.f33633c;
                C5863e c5863e = (C5863e) this.f33632b;
                c5863e.getClass();
                try {
                    runnable.run();
                    return;
                } catch (Throwable unused) {
                    String str = (String) this.f33634d;
                    if (str != null) {
                        c5863e.f33671b.getLogger().mo21407k(EnumC6069n1.WARNING, "Failed to execute ".concat(str), new Object[0]);
                        return;
                    }
                    return;
                }
            default:
                EnvelopeFileObserverIntegration envelopeFileObserverIntegration = (EnvelopeFileObserverIntegration) this.f33632b;
                C5759D1 c5759d1 = (C5759D1) this.f33633c;
                String str2 = (String) this.f33634d;
                synchronized (envelopeFileObserverIntegration.f33530d) {
                    try {
                        if (!envelopeFileObserverIntegration.f33529c) {
                            envelopeFileObserverIntegration.m21524n(c5759d1, str2);
                        }
                    } finally {
                    }
                }
                return;
        }
    }
}
