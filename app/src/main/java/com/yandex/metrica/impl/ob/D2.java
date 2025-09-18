package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class D2 {
    private final E2 a;
    private final Context b;
    private final Map<String, C2> c = new HashMap();

    public D2(Context context, E2 e2) {
        this.b = context;
        this.a = e2;
    }

    public synchronized C2 a(String str, com.yandex.metrica.c cVar) {
        C2 c2;
        c2 = this.c.get(str);
        if (c2 == null) {
            c2 = new C2(str, this.b, cVar, this.a);
            this.c.put(str, c2);
        }
        return c2;
    }
}
