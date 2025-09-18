package com.p019vk.push.core.network.utils;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import p000.AbstractC9714i71;
import p000.C8313Tf1;
import p000.EnumC0817Mz;
import p000.HS0;
import p000.IS0;
import p000.InterfaceC0754Lz;
import p000.InterfaceC1382Vy;
import p000.InterfaceC7124xD;
import p000.RQ1;

@Metadata(m22266d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m22267d2 = {"T", "LLz;", "", "<anonymous>", "(LLz;)Ljava/lang/String;"}, m22268k = 3, m22269mv = {1, 7, 1})
@InterfaceC7124xD(m25814c = "com.vk.push.core.network.utils.CallHandlerKt$handleCall$result$responseData$1", m25815f = "CallHandler.kt", m25816l = {}, m25817m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CallHandlerKt$handleCall$result$responseData$1 extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public final /* synthetic */ HS0 f20480a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallHandlerKt$handleCall$result$responseData$1(HS0 hs0, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f20480a = hs0;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        return new CallHandlerKt$handleCall$result$responseData$1(this.f20480a, interfaceC1382Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC0754Lz interfaceC0754Lz, InterfaceC1382Vy interfaceC1382Vy) {
        return ((CallHandlerKt$handleCall$result$responseData$1) create(interfaceC0754Lz, interfaceC1382Vy)).invokeSuspend(C8313Tf1.f11463a);
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        RQ1.m7017d(obj);
        IS0 is0 = this.f20480a.f4301g;
        return is0 != null ? is0.m3878x() : "";
    }
}
