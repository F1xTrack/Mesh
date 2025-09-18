package com.yandex.metrica.impl.p022ob;

import android.annotation.TargetApi;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import com.yandex.metrica.impl.p022ob.C3010Vj;

@TargetApi(17)
/* renamed from: com.yandex.metrica.impl.ob.ak */
/* loaded from: classes2.dex */
public class C3136ak extends AbstractC2886Qj {
    @Override // com.yandex.metrica.impl.p022ob.AbstractC2886Qj
    /* renamed from: b */
    public void mo14955b(CellInfo cellInfo, C3010Vj.a aVar) {
        aVar.m15378l(Integer.valueOf(((CellInfoCdma) cellInfo).getCellSignalStrength().getDbm()));
        aVar.m15362a(2);
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2886Qj
    /* renamed from: c */
    public void mo14956c(CellInfo cellInfo, C3010Vj.a aVar) {
    }
}
