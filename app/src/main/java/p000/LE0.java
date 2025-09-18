package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class LE0 extends AbstractC10847r00 implements InterfaceC10957rr0 {

    /* renamed from: b */
    public int f6555b;

    /* renamed from: c */
    public ME0 f6556c;

    /* renamed from: d */
    public long f6557d;

    /* renamed from: e */
    public float f6558e;

    /* renamed from: f */
    public double f6559f;

    /* renamed from: g */
    public int f6560g;

    /* renamed from: h */
    public int f6561h;

    /* renamed from: i */
    public int f6562i;

    /* renamed from: j */
    public QE0 f6563j;

    /* renamed from: k */
    public List f6564k;

    /* renamed from: l */
    public int f6565l;

    /* renamed from: m */
    public int f6566m;

    /* renamed from: l */
    public static LE0 m4929l() {
        LE0 le0 = new LE0();
        le0.f6556c = ME0.BYTE;
        le0.f6563j = QE0.f9540g;
        le0.f6564k = Collections.emptyList();
        return le0;
    }

    public final Object clone() {
        LE0 le0M4929l = m4929l();
        le0M4929l.m4931m(m4930k());
        return le0M4929l;
    }

    @Override // p000.AbstractC10847r00
    /* renamed from: h */
    public final AbstractC0631K0 mo566h() {
        NE0 ne0M4930k = m4930k();
        if (ne0M4930k.mo131e()) {
            return ne0M4930k;
        }
        throw new C6838sg();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x001b  */
    @Override // p000.AbstractC10847r00
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.AbstractC10847r00 mo567i(p000.C6392lu r3, p000.C0217DR r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            xd0 r1 = p000.NE0.f7653q     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            NE0 r1 = new NE0     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf p000.Y90 -> L11
            r2.m4931m(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            K0 r4 = r3.f14178a     // Catch: java.lang.Throwable -> Lf
            NE0 r4 = (p000.NE0) r4     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.m4931m(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.LE0.mo567i(lu, DR):r00");
    }

    @Override // p000.AbstractC10847r00
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ AbstractC10847r00 mo568j(A00 a00) {
        m4931m((NE0) a00);
        return this;
    }

    /* renamed from: k */
    public final NE0 m4930k() {
        NE0 ne0 = new NE0(this);
        int i = this.f6555b;
        int i2 = (i & 1) != 1 ? 0 : 1;
        ne0.f7656c = this.f6556c;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        ne0.f7657d = this.f6557d;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        ne0.f7658e = this.f6558e;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        ne0.f7659f = this.f6559f;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        ne0.f7660g = this.f6560g;
        if ((i & 32) == 32) {
            i2 |= 32;
        }
        ne0.f7661h = this.f6561h;
        if ((i & 64) == 64) {
            i2 |= 64;
        }
        ne0.f7662i = this.f6562i;
        if ((i & 128) == 128) {
            i2 |= 128;
        }
        ne0.f7663j = this.f6563j;
        if ((i & 256) == 256) {
            this.f6564k = Collections.unmodifiableList(this.f6564k);
            this.f6555b &= -257;
        }
        ne0.f7664k = this.f6564k;
        if ((i & 512) == 512) {
            i2 |= 256;
        }
        ne0.f7665l = this.f6565l;
        if ((i & 1024) == 1024) {
            i2 |= 512;
        }
        ne0.f7666m = this.f6566m;
        ne0.f7655b = i2;
        return ne0;
    }

    /* renamed from: m */
    public final void m4931m(NE0 ne0) {
        QE0 qe0;
        if (ne0 == NE0.f7652p) {
            return;
        }
        if ((ne0.f7655b & 1) == 1) {
            ME0 me0 = ne0.f7656c;
            me0.getClass();
            this.f6555b = 1 | this.f6555b;
            this.f6556c = me0;
        }
        int i = ne0.f7655b;
        if ((i & 2) == 2) {
            long j = ne0.f7657d;
            this.f6555b |= 2;
            this.f6557d = j;
        }
        if ((i & 4) == 4) {
            float f = ne0.f7658e;
            this.f6555b = 4 | this.f6555b;
            this.f6558e = f;
        }
        if ((i & 8) == 8) {
            double d = ne0.f7659f;
            this.f6555b |= 8;
            this.f6559f = d;
        }
        if ((i & 16) == 16) {
            int i2 = ne0.f7660g;
            this.f6555b = 16 | this.f6555b;
            this.f6560g = i2;
        }
        if ((i & 32) == 32) {
            int i3 = ne0.f7661h;
            this.f6555b = 32 | this.f6555b;
            this.f6561h = i3;
        }
        if ((i & 64) == 64) {
            int i4 = ne0.f7662i;
            this.f6555b = 64 | this.f6555b;
            this.f6562i = i4;
        }
        if ((i & 128) == 128) {
            QE0 qe02 = ne0.f7663j;
            if ((this.f6555b & 128) != 128 || (qe0 = this.f6563j) == QE0.f9540g) {
                this.f6563j = qe02;
            } else {
                PE0 pe0 = new PE0(0);
                pe0.f8932d = Collections.emptyList();
                pe0.m6277p(qe0);
                pe0.m6277p(qe02);
                this.f6563j = pe0.m6274l();
            }
            this.f6555b |= 128;
        }
        if (!ne0.f7664k.isEmpty()) {
            if (this.f6564k.isEmpty()) {
                this.f6564k = ne0.f7664k;
                this.f6555b &= -257;
            } else {
                if ((this.f6555b & 256) != 256) {
                    this.f6564k = new ArrayList(this.f6564k);
                    this.f6555b |= 256;
                }
                this.f6564k.addAll(ne0.f7664k);
            }
        }
        int i5 = ne0.f7655b;
        if ((i5 & 256) == 256) {
            int i6 = ne0.f7665l;
            this.f6555b |= 512;
            this.f6565l = i6;
        }
        if ((i5 & 512) == 512) {
            int i7 = ne0.f7666m;
            this.f6555b |= 1024;
            this.f6566m = i7;
        }
        this.f41281a = this.f41281a.m3573d(ne0.f7654a);
    }
}
