package p000;

import com.p019vk.push.core.network.utils.CallHandlerKt;

/* renamed from: tl */
/* loaded from: classes2.dex */
public final class C6906tl extends AbstractC1571Yy {

    /* renamed from: a */
    public InterfaceC6497nZ f43235a;

    /* renamed from: b */
    public HS0 f43236b;

    /* renamed from: c */
    public /* synthetic */ Object f43237c;

    /* renamed from: d */
    public int f43238d;

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f43237c = obj;
        this.f43238d |= Integer.MIN_VALUE;
        Object objHandleCall = CallHandlerKt.handleCall(null, null, this);
        return objHandleCall == EnumC0817Mz.f7418a ? objHandleCall : new PS0(objHandleCall);
    }
}
