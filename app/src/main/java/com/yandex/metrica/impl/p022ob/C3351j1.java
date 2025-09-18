package com.yandex.metrica.impl.p022ob;

import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.j1 */
/* loaded from: classes2.dex */
public class C3351j1 {

    /* renamed from: com.yandex.metrica.impl.ob.j1$a */
    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    /* renamed from: a */
    public static String m16108a(int i) {
        Map<String, Integer> map = C2469A2.f20832a;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, Integer> entry : C2469A2.f20832a.entrySet()) {
            if (entry.getValue().intValue() == i) {
                arrayList.add(entry.getKey());
            }
        }
        return arrayList.size() == 1 ? (String) arrayList.get(0) : arrayList.size() != 0 ? String.format("One of %s", arrayList) : "unknown";
    }

    /* renamed from: a */
    public static boolean m16109a(String str) throws ClassNotFoundException {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
