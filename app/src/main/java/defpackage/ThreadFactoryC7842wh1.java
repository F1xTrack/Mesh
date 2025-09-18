package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: wh1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class ThreadFactoryC7842wh1 implements ThreadFactory {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ ThreadFactoryC7842wh1(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.a;
        O90.f(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(this.b);
        return thread;
    }
}
