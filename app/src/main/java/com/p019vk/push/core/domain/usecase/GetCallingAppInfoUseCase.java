package com.p019vk.push.core.domain.usecase;

import com.p019vk.push.common.AppInfo;
import com.p019vk.push.core.domain.model.CallingAppIds;
import com.p019vk.push.core.domain.repository.CallingAppRepository;
import kotlin.Metadata;
import p000.AbstractC11374v51;
import p000.O90;
import p000.RQ1;

@Metadata(m22266d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\r"}, m22267d2 = {"Lcom/vk/push/core/domain/usecase/GetCallingAppInfoUseCase;", "", "Lcom/vk/push/core/domain/repository/CallingAppRepository;", "callingAppRepository", "<init>", "(Lcom/vk/push/core/domain/repository/CallingAppRepository;)V", "Lcom/vk/push/core/domain/model/CallingAppIds;", "callingAppIds", "LPS0;", "Lcom/vk/push/common/AppInfo;", "invoke-IoAF18A", "(Lcom/vk/push/core/domain/model/CallingAppIds;)Ljava/lang/Object;", "invoke", "core_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class GetCallingAppInfoUseCase {

    /* renamed from: a */
    public final CallingAppRepository f20382a;

    public GetCallingAppInfoUseCase(CallingAppRepository callingAppRepository) {
        O90.m5968f(callingAppRepository, "callingAppRepository");
        this.f20382a = callingAppRepository;
    }

    /* renamed from: invoke-IoAF18A, reason: not valid java name */
    public final Object m26669invokeIoAF18A(CallingAppIds callingAppIds) {
        CallingAppRepository callingAppRepository = this.f20382a;
        O90.m5968f(callingAppIds, "callingAppIds");
        try {
            String packageNameForUid = callingAppRepository.getPackageNameForUid(callingAppIds.getUid());
            if (packageNameForUid == null || AbstractC11374v51.m25328C(packageNameForUid)) {
                packageNameForUid = callingAppRepository.getPackageNameForPid(callingAppIds.getPid());
            }
            if (packageNameForUid == null || AbstractC11374v51.m25328C(packageNameForUid)) {
                throw new IllegalStateException("Could not retrieve caller package name");
            }
            String signatureForPackageName = callingAppRepository.getSignatureForPackageName(packageNameForUid);
            if (signatureForPackageName == null || AbstractC11374v51.m25328C(signatureForPackageName)) {
                throw new IllegalStateException("Could not retrieve caller pub key");
            }
            return new AppInfo(packageNameForUid, signatureForPackageName);
        } catch (Throwable th) {
            return RQ1.m7015b(th);
        }
    }
}
