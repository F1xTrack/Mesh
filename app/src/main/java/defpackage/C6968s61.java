package defpackage;

import java.io.Serializable;

/* renamed from: s61, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6968s61 implements InterfaceC6587q61, Serializable {
    public final InterfaceC6587q61 a;
    public volatile transient boolean b;
    public transient Object c;

    public C6968s61(InterfaceC6587q61 interfaceC6587q61) {
        this.a = interfaceC6587q61;
    }

    @Override // defpackage.InterfaceC6587q61
    public final Object get() {
        if (!this.b) {
            synchronized (this) {
                try {
                    if (!this.b) {
                        Object obj = this.a.get();
                        this.c = obj;
                        this.b = true;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.b) {
            obj = "<supplier that returned " + this.c + ">";
        } else {
            obj = this.a;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
