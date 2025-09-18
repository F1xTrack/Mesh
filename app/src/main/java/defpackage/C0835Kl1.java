package defpackage;

import java.util.ArrayList;

/* renamed from: Kl1 */
/* loaded from: classes.dex */
public final class C0835Kl1 implements InterfaceC7480uo {
    public final InterfaceC7480uo a;
    public final C0990Ml1 b;
    public final C1068Nl1 c;
    public final C0913Ll1 d;

    public C0835Kl1(InterfaceC7480uo interfaceC7480uo, C0913Ll1 c0913Ll1, C1724Vw0 c1724Vw0) {
        this.a = interfaceC7480uo;
        this.d = c0913Ll1;
        this.b = new C0990Ml1(interfaceC7480uo.g(), c1724Vw0);
        this.c = new C1068Nl1(interfaceC7480uo.o());
    }

    @Override // defpackage.InterfaceC7480uo
    public final InterfaceC3486dx0 a() {
        return this.a.a();
    }

    @Override // defpackage.InterfaceC7480uo, defpackage.InterfaceC5759ln
    public final InterfaceC6907ro b() {
        return o();
    }

    @Override // defpackage.InterfaceC7480uo
    public final /* synthetic */ void c(InterfaceC0605Hn interfaceC0605Hn) {
    }

    @Override // defpackage.InterfaceC3630eh1
    public final void d(AbstractC3821fh1 abstractC3821fh1) {
        DV1.a();
        this.d.d(abstractC3821fh1);
    }

    @Override // defpackage.InterfaceC7480uo
    public final boolean e() {
        return ((AbstractC6856rX) b()).j() == 0;
    }

    @Override // defpackage.InterfaceC3630eh1
    public final void f(AbstractC3821fh1 abstractC3821fh1) {
        DV1.a();
        this.d.f(abstractC3821fh1);
    }

    @Override // defpackage.InterfaceC7480uo
    public final InterfaceC1930Yn g() {
        return this.b;
    }

    @Override // defpackage.InterfaceC7480uo
    public final InterfaceC0605Hn h() {
        return AbstractC0839Kn.a;
    }

    @Override // defpackage.InterfaceC3630eh1
    public final void i(AbstractC3821fh1 abstractC3821fh1) {
        DV1.a();
        this.d.i(abstractC3821fh1);
    }

    @Override // defpackage.InterfaceC7480uo
    public final /* synthetic */ void j(boolean z) {
    }

    @Override // defpackage.InterfaceC7480uo
    public final void k(ArrayList arrayList) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // defpackage.InterfaceC7480uo
    public final void l(ArrayList arrayList) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // defpackage.InterfaceC7480uo
    public final boolean m() {
        return false;
    }

    @Override // defpackage.InterfaceC7480uo
    public final /* synthetic */ void n(boolean z) {
    }

    @Override // defpackage.InterfaceC7480uo
    public final InterfaceC6907ro o() {
        return this.c;
    }

    @Override // defpackage.InterfaceC3630eh1
    public final void p(AbstractC3821fh1 abstractC3821fh1) {
        DV1.a();
        this.d.p(abstractC3821fh1);
    }

    @Override // defpackage.InterfaceC7480uo
    public final InterfaceFutureC0750Jj0 release() {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }
}
