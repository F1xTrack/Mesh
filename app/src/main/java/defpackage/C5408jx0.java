package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* renamed from: jx0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5408jx0 {
    public final C5599kx0 a = new C5599kx0();
    public final C4103hA0 b = new C4103hA0(new byte[65025], 0);
    public int c = -1;
    public int d;
    public boolean e;

    public final int a(int i) {
        int i2;
        int i3 = 0;
        this.d = 0;
        do {
            int i4 = this.d;
            int i5 = i + i4;
            C5599kx0 c5599kx0 = this.a;
            if (i5 >= c5599kx0.c) {
                break;
            }
            int[] iArr = c5599kx0.f;
            this.d = i4 + 1;
            i2 = iArr[i4 + i];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public final boolean b(C7566vF c7566vF) throws InterruptedIOException {
        int i;
        YN1.f(c7566vF != null);
        boolean z = this.e;
        C4103hA0 c4103hA0 = this.b;
        if (z) {
            this.e = false;
            c4103hA0.D(0);
        }
        while (!this.e) {
            int i2 = this.c;
            C5599kx0 c5599kx0 = this.a;
            if (i2 < 0) {
                if (c5599kx0.b(c7566vF, -1L) && c5599kx0.a(c7566vF, true)) {
                    int iA = c5599kx0.d;
                    if ((c5599kx0.a & 1) == 1 && c4103hA0.c == 0) {
                        iA += a(0);
                        i = this.d;
                    } else {
                        i = 0;
                    }
                    try {
                        c7566vF.n(iA);
                        this.c = i;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int iA2 = a(this.c);
            int i3 = this.c + this.d;
            if (iA2 > 0) {
                c4103hA0.b(c4103hA0.c + iA2);
                try {
                    c7566vF.b(c4103hA0.a, c4103hA0.c, iA2, false);
                    c4103hA0.F(c4103hA0.c + iA2);
                    this.e = c5599kx0.f[i3 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i3 == c5599kx0.c) {
                i3 = -1;
            }
            this.c = i3;
        }
        return true;
    }
}
