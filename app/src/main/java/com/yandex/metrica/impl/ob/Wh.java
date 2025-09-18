package com.yandex.metrica.impl.ob;

import defpackage.AbstractC1705Vq;

/* loaded from: classes2.dex */
public class Wh {
    private final String a;
    private final String b;
    private final I9 c;

    public Wh(String str, String str2) {
        this(str, str2, P0.i().u());
    }

    public String a() {
        I9 i9 = this.c;
        String str = this.a;
        String str2 = this.b;
        i9.getClass();
        return i9.a(new C3232ye(AbstractC1705Vq.i("LAST_SOCKET_REPORT_TIMES_", str, "_", str2), null).a(), (String) null);
    }

    public Wh(String str, String str2, I9 i9) {
        this.a = str;
        this.b = str2;
        this.c = i9;
    }

    public void a(String str) {
        this.c.a(this.a, this.b, str);
    }
}
