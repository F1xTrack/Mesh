package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class W {
    public static final W d = new W();
    public final Runnable a;
    public final Executor b;
    public W c;

    public W(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }

    public W() {
        this.a = null;
        this.b = null;
    }
}
