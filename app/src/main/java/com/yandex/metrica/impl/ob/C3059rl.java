package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Wl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.rl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3059rl {
    private final List<C3059rl> a = new ArrayList();
    private final Wl b;

    /* renamed from: com.yandex.metrica.impl.ob.rl$a */
    public static class a {
        final int a;
        final int b;
        final JSONObject c;

        public a(int i, int i2, JSONObject jSONObject) {
            this.a = i;
            this.b = i2;
            this.c = jSONObject;
        }
    }

    public C3059rl(Wl wl) {
        this.b = wl;
    }

    public void a(C3059rl c3059rl) {
        this.a.add(c3059rl);
    }

    public Wl a() {
        return this.b;
    }

    public a a(Kl kl, C2661bl c2661bl, int i, int i2) {
        int length;
        JSONArray jSONArray;
        JSONObject jSONObject = new JSONObject();
        int i3 = i2 + 1;
        try {
            Wl.b bVarA = this.b.a(c2661bl);
            boolean z = true;
            boolean z2 = kl.f || this.b.a();
            if (bVarA != null && kl.i) {
                z = false;
            }
            if (z2 && z) {
                jSONObject = this.b.a(kl, bVarA);
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
        if (length <= kl.n && i3 <= kl.m) {
            Iterator<C3059rl> it = this.a.iterator();
            while (it.hasNext()) {
                a aVarA = it.next().a(kl, c2661bl, length + 1, i3);
                JSONObject jSONObject2 = aVarA.c;
                if (jSONObject2 != null) {
                    jSONArray.put(jSONObject2);
                }
                int i4 = aVarA.a;
                if (i4 == 0) {
                    break;
                }
                i3 += aVarA.b;
                length += i4;
            }
            return new a(length - i, i3 - i2, jSONObject);
        }
        return new a(0, 0, null);
    }
}
