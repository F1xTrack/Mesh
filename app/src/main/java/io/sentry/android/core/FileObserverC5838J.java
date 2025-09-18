package io.sentry.android.core;

import android.os.FileObserver;
import io.sentry.C5752B0;
import io.sentry.C6193y;
import io.sentry.EnumC6069n1;
import io.sentry.ILogger;
import io.sentry.config.AbstractC6003a;
import java.io.File;
import p000.AbstractC1374Vq;
import p000.AbstractC7222ym;

/* renamed from: io.sentry.android.core.J */
/* loaded from: classes2.dex */
public final class FileObserverC5838J extends FileObserver {

    /* renamed from: a */
    public final String f33546a;

    /* renamed from: b */
    public final C5752B0 f33547b;

    /* renamed from: c */
    public final ILogger f33548c;

    /* renamed from: d */
    public final long f33549d;

    public FileObserverC5838J(String str, C5752B0 c5752b0, ILogger iLogger, long j) {
        super(str);
        this.f33546a = str;
        this.f33547b = c5752b0;
        AbstractC6003a.m21735D(iLogger, "Logger is required.");
        this.f33548c = iLogger;
        this.f33549d = j;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i, String str) {
        if (str == null || i != 8) {
            return;
        }
        EnumC6069n1 enumC6069n1 = EnumC6069n1.DEBUG;
        Integer numValueOf = Integer.valueOf(i);
        String str2 = this.f33546a;
        ILogger iLogger = this.f33548c;
        iLogger.mo21407k(enumC6069n1, "onEvent fired for EnvelopeFileObserver with event type %d on path: %s for file %s.", numValueOf, str2, str);
        C6193y c6193yM21743b = AbstractC6003a.m21743b(new C5837I(this.f33549d, iLogger));
        String strM8593l = AbstractC1374Vq.m8593l(AbstractC7222ym.m26238o(str2), File.separator, str);
        C5752B0 c5752b0 = this.f33547b;
        c5752b0.getClass();
        AbstractC6003a.m21735D(strM8593l, "Path is required.");
        c5752b0.mo21360b(new File(strM8593l), c6193yM21743b);
    }
}
