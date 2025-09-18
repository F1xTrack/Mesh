package com.vk.push.core.data.repository;

import com.vk.push.core.data.source.ContextDataSource;
import com.vk.push.core.data.source.PackageManagerDataSource;
import com.vk.push.core.domain.repository.PackagesRepository;
import defpackage.O90;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"PackagesRepository", "Lcom/vk/push/core/domain/repository/PackagesRepository;", "packageManagerDataSource", "Lcom/vk/push/core/data/source/PackageManagerDataSource;", "contextDataSource", "Lcom/vk/push/core/data/source/ContextDataSource;", "core_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class PackagesRepositoryImplKt {
    public static final PackagesRepository PackagesRepository(PackageManagerDataSource packageManagerDataSource, ContextDataSource contextDataSource) {
        O90.f(packageManagerDataSource, "packageManagerDataSource");
        O90.f(contextDataSource, "contextDataSource");
        return new PackagesRepositoryImpl(packageManagerDataSource, contextDataSource);
    }
}
