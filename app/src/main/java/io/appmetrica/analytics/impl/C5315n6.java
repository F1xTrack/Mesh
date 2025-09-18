package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.AbstractC0246Du;

/* renamed from: io.appmetrica.analytics.impl.n6 */
/* loaded from: classes2.dex */
public final class C5315n6 implements InterfaceC4417Ca {

    /* renamed from: a */
    public final CopyOnWriteArrayList f32244a = new CopyOnWriteArrayList();

    @Override // io.appmetrica.analytics.impl.InterfaceC4417Ca
    /* renamed from: a */
    public final void mo19267a(Throwable th, C4815T c4815t) {
        Iterator it = this.f32244a.iterator();
        while (it.hasNext()) {
            ((InterfaceC4417Ca) it.next()).mo19267a(th, c4815t);
        }
    }

    /* renamed from: a */
    public final void m20803a(InterfaceC4417Ca... interfaceC4417CaArr) {
        AbstractC0246Du.m1921n(this.f32244a, interfaceC4417CaArr);
    }

    /* renamed from: a */
    public final void m20802a(List<? extends InterfaceC4417Ca> list) {
        this.f32244a.addAll(list);
    }

    /* renamed from: a */
    public final void m20801a() {
        this.f32244a.clear();
    }
}
