package defpackage;

import android.util.SparseArray;

/* renamed from: q20, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6572q20 {
    public final InterfaceC1584Ub1 a;
    public final boolean b;
    public final boolean c;
    public final C0848Kq f;
    public byte[] g;
    public int h;
    public int i;
    public long j;
    public long l;
    public long p;
    public long q;
    public boolean r;
    public boolean s;
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public C6381p20 m = new C6381p20();
    public C6381p20 n = new C6381p20();
    public boolean k = false;
    public boolean o = false;

    public C6572q20(InterfaceC1584Ub1 interfaceC1584Ub1, boolean z, boolean z2) {
        this.a = interfaceC1584Ub1;
        this.b = z;
        this.c = z2;
        byte[] bArr = new byte[128];
        this.g = bArr;
        this.f = new C0848Kq(0, bArr, 0, 2);
        C6381p20 c6381p20 = this.n;
        c6381p20.b = false;
        c6381p20.a = false;
    }

    public final void a() {
        boolean z;
        int i;
        boolean z2 = false;
        if (this.b) {
            C6381p20 c6381p20 = this.n;
            z = c6381p20.b && ((i = c6381p20.e) == 7 || i == 2);
        } else {
            z = this.s;
        }
        boolean z3 = this.r;
        int i2 = this.i;
        if (i2 == 5 || (z && i2 == 1)) {
            z2 = true;
        }
        this.r = z3 | z2;
    }
}
