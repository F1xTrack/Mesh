package p000;

import com.facebook.crypto.mac.NativeMac;
import io.appmetrica.analytics.impl.C5043c9;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: qF0 */
/* loaded from: classes2.dex */
public final class C10753qF0 extends AbstractC11487w00 {

    /* renamed from: u */
    public static final C10753qF0 f40684u;

    /* renamed from: v */
    public static final C11695xd0 f40685v = new C11695xd0(17);

    /* renamed from: b */
    public final AbstractC0488Hk f40686b;

    /* renamed from: c */
    public int f40687c;

    /* renamed from: d */
    public int f40688d;

    /* renamed from: e */
    public int f40689e;

    /* renamed from: f */
    public int f40690f;

    /* renamed from: g */
    public AF0 f40691g;

    /* renamed from: h */
    public int f40692h;

    /* renamed from: i */
    public List f40693i;

    /* renamed from: j */
    public AF0 f40694j;

    /* renamed from: k */
    public int f40695k;

    /* renamed from: l */
    public List f40696l;

    /* renamed from: m */
    public List f40697m;

    /* renamed from: n */
    public int f40698n;

    /* renamed from: o */
    public IF0 f40699o;

    /* renamed from: p */
    public int f40700p;

    /* renamed from: q */
    public int f40701q;

    /* renamed from: r */
    public List f40702r;

    /* renamed from: s */
    public byte f40703s;

    /* renamed from: t */
    public int f40704t;

    static {
        C10753qF0 c10753qF0 = new C10753qF0();
        f40684u = c10753qF0;
        c10753qF0.m23958q();
    }

    public C10753qF0(C10625pF0 c10625pF0) {
        super(c10625pF0);
        this.f40698n = -1;
        this.f40703s = (byte) -1;
        this.f40704t = -1;
        this.f40686b = c10625pF0.f41281a;
    }

    @Override // p000.InterfaceC10957rr0
    /* renamed from: a */
    public final AbstractC0631K0 mo127a() {
        return f40684u;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: b */
    public final int mo128b() {
        int i = this.f40704t;
        if (i != -1) {
            return i;
        }
        int iM4205e = (this.f40687c & 2) == 2 ? C0577J9.m4205e(1, this.f40689e) : 0;
        if ((this.f40687c & 4) == 4) {
            iM4205e += C0577J9.m4205e(2, this.f40690f);
        }
        if ((this.f40687c & 8) == 8) {
            iM4205e += C0577J9.m4207g(3, this.f40691g);
        }
        for (int i2 = 0; i2 < this.f40693i.size(); i2++) {
            iM4205e += C0577J9.m4207g(4, (AbstractC0631K0) this.f40693i.get(i2));
        }
        if ((this.f40687c & 32) == 32) {
            iM4205e += C0577J9.m4207g(5, this.f40694j);
        }
        if ((this.f40687c & 128) == 128) {
            iM4205e += C0577J9.m4207g(6, this.f40699o);
        }
        if ((this.f40687c & 256) == 256) {
            iM4205e += C0577J9.m4205e(7, this.f40700p);
        }
        if ((this.f40687c & 512) == 512) {
            iM4205e += C0577J9.m4205e(8, this.f40701q);
        }
        if ((this.f40687c & 16) == 16) {
            iM4205e += C0577J9.m4205e(9, this.f40692h);
        }
        if ((this.f40687c & 64) == 64) {
            iM4205e += C0577J9.m4205e(10, this.f40695k);
        }
        if ((this.f40687c & 1) == 1) {
            iM4205e += C0577J9.m4205e(11, this.f40688d);
        }
        for (int i3 = 0; i3 < this.f40696l.size(); i3++) {
            iM4205e += C0577J9.m4207g(12, (AbstractC0631K0) this.f40696l.get(i3));
        }
        int iM4206f = 0;
        for (int i4 = 0; i4 < this.f40697m.size(); i4++) {
            iM4206f += C0577J9.m4206f(((Integer) this.f40697m.get(i4)).intValue());
        }
        int iM4206f2 = iM4205e + iM4206f;
        if (!this.f40697m.isEmpty()) {
            iM4206f2 = iM4206f2 + 1 + C0577J9.m4206f(iM4206f);
        }
        this.f40698n = iM4206f;
        int iM4206f3 = 0;
        for (int i5 = 0; i5 < this.f40702r.size(); i5++) {
            iM4206f3 += C0577J9.m4206f(((Integer) this.f40702r.get(i5)).intValue());
        }
        int size = this.f40686b.size() + m25536j() + (this.f40702r.size() * 2) + iM4206f2 + iM4206f3;
        this.f40704t = size;
        return size;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: c */
    public final AbstractC10847r00 mo129c() {
        return C10625pF0.m23665m();
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: d */
    public final AbstractC10847r00 mo130d() {
        C10625pF0 c10625pF0M23665m = C10625pF0.m23665m();
        c10625pF0M23665m.m23667n(this);
        return c10625pF0M23665m;
    }

    @Override // p000.InterfaceC10957rr0
    /* renamed from: e */
    public final boolean mo131e() {
        byte b = this.f40703s;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.f40687c;
        if ((i & 4) != 4) {
            this.f40703s = (byte) 0;
            return false;
        }
        if ((i & 8) == 8 && !this.f40691g.mo131e()) {
            this.f40703s = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.f40693i.size(); i2++) {
            if (!((FF0) this.f40693i.get(i2)).mo131e()) {
                this.f40703s = (byte) 0;
                return false;
            }
        }
        if (m23957p() && !this.f40694j.mo131e()) {
            this.f40703s = (byte) 0;
            return false;
        }
        for (int i3 = 0; i3 < this.f40696l.size(); i3++) {
            if (!((AF0) this.f40696l.get(i3)).mo131e()) {
                this.f40703s = (byte) 0;
                return false;
            }
        }
        if ((this.f40687c & 128) == 128 && !this.f40699o.mo131e()) {
            this.f40703s = (byte) 0;
            return false;
        }
        if (m25535i()) {
            this.f40703s = (byte) 1;
            return true;
        }
        this.f40703s = (byte) 0;
        return false;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: f */
    public final void mo132f(C0577J9 c0577j9) throws IOException {
        mo128b();
        C9108dO1 c9108dO1 = new C9108dO1(this);
        if ((this.f40687c & 2) == 2) {
            c0577j9.m4233w(1, this.f40689e);
        }
        if ((this.f40687c & 4) == 4) {
            c0577j9.m4233w(2, this.f40690f);
        }
        if ((this.f40687c & 8) == 8) {
            c0577j9.m4235y(3, this.f40691g);
        }
        for (int i = 0; i < this.f40693i.size(); i++) {
            c0577j9.m4235y(4, (AbstractC0631K0) this.f40693i.get(i));
        }
        if ((this.f40687c & 32) == 32) {
            c0577j9.m4235y(5, this.f40694j);
        }
        if ((this.f40687c & 128) == 128) {
            c0577j9.m4235y(6, this.f40699o);
        }
        if ((this.f40687c & 256) == 256) {
            c0577j9.m4233w(7, this.f40700p);
        }
        if ((this.f40687c & 512) == 512) {
            c0577j9.m4233w(8, this.f40701q);
        }
        if ((this.f40687c & 16) == 16) {
            c0577j9.m4233w(9, this.f40692h);
        }
        if ((this.f40687c & 64) == 64) {
            c0577j9.m4233w(10, this.f40695k);
        }
        if ((this.f40687c & 1) == 1) {
            c0577j9.m4233w(11, this.f40688d);
        }
        for (int i2 = 0; i2 < this.f40696l.size(); i2++) {
            c0577j9.m4235y(12, (AbstractC0631K0) this.f40696l.get(i2));
        }
        if (this.f40697m.size() > 0) {
            c0577j9.m4218F(106);
            c0577j9.m4218F(this.f40698n);
        }
        for (int i3 = 0; i3 < this.f40697m.size(); i3++) {
            c0577j9.m4234x(((Integer) this.f40697m.get(i3)).intValue());
        }
        for (int i4 = 0; i4 < this.f40702r.size(); i4++) {
            c0577j9.m4233w(31, ((Integer) this.f40702r.get(i4)).intValue());
        }
        c9108dO1.m17570K(19000, c0577j9);
        c0577j9.m4214B(this.f40686b);
    }

    /* renamed from: p */
    public final boolean m23957p() {
        return (this.f40687c & 32) == 32;
    }

    /* renamed from: q */
    public final void m23958q() {
        this.f40688d = 518;
        this.f40689e = 2054;
        this.f40690f = 0;
        AF0 af0 = AF0.f123t;
        this.f40691g = af0;
        this.f40692h = 0;
        this.f40693i = Collections.emptyList();
        this.f40694j = af0;
        this.f40695k = 0;
        this.f40696l = Collections.emptyList();
        this.f40697m = Collections.emptyList();
        this.f40699o = IF0.f4860l;
        this.f40700p = 0;
        this.f40701q = 0;
        this.f40702r = Collections.emptyList();
    }

    public C10753qF0() {
        this.f40698n = -1;
        this.f40703s = (byte) -1;
        this.f40704t = -1;
        this.f40686b = AbstractC0488Hk.f4481a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public C10753qF0(C6392lu c6392lu, C0217DR c0217dr) {
        this.f40698n = -1;
        this.f40703s = (byte) -1;
        this.f40704t = -1;
        m23958q();
        C0425Gk c0425Gk = new C0425Gk();
        C0577J9 c0577j9M4212n = C0577J9.m4212n(c0425Gk, 1);
        boolean z = false;
        char c = 0;
        while (true) {
            ?? M25540n = 256;
            if (!z) {
                try {
                    try {
                        int iM22586n = c6392lu.m22586n();
                        C11901zF0 c11901zF0M126r = null;
                        HF0 hf0 = null;
                        C11901zF0 c11901zF0M126r2 = null;
                        switch (iM22586n) {
                            case 0:
                                z = true;
                            case 8:
                                this.f40687c |= 2;
                                this.f40689e = c6392lu.m22583k();
                            case 16:
                                this.f40687c |= 4;
                                this.f40690f = c6392lu.m22583k();
                            case 26:
                                if ((this.f40687c & 8) == 8) {
                                    AF0 af0 = this.f40691g;
                                    af0.getClass();
                                    c11901zF0M126r = AF0.m126r(af0);
                                }
                                AF0 af02 = (AF0) c6392lu.m22579g(AF0.f124u, c0217dr);
                                this.f40691g = af02;
                                if (c11901zF0M126r != null) {
                                    c11901zF0M126r.m26352n(af02);
                                    this.f40691g = c11901zF0M126r.m26351l();
                                }
                                this.f40687c |= 8;
                            case 34:
                                int i = (c == true ? 1 : 0) & 32;
                                c = c;
                                if (i != 32) {
                                    this.f40693i = new ArrayList();
                                    c = (c == true ? 1 : 0) | ' ';
                                }
                                this.f40693i.add(c6392lu.m22579g(FF0.f3112n, c0217dr));
                            case C5043c9.f31377M /* 42 */:
                                if ((this.f40687c & 32) == 32) {
                                    AF0 af03 = this.f40694j;
                                    af03.getClass();
                                    c11901zF0M126r2 = AF0.m126r(af03);
                                }
                                AF0 af04 = (AF0) c6392lu.m22579g(AF0.f124u, c0217dr);
                                this.f40694j = af04;
                                if (c11901zF0M126r2 != null) {
                                    c11901zF0M126r2.m26352n(af04);
                                    this.f40694j = c11901zF0M126r2.m26351l();
                                }
                                this.f40687c |= 32;
                            case 50:
                                if ((this.f40687c & 128) == 128) {
                                    IF0 if0 = this.f40699o;
                                    if0.getClass();
                                    hf0 = new HF0();
                                    AF0 af05 = AF0.f123t;
                                    hf0.f4196g = af05;
                                    hf0.f4198i = af05;
                                    hf0.m3336m(if0);
                                }
                                IF0 if02 = (IF0) c6392lu.m22579g(IF0.f4861m, c0217dr);
                                this.f40699o = if02;
                                if (hf0 != null) {
                                    hf0.m3336m(if02);
                                    this.f40699o = hf0.m3335l();
                                }
                                this.f40687c |= 128;
                            case 56:
                                this.f40687c |= 256;
                                this.f40700p = c6392lu.m22583k();
                            case NativeMac.KEY_LENGTH /* 64 */:
                                this.f40687c |= 512;
                                this.f40701q = c6392lu.m22583k();
                            case 72:
                                this.f40687c |= 16;
                                this.f40692h = c6392lu.m22583k();
                            case 80:
                                this.f40687c |= 64;
                                this.f40695k = c6392lu.m22583k();
                            case 88:
                                this.f40687c |= 1;
                                this.f40688d = c6392lu.m22583k();
                            case 98:
                                int i2 = (c == true ? 1 : 0) & 256;
                                c = c;
                                if (i2 != 256) {
                                    this.f40696l = new ArrayList();
                                    c = (c == true ? 1 : 0) | 256;
                                }
                                this.f40696l.add(c6392lu.m22579g(AF0.f124u, c0217dr));
                            case 104:
                                int i3 = (c == true ? 1 : 0) & 512;
                                c = c;
                                if (i3 != 512) {
                                    this.f40697m = new ArrayList();
                                    c = (c == true ? 1 : 0) | 512;
                                }
                                this.f40697m.add(Integer.valueOf(c6392lu.m22583k()));
                            case 106:
                                int iM22576d = c6392lu.m22576d(c6392lu.m22583k());
                                int i4 = (c == true ? 1 : 0) & 512;
                                c = c;
                                if (i4 != 512) {
                                    c = c;
                                    if (c6392lu.m22574b() > 0) {
                                        this.f40697m = new ArrayList();
                                        c = (c == true ? 1 : 0) | 512;
                                    }
                                }
                                while (c6392lu.m22574b() > 0) {
                                    this.f40697m.add(Integer.valueOf(c6392lu.m22583k()));
                                }
                                c6392lu.m22575c(iM22576d);
                            case 248:
                                int i5 = (c == true ? 1 : 0) & 8192;
                                c = c;
                                if (i5 != 8192) {
                                    this.f40702r = new ArrayList();
                                    c = (c == true ? 1 : 0) | 8192;
                                }
                                this.f40702r.add(Integer.valueOf(c6392lu.m22583k()));
                            case 250:
                                int iM22576d2 = c6392lu.m22576d(c6392lu.m22583k());
                                int i6 = (c == true ? 1 : 0) & 8192;
                                c = c;
                                if (i6 != 8192) {
                                    c = c;
                                    if (c6392lu.m22574b() > 0) {
                                        this.f40702r = new ArrayList();
                                        c = (c == true ? 1 : 0) | 8192;
                                    }
                                }
                                while (c6392lu.m22574b() > 0) {
                                    this.f40702r.add(Integer.valueOf(c6392lu.m22583k()));
                                }
                                c6392lu.m22575c(iM22576d2);
                            default:
                                M25540n = m25540n(c6392lu, c0577j9M4212n, c0217dr, iM22586n);
                                if (M25540n == 0) {
                                    z = true;
                                }
                        }
                    } catch (Y90 e) {
                        e.f14178a = this;
                        throw e;
                    } catch (IOException e2) {
                        Y90 y90 = new Y90(e2.getMessage());
                        y90.f14178a = this;
                        throw y90;
                    }
                } catch (Throwable th) {
                    if (((c == true ? 1 : 0) & 32) == 32) {
                        this.f40693i = Collections.unmodifiableList(this.f40693i);
                    }
                    if (((c == true ? 1 : 0) & 256) == M25540n) {
                        this.f40696l = Collections.unmodifiableList(this.f40696l);
                    }
                    if (((c == true ? 1 : 0) & 512) == 512) {
                        this.f40697m = Collections.unmodifiableList(this.f40697m);
                    }
                    if (((c == true ? 1 : 0) & 8192) == 8192) {
                        this.f40702r = Collections.unmodifiableList(this.f40702r);
                    }
                    try {
                        c0577j9M4212n.m4224m();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f40686b = c0425Gk.m3146n();
                        throw th2;
                    }
                    this.f40686b = c0425Gk.m3146n();
                    m25539m();
                    throw th;
                }
            } else {
                if (((c == true ? 1 : 0) & 32) == 32) {
                    this.f40693i = Collections.unmodifiableList(this.f40693i);
                }
                if (((c == true ? 1 : 0) & 256) == 256) {
                    this.f40696l = Collections.unmodifiableList(this.f40696l);
                }
                if (((c == true ? 1 : 0) & 512) == 512) {
                    this.f40697m = Collections.unmodifiableList(this.f40697m);
                }
                if (((c == true ? 1 : 0) & 8192) == 8192) {
                    this.f40702r = Collections.unmodifiableList(this.f40702r);
                }
                try {
                    c0577j9M4212n.m4224m();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f40686b = c0425Gk.m3146n();
                    throw th3;
                }
                this.f40686b = c0425Gk.m3146n();
                m25539m();
                return;
            }
        }
    }
}
