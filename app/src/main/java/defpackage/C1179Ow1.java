package defpackage;

/* renamed from: Ow1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1179Ow1 implements InterfaceC4042gr1 {
    public static final Object c = new Object();
    public volatile InterfaceC3660er1 a;
    public volatile Object b;

    public static InterfaceC4042gr1 b(InterfaceC3660er1 interfaceC3660er1) {
        if (interfaceC3660er1 instanceof C1179Ow1) {
            return interfaceC3660er1;
        }
        C1179Ow1 c1179Ow1 = new C1179Ow1();
        c1179Ow1.b = c;
        c1179Ow1.a = interfaceC3660er1;
        return c1179Ow1;
    }

    @Override // defpackage.InterfaceC4042gr1
    public final Object a() {
        Object objA = this.b;
        Object obj = c;
        if (objA == obj) {
            synchronized (this) {
                try {
                    objA = this.b;
                    if (objA == obj) {
                        objA = this.a.a();
                        Object obj2 = this.b;
                        if (obj2 != obj && obj2 != objA) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + objA + ". This is likely due to a circular dependency.");
                        }
                        this.b = objA;
                        this.a = null;
                    }
                } finally {
                }
            }
        }
        return objA;
    }
}
