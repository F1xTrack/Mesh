package defpackage;

import android.text.TextUtils;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: on1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6334on1 implements WR {
    public static final Pattern i = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern j = Pattern.compile("MPEGTS:(-?\\d+)");
    public final String a;
    public final C0724Ja1 b;
    public final C0162Bv0 d;
    public final boolean e;
    public YR f;
    public int h;
    public final C4103hA0 c = new C4103hA0();
    public byte[] g = new byte[1024];

    public C6334on1(String str, C0724Ja1 c0724Ja1, C0162Bv0 c0162Bv0, boolean z) {
        this.a = str;
        this.b = c0724Ja1;
        this.d = c0162Bv0;
        this.e = z;
    }

    public final InterfaceC1584Ub1 a(long j2) {
        InterfaceC1584Ub1 interfaceC1584Ub1W = this.f.w(0, 3);
        C6475pX c6475pX = new C6475pX();
        c6475pX.l = AbstractC1865Xr0.n("text/vtt");
        c6475pX.d = this.a;
        c6475pX.q = j2;
        F91.B(c6475pX, interfaceC1584Ub1W);
        this.f.p();
        return interfaceC1584Ub1W;
    }

    @Override // defpackage.WR
    public final WR b() {
        return this;
    }

    @Override // defpackage.WR
    public final int d(XR xr, SV sv) throws C5643lA0, EOFException, InterruptedIOException {
        String strH;
        this.f.getClass();
        int i2 = (int) ((C7566vF) xr).c;
        int i3 = this.h;
        byte[] bArr = this.g;
        if (i3 == bArr.length) {
            this.g = Arrays.copyOf(bArr, ((i2 != -1 ? i2 : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.g;
        int i4 = this.h;
        int iR = ((C7566vF) xr).r(bArr2, i4, bArr2.length - i4);
        if (iR != -1) {
            int i5 = this.h + iR;
            this.h = i5;
            if (i2 == -1 || i5 != i2) {
                return 0;
            }
        }
        C4103hA0 c4103hA0 = new C4103hA0(this.g);
        AbstractC6525pn1.d(c4103hA0);
        String strH2 = c4103hA0.h(AbstractC8250yr.c);
        long j2 = 0;
        long jC = 0;
        while (true) {
            Matcher matcher = null;
            if (TextUtils.isEmpty(strH2)) {
                while (true) {
                    String strH3 = c4103hA0.h(AbstractC8250yr.c);
                    if (strH3 == null) {
                        break;
                    }
                    if (AbstractC6525pn1.a.matcher(strH3).matches()) {
                        do {
                            strH = c4103hA0.h(AbstractC8250yr.c);
                            if (strH != null) {
                            }
                        } while (!strH.isEmpty());
                    } else {
                        Matcher matcher2 = AbstractC6143nn1.a.matcher(strH3);
                        if (matcher2.matches()) {
                            matcher = matcher2;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    a(0L);
                    return -1;
                }
                String strGroup = matcher.group(1);
                strGroup.getClass();
                long jC2 = AbstractC6525pn1.c(strGroup);
                long jB = this.b.b(((((j2 + jC2) - jC) * 90000) / 1000000) % 8589934592L);
                InterfaceC1584Ub1 interfaceC1584Ub1A = a(jB - jC2);
                byte[] bArr3 = this.g;
                int i6 = this.h;
                C4103hA0 c4103hA02 = this.c;
                c4103hA02.E(i6, bArr3);
                interfaceC1584Ub1A.d(this.h, c4103hA02);
                interfaceC1584Ub1A.a(jB, 1, this.h, 0, null);
                return -1;
            }
            if (strH2.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher3 = i.matcher(strH2);
                if (!matcher3.find()) {
                    throw C5643lA0.a(null, "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(strH2));
                }
                Matcher matcher4 = j.matcher(strH2);
                if (!matcher4.find()) {
                    throw C5643lA0.a(null, "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(strH2));
                }
                String strGroup2 = matcher3.group(1);
                strGroup2.getClass();
                jC = AbstractC6525pn1.c(strGroup2);
                String strGroup3 = matcher4.group(1);
                strGroup3.getClass();
                j2 = (Long.parseLong(strGroup3) * 1000000) / 90000;
            }
            strH2 = c4103hA0.h(AbstractC8250yr.c);
        }
    }

    @Override // defpackage.WR
    public final boolean f(XR xr) {
        C7566vF c7566vF = (C7566vF) xr;
        c7566vF.f(this.g, 0, 6, false);
        byte[] bArr = this.g;
        C4103hA0 c4103hA0 = this.c;
        c4103hA0.E(6, bArr);
        if (AbstractC6525pn1.a(c4103hA0)) {
            return true;
        }
        c7566vF.f(this.g, 6, 3, false);
        c4103hA0.E(9, this.g);
        return AbstractC6525pn1.a(c4103hA0);
    }

    @Override // defpackage.WR
    public final void g(long j2, long j3) {
        throw new IllegalStateException();
    }

    @Override // defpackage.WR
    public final List h() {
        N70 n70 = P70.b;
        return C3769fQ0.e;
    }

    @Override // defpackage.WR
    public final void l(YR yr) {
        this.f = this.e ? new C5772lr0(yr, this.d) : yr;
        yr.x(new C4004gf(-9223372036854775807L));
    }

    @Override // defpackage.WR
    public final void release() {
    }
}
