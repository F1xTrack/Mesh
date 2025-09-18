package com.huawei.hms.hatool;

import android.text.TextUtils;
import p000.AbstractC7177y3;
import p000.AbstractC7261zO;

/* renamed from: com.huawei.hms.hatool.o0 */
/* loaded from: classes.dex */
public class C2171o0 {

    /* renamed from: c */
    private static C2171o0 f19261c;

    /* renamed from: a */
    private String f19262a;

    /* renamed from: b */
    private String f19263b;

    /* renamed from: b */
    private String m12153b(String str) {
        return m12158f() ? AbstractC7177y3.m26040d("analytics_keystore", str) : C2167n.m12133b(str, m12157e());
    }

    /* renamed from: c */
    private String m12154c() {
        String strM11955a = C2137d.m11955a(AbstractC2177q0.m12197i(), "Privacy_MY", "PrivacyData", "");
        if (!TextUtils.isEmpty(strM11955a)) {
            return m12152a(strM11955a);
        }
        String strM26398c = AbstractC7261zO.m26398c(16);
        m12155c(m12153b(strM26398c));
        return strM26398c;
    }

    /* renamed from: d */
    public static C2171o0 m12156d() {
        if (f19261c == null) {
            m12159g();
        }
        return f19261c;
    }

    /* renamed from: e */
    private String m12157e() {
        if (TextUtils.isEmpty(this.f19263b)) {
            this.f19263b = new C2190x().m12297a();
        }
        return this.f19263b;
    }

    /* renamed from: f */
    private boolean m12158f() {
        return true;
    }

    /* renamed from: g */
    private static synchronized void m12159g() {
        if (f19261c == null) {
            f19261c = new C2171o0();
        }
    }

    /* renamed from: a */
    public String m12160a() {
        if (TextUtils.isEmpty(this.f19262a)) {
            this.f19262a = m12154c();
        }
        return this.f19262a;
    }

    /* renamed from: a */
    private String m12152a(String str) {
        String strM26038b = m12158f() ? AbstractC7177y3.m26038b("analytics_keystore", str) : "";
        if (TextUtils.isEmpty(strM26038b)) {
            C2186v.m12271c("hmsSdk", "deCrypt work key first");
            strM26038b = C2167n.m12131a(str, m12157e());
            if (TextUtils.isEmpty(strM26038b)) {
                strM26038b = AbstractC7261zO.m26398c(16);
                m12155c(m12153b(strM26038b));
                if (m12158f()) {
                    C2190x.m12295c();
                }
            } else if (m12158f()) {
                m12155c(m12153b(strM26038b));
                C2190x.m12295c();
            }
        }
        return strM26038b;
    }

    /* renamed from: c */
    private boolean m12155c(String str) {
        C2186v.m12271c("hmsSdk", "refresh sp aes key");
        if (TextUtils.isEmpty(str)) {
            C2186v.m12271c("hmsSdk", "refreshLocalKey(): encrypted key is empty");
            return false;
        }
        C2137d.m11960b(AbstractC2177q0.m12197i(), "Privacy_MY", "PrivacyData", str);
        C2137d.m11959b(AbstractC2177q0.m12197i(), "Privacy_MY", "flashKeyTime", System.currentTimeMillis());
        return true;
    }

    /* renamed from: b */
    public void m12161b() {
        String strM26398c = AbstractC7261zO.m26398c(16);
        if (m12155c(m12153b(strM26398c))) {
            this.f19262a = strM26398c;
        }
    }
}
