package com.p019vk.push.core.data.source;

import android.content.pm.PackageManager;
import com.p019vk.push.core.utils.PackageExtenstionsKt;
import java.util.List;
import kotlin.Metadata;
import p000.O90;

@Metadata(m22266d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m22267d2 = {"Lcom/vk/push/core/data/source/PackageManagerDataSource;", "", "Landroid/content/pm/PackageManager;", "packageManager", "<init>", "(Landroid/content/pm/PackageManager;)V", "", "", "getInitializedHostPackages", "()Ljava/util/List;", "getInitializedClientPackages", "packageName", "", "checkPackageNameIsInstalled", "(Ljava/lang/String;)Z", "core_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class PackageManagerDataSource {

    /* renamed from: a */
    public final PackageManager f20359a;

    public PackageManagerDataSource(PackageManager packageManager) {
        O90.m5968f(packageManager, "packageManager");
        this.f20359a = packageManager;
    }

    public final boolean checkPackageNameIsInstalled(String packageName) {
        O90.m5968f(packageName, "packageName");
        return PackageExtenstionsKt.checkAppInstalled(this.f20359a, packageName);
    }

    public final List<String> getInitializedClientPackages() {
        return PackageExtenstionsKt.getPackagesWithDeviceId(this.f20359a);
    }

    public final List<String> getInitializedHostPackages() {
        return PackageExtenstionsKt.getInitializedHostPackages(this.f20359a);
    }
}
