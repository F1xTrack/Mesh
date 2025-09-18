package io.sentry.android.core;

import io.sentry.EnumC5148n1;
import java.io.File;

/* renamed from: io.sentry.android.core.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C5096m implements io.sentry.util.b {
    public final /* synthetic */ SentryAndroidOptions a;

    @Override // io.sentry.util.b
    public Object c() {
        boolean z = false;
        int i = io.sentry.android.core.cache.a.i;
        SentryAndroidOptions sentryAndroidOptions = this.a;
        String outboxPath = sentryAndroidOptions.getOutboxPath();
        if (outboxPath == null) {
            sentryAndroidOptions.getLogger().k(EnumC5148n1.DEBUG, "Outbox path is null, the startup crash marker file does not exist", new Object[0]);
        } else {
            File file = new File(outboxPath, "startup_crash");
            try {
                boolean zExists = file.exists();
                if (zExists && !file.delete()) {
                    sentryAndroidOptions.getLogger().k(EnumC5148n1.ERROR, "Failed to delete the startup crash marker file. %s.", file.getAbsolutePath());
                }
                z = zExists;
            } catch (Throwable th) {
                sentryAndroidOptions.getLogger().d(EnumC5148n1.ERROR, "Error reading/deleting the startup crash marker file on the disk", th);
            }
        }
        return Boolean.valueOf(z);
    }
}
