package com.yandex.metrica.impl.ob;

import android.annotation.TargetApi;
import android.telephony.CellIdentityLte;
import android.telephony.CellInfo;
import android.telephony.CellInfoLte;
import com.yandex.metrica.impl.ob.Vj;

@TargetApi(17)
/* renamed from: com.yandex.metrica.impl.ob.hk */
/* loaded from: classes2.dex */
public class C2810hk extends Qj {
    private final InterfaceC2959nk<CellIdentityLte> c;

    public C2810hk() {
        this(U2.a(28) ? new C3058rk() : new C3034qk());
    }

    @Override // com.yandex.metrica.impl.ob.Qj
    public void b(CellInfo cellInfo, Vj.a aVar) {
        CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
        CellIdentityLte cellIdentity = cellInfoLte.getCellIdentity();
        aVar.a(4).b(Integer.valueOf(cellIdentity.getCi())).c(Integer.valueOf(cellIdentity.getTac())).k(Integer.valueOf(cellIdentity.getPci())).l(Integer.valueOf(cellInfoLte.getCellSignalStrength().getDbm())).i(this.c.b(cellIdentity)).j(this.c.a(cellIdentity));
    }

    @Override // com.yandex.metrica.impl.ob.Qj
    public void c(CellInfo cellInfo, Vj.a aVar) {
        CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
        if (U2.a(24)) {
            aVar.a(Integer.valueOf(C2710dk.a(cellInfoLte.getCellIdentity())));
        }
        if (U2.a(26)) {
            aVar.f(Integer.valueOf(C2735ek.b(cellInfoLte.getCellSignalStrength())));
            aVar.h(Integer.valueOf(C2735ek.c(cellInfoLte.getCellSignalStrength())));
            aVar.e(Integer.valueOf(C2735ek.a(cellInfoLte.getCellSignalStrength())));
        }
        if (U2.a(28)) {
            aVar.d(Integer.valueOf(C2760fk.a(cellInfoLte.getCellIdentity())));
        }
        if (U2.a(29)) {
            aVar.g(Integer.valueOf(C2785gk.a(cellInfoLte.getCellSignalStrength())));
        }
    }

    public C2810hk(InterfaceC2959nk<CellIdentityLte> interfaceC2959nk) {
        this.c = interfaceC2959nk;
    }
}
