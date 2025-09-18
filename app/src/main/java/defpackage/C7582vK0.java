package defpackage;

/* renamed from: vK0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7582vK0 {
    public final boolean a;
    public final int b;

    public C7582vK0(int i) {
        i = i == -1 ? 0 : i;
        this.a = (i & 2) != 0;
        this.b = (i & 1) != 0 ? 700 : 400;
    }

    public C7582vK0(int i, int i2) {
        i = i == -1 ? 0 : i;
        this.a = (i & 2) != 0;
        this.b = i2 == -1 ? (i & 1) != 0 ? 700 : 400 : i2;
    }
}
