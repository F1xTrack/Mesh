package com.yandex.metrica.impl.ob;

import defpackage.O90;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class A8 extends AbstractC3046r8 {
    public A8(C3176w8 c3176w8) {
        this(c3176w8, P0.i().y().a());
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC3046r8
    public long a() {
        long jOptLong;
        H8 h8F = f();
        synchronized (h8F) {
            jOptLong = h8F.b().optLong("lbs_id", -1L);
        }
        return jOptLong;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC3046r8
    public void b(long j) {
        H8 h8F = f();
        synchronized (h8F) {
            JSONObject jSONObjectPut = h8F.b().put("lbs_id", j);
            O90.e(jSONObjectPut, "getOrLoadData().put(KEY_LBS_ID, value)");
            h8F.a(jSONObjectPut);
        }
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC3046r8
    public String e() {
        return "lbs_dat";
    }

    public A8(C3176w8 c3176w8, H8 h8) {
        super(c3176w8, h8);
    }
}
