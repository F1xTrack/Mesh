package com.yandex.metrica.impl.ob;

/* loaded from: classes2.dex */
public class Sd implements Ud {
    private long a;
    private int b;
    private final Td c;
    private final Ci d;
    private final R2 e;
    private final Om f;

    public Sd(Td td, Ci ci) {
        this(td, ci, new R2(), new Nm());
    }

    private void b() {
        this.b = this.c.b();
        this.a = this.c.a();
    }

    @Override // com.yandex.metrica.impl.ob.Ud
    public boolean a() {
        Ci ci = this.d;
        if (ci != null) {
            long j = this.a;
            if (j != 0) {
                R2 r2 = this.e;
                int i = ((1 << (this.b - 1)) - 1) * ci.b;
                int i2 = ci.a;
                if (i > i2) {
                    i = i2;
                }
                return r2.b(j, i, "last send attempt");
            }
        }
        return true;
    }

    public void c() {
        this.b = 1;
        this.a = 0L;
        this.c.a(1);
        this.c.a(this.a);
    }

    public void d() {
        long jB = this.f.b();
        this.a = jB;
        this.b++;
        this.c.a(jB);
        this.c.a(this.b);
    }

    public Sd(Td td, Ci ci, R2 r2, Om om) {
        this.d = ci;
        this.c = td;
        this.e = r2;
        this.f = om;
        b();
    }
}
