package com.yandex.metrica.impl.ob;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class Gl {
    private C3059rl a;

    public void a(C3109tl c3109tl, View view, InterfaceC2835il interfaceC2835il) {
        C3059rl c3059rlB = c3109tl.b(null, view, 0);
        this.a = c3059rlB;
        if (c3059rlB != null) {
            a(c3109tl, c3059rlB, view, 1, interfaceC2835il);
        }
    }

    public JSONObject a(Kl kl, C2661bl c2661bl, int i) {
        C3059rl c3059rl = this.a;
        JSONObject jSONObject = c3059rl != null ? c3059rl.a(kl, c2661bl, i, 0).c : null;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    private void a(C3109tl c3109tl, C3059rl c3059rl, View view, int i, InterfaceC2835il interfaceC2835il) {
        ArrayList arrayList = (ArrayList) c3109tl.a(view, i);
        if (arrayList.size() == 0) {
            interfaceC2835il.a(c3059rl.a());
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            View view2 = (View) it.next();
            C3059rl c3059rlB = c3109tl.b(c3059rl.a(), view2, i);
            if (c3059rlB != null) {
                c3059rl.a(c3059rlB);
                a(c3109tl, c3059rlB, view2, i + 1, interfaceC2835il);
            }
        }
    }
}
