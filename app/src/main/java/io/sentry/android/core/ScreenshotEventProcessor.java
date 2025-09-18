package io.sentry.android.core;

import android.app.Activity;
import com.reactnativecommunity.clipboard.ClipboardModule;
import io.sentry.C5765F1;
import io.sentry.C5825a;
import io.sentry.C6039i1;
import io.sentry.C6193y;
import io.sentry.EnumC6069n1;
import io.sentry.InterfaceC6165u;
import io.sentry.android.core.internal.util.C5884d;
import io.sentry.config.AbstractC6003a;
import io.sentry.protocol.C6078A;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class ScreenshotEventProcessor implements InterfaceC6165u {

    /* renamed from: a */
    public final SentryAndroidOptions f33592a;

    /* renamed from: b */
    public final C5832D f33593b;

    /* renamed from: c */
    public final C5884d f33594c;

    public ScreenshotEventProcessor(SentryAndroidOptions sentryAndroidOptions, C5832D c5832d) {
        AbstractC6003a.m21735D(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f33592a = sentryAndroidOptions;
        this.f33593b = c5832d;
        this.f33594c = new C5884d(2000L, 3);
        if (sentryAndroidOptions.isAttachScreenshot()) {
            AbstractC6003a.m21742a("Screenshot");
        }
    }

    @Override // io.sentry.InterfaceC6165u
    /* renamed from: a */
    public final C5765F1 mo21517a(C5765F1 c5765f1, C6193y c6193y) {
        return c5765f1;
    }

    @Override // io.sentry.InterfaceC6165u
    /* renamed from: c */
    public final C6039i1 mo21519c(C6039i1 c6039i1, C6193y c6193y) {
        byte[] bArrM21739H;
        if (!c6039i1.m21788c()) {
            return c6039i1;
        }
        SentryAndroidOptions sentryAndroidOptions = this.f33592a;
        if (!sentryAndroidOptions.isAttachScreenshot()) {
            sentryAndroidOptions.getLogger().mo21407k(EnumC6069n1.DEBUG, "attachScreenshot is disabled.", new Object[0]);
            return c6039i1;
        }
        WeakReference weakReference = (WeakReference) C5832D.f33521b.f33522a;
        Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
        if (activity != null && !AbstractC6003a.m21763w(c6193y)) {
            boolean zM21583a = this.f33594c.m21583a();
            sentryAndroidOptions.getBeforeScreenshotCaptureCallback();
            if (zM21583a || (bArrM21739H = AbstractC6003a.m21739H(activity, sentryAndroidOptions.getMainThreadChecker(), sentryAndroidOptions.getLogger(), this.f33593b)) == null) {
                return c6039i1;
            }
            c6193y.f34741c = new C5825a("screenshot.png", ClipboardModule.MIMETYPE_PNG, bArrM21739H);
            c6193y.m21928c(activity, "android:activity");
        }
        return c6039i1;
    }

    @Override // io.sentry.InterfaceC6165u
    /* renamed from: e */
    public final C6078A mo21521e(C6078A c6078a, C6193y c6193y) {
        return c6078a;
    }
}
