package defpackage;

import java.io.Serializable;
import java.util.HashMap;

/* renamed from: rJ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6815rJ0 {
    public static final C0084Av0 a = new C0084Av0(12);

    public static C1135Oi a() {
        C1135Oi c1135Oi = new C1135Oi(8, false);
        c1135Oi.c = new HashMap();
        c1135Oi.b = true;
        return c1135Oi;
    }

    public static HashMap b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        HashMap map = new HashMap();
        map.put(obj, obj2);
        map.put(obj3, obj4);
        map.put(obj5, obj6);
        map.put(obj7, obj8);
        return map;
    }

    public static HashMap c(String str, Serializable serializable) {
        HashMap map = new HashMap();
        map.put(str, serializable);
        return map;
    }

    public static HashMap d(String str, Serializable serializable, String str2, Serializable serializable2) {
        HashMap map = new HashMap();
        map.put(str, serializable);
        map.put(str2, serializable2);
        return map;
    }

    public static HashMap e(String str, Serializable serializable, String str2, Serializable serializable2, String str3, Serializable serializable3) {
        HashMap map = new HashMap();
        map.put(str, serializable);
        map.put(str2, serializable2);
        map.put(str3, serializable3);
        return map;
    }
}
