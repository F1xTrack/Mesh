package p000;

/* renamed from: Ow1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8087Ow1 implements InterfaceC9550gr1 {

    /* renamed from: c */
    public static final Object f8693c = new Object();

    /* renamed from: a */
    public volatile InterfaceC9294er1 f8694a;

    /* renamed from: b */
    public volatile Object f8695b;

    /* renamed from: b */
    public static InterfaceC9550gr1 m6187b(InterfaceC9294er1 interfaceC9294er1) {
        if (interfaceC9294er1 instanceof C8087Ow1) {
            return interfaceC9294er1;
        }
        C8087Ow1 c8087Ow1 = new C8087Ow1();
        c8087Ow1.f8695b = f8693c;
        c8087Ow1.f8694a = interfaceC9294er1;
        return c8087Ow1;
    }

    @Override // p000.InterfaceC9550gr1
    /* renamed from: a */
    public final Object mo1468a() {
        Object objMo1468a = this.f8695b;
        Object obj = f8693c;
        if (objMo1468a == obj) {
            synchronized (this) {
                try {
                    objMo1468a = this.f8695b;
                    if (objMo1468a == obj) {
                        objMo1468a = this.f8694a.mo1468a();
                        Object obj2 = this.f8695b;
                        if (obj2 != obj && obj2 != objMo1468a) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + objMo1468a + ". This is likely due to a circular dependency.");
                        }
                        this.f8695b = objMo1468a;
                        this.f8694a = null;
                    }
                } finally {
                }
            }
        }
        return objMo1468a;
    }
}
