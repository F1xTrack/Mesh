package p000;

import com.p019vk.push.core.feature.Feature;
import com.p019vk.push.core.feature.FeatureManagerImpl;

/* renamed from: VS */
/* loaded from: classes2.dex */
public final class C1350VS extends AbstractC1571Yy {

    /* renamed from: a */
    public FeatureManagerImpl f12574a;

    /* renamed from: b */
    public Feature.StringFeature f12575b;

    /* renamed from: c */
    public /* synthetic */ Object f12576c;

    /* renamed from: d */
    public final /* synthetic */ FeatureManagerImpl f12577d;

    /* renamed from: e */
    public int f12578e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1350VS(FeatureManagerImpl featureManagerImpl, InterfaceC1382Vy interfaceC1382Vy) {
        super(interfaceC1382Vy);
        this.f12577d = featureManagerImpl;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f12576c = obj;
        this.f12578e |= Integer.MIN_VALUE;
        return this.f12577d.getFeatureValue((Feature.StringFeature) null, this);
    }
}
