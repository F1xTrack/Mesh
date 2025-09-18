package com.yandex.metrica.impl.p022ob;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Lk */
/* loaded from: classes2.dex */
public class C2762Lk {

    /* renamed from: a */
    private final LinkedList<JSONObject> f21659a;

    /* renamed from: b */
    private final C2601F9 f21660b;

    /* renamed from: c */
    private final LinkedList<String> f21661c;

    /* renamed from: d */
    private final InterfaceC3319hl f21662d;

    /* renamed from: e */
    private int f21663e;

    public C2762Lk(int i, C2601F9 c2601f9) {
        this(i, c2601f9, new C2637Gk());
    }

    /* renamed from: a */
    public void m14547a(JSONObject jSONObject) {
        if (this.f21659a.size() == this.f21663e) {
            this.f21659a.removeLast();
            this.f21661c.removeLast();
        }
        String string = jSONObject.toString();
        this.f21659a.addFirst(jSONObject);
        this.f21661c.addFirst(string);
        if (this.f21661c.isEmpty()) {
            return;
        }
        this.f21660b.m14073a(this.f21661c);
    }

    /* renamed from: b */
    public List<JSONObject> m14548b() {
        return this.f21659a;
    }

    public C2762Lk(int i, C2601F9 c2601f9, InterfaceC3319hl interfaceC3319hl) {
        this.f21659a = new LinkedList<>();
        this.f21661c = new LinkedList<>();
        this.f21663e = i;
        this.f21660b = c2601f9;
        this.f21662d = interfaceC3319hl;
        m14545a(c2601f9);
    }

    /* renamed from: a */
    private void m14545a(C2601F9 c2601f9) {
        List<String> listM14096g = c2601f9.m14096g();
        for (int iMax = Math.max(0, listM14096g.size() - this.f21663e); iMax < listM14096g.size(); iMax++) {
            String str = listM14096g.get(iMax);
            try {
                this.f21659a.addLast(new JSONObject(str));
                this.f21661c.addLast(str);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public JSONObject m14546a() {
        return this.f21662d.mo14206a(new JSONArray((Collection) this.f21659a));
    }
}
