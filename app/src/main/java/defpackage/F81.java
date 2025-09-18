package defpackage;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes2.dex */
public final /* synthetic */ class F81 implements InterfaceC1181Ox0, InterfaceC1651Uy {
    public final /* synthetic */ CountDownLatch a;

    public /* synthetic */ F81(CountDownLatch countDownLatch) {
        this.a = countDownLatch;
    }

    @Override // defpackage.InterfaceC1181Ox0
    public void onComplete(Throwable th) {
        CountDownLatch countDownLatch = this.a;
        O90.f(countDownLatch, "$countDownLatch");
        countDownLatch.countDown();
    }

    @Override // defpackage.InterfaceC1651Uy
    public Object then(Task task) {
        this.a.countDown();
        return null;
    }
}
