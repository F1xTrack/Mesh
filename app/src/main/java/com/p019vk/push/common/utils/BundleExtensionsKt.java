package com.p019vk.push.common.utils;

import android.os.Build;
import android.os.Bundle;
import kotlin.Metadata;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a$\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\b¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m22267d2 = {"getParcelableCompat", "T", "Landroid/os/Bundle;", "key", "", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Object;", "common_release"}, m22268k = 2, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class BundleExtensionsKt {
    public static final /* synthetic */ <T> T getParcelableCompat(Bundle bundle, String str) {
        O90.m5968f(bundle, "<this>");
        O90.m5968f(str, "key");
        if (Build.VERSION.SDK_INT < 33) {
            return (T) bundle.getParcelable(str);
        }
        O90.m5974l();
        throw null;
    }
}
