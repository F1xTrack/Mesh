package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class X {
    public static final X d = new X(null, null);
    public final Runnable a;
    public final Executor b;
    public X c;

    public X(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
