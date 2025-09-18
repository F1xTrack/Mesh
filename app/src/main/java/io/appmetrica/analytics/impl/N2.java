package io.appmetrica.analytics.impl;

import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class N2 {
    public final Se a;
    public final Ba b;

    public N2(Se se, Ba ba) {
        this.a = se;
        this.b = ba;
    }

    public final boolean a(T5 t5, M2 m2) {
        Iterator it = ((T8) this.a.a(t5.d)).a.iterator();
        while (it.hasNext()) {
            if (m2.a(it.next(), t5)) {
                return true;
            }
        }
        return false;
    }

    public final Se b() {
        return this.a;
    }

    public final Ba a() {
        return this.b;
    }
}
