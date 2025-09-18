package defpackage;

import androidx.work.OverwritingInputMerger;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* renamed from: ky0 */
/* loaded from: classes.dex */
public final class C5602ky0 extends AbstractC4056gw0 {
    public final /* synthetic */ int e = 0;

    public C5602ky0(Class cls) {
        super(cls);
        ((C1623Uo1) this.c).d = OverwritingInputMerger.class.getName();
    }

    @Override // defpackage.AbstractC4056gw0
    public final AbstractC1389Ro1 c() {
        switch (this.e) {
            case 0:
                if (this.a && ((C1623Uo1) this.c).j.c) {
                    throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
                }
                return new C5793ly0((UUID) this.b, (C1623Uo1) this.c, (Set) this.d);
            default:
                if (this.a && ((C1623Uo1) this.c).j.c) {
                    throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
                }
                C1623Uo1 c1623Uo1 = (C1623Uo1) this.c;
                if (c1623Uo1.q) {
                    throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
                }
                return new NA0((UUID) this.b, c1623Uo1, (Set) this.d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5602ky0(Class cls, long j, TimeUnit timeUnit) {
        super(cls);
        O90.f(timeUnit, "repeatIntervalTimeUnit");
        C1623Uo1 c1623Uo1 = (C1623Uo1) this.c;
        long millis = timeUnit.toMillis(j);
        c1623Uo1.getClass();
        if (millis < 900000) {
            TE.G().getClass();
        }
        long j2 = millis < 900000 ? 900000L : millis;
        long j3 = millis < 900000 ? 900000L : millis;
        if (j2 < 900000) {
            TE.G().getClass();
        }
        c1623Uo1.h = j2 >= 900000 ? j2 : 900000L;
        if (j3 < 300000) {
            TE.G().getClass();
        }
        if (j3 > c1623Uo1.h) {
            TE.G().getClass();
        }
        c1623Uo1.i = AbstractC5686lO1.d(j3, 300000L, c1623Uo1.h);
    }
}
