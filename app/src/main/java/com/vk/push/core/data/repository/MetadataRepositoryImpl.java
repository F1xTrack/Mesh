package com.vk.push.core.data.repository;

import com.vk.push.core.data.source.ManifestDataSource;
import com.vk.push.core.domain.repository.MetadataRepository;
import defpackage.O90;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/vk/push/core/data/repository/MetadataRepositoryImpl;", "Lcom/vk/push/core/domain/repository/MetadataRepository;", "Lcom/vk/push/core/data/source/ManifestDataSource;", "manifestDataSource", "<init>", "(Lcom/vk/push/core/data/source/ManifestDataSource;)V", "", "key", "getString", "(Ljava/lang/String;)Ljava/lang/String;", "defaultValue", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "getInt", "(Ljava/lang/String;)Ljava/lang/Integer;", "(Ljava/lang/String;I)I", "getNotificationIcon", "()I", "getNotificationColor", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class MetadataRepositoryImpl implements MetadataRepository {
    public final ManifestDataSource a;

    public MetadataRepositoryImpl(ManifestDataSource manifestDataSource) {
        O90.f(manifestDataSource, "manifestDataSource");
        this.a = manifestDataSource;
    }

    @Override // com.vk.push.core.domain.repository.MetadataRepository
    public Integer getInt(String key) {
        O90.f(key, "key");
        return this.a.getInt(key);
    }

    @Override // com.vk.push.core.domain.repository.MetadataRepository
    public int getNotificationColor() {
        return this.a.getNotificationColor();
    }

    @Override // com.vk.push.core.domain.repository.MetadataRepository
    public int getNotificationIcon() {
        return this.a.getNotificationIcon();
    }

    @Override // com.vk.push.core.domain.repository.MetadataRepository
    public String getString(String key) {
        O90.f(key, "key");
        return this.a.getString(key);
    }

    @Override // com.vk.push.core.domain.repository.MetadataRepository
    public int getInt(String key, int defaultValue) {
        O90.f(key, "key");
        return this.a.getInt(key, defaultValue);
    }

    @Override // com.vk.push.core.domain.repository.MetadataRepository
    public String getString(String key, String defaultValue) {
        O90.f(key, "key");
        O90.f(defaultValue, "defaultValue");
        return this.a.getString(key, defaultValue);
    }
}
