package com.yandex.metrica.impl.ob;

import android.annotation.TargetApi;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import com.yandex.metrica.impl.ob.Vj;

@TargetApi(17)
/* renamed from: com.yandex.metrica.impl.ob.ak, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2635ak extends Qj {
    @Override // com.yandex.metrica.impl.ob.Qj
    public void b(CellInfo cellInfo, Vj.a aVar) {
        aVar.l(Integer.valueOf(((CellInfoCdma) cellInfo).getCellSignalStrength().getDbm()));
        aVar.a(2);
    }

    @Override // com.yandex.metrica.impl.ob.Qj
    public void c(CellInfo cellInfo, Vj.a aVar) {
    }
}
