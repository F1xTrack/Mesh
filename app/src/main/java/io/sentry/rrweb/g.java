package io.sentry.rrweb;

import io.sentry.A0;
import io.sentry.ILogger;
import io.sentry.InterfaceC5141l0;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class g extends e implements InterfaceC5141l0 {
    public f d;
    public int e;
    public float f;
    public float g;
    public int h;
    public int i;
    public HashMap j;
    public HashMap k;

    public g() {
        super(d.MouseInteraction);
        this.h = 2;
    }

    @Override // io.sentry.InterfaceC5141l0
    public final void serialize(A0 a0, ILogger iLogger) {
        a0.q();
        a0.u("type").r(iLogger, this.a);
        a0.u("timestamp").b(this.b);
        a0.u("data");
        a0.q();
        a0.u("source").r(iLogger, this.c);
        a0.u("type").r(iLogger, this.d);
        a0.u(NotificationConstants.ID).b(this.e);
        a0.u("x").c(this.f);
        a0.u("y").c(this.g);
        a0.u("pointerType").b(this.h);
        a0.u("pointerId").b(this.i);
        HashMap map = this.k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.k.get(str);
                a0.u(str);
                a0.r(iLogger, obj);
            }
        }
        a0.j();
        HashMap map2 = this.j;
        if (map2 != null) {
            for (String str2 : map2.keySet()) {
                Object obj2 = this.j.get(str2);
                a0.u(str2);
                a0.r(iLogger, obj2);
            }
        }
        a0.j();
    }
}
