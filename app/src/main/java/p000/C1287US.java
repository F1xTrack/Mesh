package p000;

import com.p019vk.push.core.feature.Feature;
import com.p019vk.push.core.feature.FeatureManagerImpl;

/* renamed from: US */
/* loaded from: classes2.dex */
public final class C1287US extends AbstractC1571Yy {

    /* renamed from: a */
    public FeatureManagerImpl f11791a;

    /* renamed from: b */
    public Feature.BooleanFeature f11792b;

    /* renamed from: c */
    public /* synthetic */ Object f11793c;

    /* renamed from: d */
    public final /* synthetic */ FeatureManagerImpl f11794d;

    /* renamed from: e */
    public int f11795e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1287US(FeatureManagerImpl featureManagerImpl, InterfaceC1382Vy interfaceC1382Vy) {
        super(interfaceC1382Vy);
        this.f11794d = featureManagerImpl;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f11793c = obj;
        this.f11795e |= Integer.MIN_VALUE;
        return this.f11794d.getFeatureValue((Feature.BooleanFeature) null, this);
    }
}
