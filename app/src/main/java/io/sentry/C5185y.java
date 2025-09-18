package io.sentry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: io.sentry.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5185y {
    public static final HashMap g;
    public final HashMap a = new HashMap();
    public final ArrayList b = new ArrayList();
    public C5081a c = null;
    public C5081a d = null;
    public C5081a e = null;
    public J0 f = null;

    static {
        HashMap map = new HashMap();
        g = map;
        map.put("boolean", Boolean.class);
        map.put("char", Character.class);
        map.put("byte", Byte.class);
        map.put("short", Short.class);
        map.put("int", Integer.class);
        map.put("long", Long.class);
        map.put("float", Float.class);
        map.put("double", Double.class);
    }

    public final synchronized void a() {
        try {
            Iterator it = this.a.entrySet().iterator();
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

    public final synchronized Object b(Class cls, String str) {
        Object obj = this.a.get(str);
        if (cls.isInstance(obj)) {
            return obj;
        }
        Class cls2 = (Class) g.get(cls.getCanonicalName());
        if (obj != null && cls.isPrimitive() && cls2 != null) {
            if (cls2.isInstance(obj)) {
                return obj;
            }
        }
        return null;
    }

    public final synchronized void c(Object obj, String str) {
        this.a.put(str, obj);
    }
}
