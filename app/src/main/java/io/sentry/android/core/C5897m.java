package io.sentry.android.core;

import io.sentry.EnumC6069n1;
import io.sentry.android.core.cache.C5860a;
import io.sentry.util.InterfaceC6169b;
import java.io.File;

/* renamed from: io.sentry.android.core.m */
/* loaded from: classes2.dex */
public final /* synthetic */ class C5897m implements InterfaceC6169b {

    /* renamed from: a */
    public final /* synthetic */ SentryAndroidOptions f33794a;

    @Override // io.sentry.util.InterfaceC6169b
    /* renamed from: c */
    public Object mo3171c() {
        boolean z = false;
        int i = C5860a.f33658i;
        SentryAndroidOptions sentryAndroidOptions = this.f33794a;
        String outboxPath = sentryAndroidOptions.getOutboxPath();
        if (outboxPath == null) {
            sentryAndroidOptions.getLogger().mo21407k(EnumC6069n1.DEBUG, "Outbox path is null, the startup crash marker file does not exist", new Object[0]);
        } else {
            File file = new File(outboxPath, "startup_crash");
            try {
                boolean zExists = file.exists();
                if (zExists && !file.delete()) {
                    sentryAndroidOptions.getLogger().mo21407k(EnumC6069n1.ERROR, "Failed to delete the startup crash marker file. %s.", file.getAbsolutePath());
                }
                z = zExists;
            } catch (Throwable th) {
                sentryAndroidOptions.getLogger().mo21406d(EnumC6069n1.ERROR, "Error reading/deleting the startup crash marker file on the disk", th);
            }
        }
        return Boolean.valueOf(z);
    }
}
