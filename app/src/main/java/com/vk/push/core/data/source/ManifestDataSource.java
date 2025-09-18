package com.vk.push.core.data.source;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import defpackage.C6685qd0;
import defpackage.F71;
import defpackage.LB;
import defpackage.O90;
import defpackage.OS0;
import defpackage.RQ1;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\fJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u0010J\r\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/vk/push/core/data/source/ManifestDataSource;", "", "Landroid/content/pm/PackageManager;", "packageManager", "", "packageName", "<init>", "(Landroid/content/pm/PackageManager;Ljava/lang/String;)V", "key", "getString", "(Ljava/lang/String;)Ljava/lang/String;", "defaultValue", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "getInt", "(Ljava/lang/String;)Ljava/lang/Integer;", "(Ljava/lang/String;I)I", "getNotificationIcon", "()I", "getNotificationColor", "Companion", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ManifestDataSource {
    public final PackageManager a;
    public final String b;
    public final F71 c;

    public ManifestDataSource(PackageManager packageManager, String str) {
        O90.f(packageManager, "packageManager");
        O90.f(str, "packageName");
        this.a = packageManager;
        this.b = str;
        this.c = LB.b(new C6685qd0(9, this));
    }

    public static final Bundle access$getMetaDataBundle(ManifestDataSource manifestDataSource) {
        Object objB;
        try {
            objB = manifestDataSource.a.getApplicationInfo(manifestDataSource.b, 128);
        } catch (Throwable th) {
            objB = RQ1.b(th);
        }
        if (objB instanceof OS0) {
            objB = null;
        }
        ApplicationInfo applicationInfo = (ApplicationInfo) objB;
        if (applicationInfo != null) {
            return applicationInfo.metaData;
        }
        return null;
    }

    public final Bundle a() {
        return (Bundle) this.c.getValue();
    }

    public final Integer getInt(String key) {
        Bundle bundleA;
        O90.f(key, "key");
        Bundle bundleA2 = a();
        if (bundleA2 == null || !bundleA2.containsKey(key) || (bundleA = a()) == null) {
            return null;
        }
        return Integer.valueOf(bundleA.getInt(key));
    }

    public final int getNotificationColor() {
        Bundle bundleA = a();
        if (bundleA != null) {
            return bundleA.getInt("ru.rustore.sdk.pushclient.default_notification_color");
        }
        return 0;
    }

    public final int getNotificationIcon() {
        Bundle bundleA = a();
        if (bundleA != null) {
            return bundleA.getInt("ru.rustore.sdk.pushclient.default_notification_icon");
        }
        return 0;
    }

    public final String getString(String key) {
        O90.f(key, "key");
        Bundle bundleA = a();
        if (bundleA != null) {
            return bundleA.getString(key);
        }
        return null;
    }

    public final String getString(String key, String defaultValue) {
        O90.f(key, "key");
        O90.f(defaultValue, "defaultValue");
        Bundle bundleA = a();
        String string = bundleA != null ? bundleA.getString(key, defaultValue) : null;
        return string == null ? defaultValue : string;
    }

    public final int getInt(String key, int defaultValue) {
        O90.f(key, "key");
        Bundle bundleA = a();
        return bundleA != null ? bundleA.getInt(key, defaultValue) : defaultValue;
    }
}
