package defpackage;

import java.util.Set;

/* loaded from: classes.dex */
public final class X9 {
    public static final X9 d;
    public final int a;
    public final int b;
    public final V70 c;

    static {
        X9 x9;
        if (AbstractC0277Dh1.a >= 33) {
            U70 u70 = new U70(4);
            for (int i = 1; i <= 10; i++) {
                u70.a(Integer.valueOf(AbstractC0277Dh1.r(i)));
            }
            x9 = new X9(2, u70.h());
        } else {
            x9 = new X9(2, 10);
        }
        d = x9;
    }

    public X9(int i, Set set) {
        this.a = i;
        V70 v70U = V70.u(set);
        this.c = v70U;
        AbstractC5740lg1 it = v70U.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.b = iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X9)) {
            return false;
        }
        X9 x9 = (X9) obj;
        return this.a == x9.a && this.b == x9.b && AbstractC0277Dh1.a(this.c, x9.c);
    }

    public final int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        V70 v70 = this.c;
        return i + (v70 == null ? 0 : v70.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.a + ", maxChannelCount=" + this.b + ", channelMasks=" + this.c + "]";
    }

    public X9(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = null;
    }
}
