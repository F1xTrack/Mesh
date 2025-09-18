package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.H3;

/* loaded from: classes2.dex */
public class J3<T extends H3> {
    private final I3<T> a;
    private final G3<T> b;

    public static final class b<T extends H3> {
        final I3<T> a;
        G3<T> b;

        public b(I3<T> i3) {
            this.a = i3;
        }

        public b<T> a(G3<T> g3) {
            this.b = g3;
            return this;
        }

        public J3<T> a() {
            return new J3<>(this);
        }
    }

    public final boolean a(H3 h3) {
        G3<T> g3 = this.b;
        if (g3 == null) {
            return false;
        }
        return g3.a(h3);
    }

    public void b(H3 h3) {
        this.a.a(h3);
    }

    private J3(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
    }

    public static <T extends H3> b<T> a(I3<T> i3) {
        return new b<>(i3);
    }
}
