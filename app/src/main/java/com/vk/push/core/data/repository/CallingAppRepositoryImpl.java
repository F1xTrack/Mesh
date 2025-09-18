package com.vk.push.core.data.repository;

import com.vk.push.core.data.source.CallingAppDataSource;
import com.vk.push.core.domain.repository.CallingAppRepository;
import defpackage.O90;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/vk/push/core/data/repository/CallingAppRepositoryImpl;", "Lcom/vk/push/core/domain/repository/CallingAppRepository;", "Lcom/vk/push/core/data/source/CallingAppDataSource;", "callingAppDataSource", "<init>", "(Lcom/vk/push/core/data/source/CallingAppDataSource;)V", "", "uid", "", "getPackageNameForUid", "(I)Ljava/lang/String;", "pid", "getPackageNameForPid", "packageName", "getSignatureForPackageName", "(Ljava/lang/String;)Ljava/lang/String;", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class CallingAppRepositoryImpl implements CallingAppRepository {
    public final CallingAppDataSource a;

    public CallingAppRepositoryImpl(CallingAppDataSource callingAppDataSource) {
        O90.f(callingAppDataSource, "callingAppDataSource");
        this.a = callingAppDataSource;
    }

    @Override // com.vk.push.core.domain.repository.CallingAppRepository
    public String getPackageNameForPid(int pid) {
        return this.a.getPackageNameForPid(pid);
    }

    @Override // com.vk.push.core.domain.repository.CallingAppRepository
    public String getPackageNameForUid(int uid) {
        return this.a.getPackageNameForUid(uid);
    }

    @Override // com.vk.push.core.domain.repository.CallingAppRepository
    public String getSignatureForPackageName(String packageName) {
        O90.f(packageName, "packageName");
        return this.a.getSignatureForPackageName(packageName);
    }
}
