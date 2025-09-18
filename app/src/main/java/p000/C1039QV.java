package p000;

/* renamed from: QV */
/* loaded from: classes.dex */
public final class C1039QV {

    /* renamed from: a */
    public final C6568oh f9646a;

    /* renamed from: b */
    public final InterfaceC6839sh f9647b;

    /* renamed from: c */
    public C6633ph f9648c;

    /* renamed from: d */
    public final int f9649d;

    public C1039QV(InterfaceC6696qh interfaceC6696qh, InterfaceC6839sh interfaceC6839sh, long j, long j2, long j3, long j4, long j5, int i) {
        this.f9647b = interfaceC6839sh;
        this.f9649d = i;
        this.f9646a = new C6568oh(interfaceC6696qh, j, j2, j3, j4, j5);
    }

    /* renamed from: a */
    public static int m6723a(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* renamed from: c */
    public static int m6724c(C7000vF c7000vF, long j, C1164SV c1164sv) {
        if (j == c7000vF.f44295d) {
            return 0;
        }
        c1164sv.f10814a = j;
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cf, code lost:
    
        return m6724c(r28, r8, r29);
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m6725b(p000.C7000vF r28, p000.C1164SV r29) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1039QV.m6725b(vF, SV):int");
    }

    /* renamed from: d */
    public final void m6726d(long j) {
        C6633ph c6633ph = this.f9648c;
        if (c6633ph == null || c6633ph.f40277a != j) {
            C6568oh c6568oh = this.f9646a;
            this.f9648c = new C6633ph(j, c6568oh.f39175a.mo1472f(j), c6568oh.f39177c, c6568oh.f39178d, c6568oh.f39179e, c6568oh.f39180f);
        }
    }
}
