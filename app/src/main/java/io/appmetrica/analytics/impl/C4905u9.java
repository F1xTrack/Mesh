package io.appmetrica.analytics.impl;

import android.content.Context;
import android.net.ConnectivityManager;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.EnumSet;

/* renamed from: io.appmetrica.analytics.impl.u9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4905u9 implements IExecutionPolicy {
    public static final EnumSet c = EnumSet.of(Xd.OFFLINE);
    public final C4925v5 a = new C4925v5();
    public final Context b;

    public C4905u9(Context context) {
        this.b = context;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final boolean canBeExecuted() {
        C4925v5 c4925v5 = this.a;
        Context context = this.b;
        c4925v5.getClass();
        SafePackageManager safePackageManager = Yd.a;
        return !c.contains((Xd) SystemServiceUtils.accessSystemServiceSafelyOrDefault((ConnectivityManager) context.getSystemService("connectivity"), "getting connection type", "ConnectivityManager", Xd.UNDEFINED, new Wd()));
    }
}
