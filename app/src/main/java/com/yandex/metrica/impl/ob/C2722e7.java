package com.yandex.metrica.impl.ob;

import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.e7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2722e7 {
    public final C2921m7 a;
    public final List<C2921m7> b;
    public final String c;

    public C2722e7(C2921m7 c2921m7, List<C2921m7> list, String str) {
        this.a = c2921m7;
        this.b = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.c = str;
    }
}
