package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.Map;

/* loaded from: classes2.dex */
public class V {
    private final Si a;
    private final C2727ec b;
    private final Context c;

    public V(Si si, C2727ec c2727ec, Context context) {
        this.a = si;
        this.b = c2727ec;
        this.c = context;
    }

    public U a(Map<String, String> map) {
        return new U(this.a.c(), this.b.a(this.c, new C2926mc()), map);
    }
}
