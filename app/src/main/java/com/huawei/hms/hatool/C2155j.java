package com.huawei.hms.hatool;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.UUID;
import p000.CB1;

/* renamed from: com.huawei.hms.hatool.j */
/* loaded from: classes.dex */
public class C2155j {

    /* renamed from: b */
    private static C2155j f19211b;

    /* renamed from: a */
    private Context f19212a;

    /* renamed from: com.huawei.hms.hatool.j$a */
    public static class a extends AbstractC2141e0 {

        /* renamed from: a */
        String f19213a;

        /* renamed from: b */
        String f19214b;

        public a(String str, String str2) {
            this.f19213a = str;
            this.f19214b = str2;
        }

        @Override // com.huawei.hms.hatool.AbstractC2141e0
        /* renamed from: a */
        public String mo11977a() {
            return AbstractC2194z.m12310d(this.f19213a, this.f19214b);
        }

        @Override // com.huawei.hms.hatool.AbstractC2141e0
        /* renamed from: b */
        public String mo11979b() {
            return AbstractC2194z.m12313g(this.f19213a, this.f19214b);
        }

        @Override // com.huawei.hms.hatool.AbstractC2141e0
        /* renamed from: c */
        public String mo11980c() {
            return AbstractC2194z.m12316j(this.f19213a, this.f19214b);
        }

        @Override // com.huawei.hms.hatool.AbstractC2141e0
        /* renamed from: d */
        public int mo11981d() {
            return (AbstractC2194z.m12317k(this.f19213a, this.f19214b) ? 4 : 0) | (AbstractC2194z.m12311e(this.f19213a, this.f19214b) ? 2 : 0) | (AbstractC2194z.m12314h(this.f19213a, this.f19214b) ? 1 : 0);
        }

        @Override // com.huawei.hms.hatool.AbstractC2141e0
        /* renamed from: a */
        public String mo11978a(String str) {
            return CB1.m1003c(str);
        }
    }

    /* renamed from: a */
    public static C2155j m12055a() {
        C2155j c2155j;
        synchronized (C2155j.class) {
            try {
                if (f19211b == null) {
                    f19211b = new C2155j();
                }
                c2155j = f19211b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2155j;
    }

    /* renamed from: b */
    public String m12059b(String str, String str2) {
        return AbstractC2153i0.m12051b(this.f19212a, str, str2);
    }

    /* renamed from: c */
    public C2152i m12060c(String str, String str2) {
        return new a(str, str2).m11976a(this.f19212a);
    }

    /* renamed from: d */
    public String m12061d(String str, String str2) {
        return AbstractC2145f1.m11992b(str, str2);
    }

    /* renamed from: e */
    public Pair<String, String> m12062e(String str, String str2) {
        if (!AbstractC2194z.m12312f(str, str2)) {
            return new Pair<>("", "");
        }
        String strM12032p = C2180s.m12212c().m12217b().m12032p();
        String strM12034q = C2180s.m12212c().m12217b().m12034q();
        if (!TextUtils.isEmpty(strM12032p) && !TextUtils.isEmpty(strM12034q)) {
            return new Pair<>(strM12032p, strM12034q);
        }
        Pair<String, String> pairM12299e = C2191x0.m12299e(this.f19212a);
        C2180s.m12212c().m12217b().m12023k((String) pairM12299e.first);
        C2180s.m12212c().m12217b().m12025l((String) pairM12299e.second);
        return pairM12299e;
    }

    /* renamed from: f */
    public String m12063f(String str, String str2) {
        return AbstractC2145f1.m11991a(str, str2);
    }

    /* renamed from: a */
    public String m12056a(String str, String str2) {
        return AbstractC2153i0.m12050a(this.f19212a, str, str2);
    }

    /* renamed from: a */
    public String m12057a(boolean z) {
        if (!z) {
            return "";
        }
        String strM12189e = AbstractC2177q0.m12189e();
        if (TextUtils.isEmpty(strM12189e)) {
            strM12189e = C2137d.m11955a(this.f19212a, "global_v2", CommonUrlParts.UUID, "");
            if (TextUtils.isEmpty(strM12189e)) {
                strM12189e = UUID.randomUUID().toString().replace("-", "");
                C2137d.m11960b(this.f19212a, "global_v2", CommonUrlParts.UUID, strM12189e);
            }
            AbstractC2177q0.m12196h(strM12189e);
        }
        return strM12189e;
    }

    /* renamed from: a */
    public void m12058a(Context context) {
        if (this.f19212a == null) {
            this.f19212a = context;
        }
    }
}
