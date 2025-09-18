package defpackage;

/* loaded from: classes2.dex */
public abstract class KZ {
    public final KX a;
    public final String b;

    public KZ(KX kx, String str) {
        O90.f(kx, "packageFqName");
        this.a = kx;
        this.b = str;
    }

    public final C1559Tt0 a(int i) {
        return C1559Tt0.e(this.b + i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('.');
        return F91.v(sb, this.b, 'N');
    }
}
