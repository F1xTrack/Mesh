package com.yandex.metrica.impl.p022ob;

import p000.AbstractC1374Vq;

/* renamed from: com.yandex.metrica.impl.ob.Wh */
/* loaded from: classes2.dex */
public class C3033Wh {

    /* renamed from: a */
    private final String f22701a;

    /* renamed from: b */
    private final String f22702b;

    /* renamed from: c */
    private final C2676I9 f22703c;

    public C3033Wh(String str, String str2) {
        this(str, str2, C2842P0.m14728i().m14750u());
    }

    /* renamed from: a */
    public String m15393a() {
        C2676I9 c2676i9 = this.f22703c;
        String str = this.f22701a;
        String str2 = this.f22702b;
        c2676i9.getClass();
        return c2676i9.m14248a(new C3754ye(AbstractC1374Vq.m8590i("LAST_SOCKET_REPORT_TIMES_", str, "_", str2), null).m17234a(), (String) null);
    }

    public C3033Wh(String str, String str2, C2676I9 c2676i9) {
        this.f22701a = str;
        this.f22702b = str2;
        this.f22703c = c2676i9;
    }

    /* renamed from: a */
    public void m15394a(String str) {
        this.f22703c.m14309a(this.f22701a, this.f22702b, str);
    }
}
