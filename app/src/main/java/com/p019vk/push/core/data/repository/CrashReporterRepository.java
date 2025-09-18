package com.p019vk.push.core.data.repository;

import kotlin.Metadata;

@Metadata(m22266d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m22267d2 = {"Lcom/vk/push/core/data/repository/CrashReporterRepository;", "", "", "error", "Lcom/vk/push/core/data/repository/IssueKey;", "issueKey", "LTf1;", "nonFatalReport", "(Ljava/lang/Throwable;Lcom/vk/push/core/data/repository/IssueKey;)V", "core_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public interface CrashReporterRepository {
    void nonFatalReport(Throwable error, IssueKey issueKey);
}
