package p000;

/* loaded from: classes.dex */
public final class ZC1 {

    /* renamed from: a */
    public String f14792a;

    /* renamed from: b */
    public int f14793b;

    /* renamed from: c */
    public int f14794c;

    /* renamed from: d */
    public byte f14795d;

    /* renamed from: a */
    public final C8953cD1 m9504a() {
        if (this.f14795d == 1 && this.f14792a != null && this.f14793b != 0 && this.f14794c != 0) {
            return new C8953cD1(this.f14792a, this.f14793b, this.f14794c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f14792a == null) {
            sb.append(" fileOwner");
        }
        if ((1 & this.f14795d) == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if (this.f14793b == 0) {
            sb.append(" fileChecks");
        }
        if (this.f14794c == 0) {
            sb.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(String.valueOf(sb)));
    }
}
