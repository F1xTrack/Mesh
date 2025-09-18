package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.appmetrica.analytics.impl.o9 */
/* loaded from: classes2.dex */
public final class C4762o9 {
    public final List a;
    public final InterfaceC4833r9 b;
    public final AtomicBoolean c = new AtomicBoolean(true);

    public C4762o9(ArrayList arrayList, InterfaceC4833r9 interfaceC4833r9) {
        this.a = arrayList;
        this.b = interfaceC4833r9;
    }

    public final void a() {
        C4567g5 c4567g5 = (C4567g5) this.b;
        synchronized (c4567g5) {
            c4567g5.e.b();
        }
    }

    public final void b() {
        if (this.c.get()) {
            if (this.a.isEmpty()) {
                C4567g5 c4567g5 = (C4567g5) this.b;
                synchronized (c4567g5) {
                    c4567g5.e.b();
                }
                return;
            }
            Iterator it = this.a.iterator();
            boolean zB = false;
            while (it.hasNext()) {
                zB |= ((B8) it.next()).b();
            }
            if (zB) {
                a();
            }
        }
    }
}
