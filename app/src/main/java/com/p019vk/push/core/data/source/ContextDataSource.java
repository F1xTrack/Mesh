package com.p019vk.push.core.data.source;

import android.content.Context;
import com.p019vk.push.core.utils.PackageExtenstionsKt;
import kotlin.Metadata;
import p000.O90;

@Metadata(m22266d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m22267d2 = {"Lcom/vk/push/core/data/source/ContextDataSource;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "getPackageName", "()Ljava/lang/String;", "", "isIgnoringBatteryOptimizations", "()Z", "core_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class ContextDataSource {

    /* renamed from: a */
    public final Context f20354a;

    public ContextDataSource(Context context) {
        O90.m5968f(context, "context");
        this.f20354a = context;
    }

    public final String getPackageName() {
        String packageName = this.f20354a.getPackageName();
        O90.m5967e(packageName, "context.packageName");
        return packageName;
    }

    public final boolean isIgnoringBatteryOptimizations() {
        return PackageExtenstionsKt.isIgnoringBatteryOptimizations$default(this.f20354a, null, 1, null);
    }
}
