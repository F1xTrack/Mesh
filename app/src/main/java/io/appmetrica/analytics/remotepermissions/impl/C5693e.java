package io.appmetrica.analytics.remotepermissions.impl;

import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import java.util.Set;
import p000.C1156SN;

/* renamed from: io.appmetrica.analytics.remotepermissions.impl.e */
/* loaded from: classes2.dex */
public final class C5693e implements PermissionStrategy {

    /* renamed from: a */
    public Set f33190a = C1156SN.f10705a;

    /* renamed from: a */
    public final synchronized void m21305a(Set<String> set) {
        this.f33190a = set;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy
    public final synchronized boolean forbidUsePermission(String str) {
        return !this.f33190a.contains(str);
    }
}
