package com.yandex.metrica.impl.ob;

import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.j1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2840j1 {

    /* renamed from: com.yandex.metrica.impl.ob.j1$a */
    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    public static String a(int i) {
        Map<String, Integer> map = A2.a;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, Integer> entry : A2.a.entrySet()) {
            if (entry.getValue().intValue() == i) {
                arrayList.add(entry.getKey());
            }
        }
        return arrayList.size() == 1 ? (String) arrayList.get(0) : arrayList.size() != 0 ? String.format("One of %s", arrayList) : "unknown";
    }

    public static boolean a(String str) throws ClassNotFoundException {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
