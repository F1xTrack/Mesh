package io.sentry.android.replay.capture;

import defpackage.BP0;
import defpackage.C0624Ht0;
import defpackage.C1939Yq;
import defpackage.F71;
import defpackage.H9;
import defpackage.IP0;
import defpackage.InterfaceC5927mf0;
import defpackage.InterfaceC6099nZ;
import defpackage.LB;
import defpackage.O90;
import io.sentry.D1;
import io.sentry.E;
import io.sentry.E1;
import io.sentry.android.replay.u;
import io.sentry.protocol.t;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public abstract class c implements l {
    public static final /* synthetic */ InterfaceC5927mf0[] r;
    public final D1 a;
    public final E b;
    public final io.sentry.transport.d c;
    public final ScheduledExecutorService d;
    public final InterfaceC6099nZ e;
    public final F71 f;
    public final H9 g;
    public final AtomicBoolean h;
    public io.sentry.android.replay.j i;
    public final b j;
    public final b k;
    public final AtomicLong l;
    public final b m;
    public final b n;
    public final b o;
    public final b p;
    public final ConcurrentLinkedDeque q;

    static {
        C0624Ht0 c0624Ht0 = new C0624Ht0("recorderConfig", "getRecorderConfig()Lio/sentry/android/replay/ScreenshotRecorderConfig;");
        IP0 ip0 = BP0.a;
        r = new InterfaceC5927mf0[]{ip0.d(c0624Ht0), ip0.d(new C0624Ht0("segmentTimestamp", "getSegmentTimestamp()Ljava/util/Date;")), ip0.d(new C0624Ht0("screenAtStart", "getScreenAtStart()Ljava/lang/String;")), ip0.d(new C0624Ht0("currentReplayId", "getCurrentReplayId()Lio/sentry/protocol/SentryId;")), ip0.d(new C0624Ht0("currentSegment", "getCurrentSegment()I")), ip0.d(new C0624Ht0("replayType", "getReplayType()Lio/sentry/SentryReplayEvent$ReplayType;"))};
    }

    public c(D1 d1, E e, io.sentry.transport.d dVar, ScheduledExecutorService scheduledExecutorService, InterfaceC6099nZ interfaceC6099nZ) {
        O90.f(d1, "options");
        O90.f(dVar, "dateProvider");
        this.a = d1;
        this.b = e;
        this.c = dVar;
        this.d = scheduledExecutorService;
        this.e = interfaceC6099nZ;
        this.f = LB.b(a.e);
        O90.f(dVar, "dateProvider");
        H9 h9 = new H9();
        h9.c = dVar;
        h9.d = new LinkedHashMap(10);
        this.g = h9;
        this.h = new AtomicBoolean(false);
        this.j = new b(this, this, 0);
        this.k = new b(this, this, 4);
        this.l = new AtomicLong();
        this.m = new b(this, this, 5);
        this.n = new b(t.b, this, this);
        this.o = new b(this, this, 2);
        this.p = new b(this, this, 3);
        this.q = new ConcurrentLinkedDeque();
    }

    public static final ScheduledExecutorService g(c cVar) {
        Object value = cVar.f.getValue();
        O90.e(value, "<get-persistingExecutor>(...)");
        return (ScheduledExecutorService) value;
    }

    public static k h(c cVar, long j, Date date, t tVar, int i, int i2, int i3) {
        b bVar = cVar.p;
        InterfaceC5927mf0[] interfaceC5927mf0Arr = r;
        E1 e1 = (E1) bVar.getValue(cVar, interfaceC5927mf0Arr[5]);
        io.sentry.android.replay.j jVar = cVar.i;
        int i4 = cVar.k().e;
        int i5 = cVar.k().f;
        String str = (String) cVar.m.getValue(cVar, interfaceC5927mf0Arr[2]);
        ConcurrentLinkedDeque concurrentLinkedDeque = cVar.q;
        cVar.getClass();
        O90.f(tVar, "replayId");
        O90.f(e1, "replayType");
        O90.f(concurrentLinkedDeque, "events");
        return h.a(cVar.b, cVar.a, j, date, tVar, i, i2, i3, e1, jVar, i4, i5, str, null, concurrentLinkedDeque);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a5  */
    @Override // io.sentry.android.replay.capture.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.replay.capture.c.a(android.view.MotionEvent):void");
    }

    @Override // io.sentry.android.replay.capture.l
    public void c(u uVar, int i, t tVar, E1 e1) {
        io.sentry.android.replay.j jVar;
        O90.f(uVar, "recorderConfig");
        O90.f(tVar, "replayId");
        InterfaceC6099nZ interfaceC6099nZ = this.e;
        if (interfaceC6099nZ == null || (jVar = (io.sentry.android.replay.j) interfaceC6099nZ.invoke(tVar)) == null) {
            jVar = new io.sentry.android.replay.j(this.a, tVar);
        }
        this.i = jVar;
        InterfaceC5927mf0[] interfaceC5927mf0Arr = r;
        InterfaceC5927mf0 interfaceC5927mf0 = interfaceC5927mf0Arr[3];
        b bVar = this.n;
        bVar.getClass();
        O90.f(interfaceC5927mf0, "property");
        Object andSet = bVar.b.getAndSet(tVar);
        if (!O90.a(andSet, tVar)) {
            C1939Yq c1939Yq = new C1939Yq(andSet, tVar, bVar.d, 7);
            c cVar = bVar.c;
            if (cVar.a.getMainThreadChecker().a()) {
                io.sentry.config.a.G(g(cVar), cVar.a, "CaptureStrategy.runInBackground", new com.yandex.metrica.k(2, c1939Yq));
            } else {
                c1939Yq.invoke();
            }
        }
        l(i);
        if (e1 == null) {
            e1 = this instanceof o ? E1.SESSION : E1.BUFFER;
        }
        O90.f(e1, "<set-?>");
        InterfaceC5927mf0 interfaceC5927mf02 = interfaceC5927mf0Arr[5];
        b bVar2 = this.p;
        bVar2.getClass();
        O90.f(interfaceC5927mf02, "property");
        Object andSet2 = bVar2.b.getAndSet(e1);
        if (!O90.a(andSet2, e1)) {
            C1939Yq c1939Yq2 = new C1939Yq(andSet2, e1, bVar2.d, 9);
            c cVar2 = bVar2.c;
            if (cVar2.a.getMainThreadChecker().a()) {
                io.sentry.config.a.G(g(cVar2), cVar2.a, "CaptureStrategy.runInBackground", new com.yandex.metrica.k(4, c1939Yq2));
            } else {
                c1939Yq2.invoke();
            }
        }
        m(uVar);
        n(io.sentry.config.a.k());
        AtomicLong atomicLong = this.l;
        this.c.getClass();
        atomicLong.set(System.currentTimeMillis());
    }

    public final t i() {
        return (t) this.n.getValue(this, r[3]);
    }

    public final int j() {
        return ((Number) this.o.getValue(this, r[4])).intValue();
    }

    public final u k() {
        return (u) this.j.getValue(this, r[0]);
    }

    public final void l(int i) {
        InterfaceC5927mf0 interfaceC5927mf0 = r[4];
        Integer numValueOf = Integer.valueOf(i);
        b bVar = this.o;
        bVar.getClass();
        O90.f(interfaceC5927mf0, "property");
        Object andSet = bVar.b.getAndSet(numValueOf);
        if (O90.a(andSet, numValueOf)) {
            return;
        }
        C1939Yq c1939Yq = new C1939Yq(andSet, numValueOf, bVar.d, 8);
        c cVar = bVar.c;
        if (!cVar.a.getMainThreadChecker().a()) {
            c1939Yq.invoke();
            return;
        }
        io.sentry.config.a.G(g(cVar), cVar.a, "CaptureStrategy.runInBackground", new com.yandex.metrica.k(3, c1939Yq));
    }

    public final void m(u uVar) {
        O90.f(uVar, "<set-?>");
        InterfaceC5927mf0 interfaceC5927mf0 = r[0];
        b bVar = this.j;
        bVar.getClass();
        O90.f(interfaceC5927mf0, "property");
        Object andSet = bVar.b.getAndSet(uVar);
        if (O90.a(andSet, uVar)) {
            return;
        }
        C1939Yq c1939Yq = new C1939Yq(andSet, uVar, bVar.d, 6);
        c cVar = bVar.c;
        if (!cVar.a.getMainThreadChecker().a()) {
            c1939Yq.invoke();
            return;
        }
        io.sentry.config.a.G(g(cVar), cVar.a, "CaptureStrategy.runInBackground", new com.yandex.metrica.k(1, c1939Yq));
    }

    public final void n(Date date) {
        InterfaceC5927mf0 interfaceC5927mf0 = r[1];
        b bVar = this.k;
        bVar.getClass();
        O90.f(interfaceC5927mf0, "property");
        Object andSet = bVar.b.getAndSet(date);
        if (O90.a(andSet, date)) {
            return;
        }
        C1939Yq c1939Yq = new C1939Yq(andSet, date, bVar.d, 10);
        c cVar = bVar.c;
        if (!cVar.a.getMainThreadChecker().a()) {
            c1939Yq.invoke();
            return;
        }
        io.sentry.config.a.G(g(cVar), cVar.a, "CaptureStrategy.runInBackground", new com.yandex.metrica.k(5, c1939Yq));
    }

    @Override // io.sentry.android.replay.capture.l
    public void stop() {
        io.sentry.android.replay.j jVar = this.i;
        if (jVar != null) {
            jVar.close();
        }
        l(-1);
        this.l.set(0L);
        n(null);
        t tVar = t.b;
        O90.e(tVar, "EMPTY_ID");
        InterfaceC5927mf0 interfaceC5927mf0 = r[3];
        b bVar = this.n;
        bVar.getClass();
        O90.f(interfaceC5927mf0, "property");
        Object andSet = bVar.b.getAndSet(tVar);
        if (O90.a(andSet, tVar)) {
            return;
        }
        C1939Yq c1939Yq = new C1939Yq(andSet, tVar, bVar.d, 7);
        c cVar = bVar.c;
        if (!cVar.a.getMainThreadChecker().a()) {
            c1939Yq.invoke();
            return;
        }
        io.sentry.config.a.G(g(cVar), cVar.a, "CaptureStrategy.runInBackground", new com.yandex.metrica.k(2, c1939Yq));
    }
}
