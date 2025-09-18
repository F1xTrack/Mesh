package p000;

import com.reactnativecommunity.clipboard.ClipboardModule;
import java.util.List;

/* renamed from: Fi */
/* loaded from: classes.dex */
public final class C0360Fi implements InterfaceC1412WR {

    /* renamed from: a */
    public final /* synthetic */ int f3398a;

    /* renamed from: b */
    public final K11 f3399b;

    public C0360Fi(int i) {
        this.f3398a = i;
        switch (i) {
            case 1:
                this.f3399b = new K11(35152, 2, ClipboardModule.MIMETYPE_PNG);
                break;
            default:
                this.f3399b = new K11(16973, 2, "image/bmp");
                break;
        }
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: b */
    public final InterfaceC1412WR mo737b() {
        int i = this.f3398a;
        return this;
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: d */
    public final int mo738d(InterfaceC1475XR interfaceC1475XR, C1164SV c1164sv) {
        switch (this.f3398a) {
        }
        return this.f3399b.mo738d(interfaceC1475XR, c1164sv);
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: f */
    public final boolean mo739f(InterfaceC1475XR interfaceC1475XR) {
        switch (this.f3398a) {
        }
        return this.f3399b.mo739f(interfaceC1475XR);
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: g */
    public final void mo740g(long j, long j2) {
        switch (this.f3398a) {
            case 0:
                this.f3399b.mo740g(j, j2);
                break;
            default:
                this.f3399b.mo740g(j, j2);
                break;
        }
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: h */
    public final List mo741h() {
        switch (this.f3398a) {
            case 0:
                N70 n70 = P70.f8867b;
                break;
            default:
                N70 n702 = P70.f8867b;
                break;
        }
        return C9367fQ0.f27184e;
    }

    @Override // p000.InterfaceC1412WR
    /* renamed from: l */
    public final void mo742l(InterfaceC1538YR interfaceC1538YR) {
        switch (this.f3398a) {
            case 0:
                this.f3399b.mo742l(interfaceC1538YR);
                break;
            default:
                this.f3399b.mo742l(interfaceC1538YR);
                break;
        }
    }

    @Override // p000.InterfaceC1412WR
    public final void release() {
        int i = this.f3398a;
    }

    /* renamed from: a */
    private final void m2761a() {
    }

    /* renamed from: c */
    private final void m2762c() {
    }
}
