package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.LocationListener;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;

/* renamed from: io.appmetrica.analytics.location.impl.v */
/* loaded from: classes2.dex */
public final class C5658v implements LastKnownLocationExtractorProvider {

    /* renamed from: a */
    public final String f33005a;

    /* renamed from: b */
    public final InterfaceC5655s f33006b;

    /* renamed from: c */
    public final String f33007c;

    public C5658v(String str, InterfaceC5655s interfaceC5655s, String str2) {
        this.f33005a = str;
        this.f33006b = interfaceC5655s;
        this.f33007c = str2;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5657u getExtractor(Context context, PermissionExtractor permissionExtractor, IHandlerExecutor iHandlerExecutor, LocationListener locationListener) {
        return new C5657u(context, this.f33006b.mo21260a(permissionExtractor), locationListener, this.f33005a);
    }

    @Override // io.appmetrica.analytics.locationapi.internal.Identifiable
    public final String getIdentifier() {
        return this.f33007c;
    }
}
