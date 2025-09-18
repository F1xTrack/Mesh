package io.sentry.android.replay.capture;

import defpackage.C0532Go1;
import defpackage.C3690f1;
import defpackage.C5661lG0;
import defpackage.InterfaceC6099nZ;
import defpackage.O90;
import io.sentry.C;
import io.sentry.D1;
import io.sentry.E;
import io.sentry.E1;
import io.sentry.EnumC5148n1;
import io.sentry.S0;
import io.sentry.android.replay.u;
import io.sentry.protocol.t;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class o extends c {
    public final D1 s;
    public final E t;
    public final io.sentry.transport.d u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(D1 d1, E e, io.sentry.transport.d dVar, ScheduledExecutorService scheduledExecutorService, InterfaceC6099nZ interfaceC6099nZ) {
        super(d1, e, dVar, scheduledExecutorService, interfaceC6099nZ);
        O90.f(d1, "options");
        O90.f(dVar, "dateProvider");
        this.s = d1;
        this.t = e;
        this.u = dVar;
    }

    @Override // io.sentry.android.replay.capture.l
    public final void b(u uVar) {
        o("onConfigurationChanged", new n(this, 0));
        m(uVar);
    }

    @Override // io.sentry.android.replay.capture.c, io.sentry.android.replay.capture.l
    public final void c(u uVar, int i, t tVar, E1 e1) {
        O90.f(uVar, "recorderConfig");
        O90.f(tVar, "replayId");
        super.c(uVar, i, tVar, e1);
        if (this.t != null) {
            S0.b(new C0532Go1(4, this));
        }
    }

    @Override // io.sentry.android.replay.capture.l
    public final l d() {
        return this;
    }

    @Override // io.sentry.android.replay.capture.l
    public final void e(boolean z, C5661lG0 c5661lG0) {
        this.s.getLogger().k(EnumC5148n1.DEBUG, "Replay is already running in 'session' mode, not capturing for event", new Object[0]);
        this.h.set(z);
    }

    @Override // io.sentry.android.replay.capture.l
    public final void f(final io.sentry.android.replay.n nVar) {
        this.u.getClass();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final int i = k().b;
        final int i2 = k().a;
        io.sentry.config.a.G(this.d, this.s, "SessionCaptureStrategy.add_frame", new Runnable() { // from class: io.sentry.android.replay.capture.m
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                o oVar = this.a;
                O90.f(oVar, "this$0");
                io.sentry.android.replay.n nVar2 = nVar;
                io.sentry.android.replay.j jVar = oVar.i;
                if (jVar != null) {
                    nVar2.invoke(jVar, Long.valueOf(jCurrentTimeMillis));
                }
                Date date = (Date) oVar.k.getValue(oVar, c.r[1]);
                D1 d1 = oVar.s;
                if (date == null) {
                    d1.getLogger().k(EnumC5148n1.DEBUG, "Segment timestamp is not set, not recording frame", new Object[0]);
                    return;
                }
                if (oVar.h.get()) {
                    d1.getLogger().k(EnumC5148n1.DEBUG, "Not capturing segment, because the app is terminating, will be captured on next launch", new Object[0]);
                    return;
                }
                oVar.u.getClass();
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                if (jCurrentTimeMillis2 - date.getTime() >= d1.getSessionReplay().j) {
                    k kVarH = c.h(oVar, d1.getSessionReplay().j, date, oVar.i(), oVar.j(), i, i2);
                    if (kVarH instanceof i) {
                        i iVar = (i) kVarH;
                        i.a(iVar, oVar.t);
                        oVar.l(oVar.j() + 1);
                        oVar.n(iVar.a.u);
                    }
                }
                if (jCurrentTimeMillis2 - oVar.l.get() >= d1.getSessionReplay().k) {
                    d1.getReplayController().stop();
                    d1.getLogger().k(EnumC5148n1.INFO, "Session replay deadline exceeded (1h), stopping recording", new Object[0]);
                }
            }
        });
    }

    public final void o(String str, InterfaceC6099nZ interfaceC6099nZ) {
        this.u.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Date date = (Date) this.k.getValue(this, c.r[1]);
        if (date == null) {
            return;
        }
        int iJ = j();
        long time = jCurrentTimeMillis - date.getTime();
        t tVarI = i();
        int i = k().b;
        int i2 = k().a;
        io.sentry.config.a.G(this.d, this.s, "SessionCaptureStrategy.".concat(str), new d(this, time, date, tVarI, iJ, i, i2, interfaceC6099nZ));
    }

    @Override // io.sentry.android.replay.capture.l
    public final void pause() {
        o("pause", new n(this, 1));
    }

    @Override // io.sentry.android.replay.capture.c, io.sentry.android.replay.capture.l
    public final void stop() {
        io.sentry.android.replay.j jVar = this.i;
        o("stop", new C3690f1(this, 20, jVar != null ? jVar.m() : null));
        if (this.t != null) {
            S0.b(new C(5));
        }
        super.stop();
    }
}
