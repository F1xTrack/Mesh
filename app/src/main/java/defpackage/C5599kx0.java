package defpackage;

import java.io.EOFException;
import kotlin.KotlinVersion;

/* renamed from: kx0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5599kx0 {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f = new int[KotlinVersion.MAX_COMPONENT_VALUE];
    public final C4103hA0 g = new C4103hA0(KotlinVersion.MAX_COMPONENT_VALUE);

    public final boolean a(C7566vF c7566vF, boolean z) throws C5643lA0, EOFException {
        boolean zF;
        boolean zF2;
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        C4103hA0 c4103hA0 = this.g;
        c4103hA0.D(27);
        try {
            zF = c7566vF.f(c4103hA0.a, 0, 27, z);
        } catch (EOFException e) {
            if (!z) {
                throw e;
            }
            zF = false;
        }
        if (!zF || c4103hA0.w() != 1332176723) {
            return false;
        }
        if (c4103hA0.u() != 0) {
            if (z) {
                return false;
            }
            throw C5643lA0.c("unsupported bit stream revision");
        }
        this.a = c4103hA0.u();
        this.b = c4103hA0.j();
        c4103hA0.l();
        c4103hA0.l();
        c4103hA0.l();
        int iU = c4103hA0.u();
        this.c = iU;
        this.d = iU + 27;
        c4103hA0.D(iU);
        try {
            zF2 = c7566vF.f(c4103hA0.a, 0, this.c, z);
        } catch (EOFException e2) {
            if (!z) {
                throw e2;
            }
            zF2 = false;
        }
        if (!zF2) {
            return false;
        }
        for (int i = 0; i < this.c; i++) {
            int iU2 = c4103hA0.u();
            this.f[i] = iU2;
            this.e += iU2;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (r11 == (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        if (r10.d >= r11) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        if (r10.i(1) == (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(defpackage.C7566vF r10, long r11) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            r9 = this;
            long r0 = r10.d
            long r2 = r10.j()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 != 0) goto Le
            r0 = r2
            goto Lf
        Le:
            r0 = r1
        Lf:
            defpackage.YN1.c(r0)
            hA0 r0 = r9.g
            r3 = 4
            r0.D(r3)
        L18:
            r4 = -1
            int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r4 == 0) goto L27
            long r5 = r10.d
            r7 = 4
            long r5 = r5 + r7
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 >= 0) goto L46
        L27:
            byte[] r5 = r0.a
            boolean r5 = r10.f(r5, r1, r3, r2)     // Catch: java.io.EOFException -> L2e
            goto L2f
        L2e:
            r5 = r1
        L2f:
            if (r5 == 0) goto L46
            r0.G(r1)
            long r4 = r0.w()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L42
            r10.f = r1
            return r2
        L42:
            r10.n(r2)
            goto L18
        L46:
            if (r4 == 0) goto L4e
            long r5 = r10.d
            int r0 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r0 >= 0) goto L56
        L4e:
            int r0 = r10.i(r2)
            r3 = -1
            if (r0 == r3) goto L56
            goto L46
        L56:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5599kx0.b(vF, long):boolean");
    }
}
