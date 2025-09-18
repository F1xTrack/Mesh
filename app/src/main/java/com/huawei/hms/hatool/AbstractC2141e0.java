package com.huawei.hms.hatool;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: com.huawei.hms.hatool.e0 */
/* loaded from: classes.dex */
public abstract class AbstractC2141e0 {
    /* renamed from: a */
    private C2152i m11972a(int i) {
        String strM11975f;
        if (i != 0) {
            strM11975f = m11975f();
            if (!TextUtils.isEmpty(strM11975f)) {
                return new C2152i(EnumC2138d0.UDID, strM11975f);
            }
        } else {
            strM11975f = "";
        }
        return new C2152i(EnumC2138d0.EMPTY, strM11975f);
    }

    /* renamed from: b */
    private C2152i m11973b(int i) {
        String strM11975f;
        if ((i & 4) != 0) {
            strM11975f = m11975f();
            if (!TextUtils.isEmpty(strM11975f)) {
                return new C2152i(EnumC2138d0.UDID, strM11975f);
            }
        } else {
            strM11975f = "";
        }
        return new C2152i(EnumC2138d0.EMPTY, strM11975f);
    }

    /* renamed from: e */
    private boolean m11974e() {
        C2148g1 c2148g1M12217b = C2180s.m12212c().m12217b();
        if (TextUtils.isEmpty(c2148g1M12217b.m12024l())) {
            c2148g1M12217b.m12017h(AbstractC2170o.m12144a());
        }
        return !TextUtils.isEmpty(c2148g1M12217b.m12024l());
    }

    /* renamed from: f */
    private String m11975f() {
        C2148g1 c2148g1M12217b = C2180s.m12212c().m12217b();
        if (TextUtils.isEmpty(c2148g1M12217b.m12018i())) {
            c2148g1M12217b.m12011e(C2191x0.m12298c());
        }
        return c2148g1M12217b.m12018i();
    }

    /* renamed from: a */
    public abstract String mo11977a();

    /* renamed from: a */
    public abstract String mo11978a(String str);

    /* renamed from: b */
    public abstract String mo11979b();

    /* renamed from: c */
    public abstract String mo11980c();

    /* renamed from: d */
    public abstract int mo11981d();

    /* renamed from: a */
    public C2152i m11976a(Context context) {
        String strMo11980c = mo11980c();
        if (!TextUtils.isEmpty(strMo11980c)) {
            return new C2152i(EnumC2138d0.UDID, strMo11980c);
        }
        String strMo11977a = mo11977a();
        if (!TextUtils.isEmpty(strMo11977a)) {
            return new C2152i(EnumC2138d0.IMEI, strMo11977a);
        }
        boolean zM11974e = m11974e();
        String strMo11979b = mo11979b();
        return !TextUtils.isEmpty(strMo11979b) ? zM11974e ? new C2152i(EnumC2138d0.SN, strMo11979b) : new C2152i(EnumC2138d0.UDID, mo11978a(strMo11979b)) : zM11974e ? m11972a(mo11981d()) : m11973b(mo11981d());
    }
}
