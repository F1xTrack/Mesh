package io.appmetrica.analytics.impl;

import android.content.Context;
import android.net.ConnectivityManager;
import io.appmetrica.analytics.coreapi.internal.p026io.IExecutionPolicy;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.EnumSet;

/* renamed from: io.appmetrica.analytics.impl.u9 */
/* loaded from: classes2.dex */
public final class C5493u9 implements IExecutionPolicy {

    /* renamed from: c */
    public static final EnumSet f32678c = EnumSet.of(EnumC4925Xd.OFFLINE);

    /* renamed from: a */
    public final C5514v5 f32679a = new C5514v5();

    /* renamed from: b */
    public final Context f32680b;

    public C5493u9(Context context) {
        this.f32680b = context;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.p026io.IExecutionPolicy
    public final boolean canBeExecuted() {
        C5514v5 c5514v5 = this.f32679a;
        Context context = this.f32680b;
        c5514v5.getClass();
        SafePackageManager safePackageManager = AbstractC4949Yd.f31112a;
        return !f32678c.contains((EnumC4925Xd) SystemServiceUtils.accessSystemServiceSafelyOrDefault((ConnectivityManager) context.getSystemService("connectivity"), "getting connection type", "ConnectivityManager", EnumC4925Xd.UNDEFINED, new C4901Wd()));
    }
}
