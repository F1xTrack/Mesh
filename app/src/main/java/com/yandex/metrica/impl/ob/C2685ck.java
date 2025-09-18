package com.yandex.metrica.impl.ob;

import android.annotation.TargetApi;
import android.telephony.CellIdentityGsm;
import android.telephony.CellInfo;
import android.telephony.CellInfoGsm;
import com.yandex.metrica.impl.ob.Vj;

@TargetApi(17)
/* renamed from: com.yandex.metrica.impl.ob.ck */
/* loaded from: classes2.dex */
public class C2685ck extends Qj {
    private final InterfaceC2959nk<CellIdentityGsm> c;

    public C2685ck() {
        this(U2.a(28) ? new C3009pk() : new C2984ok());
    }

    @Override // com.yandex.metrica.impl.ob.Qj
    public void b(CellInfo cellInfo, Vj.a aVar) {
        CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
        CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
        aVar.a(1).b(Integer.valueOf(cellIdentity.getCid())).c(Integer.valueOf(cellIdentity.getLac())).l(Integer.valueOf(cellInfoGsm.getCellSignalStrength().getDbm())).i(this.c.b(cellIdentity)).j(this.c.a(cellIdentity));
    }

    @Override // com.yandex.metrica.impl.ob.Qj
    public void c(CellInfo cellInfo, Vj.a aVar) {
        CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
        if (U2.a(24)) {
            aVar.a(Integer.valueOf(cellInfoGsm.getCellIdentity().getArfcn()));
        }
    }

    public C2685ck(InterfaceC2959nk<CellIdentityGsm> interfaceC2959nk) {
        this.c = interfaceC2959nk;
    }
}
