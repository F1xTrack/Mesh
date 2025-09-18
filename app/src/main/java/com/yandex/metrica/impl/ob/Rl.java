package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Wl;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class Rl implements InterfaceC2860jl {
    private final List<Wl> a;

    public Rl(List<Wl> list) {
        this.a = list;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2860jl
    public Object a(Gl gl, Kl kl, C2661bl c2661bl, int i) {
        JSONArray jSONArray = new JSONArray();
        if (this.a.isEmpty()) {
            return jSONArray;
        }
        for (Wl wl : this.a) {
            Wl.b bVarA = wl.a(c2661bl);
            int i2 = 0;
            if ((kl.f || wl.a()) && (bVarA == null || !kl.i)) {
                JSONObject jSONObjectA = wl.a(kl, bVarA);
                int length = jSONObjectA.toString().getBytes().length + 1;
                int length2 = jSONArray.length();
                if (i + length <= kl.n && length2 < kl.m) {
                    jSONArray.put(jSONObjectA);
                    i2 = length;
                }
            }
            i += i2;
        }
        return jSONArray;
    }
}
