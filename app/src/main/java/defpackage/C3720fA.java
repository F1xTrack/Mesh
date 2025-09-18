package defpackage;

import com.vk.push.common.Logger;
import com.vk.push.core.data.repository.CrashSenderImpl;
import com.vk.push.core.data.repository.IssueKey;
import com.vk.push.core.data.repository.IssueKeyBlackListRepository;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function2;

/* renamed from: fA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3720fA extends AbstractC4286i71 implements Function2 {
    public String a;
    public int b;
    public final /* synthetic */ IssueKey c;
    public final /* synthetic */ CrashSenderImpl d;
    public final /* synthetic */ Throwable e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3720fA(IssueKey issueKey, CrashSenderImpl crashSenderImpl, Throwable th, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.c = issueKey;
        this.d = crashSenderImpl;
        this.e = th;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new C3720fA(this.c, this.d, this.e, interfaceC1729Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3720fA) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        String str;
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        int i = this.b;
        CrashSenderImpl crashSenderImpl = this.d;
        IssueKey issueKey = this.c;
        if (i == 0) {
            RQ1.d(obj);
            String lowerCase = issueKey.name().toLowerCase(Locale.ROOT);
            O90.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            IssueKeyBlackListRepository issueKeyBlackListRepository = crashSenderImpl.b;
            this.a = lowerCase;
            this.b = 1;
            Object blackList = issueKeyBlackListRepository.getBlackList(this);
            if (blackList == enumC1030Mz) {
                return enumC1030Mz;
            }
            str = lowerCase;
            obj = blackList;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = this.a;
            RQ1.d(obj);
        }
        if (!((List) obj).contains(str)) {
            Logger logger = crashSenderImpl.d;
            StringBuilder sb = new StringBuilder("issueKey: ");
            sb.append(issueKey);
            sb.append(", error: ");
            Throwable th = this.e;
            sb.append(th);
            Logger.DefaultImpls.error$default(logger, sb.toString(), null, 2, null);
            crashSenderImpl.a.nonFatalReport(th, issueKey);
        }
        return C1518Tf1.a;
    }
}
