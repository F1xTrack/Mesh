package com.p019vk.push.core.data.source;

import android.content.Context;
import com.p019vk.push.core.utils.PackageExtenstionsKt;
import com.p019vk.push.core.utils.ProcessUtilsKt;
import kotlin.Metadata;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m22267d2 = {"Lcom/vk/push/core/data/source/CallingAppDataSource;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "uid", "", "getPackageNameForUid", "(I)Ljava/lang/String;", "pid", "getPackageNameForPid", "packageName", "getSignatureForPackageName", "(Ljava/lang/String;)Ljava/lang/String;", "core_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class CallingAppDataSource {

    /* renamed from: a */
    public final Context f20353a;

    public CallingAppDataSource(Context context) {
        O90.m5968f(context, "context");
        this.f20353a = context;
    }

    public final String getPackageNameForPid(int pid) {
        return ProcessUtilsKt.getPackageNameForPid(this.f20353a, pid);
    }

    public final String getPackageNameForUid(int uid) {
        return this.f20353a.getPackageManager().getNameForUid(uid);
    }

    public final String getSignatureForPackageName(String packageName) {
        O90.m5968f(packageName, "packageName");
        return PackageExtenstionsKt.getApplicationSignature(this.f20353a, packageName);
    }
}
