package com.yandex.metrica.impl.p022ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.dn */
/* loaded from: classes2.dex */
public class C3217dn {

    /* renamed from: a */
    private final Context f23281a;

    public C3217dn(Context context) {
        this.f23281a = context;
    }

    /* renamed from: a */
    public byte[] m15806a() {
        try {
            return C3762ym.m17291b(new StringBuilder(this.f23281a.getPackageName()).reverse().toString());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }

    /* renamed from: b */
    public byte[] m15807b() {
        try {
            return C3762ym.m17291b(this.f23281a.getPackageName());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }
}
