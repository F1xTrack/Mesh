package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class VE0 extends AbstractC11487w00 {

    /* renamed from: i */
    public static final VE0 f12450i;

    /* renamed from: j */
    public static final C11695xd0 f12451j = new C11695xd0(9);

    /* renamed from: b */
    public final AbstractC0488Hk f12452b;

    /* renamed from: c */
    public int f12453c;

    /* renamed from: d */
    public int f12454d;

    /* renamed from: e */
    public List f12455e;

    /* renamed from: f */
    public List f12456f;

    /* renamed from: g */
    public byte f12457g;

    /* renamed from: h */
    public int f12458h;

    static {
        VE0 ve0 = new VE0();
        f12450i = ve0;
        ve0.f12454d = 6;
        ve0.f12455e = Collections.emptyList();
        ve0.f12456f = Collections.emptyList();
    }

    public VE0(UE0 ue0) {
        super(ue0);
        this.f12457g = (byte) -1;
        this.f12458h = -1;
        this.f12452b = ue0.f41281a;
    }

    @Override // p000.InterfaceC10957rr0
    /* renamed from: a */
    public final AbstractC0631K0 mo127a() {
        return f12450i;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: b */
    public final int mo128b() {
        int i = this.f12458h;
        if (i != -1) {
            return i;
        }
        int iM4205e = (this.f12453c & 1) == 1 ? C0577J9.m4205e(1, this.f12454d) : 0;
        for (int i2 = 0; i2 < this.f12455e.size(); i2++) {
            iM4205e += C0577J9.m4207g(2, (AbstractC0631K0) this.f12455e.get(i2));
        }
        int iM4206f = 0;
        for (int i3 = 0; i3 < this.f12456f.size(); i3++) {
            iM4206f += C0577J9.m4206f(((Integer) this.f12456f.get(i3)).intValue());
        }
        int size = this.f12452b.size() + m25536j() + (this.f12456f.size() * 2) + iM4205e + iM4206f;
        this.f12458h = size;
        return size;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: c */
    public final AbstractC10847r00 mo129c() {
        return UE0.m7946m();
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: d */
    public final AbstractC10847r00 mo130d() {
        UE0 ue0M7946m = UE0.m7946m();
        ue0M7946m.m7948n(this);
        return ue0M7946m;
    }

    @Override // p000.InterfaceC10957rr0
    /* renamed from: e */
    public final boolean mo131e() {
        byte b = this.f12457g;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f12455e.size(); i++) {
            if (!((IF0) this.f12455e.get(i)).mo131e()) {
                this.f12457g = (byte) 0;
                return false;
            }
        }
        if (m25535i()) {
            this.f12457g = (byte) 1;
            return true;
        }
        this.f12457g = (byte) 0;
        return false;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: f */
    public final void mo132f(C0577J9 c0577j9) throws IOException {
        mo128b();
        C9108dO1 c9108dO1 = new C9108dO1(this);
        if ((this.f12453c & 1) == 1) {
            c0577j9.m4233w(1, this.f12454d);
        }
        for (int i = 0; i < this.f12455e.size(); i++) {
            c0577j9.m4235y(2, (AbstractC0631K0) this.f12455e.get(i));
        }
        for (int i2 = 0; i2 < this.f12456f.size(); i2++) {
            c0577j9.m4233w(31, ((Integer) this.f12456f.get(i2)).intValue());
        }
        c9108dO1.m17570K(19000, c0577j9);
        c0577j9.m4214B(this.f12452b);
    }

    public VE0() {
        this.f12457g = (byte) -1;
        this.f12458h = -1;
        this.f12452b = AbstractC0488Hk.f4481a;
    }

    public VE0(C6392lu c6392lu, C0217DR c0217dr) {
        this.f12457g = (byte) -1;
        this.f12458h = -1;
        this.f12454d = 6;
        this.f12455e = Collections.emptyList();
        this.f12456f = Collections.emptyList();
        C0425Gk c0425Gk = new C0425Gk();
        C0577J9 c0577j9M4212n = C0577J9.m4212n(c0425Gk, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    int iM22586n = c6392lu.m22586n();
                    if (iM22586n != 0) {
                        if (iM22586n == 8) {
                            this.f12453c |= 1;
                            this.f12454d = c6392lu.m22583k();
                        } else if (iM22586n == 18) {
                            if ((i & 2) != 2) {
                                this.f12455e = new ArrayList();
                                i |= 2;
                            }
                            this.f12455e.add(c6392lu.m22579g(IF0.f4861m, c0217dr));
                        } else if (iM22586n == 248) {
                            if ((i & 4) != 4) {
                                this.f12456f = new ArrayList();
                                i |= 4;
                            }
                            this.f12456f.add(Integer.valueOf(c6392lu.m22583k()));
                        } else if (iM22586n != 250) {
                            if (!m25540n(c6392lu, c0577j9M4212n, c0217dr, iM22586n)) {
                            }
                        } else {
                            int iM22576d = c6392lu.m22576d(c6392lu.m22583k());
                            if ((i & 4) != 4 && c6392lu.m22574b() > 0) {
                                this.f12456f = new ArrayList();
                                i |= 4;
                            }
                            while (c6392lu.m22574b() > 0) {
                                this.f12456f.add(Integer.valueOf(c6392lu.m22583k()));
                            }
                            c6392lu.m22575c(iM22576d);
                        }
                    }
                    z = true;
                } catch (Y90 e) {
                    e.f14178a = this;
                    throw e;
                } catch (IOException e2) {
                    Y90 y90 = new Y90(e2.getMessage());
                    y90.f14178a = this;
                    throw y90;
                }
            } catch (Throwable th) {
                if ((i & 2) == 2) {
                    this.f12455e = Collections.unmodifiableList(this.f12455e);
                }
                if ((i & 4) == 4) {
                    this.f12456f = Collections.unmodifiableList(this.f12456f);
                }
                try {
                    c0577j9M4212n.m4224m();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f12452b = c0425Gk.m3146n();
                    throw th2;
                }
                this.f12452b = c0425Gk.m3146n();
                m25539m();
                throw th;
            }
        }
        if ((i & 2) == 2) {
            this.f12455e = Collections.unmodifiableList(this.f12455e);
        }
        if ((i & 4) == 4) {
            this.f12456f = Collections.unmodifiableList(this.f12456f);
        }
        try {
            c0577j9M4212n.m4224m();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f12452b = c0425Gk.m3146n();
            throw th3;
        }
        this.f12452b = c0425Gk.m3146n();
        m25539m();
    }
}
