package defpackage;

import com.vk.push.core.data.repository.CrashReporterRepository;
import com.vk.push.core.data.repository.IssueKey;

/* renamed from: hA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C4102hA implements CrashReporterRepository {
    public final /* synthetic */ int a;

    @Override // com.vk.push.core.data.repository.CrashReporterRepository
    public final void nonFatalReport(Throwable th, IssueKey issueKey) {
        switch (this.a) {
            case 0:
                O90.f(th, "<anonymous parameter 0>");
                O90.f(issueKey, "<anonymous parameter 1>");
                break;
            default:
                O90.f(th, "<anonymous parameter 0>");
                O90.f(issueKey, "<anonymous parameter 1>");
                break;
        }
    }
}
