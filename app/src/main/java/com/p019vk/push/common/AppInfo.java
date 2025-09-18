package com.p019vk.push.common;

import kotlin.Metadata;
import p000.F91;
import p000.O90;

@Metadata(m22266d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\b¨\u0006\u0019"}, m22267d2 = {"Lcom/vk/push/common/AppInfo;", "", "", "packageName", "pubKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/vk/push/common/AppInfo;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getPackageName", "b", "getPubKey", "common_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AppInfo {

    /* renamed from: a, reason: from kotlin metadata */
    public final String packageName;

    /* renamed from: b, reason: from kotlin metadata */
    public final String pubKey;

    public AppInfo(String str, String str2) {
        O90.m5968f(str, "packageName");
        O90.m5968f(str2, "pubKey");
        this.packageName = str;
        this.pubKey = str2;
    }

    public static /* synthetic */ AppInfo copy$default(AppInfo appInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appInfo.packageName;
        }
        if ((i & 2) != 0) {
            str2 = appInfo.pubKey;
        }
        return appInfo.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPubKey() {
        return this.pubKey;
    }

    public final AppInfo copy(String packageName, String pubKey) {
        O90.m5968f(packageName, "packageName");
        O90.m5968f(pubKey, "pubKey");
        return new AppInfo(packageName, pubKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppInfo)) {
            return false;
        }
        AppInfo appInfo = (AppInfo) other;
        return O90.m5963a(this.packageName, appInfo.packageName) && O90.m5963a(this.pubKey, appInfo.pubKey);
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getPubKey() {
        return this.pubKey;
    }

    public int hashCode() {
        return this.pubKey.hashCode() + (this.packageName.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AppInfo(packageName=");
        sb.append(this.packageName);
        sb.append(", pubKey=");
        return F91.m2539v(sb, this.pubKey, ')');
    }
}
