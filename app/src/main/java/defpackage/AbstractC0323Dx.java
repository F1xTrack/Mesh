package defpackage;

/* renamed from: Dx, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0323Dx {
    public final Object a;

    public AbstractC0323Dx(Object obj) {
        this.a = obj;
    }

    public abstract AbstractC0663Ig0 a(InterfaceC0153Bs0 interfaceC0153Bs0);

    public Object b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            Object objB = b();
            AbstractC0323Dx abstractC0323Dx = obj instanceof AbstractC0323Dx ? (AbstractC0323Dx) obj : null;
            if (!O90.a(objB, abstractC0323Dx != null ? abstractC0323Dx.b() : null)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        Object objB = b();
        if (objB != null) {
            return objB.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(b());
    }
}
