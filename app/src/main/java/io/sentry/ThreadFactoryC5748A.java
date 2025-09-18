package io.sentry;

import java.util.concurrent.ThreadFactory;
import p000.O90;

/* renamed from: io.sentry.A */
/* loaded from: classes2.dex */
public final class ThreadFactoryC5748A implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ int f33203a;

    /* renamed from: b */
    public int f33204b;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f33203a) {
            case 0:
                StringBuilder sb = new StringBuilder("SentryHostnameCache-");
                int i = this.f33204b;
                this.f33204b = i + 1;
                sb.append(i);
                Thread thread = new Thread(runnable, sb.toString());
                thread.setDaemon(true);
                return thread;
            case 1:
                StringBuilder sb2 = new StringBuilder("SentryExecutorServiceThreadFactory-");
                int i2 = this.f33204b;
                this.f33204b = i2 + 1;
                sb2.append(i2);
                Thread thread2 = new Thread(runnable, sb2.toString());
                thread2.setDaemon(true);
                return thread2;
            case 2:
                O90.m5968f(runnable, "r");
                StringBuilder sb3 = new StringBuilder("SentryReplayIntegration-");
                int i3 = this.f33204b;
                this.f33204b = i3 + 1;
                sb3.append(i3);
                Thread thread3 = new Thread(runnable, sb3.toString());
                thread3.setDaemon(true);
                return thread3;
            case 3:
                O90.m5968f(runnable, "r");
                StringBuilder sb4 = new StringBuilder("SentryWindowRecorder-");
                int i4 = this.f33204b;
                this.f33204b = i4 + 1;
                sb4.append(i4);
                Thread thread4 = new Thread(runnable, sb4.toString());
                thread4.setDaemon(true);
                return thread4;
            case 4:
                O90.m5968f(runnable, "r");
                StringBuilder sb5 = new StringBuilder("SentryReplayPersister-");
                int i5 = this.f33204b;
                this.f33204b = i5 + 1;
                sb5.append(i5);
                Thread thread5 = new Thread(runnable, sb5.toString());
                thread5.setDaemon(true);
                return thread5;
            default:
                StringBuilder sb6 = new StringBuilder("SentryAsyncConnection-");
                int i6 = this.f33204b;
                this.f33204b = i6 + 1;
                sb6.append(i6);
                Thread thread6 = new Thread(runnable, sb6.toString());
                thread6.setDaemon(true);
                return thread6;
        }
    }
}
