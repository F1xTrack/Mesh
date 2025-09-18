package com.yandex.metrica.impl.p022ob;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import com.yandex.metrica.DoNotInline;
import com.yandex.metrica.impl.p022ob.C2641H;
import kotlin.Metadata;

@Metadata(m22265bv = {1, 0, 3}, m22266d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m22267d2 = {"Lcom/yandex/metrica/impl/ob/G;", "", "Landroid/content/Context;", "context", "Lcom/yandex/metrica/impl/ob/D;", "converter", "Lcom/yandex/metrica/impl/ob/H;", "a", "(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/D;)Lcom/yandex/metrica/impl/ob/H;", "<init>", "()V", "mobmetricalib_publicBinaryProdRelease"}, m22268k = 1, m22269mv = {1, 1, 15})
@TargetApi(AvailableCode.APP_IS_BACKGROUND_OR_LOCKED)
@DoNotInline
/* renamed from: com.yandex.metrica.impl.ob.G */
/* loaded from: classes2.dex */
public final class C2616G {

    /* renamed from: a */
    public static final C2616G f21236a = new C2616G();

    /* renamed from: com.yandex.metrica.impl.ob.G$a */
    public static final class a<T, R> implements InterfaceC3038Wm<UsageStatsManager, C2641H.a> {

        /* renamed from: a */
        final /* synthetic */ C2541D f21237a;

        public a(C2541D c2541d) {
            this.f21237a = c2541d;
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC3038Wm
        /* renamed from: a */
        public C2641H.a mo14148a(UsageStatsManager usageStatsManager) {
            C2541D c2541d = this.f21237a;
            int appStandbyBucket = usageStatsManager.getAppStandbyBucket();
            c2541d.getClass();
            if (C2968U2.m15243a(28)) {
                if (C2968U2.m15243a(30) && appStandbyBucket == 45) {
                    return C2641H.a.RESTRICTED;
                }
                if (appStandbyBucket == 10) {
                    return C2641H.a.ACTIVE;
                }
                if (appStandbyBucket == 20) {
                    return C2641H.a.WORKING_SET;
                }
                if (appStandbyBucket == 30) {
                    return C2641H.a.FREQUENT;
                }
                if (appStandbyBucket == 40) {
                    return C2641H.a.RARE;
                }
            }
            return null;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G$b */
    public static final class b<T, R> implements InterfaceC3038Wm<ActivityManager, Boolean> {

        /* renamed from: a */
        public static final b f21238a = new b();

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC3038Wm
        /* renamed from: a */
        public Boolean mo14148a(ActivityManager activityManager) {
            return Boolean.valueOf(activityManager.isBackgroundRestricted());
        }
    }

    private C2616G() {
    }

    /* renamed from: a */
    public static final C2641H m14147a(Context context, C2541D converter) {
        return new C2641H((C2641H.a) C2968U2.m15228a(new a(converter), context, "usagestats", "getting app standby bucket", "usageStatsManager"), (Boolean) C2968U2.m15228a(b.f21238a, context, "activity", "getting is background restricted", "activityManager"));
    }
}
