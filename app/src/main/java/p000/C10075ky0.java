package p000;

import androidx.work.OverwritingInputMerger;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* renamed from: ky0 */
/* loaded from: classes.dex */
public final class C10075ky0 extends AbstractC9559gw0 {

    /* renamed from: e */
    public final /* synthetic */ int f36790e = 0;

    public C10075ky0(Class cls) {
        super(cls);
        ((C8383Uo1) this.f28106c).f12137d = OverwritingInputMerger.class.getName();
    }

    @Override // p000.AbstractC9559gw0
    /* renamed from: c */
    public final AbstractC8227Ro1 mo18676c() {
        switch (this.f36790e) {
            case 0:
                if (this.f28104a && ((C8383Uo1) this.f28106c).f12143j.f28118c) {
                    throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
                }
                return new C10203ly0((UUID) this.f28105b, (C8383Uo1) this.f28106c, (Set) this.f28107d);
            default:
                if (this.f28104a && ((C8383Uo1) this.f28106c).f12143j.f28118c) {
                    throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
                }
                C8383Uo1 c8383Uo1 = (C8383Uo1) this.f28106c;
                if (c8383Uo1.f12150q) {
                    throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
                }
                return new NA0((UUID) this.f28105b, c8383Uo1, (Set) this.f28107d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10075ky0(Class cls, long j, TimeUnit timeUnit) {
        super(cls);
        O90.m5968f(timeUnit, "repeatIntervalTimeUnit");
        C8383Uo1 c8383Uo1 = (C8383Uo1) this.f28106c;
        long millis = timeUnit.toMillis(j);
        c8383Uo1.getClass();
        if (millis < 900000) {
            C1210TE.m7634G().getClass();
        }
        long j2 = millis < 900000 ? 900000L : millis;
        long j3 = millis < 900000 ? 900000L : millis;
        if (j2 < 900000) {
            C1210TE.m7634G().getClass();
        }
        c8383Uo1.f12141h = j2 >= 900000 ? j2 : 900000L;
        if (j3 < 300000) {
            C1210TE.m7634G().getClass();
        }
        if (j3 > c8383Uo1.f12141h) {
            C1210TE.m7634G().getClass();
        }
        c8383Uo1.f12142i = AbstractC10132lO1.m22419d(j3, 300000L, c8383Uo1.f12141h);
    }
}
