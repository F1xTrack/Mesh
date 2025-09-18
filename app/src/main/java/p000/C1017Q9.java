package p000;

import android.media.AudioAttributes;

/* renamed from: Q9 */
/* loaded from: classes.dex */
public final class C1017Q9 {

    /* renamed from: d */
    public static final C1017Q9 f9497d = new C1017Q9(0, 1);

    /* renamed from: a */
    public final int f9498a;

    /* renamed from: b */
    public final int f9499b;

    /* renamed from: c */
    public C7621Fx1 f9500c;

    static {
        AbstractC7222ym.m26243t(0, 1, 2, 3, 4);
    }

    public C1017Q9(int i, int i2) {
        this.f9498a = i;
        this.f9499b = i2;
    }

    /* renamed from: a */
    public final C7621Fx1 m6587a() {
        if (this.f9500c == null) {
            C7621Fx1 c7621Fx1 = new C7621Fx1();
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f9498a).setFlags(0).setUsage(this.f9499b);
            int i = AbstractC7485Dh1.f2166a;
            if (i >= 29) {
                AbstractC0891O9.m5962a(usage, 1);
            }
            if (i >= 32) {
                AbstractC0954P9.m6250a(usage, 0);
            }
            c7621Fx1.f3494a = usage.build();
            this.f9500c = c7621Fx1;
        }
        return this.f9500c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1017Q9.class != obj.getClass()) {
            return false;
        }
        C1017Q9 c1017q9 = (C1017Q9) obj;
        return this.f9498a == c1017q9.f9498a && this.f9499b == c1017q9.f9499b;
    }

    public final int hashCode() {
        return (((((527 + this.f9498a) * 961) + this.f9499b) * 31) + 1) * 31;
    }
}
