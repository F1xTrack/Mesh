package p000;

/* renamed from: vL0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11405vL0 {

    /* renamed from: a */
    public long f44339a = 0;

    /* renamed from: b */
    public int f44340b = 0;

    /* renamed from: c */
    public final int f44341c;

    /* renamed from: d */
    public final int f44342d;

    public C11405vL0(int i, int i2) {
        this.f44342d = i;
        this.f44341c = i2;
    }

    /* renamed from: a */
    public final boolean m25401a(float f) {
        int i = this.f44341c;
        boolean z = false;
        boolean z2 = i <= 0 || f <= 0.0f || Math.floor((double) (f * ((float) i))) > ((double) this.f44340b);
        if (System.currentTimeMillis() - this.f44339a > this.f44342d && z2) {
            z = true;
        }
        if (z) {
            this.f44340b++;
            this.f44339a = System.currentTimeMillis();
        }
        return z;
    }
}
