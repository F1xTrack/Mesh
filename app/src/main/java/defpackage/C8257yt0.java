package defpackage;

import java.io.EOFException;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: yt0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8257yt0 extends AbstractC7221tR0 {
    public static final C1859Xp0 e;
    public static final C1859Xp0 f;
    public static final byte[] g;
    public static final byte[] h;
    public static final byte[] i;
    public final C0674Ik a;
    public final List b;
    public final C1859Xp0 c;
    public long d;

    static {
        Pattern pattern = C1859Xp0.d;
        e = AbstractC7743wA1.b("multipart/mixed");
        AbstractC7743wA1.b("multipart/alternative");
        AbstractC7743wA1.b("multipart/digest");
        AbstractC7743wA1.b("multipart/parallel");
        f = AbstractC7743wA1.b("multipart/form-data");
        g = new byte[]{58, 32};
        h = new byte[]{13, 10};
        i = new byte[]{45, 45};
    }

    public C8257yt0(C0674Ik c0674Ik, C1859Xp0 c1859Xp0, List list) {
        O90.f(c0674Ik, "boundaryByteString");
        O90.f(c1859Xp0, "type");
        this.a = c0674Ik;
        this.b = list;
        Pattern pattern = C1859Xp0.d;
        this.c = AbstractC7743wA1.b(c1859Xp0 + "; boundary=" + c0674Ik.k());
        this.d = -1L;
    }

    @Override // defpackage.AbstractC7221tR0
    public final long a() throws EOFException {
        long j = this.d;
        if (j != -1) {
            return j;
        }
        long jE = e(null, true);
        this.d = jE;
        return jE;
    }

    @Override // defpackage.AbstractC7221tR0
    public final C1859Xp0 b() {
        return this.c;
    }

    @Override // defpackage.AbstractC7221tR0
    public final void d(InterfaceC0749Jj interfaceC0749Jj) throws EOFException {
        e(interfaceC0749Jj, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long e(InterfaceC0749Jj interfaceC0749Jj, boolean z) throws EOFException {
        C6129nj c6129nj;
        InterfaceC0749Jj c6129nj2;
        if (z) {
            c6129nj2 = new C6129nj();
            c6129nj = c6129nj2;
        } else {
            c6129nj = 0;
            c6129nj2 = interfaceC0749Jj;
        }
        List list = this.b;
        int size = list.size();
        long j = 0;
        int i2 = 0;
        while (true) {
            C0674Ik c0674Ik = this.a;
            byte[] bArr = i;
            byte[] bArr2 = h;
            if (i2 >= size) {
                O90.c(c6129nj2);
                c6129nj2.a0(bArr);
                c6129nj2.k0(c0674Ik);
                c6129nj2.a0(bArr);
                c6129nj2.a0(bArr2);
                if (!z) {
                    return j;
                }
                O90.c(c6129nj);
                long j2 = j + c6129nj.b;
                c6129nj.m();
                return j2;
            }
            C8067xt0 c8067xt0 = (C8067xt0) list.get(i2);
            K20 k20 = c8067xt0.a;
            O90.c(c6129nj2);
            c6129nj2.a0(bArr);
            c6129nj2.k0(c0674Ik);
            c6129nj2.a0(bArr2);
            int size2 = k20.size();
            for (int i3 = 0; i3 < size2; i3++) {
                c6129nj2.L(k20.d(i3)).a0(g).L(k20.q(i3)).a0(bArr2);
            }
            AbstractC7221tR0 abstractC7221tR0 = c8067xt0.b;
            C1859Xp0 c1859Xp0B = abstractC7221tR0.b();
            if (c1859Xp0B != null) {
                c6129nj2.L("Content-Type: ").L(c1859Xp0B.a).a0(bArr2);
            }
            long jA = abstractC7221tR0.a();
            if (jA != -1) {
                c6129nj2.L("Content-Length: ").f0(jA).a0(bArr2);
            } else if (z) {
                O90.c(c6129nj);
                c6129nj.m();
                return -1L;
            }
            c6129nj2.a0(bArr2);
            if (z) {
                j += jA;
            } else {
                abstractC7221tR0.d(c6129nj2);
            }
            c6129nj2.a0(bArr2);
            i2++;
        }
    }
}
