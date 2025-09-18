package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.Mm */
/* loaded from: classes2.dex */
public final class C4671Mm {

    /* renamed from: a */
    public final C4429Cm f30489a;

    /* renamed from: b */
    public final C4815T f30490b;

    /* renamed from: c */
    public final List f30491c;

    /* renamed from: d */
    public final String f30492d;

    /* renamed from: e */
    public final String f30493e;

    /* renamed from: f */
    public final Map f30494f;

    /* renamed from: g */
    public final String f30495g;

    /* renamed from: h */
    public final Boolean f30496h;

    public C4671Mm(C4429Cm c4429Cm, C4815T c4815t, ArrayList arrayList, String str, String str2, Map map, String str3, Boolean bool) {
        this.f30489a = c4429Cm;
        this.f30490b = c4815t;
        this.f30491c = arrayList;
        this.f30492d = str;
        this.f30493e = str2;
        this.f30494f = map;
        this.f30495g = str3;
        this.f30496h = bool;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C4429Cm c4429Cm = this.f30489a;
        if (c4429Cm != null) {
            for (C4477Ek c4477Ek : c4429Cm.f29976c) {
                sb.append("at " + c4477Ek.f30105a + "." + c4477Ek.f30109e + "(" + c4477Ek.f30106b + StringUtils.PROCESS_POSTFIX_DELIMITER + c4477Ek.f30107c + StringUtils.PROCESS_POSTFIX_DELIMITER + c4477Ek.f30108d + ")\n");
            }
        }
        return "UnhandledException{exception=" + this.f30489a + "\n" + sb.toString() + '}';
    }
}
