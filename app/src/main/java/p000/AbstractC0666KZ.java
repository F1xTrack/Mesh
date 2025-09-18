package p000;

/* renamed from: KZ */
/* loaded from: classes2.dex */
public abstract class AbstractC0666KZ {

    /* renamed from: a */
    public final C0664KX f6190a;

    /* renamed from: b */
    public final String f6191b;

    public AbstractC0666KZ(C0664KX c0664kx, String str) {
        O90.m5968f(c0664kx, "packageFqName");
        this.f6190a = c0664kx;
        this.f6191b = str;
    }

    /* renamed from: a */
    public final C8340Tt0 m4673a(int i) {
        return C8340Tt0.m7798e(this.f6191b + i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6190a);
        sb.append('.');
        return F91.m2539v(sb, this.f6191b, 'N');
    }
}
