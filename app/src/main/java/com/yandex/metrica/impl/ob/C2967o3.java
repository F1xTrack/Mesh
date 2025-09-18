package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Handler;

/* renamed from: com.yandex.metrica.impl.ob.o3 */
/* loaded from: classes2.dex */
class C2967o3 {
    public ResultReceiverC2939n0 a(Handler handler, C2942n3 c2942n3) {
        return new ResultReceiverC2939n0(handler, c2942n3);
    }

    public U3 a(Context context, ResultReceiverC2939n0 resultReceiverC2939n0) {
        return new U3(context, resultReceiverC2939n0);
    }

    public C2941n2 a(U3 u3, Context context, InterfaceExecutorC3086sn interfaceExecutorC3086sn) {
        return new C2941n2(u3, context, new C3194x1(context, interfaceExecutorC3086sn), new C3200x7(), new C2697d7());
    }

    public Ii a(Context context, C2941n2 c2941n2, F9 f9, Handler handler) {
        return new Ii(context, c2941n2, f9, handler);
    }

    public Dg a(C2941n2 c2941n2, F9 f9, Handler handler) {
        return new Dg(c2941n2, f9, handler);
    }

    public C2891l2 a(Context context, U3 u3, C2941n2 c2941n2, Handler handler, Ii ii) {
        return new C2891l2(context, u3, c2941n2, handler, ii);
    }
}
