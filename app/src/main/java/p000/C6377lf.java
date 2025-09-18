package p000;

import com.reactnativecommunity.clipboard.ClipboardModule;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* renamed from: lf */
/* loaded from: classes.dex */
public final class C6377lf implements InterfaceC1412WR {

    /* renamed from: a */
    public final /* synthetic */ int f37223a;

    /* renamed from: b */
    public final C9591hA0 f37224b;

    /* renamed from: c */
    public final K11 f37225c;

    public C6377lf(int i) {
        this.f37223a = i;
        switch (i) {
            case 1:
                this.f37224b = new C9591hA0(4);
                this.f37225c = new K11(-1, -1, ClipboardModule.MIMETYPE_HEIF);
                break;
            case 2:
                this.f37224b = new C9591hA0(4);
                this.f37225c = new K11(-1, -1, ClipboardModule.MIMETYPE_WEBP);
                break;
            default:
                this.f37224b = new C9591hA0(4);
                this.f37225c = new K11(-1, -1, "image/avif");
                break;
        }
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: b */
    public final InterfaceC1412WR mo737b() {
        int i = this.f37223a;
        return this;
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: d */
    public final int mo738d(InterfaceC1475XR interfaceC1475XR, C1164SV c1164sv) {
        switch (this.f37223a) {
        }
        return this.f37225c.mo738d(interfaceC1475XR, c1164sv);
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: f */
    public final boolean mo739f(InterfaceC1475XR interfaceC1475XR) throws EOFException, InterruptedIOException {
        switch (this.f37223a) {
            case 0:
                C7000vF c7000vF = (C7000vF) interfaceC1475XR;
                c7000vF.m25375a(4, false);
                C9591hA0 c9591hA0 = this.f37224b;
                c9591hA0.m18738D(4);
                c7000vF.mo3620f(c9591hA0.f28293a, 0, 4, false);
                if (c9591hA0.m18765w() == 1718909296) {
                    c9591hA0.m18738D(4);
                    c7000vF.mo3620f(c9591hA0.f28293a, 0, 4, false);
                    if (c9591hA0.m18765w() == 1635150182) {
                    }
                }
                break;
            case 1:
                C7000vF c7000vF2 = (C7000vF) interfaceC1475XR;
                c7000vF2.m25375a(4, false);
                C9591hA0 c9591hA02 = this.f37224b;
                c9591hA02.m18738D(4);
                c7000vF2.mo3620f(c9591hA02.f28293a, 0, 4, false);
                if (c9591hA02.m18765w() == 1718909296) {
                    c9591hA02.m18738D(4);
                    c7000vF2.mo3620f(c9591hA02.f28293a, 0, 4, false);
                    if (c9591hA02.m18765w() == 1751476579) {
                    }
                }
                break;
            default:
                C9591hA0 c9591hA03 = this.f37224b;
                c9591hA03.m18738D(4);
                C7000vF c7000vF3 = (C7000vF) interfaceC1475XR;
                c7000vF3.mo3620f(c9591hA03.f28293a, 0, 4, false);
                if (c9591hA03.m18765w() == 1380533830) {
                    c7000vF3.m25375a(4, false);
                    c9591hA03.m18738D(4);
                    c7000vF3.mo3620f(c9591hA03.f28293a, 0, 4, false);
                    if (c9591hA03.m18765w() == 1464156752) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: g */
    public final void mo740g(long j, long j2) {
        switch (this.f37223a) {
            case 0:
                this.f37225c.mo740g(j, j2);
                break;
            case 1:
                this.f37225c.mo740g(j, j2);
                break;
            default:
                this.f37225c.mo740g(j, j2);
                break;
        }
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: h */
    public final List mo741h() {
        switch (this.f37223a) {
            case 0:
                N70 n70 = P70.f8867b;
                break;
            case 1:
                N70 n702 = P70.f8867b;
                break;
            default:
                N70 n703 = P70.f8867b;
                break;
        }
        return C9367fQ0.f27184e;
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: l */
    public final void mo742l(InterfaceC1538YR interfaceC1538YR) {
        switch (this.f37223a) {
            case 0:
                this.f37225c.mo742l(interfaceC1538YR);
                break;
            case 1:
                this.f37225c.mo742l(interfaceC1538YR);
                break;
            default:
                this.f37225c.mo742l(interfaceC1538YR);
                break;
        }
    }

    @Override // p000.InterfaceC1412WR
    public final void release() {
        int i = this.f37223a;
    }

    /* renamed from: a */
    private final void m22524a() {
    }

    /* renamed from: c */
    private final void m22525c() {
    }

    /* renamed from: e */
    private final void m22526e() {
    }
}
