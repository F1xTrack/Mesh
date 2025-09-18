package com.yandex.metrica.impl.p022ob;

import android.annotation.TargetApi;
import android.telephony.CellInfo;
import com.yandex.metrica.impl.p022ob.C3010Vj;
import java.util.concurrent.TimeUnit;

@TargetApi(17)
/* renamed from: com.yandex.metrica.impl.ob.kk */
/* loaded from: classes2.dex */
public class C3396kk {

    /* renamed from: a */
    private C2789Mm f24146a;

    public C3396kk() {
        this(new C2789Mm());
    }

    /* renamed from: a */
    public void m16336a(CellInfo cellInfo, C3010Vj.a aVar) {
        long timeStamp = cellInfo.getTimeStamp();
        Long lValueOf = null;
        if (timeStamp > 0) {
            C2789Mm c2789Mm = this.f24146a;
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long jM14632c = c2789Mm.m14632c(timeStamp, timeUnit);
            if (jM14632c > 0 && jM14632c < TimeUnit.HOURS.toSeconds(1L)) {
                lValueOf = Long.valueOf(jM14632c);
            }
            if (lValueOf == null) {
                long jM14630a = this.f24146a.m14630a(timeStamp, timeUnit);
                if (jM14630a > 0 && jM14630a < TimeUnit.HOURS.toSeconds(1L)) {
                    lValueOf = Long.valueOf(jM14630a);
                }
            }
        }
        aVar.m15364a(lValueOf).m15366a(cellInfo.isRegistered());
    }

    public C3396kk(C2789Mm c2789Mm) {
        this.f24146a = c2789Mm;
    }
}
