package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3037Wl;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Rl */
/* loaded from: classes2.dex */
public class C2912Rl implements InterfaceC3371jl {

    /* renamed from: a */
    private final List<C3037Wl> f22282a;

    public C2912Rl(List<C3037Wl> list) {
        this.f22282a = list;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3371jl
    /* renamed from: a */
    public Object mo15087a(C2638Gl c2638Gl, C2738Kl c2738Kl, C3163bl c3163bl, int i) {
        JSONArray jSONArray = new JSONArray();
        if (this.f22282a.isEmpty()) {
            return jSONArray;
        }
        for (C3037Wl c3037Wl : this.f22282a) {
            C3037Wl.b bVarMo14047a = c3037Wl.mo14047a(c3163bl);
            int i2 = 0;
            if ((c2738Kl.f21597f || c3037Wl.mo14049a()) && (bVarMo14047a == null || !c2738Kl.f21600i)) {
                JSONObject jSONObjectM15399a = c3037Wl.m15399a(c2738Kl, bVarMo14047a);
                int length = jSONObjectM15399a.toString().getBytes().length + 1;
                int length2 = jSONArray.length();
                if (i + length <= c2738Kl.f21605n && length2 < c2738Kl.f21604m) {
                    jSONArray.put(jSONObjectM15399a);
                    i2 = length;
                }
            }
            i += i2;
        }
        return jSONArray;
    }
}
