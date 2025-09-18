package io.appmetrica.analytics.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import p000.AbstractC0576J8;

/* renamed from: io.appmetrica.analytics.impl.D5 */
/* loaded from: classes2.dex */
public final class C4437D5 implements InterfaceC4390B8, InterfaceC4705O8 {

    /* renamed from: a */
    public final C4631L6 f29996a;

    /* renamed from: b */
    public final Set f29997b;

    /* renamed from: c */
    public final AtomicLong f29998c;

    public C4437D5(C4631L6 c4631l6) {
        this.f29996a = c4631l6;
        Set setM4175F = AbstractC0576J8.m4175F(new Integer[]{Integer.valueOf(EnumC4898Wa.EVENT_CLIENT_EXTERNAL_ATTRIBUTION.m19947a()), Integer.valueOf(EnumC4898Wa.EVENT_TYPE_APP_UPDATE.m19947a()), Integer.valueOf(EnumC4898Wa.EVENT_TYPE_FIRST_ACTIVATION.m19947a()), Integer.valueOf(EnumC4898Wa.EVENT_TYPE_INIT.m19947a()), Integer.valueOf(EnumC4898Wa.EVENT_TYPE_SEND_AD_REVENUE_EVENT.m19947a()), Integer.valueOf(EnumC4898Wa.EVENT_TYPE_SEND_ECOMMERCE_EVENT.m19947a()), Integer.valueOf(EnumC4898Wa.EVENT_TYPE_SEND_REFERRER.m19947a()), Integer.valueOf(EnumC4898Wa.EVENT_TYPE_SEND_REVENUE_EVENT.m19947a())});
        this.f29997b = setM4175F;
        this.f29998c = new AtomicLong(c4631l6.m19584a(setM4175F));
        c4631l6.m19590a(this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4705O8
    /* renamed from: a */
    public final void mo19307a() {
        this.f29998c.set(this.f29996a.m19584a(this.f29997b));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4390B8
    /* renamed from: b */
    public final boolean mo19227b() {
        return this.f29998c.get() > 0;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4705O8
    /* renamed from: b */
    public final void mo19309b(List<Integer> list) {
        int i = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (this.f29997b.contains(Integer.valueOf(((Number) it.next()).intValue())) && (i = i + 1) < 0) {
                    throw new ArithmeticException("Count overflow has happened.");
                }
            }
        }
        this.f29998c.addAndGet(-i);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4705O8
    /* renamed from: a */
    public final void mo19308a(List<Integer> list) {
        int i = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (this.f29997b.contains(Integer.valueOf(((Number) it.next()).intValue())) && (i = i + 1) < 0) {
                    throw new ArithmeticException("Count overflow has happened.");
                }
            }
        }
        this.f29998c.addAndGet(i);
    }
}
