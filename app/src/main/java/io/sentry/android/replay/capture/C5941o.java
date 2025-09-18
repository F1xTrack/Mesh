package io.sentry.android.replay.capture;

import io.sentry.AbstractC5802S0;
import io.sentry.C5754C;
import io.sentry.C5759D1;
import io.sentry.C5760E;
import io.sentry.EnumC5762E1;
import io.sentry.EnumC6069n1;
import io.sentry.android.replay.C5950j;
import io.sentry.android.replay.C5954n;
import io.sentry.android.replay.C5961u;
import io.sentry.config.AbstractC6003a;
import io.sentry.protocol.C6104t;
import io.sentry.transport.C6152d;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import p000.C10115lG0;
import p000.C4027f1;
import p000.C7655Go1;
import p000.InterfaceC6497nZ;
import p000.O90;

/* renamed from: io.sentry.android.replay.capture.o */
/* loaded from: classes2.dex */
public final class C5941o extends AbstractC5929c {

    /* renamed from: s */
    public final C5759D1 f33960s;

    /* renamed from: t */
    public final C5760E f33961t;

    /* renamed from: u */
    public final C6152d f33962u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5941o(C5759D1 c5759d1, C5760E c5760e, C6152d c6152d, ScheduledExecutorService scheduledExecutorService, InterfaceC6497nZ interfaceC6497nZ) {
        super(c5759d1, c5760e, c6152d, scheduledExecutorService, interfaceC6497nZ);
        O90.m5968f(c5759d1, "options");
        O90.m5968f(c6152d, "dateProvider");
        this.f33960s = c5759d1;
        this.f33961t = c5760e;
        this.f33962u = c6152d;
    }

    @Override // io.sentry.android.replay.capture.InterfaceC5938l
    /* renamed from: b */
    public final void mo21660b(C5961u c5961u) {
        m21667o("onConfigurationChanged", new C5940n(this, 0));
        m21658m(c5961u);
    }

    @Override // io.sentry.android.replay.capture.AbstractC5929c, io.sentry.android.replay.capture.InterfaceC5938l
    /* renamed from: c */
    public final void mo21653c(C5961u c5961u, int i, C6104t c6104t, EnumC5762E1 enumC5762E1) {
        O90.m5968f(c5961u, "recorderConfig");
        O90.m5968f(c6104t, "replayId");
        super.mo21653c(c5961u, i, c6104t, enumC5762E1);
        if (this.f33961t != null) {
            AbstractC5802S0.m21464b(new C7655Go1(4, this));
        }
    }

    @Override // io.sentry.android.replay.capture.InterfaceC5938l
    /* renamed from: d */
    public final InterfaceC5938l mo21661d() {
        return this;
    }

    @Override // io.sentry.android.replay.capture.InterfaceC5938l
    /* renamed from: e */
    public final void mo21662e(boolean z, C10115lG0 c10115lG0) {
        this.f33960s.getLogger().mo21407k(EnumC6069n1.DEBUG, "Replay is already running in 'session' mode, not capturing for event", new Object[0]);
        this.f33924h.set(z);
    }

    @Override // io.sentry.android.replay.capture.InterfaceC5938l
    /* renamed from: f */
    public final void mo21663f(final C5954n c5954n) {
        this.f33962u.getClass();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final int i = m21656k().f34032b;
        final int i2 = m21656k().f34031a;
        AbstractC6003a.m21738G(this.f33920d, this.f33960s, "SessionCaptureStrategy.add_frame", new Runnable() { // from class: io.sentry.android.replay.capture.m
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                C5941o c5941o = this.f33953a;
                O90.m5968f(c5941o, "this$0");
                C5954n c5954n2 = c5954n;
                C5950j c5950j = c5941o.f33925i;
                if (c5950j != null) {
                    c5954n2.invoke(c5950j, Long.valueOf(jCurrentTimeMillis));
                }
                Date date = (Date) c5941o.f33927k.getValue(c5941o, AbstractC5929c.f33916r[1]);
                C5759D1 c5759d1 = c5941o.f33960s;
                if (date == null) {
                    c5759d1.getLogger().mo21407k(EnumC6069n1.DEBUG, "Segment timestamp is not set, not recording frame", new Object[0]);
                    return;
                }
                if (c5941o.f33924h.get()) {
                    c5759d1.getLogger().mo21407k(EnumC6069n1.DEBUG, "Not capturing segment, because the app is terminating, will be captured on next launch", new Object[0]);
                    return;
                }
                c5941o.f33962u.getClass();
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                if (jCurrentTimeMillis2 - date.getTime() >= c5759d1.getSessionReplay().f33292j) {
                    AbstractC5937k abstractC5937kM21651h = AbstractC5929c.m21651h(c5941o, c5759d1.getSessionReplay().f33292j, date, c5941o.m21654i(), c5941o.m21655j(), i, i2);
                    if (abstractC5937kM21651h instanceof C5935i) {
                        C5935i c5935i = (C5935i) abstractC5937kM21651h;
                        C5935i.m21666a(c5935i, c5941o.f33961t);
                        c5941o.m21657l(c5941o.m21655j() + 1);
                        c5941o.m21659n(c5935i.f33950a.f33277u);
                    }
                }
                if (jCurrentTimeMillis2 - c5941o.f33928l.get() >= c5759d1.getSessionReplay().f33293k) {
                    c5759d1.getReplayController().stop();
                    c5759d1.getLogger().mo21407k(EnumC6069n1.INFO, "Session replay deadline exceeded (1h), stopping recording", new Object[0]);
                }
            }
        });
    }

    /* renamed from: o */
    public final void m21667o(String str, InterfaceC6497nZ interfaceC6497nZ) {
        this.f33962u.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Date date = (Date) this.f33927k.getValue(this, AbstractC5929c.f33916r[1]);
        if (date == null) {
            return;
        }
        int iM21655j = m21655j();
        long time = jCurrentTimeMillis - date.getTime();
        C6104t c6104tM21654i = m21654i();
        int i = m21656k().f34032b;
        int i2 = m21656k().f34031a;
        AbstractC6003a.m21738G(this.f33920d, this.f33960s, "SessionCaptureStrategy.".concat(str), new RunnableC5930d(this, time, date, c6104tM21654i, iM21655j, i, i2, interfaceC6497nZ));
    }

    @Override // io.sentry.android.replay.capture.InterfaceC5938l
    public final void pause() {
        m21667o("pause", new C5940n(this, 1));
    }

    @Override // io.sentry.android.replay.capture.AbstractC5929c, io.sentry.android.replay.capture.InterfaceC5938l
    public final void stop() {
        C5950j c5950j = this.f33925i;
        m21667o("stop", new C4027f1(this, 20, c5950j != null ? c5950j.m21673m() : null));
        if (this.f33961t != null) {
            AbstractC5802S0.m21464b(new C5754C(5));
        }
        super.stop();
    }
}
