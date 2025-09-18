package com.yandex.metrica.impl.ob;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.p7 */
/* loaded from: classes2.dex */
public class C2996p7 {
    public final C2946n7 a;
    public final C2722e7 b;
    public final List<C2896l7> c;
    public final String d;
    public final String e;
    public final Map<String, String> f;
    public final String g;
    public final Boolean h;

    public C2996p7(C2946n7 c2946n7, C2722e7 c2722e7, List<C2896l7> list, String str, String str2, Map<String, String> map, String str3, Boolean bool) {
        this.a = c2946n7;
        this.b = c2722e7;
        this.c = list;
        this.d = str;
        this.e = str2;
        this.f = map;
        this.g = str3;
        this.h = bool;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        C2946n7 c2946n7 = this.a;
        if (c2946n7 != null) {
            for (C2896l7 c2896l7 : c2946n7.d()) {
                sb.append("at " + c2896l7.a() + "." + c2896l7.e() + "(" + c2896l7.c() + StringUtils.PROCESS_POSTFIX_DELIMITER + c2896l7.d() + StringUtils.PROCESS_POSTFIX_DELIMITER + c2896l7.b() + ")\n");
            }
        }
        return "UnhandledException{exception=" + this.a + "\n" + sb.toString() + '}';
    }
}
