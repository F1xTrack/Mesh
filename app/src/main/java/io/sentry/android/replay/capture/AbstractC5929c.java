package io.sentry.android.replay.capture;

import com.yandex.metrica.RunnableC3792k;
import io.sentry.C5759D1;
import io.sentry.C5760E;
import io.sentry.EnumC5762E1;
import io.sentry.android.replay.C5950j;
import io.sentry.android.replay.C5961u;
import io.sentry.config.AbstractC6003a;
import io.sentry.protocol.C6104t;
import io.sentry.transport.C6152d;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import p000.AbstractC0705LB;
import p000.BP0;
import p000.C0451H9;
import p000.C1563Yq;
import p000.C7716Ht0;
import p000.F71;
import p000.IP0;
import p000.InterfaceC10293mf0;
import p000.InterfaceC6497nZ;
import p000.O90;

/* renamed from: io.sentry.android.replay.capture.c */
/* loaded from: classes2.dex */
public abstract class AbstractC5929c implements InterfaceC5938l {

    /* renamed from: r */
    public static final /* synthetic */ InterfaceC10293mf0[] f33916r;

    /* renamed from: a */
    public final C5759D1 f33917a;

    /* renamed from: b */
    public final C5760E f33918b;

    /* renamed from: c */
    public final C6152d f33919c;

    /* renamed from: d */
    public final ScheduledExecutorService f33920d;

    /* renamed from: e */
    public final InterfaceC6497nZ f33921e;

    /* renamed from: f */
    public final F71 f33922f;

    /* renamed from: g */
    public final C0451H9 f33923g;

    /* renamed from: h */
    public final AtomicBoolean f33924h;

    /* renamed from: i */
    public C5950j f33925i;

    /* renamed from: j */
    public final C5928b f33926j;

    /* renamed from: k */
    public final C5928b f33927k;

    /* renamed from: l */
    public final AtomicLong f33928l;

    /* renamed from: m */
    public final C5928b f33929m;

    /* renamed from: n */
    public final C5928b f33930n;

    /* renamed from: o */
    public final C5928b f33931o;

    /* renamed from: p */
    public final C5928b f33932p;

    /* renamed from: q */
    public final ConcurrentLinkedDeque f33933q;

    static {
        C7716Ht0 c7716Ht0 = new C7716Ht0("recorderConfig", "getRecorderConfig()Lio/sentry/android/replay/ScreenshotRecorderConfig;");
        IP0 ip0 = BP0.f799a;
        f33916r = new InterfaceC10293mf0[]{ip0.mo3848d(c7716Ht0), ip0.mo3848d(new C7716Ht0("segmentTimestamp", "getSegmentTimestamp()Ljava/util/Date;")), ip0.mo3848d(new C7716Ht0("screenAtStart", "getScreenAtStart()Ljava/lang/String;")), ip0.mo3848d(new C7716Ht0("currentReplayId", "getCurrentReplayId()Lio/sentry/protocol/SentryId;")), ip0.mo3848d(new C7716Ht0("currentSegment", "getCurrentSegment()I")), ip0.mo3848d(new C7716Ht0("replayType", "getReplayType()Lio/sentry/SentryReplayEvent$ReplayType;"))};
    }

    public AbstractC5929c(C5759D1 c5759d1, C5760E c5760e, C6152d c6152d, ScheduledExecutorService scheduledExecutorService, InterfaceC6497nZ interfaceC6497nZ) {
        O90.m5968f(c5759d1, "options");
        O90.m5968f(c6152d, "dateProvider");
        this.f33917a = c5759d1;
        this.f33918b = c5760e;
        this.f33919c = c6152d;
        this.f33920d = scheduledExecutorService;
        this.f33921e = interfaceC6497nZ;
        this.f33922f = AbstractC0705LB.m4915b(C5927a.f33911e);
        O90.m5968f(c6152d, "dateProvider");
        C0451H9 c0451h9 = new C0451H9();
        c0451h9.f4148c = c6152d;
        c0451h9.f4149d = new LinkedHashMap(10);
        this.f33923g = c0451h9;
        this.f33924h = new AtomicBoolean(false);
        this.f33926j = new C5928b(this, this, 0);
        this.f33927k = new C5928b(this, this, 4);
        this.f33928l = new AtomicLong();
        this.f33929m = new C5928b(this, this, 5);
        this.f33930n = new C5928b(C6104t.f34442b, this, this);
        this.f33931o = new C5928b(this, this, 2);
        this.f33932p = new C5928b(this, this, 3);
        this.f33933q = new ConcurrentLinkedDeque();
    }

    /* renamed from: g */
    public static final ScheduledExecutorService m21650g(AbstractC5929c abstractC5929c) {
        Object value = abstractC5929c.f33922f.getValue();
        O90.m5967e(value, "<get-persistingExecutor>(...)");
        return (ScheduledExecutorService) value;
    }

    /* renamed from: h */
    public static AbstractC5937k m21651h(AbstractC5929c abstractC5929c, long j, Date date, C6104t c6104t, int i, int i2, int i3) {
        C5928b c5928b = abstractC5929c.f33932p;
        InterfaceC10293mf0[] interfaceC10293mf0Arr = f33916r;
        EnumC5762E1 enumC5762E1 = (EnumC5762E1) c5928b.getValue(abstractC5929c, interfaceC10293mf0Arr[5]);
        C5950j c5950j = abstractC5929c.f33925i;
        int i4 = abstractC5929c.m21656k().f34035e;
        int i5 = abstractC5929c.m21656k().f34036f;
        String str = (String) abstractC5929c.f33929m.getValue(abstractC5929c, interfaceC10293mf0Arr[2]);
        ConcurrentLinkedDeque concurrentLinkedDeque = abstractC5929c.f33933q;
        abstractC5929c.getClass();
        O90.m5968f(c6104t, "replayId");
        O90.m5968f(enumC5762E1, "replayType");
        O90.m5968f(concurrentLinkedDeque, "events");
        return C5934h.m21665a(abstractC5929c.f33918b, abstractC5929c.f33917a, j, date, c6104t, i, i2, i3, enumC5762E1, c5950j, i4, i5, str, null, concurrentLinkedDeque);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a5  */
    @Override // io.sentry.android.replay.capture.InterfaceC5938l
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo21652a(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.replay.capture.AbstractC5929c.mo21652a(android.view.MotionEvent):void");
    }

    @Override // io.sentry.android.replay.capture.InterfaceC5938l
    /* renamed from: c */
    public void mo21653c(C5961u c5961u, int i, C6104t c6104t, EnumC5762E1 enumC5762E1) {
        C5950j c5950j;
        O90.m5968f(c5961u, "recorderConfig");
        O90.m5968f(c6104t, "replayId");
        InterfaceC6497nZ interfaceC6497nZ = this.f33921e;
        if (interfaceC6497nZ == null || (c5950j = (C5950j) interfaceC6497nZ.invoke(c6104t)) == null) {
            c5950j = new C5950j(this.f33917a, c6104t);
        }
        this.f33925i = c5950j;
        InterfaceC10293mf0[] interfaceC10293mf0Arr = f33916r;
        InterfaceC10293mf0 interfaceC10293mf0 = interfaceC10293mf0Arr[3];
        C5928b c5928b = this.f33930n;
        c5928b.getClass();
        O90.m5968f(interfaceC10293mf0, "property");
        Object andSet = c5928b.f33913b.getAndSet(c6104t);
        if (!O90.m5963a(andSet, c6104t)) {
            C1563Yq c1563Yq = new C1563Yq(andSet, c6104t, c5928b.f33915d, 7);
            AbstractC5929c abstractC5929c = c5928b.f33914c;
            if (abstractC5929c.f33917a.getMainThreadChecker().mo21581a()) {
                AbstractC6003a.m21738G(m21650g(abstractC5929c), abstractC5929c.f33917a, "CaptureStrategy.runInBackground", new RunnableC3792k(2, c1563Yq));
            } else {
                c1563Yq.invoke();
            }
        }
        m21657l(i);
        if (enumC5762E1 == null) {
            enumC5762E1 = this instanceof C5941o ? EnumC5762E1.SESSION : EnumC5762E1.BUFFER;
        }
        O90.m5968f(enumC5762E1, "<set-?>");
        InterfaceC10293mf0 interfaceC10293mf02 = interfaceC10293mf0Arr[5];
        C5928b c5928b2 = this.f33932p;
        c5928b2.getClass();
        O90.m5968f(interfaceC10293mf02, "property");
        Object andSet2 = c5928b2.f33913b.getAndSet(enumC5762E1);
        if (!O90.m5963a(andSet2, enumC5762E1)) {
            C1563Yq c1563Yq2 = new C1563Yq(andSet2, enumC5762E1, c5928b2.f33915d, 9);
            AbstractC5929c abstractC5929c2 = c5928b2.f33914c;
            if (abstractC5929c2.f33917a.getMainThreadChecker().mo21581a()) {
                AbstractC6003a.m21738G(m21650g(abstractC5929c2), abstractC5929c2.f33917a, "CaptureStrategy.runInBackground", new RunnableC3792k(4, c1563Yq2));
            } else {
                c1563Yq2.invoke();
            }
        }
        m21658m(c5961u);
        m21659n(AbstractC6003a.m21752k());
        AtomicLong atomicLong = this.f33928l;
        this.f33919c.getClass();
        atomicLong.set(System.currentTimeMillis());
    }

    /* renamed from: i */
    public final C6104t m21654i() {
        return (C6104t) this.f33930n.getValue(this, f33916r[3]);
    }

    /* renamed from: j */
    public final int m21655j() {
        return ((Number) this.f33931o.getValue(this, f33916r[4])).intValue();
    }

    /* renamed from: k */
    public final C5961u m21656k() {
        return (C5961u) this.f33926j.getValue(this, f33916r[0]);
    }

    /* renamed from: l */
    public final void m21657l(int i) {
        InterfaceC10293mf0 interfaceC10293mf0 = f33916r[4];
        Integer numValueOf = Integer.valueOf(i);
        C5928b c5928b = this.f33931o;
        c5928b.getClass();
        O90.m5968f(interfaceC10293mf0, "property");
        Object andSet = c5928b.f33913b.getAndSet(numValueOf);
        if (O90.m5963a(andSet, numValueOf)) {
            return;
        }
        C1563Yq c1563Yq = new C1563Yq(andSet, numValueOf, c5928b.f33915d, 8);
        AbstractC5929c abstractC5929c = c5928b.f33914c;
        if (!abstractC5929c.f33917a.getMainThreadChecker().mo21581a()) {
            c1563Yq.invoke();
            return;
        }
        AbstractC6003a.m21738G(m21650g(abstractC5929c), abstractC5929c.f33917a, "CaptureStrategy.runInBackground", new RunnableC3792k(3, c1563Yq));
    }

    /* renamed from: m */
    public final void m21658m(C5961u c5961u) {
        O90.m5968f(c5961u, "<set-?>");
        InterfaceC10293mf0 interfaceC10293mf0 = f33916r[0];
        C5928b c5928b = this.f33926j;
        c5928b.getClass();
        O90.m5968f(interfaceC10293mf0, "property");
        Object andSet = c5928b.f33913b.getAndSet(c5961u);
        if (O90.m5963a(andSet, c5961u)) {
            return;
        }
        C1563Yq c1563Yq = new C1563Yq(andSet, c5961u, c5928b.f33915d, 6);
        AbstractC5929c abstractC5929c = c5928b.f33914c;
        if (!abstractC5929c.f33917a.getMainThreadChecker().mo21581a()) {
            c1563Yq.invoke();
            return;
        }
        AbstractC6003a.m21738G(m21650g(abstractC5929c), abstractC5929c.f33917a, "CaptureStrategy.runInBackground", new RunnableC3792k(1, c1563Yq));
    }

    /* renamed from: n */
    public final void m21659n(Date date) {
        InterfaceC10293mf0 interfaceC10293mf0 = f33916r[1];
        C5928b c5928b = this.f33927k;
        c5928b.getClass();
        O90.m5968f(interfaceC10293mf0, "property");
        Object andSet = c5928b.f33913b.getAndSet(date);
        if (O90.m5963a(andSet, date)) {
            return;
        }
        C1563Yq c1563Yq = new C1563Yq(andSet, date, c5928b.f33915d, 10);
        AbstractC5929c abstractC5929c = c5928b.f33914c;
        if (!abstractC5929c.f33917a.getMainThreadChecker().mo21581a()) {
            c1563Yq.invoke();
            return;
        }
        AbstractC6003a.m21738G(m21650g(abstractC5929c), abstractC5929c.f33917a, "CaptureStrategy.runInBackground", new RunnableC3792k(5, c1563Yq));
    }

    @Override // io.sentry.android.replay.capture.InterfaceC5938l
    public void stop() {
        C5950j c5950j = this.f33925i;
        if (c5950j != null) {
            c5950j.close();
        }
        m21657l(-1);
        this.f33928l.set(0L);
        m21659n(null);
        C6104t c6104t = C6104t.f34442b;
        O90.m5967e(c6104t, "EMPTY_ID");
        InterfaceC10293mf0 interfaceC10293mf0 = f33916r[3];
        C5928b c5928b = this.f33930n;
        c5928b.getClass();
        O90.m5968f(interfaceC10293mf0, "property");
        Object andSet = c5928b.f33913b.getAndSet(c6104t);
        if (O90.m5963a(andSet, c6104t)) {
            return;
        }
        C1563Yq c1563Yq = new C1563Yq(andSet, c6104t, c5928b.f33915d, 7);
        AbstractC5929c abstractC5929c = c5928b.f33914c;
        if (!abstractC5929c.f33917a.getMainThreadChecker().mo21581a()) {
            c1563Yq.invoke();
            return;
        }
        AbstractC6003a.m21738G(m21650g(abstractC5929c), abstractC5929c.f33917a, "CaptureStrategy.runInBackground", new RunnableC3792k(2, c1563Yq));
    }
}
