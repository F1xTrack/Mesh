package com.yandex.metrica.impl.p022ob;

import android.util.SparseArray;
import com.yandex.metrica.impl.p022ob.C2575E8;
import com.yandex.metrica.impl.p022ob.C2825O8;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.u8 */
/* loaded from: classes2.dex */
public class C3644u8 {

    /* renamed from: a */
    private final C3670v8 f24899a;

    /* renamed from: b */
    private final C3722x8 f24900b;

    /* renamed from: c */
    private final C2575E8.b f24901c;

    public C3644u8(C3670v8 c3670v8, C3722x8 c3722x8, C2575E8.b bVar) {
        this.f24899a = c3670v8;
        this.f24900b = c3722x8;
        this.f24901c = bVar;
    }

    /* renamed from: a */
    public C2575E8 m16903a() {
        HashMap map = new HashMap();
        map.put("binary_data", C2825O8.b.f21854a);
        return this.f24901c.m14036a("auto_inapp", this.f24899a.m16959a(), this.f24899a.m16960b(), new SparseArray<>(), new C2625G8("auto_inapp", map));
    }

    /* renamed from: b */
    public C2575E8 m16904b() {
        HashMap map = new HashMap();
        map.put("preferences", C2825O8.c.f21855a);
        return this.f24901c.m14036a("client storage", this.f24899a.m16961c(), this.f24899a.m16962d(), new SparseArray<>(), new C2625G8("metrica.db", map));
    }

    /* renamed from: c */
    public C2575E8 m16905c() {
        return this.f24901c.m14036a("main", this.f24899a.m16963e(), this.f24899a.m16964f(), this.f24899a.m16970l(), new C2625G8("main", this.f24900b.m17174a()));
    }

    /* renamed from: d */
    public C2575E8 m16906d() {
        HashMap map = new HashMap();
        map.put("preferences", C2825O8.c.f21855a);
        return this.f24901c.m14036a("metrica_multiprocess.db", this.f24899a.m16965g(), this.f24899a.m16966h(), new SparseArray<>(), new C2625G8("metrica_multiprocess.db", map));
    }

    /* renamed from: e */
    public C2575E8 m16907e() {
        HashMap map = new HashMap();
        List<String> list = C2825O8.c.f21855a;
        map.put("preferences", list);
        map.put("binary_data", C2825O8.b.f21854a);
        map.put("startup", list);
        List<String> list2 = C2825O8.a.f21849a;
        map.put("l_dat", list2);
        map.put("lbs_dat", list2);
        return this.f24901c.m14036a("metrica.db", this.f24899a.m16967i(), this.f24899a.m16968j(), this.f24899a.m16969k(), new C2625G8("metrica.db", map));
    }
}
