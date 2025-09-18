package com.yandex.metrica.impl.ob;

import android.annotation.TargetApi;
import android.telephony.CellInfo;
import com.yandex.metrica.impl.ob.Vj;

@TargetApi(17)
/* loaded from: classes2.dex */
public class Tj implements InterfaceC2934mk {
    private final Zj a;
    private final Yj b;

    public Tj() {
        this(new Zj(), new Yj());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2615a0
    public void a(C3081si c3081si) {
        this.a.a(c3081si);
    }

    public Tj(Zj zj, Yj yj) {
        this.a = zj;
        this.b = yj;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2934mk
    public Vj a(CellInfo cellInfo) {
        Vj.a aVar = new Vj.a();
        this.a.a(cellInfo, aVar);
        return this.b.a(new Vj(aVar));
    }
}
