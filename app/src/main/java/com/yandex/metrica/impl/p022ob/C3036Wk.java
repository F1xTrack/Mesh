package com.yandex.metrica.impl.p022ob;

import android.util.Pair;
import com.yandex.metrica.impl.p022ob.C3037Wl;

/* renamed from: com.yandex.metrica.impl.ob.Wk */
/* loaded from: classes2.dex */
class C3036Wk {

    /* renamed from: a */
    private final C3063Xm<C3061Xk, Pair<Boolean, C3037Wl.b>> f22705a;

    /* renamed from: b */
    private final int f22706b;

    public C3036Wk(int i, int i2) {
        this.f22705a = new C3086Yk(i);
        this.f22706b = i2;
    }

    /* renamed from: a */
    public void m15398a(int i, String str, boolean z, C3037Wl.b bVar) {
        if (str.length() <= this.f22706b) {
            this.f22705a.m15439a(new C3061Xk(i, str), new Pair<>(Boolean.valueOf(z), bVar));
        }
    }

    /* renamed from: a */
    public Pair<Boolean, C3037Wl.b> m15396a(int i, String str) {
        if (str.length() > this.f22706b) {
            return null;
        }
        return this.f22705a.m15438a((C3063Xm<C3061Xk, Pair<Boolean, C3037Wl.b>>) new C3061Xk(i, str));
    }

    /* renamed from: a */
    public void m15397a() {
        this.f22705a.m15440a();
    }
}
