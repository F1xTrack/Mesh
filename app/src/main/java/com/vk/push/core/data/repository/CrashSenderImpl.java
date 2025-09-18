package com.vk.push.core.data.repository;

import com.vk.push.common.Logger;
import defpackage.AbstractC3767fP1;
import defpackage.AbstractC7625vY1;
import defpackage.C3720fA;
import defpackage.GK;
import defpackage.InterfaceC0952Lz;
import defpackage.O90;
import defpackage.QF;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/vk/push/core/data/repository/CrashSenderImpl;", "Lcom/vk/push/core/data/repository/CrashReporterRepository;", "crashSender", "Lcom/vk/push/core/data/repository/IssueKeyBlackListRepository;", "issueKeyBlackListRepository", "LLz;", "scope", "Lcom/vk/push/common/Logger;", "logger", "<init>", "(Lcom/vk/push/core/data/repository/CrashReporterRepository;Lcom/vk/push/core/data/repository/IssueKeyBlackListRepository;LLz;Lcom/vk/push/common/Logger;)V", "", "error", "Lcom/vk/push/core/data/repository/IssueKey;", "issueKey", "LTf1;", "nonFatalReport", "(Ljava/lang/Throwable;Lcom/vk/push/core/data/repository/IssueKey;)V", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class CrashSenderImpl implements CrashReporterRepository {
    public final CrashReporterRepository a;
    public final IssueKeyBlackListRepository b;
    public final InterfaceC0952Lz c;
    public final Logger d;

    public CrashSenderImpl(CrashReporterRepository crashReporterRepository, IssueKeyBlackListRepository issueKeyBlackListRepository, InterfaceC0952Lz interfaceC0952Lz, Logger logger) {
        O90.f(crashReporterRepository, "crashSender");
        O90.f(issueKeyBlackListRepository, "issueKeyBlackListRepository");
        O90.f(interfaceC0952Lz, "scope");
        O90.f(logger, "logger");
        this.a = crashReporterRepository;
        this.b = issueKeyBlackListRepository;
        this.c = interfaceC0952Lz;
        this.d = logger.createLogger("ErrorSender");
    }

    @Override // com.vk.push.core.data.repository.CrashReporterRepository
    public void nonFatalReport(Throwable error, IssueKey issueKey) {
        O90.f(error, "error");
        O90.f(issueKey, "issueKey");
        AbstractC3767fP1.b(this.c, null, new C3720fA(issueKey, this, error, null), 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CrashSenderImpl(CrashReporterRepository crashReporterRepository, IssueKeyBlackListRepository issueKeyBlackListRepository, InterfaceC0952Lz interfaceC0952Lz, Logger logger, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            GK gk = GK.a;
            interfaceC0952Lz = AbstractC7625vY1.a(QF.c);
        }
        this(crashReporterRepository, issueKeyBlackListRepository, interfaceC0952Lz, logger);
    }
}
