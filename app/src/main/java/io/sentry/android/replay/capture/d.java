package io.sentry.android.replay.capture;

import defpackage.AbstractC1676Vg0;
import defpackage.InterfaceC6099nZ;
import defpackage.O90;
import io.sentry.protocol.t;
import java.util.Date;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Date c;
    public final /* synthetic */ t d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ AbstractC1676Vg0 h;
    public final /* synthetic */ c i;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ d(f fVar, long j, Date date, t tVar, int i, int i2, int i3, InterfaceC6099nZ interfaceC6099nZ) {
        this.i = fVar;
        this.b = j;
        this.c = date;
        this.d = tVar;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = (AbstractC1676Vg0) interfaceC6099nZ;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [Vg0, nZ] */
    /* JADX WARN: Type inference failed for: r0v8, types: [Vg0, nZ] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f fVar = (f) this.i;
                O90.f(fVar, "this$0");
                Date date = this.c;
                t tVar = this.d;
                O90.f(tVar, "$replayId");
                this.h.invoke(c.h(fVar, this.b, date, tVar, this.e, this.f, this.g));
                break;
            default:
                o oVar = (o) this.i;
                O90.f(oVar, "this$0");
                Date date2 = this.c;
                t tVar2 = this.d;
                O90.f(tVar2, "$replayId");
                this.h.invoke(c.h(oVar, this.b, date2, tVar2, this.e, this.f, this.g));
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ d(o oVar, long j, Date date, t tVar, int i, int i2, int i3, InterfaceC6099nZ interfaceC6099nZ) {
        this.i = oVar;
        this.b = j;
        this.c = date;
        this.d = tVar;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = (AbstractC1676Vg0) interfaceC6099nZ;
    }
}
