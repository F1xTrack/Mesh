package p000;

/* renamed from: t61, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11120t61 implements InterfaceC10736q61 {

    /* renamed from: c */
    public static final C1816bw f42836c = new C1816bw(3);

    /* renamed from: a */
    public volatile InterfaceC10736q61 f42837a;

    /* renamed from: b */
    public Object f42838b;

    @Override // p000.InterfaceC10736q61
    public final Object get() {
        InterfaceC10736q61 interfaceC10736q61 = this.f42837a;
        C1816bw c1816bw = f42836c;
        if (interfaceC10736q61 != c1816bw) {
            synchronized (this) {
                try {
                    if (this.f42837a != c1816bw) {
                        Object obj = this.f42837a.get();
                        this.f42838b = obj;
                        this.f42837a = c1816bw;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f42838b;
    }

    public final String toString() {
        Object obj = this.f42837a;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == f42836c) {
            obj = "<supplier that returned " + this.f42838b + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
