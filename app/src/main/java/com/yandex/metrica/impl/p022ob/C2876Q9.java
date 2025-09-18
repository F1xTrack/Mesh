package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.Q9 */
/* loaded from: classes2.dex */
public class C2876Q9 {

    /* renamed from: a */
    private final String f21973a;

    /* renamed from: b */
    private final InterfaceC3748y8 f21974b;

    /* renamed from: c */
    private final InterfaceC2851P9<AbstractC3219e> f21975c;

    /* renamed from: d */
    private final InterfaceC3230ea<Object, AbstractC3219e> f21976d;

    public C2876Q9(String str, InterfaceC3748y8 interfaceC3748y8, InterfaceC2851P9<AbstractC3219e> interfaceC2851P9, InterfaceC3230ea<Object, AbstractC3219e> interfaceC3230ea) {
        this.f21973a = str;
        this.f21974b = interfaceC3748y8;
        this.f21975c = interfaceC2851P9;
        this.f21976d = interfaceC3230ea;
    }

    /* renamed from: a */
    public void m14813a(Object obj) {
        this.f21974b.mo14696a(this.f21973a, this.f21975c.mo14514a((InterfaceC2851P9<AbstractC3219e>) this.f21976d.mo13847b(obj)));
    }

    /* renamed from: b */
    public Object m14814b() {
        try {
            byte[] bArrMo14697a = this.f21974b.mo14697a(this.f21973a);
            return C2968U2.m15246a(bArrMo14697a) ? this.f21976d.mo13846a(this.f21975c.mo14195a()) : this.f21976d.mo13846a(this.f21975c.mo14196a(bArrMo14697a));
        } catch (Throwable unused) {
            return this.f21976d.mo13846a(this.f21975c.mo14195a());
        }
    }

    /* renamed from: a */
    public void m14812a() {
        this.f21974b.mo14698b(this.f21973a);
    }
}
