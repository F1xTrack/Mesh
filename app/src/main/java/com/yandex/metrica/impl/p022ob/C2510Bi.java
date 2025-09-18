package com.yandex.metrica.impl.p022ob;

import android.util.Pair;
import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Bi */
/* loaded from: classes2.dex */
public class C2510Bi {

    /* renamed from: a */
    public final String f20936a;

    /* renamed from: b */
    public final String f20937b;

    /* renamed from: c */
    public final String f20938c;

    /* renamed from: d */
    public final List<Pair<String, String>> f20939d;

    /* renamed from: e */
    public final Long f20940e;

    /* renamed from: f */
    public final List<a> f20941f;

    /* renamed from: com.yandex.metrica.impl.ob.Bi$a */
    public enum a {
        WIFI,
        CELL
    }

    public C2510Bi(String str, String str2, String str3, List<Pair<String, String>> list, Long l, List<a> list2) {
        this.f20936a = str;
        this.f20937b = str2;
        this.f20938c = str3;
        this.f20939d = Collections.unmodifiableList(list);
        this.f20940e = l;
        this.f20941f = list2;
    }
}
