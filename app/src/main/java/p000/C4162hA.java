package p000;

import com.p019vk.push.core.data.repository.CrashReporterRepository;
import com.p019vk.push.core.data.repository.IssueKey;

/* renamed from: hA */
/* loaded from: classes2.dex */
public final /* synthetic */ class C4162hA implements CrashReporterRepository {

    /* renamed from: a */
    public final /* synthetic */ int f28289a;

    @Override // com.p019vk.push.core.data.repository.CrashReporterRepository
    public final void nonFatalReport(Throwable th, IssueKey issueKey) {
        switch (this.f28289a) {
            case 0:
                O90.m5968f(th, "<anonymous parameter 0>");
                O90.m5968f(issueKey, "<anonymous parameter 1>");
                break;
            default:
                O90.m5968f(th, "<anonymous parameter 0>");
                O90.m5968f(issueKey, "<anonymous parameter 1>");
                break;
        }
    }
}
