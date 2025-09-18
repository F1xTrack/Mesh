package com.yandex.metrica.impl.p022ob;

import android.annotation.TargetApi;
import android.telephony.CellIdentityGsm;
import android.telephony.CellInfo;
import android.telephony.CellInfoGsm;
import com.yandex.metrica.impl.p022ob.C3010Vj;

@TargetApi(17)
/* renamed from: com.yandex.metrica.impl.ob.ck */
/* loaded from: classes2.dex */
public class C3188ck extends AbstractC2886Qj {

    /* renamed from: c */
    private final InterfaceC3474nk<CellIdentityGsm> f23193c;

    public C3188ck() {
        this(C2968U2.m15243a(28) ? new C3526pk() : new C3500ok());
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2886Qj
    /* renamed from: b */
    public void mo14955b(CellInfo cellInfo, C3010Vj.a aVar) {
        CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
        CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
        aVar.m15362a(1).m15367b(Integer.valueOf(cellIdentity.getCid())).m15369c(Integer.valueOf(cellIdentity.getLac())).m15378l(Integer.valueOf(cellInfoGsm.getCellSignalStrength().getDbm())).m15375i(this.f23193c.mo16497b(cellIdentity)).m15376j(this.f23193c.mo16496a(cellIdentity));
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2886Qj
    /* renamed from: c */
    public void mo14956c(CellInfo cellInfo, C3010Vj.a aVar) {
        CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
        if (C2968U2.m15243a(24)) {
            aVar.m15363a(Integer.valueOf(cellInfoGsm.getCellIdentity().getArfcn()));
        }
    }

    public C3188ck(InterfaceC3474nk<CellIdentityGsm> interfaceC3474nk) {
        this.f23193c = interfaceC3474nk;
    }
}
