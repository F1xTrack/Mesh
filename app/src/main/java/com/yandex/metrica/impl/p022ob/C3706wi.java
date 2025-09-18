package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.IParamsCallback;
import java.util.List;
import java.util.Map;
import p000.C6838sg;

/* renamed from: com.yandex.metrica.impl.ob.wi */
/* loaded from: classes2.dex */
public final class C3706wi {

    /* renamed from: a */
    private C3732xi f25204a = new C3732xi();

    /* renamed from: a */
    public final synchronized C3732xi m17145a() {
        return this.f25204a;
    }

    /* renamed from: a */
    public final synchronized void m17146a(C3732xi c3732xi) {
        this.f25204a = c3732xi;
    }

    /* renamed from: a */
    public final C3273g1 m17144a(String str) {
        Boolean boolM17190b;
        String str2;
        C3732xi c3732xi = this.f25204a;
        if (str.hashCode() != 949037879 || !str.equals(IParamsCallback.YANDEX_MOBILE_METRICA_FEATURE_LIB_SSL_ENABLED) || (boolM17190b = c3732xi.m17190b()) == null) {
            return null;
        }
        boolean zBooleanValue = boolM17190b.booleanValue();
        EnumC3221e1 enumC3221e1M17191c = c3732xi.m17191c();
        String strM17189a = c3732xi.m17189a();
        if (zBooleanValue) {
            str2 = "true";
        } else {
            if (zBooleanValue) {
                throw new C6838sg();
            }
            str2 = "false";
        }
        return new C3273g1(str2, enumC3221e1M17191c, strM17189a);
    }

    /* renamed from: a */
    public final synchronized void m17147a(List<String> list, Map<String, C3273g1> map) {
        Boolean boolM17190b;
        String str;
        try {
            for (String str2 : list) {
                if (str2.hashCode() == 949037879 && str2.equals(IParamsCallback.YANDEX_MOBILE_METRICA_FEATURE_LIB_SSL_ENABLED) && (boolM17190b = this.f25204a.m17190b()) != null) {
                    boolean zBooleanValue = boolM17190b.booleanValue();
                    EnumC3221e1 enumC3221e1M17191c = this.f25204a.m17191c();
                    String strM17189a = this.f25204a.m17189a();
                    if (zBooleanValue) {
                        str = "true";
                    } else {
                        if (zBooleanValue) {
                            throw new C6838sg();
                        }
                        str = "false";
                    }
                    map.put(IParamsCallback.YANDEX_MOBILE_METRICA_FEATURE_LIB_SSL_ENABLED, new C3273g1(str, enumC3221e1M17191c, strM17189a));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
