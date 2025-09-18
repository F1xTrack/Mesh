package io.appmetrica.analytics.impl;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import kotlin.Metadata;
import p000.C0071B7;
import p000.C4262il;

@DoNotInline
@Metadata(m22266d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, m22267d2 = {"Lio/appmetrica/analytics/impl/B2;", "", "Landroid/content/Context;", "context", "Lio/appmetrica/analytics/impl/d2;", "converter", "Lio/appmetrica/analytics/impl/E2;", "a", "<init>", "()V", "analytics_binaryProdRelease"}, m22268k = 1, m22269mv = {1, 6, 0})
@TargetApi(AvailableCode.APP_IS_BACKGROUND_OR_LOCKED)
/* renamed from: io.appmetrica.analytics.impl.B2 */
/* loaded from: classes2.dex */
public final class C4384B2 {

    /* renamed from: a */
    public static final C4384B2 f29888a = new C4384B2();

    private C4384B2() {
    }

    /* renamed from: a */
    public static final C4459E2 m19221a(Context context, C5061d2 converter) {
        return new C4459E2((EnumC4434D2) SystemServiceUtils.accessSystemServiceByNameSafely(context, "usagestats", "getting app standby bucket", "usageStatsManager", new C0071B7(2, converter)), (Boolean) SystemServiceUtils.accessSystemServiceByNameSafely(context, "activity", "getting is background restricted", "activityManager", new C4262il(3)));
    }

    /* renamed from: a */
    public static final EnumC4434D2 m19220a(C5061d2 c5061d2, UsageStatsManager usageStatsManager) {
        int appStandbyBucket = usageStatsManager.getAppStandbyBucket();
        c5061d2.getClass();
        if (AndroidUtils.isApiAchieved(28)) {
            if (AndroidUtils.isApiAchieved(30) && appStandbyBucket == 45) {
                return EnumC4434D2.RESTRICTED;
            }
            if (appStandbyBucket == 10) {
                return EnumC4434D2.ACTIVE;
            }
            if (appStandbyBucket == 20) {
                return EnumC4434D2.WORKING_SET;
            }
            if (appStandbyBucket == 30) {
                return EnumC4434D2.FREQUENT;
            }
            if (appStandbyBucket == 40) {
                return EnumC4434D2.RARE;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static final Boolean m19222a(ActivityManager activityManager) {
        return Boolean.valueOf(activityManager.isBackgroundRestricted());
    }
}
