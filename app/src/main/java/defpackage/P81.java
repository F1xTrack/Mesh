package defpackage;

/* loaded from: classes2.dex */
public abstract class P81 {
    public final String a;
    public final boolean b;
    public C2081a91 c;
    public long d;

    public P81(String str, boolean z) {
        O90.f(str, "name");
        this.a = str;
        this.b = z;
        this.d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.a;
    }
}
