package defpackage;

import android.os.Handler;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes2.dex */
public final class EK implements AK {
    public final /* synthetic */ int a;
    public final Object b;

    public EK() {
        this.a = 1;
        this.b = new ScheduledThreadPoolExecutor(1);
    }

    @Override // defpackage.AK
    public final void a(C7726w5 c7726w5) {
        switch (this.a) {
            case 0:
                ((Handler) this.b).post(new CK(c7726w5, 1));
                break;
            default:
                ((ScheduledThreadPoolExecutor) this.b).submit(new CK(c7726w5, 2));
                break;
        }
    }

    public EK(Handler handler) {
        this.a = 0;
        this.b = handler;
    }
}
