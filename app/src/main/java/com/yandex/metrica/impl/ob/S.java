package com.yandex.metrica.impl.ob;

import java.util.HashMap;

/* loaded from: classes2.dex */
public class S extends C2864k0 {
    private HashMap<a, Integer> q;
    private Pn<String> r;
    private Pn<String> s;
    private Pn<String> t;
    private Pn<byte[]> u;
    private Pn<String> v;
    private Pn<String> w;

    public enum a {
        NAME,
        VALUE,
        USER_INFO
    }

    public S(Im im) {
        this.q = new HashMap<>();
        a(im);
    }

    private String g(String str) {
        String strA = this.r.a(str);
        a(str, strA, a.NAME);
        return strA;
    }

    private String h(String str) {
        String strA = this.s.a(str);
        a(str, strA, a.VALUE);
        return strA;
    }

    public static C2864k0 r() {
        C2864k0 c2864k0 = new C2864k0();
        c2864k0.e = EnumC2865k1.EVENT_TYPE_SEND_USER_PROFILE.b();
        return c2864k0;
    }

    private void t() {
        this.h = 0;
        for (Integer num : this.q.values()) {
            this.h = num.intValue() + this.h;
        }
    }

    public S a(HashMap<a, Integer> map) {
        this.q = map;
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.C2864k0
    public C2864k0 b(String str) {
        String strA = this.r.a(str);
        a(str, strA, a.NAME);
        this.a = strA;
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.C2864k0
    public C2864k0 d(String str) {
        return super.d(this.v.a(str));
    }

    @Override // com.yandex.metrica.impl.ob.C2864k0
    public C2864k0 e(String str) {
        String strA = this.w.a(str);
        a(str, strA, a.USER_INFO);
        return super.e(strA);
    }

    @Override // com.yandex.metrica.impl.ob.C2864k0
    public C2864k0 f(String str) {
        String strA = this.s.a(str);
        a(str, strA, a.VALUE);
        this.b = strA;
        return this;
    }

    public S i(String str) {
        String strA = this.t.a(str);
        a(str, strA, a.VALUE);
        this.b = strA;
        return this;
    }

    public HashMap<a, Integer> s() {
        return this.q;
    }

    private void a(Im im) {
        this.r = new Nn(1000, "event name", im);
        this.s = new Mn(245760, "event value", im);
        this.t = new Mn(1024000, "event extended value", im);
        this.u = new Dn(245760, "event value bytes", im);
        this.v = new Nn(200, "user profile id", im);
        this.w = new Nn(10000, "UserInfo", im);
    }

    public S(String str, String str2, int i, Im im) {
        this(str, str2, i, 0, im);
    }

    public S(String str, String str2, int i, int i2, Im im) {
        this.q = new HashMap<>();
        a(im);
        this.b = h(str);
        this.a = g(str2);
        this.e = i;
        this.f = i2;
    }

    private void a(String str, String str2, a aVar) {
        if (C2814i.a(str, str2)) {
            this.q.put(aVar, Integer.valueOf(O2.c(str).length - O2.c(str2).length));
        } else {
            this.q.remove(aVar);
        }
        t();
    }

    public S(byte[] bArr, String str, int i, Im im) {
        this.q = new HashMap<>();
        a(im);
        a(bArr);
        this.a = g(str);
        this.e = i;
    }

    @Override // com.yandex.metrica.impl.ob.C2864k0
    public final C2864k0 a(byte[] bArr) {
        byte[] bArrA = this.u.a(bArr);
        a aVar = a.VALUE;
        if (bArr.length != bArrA.length) {
            this.q.put(aVar, Integer.valueOf(bArr.length - bArrA.length));
        } else {
            this.q.remove(aVar);
        }
        t();
        return super.a(bArrA);
    }

    public static C2864k0 a(String str, Im im) {
        S s = new S(im);
        s.e = EnumC2865k1.EVENT_TYPE_SET_USER_PROFILE_ID.b();
        return super.d(s.v.a(str));
    }
}
