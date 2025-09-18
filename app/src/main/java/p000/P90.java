package p000;

import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class P90 extends MS0 {

    /* renamed from: a */
    public int f8875a;

    /* renamed from: b */
    public final /* synthetic */ Function2 f8876b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC1382Vy f8877c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P90(InterfaceC1382Vy interfaceC1382Vy, InterfaceC1382Vy interfaceC1382Vy2, Function2 function2) {
        super(interfaceC1382Vy);
        this.f8876b = function2;
        this.f8877c = interfaceC1382Vy2;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        int i = this.f8875a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f8875a = 2;
            RQ1.m7017d(obj);
            return obj;
        }
        this.f8875a = 1;
        RQ1.m7017d(obj);
        Function2 function2 = this.f8876b;
        O90.m5966d(function2, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        AbstractC10036ke1.m22229d(2, function2);
        return function2.invoke(this.f8877c, this);
    }
}
