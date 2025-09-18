package p000;

import java.util.ArrayList;
import java.util.Collections;

/* renamed from: Ml1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7961Ml1 extends AbstractC1259U0 {

    /* renamed from: c */
    public final C8450Vw0 f7327c;

    public C7961Ml1(InterfaceC1560Yn interfaceC1560Yn, C8450Vw0 c8450Vw0) {
        super(7, interfaceC1560Yn);
        this.f7327c = c8450Vw0;
    }

    @Override // p000.AbstractC1259U0, p000.InterfaceC1560Yn
    /* renamed from: a0 */
    public final InterfaceFutureC7800Jj0 mo910a0(ArrayList arrayList, int i, int i2) {
        AbstractC9104dM1.m17545d("Only support one capture config.", arrayList.size() == 1);
        InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0Mo922l0 = ((InterfaceC1560Yn) this.f11615b).mo922l0(i, i2);
        C1043QZ c1043qzM6727a = C1043QZ.m6727a(interfaceFutureC7800Jj0Mo922l0);
        C1168SZ c1168sz = new C1168SZ(interfaceFutureC7800Jj0Mo922l0, 2);
        ExecutorC1215TJ executorC1215TJM6703a = QR1.m6703a();
        c1043qzM6727a.getClass();
        return AbstractC8301Sz1.m7479b(Collections.singletonList(AbstractC8301Sz1.m7495r(AbstractC8301Sz1.m7495r(AbstractC8301Sz1.m7495r(c1043qzM6727a, c1168sz, executorC1215TJM6703a), new H30(this, 19, arrayList), QR1.m6703a()), new C1168SZ(interfaceFutureC7800Jj0Mo922l0, 3), QR1.m6703a())));
    }
}
