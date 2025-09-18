package io.sentry.android.replay.viewhierarchy;

import android.graphics.Rect;
import io.sentry.android.replay.util.C5962a;
import io.sentry.android.replay.util.InterfaceC5965d;

/* renamed from: io.sentry.android.replay.viewhierarchy.d */
/* loaded from: classes2.dex */
public final class C5973d extends AbstractC5974e {

    /* renamed from: g */
    public final InterfaceC5965d f34056g;

    /* renamed from: h */
    public final Integer f34057h;

    /* renamed from: i */
    public final int f34058i;

    /* renamed from: j */
    public final int f34059j;

    public /* synthetic */ C5973d(C5962a c5962a, Integer num, float f, float f2, int i, int i2, float f3, int i3, AbstractC5974e abstractC5974e, boolean z, boolean z2, Rect rect) {
        this(c5962a, num, 0, 0, f, f2, i, i2, f3, i3, abstractC5974e, z, true, z2, rect);
    }

    public C5973d(InterfaceC5965d interfaceC5965d, Integer num, int i, int i2, float f, float f2, int i3, int i4, float f3, int i5, AbstractC5974e abstractC5974e, boolean z, boolean z2, boolean z3, Rect rect) {
        super(i3, i4, f3, abstractC5974e, z, rect);
        this.f34056g = interfaceC5965d;
        this.f34057h = num;
        this.f34058i = i;
        this.f34059j = i2;
    }
}
