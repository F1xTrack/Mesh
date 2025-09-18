package io.sentry.android.replay;

import io.sentry.rrweb.AbstractC6131b;
import java.util.Comparator;
import p000.GT1;

/* renamed from: io.sentry.android.replay.g */
/* loaded from: classes2.dex */
public final class C5945g implements Comparator {

    /* renamed from: a */
    public final /* synthetic */ int f33974a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f33974a) {
            case 0:
                return GT1.m3070b(Long.valueOf(((C5951k) obj).f33998b), Long.valueOf(((C5951k) obj2).f33998b));
            default:
                return GT1.m3070b(Long.valueOf(((AbstractC6131b) obj).f34561b), Long.valueOf(((AbstractC6131b) obj2).f34561b));
        }
    }
}
