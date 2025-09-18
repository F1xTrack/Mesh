package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.backport.Function;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.ng */
/* loaded from: classes2.dex */
public final class C5325ng {

    /* renamed from: a */
    public final Context f32293a;

    /* renamed from: b */
    public final ICommonExecutor f32294b;

    /* renamed from: c */
    public final C5363p4 f32295c;

    /* renamed from: d */
    public final C4921X9 f32296d;

    public C5325ng(Context context, C5363p4 c5363p4, IHandlerExecutor iHandlerExecutor, C4921X9 c4921x9) {
        this.f32293a = context;
        this.f32294b = iHandlerExecutor;
        this.f32295c = c5363p4;
        this.f32296d = c4921x9;
    }

    /* renamed from: a */
    public final void m20835a(C5534w0 c5534w0, Consumer consumer, Function function) {
        ICommonExecutor iCommonExecutor = this.f32294b;
        C4921X9 c4921x9 = this.f32296d;
        String str = c5534w0.f32749d;
        c4921x9.getClass();
        iCommonExecutor.execute(new RunnableC5199if(new File(str), new C5172hd(new C5197id(c5534w0.f32746a, c5534w0.f32747b), new C5147gd()), consumer, new C5300mg(this, c5534w0.f32751f, function)));
    }
}
