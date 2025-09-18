package com.vk.push.core.domain.usecase;

import com.vk.push.core.domain.repository.PackagesRepository;
import defpackage.O90;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/vk/push/core/domain/usecase/GetInitializedHostPackagesUseCase;", "", "Lcom/vk/push/core/domain/repository/PackagesRepository;", "packagesRepository", "<init>", "(Lcom/vk/push/core/domain/repository/PackagesRepository;)V", "", "", "invoke", "()Ljava/util/List;", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class GetInitializedHostPackagesUseCase {
    public final PackagesRepository a;

    public GetInitializedHostPackagesUseCase(PackagesRepository packagesRepository) {
        O90.f(packagesRepository, "packagesRepository");
        this.a = packagesRepository;
    }

    public final List<String> invoke() {
        return this.a.getInitializedHostPackages();
    }
}
