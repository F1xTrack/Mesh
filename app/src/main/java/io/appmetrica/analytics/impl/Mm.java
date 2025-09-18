package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class Mm {
    public final Cm a;
    public final T b;
    public final List c;
    public final String d;
    public final String e;
    public final Map f;
    public final String g;
    public final Boolean h;

    public Mm(Cm cm, T t, ArrayList arrayList, String str, String str2, Map map, String str3, Boolean bool) {
        this.a = cm;
        this.b = t;
        this.c = arrayList;
        this.d = str;
        this.e = str2;
        this.f = map;
        this.g = str3;
        this.h = bool;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Cm cm = this.a;
        if (cm != null) {
            for (Ek ek : cm.c) {
                sb.append("at " + ek.a + "." + ek.e + "(" + ek.b + StringUtils.PROCESS_POSTFIX_DELIMITER + ek.c + StringUtils.PROCESS_POSTFIX_DELIMITER + ek.d + ")\n");
            }
        }
        return "UnhandledException{exception=" + this.a + "\n" + sb.toString() + '}';
    }
}
