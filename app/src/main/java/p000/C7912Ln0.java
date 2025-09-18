package p000;

import com.p019vk.push.core.network.data.source.MasterHostApi;

/* renamed from: Ln0 */
/* loaded from: classes2.dex */
public final class C7912Ln0 extends AbstractC1571Yy {

    /* renamed from: a */
    public /* synthetic */ Object f6853a;

    /* renamed from: b */
    public final /* synthetic */ MasterHostApi f6854b;

    /* renamed from: c */
    public int f6855c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7912Ln0(MasterHostApi masterHostApi, InterfaceC1382Vy interfaceC1382Vy) {
        super(interfaceC1382Vy);
        this.f6854b = masterHostApi;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f6853a = obj;
        this.f6855c |= Integer.MIN_VALUE;
        Object objM26678getMastergIAlus = this.f6854b.m26678getMastergIAlus(null, this);
        return objM26678getMastergIAlus == EnumC0817Mz.f7418a ? objM26678getMastergIAlus : new PS0(objM26678getMastergIAlus);
    }
}
