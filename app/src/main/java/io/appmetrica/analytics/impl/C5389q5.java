package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import java.util.Arrays;
import p000.F91;

/* renamed from: io.appmetrica.analytics.impl.q5 */
/* loaded from: classes2.dex */
public final class C5389q5 implements PermissionStrategy {

    /* renamed from: a */
    public final PermissionStrategy[] f32434a;

    public C5389q5(PermissionStrategy... permissionStrategyArr) {
        this.f32434a = permissionStrategyArr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy
    public final boolean forbidUsePermission(String str) {
        for (PermissionStrategy permissionStrategy : this.f32434a) {
            if (permissionStrategy.forbidUsePermission(str)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return F91.m2539v(new StringBuilder("CompositePermissionStrategy(strategies="), Arrays.toString(this.f32434a), ')');
    }
}
