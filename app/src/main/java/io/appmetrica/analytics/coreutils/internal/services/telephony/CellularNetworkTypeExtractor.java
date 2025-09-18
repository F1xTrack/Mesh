package io.appmetrica.analytics.coreutils.internal.services.telephony;

import android.annotation.TargetApi;
import android.content.Context;
import android.telephony.TelephonyManager;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import kotlin.Metadata;

@Metadata(m22266d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \f2\u00020\u0001:\u0003\f\u0005\rB\u000f\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m22267d2 = {"Lio/appmetrica/analytics/coreutils/internal/services/telephony/CellularNetworkTypeExtractor;", "", "", "getNetworkType", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "b", "core-utils_release"}, m22268k = 1, m22269mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class CellularNetworkTypeExtractor {
    public static final String UNKNOWN_NETWORK_TYPE_VALUE = "unknown";

    /* renamed from: a, reason: from kotlin metadata */
    private final Context context;

    /* renamed from: b */
    private final FunctionWithThrowable f29761b;

    @DoNotInline
    @Metadata(m22266d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m22267d2 = {"Lio/appmetrica/analytics/coreutils/internal/services/telephony/CellularNetworkTypeExtractor$a;", "Lio/appmetrica/analytics/coreapi/internal/backport/FunctionWithThrowable;", "Landroid/telephony/TelephonyManager;", "", "input", "a", "(Landroid/telephony/TelephonyManager;)Ljava/lang/Integer;", "<init>", "()V", "core-utils_release"}, m22268k = 1, m22269mv = {1, 6, 0})
    @TargetApi(24)
    /* renamed from: io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor$a */
    public static final class C4330a implements FunctionWithThrowable<TelephonyManager, Integer> {
        @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable, p000.InterfaceC6471n9
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer apply(TelephonyManager input) {
            return Integer.valueOf(input.getDataNetworkType());
        }
    }

    @DoNotInline
    @Metadata(m22266d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m22267d2 = {"Lio/appmetrica/analytics/coreutils/internal/services/telephony/CellularNetworkTypeExtractor$b;", "Lio/appmetrica/analytics/coreapi/internal/backport/FunctionWithThrowable;", "Landroid/telephony/TelephonyManager;", "", "input", "a", "(Landroid/telephony/TelephonyManager;)Ljava/lang/Integer;", "<init>", "()V", "core-utils_release"}, m22268k = 1, m22269mv = {1, 6, 0})
    /* renamed from: io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor$b */
    public static final class C4331b implements FunctionWithThrowable<TelephonyManager, Integer> {
        @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable, p000.InterfaceC6471n9
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer apply(TelephonyManager input) {
            return Integer.valueOf(input.getNetworkType());
        }
    }

    public CellularNetworkTypeExtractor(Context context) {
        this.context = context;
        this.f29761b = AndroidUtils.isApiAchieved(24) ? new C4330a() : new C4331b();
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getNetworkType() {
        return CellularNetworkTypeConverter.convert((Integer) SystemServiceUtils.accessSystemServiceByNameSafely(this.context, "phone", "Extracting cellular networkType", "TelephonyManager", this.f29761b));
    }
}
