package com.yandex.metrica.impl.ob;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class Gh {
    private final Q9 a;
    private final Fh b;
    private final W0 c;

    public Gh(Q9 q9) {
        this(q9, new Fh(), Oh.a());
    }

    public void a() {
        W0 w0 = this.c;
        Fh fh = this.b;
        List<Hh> list = ((Eh) this.a.b()).a;
        fh.getClass();
        ArrayList arrayList = new ArrayList();
        for (Hh hh : list) {
            ArrayList arrayList2 = new ArrayList(hh.b.size());
            for (String str : hh.b) {
                if (B2.a(str)) {
                    arrayList2.add(str);
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(new Hh(hh.a, arrayList2));
            }
        }
        JSONObject jSONObject = new JSONObject();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Hh hh2 = (Hh) it.next();
            try {
                jSONObject.put(hh2.a, new JSONObject().put("classes", new JSONArray((Collection) hh2.b)));
            } catch (Throwable unused) {
            }
        }
        w0.reportEvent("sdk_list", jSONObject.toString());
    }

    public Gh(Q9 q9, Fh fh, W0 w0) {
        this.a = q9;
        this.b = fh;
        this.c = w0;
    }
}
