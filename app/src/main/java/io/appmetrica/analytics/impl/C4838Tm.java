package io.appmetrica.analytics.impl;

import android.os.UserManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;

/* renamed from: io.appmetrica.analytics.impl.Tm */
/* loaded from: classes2.dex */
public final class C4838Tm implements FunctionWithThrowable {
    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable, p000.InterfaceC6471n9
    public final Object apply(Object obj) {
        return Boolean.valueOf(((UserManager) obj).isUserUnlocked());
    }
}
