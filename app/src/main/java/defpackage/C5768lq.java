package defpackage;

/* renamed from: lq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5768lq extends AbstractC1434Sd1 {
    @Override // defpackage.AbstractC1434Sd1
    public final AbstractC6689qe1 g(InterfaceC1200Pd1 interfaceC1200Pd1) {
        O90.f(interfaceC1200Pd1, "key");
        InterfaceC5959mq interfaceC5959mq = interfaceC1200Pd1 instanceof InterfaceC5959mq ? (InterfaceC5959mq) interfaceC1200Pd1 : null;
        if (interfaceC5959mq == null) {
            return null;
        }
        if (interfaceC5959mq.d().c()) {
            return new C6962s41(interfaceC5959mq.d().b(), EnumC4015gi1.e);
        }
        return interfaceC5959mq.d();
    }
}
