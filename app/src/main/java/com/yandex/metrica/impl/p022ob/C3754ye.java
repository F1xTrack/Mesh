package com.yandex.metrica.impl.p022ob;

import p000.AbstractC1374Vq;

/* renamed from: com.yandex.metrica.impl.ob.ye */
/* loaded from: classes2.dex */
public class C3754ye {

    /* renamed from: a */
    private final String f25308a;

    /* renamed from: b */
    private final String f25309b;

    public C3754ye(String str) {
        this(str, null);
    }

    /* renamed from: a */
    public String m17234a() {
        return this.f25309b;
    }

    /* renamed from: b */
    public String m17236b() {
        return this.f25308a;
    }

    public C3754ye(String str, String str2) {
        this.f25308a = str;
        this.f25309b = m17235a(str2);
    }

    /* renamed from: a */
    public final String m17235a(String str) {
        return str != null ? AbstractC1374Vq.m8593l(new StringBuilder(), this.f25308a, str) : this.f25308a;
    }
}
