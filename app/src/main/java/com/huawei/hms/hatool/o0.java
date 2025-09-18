package com.huawei.hms.hatool;

import android.text.TextUtils;
import defpackage.AbstractC8100y3;
import defpackage.AbstractC8353zO;

/* loaded from: classes.dex */
public class o0 {
    private static o0 c;
    private String a;
    private String b;

    private String b(String str) {
        return f() ? AbstractC8100y3.d("analytics_keystore", str) : n.b(str, e());
    }

    private String c() {
        String strA = d.a(q0.i(), "Privacy_MY", "PrivacyData", "");
        if (!TextUtils.isEmpty(strA)) {
            return a(strA);
        }
        String strC = AbstractC8353zO.c(16);
        c(b(strC));
        return strC;
    }

    public static o0 d() {
        if (c == null) {
            g();
        }
        return c;
    }

    private String e() {
        if (TextUtils.isEmpty(this.b)) {
            this.b = new x().a();
        }
        return this.b;
    }

    private boolean f() {
        return true;
    }

    private static synchronized void g() {
        if (c == null) {
            c = new o0();
        }
    }

    public String a() {
        if (TextUtils.isEmpty(this.a)) {
            this.a = c();
        }
        return this.a;
    }

    private String a(String str) {
        String strB = f() ? AbstractC8100y3.b("analytics_keystore", str) : "";
        if (TextUtils.isEmpty(strB)) {
            v.c("hmsSdk", "deCrypt work key first");
            strB = n.a(str, e());
            if (TextUtils.isEmpty(strB)) {
                strB = AbstractC8353zO.c(16);
                c(b(strB));
                if (f()) {
                    x.c();
                }
            } else if (f()) {
                c(b(strB));
                x.c();
            }
        }
        return strB;
    }

    private boolean c(String str) {
        v.c("hmsSdk", "refresh sp aes key");
        if (TextUtils.isEmpty(str)) {
            v.c("hmsSdk", "refreshLocalKey(): encrypted key is empty");
            return false;
        }
        d.b(q0.i(), "Privacy_MY", "PrivacyData", str);
        d.b(q0.i(), "Privacy_MY", "flashKeyTime", System.currentTimeMillis());
        return true;
    }

    public void b() {
        String strC = AbstractC8353zO.c(16);
        if (c(b(strC))) {
            this.a = strC;
        }
    }
}
