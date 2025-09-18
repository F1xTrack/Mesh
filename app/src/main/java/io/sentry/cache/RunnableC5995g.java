package io.sentry.cache;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.cache.g */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5995g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f34108a;

    /* renamed from: b */
    public final /* synthetic */ C5996h f34109b;

    /* renamed from: c */
    public final /* synthetic */ ConcurrentHashMap f34110c;

    public /* synthetic */ RunnableC5995g(C5996h c5996h, ConcurrentHashMap concurrentHashMap, int i) {
        this.f34108a = i;
        this.f34109b = c5996h;
        this.f34110c = concurrentHashMap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f34108a) {
            case 0:
                this.f34109b.m21718n(this.f34110c, "tags.json");
                break;
            default:
                this.f34109b.m21718n(this.f34110c, "extras.json");
                break;
        }
    }
}
