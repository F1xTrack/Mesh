package defpackage;

/* loaded from: classes.dex */
public final class T70 implements InterfaceC7379uG0 {
    public static final T70 d;
    public int a;
    public boolean b;
    public boolean c;

    static {
        T70 t70 = new T70();
        t70.a = Integer.MAX_VALUE;
        t70.b = true;
        t70.c = true;
        d = t70;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof T70)) {
            return false;
        }
        T70 t70 = (T70) obj;
        return this.a == t70.a && this.b == t70.b && this.c == t70.c;
    }

    public final int hashCode() {
        return ((this.b ? 4194304 : 0) ^ this.a) ^ (this.c ? 8388608 : 0);
    }
}
