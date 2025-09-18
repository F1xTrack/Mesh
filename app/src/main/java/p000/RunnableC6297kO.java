package p000;

import android.util.Range;
import com.p018my.tracker.obfuscated.C2331j2;
import java.util.concurrent.TimeUnit;

/* renamed from: kO */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC6297kO implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f36474a;

    /* renamed from: b */
    public final /* synthetic */ long f36475b;

    /* renamed from: c */
    public final /* synthetic */ long f36476c;

    /* renamed from: d */
    public final /* synthetic */ Object f36477d;

    public /* synthetic */ RunnableC6297kO(Object obj, long j, long j2, int i) {
        this.f36474a = i;
        this.f36477d = obj;
        this.f36475b = j;
        this.f36476c = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f36474a) {
            case 0:
                C6820sO c6820sO = (C6820sO) this.f36477d;
                switch (AbstractC7222ym.m26247x(c6820sO.f42390D)) {
                    case 0:
                    case 3:
                    case 7:
                        return;
                    case 1:
                    case 2:
                        int i = c6820sO.f42390D;
                        c6820sO.m24725i(4);
                        Long l = (Long) c6820sO.f42410t.getLower();
                        long jLongValue = l.longValue();
                        if (jLongValue == Long.MAX_VALUE) {
                            throw new AssertionError("There should be a \"start\" before \"stop\"");
                        }
                        long j = this.f36475b;
                        String str = c6820sO.f42391a;
                        if (j == -1) {
                            j = this.f36476c;
                        } else if (j < jLongValue) {
                            AbstractC7806Jm0.m4412f(str);
                            j = this.f36476c;
                        }
                        if (j < jLongValue) {
                            throw new AssertionError("The start time should be before the stop time.");
                        }
                        c6820sO.f42410t = Range.create(l, Long.valueOf(j));
                        AbstractC11306uZ1.m25210c(j);
                        AbstractC7806Jm0.m4412f(str);
                        if (i == 3 && c6820sO.f42413w != null) {
                            c6820sO.m24726j();
                            return;
                        } else {
                            c6820sO.f42412v = true;
                            c6820sO.f42414x = QR1.m6710h().schedule(new RunnableC4239iO(c6820sO, 1), 1000L, TimeUnit.MILLISECONDS);
                            return;
                        }
                    case 4:
                    case 5:
                        c6820sO.m24725i(1);
                        return;
                    case 6:
                    case 8:
                        throw new IllegalStateException("Encoder is released");
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(AbstractC1374Vq.m8602u(c6820sO.f42390D)));
                }
            default:
                ((C2331j2) this.f36477d).m13220b(this.f36475b, this.f36476c);
                return;
        }
    }
}
