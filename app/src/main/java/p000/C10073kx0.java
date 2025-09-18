package p000;

import java.io.EOFException;
import kotlin.KotlinVersion;

/* renamed from: kx0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10073kx0 {

    /* renamed from: a */
    public int f36767a;

    /* renamed from: b */
    public long f36768b;

    /* renamed from: c */
    public int f36769c;

    /* renamed from: d */
    public int f36770d;

    /* renamed from: e */
    public int f36771e;

    /* renamed from: f */
    public final int[] f36772f = new int[KotlinVersion.MAX_COMPONENT_VALUE];

    /* renamed from: g */
    public final C9591hA0 f36773g = new C9591hA0(KotlinVersion.MAX_COMPONENT_VALUE);

    /* renamed from: a */
    public final boolean m22318a(C7000vF c7000vF, boolean z) throws C10103lA0, EOFException {
        boolean zMo3620f;
        boolean zMo3620f2;
        this.f36767a = 0;
        this.f36768b = 0L;
        this.f36769c = 0;
        this.f36770d = 0;
        this.f36771e = 0;
        C9591hA0 c9591hA0 = this.f36773g;
        c9591hA0.m18738D(27);
        try {
            zMo3620f = c7000vF.mo3620f(c9591hA0.f28293a, 0, 27, z);
        } catch (EOFException e) {
            if (!z) {
                throw e;
            }
            zMo3620f = false;
        }
        if (!zMo3620f || c9591hA0.m18765w() != 1332176723) {
            return false;
        }
        if (c9591hA0.m18763u() != 0) {
            if (z) {
                return false;
            }
            throw C10103lA0.m22368c("unsupported bit stream revision");
        }
        this.f36767a = c9591hA0.m18763u();
        this.f36768b = c9591hA0.m18752j();
        c9591hA0.m18754l();
        c9591hA0.m18754l();
        c9591hA0.m18754l();
        int iM18763u = c9591hA0.m18763u();
        this.f36769c = iM18763u;
        this.f36770d = iM18763u + 27;
        c9591hA0.m18738D(iM18763u);
        try {
            zMo3620f2 = c7000vF.mo3620f(c9591hA0.f28293a, 0, this.f36769c, z);
        } catch (EOFException e2) {
            if (!z) {
                throw e2;
            }
            zMo3620f2 = false;
        }
        if (!zMo3620f2) {
            return false;
        }
        for (int i = 0; i < this.f36769c; i++) {
            int iM18763u2 = c9591hA0.m18763u();
            this.f36772f[i] = iM18763u2;
            this.f36771e += iM18763u2;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (r11 == (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        if (r10.f44295d >= r11) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        if (r10.m25379i(1) == (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
    
        return false;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m22319b(p000.C7000vF r10, long r11) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            r9 = this;
            long r0 = r10.f44295d
            long r2 = r10.mo3624j()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 != 0) goto Le
            r0 = r2
            goto Lf
        Le:
            r0 = r1
        Lf:
            p000.YN1.m9278c(r0)
            hA0 r0 = r9.f36773g
            r3 = 4
            r0.m18738D(r3)
        L18:
            r4 = -1
            int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r4 == 0) goto L27
            long r5 = r10.f44295d
            r7 = 4
            long r5 = r5 + r7
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 >= 0) goto L46
        L27:
            byte[] r5 = r0.f28293a
            boolean r5 = r10.mo3620f(r5, r1, r3, r2)     // Catch: java.io.EOFException -> L2e
            goto L2f
        L2e:
            r5 = r1
        L2f:
            if (r5 == 0) goto L46
            r0.m18741G(r1)
            long r4 = r0.m18765w()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L42
            r10.f44297f = r1
            return r2
        L42:
            r10.mo3627n(r2)
            goto L18
        L46:
            if (r4 == 0) goto L4e
            long r5 = r10.f44295d
            int r0 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r0 >= 0) goto L56
        L4e:
            int r0 = r10.m25379i(r2)
            r3 = -1
            if (r0 == r3) goto L56
            goto L46
        L56:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10073kx0.m22319b(vF, long):boolean");
    }
}
