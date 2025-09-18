package io.sentry.android.core;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Bundle;
import io.sentry.AbstractC5802S0;
import io.sentry.C5754C;
import io.sentry.C6059l1;
import io.sentry.EnumC6069n1;

/* loaded from: classes2.dex */
public final class SentryInitProvider extends AbstractC5836H {
    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        if (SentryInitProvider.class.getName().equals(providerInfo.authority)) {
            throw new IllegalStateException("An applicationId is required to fulfill the manifest placeholder.");
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Bundle bundleM21628i;
        C5847T c5847t = new C5847T();
        Context context = getContext();
        if (context == null) {
            c5847t.mo21407k(EnumC6069n1.FATAL, "App. Context from ContentProvider is null", new Object[0]);
            return false;
        }
        try {
            bundleM21628i = AbstractC5911t.m21628i(context, c5847t, null);
        } catch (Throwable th) {
            c5847t.mo21406d(EnumC6069n1.ERROR, "Failed to read auto-init from android manifest metadata.", th);
        }
        boolean zM21632m = bundleM21628i != null ? AbstractC5911t.m21632m(bundleM21628i, c5847t, "io.sentry.auto-init", true) : true;
        if (zM21632m) {
            AbstractC5851X.m21555b(context, c5847t, new C5754C(4));
            C6059l1.m21830v().m21831l("AutoInit");
        }
        return true;
    }

    @Override // android.content.ContentProvider
    public final void shutdown() {
        AbstractC5802S0.m21463a();
    }
}
