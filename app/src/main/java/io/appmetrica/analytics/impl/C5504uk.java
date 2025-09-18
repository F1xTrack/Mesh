package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;

/* renamed from: io.appmetrica.analytics.impl.uk */
/* loaded from: classes2.dex */
public final class C5504uk implements PermissionExtractor {

    /* renamed from: b */
    public static final String f32705b = "[SimplePermissionExtractor]";

    /* renamed from: a */
    public final PermissionStrategy f32706a;

    public C5504uk(PermissionStrategy permissionStrategy) {
        this.f32706a = permissionStrategy;
    }

    /* renamed from: a */
    public final PermissionStrategy m21144a() {
        return this.f32706a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor
    public final boolean hasPermission(Context context, String str) {
        if (this.f32706a.forbidUsePermission(str)) {
            return false;
        }
        try {
            return context.checkCallingOrSelfPermission(str) == 0;
        } catch (Throwable unused) {
            return false;
        }
    }
}
