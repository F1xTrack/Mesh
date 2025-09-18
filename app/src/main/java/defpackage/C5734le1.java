package defpackage;

/* renamed from: le1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5734le1 {
    public static final C5734le1 k = new C5734le1(false, false, false, false, false, new C5734le1(false, false, false, false, false, null, false, null, null, false, 1023), false, null, null, false, 988);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final C5734le1 f;
    public final boolean g;
    public final C5734le1 h;
    public final C5734le1 i;
    public final boolean j;

    public C5734le1(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, C5734le1 c5734le1, boolean z6, C5734le1 c5734le12, C5734le1 c5734le13, boolean z7, int i) {
        z = (i & 1) != 0 ? true : z;
        z2 = (i & 2) != 0 ? true : z2;
        z3 = (i & 4) != 0 ? false : z3;
        z4 = (i & 8) != 0 ? false : z4;
        z5 = (i & 16) != 0 ? false : z5;
        c5734le1 = (i & 32) != 0 ? null : c5734le1;
        z6 = (i & 64) != 0 ? true : z6;
        c5734le12 = (i & 128) != 0 ? c5734le1 : c5734le12;
        c5734le13 = (i & 256) != 0 ? c5734le1 : c5734le13;
        z7 = (i & 512) != 0 ? false : z7;
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = c5734le1;
        this.g = z6;
        this.h = c5734le12;
        this.i = c5734le13;
        this.j = z7;
    }
}
