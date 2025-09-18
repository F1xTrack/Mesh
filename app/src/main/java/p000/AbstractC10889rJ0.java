package p000;

import java.io.Serializable;
import java.util.HashMap;

/* renamed from: rJ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10889rJ0 {

    /* renamed from: a */
    public static final C7356Av0 f41513a = new C7356Av0(12);

    /* renamed from: a */
    public static C0926Oi m24254a() {
        C0926Oi c0926Oi = new C0926Oi(8, false);
        c0926Oi.f8576c = new HashMap();
        c0926Oi.f8575b = true;
        return c0926Oi;
    }

    /* renamed from: b */
    public static HashMap m24255b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        HashMap map = new HashMap();
        map.put(obj, obj2);
        map.put(obj3, obj4);
        map.put(obj5, obj6);
        map.put(obj7, obj8);
        return map;
    }

    /* renamed from: c */
    public static HashMap m24256c(String str, Serializable serializable) {
        HashMap map = new HashMap();
        map.put(str, serializable);
        return map;
    }

    /* renamed from: d */
    public static HashMap m24257d(String str, Serializable serializable, String str2, Serializable serializable2) {
        HashMap map = new HashMap();
        map.put(str, serializable);
        map.put(str2, serializable2);
        return map;
    }

    /* renamed from: e */
    public static HashMap m24258e(String str, Serializable serializable, String str2, Serializable serializable2, String str3, Serializable serializable3) {
        HashMap map = new HashMap();
        map.put(str, serializable);
        map.put(str2, serializable2);
        map.put(str3, serializable3);
        return map;
    }
}
