package defpackage;

/* renamed from: iR, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4344iR {
    public final C1272Qb1 a;
    public final int[] b;

    public C4344iR(C1272Qb1 c1272Qb1, int[] iArr) {
        if (iArr.length == 0) {
            AbstractC6789rA1.e("Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.a = c1272Qb1;
        this.b = iArr;
    }
}
