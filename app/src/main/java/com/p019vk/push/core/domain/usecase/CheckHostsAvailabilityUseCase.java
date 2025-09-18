package com.p019vk.push.core.domain.usecase;

import com.p019vk.push.core.domain.repository.PackagesRepository;
import kotlin.Metadata;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m22267d2 = {"Lcom/vk/push/core/domain/usecase/CheckHostsAvailabilityUseCase;", "", "Lcom/vk/push/core/domain/repository/PackagesRepository;", "packagesRepository", "<init>", "(Lcom/vk/push/core/domain/repository/PackagesRepository;)V", "", "invoke", "()Z", "core_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class CheckHostsAvailabilityUseCase {

    /* renamed from: a */
    public final PackagesRepository f20381a;

    public CheckHostsAvailabilityUseCase(PackagesRepository packagesRepository) {
        O90.m5968f(packagesRepository, "packagesRepository");
        this.f20381a = packagesRepository;
    }

    public final boolean invoke() {
        return !this.f20381a.getInitializedHostPackages().isEmpty();
    }
}
