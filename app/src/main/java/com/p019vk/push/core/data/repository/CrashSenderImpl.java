package com.p019vk.push.core.data.repository;

import com.p019vk.push.common.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.AbstractC11432vY1;
import p000.AbstractC9366fP1;
import p000.C0399GK;
import p000.C4036fA;
import p000.ExecutorC1023QF;
import p000.InterfaceC0754Lz;
import p000.O90;

@Metadata(m22266d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m22267d2 = {"Lcom/vk/push/core/data/repository/CrashSenderImpl;", "Lcom/vk/push/core/data/repository/CrashReporterRepository;", "crashSender", "Lcom/vk/push/core/data/repository/IssueKeyBlackListRepository;", "issueKeyBlackListRepository", "LLz;", "scope", "Lcom/vk/push/common/Logger;", "logger", "<init>", "(Lcom/vk/push/core/data/repository/CrashReporterRepository;Lcom/vk/push/core/data/repository/IssueKeyBlackListRepository;LLz;Lcom/vk/push/common/Logger;)V", "", "error", "Lcom/vk/push/core/data/repository/IssueKey;", "issueKey", "LTf1;", "nonFatalReport", "(Ljava/lang/Throwable;Lcom/vk/push/core/data/repository/IssueKey;)V", "core_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class CrashSenderImpl implements CrashReporterRepository {

    /* renamed from: a */
    public final CrashReporterRepository f20344a;

    /* renamed from: b */
    public final IssueKeyBlackListRepository f20345b;

    /* renamed from: c */
    public final InterfaceC0754Lz f20346c;

    /* renamed from: d */
    public final Logger f20347d;

    public CrashSenderImpl(CrashReporterRepository crashReporterRepository, IssueKeyBlackListRepository issueKeyBlackListRepository, InterfaceC0754Lz interfaceC0754Lz, Logger logger) {
        O90.m5968f(crashReporterRepository, "crashSender");
        O90.m5968f(issueKeyBlackListRepository, "issueKeyBlackListRepository");
        O90.m5968f(interfaceC0754Lz, "scope");
        O90.m5968f(logger, "logger");
        this.f20344a = crashReporterRepository;
        this.f20345b = issueKeyBlackListRepository;
        this.f20346c = interfaceC0754Lz;
        this.f20347d = logger.createLogger("ErrorSender");
    }

    @Override // com.p019vk.push.core.data.repository.CrashReporterRepository
    public void nonFatalReport(Throwable error, IssueKey issueKey) {
        O90.m5968f(error, "error");
        O90.m5968f(issueKey, "issueKey");
        AbstractC9366fP1.m18230b(this.f20346c, null, new C4036fA(issueKey, this, error, null), 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CrashSenderImpl(CrashReporterRepository crashReporterRepository, IssueKeyBlackListRepository issueKeyBlackListRepository, InterfaceC0754Lz interfaceC0754Lz, Logger logger, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            C0399GK c0399gk = C0399GK.f3694a;
            interfaceC0754Lz = AbstractC11432vY1.m25444a(ExecutorC1023QF.f9548c);
        }
        this(crashReporterRepository, issueKeyBlackListRepository, interfaceC0754Lz, logger);
    }
}
