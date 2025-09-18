package p000;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* renamed from: hi1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9660hi1 {

    /* renamed from: d */
    public static final long[] f28541d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a */
    public int f28542a;

    /* renamed from: b */
    public int f28543b;

    /* renamed from: c */
    public final byte[] f28544c;

    public C9660hi1() {
        this.f28544c = new byte[8];
    }

    /* renamed from: a */
    public static long m18848a(int i, byte[] bArr, boolean z) {
        long j = bArr[0] & 255;
        if (z) {
            j &= ~f28541d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }

    /* renamed from: b */
    public static int m18849b(int i) {
        for (int i2 = 0; i2 < 8; i2++) {
            if ((f28541d[i2] & i) != 0) {
                return i2 + 1;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public long m18850c(C7000vF c7000vF, boolean z, boolean z2, int i) throws EOFException, InterruptedIOException {
        int i2 = this.f28542a;
        byte[] bArr = this.f28544c;
        if (i2 == 0) {
            if (!c7000vF.mo3618b(bArr, 0, 1, z)) {
                return -1L;
            }
            int iM18849b = m18849b(bArr[0] & 255);
            this.f28543b = iM18849b;
            if (iM18849b == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f28542a = 1;
        }
        int i3 = this.f28543b;
        if (i3 > i) {
            this.f28542a = 0;
            return -2L;
        }
        if (i3 != 1) {
            c7000vF.mo3618b(bArr, 1, i3 - 1, false);
        }
        this.f28542a = 0;
        return m18848a(this.f28543b, bArr, z2);
    }

    public C9660hi1(byte[] bArr, int i, int i2) {
        this.f28544c = bArr;
        this.f28542a = i;
        this.f28543b = i2;
    }
}
