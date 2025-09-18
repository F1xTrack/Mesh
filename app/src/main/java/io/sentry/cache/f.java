package io.sentry.cache;

import android.content.Context;
import android.view.Choreographer;
import com.android.installreferrer.api.ReferrerDetails;
import com.facebook.react.bridge.Promise;
import com.my.tracker.MyTracker;
import com.my.tracker.MyTrackerAttribution;
import com.my.tracker.obfuscated.n;
import com.my.tracker.obfuscated.o0;
import com.my.tracker.obfuscated.o1;
import com.my.tracker.obfuscated.q0;
import com.my.tracker.obfuscated.x2;
import io.appmetrica.analytics.impl.C4896u0;
import io.appmetrica.analytics.impl.C4979xb;
import io.appmetrica.analytics.impl.T;
import io.sentry.EnumC5148n1;
import io.sentry.W1;
import io.sentry.android.core.Y;
import io.sentry.protocol.C5157c;
import io.sentry.protocol.E;
import io.sentry.protocol.t;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h hVar = (h) this.b;
                E e = (E) this.c;
                if (e != null) {
                    hVar.n(e, "user.json");
                    break;
                } else {
                    a.a(hVar.a, ".scope-cache", "user.json");
                    break;
                }
            case 1:
                ((h) this.b).n((C5157c) this.c, "contexts.json");
                break;
            case 2:
                ((h) this.b).n((W1) this.c, "breadcrumbs.json");
                break;
            case 3:
                h hVar2 = (h) this.b;
                String str = (String) this.c;
                if (str != null) {
                    hVar2.n(str, "transaction.json");
                    break;
                } else {
                    a.a(hVar2.a, ".scope-cache", "transaction.json");
                    break;
                }
            case 4:
                Runnable runnable = (Runnable) this.c;
                h hVar3 = (h) this.b;
                hVar3.getClass();
                try {
                    runnable.run();
                    break;
                } catch (Throwable th) {
                    hVar3.a.getLogger().d(EnumC5148n1.ERROR, "Serialization task failed", th);
                    return;
                }
            case 5:
                ((h) this.b).n((t) this.c, "replay.json");
                break;
            case 6:
                final Y y = (Y) this.b;
                final Promise promise = (Promise) this.c;
                try {
                    Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: io.sentry.react.k
                        @Override // android.view.Choreographer.FrameCallback
                        public final void doFrame(long j) {
                            y.getClass();
                            Date dateK = io.sentry.config.a.k();
                            System.nanoTime();
                            promise.resolve(Double.valueOf((dateK.getTime() * 1000000) / 1.0E9d));
                        }
                    });
                    break;
                } catch (Exception e2) {
                    promise.reject("Failed to receive the instance of Choreographer", e2);
                    return;
                }
            case 7:
                n.a((MyTracker.AttributionListener) this.b, (MyTrackerAttribution) this.c);
                break;
            case 8:
                ((o0) this.b).a((List) this.c);
                break;
            case 9:
                ((o1) this.b).b((List) this.c);
                break;
            case 10:
                ((q0) this.b).b((ReferrerDetails) this.c);
                break;
            case 11:
                C4896u0.a((C4896u0) this.b, (Context) this.c);
                break;
            case 12:
                ((x2) this.b).a((Runnable) this.c);
                break;
            default:
                C4979xb.a((C4979xb) this.b, (T) this.c);
                break;
        }
    }
}
