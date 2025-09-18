package p000;

import java.util.Arrays;

/* renamed from: dc1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9136dc1 {

    /* renamed from: a */
    public final int f26161a;

    /* renamed from: b */
    public final C8149Qb1 f26162b;

    /* renamed from: c */
    public final boolean f26163c;

    /* renamed from: d */
    public final int[] f26164d;

    /* renamed from: e */
    public final boolean[] f26165e;

    static {
        AbstractC7485Dh1.m1797L(0);
        AbstractC7485Dh1.m1797L(1);
        AbstractC7485Dh1.m1797L(3);
        AbstractC7485Dh1.m1797L(4);
    }

    public C9136dc1(C8149Qb1 c8149Qb1, boolean z, int[] iArr, boolean[] zArr) {
        int i = c8149Qb1.f9687a;
        this.f26161a = i;
        boolean z2 = false;
        YN1.m9278c(i == iArr.length && i == zArr.length);
        this.f26162b = c8149Qb1;
        if (z && i > 1) {
            z2 = true;
        }
        this.f26163c = z2;
        this.f26164d = (int[]) iArr.clone();
        this.f26165e = (boolean[]) zArr.clone();
    }

    /* renamed from: a */
    public final C6686qX m17712a(int i) {
        return this.f26162b.f9690d[i];
    }

    /* renamed from: b */
    public final boolean m17713b(int i) {
        return this.f26165e[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9136dc1.class != obj.getClass()) {
            return false;
        }
        C9136dc1 c9136dc1 = (C9136dc1) obj;
        return this.f26163c == c9136dc1.f26163c && this.f26162b.equals(c9136dc1.f26162b) && Arrays.equals(this.f26164d, c9136dc1.f26164d) && Arrays.equals(this.f26165e, c9136dc1.f26165e);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f26165e) + ((Arrays.hashCode(this.f26164d) + (((this.f26162b.hashCode() * 31) + (this.f26163c ? 1 : 0)) * 31)) * 31);
    }
}
