package com.huawei.hms.hatool;

import defpackage.AbstractC8353zO;

/* loaded from: classes.dex */
public class m1 {
    private static m1 b = new m1();
    private a a = new a();

    public class a {
        String a;
        String b;
        long c = 0;

        public a() {
        }

        public void a(long j) {
            m1.this.a.c = j;
        }

        public void b(String str) {
            m1.this.a.a = str;
        }

        public void a(String str) {
            m1.this.a.b = str;
        }
    }

    public static m1 d() {
        return b;
    }

    public long b() {
        return this.a.c;
    }

    public String c() {
        return this.a.a;
    }

    public String a() {
        return this.a.b;
    }

    public void a(String str, String str2) {
        long jB = b();
        String strC = w0.c(str, str2);
        if (strC == null || strC.isEmpty()) {
            v.e("WorkKeyHandler", "get rsa pubkey config error");
            return;
        }
        if (jB == 0) {
            jB = System.currentTimeMillis();
        } else if (System.currentTimeMillis() - jB <= 43200000) {
            return;
        }
        String strC2 = AbstractC8353zO.c(16);
        String strA = h0.a(strC, strC2);
        this.a.a(jB);
        this.a.b(strC2);
        this.a.a(strA);
    }
}
