package io.appmetrica.analytics.identifiers.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import io.appmetrica.analytics.identifiers.impl.C4335a;
import io.appmetrica.analytics.identifiers.impl.C4337c;
import io.appmetrica.analytics.identifiers.impl.C4338d;
import io.appmetrica.analytics.identifiers.impl.InterfaceC4336b;

@Keep
/* loaded from: classes2.dex */
public class AdvIdentifiersProvider {

    /* renamed from: a */
    public static final /* synthetic */ int f29834a = 0;
    private static final C4338d retriever = new C4338d();

    public static Bundle requestIdentifiers(Context context, Bundle bundle) {
        C4337c c4337cMo19171a;
        InterfaceC4336b interfaceC4336b = (InterfaceC4336b) retriever.f29817a.get(bundle.getString("io.appmetrica.analytics.identifiers.extra.PROVIDER"));
        if (interfaceC4336b == null || (c4337cMo19171a = interfaceC4336b.mo19171a(context)) == null) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        C4335a c4335a = c4337cMo19171a.f29815b;
        if (c4335a != null) {
            Bundle bundle3 = new Bundle();
            bundle3.putString("io.appmetrica.analytics.identifiers.extra.PROVIDER", c4335a.f29811a);
            bundle3.putString("io.appmetrica.analytics.identifiers.extra.ID", c4335a.f29812b);
            Boolean bool = c4335a.f29813c;
            if (bool != null) {
                bundle3.putBoolean("io.appmetrica.analytics.identifiers.extra.LIMITED", bool.booleanValue());
            }
            bundle2.putBundle("io.appmetrica.analytics.identifiers.extra.TRACKING_INFO", bundle3);
        }
        bundle2.putString("io.appmetrica.analytics.identifiers.extra.STATUS", c4337cMo19171a.f29814a.getValue());
        bundle2.putString("io.appmetrica.analytics.identifiers.extra.ERROR_MESSAGE", c4337cMo19171a.f29816c);
        return bundle2;
    }
}
