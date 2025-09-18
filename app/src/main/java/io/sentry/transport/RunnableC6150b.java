package io.sentry.transport;

import io.sentry.AbstractC5827a1;
import io.sentry.C5759D1;
import io.sentry.C5987c1;
import io.sentry.C6193y;
import io.sentry.EnumC6069n1;
import io.sentry.cache.InterfaceC5992d;
import io.sentry.clientreport.EnumC6000d;
import io.sentry.config.AbstractC6003a;
import io.sentry.hints.AbstractC6028c;
import io.sentry.hints.InterfaceC6032g;
import io.sentry.hints.InterfaceC6035j;
import io.sentry.internal.debugmeta.C6042c;
import java.io.IOException;

/* renamed from: io.sentry.transport.b */
/* loaded from: classes2.dex */
public final class RunnableC6150b implements Runnable {

    /* renamed from: a */
    public final C6042c f34621a;

    /* renamed from: b */
    public final C6193y f34622b;

    /* renamed from: c */
    public final InterfaceC5992d f34623c;

    /* renamed from: d */
    public final C6163o f34624d = new C6163o(-1);

    /* renamed from: e */
    public final /* synthetic */ C6151c f34625e;

    public RunnableC6150b(C6151c c6151c, C6042c c6042c, C6193y c6193y, InterfaceC5992d interfaceC5992d) {
        this.f34625e = c6151c;
        AbstractC6003a.m21735D(c6042c, "Envelope is required.");
        this.f34621a = c6042c;
        this.f34622b = c6193y;
        AbstractC6003a.m21735D(interfaceC5992d, "EnvelopeCache is required.");
        this.f34623c = interfaceC5992d;
    }

    /* renamed from: a */
    public static /* synthetic */ void m21860a(RunnableC6150b runnableC6150b, AbstractC6003a abstractC6003a, InterfaceC6035j interfaceC6035j) {
        runnableC6150b.f34625e.f34628c.getLogger().mo21407k(EnumC6069n1.DEBUG, "Marking envelope submission result: %s", Boolean.valueOf(abstractC6003a.mo21767x()));
        interfaceC6035j.mo21530b(abstractC6003a.mo21767x());
    }

    /* renamed from: b */
    public final AbstractC6003a m21861b() {
        C6042c c6042c = this.f34621a;
        ((C5987c1) c6042c.f34198b).f34093d = null;
        InterfaceC5992d interfaceC5992d = this.f34623c;
        C6193y c6193y = this.f34622b;
        interfaceC5992d.mo21556j(c6042c, c6193y);
        Object objM21758r = AbstractC6003a.m21758r(c6193y);
        boolean zIsInstance = AbstractC6028c.class.isInstance(AbstractC6003a.m21758r(c6193y));
        C6151c c6151c = this.f34625e;
        if (zIsInstance && objM21758r != null) {
            AbstractC6028c abstractC6028c = (AbstractC6028c) objM21758r;
            if (abstractC6028c.mo21645f(((C5987c1) c6042c.f34198b).f34090a)) {
                abstractC6028c.f34180a.countDown();
                c6151c.f34628c.getLogger().mo21407k(EnumC6069n1.DEBUG, "Disk flush envelope fired", new Object[0]);
            } else {
                c6151c.f34628c.getLogger().mo21407k(EnumC6069n1.DEBUG, "Not firing envelope flush as there's an ongoing transaction", new Object[0]);
            }
        }
        boolean zIsConnected = c6151c.f34630e.isConnected();
        C5759D1 c5759d1 = c6151c.f34628c;
        if (!zIsConnected) {
            Object objM21758r2 = AbstractC6003a.m21758r(c6193y);
            if (!InterfaceC6032g.class.isInstance(AbstractC6003a.m21758r(c6193y)) || objM21758r2 == null) {
                AbstractC6003a.m21765z(InterfaceC6032g.class, objM21758r2, c5759d1.getLogger());
                c5759d1.getClientReportRecorder().mo21728e(EnumC6000d.NETWORK_ERROR, c6042c);
            } else {
                ((InterfaceC6032g) objM21758r2).mo21531c(true);
            }
            return this.f34624d;
        }
        C6042c c6042cMo21731k = c5759d1.getClientReportRecorder().mo21731k(c6042c);
        try {
            AbstractC5827a1 abstractC5827a1Now = c5759d1.getDateProvider().now();
            ((C5987c1) c6042cMo21731k.f34198b).f34093d = AbstractC6003a.m21753l(Double.valueOf(abstractC5827a1Now.mo21497d() / 1000000.0d).longValue());
            AbstractC6003a abstractC6003aM21870d = c6151c.f34631f.m21870d(c6042cMo21731k);
            if (abstractC6003aM21870d.mo21767x()) {
                interfaceC5992d.mo21710h0(c6042c);
                return abstractC6003aM21870d;
            }
            String str = "The transport failed to send the envelope with response code " + abstractC6003aM21870d.mo21766q();
            c5759d1.getLogger().mo21407k(EnumC6069n1.ERROR, str, new Object[0]);
            if (abstractC6003aM21870d.mo21766q() >= 400 && abstractC6003aM21870d.mo21766q() != 429) {
                Object objM21758r3 = AbstractC6003a.m21758r(c6193y);
                if (!InterfaceC6032g.class.isInstance(AbstractC6003a.m21758r(c6193y)) || objM21758r3 == null) {
                    c5759d1.getClientReportRecorder().mo21728e(EnumC6000d.NETWORK_ERROR, c6042cMo21731k);
                }
            }
            throw new IllegalStateException(str);
        } catch (IOException e) {
            Object objM21758r4 = AbstractC6003a.m21758r(c6193y);
            if (!InterfaceC6032g.class.isInstance(AbstractC6003a.m21758r(c6193y)) || objM21758r4 == null) {
                AbstractC6003a.m21765z(InterfaceC6032g.class, objM21758r4, c5759d1.getLogger());
                c5759d1.getClientReportRecorder().mo21728e(EnumC6000d.NETWORK_ERROR, c6042cMo21731k);
            } else {
                ((InterfaceC6032g) objM21758r4).mo21531c(true);
            }
            throw new IllegalStateException("Sending the event failed.", e);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f34625e.f34632g = this;
        AbstractC6003a abstractC6003aM21861b = this.f34624d;
        try {
            abstractC6003aM21861b = m21861b();
            this.f34625e.f34628c.getLogger().mo21407k(EnumC6069n1.DEBUG, "Envelope flushed", new Object[0]);
        } catch (Throwable th) {
            try {
                this.f34625e.f34628c.getLogger().mo21405c(EnumC6069n1.ERROR, th, "Envelope submission failed", new Object[0]);
                throw th;
            } finally {
                C6193y c6193y = this.f34622b;
                Object objM21758r = AbstractC6003a.m21758r(c6193y);
                if (InterfaceC6035j.class.isInstance(AbstractC6003a.m21758r(c6193y)) && objM21758r != null) {
                    m21860a(this, abstractC6003aM21861b, (InterfaceC6035j) objM21758r);
                }
                this.f34625e.f34632g = null;
            }
        }
    }
}
