package p000;

/* renamed from: Dx */
/* loaded from: classes2.dex */
public abstract class AbstractC0249Dx {

    /* renamed from: a */
    public final Object f2329a;

    public AbstractC0249Dx(Object obj) {
        this.f2329a = obj;
    }

    /* renamed from: a */
    public abstract AbstractC7742Ig0 mo412a(InterfaceC7402Bs0 interfaceC7402Bs0);

    /* renamed from: b */
    public Object mo1952b() {
        return this.f2329a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            Object objMo1952b = mo1952b();
            AbstractC0249Dx abstractC0249Dx = obj instanceof AbstractC0249Dx ? (AbstractC0249Dx) obj : null;
            if (!O90.m5963a(objMo1952b, abstractC0249Dx != null ? abstractC0249Dx.mo1952b() : null)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        Object objMo1952b = mo1952b();
        if (objMo1952b != null) {
            return objMo1952b.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(mo1952b());
    }
}
