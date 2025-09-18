package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.LocationListener;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper;
import io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.location.impl.b */
/* loaded from: classes2.dex */
public final class C5638b implements LastKnownLocationExtractor {

    /* renamed from: a */
    public final Context f32954a;

    /* renamed from: b */
    public final PermissionResolutionStrategy f32955b;

    /* renamed from: c */
    public final LocationListener f32956c;

    /* renamed from: d */
    public final IHandlerExecutor f32957d;

    /* renamed from: e */
    public final C5640d f32958e = new C5640d();

    public C5638b(Context context, PermissionResolutionStrategy permissionResolutionStrategy, LocationListener locationListener, IHandlerExecutor iHandlerExecutor) {
        this.f32954a = context;
        this.f32955b = permissionResolutionStrategy;
        this.f32956c = locationListener;
        this.f32957d = iHandlerExecutor;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor
    public final void updateLastKnownLocation() {
        IGplLibraryWrapper gplLibraryWrapper;
        if (this.f32955b.hasNecessaryPermissions(this.f32954a)) {
            try {
                C5640d c5640d = this.f32958e;
                Context context = this.f32954a;
                LocationListener locationListener = this.f32956c;
                IHandlerExecutor iHandlerExecutor = this.f32957d;
                c5640d.getClass();
                if (ReflectionUtils.detectClassExists("com.google.android.gms.location.LocationRequest")) {
                    try {
                        gplLibraryWrapper = new GplLibraryWrapper(context, locationListener, iHandlerExecutor.getLooper(), iHandlerExecutor, TimeUnit.SECONDS.toMillis(1L));
                    } catch (Throwable unused) {
                    }
                } else {
                    gplLibraryWrapper = new C5637a();
                }
                gplLibraryWrapper.updateLastKnownLocation();
            } catch (Throwable unused2) {
            }
        }
    }
}
