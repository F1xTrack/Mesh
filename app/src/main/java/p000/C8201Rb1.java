package p000;

/* renamed from: Rb1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8201Rb1 {

    /* renamed from: d */
    public static final C8201Rb1 f10320d = new C8201Rb1(new C8149Qb1[0]);

    /* renamed from: a */
    public final int f10321a;

    /* renamed from: b */
    public final C9367fQ0 f10322b;

    /* renamed from: c */
    public int f10323c;

    static {
        AbstractC7485Dh1.m1797L(0);
    }

    public C8201Rb1(C8149Qb1... c8149Qb1Arr) {
        this.f10322b = P70.m6235v(c8149Qb1Arr);
        this.f10321a = c8149Qb1Arr.length;
        int i = 0;
        while (true) {
            C9367fQ0 c9367fQ0 = this.f10322b;
            if (i >= c9367fQ0.size()) {
                return;
            }
            int i2 = i + 1;
            for (int i3 = i2; i3 < c9367fQ0.size(); i3++) {
                if (((C8149Qb1) c9367fQ0.get(i)).equals(c9367fQ0.get(i3))) {
                    AbstractC10872rA1.m24172e("", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    /* renamed from: a */
    public final C8149Qb1 m7046a(int i) {
        return (C8149Qb1) this.f10322b.get(i);
    }

    /* renamed from: b */
    public final int m7047b(C8149Qb1 c8149Qb1) {
        int iIndexOf = this.f10322b.indexOf(c8149Qb1);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8201Rb1.class != obj.getClass()) {
            return false;
        }
        C8201Rb1 c8201Rb1 = (C8201Rb1) obj;
        return this.f10321a == c8201Rb1.f10321a && this.f10322b.equals(c8201Rb1.f10322b);
    }

    public final int hashCode() {
        if (this.f10323c == 0) {
            this.f10323c = this.f10322b.hashCode();
        }
        return this.f10323c;
    }
}
