package defpackage;

/* renamed from: Tf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1516Tf {
    public boolean a = false;

    public static boolean a(int i) {
        return (i & 1) == 1;
    }

    public static boolean b(int i) {
        return !a(i);
    }

    public static boolean l(int i, int i2) {
        return (i & i2) == i2;
    }

    public final synchronized void c() {
        if (this.a) {
            return;
        }
        this.a = true;
        try {
            d();
        } catch (Exception unused) {
            k();
        }
    }

    public abstract void d();

    public final synchronized void e(Throwable th) {
        if (this.a) {
            return;
        }
        this.a = true;
        try {
            f(th);
        } catch (Exception unused) {
            k();
        }
    }

    public abstract void f(Throwable th);

    public final synchronized void g(int i, Object obj) {
        if (this.a) {
            return;
        }
        this.a = a(i);
        try {
            h(i, obj);
        } catch (Exception unused) {
            k();
        }
    }

    public abstract void h(int i, Object obj);

    public final synchronized void i(float f) {
        if (this.a) {
            return;
        }
        try {
            j(f);
        } catch (Exception unused) {
            k();
        }
    }

    public abstract void j(float f);

    public final void k() {
        AbstractC3393dS.a.o(6);
    }
}
