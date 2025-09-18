package p000;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class MM1 extends Enum implements Executor {

    /* renamed from: a */
    public static final MM1 f7115a;

    /* renamed from: b */
    public static final /* synthetic */ MM1[] f7116b;

    static {
        MM1 mm1 = new MM1("INSTANCE", 0);
        f7115a = mm1;
        f7116b = new MM1[]{mm1};
    }

    public static MM1[] values() {
        return (MM1[]) f7116b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        ((HandlerC11145tJ0) C7978Mu0.m5464f().f7393b).post(runnable);
    }
}
