package com.yandex.metrica.impl.p022ob;

import android.annotation.TargetApi;
import android.telephony.CellInfo;
import com.yandex.metrica.impl.p022ob.C3010Vj;

@TargetApi(17)
/* renamed from: com.yandex.metrica.impl.ob.Qj */
/* loaded from: classes2.dex */
public abstract class AbstractC2886Qj implements InterfaceC3116a0 {

    /* renamed from: a */
    private final String f22076a = "[" + getClass().getName() + "]";

    /* renamed from: b */
    private volatile C3602si f22077b;

    /* renamed from: b */
    private boolean m14952b(CellInfo cellInfo) {
        C3602si c3602si = this.f22077b;
        if (c3602si == null || !c3602si.f24728u) {
            return false;
        }
        return !c3602si.f24729v || cellInfo.isRegistered();
    }

    /* renamed from: a */
    public void mo14953a(CellInfo cellInfo, C3010Vj.a aVar) {
        mo14955b(cellInfo, aVar);
        if (m14952b(cellInfo)) {
            mo14956c(cellInfo, aVar);
        }
    }

    /* renamed from: b */
    public abstract void mo14955b(CellInfo cellInfo, C3010Vj.a aVar);

    /* renamed from: c */
    public abstract void mo14956c(CellInfo cellInfo, C3010Vj.a aVar);

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3116a0
    /* renamed from: a */
    public void mo14954a(C3602si c3602si) {
        this.f22077b = c3602si;
    }
}
