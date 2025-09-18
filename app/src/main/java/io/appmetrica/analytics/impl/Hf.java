package io.appmetrica.analytics.impl;

import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class Hf implements Bf {
    public final HashSet a;
    public boolean b;
    public Ef c;

    public Hf() {
        this(C4667ka.h().r());
    }

    @Override // io.appmetrica.analytics.impl.Bf
    public final synchronized void a(Ef ef) {
        try {
            this.c = ef;
            this.b = true;
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((InterfaceC4911uf) it.next()).a(this.c);
            }
            this.a.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public Hf(Cf cf) {
        this.a = new HashSet();
        cf.a(new C5012yk(this));
        cf.a();
    }

    public final synchronized void a(InterfaceC4911uf interfaceC4911uf) {
        this.a.add(interfaceC4911uf);
        if (this.b) {
            interfaceC4911uf.a(this.c);
            this.a.remove(interfaceC4911uf);
        }
    }
}
