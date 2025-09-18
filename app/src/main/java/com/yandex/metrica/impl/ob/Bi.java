package com.yandex.metrica.impl.ob;

import android.util.Pair;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class Bi {
    public final String a;
    public final String b;
    public final String c;
    public final List<Pair<String, String>> d;
    public final Long e;
    public final List<a> f;

    public enum a {
        WIFI,
        CELL
    }

    public Bi(String str, String str2, String str3, List<Pair<String, String>> list, Long l, List<a> list2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = Collections.unmodifiableList(list);
        this.e = l;
        this.f = list2;
    }
}
