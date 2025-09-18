package com.yandex.metrica.impl.ob;

import android.annotation.TargetApi;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import com.yandex.metrica.impl.ob.Vj;

@TargetApi(17)
/* loaded from: classes2.dex */
public class Zj implements InterfaceC2615a0 {
    private final C2884kk a;
    private final Qj b;
    private final Qj c;
    private final Qj d;
    private final Qj e;
    private final InterfaceC2615a0[] f;

    public Zj() {
        this(new C2660bk());
    }

    public void a(CellInfo cellInfo, Vj.a aVar) {
        this.a.a(cellInfo, aVar);
        if (cellInfo instanceof CellInfoGsm) {
            this.b.a((CellInfoGsm) cellInfo, aVar);
            return;
        }
        if (cellInfo instanceof CellInfoCdma) {
            this.c.a((CellInfoCdma) cellInfo, aVar);
            return;
        }
        if (cellInfo instanceof CellInfoLte) {
            this.d.a((CellInfoLte) cellInfo, aVar);
        } else if (U2.a(18) && (cellInfo instanceof CellInfoWcdma)) {
            this.e.a((CellInfoWcdma) cellInfo, aVar);
        }
    }

    private Zj(Qj qj) {
        this(new C2884kk(), new C2685ck(), new C2635ak(), new C2810hk(), U2.a(18) ? new C2834ik() : qj);
    }

    public Zj(C2884kk c2884kk, Qj qj, Qj qj2, Qj qj3, Qj qj4) {
        this.a = c2884kk;
        this.b = qj;
        this.c = qj2;
        this.d = qj3;
        this.e = qj4;
        this.f = new InterfaceC2615a0[]{qj, qj2, qj4, qj3};
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2615a0
    public void a(C3081si c3081si) {
        for (InterfaceC2615a0 interfaceC2615a0 : this.f) {
            interfaceC2615a0.a(c3081si);
        }
    }
}
