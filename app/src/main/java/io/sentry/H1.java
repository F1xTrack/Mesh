package io.sentry;

import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class H1 {
    public Double a;
    public Double b;
    public final CopyOnWriteArraySet c;
    public final CopyOnWriteArraySet d;
    public String e;
    public String f;
    public final G1 g;
    public final int h;
    public final long i;
    public final long j;
    public final long k;
    public final boolean l;
    public io.sentry.protocol.r m;

    public H1(boolean z, io.sentry.protocol.r rVar) {
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.c = copyOnWriteArraySet;
        this.d = new CopyOnWriteArraySet();
        this.e = null;
        this.f = null;
        this.g = G1.MEDIUM;
        this.h = 1;
        this.i = 30000L;
        this.j = 5000L;
        this.k = 3600000L;
        this.l = true;
        if (z) {
            return;
        }
        d(true);
        c(true);
        copyOnWriteArraySet.add("android.webkit.WebView");
        copyOnWriteArraySet.add("android.widget.VideoView");
        copyOnWriteArraySet.add("androidx.media3.ui.PlayerView");
        copyOnWriteArraySet.add("com.google.android.exoplayer2.ui.PlayerView");
        copyOnWriteArraySet.add("com.google.android.exoplayer2.ui.StyledPlayerView");
        this.m = rVar;
    }

    public final CopyOnWriteArraySet a() {
        return this.c;
    }

    public final CopyOnWriteArraySet b() {
        return this.d;
    }

    public final void c(boolean z) {
        if (z) {
            this.c.add("android.widget.ImageView");
            this.d.remove("android.widget.ImageView");
        } else {
            this.d.add("android.widget.ImageView");
            this.c.remove("android.widget.ImageView");
        }
    }

    public final void d(boolean z) {
        if (z) {
            this.c.add("android.widget.TextView");
            this.d.remove("android.widget.TextView");
        } else {
            this.d.add("android.widget.TextView");
            this.c.remove("android.widget.TextView");
        }
    }

    public final void e(Double d) {
        if (io.sentry.config.a.y(d, true)) {
            this.b = d;
            return;
        }
        throw new IllegalArgumentException("The value " + d + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    public final void f(Double d) {
        if (io.sentry.config.a.y(d, true)) {
            this.a = d;
            return;
        }
        throw new IllegalArgumentException("The value " + d + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }
}
