package io.sentry.android.replay.capture;

import android.view.MotionEvent;
import io.sentry.AbstractC5802S0;
import io.sentry.C5759D1;
import io.sentry.C5760E;
import io.sentry.EnumC5762E1;
import io.sentry.EnumC6069n1;
import io.sentry.RunnableC5797Q0;
import io.sentry.android.replay.C5950j;
import io.sentry.android.replay.C5951k;
import io.sentry.android.replay.C5954n;
import io.sentry.android.replay.C5961u;
import io.sentry.config.AbstractC6003a;
import io.sentry.rrweb.AbstractC6131b;
import io.sentry.transport.C6152d;
import io.sentry.util.C6173f;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ScheduledExecutorService;
import p000.AbstractC7167xu;
import p000.C10115lG0;
import p000.C4027f1;
import p000.C7655Go1;
import p000.InterfaceC6497nZ;
import p000.O90;
import p000.RunnableC9844j81;

/* renamed from: io.sentry.android.replay.capture.f */
/* loaded from: classes2.dex */
public final class C5932f extends AbstractC5929c {

    /* renamed from: s */
    public final C5759D1 f33945s;

    /* renamed from: t */
    public final C5760E f33946t;

    /* renamed from: u */
    public final C6152d f33947u;

    /* renamed from: v */
    public final C6173f f33948v;

    /* renamed from: w */
    public final ArrayList f33949w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5932f(C5759D1 c5759d1, C5760E c5760e, C6152d c6152d, C6173f c6173f, ScheduledExecutorService scheduledExecutorService) {
        super(c5759d1, c5760e, c6152d, scheduledExecutorService, null);
        O90.m5968f(c5759d1, "options");
        O90.m5968f(c6152d, "dateProvider");
        O90.m5968f(c6173f, "random");
        this.f33945s = c5759d1;
        this.f33946t = c5760e;
        this.f33947u = c6152d;
        this.f33948v = c6173f;
        this.f33949w = new ArrayList();
    }

    @Override // io.sentry.android.replay.capture.AbstractC5929c, io.sentry.android.replay.capture.InterfaceC5938l
    /* renamed from: a */
    public final void mo21652a(MotionEvent motionEvent) {
        super.mo21652a(motionEvent);
        this.f33947u.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f33945s.getSessionReplay().f33291i;
        ConcurrentLinkedDeque concurrentLinkedDeque = this.f33933q;
        O90.m5968f(concurrentLinkedDeque, "events");
        Iterator it = concurrentLinkedDeque.iterator();
        O90.m5967e(it, "events.iterator()");
        while (it.hasNext()) {
            if (((AbstractC6131b) it.next()).f34561b < jCurrentTimeMillis) {
                it.remove();
            }
        }
    }

    @Override // io.sentry.android.replay.capture.InterfaceC5938l
    /* renamed from: b */
    public final void mo21660b(C5961u c5961u) {
        m21664o("configuration_changed", new C5931e(this, 0));
        m21658m(c5961u);
    }

    @Override // io.sentry.android.replay.capture.InterfaceC5938l
    /* renamed from: d */
    public final InterfaceC5938l mo21661d() {
        if (this.f33924h.get()) {
            this.f33945s.getLogger().mo21407k(EnumC6069n1.DEBUG, "Not converting to session mode, because the process is about to terminate", new Object[0]);
            return this;
        }
        C5941o c5941o = new C5941o(this.f33945s, this.f33946t, this.f33947u, this.f33920d, null);
        c5941o.mo21653c(m21656k(), m21655j(), m21654i(), EnumC5762E1.BUFFER);
        return c5941o;
    }

    @Override // io.sentry.android.replay.capture.InterfaceC5938l
    /* renamed from: e */
    public final void mo21662e(boolean z, C10115lG0 c10115lG0) {
        C5759D1 c5759d1 = this.f33945s;
        Double d = c5759d1.getSessionReplay().f33284b;
        C6173f c6173f = this.f33948v;
        O90.m5968f(c6173f, "<this>");
        if (!(d != null && d.doubleValue() >= c6173f.m21882b())) {
            c5759d1.getLogger().mo21407k(EnumC6069n1.INFO, "Replay wasn't sampled by onErrorSampleRate, not capturing for event", new Object[0]);
            return;
        }
        if (this.f33946t != null) {
            AbstractC5802S0.m21464b(new C7655Go1(3, this));
        }
        if (!z) {
            m21664o("capture_replay", new C4027f1(this, 18, c10115lG0));
        } else {
            this.f33924h.set(true);
            c5759d1.getLogger().mo21407k(EnumC6069n1.DEBUG, "Not capturing replay for crashed event, will be captured on next launch", new Object[0]);
        }
    }

    @Override // io.sentry.android.replay.capture.InterfaceC5938l
    /* renamed from: f */
    public final void mo21663f(C5954n c5954n) {
        this.f33947u.getClass();
        AbstractC6003a.m21738G(this.f33920d, this.f33945s, "BufferCaptureStrategy.add_frame", new RunnableC9844j81(this, c5954n, System.currentTimeMillis(), 6));
    }

    /* renamed from: o */
    public final void m21664o(String str, InterfaceC6497nZ interfaceC6497nZ) {
        Date dateM21753l;
        ArrayList arrayList;
        C5759D1 c5759d1 = this.f33945s;
        long j = c5759d1.getSessionReplay().f33291i;
        this.f33947u.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C5950j c5950j = this.f33925i;
        if (c5950j == null || (arrayList = c5950j.f33994g) == null || !(!arrayList.isEmpty())) {
            dateM21753l = AbstractC6003a.m21753l(jCurrentTimeMillis - j);
        } else {
            C5950j c5950j2 = this.f33925i;
            O90.m5965c(c5950j2);
            dateM21753l = AbstractC6003a.m21753l(((C5951k) AbstractC7167xu.m25955A(c5950j2.f33994g)).f33998b);
        }
        Date date = dateM21753l;
        O90.m5967e(date, "if (cache?.frames?.isNot…ReplayDuration)\n        }");
        AbstractC6003a.m21738G(this.f33920d, c5759d1, "BufferCaptureStrategy.".concat(str), new RunnableC5930d(this, jCurrentTimeMillis - date.getTime(), date, m21654i(), m21655j(), m21656k().f34032b, m21656k().f34031a, interfaceC6497nZ));
    }

    @Override // io.sentry.android.replay.capture.InterfaceC5938l
    public final void pause() {
        m21664o("pause", new C5931e(this, 1));
    }

    @Override // io.sentry.android.replay.capture.AbstractC5929c, io.sentry.android.replay.capture.InterfaceC5938l
    public final void stop() {
        C5950j c5950j = this.f33925i;
        AbstractC6003a.m21738G(this.f33920d, this.f33945s, "BufferCaptureStrategy.stop", new RunnableC5797Q0(c5950j != null ? c5950j.m21673m() : null, 1));
        super.stop();
    }
}
