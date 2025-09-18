package defpackage;

/* renamed from: Rb1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1350Rb1 {
    public static final C1350Rb1 d = new C1350Rb1(new C1272Qb1[0]);
    public final int a;
    public final C3769fQ0 b;
    public int c;

    static {
        AbstractC0277Dh1.L(0);
    }

    public C1350Rb1(C1272Qb1... c1272Qb1Arr) {
        this.b = P70.v(c1272Qb1Arr);
        this.a = c1272Qb1Arr.length;
        int i = 0;
        while (true) {
            C3769fQ0 c3769fQ0 = this.b;
            if (i >= c3769fQ0.size()) {
                return;
            }
            int i2 = i + 1;
            for (int i3 = i2; i3 < c3769fQ0.size(); i3++) {
                if (((C1272Qb1) c3769fQ0.get(i)).equals(c3769fQ0.get(i3))) {
                    AbstractC6789rA1.e("", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final C1272Qb1 a(int i) {
        return (C1272Qb1) this.b.get(i);
    }

    public final int b(C1272Qb1 c1272Qb1) {
        int iIndexOf = this.b.indexOf(c1272Qb1);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1350Rb1.class != obj.getClass()) {
            return false;
        }
        C1350Rb1 c1350Rb1 = (C1350Rb1) obj;
        return this.a == c1350Rb1.a && this.b.equals(c1350Rb1.b);
    }

    public final int hashCode() {
        if (this.c == 0) {
            this.c = this.b.hashCode();
        }
        return this.c;
    }
}
