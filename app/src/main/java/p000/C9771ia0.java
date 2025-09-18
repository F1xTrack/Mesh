package p000;

import com.p019vk.push.core.data.repository.IssueKeyBlackListRepository;

/* renamed from: ia0 */
/* loaded from: classes2.dex */
public final class C9771ia0 extends AbstractC1571Yy {

    /* renamed from: a */
    public /* synthetic */ Object f29326a;

    /* renamed from: b */
    public final /* synthetic */ IssueKeyBlackListRepository f29327b;

    /* renamed from: c */
    public int f29328c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9771ia0(IssueKeyBlackListRepository issueKeyBlackListRepository, InterfaceC1382Vy interfaceC1382Vy) {
        super(interfaceC1382Vy);
        this.f29327b = issueKeyBlackListRepository;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f29326a = obj;
        this.f29328c |= Integer.MIN_VALUE;
        return this.f29327b.getBlackList(this);
    }
}
