package io.appmetrica.analytics.remotepermissions.impl;

import defpackage.SN;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import java.util.Set;

/* loaded from: classes2.dex */
public final class e implements PermissionStrategy {
    public Set a = SN.a;

    public final synchronized void a(Set<String> set) {
        this.a = set;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy
    public final synchronized boolean forbidUsePermission(String str) {
        return !this.a.contains(str);
    }
}
