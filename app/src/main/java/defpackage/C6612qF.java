package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

/* renamed from: qF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6612qF {
    public final byte[] a = new byte[8];
    public final ArrayDeque b = new ArrayDeque();
    public final C4206hi1 c = new C4206hi1();
    public C3866fw1 d;
    public int e;
    public int f;
    public long g;

    public final long a(C7566vF c7566vF, int i) throws EOFException, InterruptedIOException {
        c7566vF.b(this.a, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (r0[i2] & 255);
        }
        return j;
    }
}
