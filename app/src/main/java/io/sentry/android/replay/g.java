package io.sentry.android.replay;

import defpackage.GT1;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final class g implements Comparator {
    public final /* synthetic */ int a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return GT1.b(Long.valueOf(((k) obj).b), Long.valueOf(((k) obj2).b));
            default:
                return GT1.b(Long.valueOf(((io.sentry.rrweb.b) obj).b), Long.valueOf(((io.sentry.rrweb.b) obj2).b));
        }
    }
}
