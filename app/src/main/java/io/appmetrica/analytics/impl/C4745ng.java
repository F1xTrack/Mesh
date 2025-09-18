package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.backport.Function;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.ng */
/* loaded from: classes2.dex */
public final class C4745ng {
    public final Context a;
    public final ICommonExecutor b;
    public final C4781p4 c;
    public final X9 d;

    public C4745ng(Context context, C4781p4 c4781p4, IHandlerExecutor iHandlerExecutor, X9 x9) {
        this.a = context;
        this.b = iHandlerExecutor;
        this.c = c4781p4;
        this.d = x9;
    }

    public final void a(C4944w0 c4944w0, Consumer consumer, Function function) {
        ICommonExecutor iCommonExecutor = this.b;
        X9 x9 = this.d;
        String str = c4944w0.d;
        x9.getClass();
        iCommonExecutor.execute(new Cif(new File(str), new C4599hd(new C4623id(c4944w0.a, c4944w0.b), new C4575gd()), consumer, new C4721mg(this, c4944w0.f, function)));
    }
}
