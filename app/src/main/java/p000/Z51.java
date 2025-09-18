package p000;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class Z51 implements InterfaceC1412WR {

    /* renamed from: a */
    public final InterfaceC9200e61 f14710a;

    /* renamed from: b */
    public final C6686qX f14711b;

    /* renamed from: c */
    public final ArrayList f14712c;

    /* renamed from: f */
    public InterfaceC8357Ub1 f14715f;

    /* renamed from: g */
    public int f14716g;

    /* renamed from: h */
    public int f14717h;

    /* renamed from: i */
    public long[] f14718i;

    /* renamed from: j */
    public long f14719j;

    /* renamed from: e */
    public byte[] f14714e = AbstractC7485Dh1.f2171f;

    /* renamed from: d */
    public final C9591hA0 f14713d = new C9591hA0();

    public Z51(InterfaceC9200e61 interfaceC9200e61, C6686qX c6686qX) {
        this.f14710a = interfaceC9200e61;
        C6623pX c6623pXM24020a = c6686qX.m24020a();
        c6623pXM24020a.f40161l = AbstractC8544Xr0.m9171n("application/x-media3-cues");
        c6623pXM24020a.f40158i = c6686qX.f40974m;
        c6623pXM24020a.f40146F = interfaceC9200e61.mo4559G();
        this.f14711b = new C6686qX(c6623pXM24020a);
        this.f14712c = new ArrayList();
        this.f14717h = 0;
        this.f14718i = AbstractC7485Dh1.f2172g;
        this.f14719j = -9223372036854775807L;
    }

    /* renamed from: a */
    public final void m9474a(Y51 y51) {
        YN1.m9283h(this.f14715f);
        byte[] bArr = y51.f14158b;
        int length = bArr.length;
        C9591hA0 c9591hA0 = this.f14713d;
        c9591hA0.getClass();
        c9591hA0.m18739E(bArr.length, bArr);
        this.f14715f.mo963d(length, c9591hA0);
        this.f14715f.mo960a(y51.f14157a, 1, length, 0, null);
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: b */
    public final InterfaceC1412WR mo737b() {
        return this;
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: d */
    public final int mo738d(InterfaceC1475XR interfaceC1475XR, C1164SV c1164sv) throws C10103lA0, EOFException, InterruptedIOException {
        int i = this.f14717h;
        YN1.m9281f((i == 0 || i == 5) ? false : true);
        if (this.f14717h == 1) {
            int iM24580b = ((C7000vF) interfaceC1475XR).f44294c != -1 ? AbstractC10983s22.m24580b(((C7000vF) interfaceC1475XR).f44294c) : 1024;
            if (iM24580b > this.f14714e.length) {
                this.f14714e = new byte[iM24580b];
            }
            this.f14716g = 0;
            this.f14717h = 2;
        }
        int i2 = this.f14717h;
        ArrayList arrayList = this.f14712c;
        if (i2 == 2) {
            byte[] bArr = this.f14714e;
            if (bArr.length == this.f14716g) {
                this.f14714e = Arrays.copyOf(bArr, bArr.length + 1024);
            }
            byte[] bArr2 = this.f14714e;
            int i3 = this.f14716g;
            C7000vF c7000vF = (C7000vF) interfaceC1475XR;
            int iMo2367r = c7000vF.mo2367r(bArr2, i3, bArr2.length - i3);
            if (iMo2367r != -1) {
                this.f14716g += iMo2367r;
            }
            long j = c7000vF.f44294c;
            if ((j != -1 && this.f14716g == j) || iMo2367r == -1) {
                try {
                    long j2 = this.f14719j;
                    this.f14710a.mo4562m(this.f14714e, 0, this.f14716g, j2 != -9223372036854775807L ? new C9072d61(j2, true) : C9072d61.f25815c, new C8450Vw0(18, this));
                    Collections.sort(arrayList);
                    this.f14718i = new long[arrayList.size()];
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        this.f14718i[i4] = ((Y51) arrayList.get(i4)).f14157a;
                    }
                    this.f14714e = AbstractC7485Dh1.f2171f;
                    this.f14717h = 4;
                } catch (RuntimeException e) {
                    throw C10103lA0.m22366a(e, "SubtitleParser failed.");
                }
            }
        }
        if (this.f14717h == 3) {
            if (((C7000vF) interfaceC1475XR).m25379i(((C7000vF) interfaceC1475XR).f44294c != -1 ? AbstractC10983s22.m24580b(((C7000vF) interfaceC1475XR).f44294c) : 1024) == -1) {
                long j3 = this.f14719j;
                for (int iM1821f = j3 == -9223372036854775807L ? 0 : AbstractC7485Dh1.m1821f(this.f14718i, j3, true); iM1821f < arrayList.size(); iM1821f++) {
                    m9474a((Y51) arrayList.get(iM1821f));
                }
                this.f14717h = 4;
            }
        }
        return this.f14717h == 4 ? -1 : 0;
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: f */
    public final boolean mo739f(InterfaceC1475XR interfaceC1475XR) {
        return true;
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: g */
    public final void mo740g(long j, long j2) {
        int i = this.f14717h;
        YN1.m9281f((i == 0 || i == 5) ? false : true);
        this.f14719j = j2;
        if (this.f14717h == 2) {
            this.f14717h = 1;
        }
        if (this.f14717h == 4) {
            this.f14717h = 3;
        }
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
        YN1.m9281f(this.f14717h == 0);
        InterfaceC8357Ub1 interfaceC8357Ub1Mo2005w = interfaceC1538YR.mo2005w(0, 3);
        this.f14715f = interfaceC8357Ub1Mo2005w;
        interfaceC8357Ub1Mo2005w.mo965f(this.f14711b);
        interfaceC1538YR.mo2003p();
        interfaceC1538YR.mo2006x(new C9459g80(-9223372036854775807L, new long[]{0}, new long[]{0}));
        this.f14717h = 1;
    }

    @Override // p000.InterfaceC1412WR
    public final void release() {
        if (this.f14717h == 5) {
            return;
        }
        this.f14710a.mo4560d();
        this.f14717h = 5;
    }
}
