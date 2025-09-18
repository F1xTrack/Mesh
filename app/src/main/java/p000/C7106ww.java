package p000;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;

/* renamed from: ww */
/* loaded from: classes.dex */
public final class C7106ww implements InterfaceC9307ey0, InterfaceC8348Tx0, InterfaceC7932Lx0, InterfaceC8036Nx0 {

    /* renamed from: a */
    public final CountDownLatch f45171a;

    public /* synthetic */ C7106ww(CountDownLatch countDownLatch) {
        this.f45171a = countDownLatch;
    }

    @Override // p000.InterfaceC7932Lx0
    /* renamed from: b */
    public void mo4300b() {
        this.f45171a.countDown();
    }

    @Override // p000.InterfaceC8036Nx0
    public void onComplete(Task task) {
        this.f45171a.countDown();
    }

    @Override // p000.InterfaceC8348Tx0
    public void onFailure(Exception exc) {
        this.f45171a.countDown();
    }

    @Override // p000.InterfaceC9307ey0
    public void onSuccess(Object obj) {
        this.f45171a.countDown();
    }

    public C7106ww() {
        this.f45171a = new CountDownLatch(1);
    }
}
