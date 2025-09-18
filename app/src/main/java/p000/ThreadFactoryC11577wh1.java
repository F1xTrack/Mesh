package p000;

import java.util.concurrent.ThreadFactory;

/* renamed from: wh1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class ThreadFactoryC11577wh1 implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ String f45036a;

    /* renamed from: b */
    public final /* synthetic */ boolean f45037b;

    public /* synthetic */ ThreadFactoryC11577wh1(String str, boolean z) {
        this.f45036a = str;
        this.f45037b = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f45036a;
        O90.m5968f(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(this.f45037b);
        return thread;
    }
}
