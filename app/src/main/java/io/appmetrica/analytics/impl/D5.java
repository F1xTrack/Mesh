package io.appmetrica.analytics.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class D5 implements B8, O8 {
    public final L6 a;
    public final Set b;
    public final AtomicLong c;

    public D5(L6 l6) {
        this.a = l6;
        Set setF = defpackage.J8.F(new Integer[]{Integer.valueOf(Wa.EVENT_CLIENT_EXTERNAL_ATTRIBUTION.a()), Integer.valueOf(Wa.EVENT_TYPE_APP_UPDATE.a()), Integer.valueOf(Wa.EVENT_TYPE_FIRST_ACTIVATION.a()), Integer.valueOf(Wa.EVENT_TYPE_INIT.a()), Integer.valueOf(Wa.EVENT_TYPE_SEND_AD_REVENUE_EVENT.a()), Integer.valueOf(Wa.EVENT_TYPE_SEND_ECOMMERCE_EVENT.a()), Integer.valueOf(Wa.EVENT_TYPE_SEND_REFERRER.a()), Integer.valueOf(Wa.EVENT_TYPE_SEND_REVENUE_EVENT.a())});
        this.b = setF;
        this.c = new AtomicLong(l6.a(setF));
        l6.a(this);
    }

    @Override // io.appmetrica.analytics.impl.O8
    public final void a() {
        this.c.set(this.a.a(this.b));
    }

    @Override // io.appmetrica.analytics.impl.B8
    public final boolean b() {
        return this.c.get() > 0;
    }

    @Override // io.appmetrica.analytics.impl.O8
    public final void b(List<Integer> list) {
        int i = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (this.b.contains(Integer.valueOf(((Number) it.next()).intValue())) && (i = i + 1) < 0) {
                    throw new ArithmeticException("Count overflow has happened.");
                }
            }
        }
        this.c.addAndGet(-i);
    }

    @Override // io.appmetrica.analytics.impl.O8
    public final void a(List<Integer> list) {
        int i = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (this.b.contains(Integer.valueOf(((Number) it.next()).intValue())) && (i = i + 1) < 0) {
                    throw new ArithmeticException("Count overflow has happened.");
                }
            }
        }
        this.c.addAndGet(i);
    }
}
