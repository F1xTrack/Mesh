package io.appmetrica.analytics.impl;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import defpackage.C4403il;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import kotlin.Metadata;

@DoNotInline
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Lio/appmetrica/analytics/impl/B2;", "", "Landroid/content/Context;", "context", "Lio/appmetrica/analytics/impl/d2;", "converter", "Lio/appmetrica/analytics/impl/E2;", "a", "<init>", "()V", "analytics_binaryProdRelease"}, k = 1, mv = {1, 6, 0})
@TargetApi(AvailableCode.APP_IS_BACKGROUND_OR_LOCKED)
/* loaded from: classes2.dex */
public final class B2 {
    public static final B2 a = new B2();

    private B2() {
    }

    public static final E2 a(Context context, C4491d2 converter) {
        return new E2((D2) SystemServiceUtils.accessSystemServiceByNameSafely(context, "usagestats", "getting app standby bucket", "usageStatsManager", new defpackage.B7(2, converter)), (Boolean) SystemServiceUtils.accessSystemServiceByNameSafely(context, "activity", "getting is background restricted", "activityManager", new C4403il(3)));
    }

    public static final D2 a(C4491d2 c4491d2, UsageStatsManager usageStatsManager) {
        int appStandbyBucket = usageStatsManager.getAppStandbyBucket();
        c4491d2.getClass();
        if (AndroidUtils.isApiAchieved(28)) {
            if (AndroidUtils.isApiAchieved(30) && appStandbyBucket == 45) {
                return D2.RESTRICTED;
            }
            if (appStandbyBucket == 10) {
                return D2.ACTIVE;
            }
            if (appStandbyBucket == 20) {
                return D2.WORKING_SET;
            }
            if (appStandbyBucket == 30) {
                return D2.FREQUENT;
            }
            if (appStandbyBucket == 40) {
                return D2.RARE;
            }
        }
        return null;
    }

    public static final Boolean a(ActivityManager activityManager) {
        return Boolean.valueOf(activityManager.isBackgroundRestricted());
    }
}
