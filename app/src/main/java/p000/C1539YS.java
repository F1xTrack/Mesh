package p000;

import com.p019vk.push.core.data.repository.IssueKeyBlackListRepository;
import com.p019vk.push.core.feature.FeatureManagerImpl;

/* renamed from: YS */
/* loaded from: classes2.dex */
public final class C1539YS extends AbstractC1571Yy {

    /* renamed from: a */
    public IssueKeyBlackListRepository f14308a;

    /* renamed from: b */
    public /* synthetic */ Object f14309b;

    /* renamed from: c */
    public final /* synthetic */ FeatureManagerImpl f14310c;

    /* renamed from: d */
    public int f14311d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1539YS(FeatureManagerImpl featureManagerImpl, InterfaceC1382Vy interfaceC1382Vy) {
        super(interfaceC1382Vy);
        this.f14310c = featureManagerImpl;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f14309b = obj;
        this.f14311d |= Integer.MIN_VALUE;
        return FeatureManagerImpl.access$saveIssueKeysBlacklist(this.f14310c, this);
    }
}
