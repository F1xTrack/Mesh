package com.vk.push.core.network.utils;

import defpackage.AbstractC4286i71;
import defpackage.C1518Tf1;
import defpackage.EnumC1030Mz;
import defpackage.HS0;
import defpackage.IS0;
import defpackage.InterfaceC0952Lz;
import defpackage.InterfaceC1729Vy;
import defpackage.InterfaceC7940xD;
import defpackage.RQ1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "LLz;", "", "<anonymous>", "(LLz;)Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
@InterfaceC7940xD(c = "com.vk.push.core.network.utils.CallHandlerKt$handleCall$result$responseData$1", f = "CallHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CallHandlerKt$handleCall$result$responseData$1 extends AbstractC4286i71 implements Function2 {
    public final /* synthetic */ HS0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallHandlerKt$handleCall$result$responseData$1(HS0 hs0, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.a = hs0;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new CallHandlerKt$handleCall$result$responseData$1(this.a, interfaceC1729Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC0952Lz interfaceC0952Lz, InterfaceC1729Vy interfaceC1729Vy) {
        return ((CallHandlerKt$handleCall$result$responseData$1) create(interfaceC0952Lz, interfaceC1729Vy)).invokeSuspend(C1518Tf1.a);
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        RQ1.d(obj);
        IS0 is0 = this.a.g;
        return is0 != null ? is0.x() : "";
    }
}
