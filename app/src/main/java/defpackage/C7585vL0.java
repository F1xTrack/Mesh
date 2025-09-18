package defpackage;

/* renamed from: vL0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7585vL0 {
    public long a = 0;
    public int b = 0;
    public final int c;
    public final int d;

    public C7585vL0(int i, int i2) {
        this.d = i;
        this.c = i2;
    }

    public final boolean a(float f) {
        int i = this.c;
        boolean z = false;
        boolean z2 = i <= 0 || f <= 0.0f || Math.floor((double) (f * ((float) i))) > ((double) this.b);
        if (System.currentTimeMillis() - this.a > this.d && z2) {
            z = true;
        }
        if (z) {
            this.b++;
            this.a = System.currentTimeMillis();
        }
        return z;
    }
}
