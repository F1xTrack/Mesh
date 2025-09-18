package p000;

import java.util.Set;

/* renamed from: X9 */
/* loaded from: classes.dex */
public final class C1457X9 {

    /* renamed from: d */
    public static final C1457X9 f13578d;

    /* renamed from: a */
    public final int f13579a;

    /* renamed from: b */
    public final int f13580b;

    /* renamed from: c */
    public final V70 f13581c;

    static {
        C1457X9 c1457x9;
        if (AbstractC7485Dh1.f2166a >= 33) {
            U70 u70 = new U70(4);
            for (int i = 1; i <= 10; i++) {
                u70.m3755a(Integer.valueOf(AbstractC7485Dh1.m1833r(i)));
            }
            c1457x9 = new C1457X9(2, u70.m7918h());
        } else {
            c1457x9 = new C1457X9(2, 10);
        }
        f13578d = c1457x9;
    }

    public C1457X9(int i, Set set) {
        this.f13579a = i;
        V70 v70M8308u = V70.m8308u(set);
        this.f13581c = v70M8308u;
        AbstractC10168lg1 it = v70M8308u.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.f13580b = iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1457X9)) {
            return false;
        }
        C1457X9 c1457x9 = (C1457X9) obj;
        return this.f13579a == c1457x9.f13579a && this.f13580b == c1457x9.f13580b && AbstractC7485Dh1.m1812a(this.f13581c, c1457x9.f13581c);
    }

    public final int hashCode() {
        int i = ((this.f13579a * 31) + this.f13580b) * 31;
        V70 v70 = this.f13581c;
        return i + (v70 == null ? 0 : v70.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.f13579a + ", maxChannelCount=" + this.f13580b + ", channelMasks=" + this.f13581c + "]";
    }

    public C1457X9(int i, int i2) {
        this.f13579a = i;
        this.f13580b = i2;
        this.f13581c = null;
    }
}
