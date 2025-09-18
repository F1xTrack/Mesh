package io.sentry;

import defpackage.C0532Go1;
import defpackage.O90;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final /* synthetic */ class C implements M0, InterfaceC5117d0, io.sentry.util.b, R0 {
    public final /* synthetic */ int a;

    public /* synthetic */ C(int i) {
        this.a = i;
    }

    @Override // io.sentry.R0
    public void a(D1 d1) {
        int i = io.sentry.android.core.X.b;
    }

    @Override // io.sentry.M0
    public void b(L0 l0) {
        switch (this.a) {
            case 0:
                l0.getClass();
                l0.b = null;
                l0.d = null;
                l0.c = null;
                l0.e.clear();
                l0.b();
                l0.g.clear();
                l0.h.clear();
                l0.i.clear();
                l0.c();
                l0.p.clear();
                break;
            case 5:
                O90.f(l0, "it");
                l0.d(io.sentry.protocol.t.b);
                break;
            case 7:
                l0.b();
                break;
            default:
                l0.h(new C0532Go1(7, l0));
                break;
        }
    }

    @Override // io.sentry.util.b
    public Object c() {
        switch (this.a) {
            case 2:
                return new U0();
            case 3:
                return new io.sentry.metrics.b();
            default:
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                for (io.sentry.clientreport.d dVar : io.sentry.clientreport.d.values()) {
                    for (EnumC5134j enumC5134j : EnumC5134j.values()) {
                        concurrentHashMap.put(new io.sentry.clientreport.c(dVar.getReason(), enumC5134j.getCategory()), new AtomicLong(0L));
                    }
                }
                return Collections.unmodifiableMap(concurrentHashMap);
        }
    }

    @Override // io.sentry.InterfaceC5117d0
    public Object d() {
        return null;
    }
}
