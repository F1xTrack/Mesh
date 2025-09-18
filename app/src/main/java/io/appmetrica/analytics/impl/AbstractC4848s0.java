package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* renamed from: io.appmetrica.analytics.impl.s0 */
/* loaded from: classes2.dex */
public abstract class AbstractC4848s0 {
    public static B6 a(Handler handler, C4824r0 c4824r0) {
        return new B6(handler, c4824r0);
    }

    public static Re a(Context context, B6 b6) {
        return new Re(context, b6);
    }

    public static Nh a(Re re, Context context, ICommonExecutor iCommonExecutor) {
        C4562g0 c4562g0 = new C4562g0(context, iCommonExecutor, C4805q4.h().d());
        return new Nh(c4562g0, new Om(new C4573gb()), new T4(re), new C4700lj(context, c4562g0));
    }

    public static Pk a(Context context, Nh nh, C4719me c4719me, Handler handler) {
        return new Pk(nh, new Xk(context, c4719me), handler);
    }

    public static Af a(Nh nh, C4719me c4719me, Handler handler) {
        return new Af(nh, c4719me, handler, c4719me.s());
    }

    public static Bh a(Context context, Re re, Nh nh, Handler handler, Pk pk) {
        return new Bh(context, re, nh, handler, pk);
    }
}
