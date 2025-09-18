package com.yandex.metrica.impl.ob;

import com.yandex.metrica.IParamsCallback;
import defpackage.C7074sg;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.wi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3186wi {
    private C3211xi a = new C3211xi();

    public final synchronized C3211xi a() {
        return this.a;
    }

    public final synchronized void a(C3211xi c3211xi) {
        this.a = c3211xi;
    }

    public final C2766g1 a(String str) {
        Boolean boolB;
        String str2;
        C3211xi c3211xi = this.a;
        if (str.hashCode() != 949037879 || !str.equals(IParamsCallback.YANDEX_MOBILE_METRICA_FEATURE_LIB_SSL_ENABLED) || (boolB = c3211xi.b()) == null) {
            return null;
        }
        boolean zBooleanValue = boolB.booleanValue();
        EnumC2716e1 enumC2716e1C = c3211xi.c();
        String strA = c3211xi.a();
        if (zBooleanValue) {
            str2 = "true";
        } else {
            if (zBooleanValue) {
                throw new C7074sg();
            }
            str2 = "false";
        }
        return new C2766g1(str2, enumC2716e1C, strA);
    }

    public final synchronized void a(List<String> list, Map<String, C2766g1> map) {
        Boolean boolB;
        String str;
        try {
            for (String str2 : list) {
                if (str2.hashCode() == 949037879 && str2.equals(IParamsCallback.YANDEX_MOBILE_METRICA_FEATURE_LIB_SSL_ENABLED) && (boolB = this.a.b()) != null) {
                    boolean zBooleanValue = boolB.booleanValue();
                    EnumC2716e1 enumC2716e1C = this.a.c();
                    String strA = this.a.a();
                    if (zBooleanValue) {
                        str = "true";
                    } else {
                        if (zBooleanValue) {
                            throw new C7074sg();
                        }
                        str = "false";
                    }
                    map.put(IParamsCallback.YANDEX_MOBILE_METRICA_FEATURE_LIB_SSL_ENABLED, new C2766g1(str, enumC2716e1C, strA));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
