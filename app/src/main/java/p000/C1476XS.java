package p000;

import com.p019vk.push.core.feature.FeatureManagerImpl;

/* renamed from: XS */
/* loaded from: classes2.dex */
public final class C1476XS extends AbstractC1571Yy {

    /* renamed from: a */
    public /* synthetic */ Object f13758a;

    /* renamed from: b */
    public final /* synthetic */ FeatureManagerImpl f13759b;

    /* renamed from: c */
    public int f13760c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1476XS(FeatureManagerImpl featureManagerImpl, InterfaceC1382Vy interfaceC1382Vy) {
        super(interfaceC1382Vy);
        this.f13759b = featureManagerImpl;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f13758a = obj;
        this.f13760c |= Integer.MIN_VALUE;
        return FeatureManagerImpl.access$getFileUpdateInterval(this.f13759b, this);
    }
}
