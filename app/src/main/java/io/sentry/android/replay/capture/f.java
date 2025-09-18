package io.sentry.android.replay.capture;

import android.view.MotionEvent;
import defpackage.AbstractC8069xu;
import defpackage.C0532Go1;
import defpackage.C3690f1;
import defpackage.C5661lG0;
import defpackage.InterfaceC6099nZ;
import defpackage.O90;
import defpackage.RunnableC5256j81;
import io.sentry.D1;
import io.sentry.E;
import io.sentry.E1;
import io.sentry.EnumC5148n1;
import io.sentry.Q0;
import io.sentry.S0;
import io.sentry.android.replay.u;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class f extends c {
    public final D1 s;
    public final E t;
    public final io.sentry.transport.d u;
    public final io.sentry.util.f v;
    public final ArrayList w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(D1 d1, E e, io.sentry.transport.d dVar, io.sentry.util.f fVar, ScheduledExecutorService scheduledExecutorService) {
        super(d1, e, dVar, scheduledExecutorService, null);
        O90.f(d1, "options");
        O90.f(dVar, "dateProvider");
        O90.f(fVar, "random");
        this.s = d1;
        this.t = e;
        this.u = dVar;
        this.v = fVar;
        this.w = new ArrayList();
    }

    @Override // io.sentry.android.replay.capture.c, io.sentry.android.replay.capture.l
    public final void a(MotionEvent motionEvent) {
        super.a(motionEvent);
        this.u.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - this.s.getSessionReplay().i;
        ConcurrentLinkedDeque concurrentLinkedDeque = this.q;
        O90.f(concurrentLinkedDeque, "events");
        Iterator it = concurrentLinkedDeque.iterator();
        O90.e(it, "events.iterator()");
        while (it.hasNext()) {
            if (((io.sentry.rrweb.b) it.next()).b < jCurrentTimeMillis) {
                it.remove();
            }
        }
    }

    @Override // io.sentry.android.replay.capture.l
    public final void b(u uVar) {
        o("configuration_changed", new e(this, 0));
        m(uVar);
    }

    @Override // io.sentry.android.replay.capture.l
    public final l d() {
        if (this.h.get()) {
            this.s.getLogger().k(EnumC5148n1.DEBUG, "Not converting to session mode, because the process is about to terminate", new Object[0]);
            return this;
        }
        o oVar = new o(this.s, this.t, this.u, this.d, null);
        oVar.c(k(), j(), i(), E1.BUFFER);
        return oVar;
    }

    @Override // io.sentry.android.replay.capture.l
    public final void e(boolean z, C5661lG0 c5661lG0) {
        D1 d1 = this.s;
        Double d = d1.getSessionReplay().b;
        io.sentry.util.f fVar = this.v;
        O90.f(fVar, "<this>");
        if (!(d != null && d.doubleValue() >= fVar.b())) {
            d1.getLogger().k(EnumC5148n1.INFO, "Replay wasn't sampled by onErrorSampleRate, not capturing for event", new Object[0]);
            return;
        }
        if (this.t != null) {
            S0.b(new C0532Go1(3, this));
        }
        if (!z) {
            o("capture_replay", new C3690f1(this, 18, c5661lG0));
        } else {
            this.h.set(true);
            d1.getLogger().k(EnumC5148n1.DEBUG, "Not capturing replay for crashed event, will be captured on next launch", new Object[0]);
        }
    }

    @Override // io.sentry.android.replay.capture.l
    public final void f(io.sentry.android.replay.n nVar) {
        this.u.getClass();
        io.sentry.config.a.G(this.d, this.s, "BufferCaptureStrategy.add_frame", new RunnableC5256j81(this, nVar, System.currentTimeMillis(), 6));
    }

    public final void o(String str, InterfaceC6099nZ interfaceC6099nZ) {
        Date dateL;
        ArrayList arrayList;
        D1 d1 = this.s;
        long j = d1.getSessionReplay().i;
        this.u.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        io.sentry.android.replay.j jVar = this.i;
        if (jVar == null || (arrayList = jVar.g) == null || !(!arrayList.isEmpty())) {
            dateL = io.sentry.config.a.l(jCurrentTimeMillis - j);
        } else {
            io.sentry.android.replay.j jVar2 = this.i;
            O90.c(jVar2);
            dateL = io.sentry.config.a.l(((io.sentry.android.replay.k) AbstractC8069xu.A(jVar2.g)).b);
        }
        Date date = dateL;
        O90.e(date, "if (cache?.frames?.isNot…ReplayDuration)\n        }");
        io.sentry.config.a.G(this.d, d1, "BufferCaptureStrategy.".concat(str), new d(this, jCurrentTimeMillis - date.getTime(), date, i(), j(), k().b, k().a, interfaceC6099nZ));
    }

    @Override // io.sentry.android.replay.capture.l
    public final void pause() {
        o("pause", new e(this, 1));
    }

    @Override // io.sentry.android.replay.capture.c, io.sentry.android.replay.capture.l
    public final void stop() {
        io.sentry.android.replay.j jVar = this.i;
        io.sentry.config.a.G(this.d, this.s, "BufferCaptureStrategy.stop", new Q0(jVar != null ? jVar.m() : null, 1));
        super.stop();
    }
}
