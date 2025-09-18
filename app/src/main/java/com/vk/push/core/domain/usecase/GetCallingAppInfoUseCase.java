package com.vk.push.core.domain.usecase;

import com.vk.push.common.AppInfo;
import com.vk.push.core.domain.model.CallingAppIds;
import com.vk.push.core.domain.repository.CallingAppRepository;
import defpackage.AbstractC7538v51;
import defpackage.O90;
import defpackage.RQ1;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/vk/push/core/domain/usecase/GetCallingAppInfoUseCase;", "", "Lcom/vk/push/core/domain/repository/CallingAppRepository;", "callingAppRepository", "<init>", "(Lcom/vk/push/core/domain/repository/CallingAppRepository;)V", "Lcom/vk/push/core/domain/model/CallingAppIds;", "callingAppIds", "LPS0;", "Lcom/vk/push/common/AppInfo;", "invoke-IoAF18A", "(Lcom/vk/push/core/domain/model/CallingAppIds;)Ljava/lang/Object;", "invoke", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class GetCallingAppInfoUseCase {
    public final CallingAppRepository a;

    public GetCallingAppInfoUseCase(CallingAppRepository callingAppRepository) {
        O90.f(callingAppRepository, "callingAppRepository");
        this.a = callingAppRepository;
    }

    /* renamed from: invoke-IoAF18A, reason: not valid java name */
    public final Object m75invokeIoAF18A(CallingAppIds callingAppIds) {
        CallingAppRepository callingAppRepository = this.a;
        O90.f(callingAppIds, "callingAppIds");
        try {
            String packageNameForUid = callingAppRepository.getPackageNameForUid(callingAppIds.getUid());
            if (packageNameForUid == null || AbstractC7538v51.C(packageNameForUid)) {
                packageNameForUid = callingAppRepository.getPackageNameForPid(callingAppIds.getPid());
            }
            if (packageNameForUid == null || AbstractC7538v51.C(packageNameForUid)) {
                throw new IllegalStateException("Could not retrieve caller package name");
            }
            String signatureForPackageName = callingAppRepository.getSignatureForPackageName(packageNameForUid);
            if (signatureForPackageName == null || AbstractC7538v51.C(signatureForPackageName)) {
                throw new IllegalStateException("Could not retrieve caller pub key");
            }
            return new AppInfo(packageNameForUid, signatureForPackageName);
        } catch (Throwable th) {
            return RQ1.b(th);
        }
    }
}
