package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* renamed from: io.appmetrica.analytics.impl.s0 */
/* loaded from: classes2.dex */
public abstract class AbstractC5434s0 {
    /* renamed from: a */
    public static ResultReceiverC4388B6 m21032a(Handler handler, C5409r0 c5409r0) {
        return new ResultReceiverC4388B6(handler, c5409r0);
    }

    /* renamed from: a */
    public static C4782Re m21036a(Context context, ResultReceiverC4388B6 resultReceiverC4388B6) {
        return new C4782Re(context, resultReceiverC4388B6);
    }

    /* renamed from: a */
    public static C4690Nh m21034a(C4782Re c4782Re, Context context, ICommonExecutor iCommonExecutor) {
        C5134g0 c5134g0 = new C5134g0(context, iCommonExecutor, C5388q4.m20928h().m20934d());
        return new C4690Nh(c5134g0, new C4719Om(new C5145gb()), new C4820T4(c4782Re), new C5278lj(context, c5134g0));
    }

    /* renamed from: a */
    public static C4741Pk m21035a(Context context, C4690Nh c4690Nh, C5298me c5298me, Handler handler) {
        return new C4741Pk(c4690Nh, new C4932Xk(context, c5298me), handler);
    }

    /* renamed from: a */
    public static C4372Af m21031a(C4690Nh c4690Nh, C5298me c5298me, Handler handler) {
        return new C4372Af(c4690Nh, c5298me, handler, c5298me.m20752s());
    }

    /* renamed from: a */
    public static C4399Bh m21033a(Context context, C4782Re c4782Re, C4690Nh c4690Nh, Handler handler, C4741Pk c4741Pk) {
        return new C4399Bh(context, c4782Re, c4690Nh, handler, c4741Pk);
    }
}
