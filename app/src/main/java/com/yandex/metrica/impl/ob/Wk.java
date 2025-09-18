package com.yandex.metrica.impl.ob;

import android.util.Pair;
import com.yandex.metrica.impl.ob.Wl;

/* loaded from: classes2.dex */
class Wk {
    private final Xm<Xk, Pair<Boolean, Wl.b>> a;
    private final int b;

    public Wk(int i, int i2) {
        this.a = new Yk(i);
        this.b = i2;
    }

    public void a(int i, String str, boolean z, Wl.b bVar) {
        if (str.length() <= this.b) {
            this.a.a(new Xk(i, str), new Pair<>(Boolean.valueOf(z), bVar));
        }
    }

    public Pair<Boolean, Wl.b> a(int i, String str) {
        if (str.length() > this.b) {
            return null;
        }
        return this.a.a((Xm<Xk, Pair<Boolean, Wl.b>>) new Xk(i, str));
    }

    public void a() {
        this.a.a();
    }
}
