package com.yandex.metrica.impl.p022ob;

import android.annotation.TargetApi;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoWcdma;
import com.yandex.metrica.DoNotInline;
import com.yandex.metrica.impl.p022ob.C3010Vj;

@TargetApi(18)
@DoNotInline
/* renamed from: com.yandex.metrica.impl.ob.ik */
/* loaded from: classes2.dex */
public class C3344ik extends AbstractC2886Qj {

    /* renamed from: c */
    private final InterfaceC3474nk<CellIdentityWcdma> f23660c;

    public C3344ik() {
        this(C2968U2.m15243a(28) ? new C3630tk() : new C3604sk());
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2886Qj
    /* renamed from: b */
    public void mo14955b(CellInfo cellInfo, C3010Vj.a aVar) {
        CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
        CellIdentityWcdma cellIdentity = cellInfoWcdma.getCellIdentity();
        aVar.m15362a(3).m15367b(Integer.valueOf(cellIdentity.getCid())).m15369c(Integer.valueOf(cellIdentity.getLac())).m15377k(Integer.valueOf(cellIdentity.getPsc())).m15378l(Integer.valueOf(cellInfoWcdma.getCellSignalStrength().getDbm())).m15375i(this.f23660c.mo16497b(cellIdentity)).m15376j(this.f23660c.mo16496a(cellIdentity));
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2886Qj
    /* renamed from: c */
    public void mo14956c(CellInfo cellInfo, C3010Vj.a aVar) {
        if (C2968U2.m15243a(24)) {
            aVar.m15363a(Integer.valueOf(C3214dk.m15804a(((CellInfoWcdma) cellInfo).getCellIdentity())));
        }
    }

    public C3344ik(InterfaceC3474nk<CellIdentityWcdma> interfaceC3474nk) {
        this.f23660c = interfaceC3474nk;
    }
}
