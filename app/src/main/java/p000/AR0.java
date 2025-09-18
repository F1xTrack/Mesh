package p000;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class AR0 implements ThreadFactory {

    /* renamed from: a */
    public String f192a;

    /* renamed from: b */
    public int f193b;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new C11925zR0(runnable, this.f192a, this.f193b);
    }
}
