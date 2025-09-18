package com.yandex.metrica.impl.p022ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.k6 */
/* loaded from: classes2.dex */
public class C3382k6 {

    /* renamed from: a */
    private final C3330i6 f23908a;

    /* renamed from: b */
    private final C3356j6 f23909b;

    /* renamed from: c */
    private final InterfaceC3748y8 f23910c;

    public C3382k6(Context context, C3172c4 c3172c4) {
        this(new C3356j6(), new C3330i6(), C2877Qa.m14815a(context).m14823a(c3172c4), "event_hashes");
    }

    /* renamed from: a */
    public C3304h6 m16262a() {
        try {
            byte[] bArrMo14697a = this.f23910c.mo14697a("event_hashes");
            if (C2968U2.m15246a(bArrMo14697a)) {
                C3330i6 c3330i6 = this.f23908a;
                this.f23909b.getClass();
                return c3330i6.mo13846a(new C3236eg());
            }
            C3330i6 c3330i62 = this.f23908a;
            this.f23909b.getClass();
            return c3330i62.mo13846a((C3236eg) AbstractC3219e.m15808a(new C3236eg(), bArrMo14697a));
        } catch (Throwable unused) {
            C3330i6 c3330i63 = this.f23908a;
            this.f23909b.getClass();
            return c3330i63.mo13846a(new C3236eg());
        }
    }

    public C3382k6(C3356j6 c3356j6, C3330i6 c3330i6, InterfaceC3748y8 interfaceC3748y8, String str) {
        this.f23909b = c3356j6;
        this.f23908a = c3330i6;
        this.f23910c = interfaceC3748y8;
    }

    /* renamed from: a */
    public void m16263a(C3304h6 c3304h6) {
        InterfaceC3748y8 interfaceC3748y8 = this.f23910c;
        C3356j6 c3356j6 = this.f23909b;
        C3236eg c3236egMo13847b = this.f23908a.mo13847b(c3304h6);
        c3356j6.getClass();
        interfaceC3748y8.mo14696a("event_hashes", AbstractC3219e.m15809a(c3236egMo13847b));
    }
}
