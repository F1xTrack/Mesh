package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.billinginterface.internal.BillingType;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import java.lang.reflect.Field;
import java.util.Objects;
import java.util.concurrent.Executor;
import p000.AbstractC11374v51;
import p000.D51;

/* renamed from: io.appmetrica.analytics.impl.fc */
/* loaded from: classes2.dex */
public final class C5121fc extends C5264l5 {

    /* renamed from: m */
    public final C5503uj f31683m;

    public C5121fc(Context context, C4964Z4 c4964z4, C4411C4 c4411c4, AbstractC5089e5 abstractC5089e5, C5155gl c5155gl, InterfaceC4398Bg interfaceC4398Bg, ICommonExecutor iCommonExecutor, int i, C5503uj c5503uj, C5620zb c5620zb) {
        super(context, c4964z4, c4411c4, abstractC5089e5, c5155gl, interfaceC4398Bg, iCommonExecutor, i, c5620zb);
        this.f31683m = c5503uj;
    }

    /* renamed from: a */
    public final C5187i3 m20386a(C5096ec c5096ec) {
        Field field;
        Context context = this.f32123c;
        IHandlerExecutor iHandlerExecutorM21138a = this.f31683m.m21138a();
        Executor executorM21143f = this.f31683m.m21143f();
        String str = null;
        try {
            Class<?> clsFindClass = ReflectionUtils.findClass("com.android.billingclient.BuildConfig");
            str = (String) ((clsFindClass == null || (field = clsFindClass.getField("VERSION_NAME")) == null) ? null : field.get(null));
        } catch (Throwable unused) {
        }
        BillingType billingType = (str == null || AbstractC11374v51.m25328C(str) || D51.m1556o(str, "2.", false) || D51.m1556o(str, "3.", false) || D51.m1556o(str, "4.", false)) ? BillingType.NONE : (!D51.m1556o(str, "5.", false) && D51.m1556o(str, "6.", false)) ? BillingType.LIBRARY_V6 : BillingType.LIBRARY_V6;
        return new C5187i3(context, iHandlerExecutorM21138a, executorM21143f, billingType, new C5087e3(C4789Rl.m19787a(C5411r2.class).m19823a(this.f32123c)), new C5062d3(c5096ec, C5244ka.m20614h().m20636u().m21142e()));
    }

    /* renamed from: b */
    public final C4520Gf m20387b(C5096ec c5096ec) {
        C4494Fd c4494Fd = new C4494Fd(c5096ec);
        Objects.requireNonNull(c5096ec);
        return new C4520Gf(c4494Fd, new C5071dc(c5096ec), c5096ec);
    }
}
