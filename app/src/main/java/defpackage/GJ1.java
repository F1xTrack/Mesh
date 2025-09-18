package defpackage;

/* loaded from: classes.dex */
public final class GJ1 {
    public static final Object f = new Object();
    public final String a;
    public final InterfaceC6053nJ1 b;
    public final Object c;
    public final Object d = new Object();
    public volatile Object e = null;

    public GJ1(String str, Object obj, InterfaceC6053nJ1 interfaceC6053nJ1) {
        this.a = str;
        this.c = obj;
        this.b = interfaceC6053nJ1;
    }

    public final Object a(Object obj) {
        synchronized (this.d) {
        }
        if (obj != null) {
            return obj;
        }
        if (AbstractC6001n22.b == null) {
            return this.c;
        }
        synchronized (f) {
            try {
                if (C3759fN.p()) {
                    return this.e == null ? this.c : this.e;
                }
                try {
                    for (GJ1 gj1 : IB1.a) {
                        if (C3759fN.p()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object objZza = null;
                        try {
                            InterfaceC6053nJ1 interfaceC6053nJ1 = gj1.b;
                            if (interfaceC6053nJ1 != null) {
                                objZza = interfaceC6053nJ1.zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f) {
                            gj1.e = objZza;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                InterfaceC6053nJ1 interfaceC6053nJ12 = this.b;
                if (interfaceC6053nJ12 == null) {
                    return this.c;
                }
                try {
                    return interfaceC6053nJ12.zza();
                } catch (IllegalStateException unused3) {
                    return this.c;
                } catch (SecurityException unused4) {
                    return this.c;
                }
            } finally {
            }
        }
    }
}
