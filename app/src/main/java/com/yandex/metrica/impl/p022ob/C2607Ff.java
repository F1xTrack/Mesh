package com.yandex.metrica.impl.p022ob;

import android.util.SparseArray;

/* renamed from: com.yandex.metrica.impl.ob.Ff */
/* loaded from: classes2.dex */
public class C2607Ff {

    /* renamed from: a */
    private static SparseArray<String> f21215a;

    static {
        SparseArray<String> sparseArray = new SparseArray<>();
        f21215a = sparseArray;
        sparseArray.put(0, "String");
        f21215a.put(1, "Number");
        f21215a.put(2, "Counter");
    }

    /* renamed from: a */
    public static String m14131a(int i) {
        return f21215a.get(i);
    }
}
