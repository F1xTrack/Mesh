package io.appmetrica.analytics.impl;

import defpackage.F91;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.q5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4806q5 implements PermissionStrategy {
    public final PermissionStrategy[] a;

    public C4806q5(PermissionStrategy... permissionStrategyArr) {
        this.a = permissionStrategyArr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy
    public final boolean forbidUsePermission(String str) {
        for (PermissionStrategy permissionStrategy : this.a) {
            if (permissionStrategy.forbidUsePermission(str)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return F91.v(new StringBuilder("CompositePermissionStrategy(strategies="), Arrays.toString(this.a), ')');
    }
}
