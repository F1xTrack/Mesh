package com.yandex.metrica.impl.ob;

import android.annotation.TargetApi;
import android.telephony.CellInfo;
import com.yandex.metrica.impl.ob.Vj;
import java.util.concurrent.TimeUnit;

@TargetApi(17)
/* renamed from: com.yandex.metrica.impl.ob.kk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2884kk {
    private Mm a;

    public C2884kk() {
        this(new Mm());
    }

    public void a(CellInfo cellInfo, Vj.a aVar) {
        long timeStamp = cellInfo.getTimeStamp();
        Long lValueOf = null;
        if (timeStamp > 0) {
            Mm mm = this.a;
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long jC = mm.c(timeStamp, timeUnit);
            if (jC > 0 && jC < TimeUnit.HOURS.toSeconds(1L)) {
                lValueOf = Long.valueOf(jC);
            }
            if (lValueOf == null) {
                long jA = this.a.a(timeStamp, timeUnit);
                if (jA > 0 && jA < TimeUnit.HOURS.toSeconds(1L)) {
                    lValueOf = Long.valueOf(jA);
                }
            }
        }
        aVar.a(lValueOf).a(cellInfo.isRegistered());
    }

    public C2884kk(Mm mm) {
        this.a = mm;
    }
}
