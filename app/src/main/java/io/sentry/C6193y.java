package io.sentry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: io.sentry.y */
/* loaded from: classes2.dex */
public final class C6193y {

    /* renamed from: g */
    public static final HashMap f34738g;

    /* renamed from: a */
    public final HashMap f34739a = new HashMap();

    /* renamed from: b */
    public final ArrayList f34740b = new ArrayList();

    /* renamed from: c */
    public C5825a f34741c = null;

    /* renamed from: d */
    public C5825a f34742d = null;

    /* renamed from: e */
    public C5825a f34743e = null;

    /* renamed from: f */
    public C5776J0 f34744f = null;

    static {
        HashMap map = new HashMap();
        f34738g = map;
        map.put("boolean", Boolean.class);
        map.put("char", Character.class);
        map.put("byte", Byte.class);
        map.put("short", Short.class);
        map.put("int", Integer.class);
        map.put("long", Long.class);
        map.put("float", Float.class);
        map.put("double", Double.class);
    }

    /* renamed from: a */
    public final synchronized void m21926a() {
        try {
            Iterator it = this.f34739a.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (entry.getKey() == null || !((String) entry.getKey()).startsWith("sentry:")) {
                    it.remove();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: b */
    public final synchronized Object m21927b(Class cls, String str) {
        Object obj = this.f34739a.get(str);
        if (cls.isInstance(obj)) {
            return obj;
        }
        Class cls2 = (Class) f34738g.get(cls.getCanonicalName());
        if (obj != null && cls.isPrimitive() && cls2 != null) {
            if (cls2.isInstance(obj)) {
                return obj;
            }
        }
        return null;
    }

    /* renamed from: c */
    public final synchronized void m21928c(Object obj, String str) {
        this.f34739a.put(str, obj);
    }
}
