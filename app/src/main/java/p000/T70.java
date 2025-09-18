package p000;

/* loaded from: classes.dex */
public final class T70 implements InterfaceC11267uG0 {

    /* renamed from: d */
    public static final T70 f11167d;

    /* renamed from: a */
    public int f11168a;

    /* renamed from: b */
    public boolean f11169b;

    /* renamed from: c */
    public boolean f11170c;

    static {
        T70 t70 = new T70();
        t70.f11168a = Integer.MAX_VALUE;
        t70.f11169b = true;
        t70.f11170c = true;
        f11167d = t70;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof T70)) {
            return false;
        }
        T70 t70 = (T70) obj;
        return this.f11168a == t70.f11168a && this.f11169b == t70.f11169b && this.f11170c == t70.f11170c;
    }

    public final int hashCode() {
        return ((this.f11169b ? 4194304 : 0) ^ this.f11168a) ^ (this.f11170c ? 8388608 : 0);
    }
}
