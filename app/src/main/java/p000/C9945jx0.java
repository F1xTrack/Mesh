package p000;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* renamed from: jx0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9945jx0 {

    /* renamed from: a */
    public final C10073kx0 f35456a = new C10073kx0();

    /* renamed from: b */
    public final C9591hA0 f35457b = new C9591hA0(new byte[65025], 0);

    /* renamed from: c */
    public int f35458c = -1;

    /* renamed from: d */
    public int f35459d;

    /* renamed from: e */
    public boolean f35460e;

    /* renamed from: a */
    public final int m22128a(int i) {
        int i2;
        int i3 = 0;
        this.f35459d = 0;
        do {
            int i4 = this.f35459d;
            int i5 = i + i4;
            C10073kx0 c10073kx0 = this.f35456a;
            if (i5 >= c10073kx0.f36769c) {
                break;
            }
            int[] iArr = c10073kx0.f36772f;
            this.f35459d = i4 + 1;
            i2 = iArr[i4 + i];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    /* renamed from: b */
    public final boolean m22129b(C7000vF c7000vF) throws InterruptedIOException {
        int i;
        YN1.m9281f(c7000vF != null);
        boolean z = this.f35460e;
        C9591hA0 c9591hA0 = this.f35457b;
        if (z) {
            this.f35460e = false;
            c9591hA0.m18738D(0);
        }
        while (!this.f35460e) {
            int i2 = this.f35458c;
            C10073kx0 c10073kx0 = this.f35456a;
            if (i2 < 0) {
                if (c10073kx0.m22319b(c7000vF, -1L) && c10073kx0.m22318a(c7000vF, true)) {
                    int iM22128a = c10073kx0.f36770d;
                    if ((c10073kx0.f36767a & 1) == 1 && c9591hA0.f28295c == 0) {
                        iM22128a += m22128a(0);
                        i = this.f35459d;
                    } else {
                        i = 0;
                    }
                    try {
                        c7000vF.mo3627n(iM22128a);
                        this.f35458c = i;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int iM22128a2 = m22128a(this.f35458c);
            int i3 = this.f35458c + this.f35459d;
            if (iM22128a2 > 0) {
                c9591hA0.m18744b(c9591hA0.f28295c + iM22128a2);
                try {
                    c7000vF.mo3618b(c9591hA0.f28293a, c9591hA0.f28295c, iM22128a2, false);
                    c9591hA0.m18740F(c9591hA0.f28295c + iM22128a2);
                    this.f35460e = c10073kx0.f36772f[i3 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i3 == c10073kx0.f36769c) {
                i3 = -1;
            }
            this.f35458c = i3;
        }
        return true;
    }
}
