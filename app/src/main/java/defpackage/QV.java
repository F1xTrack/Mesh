package defpackage;

/* loaded from: classes.dex */
public final class QV {
    public final C6314oh a;
    public final InterfaceC7077sh b;
    public C6505ph c;
    public final int d;

    public QV(InterfaceC6696qh interfaceC6696qh, InterfaceC7077sh interfaceC7077sh, long j, long j2, long j3, long j4, long j5, int i) {
        this.b = interfaceC7077sh;
        this.d = i;
        this.a = new C6314oh(interfaceC6696qh, j, j2, j3, j4, j5);
    }

    public static int a(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static int c(C7566vF c7566vF, long j, SV sv) {
        if (j == c7566vF.d) {
            return 0;
        }
        sv.a = j;
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cf, code lost:
    
        return c(r28, r8, r29);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(defpackage.C7566vF r28, defpackage.SV r29) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.QV.b(vF, SV):int");
    }

    public final void d(long j) {
        C6505ph c6505ph = this.c;
        if (c6505ph == null || c6505ph.a != j) {
            C6314oh c6314oh = this.a;
            this.c = new C6505ph(j, c6314oh.a.f(j), c6314oh.c, c6314oh.d, c6314oh.e, c6314oh.f);
        }
    }
}
