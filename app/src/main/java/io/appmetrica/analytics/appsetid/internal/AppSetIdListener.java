package io.appmetrica.analytics.appsetid.internal;

import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope;
import kotlin.Metadata;

@Metadata(m22266d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m22267d2 = {"Lio/appmetrica/analytics/appsetid/internal/AppSetIdListener;", "", "", NotificationConstants.f19487ID, "Lio/appmetrica/analytics/coreapi/internal/identifiers/AppSetIdScope;", "scope", "LTf1;", "onAppSetIdRetrieved", "(Ljava/lang/String;Lio/appmetrica/analytics/coreapi/internal/identifiers/AppSetIdScope;)V", "", "ex", "onFailure", "(Ljava/lang/Throwable;)V", "appsetid_release"}, m22268k = 1, m22269mv = {1, 6, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public interface AppSetIdListener {
    void onAppSetIdRetrieved(String id, AppSetIdScope scope);

    void onFailure(Throwable ex);
}
