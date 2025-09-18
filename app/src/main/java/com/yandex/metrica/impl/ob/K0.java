package com.yandex.metrica.impl.ob;

import android.content.Context;

/* loaded from: classes2.dex */
public class K0 {
    private final N2 a;
    private final N b;

    public K0(Context context) {
        this(new N2(context, "com.yandex.android.appmetrica.build_id"), new N(context, "com.yandex.android.appmetrica.is_offline"));
    }

    public String a() {
        return this.a.a();
    }

    public Boolean b() {
        return this.b.a();
    }

    public K0(N2 n2, N n) {
        this.a = n2;
        this.b = n;
    }
}
