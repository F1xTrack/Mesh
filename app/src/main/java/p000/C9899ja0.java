package p000;

import com.p019vk.push.core.data.repository.IssueKeyBlackListRepository;

/* renamed from: ja0 */
/* loaded from: classes2.dex */
public final class C9899ja0 extends AbstractC1571Yy {

    /* renamed from: a */
    public /* synthetic */ Object f35248a;

    /* renamed from: b */
    public final /* synthetic */ IssueKeyBlackListRepository f35249b;

    /* renamed from: c */
    public int f35250c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9899ja0(IssueKeyBlackListRepository issueKeyBlackListRepository, InterfaceC1382Vy interfaceC1382Vy) {
        super(interfaceC1382Vy);
        this.f35249b = issueKeyBlackListRepository;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f35248a = obj;
        this.f35250c |= Integer.MIN_VALUE;
        return this.f35249b.setBlackList(null, this);
    }
}
