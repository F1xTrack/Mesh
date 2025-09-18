package p000;

import java.util.concurrent.ThreadFactory;

/* renamed from: xh1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC11704xh1 implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ String f45744a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f45744a);
    }
}
