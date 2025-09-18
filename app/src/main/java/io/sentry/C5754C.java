package io.sentry;

import io.sentry.android.core.AbstractC5851X;
import io.sentry.clientreport.C5999c;
import io.sentry.clientreport.EnumC6000d;
import io.sentry.metrics.C6064b;
import io.sentry.protocol.C6104t;
import io.sentry.util.InterfaceC6169b;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import p000.C7655Go1;
import p000.O90;

/* renamed from: io.sentry.C */
/* loaded from: classes2.dex */
public final /* synthetic */ class C5754C implements InterfaceC5785M0, InterfaceC6009d0, InterfaceC6169b, InterfaceC5799R0 {

    /* renamed from: a */
    public final /* synthetic */ int f33223a;

    public /* synthetic */ C5754C(int i) {
        this.f33223a = i;
    }

    @Override // io.sentry.InterfaceC5799R0
    /* renamed from: a */
    public void mo3251a(C5759D1 c5759d1) {
        int i = AbstractC5851X.f33636b;
    }

    @Override // io.sentry.InterfaceC5785M0
    /* renamed from: b */
    public void mo3170b(C5782L0 c5782l0) {
        switch (this.f33223a) {
            case 0:
                c5782l0.getClass();
                c5782l0.f33306b = null;
                c5782l0.f33308d = null;
                c5782l0.f33307c = null;
                c5782l0.f33309e.clear();
                c5782l0.m21411b();
                c5782l0.f33311g.clear();
                c5782l0.f33312h.clear();
                c5782l0.f33313i.clear();
                c5782l0.m21412c();
                c5782l0.f33320p.clear();
                break;
            case 5:
                O90.m5968f(c5782l0, "it");
                c5782l0.m21413d(C6104t.f34442b);
                break;
            case 7:
                c5782l0.m21411b();
                break;
            default:
                c5782l0.m21417h(new C7655Go1(7, c5782l0));
                break;
        }
    }

    @Override // io.sentry.util.InterfaceC6169b
    /* renamed from: c */
    public Object mo3171c() {
        switch (this.f33223a) {
            case 2:
                return new C5808U0();
            case 3:
                return new C6064b();
            default:
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                for (EnumC6000d enumC6000d : EnumC6000d.values()) {
                    for (EnumC6051j enumC6051j : EnumC6051j.values()) {
                        concurrentHashMap.put(new C5999c(enumC6000d.getReason(), enumC6051j.getCategory()), new AtomicLong(0L));
                    }
                }
                return Collections.unmodifiableMap(concurrentHashMap);
        }
    }

    @Override // io.sentry.InterfaceC6009d0
    /* renamed from: d */
    public Object mo3252d() {
        return null;
    }
}
