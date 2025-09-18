package p000;

import android.os.Handler;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: EK */
/* loaded from: classes2.dex */
public final class C0273EK implements InterfaceC0021AK {

    /* renamed from: a */
    public final /* synthetic */ int f2606a;

    /* renamed from: b */
    public final Object f2607b;

    public C0273EK() {
        this.f2606a = 1;
        this.f2607b = new ScheduledThreadPoolExecutor(1);
    }

    @Override // p000.InterfaceC0021AK
    /* renamed from: a */
    public final void mo155a(C7053w5 c7053w5) {
        switch (this.f2606a) {
            case 0:
                ((Handler) this.f2607b).post(new RunnableC0147CK(c7053w5, 1));
                break;
            default:
                ((ScheduledThreadPoolExecutor) this.f2607b).submit(new RunnableC0147CK(c7053w5, 2));
                break;
        }
    }

    public C0273EK(Handler handler) {
        this.f2606a = 0;
        this.f2607b = handler;
    }
}
