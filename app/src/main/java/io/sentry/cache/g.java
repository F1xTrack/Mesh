package io.sentry.cache;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h b;
    public final /* synthetic */ ConcurrentHashMap c;

    public /* synthetic */ g(h hVar, ConcurrentHashMap concurrentHashMap, int i) {
        this.a = i;
        this.b = hVar;
        this.c = concurrentHashMap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.n(this.c, "tags.json");
                break;
            default:
                this.b.n(this.c, "extras.json");
                break;
        }
    }
}
