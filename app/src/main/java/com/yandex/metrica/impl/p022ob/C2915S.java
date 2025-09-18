package com.yandex.metrica.impl.p022ob;

import java.util.HashMap;

/* renamed from: com.yandex.metrica.impl.ob.S */
/* loaded from: classes2.dex */
public class C2915S extends C3376k0 {

    /* renamed from: q */
    private HashMap<a, Integer> f22284q;

    /* renamed from: r */
    private InterfaceC2865Pn<String> f22285r;

    /* renamed from: s */
    private InterfaceC2865Pn<String> f22286s;

    /* renamed from: t */
    private InterfaceC2865Pn<String> f22287t;

    /* renamed from: u */
    private InterfaceC2865Pn<byte[]> f22288u;

    /* renamed from: v */
    private InterfaceC2865Pn<String> f22289v;

    /* renamed from: w */
    private InterfaceC2865Pn<String> f22290w;

    /* renamed from: com.yandex.metrica.impl.ob.S$a */
    public enum a {
        NAME,
        VALUE,
        USER_INFO
    }

    public C2915S(C2689Im c2689Im) {
        this.f22284q = new HashMap<>();
        m15092a(c2689Im);
    }

    /* renamed from: g */
    private String m15094g(String str) {
        String strMo14016a = this.f22285r.mo14016a(str);
        m15093a(str, strMo14016a, a.NAME);
        return strMo14016a;
    }

    /* renamed from: h */
    private String m15095h(String str) {
        String strMo14016a = this.f22286s.mo14016a(str);
        m15093a(str, strMo14016a, a.VALUE);
        return strMo14016a;
    }

    /* renamed from: r */
    public static C3376k0 m15096r() {
        C3376k0 c3376k0 = new C3376k0();
        c3376k0.f23831e = EnumC3377k1.EVENT_TYPE_SEND_USER_PROFILE.m16250b();
        return c3376k0;
    }

    /* renamed from: t */
    private void m15097t() {
        this.f23834h = 0;
        for (Integer num : this.f22284q.values()) {
            this.f23834h = num.intValue() + this.f23834h;
        }
    }

    /* renamed from: a */
    public C2915S m15098a(HashMap<a, Integer> map) {
        this.f22284q = map;
        return this;
    }

    @Override // com.yandex.metrica.impl.p022ob.C3376k0
    /* renamed from: b */
    public C3376k0 mo15100b(String str) {
        String strMo14016a = this.f22285r.mo14016a(str);
        m15093a(str, strMo14016a, a.NAME);
        this.f23827a = strMo14016a;
        return this;
    }

    @Override // com.yandex.metrica.impl.p022ob.C3376k0
    /* renamed from: d */
    public C3376k0 mo15101d(String str) {
        return super.mo15101d(this.f22289v.mo14016a(str));
    }

    @Override // com.yandex.metrica.impl.p022ob.C3376k0
    /* renamed from: e */
    public C3376k0 mo15102e(String str) {
        String strMo14016a = this.f22290w.mo14016a(str);
        m15093a(str, strMo14016a, a.USER_INFO);
        return super.mo15102e(strMo14016a);
    }

    @Override // com.yandex.metrica.impl.p022ob.C3376k0
    /* renamed from: f */
    public C3376k0 mo15103f(String str) {
        String strMo14016a = this.f22286s.mo14016a(str);
        m15093a(str, strMo14016a, a.VALUE);
        this.f23828b = strMo14016a;
        return this;
    }

    /* renamed from: i */
    public C2915S m15104i(String str) {
        String strMo14016a = this.f22287t.mo14016a(str);
        m15093a(str, strMo14016a, a.VALUE);
        this.f23828b = strMo14016a;
        return this;
    }

    /* renamed from: s */
    public HashMap<a, Integer> m15105s() {
        return this.f22284q;
    }

    /* renamed from: a */
    private void m15092a(C2689Im c2689Im) {
        this.f22285r = new C2815Nn(1000, "event name", c2689Im);
        this.f22286s = new C2790Mn(245760, "event value", c2689Im);
        this.f22287t = new C2790Mn(1024000, "event extended value", c2689Im);
        this.f22288u = new C2565Dn(245760, "event value bytes", c2689Im);
        this.f22289v = new C2815Nn(200, "user profile id", c2689Im);
        this.f22290w = new C2815Nn(10000, "UserInfo", c2689Im);
    }

    public C2915S(String str, String str2, int i, C2689Im c2689Im) {
        this(str, str2, i, 0, c2689Im);
    }

    public C2915S(String str, String str2, int i, int i2, C2689Im c2689Im) {
        this.f22284q = new HashMap<>();
        m15092a(c2689Im);
        this.f23828b = m15095h(str);
        this.f23827a = m15094g(str2);
        this.f23831e = i;
        this.f23832f = i2;
    }

    /* renamed from: a */
    private void m15093a(String str, String str2, a aVar) {
        if (C3323i.m16068a(str, str2)) {
            this.f22284q.put(aVar, Integer.valueOf(C2819O2.m14689c(str).length - C2819O2.m14689c(str2).length));
        } else {
            this.f22284q.remove(aVar);
        }
        m15097t();
    }

    public C2915S(byte[] bArr, String str, int i, C2689Im c2689Im) {
        this.f22284q = new HashMap<>();
        m15092a(c2689Im);
        mo15099a(bArr);
        this.f23827a = m15094g(str);
        this.f23831e = i;
    }

    @Override // com.yandex.metrica.impl.p022ob.C3376k0
    /* renamed from: a */
    public final C3376k0 mo15099a(byte[] bArr) {
        byte[] bArrMo14016a = this.f22288u.mo14016a(bArr);
        a aVar = a.VALUE;
        if (bArr.length != bArrMo14016a.length) {
            this.f22284q.put(aVar, Integer.valueOf(bArr.length - bArrMo14016a.length));
        } else {
            this.f22284q.remove(aVar);
        }
        m15097t();
        return super.mo15099a(bArrMo14016a);
    }

    /* renamed from: a */
    public static C3376k0 m15091a(String str, C2689Im c2689Im) {
        C2915S c2915s = new C2915S(c2689Im);
        c2915s.f23831e = EnumC3377k1.EVENT_TYPE_SET_USER_PROFILE_ID.m16250b();
        return super.mo15101d(c2915s.f22289v.mo14016a(str));
    }
}
