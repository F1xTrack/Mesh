package p000;

import android.net.Uri;
import java.io.EOFException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: j30, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9832j30 extends AbstractC7498Do0 {

    /* renamed from: L */
    public static final AtomicInteger f34866L = new AtomicInteger();

    /* renamed from: A */
    public final boolean f34867A;

    /* renamed from: B */
    public final boolean f34868B;

    /* renamed from: C */
    public C4198hk f34869C;

    /* renamed from: D */
    public E30 f34870D;

    /* renamed from: E */
    public int f34871E;

    /* renamed from: F */
    public boolean f34872F;

    /* renamed from: G */
    public volatile boolean f34873G;

    /* renamed from: H */
    public boolean f34874H;

    /* renamed from: I */
    public C9367fQ0 f34875I;

    /* renamed from: J */
    public boolean f34876J;

    /* renamed from: K */
    public boolean f34877K;

    /* renamed from: k */
    public final int f34878k;

    /* renamed from: l */
    public final int f34879l;

    /* renamed from: m */
    public final Uri f34880m;

    /* renamed from: n */
    public final boolean f34881n;

    /* renamed from: o */
    public final int f34882o;

    /* renamed from: p */
    public final InterfaceC1586ZC f34883p;

    /* renamed from: q */
    public final C3976eD f34884q;

    /* renamed from: r */
    public final C4198hk f34885r;

    /* renamed from: s */
    public final boolean f34886s;

    /* renamed from: t */
    public final boolean f34887t;

    /* renamed from: u */
    public final C7783Ja1 f34888u;

    /* renamed from: v */
    public final C0142CF f34889v;

    /* renamed from: w */
    public final List f34890w;

    /* renamed from: x */
    public final C0589JL f34891x;

    /* renamed from: y */
    public final U50 f34892y;

    /* renamed from: z */
    public final C9591hA0 f34893z;

    public C9832j30(C0142CF c0142cf, InterfaceC1586ZC interfaceC1586ZC, C3976eD c3976eD, C6686qX c6686qX, boolean z, InterfaceC1586ZC interfaceC1586ZC2, C3976eD c3976eD2, boolean z2, Uri uri, List list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, C7783Ja1 c7783Ja1, C0589JL c0589jl, C4198hk c4198hk, U50 u50, C9591hA0 c9591hA0, boolean z6, NB0 nb0) {
        super(interfaceC1586ZC, c3976eD, c6686qX, i, obj, j, j2, j3);
        this.f34867A = z;
        this.f34882o = i2;
        this.f34877K = z3;
        this.f34879l = i3;
        this.f34884q = c3976eD2;
        this.f34883p = interfaceC1586ZC2;
        this.f34872F = c3976eD2 != null;
        this.f34868B = z2;
        this.f34880m = uri;
        this.f34886s = z5;
        this.f34888u = c7783Ja1;
        this.f34887t = z4;
        this.f34889v = c0142cf;
        this.f34890w = list;
        this.f34891x = c0589jl;
        this.f34885r = c4198hk;
        this.f34892y = u50;
        this.f34893z = c9591hA0;
        this.f34881n = z6;
        N70 n70 = P70.f8867b;
        this.f34875I = C9367fQ0.f27184e;
        this.f34878k = f34866L.getAndIncrement();
    }

    /* renamed from: d */
    public static byte[] m21971d(String str) {
        if (PN1.m6357c(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @Override // p000.AbstractC7498Do0
    /* renamed from: b */
    public final boolean mo1899b() {
        throw null;
    }

    /* renamed from: c */
    public final void m21972c(InterfaceC1586ZC interfaceC1586ZC, C3976eD c3976eD, boolean z, boolean z2) {
        C3976eD c3976eDM17881d;
        long j;
        long j2;
        if (z) {
            z = this.f34871E != 0;
            c3976eDM17881d = c3976eD;
        } else {
            c3976eDM17881d = c3976eD.m17881d(this.f34871E);
        }
        try {
            C7000vF c7000vFM21974g = m21974g(interfaceC1586ZC, c3976eDM17881d, z2);
            if (z) {
                c7000vFM21974g.mo3627n(this.f34871E);
            }
            while (!this.f34873G) {
                try {
                    try {
                        if (((InterfaceC1412WR) this.f34869C.f28554b).mo738d(c7000vFM21974g, C4198hk.f28552f) != 0) {
                            break;
                        }
                    } catch (EOFException e) {
                        if ((this.f9814d.f40967f & 16384) == 0) {
                            throw e;
                        }
                        ((InterfaceC1412WR) this.f34869C.f28554b).mo740g(0L, 0L);
                        j = c7000vFM21974g.f44295d;
                        j2 = c3976eD.f26600f;
                    }
                } catch (Throwable th) {
                    this.f34871E = (int) (c7000vFM21974g.f44295d - c3976eD.f26600f);
                    throw th;
                }
            }
            j = c7000vFM21974g.f44295d;
            j2 = c3976eD.f26600f;
            this.f34871E = (int) (j - j2);
        } finally {
            AbstractC9770iZ1.m19065b(interfaceC1586ZC);
        }
    }

    @Override // p000.InterfaceC10175lk0
    /* renamed from: e */
    public final void mo388e() {
        C4198hk c4198hk;
        this.f34870D.getClass();
        if (this.f34869C == null && (c4198hk = this.f34885r) != null) {
            InterfaceC1412WR interfaceC1412WRMo737b = ((InterfaceC1412WR) c4198hk.f28554b).mo737b();
            if ((interfaceC1412WRMo737b instanceof C9778id1) || (interfaceC1412WRMo737b instanceof C0665KY)) {
                this.f34869C = this.f34885r;
                this.f34872F = false;
            }
        }
        if (this.f34872F) {
            InterfaceC1586ZC interfaceC1586ZC = this.f34883p;
            interfaceC1586ZC.getClass();
            C3976eD c3976eD = this.f34884q;
            c3976eD.getClass();
            m21972c(interfaceC1586ZC, c3976eD, this.f34868B, false);
            this.f34871E = 0;
            this.f34872F = false;
        }
        if (this.f34873G) {
            return;
        }
        if (!this.f34887t) {
            m21972c(this.f9819i, this.f9812b, this.f34867A, true);
        }
        this.f34874H = !this.f34873G;
    }

    /* renamed from: f */
    public final int m21973f(int i) {
        YN1.m9281f(!this.f34881n);
        if (i >= this.f34875I.size()) {
            return 0;
        }
        return ((Integer) this.f34875I.get(i)).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0160  */
    /* JADX WARN: Type inference failed for: r10v21, types: [Bv0] */
    /* JADX WARN: Type inference failed for: r10v6, types: [Bv0] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.C7000vF m21974g(p000.InterfaceC1586ZC r36, p000.C3976eD r37, boolean r38) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1029
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C9832j30.m21974g(ZC, eD, boolean):vF");
    }

    @Override // p000.InterfaceC10175lk0
    /* renamed from: s */
    public final void mo402s() {
        this.f34873G = true;
    }
}
