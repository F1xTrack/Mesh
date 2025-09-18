package p000;

/* renamed from: sG0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11011sG0 {

    /* renamed from: a */
    public final Class f42349a;

    /* renamed from: b */
    public final Class f42350b;

    public C11011sG0(Class cls, Class cls2) {
        this.f42349a = cls;
        this.f42350b = cls2;
    }

    /* renamed from: a */
    public static C11011sG0 m24687a(Class cls) {
        return new C11011sG0(InterfaceC10883rG0.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11011sG0.class != obj.getClass()) {
            return false;
        }
        C11011sG0 c11011sG0 = (C11011sG0) obj;
        if (this.f42350b.equals(c11011sG0.f42350b)) {
            return this.f42349a.equals(c11011sG0.f42349a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f42349a.hashCode() + (this.f42350b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f42350b;
        Class cls2 = this.f42349a;
        if (cls2 == InterfaceC10883rG0.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
