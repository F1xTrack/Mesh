package com.vk.push.core.data.source;

import android.content.pm.PackageManager;
import com.vk.push.core.utils.PackageExtenstionsKt;
import defpackage.O90;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/vk/push/core/data/source/PackageManagerDataSource;", "", "Landroid/content/pm/PackageManager;", "packageManager", "<init>", "(Landroid/content/pm/PackageManager;)V", "", "", "getInitializedHostPackages", "()Ljava/util/List;", "getInitializedClientPackages", "packageName", "", "checkPackageNameIsInstalled", "(Ljava/lang/String;)Z", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class PackageManagerDataSource {
    public final PackageManager a;

    public PackageManagerDataSource(PackageManager packageManager) {
        O90.f(packageManager, "packageManager");
        this.a = packageManager;
    }

    public final boolean checkPackageNameIsInstalled(String packageName) {
        O90.f(packageName, "packageName");
        return PackageExtenstionsKt.checkAppInstalled(this.a, packageName);
    }

    public final List<String> getInitializedClientPackages() {
        return PackageExtenstionsKt.getPackagesWithDeviceId(this.a);
    }

    public final List<String> getInitializedHostPackages() {
        return PackageExtenstionsKt.getInitializedHostPackages(this.a);
    }
}
