package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class MM1 extends Enum implements Executor {
    public static final MM1 a;
    public static final /* synthetic */ MM1[] b;

    static {
        MM1 mm1 = new MM1("INSTANCE", 0);
        a = mm1;
        b = new MM1[]{mm1};
    }

    public static MM1[] values() {
        return (MM1[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        ((HandlerC7197tJ0) C1016Mu0.f().b).post(runnable);
    }
}
