package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class J4 {
    private final HashMap<String, C3042r4> a = new HashMap<>();
    private final HashMap<String, Z3> b = new HashMap<>();
    private final Context c;

    public J4(Context context) {
        this.c = context.getApplicationContext();
    }

    public synchronized C3042r4 a(C2669c4 c2669c4) {
        return this.a.get(c2669c4.toString());
    }

    public synchronized C3042r4 b(C2669c4 c2669c4, X3 x3, InterfaceC2794h4<C3042r4> interfaceC2794h4) {
        return (C3042r4) a(c2669c4, x3, interfaceC2794h4, this.a);
    }

    public synchronized Z3 a(C2669c4 c2669c4, X3 x3, InterfaceC2794h4<Z3> interfaceC2794h4) {
        return (Z3) a(c2669c4, x3, interfaceC2794h4, this.b);
    }

    private <T extends InterfaceC2893l4> T a(C2669c4 c2669c4, X3 x3, InterfaceC2794h4<T> interfaceC2794h4, Map<String, T> map) {
        T t = map.get(c2669c4.toString());
        if (t == null) {
            T t2 = (T) interfaceC2794h4.a(this.c, c2669c4, x3);
            map.put(c2669c4.toString(), t2);
            return t2;
        }
        t.a(x3);
        return t;
    }
}
