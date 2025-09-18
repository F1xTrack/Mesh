package p000;

import com.p019vk.push.core.network.data.source.MasterHostApi;

/* renamed from: Hn0 */
/* loaded from: classes2.dex */
public final class C7704Hn0 extends AbstractC1571Yy {

    /* renamed from: a */
    public /* synthetic */ Object f4505a;

    /* renamed from: b */
    public final /* synthetic */ MasterHostApi f4506b;

    /* renamed from: c */
    public int f4507c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7704Hn0(MasterHostApi masterHostApi, InterfaceC1382Vy interfaceC1382Vy) {
        super(interfaceC1382Vy);
        this.f4506b = masterHostApi;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f4505a = obj;
        this.f4507c |= Integer.MIN_VALUE;
        Object objM26676getAllExistingHostListIoAF18A = this.f4506b.m26676getAllExistingHostListIoAF18A(this);
        return objM26676getAllExistingHostListIoAF18A == EnumC0817Mz.f7418a ? objM26676getAllExistingHostListIoAF18A : new PS0(objM26676getAllExistingHostListIoAF18A);
    }
}
