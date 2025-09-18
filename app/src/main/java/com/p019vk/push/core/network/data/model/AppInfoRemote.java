package com.p019vk.push.core.network.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0006\u0010\u0011¨\u0006\u0012"}, m22267d2 = {"Lcom/vk/push/core/network/data/model/AppInfoRemote;", "", "", "packageName", "pubKey", "", "isArbiter", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "a", "Ljava/lang/String;", "getPackageName", "()Ljava/lang/String;", "b", "getPubKey", "c", "Z", "()Z", "core-network_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class AppInfoRemote {

    /* renamed from: a, reason: from kotlin metadata */
    public final String packageName;

    /* renamed from: b, reason: from kotlin metadata */
    public final String pubKey;

    /* renamed from: c, reason: from kotlin metadata */
    public final boolean isArbiter;

    public AppInfoRemote(String str, String str2, boolean z) {
        O90.m5968f(str, "packageName");
        O90.m5968f(str2, "pubKey");
        this.packageName = str;
        this.pubKey = str2;
        this.isArbiter = z;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getPubKey() {
        return this.pubKey;
    }

    /* renamed from: isArbiter, reason: from getter */
    public final boolean getIsArbiter() {
        return this.isArbiter;
    }

    public /* synthetic */ AppInfoRemote(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? false : z);
    }
}
