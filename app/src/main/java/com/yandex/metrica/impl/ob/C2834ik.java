package com.yandex.metrica.impl.ob;

import android.annotation.TargetApi;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoWcdma;
import com.yandex.metrica.DoNotInline;
import com.yandex.metrica.impl.ob.Vj;

@TargetApi(18)
@DoNotInline
/* renamed from: com.yandex.metrica.impl.ob.ik */
/* loaded from: classes2.dex */
public class C2834ik extends Qj {
    private final InterfaceC2959nk<CellIdentityWcdma> c;

    public C2834ik() {
        this(U2.a(28) ? new C3108tk() : new C3083sk());
    }

    @Override // com.yandex.metrica.impl.ob.Qj
    public void b(CellInfo cellInfo, Vj.a aVar) {
        CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
        CellIdentityWcdma cellIdentity = cellInfoWcdma.getCellIdentity();
        aVar.a(3).b(Integer.valueOf(cellIdentity.getCid())).c(Integer.valueOf(cellIdentity.getLac())).k(Integer.valueOf(cellIdentity.getPsc())).l(Integer.valueOf(cellInfoWcdma.getCellSignalStrength().getDbm())).i(this.c.b(cellIdentity)).j(this.c.a(cellIdentity));
    }

    @Override // com.yandex.metrica.impl.ob.Qj
    public void c(CellInfo cellInfo, Vj.a aVar) {
        if (U2.a(24)) {
            aVar.a(Integer.valueOf(C2710dk.a(((CellInfoWcdma) cellInfo).getCellIdentity())));
        }
    }

    public C2834ik(InterfaceC2959nk<CellIdentityWcdma> interfaceC2959nk) {
        this.c = interfaceC2959nk;
    }
}
