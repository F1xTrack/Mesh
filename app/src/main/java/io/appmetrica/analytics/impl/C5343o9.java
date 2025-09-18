package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.appmetrica.analytics.impl.o9 */
/* loaded from: classes2.dex */
public final class C5343o9 {

    /* renamed from: a */
    public final List f32337a;

    /* renamed from: b */
    public final InterfaceC5418r9 f32338b;

    /* renamed from: c */
    public final AtomicBoolean f32339c = new AtomicBoolean(true);

    public C5343o9(ArrayList arrayList, InterfaceC5418r9 interfaceC5418r9) {
        this.f32337a = arrayList;
        this.f32338b = interfaceC5418r9;
    }

    /* renamed from: a */
    public final void m20859a() {
        C5139g5 c5139g5 = (C5139g5) this.f32338b;
        synchronized (c5139g5) {
            c5139g5.f31726e.m20582b();
        }
    }

    /* renamed from: b */
    public final void m20860b() {
        if (this.f32339c.get()) {
            if (this.f32337a.isEmpty()) {
                C5139g5 c5139g5 = (C5139g5) this.f32338b;
                synchronized (c5139g5) {
                    c5139g5.f31726e.m20582b();
                }
                return;
            }
            Iterator it = this.f32337a.iterator();
            boolean zMo19227b = false;
            while (it.hasNext()) {
                zMo19227b |= ((InterfaceC4390B8) it.next()).mo19227b();
            }
            if (zMo19227b) {
                m20859a();
            }
        }
    }
}
