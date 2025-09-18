package p000;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes2.dex */
public final /* synthetic */ class F81 implements InterfaceC8088Ox0, InterfaceC1319Uy {

    /* renamed from: a */
    public final /* synthetic */ CountDownLatch f3080a;

    public /* synthetic */ F81(CountDownLatch countDownLatch) {
        this.f3080a = countDownLatch;
    }

    @Override // p000.InterfaceC8088Ox0
    public void onComplete(Throwable th) {
        CountDownLatch countDownLatch = this.f3080a;
        O90.m5968f(countDownLatch, "$countDownLatch");
        countDownLatch.countDown();
    }

    @Override // p000.InterfaceC1319Uy
    public Object then(Task task) {
        this.f3080a.countDown();
        return null;
    }
}
