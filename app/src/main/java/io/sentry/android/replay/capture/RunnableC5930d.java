package io.sentry.android.replay.capture;

import io.sentry.protocol.C6104t;
import java.util.Date;
import p000.AbstractC8418Vg0;
import p000.InterfaceC6497nZ;
import p000.O90;

/* renamed from: io.sentry.android.replay.capture.d */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5930d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f33934a = 0;

    /* renamed from: b */
    public final /* synthetic */ long f33935b;

    /* renamed from: c */
    public final /* synthetic */ Date f33936c;

    /* renamed from: d */
    public final /* synthetic */ C6104t f33937d;

    /* renamed from: e */
    public final /* synthetic */ int f33938e;

    /* renamed from: f */
    public final /* synthetic */ int f33939f;

    /* renamed from: g */
    public final /* synthetic */ int f33940g;

    /* renamed from: h */
    public final /* synthetic */ AbstractC8418Vg0 f33941h;

    /* renamed from: i */
    public final /* synthetic */ AbstractC5929c f33942i;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ RunnableC5930d(C5932f c5932f, long j, Date date, C6104t c6104t, int i, int i2, int i3, InterfaceC6497nZ interfaceC6497nZ) {
        this.f33942i = c5932f;
        this.f33935b = j;
        this.f33936c = date;
        this.f33937d = c6104t;
        this.f33938e = i;
        this.f33939f = i2;
        this.f33940g = i3;
        this.f33941h = (AbstractC8418Vg0) interfaceC6497nZ;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [Vg0, nZ] */
    /* JADX WARN: Type inference failed for: r0v8, types: [Vg0, nZ] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f33934a) {
            case 0:
                C5932f c5932f = (C5932f) this.f33942i;
                O90.m5968f(c5932f, "this$0");
                Date date = this.f33936c;
                C6104t c6104t = this.f33937d;
                O90.m5968f(c6104t, "$replayId");
                this.f33941h.invoke(AbstractC5929c.m21651h(c5932f, this.f33935b, date, c6104t, this.f33938e, this.f33939f, this.f33940g));
                break;
            default:
                C5941o c5941o = (C5941o) this.f33942i;
                O90.m5968f(c5941o, "this$0");
                Date date2 = this.f33936c;
                C6104t c6104t2 = this.f33937d;
                O90.m5968f(c6104t2, "$replayId");
                this.f33941h.invoke(AbstractC5929c.m21651h(c5941o, this.f33935b, date2, c6104t2, this.f33938e, this.f33939f, this.f33940g));
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ RunnableC5930d(C5941o c5941o, long j, Date date, C6104t c6104t, int i, int i2, int i3, InterfaceC6497nZ interfaceC6497nZ) {
        this.f33942i = c5941o;
        this.f33935b = j;
        this.f33936c = date;
        this.f33937d = c6104t;
        this.f33938e = i;
        this.f33939f = i2;
        this.f33940g = i3;
        this.f33941h = (AbstractC8418Vg0) interfaceC6497nZ;
    }
}
