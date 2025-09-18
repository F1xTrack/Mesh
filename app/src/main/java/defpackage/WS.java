package defpackage;

import com.vk.push.core.feature.Feature;
import com.vk.push.core.feature.FeatureManagerImpl;

/* loaded from: classes2.dex */
public final class WS extends AbstractC1963Yy {
    public FeatureManagerImpl a;
    public Feature.IntFeature b;
    public /* synthetic */ Object c;
    public final /* synthetic */ FeatureManagerImpl d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WS(FeatureManagerImpl featureManagerImpl, InterfaceC1729Vy interfaceC1729Vy) {
        super(interfaceC1729Vy);
        this.d = featureManagerImpl;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.getFeatureValue((Feature.IntFeature) null, this);
    }
}
