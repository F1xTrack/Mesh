package com.vk.push.core.data.repository;

import com.vk.push.core.data.source.ContextDataSource;
import com.vk.push.core.data.source.PackageManagerDataSource;
import com.vk.push.core.domain.repository.PackagesRepository;
import defpackage.O90;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\u0011\u0010\u000bJ\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/vk/push/core/data/repository/PackagesRepositoryImpl;", "Lcom/vk/push/core/domain/repository/PackagesRepository;", "Lcom/vk/push/core/data/source/PackageManagerDataSource;", "packageManagerDataSource", "Lcom/vk/push/core/data/source/ContextDataSource;", "contextDataSource", "<init>", "(Lcom/vk/push/core/data/source/PackageManagerDataSource;Lcom/vk/push/core/data/source/ContextDataSource;)V", "", "", "getInitializedHostPackages", "()Ljava/util/List;", "getPackageName", "()Ljava/lang/String;", "", "isIgnoringBatteryOptimizations", "()Z", "getInitializedClientPackages", "packageName", "checkAppInstalled", "(Ljava/lang/String;)Z", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class PackagesRepositoryImpl implements PackagesRepository {
    public final PackageManagerDataSource a;
    public final ContextDataSource b;

    public PackagesRepositoryImpl(PackageManagerDataSource packageManagerDataSource, ContextDataSource contextDataSource) {
        O90.f(packageManagerDataSource, "packageManagerDataSource");
        O90.f(contextDataSource, "contextDataSource");
        this.a = packageManagerDataSource;
        this.b = contextDataSource;
    }

    @Override // com.vk.push.core.domain.repository.PackagesRepository
    public boolean checkAppInstalled(String packageName) {
        O90.f(packageName, "packageName");
        return this.a.checkPackageNameIsInstalled(packageName);
    }

    @Override // com.vk.push.core.domain.repository.PackagesRepository
    public List<String> getInitializedClientPackages() {
        return this.a.getInitializedClientPackages();
    }

    @Override // com.vk.push.core.domain.repository.PackagesRepository
    public List<String> getInitializedHostPackages() {
        return this.a.getInitializedHostPackages();
    }

    @Override // com.vk.push.core.domain.repository.PackagesRepository
    public String getPackageName() {
        return this.b.getPackageName();
    }

    @Override // com.vk.push.core.domain.repository.PackagesRepository
    public boolean isIgnoringBatteryOptimizations() {
        return this.b.isIgnoringBatteryOptimizations();
    }
}
