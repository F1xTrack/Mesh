package defpackage;

import com.vk.push.core.data.repository.IssueKeyBlackListRepository;
import com.vk.push.core.feature.FeatureManagerImpl;

/* loaded from: classes2.dex */
public final class YS extends AbstractC1963Yy {
    public IssueKeyBlackListRepository a;
    public /* synthetic */ Object b;
    public final /* synthetic */ FeatureManagerImpl c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YS(FeatureManagerImpl featureManagerImpl, InterfaceC1729Vy interfaceC1729Vy) {
        super(interfaceC1729Vy);
        this.c = featureManagerImpl;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return FeatureManagerImpl.access$saveIssueKeysBlacklist(this.c, this);
    }
}
