package com.yandex.metrica.impl.p022ob;

import android.annotation.TargetApi;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import com.yandex.metrica.impl.p022ob.C3010Vj;

@TargetApi(17)
/* renamed from: com.yandex.metrica.impl.ob.Zj */
/* loaded from: classes2.dex */
public class C3110Zj implements InterfaceC3116a0 {

    /* renamed from: a */
    private final C3396kk f22997a;

    /* renamed from: b */
    private final AbstractC2886Qj f22998b;

    /* renamed from: c */
    private final AbstractC2886Qj f22999c;

    /* renamed from: d */
    private final AbstractC2886Qj f23000d;

    /* renamed from: e */
    private final AbstractC2886Qj f23001e;

    /* renamed from: f */
    private final InterfaceC3116a0[] f23002f;

    public C3110Zj() {
        this(new C3162bk());
    }

    /* renamed from: a */
    public void m15557a(CellInfo cellInfo, C3010Vj.a aVar) {
        this.f22997a.m16336a(cellInfo, aVar);
        if (cellInfo instanceof CellInfoGsm) {
            this.f22998b.mo14953a((CellInfoGsm) cellInfo, aVar);
            return;
        }
        if (cellInfo instanceof CellInfoCdma) {
            this.f22999c.mo14953a((CellInfoCdma) cellInfo, aVar);
            return;
        }
        if (cellInfo instanceof CellInfoLte) {
            this.f23000d.mo14953a((CellInfoLte) cellInfo, aVar);
        } else if (C2968U2.m15243a(18) && (cellInfo instanceof CellInfoWcdma)) {
            this.f23001e.mo14953a((CellInfoWcdma) cellInfo, aVar);
        }
    }

    private C3110Zj(AbstractC2886Qj abstractC2886Qj) {
        this(new C3396kk(), new C3188ck(), new C3136ak(), new C3318hk(), C2968U2.m15243a(18) ? new C3344ik() : abstractC2886Qj);
    }

    public C3110Zj(C3396kk c3396kk, AbstractC2886Qj abstractC2886Qj, AbstractC2886Qj abstractC2886Qj2, AbstractC2886Qj abstractC2886Qj3, AbstractC2886Qj abstractC2886Qj4) {
        this.f22997a = c3396kk;
        this.f22998b = abstractC2886Qj;
        this.f22999c = abstractC2886Qj2;
        this.f23000d = abstractC2886Qj3;
        this.f23001e = abstractC2886Qj4;
        this.f23002f = new InterfaceC3116a0[]{abstractC2886Qj, abstractC2886Qj2, abstractC2886Qj4, abstractC2886Qj3};
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3116a0
    /* renamed from: a */
    public void mo14954a(C3602si c3602si) {
        for (InterfaceC3116a0 interfaceC3116a0 : this.f23002f) {
            interfaceC3116a0.mo14954a(c3602si);
        }
    }
}
