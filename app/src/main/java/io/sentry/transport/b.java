package io.sentry.transport;

import io.sentry.AbstractC5083a1;
import io.sentry.C5115c1;
import io.sentry.C5185y;
import io.sentry.D1;
import io.sentry.EnumC5148n1;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class b implements Runnable {
    public final io.sentry.internal.debugmeta.c a;
    public final C5185y b;
    public final io.sentry.cache.d c;
    public final o d = new o(-1);
    public final /* synthetic */ c e;

    public b(c cVar, io.sentry.internal.debugmeta.c cVar2, C5185y c5185y, io.sentry.cache.d dVar) {
        this.e = cVar;
        io.sentry.config.a.D(cVar2, "Envelope is required.");
        this.a = cVar2;
        this.b = c5185y;
        io.sentry.config.a.D(dVar, "EnvelopeCache is required.");
        this.c = dVar;
    }

    public static /* synthetic */ void a(b bVar, io.sentry.config.a aVar, io.sentry.hints.j jVar) {
        bVar.e.c.getLogger().k(EnumC5148n1.DEBUG, "Marking envelope submission result: %s", Boolean.valueOf(aVar.x()));
        jVar.b(aVar.x());
    }

    public final io.sentry.config.a b() {
        io.sentry.internal.debugmeta.c cVar = this.a;
        ((C5115c1) cVar.b).d = null;
        io.sentry.cache.d dVar = this.c;
        C5185y c5185y = this.b;
        dVar.j(cVar, c5185y);
        Object objR = io.sentry.config.a.r(c5185y);
        boolean zIsInstance = io.sentry.hints.c.class.isInstance(io.sentry.config.a.r(c5185y));
        c cVar2 = this.e;
        if (zIsInstance && objR != null) {
            io.sentry.hints.c cVar3 = (io.sentry.hints.c) objR;
            if (cVar3.f(((C5115c1) cVar.b).a)) {
                cVar3.a.countDown();
                cVar2.c.getLogger().k(EnumC5148n1.DEBUG, "Disk flush envelope fired", new Object[0]);
            } else {
                cVar2.c.getLogger().k(EnumC5148n1.DEBUG, "Not firing envelope flush as there's an ongoing transaction", new Object[0]);
            }
        }
        boolean zIsConnected = cVar2.e.isConnected();
        D1 d1 = cVar2.c;
        if (!zIsConnected) {
            Object objR2 = io.sentry.config.a.r(c5185y);
            if (!io.sentry.hints.g.class.isInstance(io.sentry.config.a.r(c5185y)) || objR2 == null) {
                io.sentry.config.a.z(io.sentry.hints.g.class, objR2, d1.getLogger());
                d1.getClientReportRecorder().e(io.sentry.clientreport.d.NETWORK_ERROR, cVar);
            } else {
                ((io.sentry.hints.g) objR2).c(true);
            }
            return this.d;
        }
        io.sentry.internal.debugmeta.c cVarK = d1.getClientReportRecorder().k(cVar);
        try {
            AbstractC5083a1 abstractC5083a1Now = d1.getDateProvider().now();
            ((C5115c1) cVarK.b).d = io.sentry.config.a.l(Double.valueOf(abstractC5083a1Now.d() / 1000000.0d).longValue());
            io.sentry.config.a aVarD = cVar2.f.d(cVarK);
            if (aVarD.x()) {
                dVar.h0(cVar);
                return aVarD;
            }
            String str = "The transport failed to send the envelope with response code " + aVarD.q();
            d1.getLogger().k(EnumC5148n1.ERROR, str, new Object[0]);
            if (aVarD.q() >= 400 && aVarD.q() != 429) {
                Object objR3 = io.sentry.config.a.r(c5185y);
                if (!io.sentry.hints.g.class.isInstance(io.sentry.config.a.r(c5185y)) || objR3 == null) {
                    d1.getClientReportRecorder().e(io.sentry.clientreport.d.NETWORK_ERROR, cVarK);
                }
            }
            throw new IllegalStateException(str);
        } catch (IOException e) {
            Object objR4 = io.sentry.config.a.r(c5185y);
            if (!io.sentry.hints.g.class.isInstance(io.sentry.config.a.r(c5185y)) || objR4 == null) {
                io.sentry.config.a.z(io.sentry.hints.g.class, objR4, d1.getLogger());
                d1.getClientReportRecorder().e(io.sentry.clientreport.d.NETWORK_ERROR, cVarK);
            } else {
                ((io.sentry.hints.g) objR4).c(true);
            }
            throw new IllegalStateException("Sending the event failed.", e);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.g = this;
        io.sentry.config.a aVarB = this.d;
        try {
            aVarB = b();
            this.e.c.getLogger().k(EnumC5148n1.DEBUG, "Envelope flushed", new Object[0]);
        } catch (Throwable th) {
            try {
                this.e.c.getLogger().c(EnumC5148n1.ERROR, th, "Envelope submission failed", new Object[0]);
                throw th;
            } finally {
                C5185y c5185y = this.b;
                Object objR = io.sentry.config.a.r(c5185y);
                if (io.sentry.hints.j.class.isInstance(io.sentry.config.a.r(c5185y)) && objR != null) {
                    a(this, aVarB, (io.sentry.hints.j) objR);
                }
                this.e.g = null;
            }
        }
    }
}
