package p000;

import com.p019vk.push.core.network.data.source.MasterHostApi;

/* renamed from: Jn0 */
/* loaded from: classes2.dex */
public final class C7808Jn0 extends AbstractC1571Yy {

    /* renamed from: a */
    public /* synthetic */ Object f5694a;

    /* renamed from: b */
    public final /* synthetic */ MasterHostApi f5695b;

    /* renamed from: c */
    public int f5696c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7808Jn0(MasterHostApi masterHostApi, InterfaceC1382Vy interfaceC1382Vy) {
        super(interfaceC1382Vy);
        this.f5695b = masterHostApi;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f5694a = obj;
        this.f5696c |= Integer.MIN_VALUE;
        Object objM26677getHostListgIAlus = this.f5695b.m26677getHostListgIAlus(null, this);
        return objM26677getHostListgIAlus == EnumC0817Mz.f7418a ? objM26677getHostListgIAlus : new PS0(objM26677getHostListgIAlus);
    }
}
