package p000;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

/* renamed from: qF */
/* loaded from: classes.dex */
public final class C6668qF {

    /* renamed from: a */
    public final byte[] f40677a = new byte[8];

    /* renamed from: b */
    public final ArrayDeque f40678b = new ArrayDeque();

    /* renamed from: c */
    public final C9660hi1 f40679c = new C9660hi1();

    /* renamed from: d */
    public C9432fw1 f40680d;

    /* renamed from: e */
    public int f40681e;

    /* renamed from: f */
    public int f40682f;

    /* renamed from: g */
    public long f40683g;

    /* renamed from: a */
    public final long m23956a(C7000vF c7000vF, int i) throws EOFException, InterruptedIOException {
        c7000vF.mo3618b(this.f40677a, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (r0[i2] & 255);
        }
        return j;
    }
}
