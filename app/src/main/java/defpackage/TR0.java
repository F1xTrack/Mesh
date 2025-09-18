package defpackage;

import com.vk.push.core.retry.RequestRetryComponent;

/* loaded from: classes2.dex */
public final class TR0 extends AbstractC1963Yy {
    public RequestRetryComponent a;
    public InterfaceC6099nZ b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ RequestRetryComponent e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TR0(RequestRetryComponent requestRetryComponent, InterfaceC1729Vy interfaceC1729Vy) {
        super(interfaceC1729Vy);
        this.e = requestRetryComponent;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        Object objM85invokegIAlus = this.e.m85invokegIAlus(null, this);
        return objM85invokegIAlus == EnumC1030Mz.a ? objM85invokegIAlus : new PS0(objM85invokegIAlus);
    }
}
