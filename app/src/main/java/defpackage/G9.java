package defpackage;

/* loaded from: classes.dex */
public final class G9 {
    public final int a;
    public int b;
    public int c;
    public long d;
    public final boolean e;
    public final C4103hA0 f;
    public final C4103hA0 g;
    public int h;
    public int i;

    public G9(C4103hA0 c4103hA0, C4103hA0 c4103hA02, boolean z) throws C5643lA0 {
        this.g = c4103hA0;
        this.f = c4103hA02;
        this.e = z;
        c4103hA02.G(12);
        this.a = c4103hA02.y();
        c4103hA0.G(12);
        this.i = c4103hA0.y();
        U02.a("first_chunk must be 1", c4103hA0.g() == 1);
        this.b = -1;
    }

    public final boolean a() {
        int i = this.b + 1;
        this.b = i;
        if (i == this.a) {
            return false;
        }
        boolean z = this.e;
        C4103hA0 c4103hA0 = this.f;
        this.d = z ? c4103hA0.z() : c4103hA0.w();
        if (this.b == this.h) {
            C4103hA0 c4103hA02 = this.g;
            this.c = c4103hA02.y();
            c4103hA02.H(4);
            int i2 = this.i - 1;
            this.i = i2;
            this.h = i2 > 0 ? c4103hA02.y() - 1 : -1;
        }
        return true;
    }
}
