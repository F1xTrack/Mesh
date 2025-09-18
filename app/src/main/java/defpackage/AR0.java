package defpackage;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class AR0 implements ThreadFactory {
    public String a;
    public int b;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new C8363zR0(runnable, this.a, this.b);
    }
}
