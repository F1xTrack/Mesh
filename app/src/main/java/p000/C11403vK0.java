package p000;

/* renamed from: vK0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11403vK0 {

    /* renamed from: a */
    public final boolean f44331a;

    /* renamed from: b */
    public final int f44332b;

    public C11403vK0(int i) {
        i = i == -1 ? 0 : i;
        this.f44331a = (i & 2) != 0;
        this.f44332b = (i & 1) != 0 ? 700 : 400;
    }

    public C11403vK0(int i, int i2) {
        i = i == -1 ? 0 : i;
        this.f44331a = (i & 2) != 0;
        this.f44332b = i2 == -1 ? (i & 1) != 0 ? 700 : 400 : i2;
    }
}
