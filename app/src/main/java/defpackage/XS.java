package defpackage;

import com.vk.push.core.feature.FeatureManagerImpl;

/* loaded from: classes2.dex */
public final class XS extends AbstractC1963Yy {
    public /* synthetic */ Object a;
    public final /* synthetic */ FeatureManagerImpl b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XS(FeatureManagerImpl featureManagerImpl, InterfaceC1729Vy interfaceC1729Vy) {
        super(interfaceC1729Vy);
        this.b = featureManagerImpl;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return FeatureManagerImpl.access$getFileUpdateInterval(this.b, this);
    }
}
