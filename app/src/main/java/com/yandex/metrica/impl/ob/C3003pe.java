package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.pe, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3003pe {
    public static final Map<String, String> b = Collections.unmodifiableMap(new a());
    private C3028qe a;

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

    public C3003pe(C3028qe c3028qe) {
        this.a = c3028qe;
    }

    public void a() {
        if (this.a.b(null) != null) {
            this.a.j();
            this.a.f();
        }
    }

    public void b() {
        Map<String, ?> all = this.a.b.getAll();
        for (String str : b.values()) {
            int i = C3028qe.j;
            all.remove(new C3232ye("init_event_pref_key", str).a());
        }
        LinkedList linkedList = new LinkedList();
        for (String str2 : all.keySet()) {
            try {
                int i2 = C3028qe.j;
                linkedList.add(Integer.valueOf(Integer.parseInt(str2.replace("init_event_pref_key", ""))));
            } catch (Throwable unused) {
            }
        }
        a(linkedList.size() == 1 ? ((Integer) linkedList.getFirst()).toString() : null);
    }

    public void c() {
        String str = b.get(this.a.a);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Map<String, ?> all = this.a.b.getAll();
        int i = C3028qe.j;
        if ("DONE".equals(all.get(new C3232ye("init_event_pref_key", str).a()))) {
            a(str);
        }
    }

    public void a(String str) {
        if (str != null) {
            C3028qe c3028qe = this.a;
            c3028qe.getClass();
            c3028qe.b.edit().remove(new C3232ye("init_event_pref_key", str).a()).apply();
            this.a.j();
        }
    }
}
