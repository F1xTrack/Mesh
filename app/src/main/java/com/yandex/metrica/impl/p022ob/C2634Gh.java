package com.yandex.metrica.impl.p022ob;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Gh */
/* loaded from: classes2.dex */
public class C2634Gh {

    /* renamed from: a */
    private final C2876Q9 f21317a;

    /* renamed from: b */
    private final C2609Fh f21318b;

    /* renamed from: c */
    private final InterfaceC3016W0 f21319c;

    public C2634Gh(C2876Q9 c2876q9) {
        this(c2876q9, new C2609Fh(), C2834Oh.m14711a());
    }

    /* renamed from: a */
    public void m14202a() {
        InterfaceC3016W0 interfaceC3016W0 = this.f21319c;
        C2609Fh c2609Fh = this.f21318b;
        List<C2659Hh> list = ((C2584Eh) this.f21317a.m14814b()).f21117a;
        c2609Fh.getClass();
        ArrayList arrayList = new ArrayList();
        for (C2659Hh c2659Hh : list) {
            ArrayList arrayList2 = new ArrayList(c2659Hh.f21365b.size());
            for (String str : c2659Hh.f21365b) {
                if (C2494B2.m13908a(str)) {
                    arrayList2.add(str);
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(new C2659Hh(c2659Hh.f21364a, arrayList2));
            }
        }
        JSONObject jSONObject = new JSONObject();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C2659Hh c2659Hh2 = (C2659Hh) it.next();
            try {
                jSONObject.put(c2659Hh2.f21364a, new JSONObject().put("classes", new JSONArray((Collection) c2659Hh2.f21365b)));
            } catch (Throwable unused) {
            }
        }
        interfaceC3016W0.reportEvent("sdk_list", jSONObject.toString());
    }

    public C2634Gh(C2876Q9 c2876q9, C2609Fh c2609Fh, InterfaceC3016W0 interfaceC3016W0) {
        this.f21317a = c2876q9;
        this.f21318b = c2609Fh;
        this.f21319c = interfaceC3016W0;
    }
}
