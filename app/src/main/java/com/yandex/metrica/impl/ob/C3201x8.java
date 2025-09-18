package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.O8;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.x8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3201x8 {
    private final HashMap<String, List<String>> a;

    public C3201x8() {
        HashMap<String, List<String>> map = new HashMap<>();
        this.a = map;
        map.put("reports", O8.d.a);
        map.put("sessions", O8.e.a);
        map.put("preferences", O8.c.a);
        map.put("binary_data", O8.b.a);
    }

    public HashMap<String, List<String>> a() {
        return this.a;
    }
}
