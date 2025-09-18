package defpackage;

import com.vk.push.core.data.repository.IssueKeyBlackListRepository;

/* renamed from: ia0 */
/* loaded from: classes2.dex */
public final class C4372ia0 extends AbstractC1963Yy {
    public /* synthetic */ Object a;
    public final /* synthetic */ IssueKeyBlackListRepository b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4372ia0(IssueKeyBlackListRepository issueKeyBlackListRepository, InterfaceC1729Vy interfaceC1729Vy) {
        super(interfaceC1729Vy);
        this.b = issueKeyBlackListRepository;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.getBlackList(this);
    }
}
