package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.M;
import com.yandex.metrica.impl.ob.Wc;
import org.json.JSONArray;

/* loaded from: classes2.dex */
public class Tc {
    private Long a;
    private long b;
    private long c;
    private JSONArray d;
    private JSONArray e;
    private M.b.a f;
    private Wc.a g;

    public void a(Long l) {
        this.a = l;
    }

    public void b(long j) {
        this.b = j;
    }

    public long c() {
        return this.c;
    }

    public long d() {
        return this.b;
    }

    public Wc.a e() {
        return this.g;
    }

    public Long f() {
        return this.a;
    }

    public JSONArray g() {
        return this.d;
    }

    public JSONArray a() {
        return this.e;
    }

    public void b(JSONArray jSONArray) {
        this.d = jSONArray;
    }

    public void a(JSONArray jSONArray) {
        this.e = jSONArray;
    }

    public M.b.a b() {
        return this.f;
    }

    public void a(long j) {
        this.c = j;
    }

    public void a(M.b.a aVar) {
        this.f = aVar;
    }

    public void a(Wc.a aVar) {
        this.g = aVar;
    }
}
