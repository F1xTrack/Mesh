package p000;

import android.util.SparseArray;
import java.util.List;

/* renamed from: g61, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9456g61 implements InterfaceC1412WR {

    /* renamed from: a */
    public final InterfaceC1412WR f27564a;

    /* renamed from: b */
    public final C7408Bv0 f27565b;

    /* renamed from: c */
    public C10189lr0 f27566c;

    public C9456g61(InterfaceC1412WR interfaceC1412WR, C7408Bv0 c7408Bv0) {
        this.f27564a = interfaceC1412WR;
        this.f27565b = c7408Bv0;
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: b */
    public final InterfaceC1412WR mo737b() {
        return this.f27564a;
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: d */
    public final int mo738d(InterfaceC1475XR interfaceC1475XR, C1164SV c1164sv) {
        return this.f27564a.mo738d(interfaceC1475XR, c1164sv);
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: f */
    public final boolean mo739f(InterfaceC1475XR interfaceC1475XR) {
        return this.f27564a.mo739f(interfaceC1475XR);
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: g */
    public final void mo740g(long j, long j2) {
        C10189lr0 c10189lr0 = this.f27566c;
        if (c10189lr0 != null) {
            int i = 0;
            while (true) {
                SparseArray sparseArray = (SparseArray) c10189lr0.f37325d;
                if (i >= sparseArray.size()) {
                    break;
                }
                InterfaceC9200e61 interfaceC9200e61 = ((C9584h61) sparseArray.valueAt(i)).f28266g;
                if (interfaceC9200e61 != null) {
                    interfaceC9200e61.mo4560d();
                }
                i++;
            }
        }
        this.f27564a.mo740g(j, j2);
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
        C10189lr0 c10189lr0 = new C10189lr0(interfaceC1538YR, this.f27565b);
        this.f27566c = c10189lr0;
        this.f27564a.mo742l(c10189lr0);
    }

    @Override // p000.InterfaceC1412WR
    public final void release() {
        this.f27564a.release();
    }
}
