package defpackage;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;

/* renamed from: ww, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7885ww implements InterfaceC3680ey0, InterfaceC1571Tx0, InterfaceC0947Lx0, InterfaceC1103Nx0 {
    public final CountDownLatch a;

    public /* synthetic */ C7885ww(CountDownLatch countDownLatch) {
        this.a = countDownLatch;
    }

    @Override // defpackage.InterfaceC0947Lx0
    public void b() {
        this.a.countDown();
    }

    @Override // defpackage.InterfaceC1103Nx0
    public void onComplete(Task task) {
        this.a.countDown();
    }

    @Override // defpackage.InterfaceC1571Tx0
    public void onFailure(Exception exc) {
        this.a.countDown();
    }

    @Override // defpackage.InterfaceC3680ey0
    public void onSuccess(Object obj) {
        this.a.countDown();
    }

    public C7885ww() {
        this.a = new CountDownLatch(1);
    }
}
