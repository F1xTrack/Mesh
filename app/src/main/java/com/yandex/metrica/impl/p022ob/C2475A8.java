package com.yandex.metrica.impl.p022ob;

import org.json.JSONObject;
import p000.O90;

/* renamed from: com.yandex.metrica.impl.ob.A8 */
/* loaded from: classes2.dex */
public class C2475A8 extends AbstractC3566r8 {
    public C2475A8(C3696w8 c3696w8) {
        this(c3696w8, C2842P0.m14728i().m14754y().m14471a());
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3566r8
    /* renamed from: a */
    public long mo13848a() {
        long jOptLong;
        C2650H8 c2650h8M16682f = m16682f();
        synchronized (c2650h8M16682f) {
            jOptLong = c2650h8M16682f.m14422b().optLong("lbs_id", -1L);
        }
        return jOptLong;
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3566r8
    /* renamed from: b */
    public void mo13849b(long j) {
        C2650H8 c2650h8M16682f = m16682f();
        synchronized (c2650h8M16682f) {
            JSONObject jSONObjectPut = c2650h8M16682f.m14422b().put("lbs_id", j);
            O90.m5967e(jSONObjectPut, "getOrLoadData().put(KEY_LBS_ID, value)");
            c2650h8M16682f.m14421a(jSONObjectPut);
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3566r8
    /* renamed from: e */
    public String mo13850e() {
        return "lbs_dat";
    }

    public C2475A8(C3696w8 c3696w8, C2650H8 c2650h8) {
        super(c3696w8, c2650h8);
    }
}
