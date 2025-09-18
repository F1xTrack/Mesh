package p000;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;

/* renamed from: to1 */
/* loaded from: classes.dex */
public final class BinderC11208to1 extends Binder {

    /* renamed from: a */
    public final C8170Qm0 f43321a;

    public BinderC11208to1(C8170Qm0 c8170Qm0) {
        this.f43321a = c8170Qm0;
    }

    /* renamed from: a */
    public final void m24989a(C11336uo1 c11336uo1) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        Intent intent = c11336uo1.f43927a;
        AbstractServiceC0655KO abstractServiceC0655KO = (AbstractServiceC0655KO) this.f43321a.f9780b;
        abstractServiceC0655KO.getClass();
        S81 s81 = new S81();
        abstractServiceC0655KO.f6040a.execute(new RunnableC8339Ts1(abstractServiceC0655KO, intent, s81, 24));
        s81.f10598a.m18386m(new ExecutorC4160h8(2), new C8450Vw0(28, c11336uo1));
    }
}
