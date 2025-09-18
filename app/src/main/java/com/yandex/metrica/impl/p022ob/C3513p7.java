package com.yandex.metrica.impl.p022ob;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.p7 */
/* loaded from: classes2.dex */
public class C3513p7 {

    /* renamed from: a */
    public final C3461n7 f24427a;

    /* renamed from: b */
    public final C3227e7 f24428b;

    /* renamed from: c */
    public final List<C3409l7> f24429c;

    /* renamed from: d */
    public final String f24430d;

    /* renamed from: e */
    public final String f24431e;

    /* renamed from: f */
    public final Map<String, String> f24432f;

    /* renamed from: g */
    public final String f24433g;

    /* renamed from: h */
    public final Boolean f24434h;

    public C3513p7(C3461n7 c3461n7, C3227e7 c3227e7, List<C3409l7> list, String str, String str2, Map<String, String> map, String str3, Boolean bool) {
        this.f24427a = c3461n7;
        this.f24428b = c3227e7;
        this.f24429c = list;
        this.f24430d = str;
        this.f24431e = str2;
        this.f24432f = map;
        this.f24433g = str3;
        this.f24434h = bool;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        C3461n7 c3461n7 = this.f24427a;
        if (c3461n7 != null) {
            for (C3409l7 c3409l7 : c3461n7.m16480d()) {
                sb.append("at " + c3409l7.m16380a() + "." + c3409l7.m16384e() + "(" + c3409l7.m16382c() + StringUtils.PROCESS_POSTFIX_DELIMITER + c3409l7.m16383d() + StringUtils.PROCESS_POSTFIX_DELIMITER + c3409l7.m16381b() + ")\n");
            }
        }
        return "UnhandledException{exception=" + this.f24427a + "\n" + sb.toString() + '}';
    }
}
