package p000;

import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class Q90 extends AbstractC1571Yy {

    /* renamed from: a */
    public int f9501a;

    /* renamed from: b */
    public final /* synthetic */ Function2 f9502b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC1382Vy f9503c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q90(InterfaceC1382Vy interfaceC1382Vy, InterfaceC0125Bz interfaceC0125Bz, Function2 function2, InterfaceC1382Vy interfaceC1382Vy2) {
        super(interfaceC1382Vy, interfaceC0125Bz);
        this.f9502b = function2;
        this.f9503c = interfaceC1382Vy2;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        int i = this.f9501a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f9501a = 2;
            RQ1.m7017d(obj);
            return obj;
        }
        this.f9501a = 1;
        RQ1.m7017d(obj);
        Function2 function2 = this.f9502b;
        O90.m5966d(function2, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        AbstractC10036ke1.m22229d(2, function2);
        return function2.invoke(this.f9503c, this);
    }
}
