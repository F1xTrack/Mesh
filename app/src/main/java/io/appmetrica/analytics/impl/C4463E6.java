package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.HashSet;

/* renamed from: io.appmetrica.analytics.impl.E6 */
/* loaded from: classes2.dex */
public final class C4463E6 implements DataSendingRestrictionController {

    /* renamed from: a */
    public final InterfaceC4413C6 f30050a;

    /* renamed from: b */
    public Boolean f30051b;

    /* renamed from: c */
    public final HashSet f30052c = new HashSet();

    /* renamed from: d */
    public final HashSet f30053d = new HashSet();

    public C4463E6(InterfaceC4413C6 interfaceC4413C6) {
        this.f30050a = interfaceC4413C6;
        this.f30051b = ((C4438D6) interfaceC4413C6).m19310a();
    }

    /* renamed from: a */
    public final synchronized void m19338a(Boolean bool) {
        try {
            if (AbstractC5182hn.m20511a(bool) || this.f30051b == null) {
                boolean zEquals = Boolean.FALSE.equals(bool);
                this.f30051b = Boolean.valueOf(zEquals);
                ((C4438D6) this.f30050a).f29999a.m20966b(zEquals).m20875b();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final boolean isRestrictedForBackgroundDataCollection() {
        Boolean bool = this.f30051b;
        return bool == null ? !this.f30052c.isEmpty() || this.f30053d.isEmpty() : bool.booleanValue();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final synchronized boolean isRestrictedForReporter() {
        Boolean bool;
        try {
            bool = this.f30051b;
        } finally {
        }
        return bool == null ? this.f30053d.isEmpty() && this.f30052c.isEmpty() : bool.booleanValue();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final synchronized boolean isRestrictedForSdk() {
        Boolean bool;
        try {
            bool = this.f30051b;
        } catch (Throwable th) {
            throw th;
        }
        return bool == null ? this.f30053d.isEmpty() : bool.booleanValue();
    }

    /* renamed from: a */
    public final synchronized void m19339a(String str, Boolean bool) {
        try {
            if (AbstractC5182hn.m20511a(bool) || (!this.f30053d.contains(str) && !this.f30052c.contains(str))) {
                if (((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue()) {
                    this.f30053d.add(str);
                    this.f30052c.remove(str);
                } else {
                    this.f30052c.add(str);
                    this.f30053d.remove(str);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
