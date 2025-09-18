package com.p019vk.push.core.data.repository;

import com.p019vk.push.core.data.source.ManifestDataSource;
import com.p019vk.push.core.domain.repository.MetadataRepository;
import kotlin.Metadata;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m22267d2 = {"MetadataRepository", "Lcom/vk/push/core/domain/repository/MetadataRepository;", "manifestDataSource", "Lcom/vk/push/core/data/source/ManifestDataSource;", "core_release"}, m22268k = 2, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class MetadataRepositoryImplKt {
    public static final MetadataRepository MetadataRepository(ManifestDataSource manifestDataSource) {
        O90.m5968f(manifestDataSource, "manifestDataSource");
        return new MetadataRepositoryImpl(manifestDataSource);
    }
}
