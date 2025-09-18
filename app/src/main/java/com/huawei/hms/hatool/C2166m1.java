package com.huawei.hms.hatool;

import p000.AbstractC7261zO;

/* renamed from: com.huawei.hms.hatool.m1 */
/* loaded from: classes.dex */
public class C2166m1 {

    /* renamed from: b */
    private static C2166m1 f19252b = new C2166m1();

    /* renamed from: a */
    private a f19253a = new a();

    /* renamed from: com.huawei.hms.hatool.m1$a */
    public class a {

        /* renamed from: a */
        String f19254a;

        /* renamed from: b */
        String f19255b;

        /* renamed from: c */
        long f19256c = 0;

        public a() {
        }

        /* renamed from: a */
        public void m12127a(long j) {
            C2166m1.this.f19253a.f19256c = j;
        }

        /* renamed from: b */
        public void m12129b(String str) {
            C2166m1.this.f19253a.f19254a = str;
        }

        /* renamed from: a */
        public void m12128a(String str) {
            C2166m1.this.f19253a.f19255b = str;
        }
    }

    /* renamed from: d */
    public static C2166m1 m12122d() {
        return f19252b;
    }

    /* renamed from: b */
    public long m12125b() {
        return this.f19253a.f19256c;
    }

    /* renamed from: c */
    public String m12126c() {
        return this.f19253a.f19254a;
    }

    /* renamed from: a */
    public String m12123a() {
        return this.f19253a.f19255b;
    }

    /* renamed from: a */
    public void m12124a(String str, String str2) {
        long jM12125b = m12125b();
        String strM12286c = C2189w0.m12286c(str, str2);
        if (strM12286c == null || strM12286c.isEmpty()) {
            C2186v.m12275e("WorkKeyHandler", "get rsa pubkey config error");
            return;
        }
        if (jM12125b == 0) {
            jM12125b = System.currentTimeMillis();
        } else if (System.currentTimeMillis() - jM12125b <= 43200000) {
            return;
        }
        String strM26398c = AbstractC7261zO.m26398c(16);
        String strM12039a = C2150h0.m12039a(strM12286c, strM26398c);
        this.f19253a.m12127a(jM12125b);
        this.f19253a.m12129b(strM26398c);
        this.f19253a.m12128a(strM12039a);
    }
}
