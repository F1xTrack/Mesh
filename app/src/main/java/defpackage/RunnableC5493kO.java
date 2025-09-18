package defpackage;

import android.util.Range;
import com.my.tracker.obfuscated.j2;
import java.util.concurrent.TimeUnit;

/* renamed from: kO */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC5493kO implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ RunnableC5493kO(Object obj, long j, long j2, int i) {
        this.a = i;
        this.d = obj;
        this.b = j;
        this.c = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                C7020sO c7020sO = (C7020sO) this.d;
                switch (AbstractC8235ym.x(c7020sO.D)) {
                    case 0:
                    case 3:
                    case 7:
                        return;
                    case 1:
                    case 2:
                        int i = c7020sO.D;
                        c7020sO.i(4);
                        Long l = (Long) c7020sO.t.getLower();
                        long jLongValue = l.longValue();
                        if (jLongValue == Long.MAX_VALUE) {
                            throw new AssertionError("There should be a \"start\" before \"stop\"");
                        }
                        long j = this.b;
                        String str = c7020sO.a;
                        if (j == -1) {
                            j = this.c;
                        } else if (j < jLongValue) {
                            AbstractC0759Jm0.f(str);
                            j = this.c;
                        }
                        if (j < jLongValue) {
                            throw new AssertionError("The start time should be before the stop time.");
                        }
                        c7020sO.t = Range.create(l, Long.valueOf(j));
                        AbstractC7437uZ1.c(j);
                        AbstractC0759Jm0.f(str);
                        if (i == 3 && c7020sO.w != null) {
                            c7020sO.j();
                            return;
                        } else {
                            c7020sO.v = true;
                            c7020sO.x = QR1.h().schedule(new RunnableC4335iO(c7020sO, 1), 1000L, TimeUnit.MILLISECONDS);
                            return;
                        }
                    case 4:
                    case 5:
                        c7020sO.i(1);
                        return;
                    case 6:
                    case 8:
                        throw new IllegalStateException("Encoder is released");
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(AbstractC1705Vq.u(c7020sO.D)));
                }
            default:
                ((j2) this.d).b(this.b, this.c);
                return;
        }
    }
}
