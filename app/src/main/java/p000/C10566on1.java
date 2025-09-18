package p000;

import android.text.TextUtils;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: on1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10566on1 implements InterfaceC1412WR {

    /* renamed from: i */
    public static final Pattern f39261i = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: j */
    public static final Pattern f39262j = Pattern.compile("MPEGTS:(-?\\d+)");

    /* renamed from: a */
    public final String f39263a;

    /* renamed from: b */
    public final C7783Ja1 f39264b;

    /* renamed from: d */
    public final C7408Bv0 f39266d;

    /* renamed from: e */
    public final boolean f39267e;

    /* renamed from: f */
    public InterfaceC1538YR f39268f;

    /* renamed from: h */
    public int f39270h;

    /* renamed from: c */
    public final C9591hA0 f39265c = new C9591hA0();

    /* renamed from: g */
    public byte[] f39269g = new byte[1024];

    public C10566on1(String str, C7783Ja1 c7783Ja1, C7408Bv0 c7408Bv0, boolean z) {
        this.f39263a = str;
        this.f39264b = c7783Ja1;
        this.f39266d = c7408Bv0;
        this.f39267e = z;
    }

    /* renamed from: a */
    public final InterfaceC8357Ub1 m23558a(long j) {
        InterfaceC8357Ub1 interfaceC8357Ub1Mo2005w = this.f39268f.mo2005w(0, 3);
        C6623pX c6623pX = new C6623pX();
        c6623pX.f40161l = AbstractC8544Xr0.m9171n("text/vtt");
        c6623pX.f40153d = this.f39263a;
        c6623pX.f40166q = j;
        F91.m2512B(c6623pX, interfaceC8357Ub1Mo2005w);
        this.f39268f.mo2003p();
        return interfaceC8357Ub1Mo2005w;
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: b */
    public final InterfaceC1412WR mo737b() {
        return this;
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: d */
    public final int mo738d(InterfaceC1475XR interfaceC1475XR, C1164SV c1164sv) throws C10103lA0, EOFException, InterruptedIOException {
        String strM18750h;
        this.f39268f.getClass();
        int i = (int) ((C7000vF) interfaceC1475XR).f44294c;
        int i2 = this.f39270h;
        byte[] bArr = this.f39269g;
        if (i2 == bArr.length) {
            this.f39269g = Arrays.copyOf(bArr, ((i != -1 ? i : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f39269g;
        int i3 = this.f39270h;
        int iMo2367r = ((C7000vF) interfaceC1475XR).mo2367r(bArr2, i3, bArr2.length - i3);
        if (iMo2367r != -1) {
            int i4 = this.f39270h + iMo2367r;
            this.f39270h = i4;
            if (i == -1 || i4 != i) {
                return 0;
            }
        }
        C9591hA0 c9591hA0 = new C9591hA0(this.f39269g);
        AbstractC10694pn1.m23881d(c9591hA0);
        String strM18750h2 = c9591hA0.m18750h(AbstractC7227yr.f46511c);
        long j = 0;
        long jM23880c = 0;
        while (true) {
            Matcher matcher = null;
            if (TextUtils.isEmpty(strM18750h2)) {
                while (true) {
                    String strM18750h3 = c9591hA0.m18750h(AbstractC7227yr.f46511c);
                    if (strM18750h3 == null) {
                        break;
                    }
                    if (AbstractC10694pn1.f40393a.matcher(strM18750h3).matches()) {
                        do {
                            strM18750h = c9591hA0.m18750h(AbstractC7227yr.f46511c);
                            if (strM18750h != null) {
                            }
                        } while (!strM18750h.isEmpty());
                    } else {
                        Matcher matcher2 = AbstractC10438nn1.f38508a.matcher(strM18750h3);
                        if (matcher2.matches()) {
                            matcher = matcher2;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    m23558a(0L);
                    return -1;
                }
                String strGroup = matcher.group(1);
                strGroup.getClass();
                long jM23880c2 = AbstractC10694pn1.m23880c(strGroup);
                long jM4351b = this.f39264b.m4351b(((((j + jM23880c2) - jM23880c) * 90000) / 1000000) % 8589934592L);
                InterfaceC8357Ub1 interfaceC8357Ub1M23558a = m23558a(jM4351b - jM23880c2);
                byte[] bArr3 = this.f39269g;
                int i5 = this.f39270h;
                C9591hA0 c9591hA02 = this.f39265c;
                c9591hA02.m18739E(i5, bArr3);
                interfaceC8357Ub1M23558a.mo963d(this.f39270h, c9591hA02);
                interfaceC8357Ub1M23558a.mo960a(jM4351b, 1, this.f39270h, 0, null);
                return -1;
            }
            if (strM18750h2.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher3 = f39261i.matcher(strM18750h2);
                if (!matcher3.find()) {
                    throw C10103lA0.m22366a(null, "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(strM18750h2));
                }
                Matcher matcher4 = f39262j.matcher(strM18750h2);
                if (!matcher4.find()) {
                    throw C10103lA0.m22366a(null, "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(strM18750h2));
                }
                String strGroup2 = matcher3.group(1);
                strGroup2.getClass();
                jM23880c = AbstractC10694pn1.m23880c(strGroup2);
                String strGroup3 = matcher4.group(1);
                strGroup3.getClass();
                j = (Long.parseLong(strGroup3) * 1000000) / 90000;
            }
            strM18750h2 = c9591hA0.m18750h(AbstractC7227yr.f46511c);
        }
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: f */
    public final boolean mo739f(InterfaceC1475XR interfaceC1475XR) {
        C7000vF c7000vF = (C7000vF) interfaceC1475XR;
        c7000vF.mo3620f(this.f39269g, 0, 6, false);
        byte[] bArr = this.f39269g;
        C9591hA0 c9591hA0 = this.f39265c;
        c9591hA0.m18739E(6, bArr);
        if (AbstractC10694pn1.m23878a(c9591hA0)) {
            return true;
        }
        c7000vF.mo3620f(this.f39269g, 6, 3, false);
        c9591hA0.m18739E(9, this.f39269g);
        return AbstractC10694pn1.m23878a(c9591hA0);
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: g */
    public final void mo740g(long j, long j2) {
        throw new IllegalStateException();
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: h */
    public final List mo741h() {
        N70 n70 = P70.f8867b;
        return C9367fQ0.f27184e;
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: l */
    public final void mo742l(InterfaceC1538YR interfaceC1538YR) {
        this.f39268f = this.f39267e ? new C10189lr0(interfaceC1538YR, this.f39266d) : interfaceC1538YR;
        interfaceC1538YR.mo2006x(new C4130gf(-9223372036854775807L));
    }

    @Override // p000.InterfaceC1412WR
    public final void release() {
    }
}
