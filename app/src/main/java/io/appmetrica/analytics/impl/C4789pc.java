package io.appmetrica.analytics.impl;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: io.appmetrica.analytics.impl.pc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4789pc implements B8, O8 {
    public final L6 a;
    public final C4602hg b;
    public final AtomicLong c;

    public C4789pc(L6 l6, C4602hg c4602hg) {
        this.a = l6;
        this.b = c4602hg;
        this.c = new AtomicLong(l6.a());
        l6.a(this);
    }

    @Override // io.appmetrica.analytics.impl.O8
    public final void a(List<Integer> list) {
        this.c.addAndGet(list.size());
    }

    @Override // io.appmetrica.analytics.impl.B8
    public final boolean b() {
        return this.c.get() >= ((long) ((Eg) this.b.a()).j);
    }

    @Override // io.appmetrica.analytics.impl.O8
    public final void a() {
        this.c.set(this.a.a());
    }

    @Override // io.appmetrica.analytics.impl.O8
    public final void b(List<Integer> list) {
        this.c.addAndGet(-list.size());
    }
}
