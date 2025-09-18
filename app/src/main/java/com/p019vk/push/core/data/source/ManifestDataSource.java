package com.p019vk.push.core.data.source;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import kotlin.Metadata;
import p000.AbstractC0705LB;
import p000.C10801qd0;
import p000.F71;
import p000.O90;
import p000.OS0;
import p000.RQ1;

@Metadata(m22266d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\fJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u0010J\r\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0012¨\u0006\u0015"}, m22267d2 = {"Lcom/vk/push/core/data/source/ManifestDataSource;", "", "Landroid/content/pm/PackageManager;", "packageManager", "", "packageName", "<init>", "(Landroid/content/pm/PackageManager;Ljava/lang/String;)V", "key", "getString", "(Ljava/lang/String;)Ljava/lang/String;", "defaultValue", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "getInt", "(Ljava/lang/String;)Ljava/lang/Integer;", "(Ljava/lang/String;I)I", "getNotificationIcon", "()I", "getNotificationColor", "Companion", "core_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class ManifestDataSource {

    /* renamed from: a */
    public final PackageManager f20356a;

    /* renamed from: b */
    public final String f20357b;

    /* renamed from: c */
    public final F71 f20358c;

    public ManifestDataSource(PackageManager packageManager, String str) {
        O90.m5968f(packageManager, "packageManager");
        O90.m5968f(str, "packageName");
        this.f20356a = packageManager;
        this.f20357b = str;
        this.f20358c = AbstractC0705LB.m4915b(new C10801qd0(9, this));
    }

    public static final Bundle access$getMetaDataBundle(ManifestDataSource manifestDataSource) {
        Object objM7015b;
        try {
            objM7015b = manifestDataSource.f20356a.getApplicationInfo(manifestDataSource.f20357b, 128);
        } catch (Throwable th) {
            objM7015b = RQ1.m7015b(th);
        }
        if (objM7015b instanceof OS0) {
            objM7015b = null;
        }
        ApplicationInfo applicationInfo = (ApplicationInfo) objM7015b;
        if (applicationInfo != null) {
            return applicationInfo.metaData;
        }
        return null;
    }

    /* renamed from: a */
    public final Bundle m13736a() {
        return (Bundle) this.f20358c.getValue();
    }

    public final Integer getInt(String key) {
        Bundle bundleM13736a;
        O90.m5968f(key, "key");
        Bundle bundleM13736a2 = m13736a();
        if (bundleM13736a2 == null || !bundleM13736a2.containsKey(key) || (bundleM13736a = m13736a()) == null) {
            return null;
        }
        return Integer.valueOf(bundleM13736a.getInt(key));
    }

    public final int getNotificationColor() {
        Bundle bundleM13736a = m13736a();
        if (bundleM13736a != null) {
            return bundleM13736a.getInt("ru.rustore.sdk.pushclient.default_notification_color");
        }
        return 0;
    }

    public final int getNotificationIcon() {
        Bundle bundleM13736a = m13736a();
        if (bundleM13736a != null) {
            return bundleM13736a.getInt("ru.rustore.sdk.pushclient.default_notification_icon");
        }
        return 0;
    }

    public final String getString(String key) {
        O90.m5968f(key, "key");
        Bundle bundleM13736a = m13736a();
        if (bundleM13736a != null) {
            return bundleM13736a.getString(key);
        }
        return null;
    }

    public final String getString(String key, String defaultValue) {
        O90.m5968f(key, "key");
        O90.m5968f(defaultValue, "defaultValue");
        Bundle bundleM13736a = m13736a();
        String string = bundleM13736a != null ? bundleM13736a.getString(key, defaultValue) : null;
        return string == null ? defaultValue : string;
    }

    public final int getInt(String key, int defaultValue) {
        O90.m5968f(key, "key");
        Bundle bundleM13736a = m13736a();
        return bundleM13736a != null ? bundleM13736a.getInt(key, defaultValue) : defaultValue;
    }
}
