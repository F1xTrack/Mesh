package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.HashSet;

/* loaded from: classes2.dex */
public final class E6 implements DataSendingRestrictionController {
    public final C6 a;
    public Boolean b;
    public final HashSet c = new HashSet();
    public final HashSet d = new HashSet();

    public E6(C6 c6) {
        this.a = c6;
        this.b = ((D6) c6).a();
    }

    public final synchronized void a(Boolean bool) {
        try {
            if (hn.a(bool) || this.b == null) {
                boolean zEquals = Boolean.FALSE.equals(bool);
                this.b = Boolean.valueOf(zEquals);
                ((D6) this.a).a.b(zEquals).b();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final boolean isRestrictedForBackgroundDataCollection() {
        Boolean bool = this.b;
        return bool == null ? !this.c.isEmpty() || this.d.isEmpty() : bool.booleanValue();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final synchronized boolean isRestrictedForReporter() {
        Boolean bool;
        try {
            bool = this.b;
        } finally {
        }
        return bool == null ? this.d.isEmpty() && this.c.isEmpty() : bool.booleanValue();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final synchronized boolean isRestrictedForSdk() {
        Boolean bool;
        try {
            bool = this.b;
        } catch (Throwable th) {
            throw th;
        }
        return bool == null ? this.d.isEmpty() : bool.booleanValue();
    }

    public final synchronized void a(String str, Boolean bool) {
        try {
            if (hn.a(bool) || (!this.d.contains(str) && !this.c.contains(str))) {
                if (((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue()) {
                    this.d.add(str);
                    this.c.remove(str);
                } else {
                    this.c.add(str);
                    this.d.remove(str);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
