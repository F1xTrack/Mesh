package defpackage;

import android.util.SparseArray;
import java.util.List;

/* renamed from: g61, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3901g61 implements WR {
    public final WR a;
    public final C0162Bv0 b;
    public C5772lr0 c;

    public C3901g61(WR wr, C0162Bv0 c0162Bv0) {
        this.a = wr;
        this.b = c0162Bv0;
    }

    @Override // defpackage.WR
    public final WR b() {
        return this.a;
    }

    @Override // defpackage.WR
    public final int d(XR xr, SV sv) {
        return this.a.d(xr, sv);
    }

    @Override // defpackage.WR
    public final boolean f(XR xr) {
        return this.a.f(xr);
    }

    @Override // defpackage.WR
    public final void g(long j, long j2) {
        C5772lr0 c5772lr0 = this.c;
        if (c5772lr0 != null) {
            int i = 0;
            while (true) {
                SparseArray sparseArray = (SparseArray) c5772lr0.d;
                if (i >= sparseArray.size()) {
                    break;
                }
                InterfaceC3519e61 interfaceC3519e61 = ((C4092h61) sparseArray.valueAt(i)).g;
                if (interfaceC3519e61 != null) {
                    interfaceC3519e61.d();
                }
                i++;
            }
        }
        this.a.g(j, j2);
    }

    @Override // defpackage.WR
    public final List h() {
        N70 n70 = P70.b;
        return C3769fQ0.e;
    }

    @Override // defpackage.WR
    public final void l(YR yr) {
        C5772lr0 c5772lr0 = new C5772lr0(yr, this.b);
        this.c = c5772lr0;
        this.a.l(c5772lr0);
    }

    @Override // defpackage.WR
    public final void release() {
        this.a.release();
    }
}
