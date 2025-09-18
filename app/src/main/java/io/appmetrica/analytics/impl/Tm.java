package io.appmetrica.analytics.impl;

import android.os.UserManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;

/* loaded from: classes2.dex */
public final class Tm implements FunctionWithThrowable {
    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable, defpackage.InterfaceC6021n9
    public final Object apply(Object obj) {
        return Boolean.valueOf(((UserManager) obj).isUserUnlocked());
    }
}
