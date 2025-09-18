package com.yandex.metrica.impl.ob;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class Vb {
    private final List<Tb> a;
    private final Wb b;
    private final AtomicBoolean c = new AtomicBoolean(true);

    public Vb(List<Tb> list, Wb wb) {
        this.a = list;
        this.b = wb;
    }

    public void a() {
        this.c.set(false);
    }

    public void b() {
        this.c.set(true);
    }

    public void c() {
        if (this.c.get()) {
            if (this.a.isEmpty()) {
                ((C2744f4) this.b).c();
                return;
            }
            Iterator<Tb> it = this.a.iterator();
            boolean zA = false;
            while (it.hasNext()) {
                zA |= it.next().a();
            }
            if (zA) {
                ((C2744f4) this.b).c();
            }
        }
    }
}
