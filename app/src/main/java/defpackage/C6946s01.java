package defpackage;

import java.util.IdentityHashMap;

/* renamed from: s01, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6946s01 {
    public static final IdentityHashMap d = new IdentityHashMap();
    public Object a;
    public int b;
    public final InterfaceC7986xS0 c;

    public C6946s01(Object obj, InterfaceC7986xS0 interfaceC7986xS0, boolean z) {
        obj.getClass();
        this.a = obj;
        this.c = interfaceC7986xS0;
        this.b = 1;
        if (z) {
            IdentityHashMap identityHashMap = d;
            synchronized (identityHashMap) {
                try {
                    Integer num = (Integer) identityHashMap.get(obj);
                    if (num == null) {
                        identityHashMap.put(obj, 1);
                    } else {
                        identityHashMap.put(obj, Integer.valueOf(num.intValue() + 1));
                    }
                } finally {
                }
            }
        }
    }

    public static void e(Object obj) {
        IdentityHashMap identityHashMap = d;
        synchronized (identityHashMap) {
            try {
                Integer num = (Integer) identityHashMap.get(obj);
                if (num == null) {
                    AbstractC3393dS.u("SharedReference", "No entry in sLiveObjects for value of type %s", obj.getClass());
                } else if (num.intValue() == 1) {
                    identityHashMap.remove(obj);
                } else {
                    identityHashMap.put(obj, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized int a() {
        int i;
        c();
        ML1.a(Boolean.valueOf(this.b > 0));
        i = this.b - 1;
        this.b = i;
        return i;
    }

    public final void b() {
        Object obj;
        if (a() == 0) {
            synchronized (this) {
                obj = this.a;
                this.a = null;
            }
            if (obj != null) {
                InterfaceC7986xS0 interfaceC7986xS0 = this.c;
                if (interfaceC7986xS0 != null) {
                    interfaceC7986xS0.d(obj);
                }
                e(obj);
            }
        }
    }

    public final void c() {
        boolean z;
        synchronized (this) {
            z = this.b > 0;
        }
        if (!z) {
            throw new C7074sg("Null shared reference");
        }
    }

    public final synchronized Object d() {
        return this.a;
    }
}
