package defpackage;

/* loaded from: classes2.dex */
public final class PO implements InterfaceC6099nZ {
    public final /* synthetic */ int a;
    public final /* synthetic */ QO b;

    public /* synthetic */ PO(QO qo, int i) {
        this.a = i;
        this.b = qo;
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                C1559Tt0 c1559Tt0 = (C1559Tt0) obj;
                QO qo = this.b;
                if (c1559Tt0 != null) {
                    return qo.j(c1559Tt0, qo.i().a(c1559Tt0, EnumC8453zv0.f));
                }
                qo.getClass();
                QO.h(8);
                throw null;
            default:
                C1559Tt0 c1559Tt02 = (C1559Tt0) obj;
                QO qo2 = this.b;
                if (c1559Tt02 != null) {
                    return qo2.j(c1559Tt02, qo2.i().e(c1559Tt02, EnumC8453zv0.f));
                }
                qo2.getClass();
                QO.h(4);
                throw null;
        }
    }
}
