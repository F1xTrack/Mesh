package p000;

import com.p019vk.push.core.feature.FeatureManagerImpl;
import com.p019vk.push.core.filedatastore.FileDataSource;

/* renamed from: ZS */
/* loaded from: classes2.dex */
public final class C1602ZS extends AbstractC1571Yy {

    /* renamed from: a */
    public FileDataSource f14896a;

    /* renamed from: b */
    public /* synthetic */ Object f14897b;

    /* renamed from: c */
    public final /* synthetic */ FeatureManagerImpl f14898c;

    /* renamed from: d */
    public int f14899d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1602ZS(FeatureManagerImpl featureManagerImpl, InterfaceC1382Vy interfaceC1382Vy) {
        super(interfaceC1382Vy);
        this.f14898c = featureManagerImpl;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f14897b = obj;
        this.f14899d |= Integer.MIN_VALUE;
        Object objM26670access$saveUpdateIntervalIoAF18A = FeatureManagerImpl.m26670access$saveUpdateIntervalIoAF18A(this.f14898c, this);
        return objM26670access$saveUpdateIntervalIoAF18A == EnumC0817Mz.f7418a ? objM26670access$saveUpdateIntervalIoAF18A : new PS0(objM26670access$saveUpdateIntervalIoAF18A);
    }
}
