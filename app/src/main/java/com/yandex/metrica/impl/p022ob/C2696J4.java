package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.J4 */
/* loaded from: classes2.dex */
public class C2696J4 {

    /* renamed from: a */
    private final HashMap<String, C3562r4> f21491a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<String, C3094Z3> f21492b = new HashMap<>();

    /* renamed from: c */
    private final Context f21493c;

    public C2696J4(Context context) {
        this.f21493c = context.getApplicationContext();
    }

    /* renamed from: a */
    public synchronized C3562r4 m14416a(C3172c4 c3172c4) {
        return this.f21491a.get(c3172c4.toString());
    }

    /* renamed from: b */
    public synchronized C3562r4 m14417b(C3172c4 c3172c4, C3044X3 c3044x3, InterfaceC3302h4<C3562r4> interfaceC3302h4) {
        return (C3562r4) m14414a(c3172c4, c3044x3, interfaceC3302h4, this.f21491a);
    }

    /* renamed from: a */
    public synchronized C3094Z3 m14415a(C3172c4 c3172c4, C3044X3 c3044x3, InterfaceC3302h4<C3094Z3> interfaceC3302h4) {
        return (C3094Z3) m14414a(c3172c4, c3044x3, interfaceC3302h4, this.f21492b);
    }

    /* renamed from: a */
    private <T extends InterfaceC3406l4> T m14414a(C3172c4 c3172c4, C3044X3 c3044x3, InterfaceC3302h4<T> interfaceC3302h4, Map<String, T> map) {
        T t = map.get(c3172c4.toString());
        if (t == null) {
            T t2 = (T) interfaceC3302h4.mo15600a(this.f21493c, c3172c4, c3044x3);
            map.put(c3172c4.toString(), t2);
            return t2;
        }
        t.mo15531a(c3044x3);
        return t;
    }
}
