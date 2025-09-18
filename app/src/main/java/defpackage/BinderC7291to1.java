package defpackage;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;

/* renamed from: to1 */
/* loaded from: classes.dex */
public final class BinderC7291to1 extends Binder {
    public final C1304Qm0 a;

    public BinderC7291to1(C1304Qm0 c1304Qm0) {
        this.a = c1304Qm0;
    }

    public final void a(C7482uo1 c7482uo1) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        Intent intent = c7482uo1.a;
        KO ko = (KO) this.a.b;
        ko.getClass();
        S81 s81 = new S81();
        ko.a.execute(new RunnableC1557Ts1(ko, intent, s81, 24));
        s81.a.m(new ExecutorC4096h8(2), new C1724Vw0(28, c7482uo1));
    }
}
