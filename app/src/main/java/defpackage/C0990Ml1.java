package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* renamed from: Ml1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0990Ml1 extends U0 {
    public final C1724Vw0 c;

    public C0990Ml1(InterfaceC1930Yn interfaceC1930Yn, C1724Vw0 c1724Vw0) {
        super(7, interfaceC1930Yn);
        this.c = c1724Vw0;
    }

    @Override // defpackage.U0, defpackage.InterfaceC1930Yn
    public final InterfaceFutureC0750Jj0 a0(ArrayList arrayList, int i, int i2) {
        AbstractC3377dM1.d("Only support one capture config.", arrayList.size() == 1);
        InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0L0 = ((InterfaceC1930Yn) this.b).l0(i, i2);
        QZ qzA = QZ.a(interfaceFutureC0750Jj0L0);
        SZ sz = new SZ(interfaceFutureC0750Jj0L0, 2);
        TJ tjA = QR1.a();
        qzA.getClass();
        return AbstractC1500Sz1.b(Collections.singletonList(AbstractC1500Sz1.r(AbstractC1500Sz1.r(AbstractC1500Sz1.r(qzA, sz, tjA), new H30(this, 19, arrayList), QR1.a()), new SZ(interfaceFutureC0750Jj0L0, 3), QR1.a())));
    }
}
