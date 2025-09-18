package io.sentry.android.replay.capture;

import defpackage.GT1;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final class g implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return GT1.b(Long.valueOf(((io.sentry.rrweb.b) obj).b), Long.valueOf(((io.sentry.rrweb.b) obj2).b));
    }
}
