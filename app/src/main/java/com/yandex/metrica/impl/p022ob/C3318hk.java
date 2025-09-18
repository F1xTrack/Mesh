package com.yandex.metrica.impl.p022ob;

import android.annotation.TargetApi;
import android.telephony.CellIdentityLte;
import android.telephony.CellInfo;
import android.telephony.CellInfoLte;
import com.yandex.metrica.impl.p022ob.C3010Vj;

@TargetApi(17)
/* renamed from: com.yandex.metrica.impl.ob.hk */
/* loaded from: classes2.dex */
public class C3318hk extends AbstractC2886Qj {

    /* renamed from: c */
    private final InterfaceC3474nk<CellIdentityLte> f23610c;

    public C3318hk() {
        this(C2968U2.m15243a(28) ? new C3578rk() : new C3552qk());
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2886Qj
    /* renamed from: b */
    public void mo14955b(CellInfo cellInfo, C3010Vj.a aVar) {
        CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
        CellIdentityLte cellIdentity = cellInfoLte.getCellIdentity();
        aVar.m15362a(4).m15367b(Integer.valueOf(cellIdentity.getCi())).m15369c(Integer.valueOf(cellIdentity.getTac())).m15377k(Integer.valueOf(cellIdentity.getPci())).m15378l(Integer.valueOf(cellInfoLte.getCellSignalStrength().getDbm())).m15375i(this.f23610c.mo16497b(cellIdentity)).m15376j(this.f23610c.mo16496a(cellIdentity));
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2886Qj
    /* renamed from: c */
    public void mo14956c(CellInfo cellInfo, C3010Vj.a aVar) {
        CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
        if (C2968U2.m15243a(24)) {
            aVar.m15363a(Integer.valueOf(C3214dk.m15803a(cellInfoLte.getCellIdentity())));
        }
        if (C2968U2.m15243a(26)) {
            aVar.m15372f(Integer.valueOf(C3240ek.m15859b(cellInfoLte.getCellSignalStrength())));
            aVar.m15374h(Integer.valueOf(C3240ek.m15860c(cellInfoLte.getCellSignalStrength())));
            aVar.m15371e(Integer.valueOf(C3240ek.m15858a(cellInfoLte.getCellSignalStrength())));
        }
        if (C2968U2.m15243a(28)) {
            aVar.m15370d(Integer.valueOf(C3266fk.m15947a(cellInfoLte.getCellIdentity())));
        }
        if (C2968U2.m15243a(29)) {
            aVar.m15373g(Integer.valueOf(C3292gk.m16006a(cellInfoLte.getCellSignalStrength())));
        }
    }

    public C3318hk(InterfaceC3474nk<CellIdentityLte> interfaceC3474nk) {
        this.f23610c = interfaceC3474nk;
    }
}
