package defpackage;

/* renamed from: t61, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7159t61 implements InterfaceC6587q61 {
    public static final C2417bw c = new C2417bw(3);
    public volatile InterfaceC6587q61 a;
    public Object b;

    @Override // defpackage.InterfaceC6587q61
    public final Object get() {
        InterfaceC6587q61 interfaceC6587q61 = this.a;
        C2417bw c2417bw = c;
        if (interfaceC6587q61 != c2417bw) {
            synchronized (this) {
                try {
                    if (this.a != c2417bw) {
                        Object obj = this.a.get();
                        this.b = obj;
                        this.a = c2417bw;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.b;
    }

    public final String toString() {
        Object obj = this.a;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == c) {
            obj = "<supplier that returned " + this.b + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
