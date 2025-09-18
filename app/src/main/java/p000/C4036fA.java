package p000;

import com.p019vk.push.common.Logger;
import com.p019vk.push.core.data.repository.CrashSenderImpl;
import com.p019vk.push.core.data.repository.IssueKey;
import com.p019vk.push.core.data.repository.IssueKeyBlackListRepository;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function2;

/* renamed from: fA */
/* loaded from: classes2.dex */
public final class C4036fA extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public String f27096a;

    /* renamed from: b */
    public int f27097b;

    /* renamed from: c */
    public final /* synthetic */ IssueKey f27098c;

    /* renamed from: d */
    public final /* synthetic */ CrashSenderImpl f27099d;

    /* renamed from: e */
    public final /* synthetic */ Throwable f27100e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4036fA(IssueKey issueKey, CrashSenderImpl crashSenderImpl, Throwable th, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f27098c = issueKey;
        this.f27099d = crashSenderImpl;
        this.f27100e = th;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        return new C4036fA(this.f27098c, this.f27099d, this.f27100e, interfaceC1382Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4036fA) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        String str;
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        int i = this.f27097b;
        CrashSenderImpl crashSenderImpl = this.f27099d;
        IssueKey issueKey = this.f27098c;
        if (i == 0) {
            RQ1.m7017d(obj);
            String lowerCase = issueKey.name().toLowerCase(Locale.ROOT);
            O90.m5967e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            IssueKeyBlackListRepository issueKeyBlackListRepository = crashSenderImpl.f20345b;
            this.f27096a = lowerCase;
            this.f27097b = 1;
            Object blackList = issueKeyBlackListRepository.getBlackList(this);
            if (blackList == enumC0817Mz) {
                return enumC0817Mz;
            }
            str = lowerCase;
            obj = blackList;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = this.f27096a;
            RQ1.m7017d(obj);
        }
        if (!((List) obj).contains(str)) {
            Logger logger = crashSenderImpl.f20347d;
            StringBuilder sb = new StringBuilder("issueKey: ");
            sb.append(issueKey);
            sb.append(", error: ");
            Throwable th = this.f27100e;
            sb.append(th);
            Logger.DefaultImpls.error$default(logger, sb.toString(), null, 2, null);
            crashSenderImpl.f20344a.nonFatalReport(th, issueKey);
        }
        return C8313Tf1.f11463a;
    }
}
