package defpackage;

/* renamed from: Mn1 */
/* loaded from: classes.dex */
public abstract class AbstractC0996Mn1 {
    public final C1698Vn1 a;
    public J80[] b;

    public AbstractC0996Mn1() {
        this(new C1698Vn1());
    }

    public final void a() {
        J80[] j80Arr = this.b;
        if (j80Arr != null) {
            J80 j80F = j80Arr[0];
            J80 j80F2 = j80Arr[1];
            C1698Vn1 c1698Vn1 = this.a;
            if (j80F2 == null) {
                j80F2 = c1698Vn1.a.f(2);
            }
            if (j80F == null) {
                j80F = c1698Vn1.a.f(1);
            }
            g(J80.a(j80F, j80F2));
            J80 j80 = this.b[AbstractC3884g12.a(16)];
            if (j80 != null) {
                f(j80);
            }
            J80 j802 = this.b[AbstractC3884g12.a(32)];
            if (j802 != null) {
                d(j802);
            }
            J80 j803 = this.b[AbstractC3884g12.a(64)];
            if (j803 != null) {
                h(j803);
            }
        }
    }

    public abstract C1698Vn1 b();

    public void c(int i, J80 j80) {
        if (this.b == null) {
            this.b = new J80[9];
        }
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.b[AbstractC3884g12.a(i2)] = j80;
            }
        }
    }

    public abstract void e(J80 j80);

    public abstract void g(J80 j80);

    public AbstractC0996Mn1(C1698Vn1 c1698Vn1) {
        this.a = c1698Vn1;
    }

    public void d(J80 j80) {
    }

    public void f(J80 j80) {
    }

    public void h(J80 j80) {
    }
}
