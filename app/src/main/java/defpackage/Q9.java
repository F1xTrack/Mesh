package defpackage;

import android.media.AudioAttributes;

/* loaded from: classes.dex */
public final class Q9 {
    public static final Q9 d = new Q9(0, 1);
    public final int a;
    public final int b;
    public C0481Fx1 c;

    static {
        AbstractC8235ym.t(0, 1, 2, 3, 4);
    }

    public Q9(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final C0481Fx1 a() {
        if (this.c == null) {
            C0481Fx1 c0481Fx1 = new C0481Fx1();
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.a).setFlags(0).setUsage(this.b);
            int i = AbstractC0277Dh1.a;
            if (i >= 29) {
                O9.a(usage, 1);
            }
            if (i >= 32) {
                P9.a(usage, 0);
            }
            c0481Fx1.a = usage.build();
            this.c = c0481Fx1;
        }
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Q9.class != obj.getClass()) {
            return false;
        }
        Q9 q9 = (Q9) obj;
        return this.a == q9.a && this.b == q9.b;
    }

    public final int hashCode() {
        return (((((527 + this.a) * 961) + this.b) * 31) + 1) * 31;
    }
}
