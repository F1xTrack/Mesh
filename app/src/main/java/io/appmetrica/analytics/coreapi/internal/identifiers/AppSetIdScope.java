package io.appmetrica.analytics.coreapi.internal.identifiers;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;

@Metadata(m22266d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m22267d2 = {"Lio/appmetrica/analytics/coreapi/internal/identifiers/AppSetIdScope;", "", "", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", GrsBaseInfo.CountryCodeSource.UNKNOWN, GrsBaseInfo.CountryCodeSource.APP, "DEVELOPER", "core-api_release"}, m22268k = 1, m22269mv = {1, 6, 0})
/* loaded from: classes2.dex */
public enum AppSetIdScope {
    UNKNOWN(""),
    APP("app"),
    DEVELOPER("developer");


    /* renamed from: a, reason: from kotlin metadata */
    private final String value;

    AppSetIdScope(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
