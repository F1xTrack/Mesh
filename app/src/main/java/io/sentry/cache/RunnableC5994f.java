package io.sentry.cache;

import android.content.Context;
import android.view.Choreographer;
import com.android.installreferrer.api.ReferrerDetails;
import com.facebook.react.bridge.Promise;
import com.p018my.tracker.MyTracker;
import com.p018my.tracker.MyTrackerAttribution;
import com.p018my.tracker.obfuscated.C2344n;
import com.p018my.tracker.obfuscated.C2349o0;
import com.p018my.tracker.obfuscated.C2350o1;
import com.p018my.tracker.obfuscated.C2357q0;
import com.p018my.tracker.obfuscated.C2387x2;
import io.appmetrica.analytics.impl.C4815T;
import io.appmetrica.analytics.impl.C5484u0;
import io.appmetrica.analytics.impl.C5570xb;
import io.sentry.C5815W1;
import io.sentry.EnumC6069n1;
import io.sentry.android.core.C5852Y;
import io.sentry.config.AbstractC6003a;
import io.sentry.protocol.C6082E;
import io.sentry.protocol.C6087c;
import io.sentry.protocol.C6104t;
import java.util.Date;
import java.util.List;

/* renamed from: io.sentry.cache.f */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5994f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f34105a;

    /* renamed from: b */
    public final /* synthetic */ Object f34106b;

    /* renamed from: c */
    public final /* synthetic */ Object f34107c;

    public /* synthetic */ RunnableC5994f(Object obj, int i, Object obj2) {
        this.f34105a = i;
        this.f34106b = obj;
        this.f34107c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f34105a) {
            case 0:
                C5996h c5996h = (C5996h) this.f34106b;
                C6082E c6082e = (C6082E) this.f34107c;
                if (c6082e != null) {
                    c5996h.m21718n(c6082e, "user.json");
                    break;
                } else {
                    AbstractC5989a.m21704a(c5996h.f34111a, ".scope-cache", "user.json");
                    break;
                }
            case 1:
                ((C5996h) this.f34106b).m21718n((C6087c) this.f34107c, "contexts.json");
                break;
            case 2:
                ((C5996h) this.f34106b).m21718n((C5815W1) this.f34107c, "breadcrumbs.json");
                break;
            case 3:
                C5996h c5996h2 = (C5996h) this.f34106b;
                String str = (String) this.f34107c;
                if (str != null) {
                    c5996h2.m21718n(str, "transaction.json");
                    break;
                } else {
                    AbstractC5989a.m21704a(c5996h2.f34111a, ".scope-cache", "transaction.json");
                    break;
                }
            case 4:
                Runnable runnable = (Runnable) this.f34107c;
                C5996h c5996h3 = (C5996h) this.f34106b;
                c5996h3.getClass();
                try {
                    runnable.run();
                    break;
                } catch (Throwable th) {
                    c5996h3.f34111a.getLogger().mo21406d(EnumC6069n1.ERROR, "Serialization task failed", th);
                    return;
                }
            case 5:
                ((C5996h) this.f34106b).m21718n((C6104t) this.f34107c, "replay.json");
                break;
            case 6:
                final C5852Y c5852y = (C5852Y) this.f34106b;
                final Promise promise = (Promise) this.f34107c;
                try {
                    Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: io.sentry.react.k
                        @Override // android.view.Choreographer.FrameCallback
                        public final void doFrame(long j) {
                            c5852y.getClass();
                            Date dateM21752k = AbstractC6003a.m21752k();
                            System.nanoTime();
                            promise.resolve(Double.valueOf((dateM21752k.getTime() * 1000000) / 1.0E9d));
                        }
                    });
                    break;
                } catch (Exception e) {
                    promise.reject("Failed to receive the instance of Choreographer", e);
                    return;
                }
            case 7:
                C2344n.m13318a((MyTracker.AttributionListener) this.f34106b, (MyTrackerAttribution) this.f34107c);
                break;
            case 8:
                ((C2349o0) this.f34106b).m13356a((List) this.f34107c);
                break;
            case 9:
                ((C2350o1) this.f34106b).m13368b((List) this.f34107c);
                break;
            case 10:
                ((C2357q0) this.f34106b).m13396b((ReferrerDetails) this.f34107c);
                break;
            case 11:
                C5484u0.m21106a((C5484u0) this.f34106b, (Context) this.f34107c);
                break;
            case 12:
                ((C2387x2) this.f34106b).m13549a((Runnable) this.f34107c);
                break;
            default:
                C5570xb.m21205a((C5570xb) this.f34106b, (C4815T) this.f34107c);
                break;
        }
    }
}
