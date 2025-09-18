package p000;

import java.io.IOException;

/* renamed from: Cd0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7424Cd0 extends A00 {

    /* renamed from: j */
    public static final C7424Cd0 f1493j;

    /* renamed from: k */
    public static final C11695xd0 f1494k = new C11695xd0(2);

    /* renamed from: a */
    public final AbstractC0488Hk f1495a;

    /* renamed from: b */
    public int f1496b;

    /* renamed from: c */
    public C11949zd0 f1497c;

    /* renamed from: d */
    public C7320Ad0 f1498d;

    /* renamed from: e */
    public C7320Ad0 f1499e;

    /* renamed from: f */
    public C7320Ad0 f1500f;

    /* renamed from: g */
    public C7320Ad0 f1501g;

    /* renamed from: h */
    public byte f1502h;

    /* renamed from: i */
    public int f1503i;

    static {
        C7424Cd0 c7424Cd0 = new C7424Cd0();
        f1493j = c7424Cd0;
        c7424Cd0.f1497c = C11949zd0.f46909g;
        C7320Ad0 c7320Ad0 = C7320Ad0.f289g;
        c7424Cd0.f1498d = c7320Ad0;
        c7424Cd0.f1499e = c7320Ad0;
        c7424Cd0.f1500f = c7320Ad0;
        c7424Cd0.f1501g = c7320Ad0;
    }

    public C7424Cd0() {
        this.f1502h = (byte) -1;
        this.f1503i = -1;
        this.f1495a = AbstractC0488Hk.f4481a;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: b */
    public final int mo128b() {
        int i = this.f1503i;
        if (i != -1) {
            return i;
        }
        int iM4207g = (this.f1496b & 1) == 1 ? C0577J9.m4207g(1, this.f1497c) : 0;
        if ((this.f1496b & 2) == 2) {
            iM4207g += C0577J9.m4207g(2, this.f1498d);
        }
        if ((this.f1496b & 4) == 4) {
            iM4207g += C0577J9.m4207g(3, this.f1499e);
        }
        if ((this.f1496b & 8) == 8) {
            iM4207g += C0577J9.m4207g(4, this.f1500f);
        }
        if ((this.f1496b & 16) == 16) {
            iM4207g += C0577J9.m4207g(5, this.f1501g);
        }
        int size = this.f1495a.size() + iM4207g;
        this.f1503i = size;
        return size;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: c */
    public final AbstractC10847r00 mo129c() {
        return C7372Bd0.m780l();
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: d */
    public final AbstractC10847r00 mo130d() {
        C7372Bd0 c7372Bd0M780l = C7372Bd0.m780l();
        c7372Bd0M780l.m782m(this);
        return c7372Bd0M780l;
    }

    @Override // p000.InterfaceC10957rr0
    /* renamed from: e */
    public final boolean mo131e() {
        byte b = this.f1502h;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f1502h = (byte) 1;
        return true;
    }

    @Override // p000.AbstractC0631K0
    /* renamed from: f */
    public final void mo132f(C0577J9 c0577j9) throws IOException {
        mo128b();
        if ((this.f1496b & 1) == 1) {
            c0577j9.m4235y(1, this.f1497c);
        }
        if ((this.f1496b & 2) == 2) {
            c0577j9.m4235y(2, this.f1498d);
        }
        if ((this.f1496b & 4) == 4) {
            c0577j9.m4235y(3, this.f1499e);
        }
        if ((this.f1496b & 8) == 8) {
            c0577j9.m4235y(4, this.f1500f);
        }
        if ((this.f1496b & 16) == 16) {
            c0577j9.m4235y(5, this.f1501g);
        }
        c0577j9.m4214B(this.f1495a);
    }

    public C7424Cd0(C6392lu c6392lu, C0217DR c0217dr) {
        this.f1502h = (byte) -1;
        this.f1503i = -1;
        this.f1497c = C11949zd0.f46909g;
        C7320Ad0 c7320Ad0 = C7320Ad0.f289g;
        this.f1498d = c7320Ad0;
        this.f1499e = c7320Ad0;
        this.f1500f = c7320Ad0;
        this.f1501g = c7320Ad0;
        C0425Gk c0425Gk = new C0425Gk();
        C0577J9 c0577j9M4212n = C0577J9.m4212n(c0425Gk, 1);
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iM22586n = c6392lu.m22586n();
                    if (iM22586n != 0) {
                        C11822yd0 c11822yd0M245i = null;
                        if (iM22586n == 10) {
                            if ((this.f1496b & 1) == 1) {
                                C11949zd0 c11949zd0 = this.f1497c;
                                c11949zd0.getClass();
                                c11822yd0M245i = new C11822yd0(0);
                                c11822yd0M245i.m26207m(c11949zd0);
                            }
                            C11949zd0 c11949zd02 = (C11949zd0) c6392lu.m22579g(C11949zd0.f46910h, c0217dr);
                            this.f1497c = c11949zd02;
                            if (c11822yd0M245i != null) {
                                c11822yd0M245i.m26207m(c11949zd02);
                                this.f1497c = c11822yd0M245i.m26205k();
                            }
                            this.f1496b |= 1;
                        } else if (iM22586n == 18) {
                            if ((this.f1496b & 2) == 2) {
                                C7320Ad0 c7320Ad02 = this.f1498d;
                                c7320Ad02.getClass();
                                c11822yd0M245i = C7320Ad0.m245i(c7320Ad02);
                            }
                            C7320Ad0 c7320Ad03 = (C7320Ad0) c6392lu.m22579g(C7320Ad0.f290h, c0217dr);
                            this.f1498d = c7320Ad03;
                            if (c11822yd0M245i != null) {
                                c11822yd0M245i.m26208n(c7320Ad03);
                                this.f1498d = c11822yd0M245i.m26206l();
                            }
                            this.f1496b |= 2;
                        } else if (iM22586n == 26) {
                            if ((this.f1496b & 4) == 4) {
                                C7320Ad0 c7320Ad04 = this.f1499e;
                                c7320Ad04.getClass();
                                c11822yd0M245i = C7320Ad0.m245i(c7320Ad04);
                            }
                            C7320Ad0 c7320Ad05 = (C7320Ad0) c6392lu.m22579g(C7320Ad0.f290h, c0217dr);
                            this.f1499e = c7320Ad05;
                            if (c11822yd0M245i != null) {
                                c11822yd0M245i.m26208n(c7320Ad05);
                                this.f1499e = c11822yd0M245i.m26206l();
                            }
                            this.f1496b |= 4;
                        } else if (iM22586n == 34) {
                            if ((this.f1496b & 8) == 8) {
                                C7320Ad0 c7320Ad06 = this.f1500f;
                                c7320Ad06.getClass();
                                c11822yd0M245i = C7320Ad0.m245i(c7320Ad06);
                            }
                            C7320Ad0 c7320Ad07 = (C7320Ad0) c6392lu.m22579g(C7320Ad0.f290h, c0217dr);
                            this.f1500f = c7320Ad07;
                            if (c11822yd0M245i != null) {
                                c11822yd0M245i.m26208n(c7320Ad07);
                                this.f1500f = c11822yd0M245i.m26206l();
                            }
                            this.f1496b |= 8;
                        } else if (iM22586n != 42) {
                            if (!c6392lu.m22589q(iM22586n, c0577j9M4212n)) {
                            }
                        } else {
                            if ((this.f1496b & 16) == 16) {
                                C7320Ad0 c7320Ad08 = this.f1501g;
                                c7320Ad08.getClass();
                                c11822yd0M245i = C7320Ad0.m245i(c7320Ad08);
                            }
                            C7320Ad0 c7320Ad09 = (C7320Ad0) c6392lu.m22579g(C7320Ad0.f290h, c0217dr);
                            this.f1501g = c7320Ad09;
                            if (c11822yd0M245i != null) {
                                c11822yd0M245i.m26208n(c7320Ad09);
                                this.f1501g = c11822yd0M245i.m26206l();
                            }
                            this.f1496b |= 16;
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
                try {
                    c0577j9M4212n.m4224m();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f1495a = c0425Gk.m3146n();
                    throw th2;
                }
                this.f1495a = c0425Gk.m3146n();
                throw th;
            }
        }
        try {
            c0577j9M4212n.m4224m();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f1495a = c0425Gk.m3146n();
            throw th3;
        }
        this.f1495a = c0425Gk.m3146n();
    }

    public C7424Cd0(C7372Bd0 c7372Bd0) {
        this.f1502h = (byte) -1;
        this.f1503i = -1;
        this.f1495a = c7372Bd0.f41281a;
    }
}
