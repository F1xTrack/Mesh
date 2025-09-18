package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.AbstractC7538v51;
import defpackage.D51;
import io.appmetrica.analytics.billinginterface.internal.BillingType;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import java.lang.reflect.Field;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: io.appmetrica.analytics.impl.fc */
/* loaded from: classes2.dex */
public final class C4550fc extends C4686l5 {
    public final C4915uj m;

    public C4550fc(Context context, Z4 z4, C4 c4, AbstractC4519e5 abstractC4519e5, C4583gl c4583gl, Bg bg, ICommonExecutor iCommonExecutor, int i, C4915uj c4915uj, C5027zb c5027zb) {
        super(context, z4, c4, abstractC4519e5, c4583gl, bg, iCommonExecutor, i, c5027zb);
        this.m = c4915uj;
    }

    public final C4613i3 a(C4526ec c4526ec) {
        Field field;
        Context context = this.c;
        IHandlerExecutor iHandlerExecutorA = this.m.a();
        Executor executorF = this.m.f();
        String str = null;
        try {
            Class<?> clsFindClass = ReflectionUtils.findClass("com.android.billingclient.BuildConfig");
            str = (String) ((clsFindClass == null || (field = clsFindClass.getField("VERSION_NAME")) == null) ? null : field.get(null));
        } catch (Throwable unused) {
        }
        BillingType billingType = (str == null || AbstractC7538v51.C(str) || D51.o(str, "2.", false) || D51.o(str, "3.", false) || D51.o(str, "4.", false)) ? BillingType.NONE : (!D51.o(str, "5.", false) && D51.o(str, "6.", false)) ? BillingType.LIBRARY_V6 : BillingType.LIBRARY_V6;
        return new C4613i3(context, iHandlerExecutorA, executorF, billingType, new C4517e3(Rl.a(C4826r2.class).a(this.c)), new C4492d3(c4526ec, C4667ka.h().u().e()));
    }

    public final Gf b(C4526ec c4526ec) {
        Fd fd = new Fd(c4526ec);
        Objects.requireNonNull(c4526ec);
        return new Gf(fd, new C4501dc(c4526ec), c4526ec);
    }
}
