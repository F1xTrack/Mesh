package com.yandex.metrica.impl.p022ob;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Gl */
/* loaded from: classes2.dex */
class C2638Gl {

    /* renamed from: a */
    private C3579rl f21323a;

    /* renamed from: a */
    public void m14209a(C3631tl c3631tl, View view, InterfaceC3345il interfaceC3345il) {
        C3579rl c3579rlM16879b = c3631tl.m16879b(null, view, 0);
        this.f21323a = c3579rlM16879b;
        if (c3579rlM16879b != null) {
            m14207a(c3631tl, c3579rlM16879b, view, 1, interfaceC3345il);
        }
    }

    /* renamed from: a */
    public JSONObject m14208a(C2738Kl c2738Kl, C3163bl c3163bl, int i) {
        C3579rl c3579rl = this.f21323a;
        JSONObject jSONObject = c3579rl != null ? c3579rl.m16698a(c2738Kl, c3163bl, i, 0).f24623c : null;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    /* renamed from: a */
    private void m14207a(C3631tl c3631tl, C3579rl c3579rl, View view, int i, InterfaceC3345il interfaceC3345il) {
        ArrayList arrayList = (ArrayList) c3631tl.m16877a(view, i);
        if (arrayList.size() == 0) {
            interfaceC3345il.mo14958a(c3579rl.m16697a());
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            View view2 = (View) it.next();
            C3579rl c3579rlM16879b = c3631tl.m16879b(c3579rl.m16697a(), view2, i);
            if (c3579rlM16879b != null) {
                c3579rl.m16699a(c3579rlM16879b);
                m14207a(c3631tl, c3579rlM16879b, view2, i + 1, interfaceC3345il);
            }
        }
    }
}
