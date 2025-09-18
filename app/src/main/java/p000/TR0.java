package p000;

import com.p019vk.push.core.retry.RequestRetryComponent;

/* loaded from: classes2.dex */
public final class TR0 extends AbstractC1571Yy {

    /* renamed from: a */
    public RequestRetryComponent f11354a;

    /* renamed from: b */
    public InterfaceC6497nZ f11355b;

    /* renamed from: c */
    public int f11356c;

    /* renamed from: d */
    public /* synthetic */ Object f11357d;

    /* renamed from: e */
    public final /* synthetic */ RequestRetryComponent f11358e;

    /* renamed from: f */
    public int f11359f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TR0(RequestRetryComponent requestRetryComponent, InterfaceC1382Vy interfaceC1382Vy) {
        super(interfaceC1382Vy);
        this.f11358e = requestRetryComponent;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f11357d = obj;
        this.f11359f |= Integer.MIN_VALUE;
        Object objM26679invokegIAlus = this.f11358e.m26679invokegIAlus(null, this);
        return objM26679invokegIAlus == EnumC0817Mz.f7418a ? objM26679invokegIAlus : new PS0(objM26679invokegIAlus);
    }
}
