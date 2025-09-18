package com.yandex.metrica.impl.p022ob;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.pe */
/* loaded from: classes2.dex */
public class C3520pe {

    /* renamed from: b */
    public static final Map<String, String> f24448b = Collections.unmodifiableMap(new a());

    /* renamed from: a */
    private C3546qe f24449a;

    /* renamed from: com.yandex.metrica.impl.ob.pe$a */
    public class a extends HashMap<String, String> {
        public a() {
            put("20799a27-fa80-4b36-b2db-0f8141f24180", "13");
            put("01528cc0-dd34-494d-9218-24af1317e1ee", "17233");
            put("4e610cd2-753f-4bfc-9b05-772ce8905c5e", "21952");
            put("67bb016b-be40-4c08-a190-96a3f3b503d3", "22675");
            put("e4250327-8d3c-4d35-b9e8-3c1720a64b91", "22678");
            put("6c5f504e-8928-47b5-bfb5-73af8d8bf4b4", "30404");
            put("7d962ba4-a392-449a-a02d-6c5be5613928", "30407");
        }
    }

    public C3520pe(C3546qe c3546qe) {
        this.f24449a = c3546qe;
    }

    /* renamed from: a */
    public void m16580a() {
        if (this.f24449a.m16610b(null) != null) {
            this.f24449a.m16618j();
            this.f24449a.m16614f();
        }
    }

    /* renamed from: b */
    public void m16582b() {
        Map<String, ?> all = this.f24449a.f24614b.getAll();
        for (String str : f24448b.values()) {
            int i = C3546qe.f24540j;
            all.remove(new C3754ye("init_event_pref_key", str).m17234a());
        }
        LinkedList linkedList = new LinkedList();
        for (String str2 : all.keySet()) {
            try {
                int i2 = C3546qe.f24540j;
                linkedList.add(Integer.valueOf(Integer.parseInt(str2.replace("init_event_pref_key", ""))));
            } catch (Throwable unused) {
            }
        }
        m16581a(linkedList.size() == 1 ? ((Integer) linkedList.getFirst()).toString() : null);
    }

    /* renamed from: c */
    public void m16583c() {
        String str = f24448b.get(this.f24449a.f24613a);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Map<String, ?> all = this.f24449a.f24614b.getAll();
        int i = C3546qe.f24540j;
        if ("DONE".equals(all.get(new C3754ye("init_event_pref_key", str).m17234a()))) {
            m16581a(str);
        }
    }

    /* renamed from: a */
    public void m16581a(String str) {
        if (str != null) {
            C3546qe c3546qe = this.f24449a;
            c3546qe.getClass();
            c3546qe.f24614b.edit().remove(new C3754ye("init_event_pref_key", str).m17234a()).apply();
            this.f24449a.m16618j();
        }
    }
}
