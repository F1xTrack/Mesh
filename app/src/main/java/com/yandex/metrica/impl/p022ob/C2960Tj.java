package com.yandex.metrica.impl.p022ob;

import android.annotation.TargetApi;
import android.telephony.CellInfo;
import com.yandex.metrica.impl.p022ob.C3010Vj;

@TargetApi(17)
/* renamed from: com.yandex.metrica.impl.ob.Tj */
/* loaded from: classes2.dex */
public class C2960Tj implements InterfaceC3448mk {

    /* renamed from: a */
    private final C3110Zj f22411a;

    /* renamed from: b */
    private final C3085Yj f22412b;

    public C2960Tj() {
        this(new C3110Zj(), new C3085Yj());
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3116a0
    /* renamed from: a */
    public void mo14954a(C3602si c3602si) {
        this.f22411a.mo14954a(c3602si);
    }

    public C2960Tj(C3110Zj c3110Zj, C3085Yj c3085Yj) {
        this.f22411a = c3110Zj;
        this.f22412b = c3085Yj;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3448mk
    /* renamed from: a */
    public C3010Vj mo15199a(CellInfo cellInfo) {
        C3010Vj.a aVar = new C3010Vj.a();
        this.f22411a.m15557a(cellInfo, aVar);
        return this.f22412b.m15517a(new C3010Vj(aVar));
    }
}
