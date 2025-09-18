package com.vk.push.core.data.source;

import android.content.Context;
import com.vk.push.core.utils.PackageExtenstionsKt;
import defpackage.O90;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/vk/push/core/data/source/ContextDataSource;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "getPackageName", "()Ljava/lang/String;", "", "isIgnoringBatteryOptimizations", "()Z", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ContextDataSource {
    public final Context a;

    public ContextDataSource(Context context) {
        O90.f(context, "context");
        this.a = context;
    }

    public final String getPackageName() {
        String packageName = this.a.getPackageName();
        O90.e(packageName, "context.packageName");
        return packageName;
    }

    public final boolean isIgnoringBatteryOptimizations() {
        return PackageExtenstionsKt.isIgnoringBatteryOptimizations$default(this.a, null, 1, null);
    }
}
