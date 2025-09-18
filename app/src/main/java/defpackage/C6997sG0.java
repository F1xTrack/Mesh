package defpackage;

/* renamed from: sG0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6997sG0 {
    public final Class a;
    public final Class b;

    public C6997sG0(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public static C6997sG0 a(Class cls) {
        return new C6997sG0(InterfaceC6806rG0.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6997sG0.class != obj.getClass()) {
            return false;
        }
        C6997sG0 c6997sG0 = (C6997sG0) obj;
        if (this.b.equals(c6997sG0.b)) {
            return this.a.equals(c6997sG0.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.b;
        Class cls2 = this.a;
        if (cls2 == InterfaceC6806rG0.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
