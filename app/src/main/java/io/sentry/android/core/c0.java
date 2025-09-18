package io.sentry.android.core;

import java.io.File;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final /* synthetic */ class c0 implements Comparator {
    public final /* synthetic */ int a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                io.sentry.T t = (io.sentry.T) obj;
                io.sentry.T t2 = (io.sentry.T) obj2;
                int iCompareTo = t.q().compareTo(t2.q());
                return iCompareTo != 0 ? iCompareTo : t.n().b.a.compareTo(t2.n().b.a);
            default:
                return Long.compare(((File) obj).lastModified(), ((File) obj2).lastModified());
        }
    }
}
