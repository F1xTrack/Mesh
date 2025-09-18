package io.appmetrica.analytics.impl;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: io.appmetrica.analytics.impl.pc */
/* loaded from: classes2.dex */
public final class C5371pc implements InterfaceC4390B8, InterfaceC4705O8 {

    /* renamed from: a */
    public final C4631L6 f32393a;

    /* renamed from: b */
    public final C5175hg f32394b;

    /* renamed from: c */
    public final AtomicLong f32395c;

    public C5371pc(C4631L6 c4631l6, C5175hg c5175hg) {
        this.f32393a = c4631l6;
        this.f32394b = c5175hg;
        this.f32395c = new AtomicLong(c4631l6.m19583a());
        c4631l6.m19590a(this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4705O8
    /* renamed from: a */
    public final void mo19308a(List<Integer> list) {
        this.f32395c.addAndGet(list.size());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4390B8
    /* renamed from: b */
    public final boolean mo19227b() {
        return this.f32395c.get() >= ((long) ((C4473Eg) this.f32394b.m21113a()).f30086j);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4705O8
    /* renamed from: a */
    public final void mo19307a() {
        this.f32395c.set(this.f32393a.m19583a());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4705O8
    /* renamed from: b */
    public final void mo19309b(List<Integer> list) {
        this.f32395c.addAndGet(-list.size());
    }
}
