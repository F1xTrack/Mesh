package defpackage;

import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class P90 extends MS0 {
    public int a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ InterfaceC1729Vy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P90(InterfaceC1729Vy interfaceC1729Vy, InterfaceC1729Vy interfaceC1729Vy2, Function2 function2) {
        super(interfaceC1729Vy);
        this.b = function2;
        this.c = interfaceC1729Vy2;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.a = 2;
            RQ1.d(obj);
            return obj;
        }
        this.a = 1;
        RQ1.d(obj);
        Function2 function2 = this.b;
        O90.d(function2, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        AbstractC5543ke1.d(2, function2);
        return function2.invoke(this.c, this);
    }
}
