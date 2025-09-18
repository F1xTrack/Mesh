package com.yandex.metrica.impl.ob;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.yandex.metrica.DoNotInline;
import com.yandex.metrica.impl.ob.H;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/yandex/metrica/impl/ob/G;", "", "Landroid/content/Context;", "context", "Lcom/yandex/metrica/impl/ob/D;", "converter", "Lcom/yandex/metrica/impl/ob/H;", "a", "(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/D;)Lcom/yandex/metrica/impl/ob/H;", "<init>", "()V", "mobmetricalib_publicBinaryProdRelease"}, k = 1, mv = {1, 1, 15})
@TargetApi(AvailableCode.APP_IS_BACKGROUND_OR_LOCKED)
@DoNotInline
/* loaded from: classes2.dex */
public final class G {
    public static final G a = new G();

    public static final class a<T, R> implements Wm<UsageStatsManager, H.a> {
        final /* synthetic */ D a;

        public a(D d) {
            this.a = d;
        }

        @Override // com.yandex.metrica.impl.ob.Wm
        public H.a a(UsageStatsManager usageStatsManager) {
            D d = this.a;
            int appStandbyBucket = usageStatsManager.getAppStandbyBucket();
            d.getClass();
            if (U2.a(28)) {
                if (U2.a(30) && appStandbyBucket == 45) {
                    return H.a.RESTRICTED;
                }
                if (appStandbyBucket == 10) {
                    return H.a.ACTIVE;
                }
                if (appStandbyBucket == 20) {
                    return H.a.WORKING_SET;
                }
                if (appStandbyBucket == 30) {
                    return H.a.FREQUENT;
                }
                if (appStandbyBucket == 40) {
                    return H.a.RARE;
                }
            }
            return null;
        }
    }

    public static final class b<T, R> implements Wm<ActivityManager, Boolean> {
        public static final b a = new b();

        @Override // com.yandex.metrica.impl.ob.Wm
        public Boolean a(ActivityManager activityManager) {
            return Boolean.valueOf(activityManager.isBackgroundRestricted());
        }
    }

    private G() {
    }

    public static final H a(Context context, D converter) {
        return new H((H.a) U2.a(new a(converter), context, "usagestats", "getting app standby bucket", "usageStatsManager"), (Boolean) U2.a(b.a, context, "activity", "getting is background restricted", "activityManager"));
    }
}
