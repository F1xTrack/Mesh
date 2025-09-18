package io.appmetrica.analytics.coreutils.internal;

import android.annotation.SuppressLint;
import android.os.Build;
import kotlin.Metadata;

@Metadata(m22266d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, m22267d2 = {"Lio/appmetrica/analytics/coreutils/internal/AndroidUtils;", "", "", "levelOfApi", "", "isApiAchieved", "core-utils_release"}, m22268k = 1, m22269mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class AndroidUtils {
    public static final AndroidUtils INSTANCE = new AndroidUtils();

    private AndroidUtils() {
    }

    @SuppressLint({"AnnotateVersionCheck"})
    public static final boolean isApiAchieved(int levelOfApi) {
        return Build.VERSION.SDK_INT >= levelOfApi;
    }
}
