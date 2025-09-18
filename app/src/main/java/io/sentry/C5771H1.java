package io.sentry;

import io.sentry.config.AbstractC6003a;
import io.sentry.protocol.C6102r;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: io.sentry.H1 */
/* loaded from: classes2.dex */
public final class C5771H1 {

    /* renamed from: a */
    public Double f33283a;

    /* renamed from: b */
    public Double f33284b;

    /* renamed from: c */
    public final CopyOnWriteArraySet f33285c;

    /* renamed from: d */
    public final CopyOnWriteArraySet f33286d;

    /* renamed from: e */
    public String f33287e;

    /* renamed from: f */
    public String f33288f;

    /* renamed from: g */
    public final EnumC5768G1 f33289g;

    /* renamed from: h */
    public final int f33290h;

    /* renamed from: i */
    public final long f33291i;

    /* renamed from: j */
    public final long f33292j;

    /* renamed from: k */
    public final long f33293k;

    /* renamed from: l */
    public final boolean f33294l;

    /* renamed from: m */
    public C6102r f33295m;

    public C5771H1(boolean z, C6102r c6102r) {
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.f33285c = copyOnWriteArraySet;
        this.f33286d = new CopyOnWriteArraySet();
        this.f33287e = null;
        this.f33288f = null;
        this.f33289g = EnumC5768G1.MEDIUM;
        this.f33290h = 1;
        this.f33291i = 30000L;
        this.f33292j = 5000L;
        this.f33293k = 3600000L;
        this.f33294l = true;
        if (z) {
            return;
        }
        m21398d(true);
        m21397c(true);
        copyOnWriteArraySet.add("android.webkit.WebView");
        copyOnWriteArraySet.add("android.widget.VideoView");
        copyOnWriteArraySet.add("androidx.media3.ui.PlayerView");
        copyOnWriteArraySet.add("com.google.android.exoplayer2.ui.PlayerView");
        copyOnWriteArraySet.add("com.google.android.exoplayer2.ui.StyledPlayerView");
        this.f33295m = c6102r;
    }

    /* renamed from: a */
    public final CopyOnWriteArraySet m21395a() {
        return this.f33285c;
    }

    /* renamed from: b */
    public final CopyOnWriteArraySet m21396b() {
        return this.f33286d;
    }

    /* renamed from: c */
    public final void m21397c(boolean z) {
        if (z) {
            this.f33285c.add("android.widget.ImageView");
            this.f33286d.remove("android.widget.ImageView");
        } else {
            this.f33286d.add("android.widget.ImageView");
            this.f33285c.remove("android.widget.ImageView");
        }
    }

    /* renamed from: d */
    public final void m21398d(boolean z) {
        if (z) {
            this.f33285c.add("android.widget.TextView");
            this.f33286d.remove("android.widget.TextView");
        } else {
            this.f33286d.add("android.widget.TextView");
            this.f33285c.remove("android.widget.TextView");
        }
    }

    /* renamed from: e */
    public final void m21399e(Double d) {
        if (AbstractC6003a.m21764y(d, true)) {
            this.f33284b = d;
            return;
        }
        throw new IllegalArgumentException("The value " + d + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    /* renamed from: f */
    public final void m21400f(Double d) {
        if (AbstractC6003a.m21764y(d, true)) {
            this.f33283a = d;
            return;
        }
        throw new IllegalArgumentException("The value " + d + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }
}
