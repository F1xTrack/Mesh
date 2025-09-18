package p000;

import com.p019vk.push.core.feature.Feature;
import com.p019vk.push.core.feature.FeatureManagerImpl;

/* renamed from: WS */
/* loaded from: classes2.dex */
public final class C1413WS extends AbstractC1571Yy {

    /* renamed from: a */
    public FeatureManagerImpl f13188a;

    /* renamed from: b */
    public Feature.IntFeature f13189b;

    /* renamed from: c */
    public /* synthetic */ Object f13190c;

    /* renamed from: d */
    public final /* synthetic */ FeatureManagerImpl f13191d;

    /* renamed from: e */
    public int f13192e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1413WS(FeatureManagerImpl featureManagerImpl, InterfaceC1382Vy interfaceC1382Vy) {
        super(interfaceC1382Vy);
        this.f13191d = featureManagerImpl;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f13190c = obj;
        this.f13192e |= Integer.MIN_VALUE;
        return this.f13191d.getFeatureValue((Feature.IntFeature) null, this);
    }
}
