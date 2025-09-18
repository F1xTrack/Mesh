package io.sentry.android.replay.video;

import android.media.MediaMuxer;
import java.util.concurrent.TimeUnit;

/* renamed from: io.sentry.android.replay.video.b */
/* loaded from: classes2.dex */
public final class C5968b {

    /* renamed from: a */
    public final long f34048a;

    /* renamed from: b */
    public final MediaMuxer f34049b;

    /* renamed from: c */
    public boolean f34050c;

    /* renamed from: d */
    public int f34051d;

    /* renamed from: e */
    public int f34052e;

    /* renamed from: f */
    public long f34053f;

    public C5968b(String str, float f) {
        this.f34048a = (long) (TimeUnit.SECONDS.toMicros(1L) / f);
        this.f34049b = new MediaMuxer(str, 0);
    }
}
