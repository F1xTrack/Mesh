package com.yandex.metrica.impl.ob;

import android.util.SparseArray;
import com.yandex.metrica.impl.ob.E8;
import com.yandex.metrica.impl.ob.O8;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.u8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3121u8 {
    private final C3146v8 a;
    private final C3201x8 b;
    private final E8.b c;

    public C3121u8(C3146v8 c3146v8, C3201x8 c3201x8, E8.b bVar) {
        this.a = c3146v8;
        this.b = c3201x8;
        this.c = bVar;
    }

    public E8 a() {
        HashMap map = new HashMap();
        map.put("binary_data", O8.b.a);
        return this.c.a("auto_inapp", this.a.a(), this.a.b(), new SparseArray<>(), new G8("auto_inapp", map));
    }

    public E8 b() {
        HashMap map = new HashMap();
        map.put("preferences", O8.c.a);
        return this.c.a("client storage", this.a.c(), this.a.d(), new SparseArray<>(), new G8("metrica.db", map));
    }

    public E8 c() {
        return this.c.a("main", this.a.e(), this.a.f(), this.a.l(), new G8("main", this.b.a()));
    }

    public E8 d() {
        HashMap map = new HashMap();
        map.put("preferences", O8.c.a);
        return this.c.a("metrica_multiprocess.db", this.a.g(), this.a.h(), new SparseArray<>(), new G8("metrica_multiprocess.db", map));
    }

    public E8 e() {
        HashMap map = new HashMap();
        List<String> list = O8.c.a;
        map.put("preferences", list);
        map.put("binary_data", O8.b.a);
        map.put("startup", list);
        List<String> list2 = O8.a.a;
        map.put("l_dat", list2);
        map.put("lbs_dat", list2);
        return this.c.a("metrica.db", this.a.i(), this.a.j(), this.a.k(), new G8("metrica.db", map));
    }
}
