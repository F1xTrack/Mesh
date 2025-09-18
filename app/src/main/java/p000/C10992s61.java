package p000;

import java.io.Serializable;

/* renamed from: s61, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10992s61 implements InterfaceC10736q61, Serializable {

    /* renamed from: a */
    public final InterfaceC10736q61 f42257a;

    /* renamed from: b */
    public volatile transient boolean f42258b;

    /* renamed from: c */
    public transient Object f42259c;

    public C10992s61(InterfaceC10736q61 interfaceC10736q61) {
        this.f42257a = interfaceC10736q61;
    }

    @Override // p000.InterfaceC10736q61
    public final Object get() {
        if (!this.f42258b) {
            synchronized (this) {
                try {
                    if (!this.f42258b) {
                        Object obj = this.f42257a.get();
                        this.f42259c = obj;
                        this.f42258b = true;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f42259c;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.f42258b) {
            obj = "<supplier that returned " + this.f42259c + ">";
        } else {
            obj = this.f42257a;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
