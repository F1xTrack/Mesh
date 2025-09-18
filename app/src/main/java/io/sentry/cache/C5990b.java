package io.sentry.cache;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: io.sentry.cache.b */
/* loaded from: classes2.dex */
public final /* synthetic */ class C5990b implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.endsWith(".envelope");
    }
}
