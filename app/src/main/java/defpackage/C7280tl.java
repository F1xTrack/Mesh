package defpackage;

import com.vk.push.core.network.utils.CallHandlerKt;

/* renamed from: tl */
/* loaded from: classes2.dex */
public final class C7280tl extends AbstractC1963Yy {
    public InterfaceC6099nZ a;
    public HS0 b;
    public /* synthetic */ Object c;
    public int d;

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        Object objHandleCall = CallHandlerKt.handleCall(null, null, this);
        return objHandleCall == EnumC1030Mz.a ? objHandleCall : new PS0(objHandleCall);
    }
}
