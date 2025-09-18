package io.sentry.android.replay.viewhierarchy;

import android.graphics.Rect;

/* loaded from: classes2.dex */
public final class d extends e {
    public final io.sentry.android.replay.util.d g;
    public final Integer h;
    public final int i;
    public final int j;

    public /* synthetic */ d(io.sentry.android.replay.util.a aVar, Integer num, float f, float f2, int i, int i2, float f3, int i3, e eVar, boolean z, boolean z2, Rect rect) {
        this(aVar, num, 0, 0, f, f2, i, i2, f3, i3, eVar, z, true, z2, rect);
    }

    public d(io.sentry.android.replay.util.d dVar, Integer num, int i, int i2, float f, float f2, int i3, int i4, float f3, int i5, e eVar, boolean z, boolean z2, boolean z3, Rect rect) {
        super(i3, i4, f3, eVar, z, rect);
        this.g = dVar;
        this.h = num;
        this.i = i;
        this.j = i2;
    }
}
