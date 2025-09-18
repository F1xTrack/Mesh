package p000;

import java.util.ArrayList;

/* renamed from: Kl1 */
/* loaded from: classes.dex */
public final class C7857Kl1 implements InterfaceC6972uo {

    /* renamed from: a */
    public final InterfaceC6972uo f6273a;

    /* renamed from: b */
    public final C7961Ml1 f6274b;

    /* renamed from: c */
    public final C8013Nl1 f6275c;

    /* renamed from: d */
    public final C7909Ll1 f6276d;

    public C7857Kl1(InterfaceC6972uo interfaceC6972uo, C7909Ll1 c7909Ll1, C8450Vw0 c8450Vw0) {
        this.f6273a = interfaceC6972uo;
        this.f6276d = c7909Ll1;
        this.f6274b = new C7961Ml1(interfaceC6972uo.mo1333g(), c8450Vw0);
        this.f6275c = new C8013Nl1(interfaceC6972uo.mo1341o());
    }

    @Override // p000.InterfaceC6972uo
    /* renamed from: a */
    public final InterfaceC9177dx0 mo1327a() {
        return this.f6273a.mo1327a();
    }

    @Override // p000.InterfaceC6972uo, p000.InterfaceC6385ln
    /* renamed from: b */
    public final InterfaceC6766ro mo1328b() {
        return mo1341o();
    }

    @Override // p000.InterfaceC6972uo
    /* renamed from: c */
    public final /* synthetic */ void mo1329c(InterfaceC0491Hn interfaceC0491Hn) {
    }

    @Override // p000.InterfaceC9274eh1
    /* renamed from: d */
    public final void mo1330d(AbstractC9402fh1 abstractC9402fh1) {
        DV1.m1716a();
        this.f6276d.mo1330d(abstractC9402fh1);
    }

    @Override // p000.InterfaceC6972uo
    /* renamed from: e */
    public final boolean mo1331e() {
        return ((AbstractC6749rX) mo1328b()).mo2398j() == 0;
    }

    @Override // p000.InterfaceC9274eh1
    /* renamed from: f */
    public final void mo1332f(AbstractC9402fh1 abstractC9402fh1) {
        DV1.m1716a();
        this.f6276d.mo1332f(abstractC9402fh1);
    }

    @Override // p000.InterfaceC6972uo
    /* renamed from: g */
    public final InterfaceC1560Yn mo1333g() {
        return this.f6274b;
    }

    @Override // p000.InterfaceC6972uo
    /* renamed from: h */
    public final InterfaceC0491Hn mo1334h() {
        return AbstractC0680Kn.f6285a;
    }

    @Override // p000.InterfaceC9274eh1
    /* renamed from: i */
    public final void mo1335i(AbstractC9402fh1 abstractC9402fh1) {
        DV1.m1716a();
        this.f6276d.mo1335i(abstractC9402fh1);
    }

    @Override // p000.InterfaceC6972uo
    /* renamed from: j */
    public final /* synthetic */ void mo1336j(boolean z) {
    }

    @Override // p000.InterfaceC6972uo
    /* renamed from: k */
    public final void mo1337k(ArrayList arrayList) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // p000.InterfaceC6972uo
    /* renamed from: l */
    public final void mo1338l(ArrayList arrayList) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // p000.InterfaceC6972uo
    /* renamed from: m */
    public final boolean mo1339m() {
        return false;
    }

    @Override // p000.InterfaceC6972uo
    /* renamed from: n */
    public final /* synthetic */ void mo1340n(boolean z) {
    }

    @Override // p000.InterfaceC6972uo
    /* renamed from: o */
    public final InterfaceC6766ro mo1341o() {
        return this.f6275c;
    }

    @Override // p000.InterfaceC9274eh1
    /* renamed from: p */
    public final void mo1342p(AbstractC9402fh1 abstractC9402fh1) {
        DV1.m1716a();
        this.f6276d.mo1342p(abstractC9402fh1);
    }

    @Override // p000.InterfaceC6972uo
    public final InterfaceFutureC7800Jj0 release() {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }
}
