package com.yandex.metrica.impl.ob;

import android.annotation.TargetApi;
import android.telephony.CellInfo;
import com.yandex.metrica.impl.ob.Vj;

@TargetApi(17)
/* loaded from: classes2.dex */
public abstract class Qj implements InterfaceC2615a0 {
    private final String a = "[" + getClass().getName() + "]";
    private volatile C3081si b;

    private boolean b(CellInfo cellInfo) {
        C3081si c3081si = this.b;
        if (c3081si == null || !c3081si.u) {
            return false;
        }
        return !c3081si.v || cellInfo.isRegistered();
    }

    public void a(CellInfo cellInfo, Vj.a aVar) {
        b(cellInfo, aVar);
        if (b(cellInfo)) {
            c(cellInfo, aVar);
        }
    }

    public abstract void b(CellInfo cellInfo, Vj.a aVar);

    public abstract void c(CellInfo cellInfo, Vj.a aVar);

    @Override // com.yandex.metrica.impl.ob.InterfaceC2615a0
    public void a(C3081si c3081si) {
        this.b = c3081si;
    }
}
