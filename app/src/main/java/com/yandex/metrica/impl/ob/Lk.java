package com.yandex.metrica.impl.ob;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class Lk {
    private final LinkedList<JSONObject> a;
    private final F9 b;
    private final LinkedList<String> c;
    private final InterfaceC2811hl d;
    private int e;

    public Lk(int i, F9 f9) {
        this(i, f9, new Gk());
    }

    public void a(JSONObject jSONObject) {
        if (this.a.size() == this.e) {
            this.a.removeLast();
            this.c.removeLast();
        }
        String string = jSONObject.toString();
        this.a.addFirst(jSONObject);
        this.c.addFirst(string);
        if (this.c.isEmpty()) {
            return;
        }
        this.b.a(this.c);
    }

    public List<JSONObject> b() {
        return this.a;
    }

    public Lk(int i, F9 f9, InterfaceC2811hl interfaceC2811hl) {
        this.a = new LinkedList<>();
        this.c = new LinkedList<>();
        this.e = i;
        this.b = f9;
        this.d = interfaceC2811hl;
        a(f9);
    }

    private void a(F9 f9) {
        List<String> listG = f9.g();
        for (int iMax = Math.max(0, listG.size() - this.e); iMax < listG.size(); iMax++) {
            String str = listG.get(iMax);
            try {
                this.a.addLast(new JSONObject(str));
                this.c.addLast(str);
            } catch (Throwable unused) {
            }
        }
    }

    public JSONObject a() {
        return this.d.a(new JSONArray((Collection) this.a));
    }
}
