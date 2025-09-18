package com.vk.push.core.domain.repository;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\u0003H&¨\u0006\n"}, d2 = {"Lcom/vk/push/core/domain/repository/CallingAppRepository;", "", "getPackageNameForPid", "", "pid", "", "getPackageNameForUid", "uid", "getSignatureForPackageName", "packageName", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public interface CallingAppRepository {
    String getPackageNameForPid(int pid);

    String getPackageNameForUid(int uid);

    String getSignatureForPackageName(String packageName);
}
