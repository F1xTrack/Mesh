package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3037Wl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.rl */
/* loaded from: classes2.dex */
public class C3579rl {

    /* renamed from: a */
    private final List<C3579rl> f24619a = new ArrayList();

    /* renamed from: b */
    private final C3037Wl f24620b;

    /* renamed from: com.yandex.metrica.impl.ob.rl$a */
    public static class a {

        /* renamed from: a */
        final int f24621a;

        /* renamed from: b */
        final int f24622b;

        /* renamed from: c */
        final JSONObject f24623c;

        public a(int i, int i2, JSONObject jSONObject) {
            this.f24621a = i;
            this.f24622b = i2;
            this.f24623c = jSONObject;
        }
    }

    public C3579rl(C3037Wl c3037Wl) {
        this.f24620b = c3037Wl;
    }

    /* renamed from: a */
    public void m16699a(C3579rl c3579rl) {
        this.f24619a.add(c3579rl);
    }

    /* renamed from: a */
    public C3037Wl m16697a() {
        return this.f24620b;
    }

    /* renamed from: a */
    public a m16698a(C2738Kl c2738Kl, C3163bl c3163bl, int i, int i2) {
        int length;
        JSONArray jSONArray;
        JSONObject jSONObject = new JSONObject();
        int i3 = i2 + 1;
        try {
            C3037Wl.b bVarMo14047a = this.f24620b.mo14047a(c3163bl);
            boolean z = true;
            boolean z2 = c2738Kl.f21597f || this.f24620b.mo14049a();
            if (bVarMo14047a != null && c2738Kl.f21600i) {
                z = false;
            }
            if (z2 && z) {
                jSONObject = this.f24620b.m15399a(c2738Kl, bVarMo14047a);
            }
            length = jSONObject.toString().getBytes().length + i;
            try {
                jSONArray = new JSONArray();
                jSONObject.put("ch", jSONArray);
                length += 8;
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            length = i;
        }
        if (length <= c2738Kl.f21605n && i3 <= c2738Kl.f21604m) {
            Iterator<C3579rl> it = this.f24619a.iterator();
            while (it.hasNext()) {
                a aVarM16698a = it.next().m16698a(c2738Kl, c3163bl, length + 1, i3);
                JSONObject jSONObject2 = aVarM16698a.f24623c;
                if (jSONObject2 != null) {
                    jSONArray.put(jSONObject2);
                }
                int i4 = aVarM16698a.f24621a;
                if (i4 == 0) {
                    break;
                }
                i3 += aVarM16698a.f24622b;
                length += i4;
            }
            return new a(length - i, i3 - i2, jSONObject);
        }
        return new a(0, 0, null);
    }
}
