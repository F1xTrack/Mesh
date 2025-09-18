package p000;

/* loaded from: classes.dex */
public final class GJ1 {

    /* renamed from: f */
    public static final Object f3688f = new Object();

    /* renamed from: a */
    public final String f3689a;

    /* renamed from: b */
    public final InterfaceC10378nJ1 f3690b;

    /* renamed from: c */
    public final Object f3691c;

    /* renamed from: d */
    public final Object f3692d = new Object();

    /* renamed from: e */
    public volatile Object f3693e = null;

    public GJ1(String str, Object obj, InterfaceC10378nJ1 interfaceC10378nJ1) {
        this.f3689a = str;
        this.f3691c = obj;
        this.f3690b = interfaceC10378nJ1;
    }

    /* renamed from: a */
    public final Object m3028a(Object obj) {
        synchronized (this.f3692d) {
        }
        if (obj != null) {
            return obj;
        }
        if (AbstractC10343n22.f38063b == null) {
            return this.f3691c;
        }
        synchronized (f3688f) {
            try {
                if (C4049fN.m18225p()) {
                    return this.f3693e == null ? this.f3691c : this.f3693e;
                }
                try {
                    for (GJ1 gj1 : IB1.f4780a) {
                        if (C4049fN.m18225p()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object objZza = null;
                        try {
                            InterfaceC10378nJ1 interfaceC10378nJ1 = gj1.f3690b;
                            if (interfaceC10378nJ1 != null) {
                                objZza = interfaceC10378nJ1.zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f3688f) {
                            gj1.f3693e = objZza;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                InterfaceC10378nJ1 interfaceC10378nJ12 = this.f3690b;
                if (interfaceC10378nJ12 == null) {
                    return this.f3691c;
                }
                try {
                    return interfaceC10378nJ12.zza();
                } catch (IllegalStateException unused3) {
                    return this.f3691c;
                } catch (SecurityException unused4) {
                    return this.f3691c;
                }
            } finally {
            }
        }
    }
}
