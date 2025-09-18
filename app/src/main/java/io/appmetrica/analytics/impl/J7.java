package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Map;

/* loaded from: classes2.dex */
public final class J7 {
    public final boolean a;
    public DeferredDeeplinkListener b;
    public DeferredDeeplinkParametersListener c;
    public H7 d;

    public J7(boolean z) {
        this.a = z;
    }

    public final void a(int i) {
        H7 h7 = this.d;
        String str = h7 == null ? null : h7.c;
        DeferredDeeplinkListener deferredDeeplinkListener = this.b;
        if (deferredDeeplinkListener != null) {
            if (i == 0) {
                throw null;
            }
            int i2 = i - 1;
            deferredDeeplinkListener.onError(i2 != 0 ? i2 != 1 ? i2 != 2 ? DeferredDeeplinkListener.Error.UNKNOWN : DeferredDeeplinkListener.Error.NO_REFERRER : DeferredDeeplinkListener.Error.PARSE_ERROR : DeferredDeeplinkListener.Error.NOT_A_FIRST_LAUNCH, (String) WrapUtils.getOrDefault(str, ""));
            this.b = null;
        }
        DeferredDeeplinkParametersListener deferredDeeplinkParametersListener = this.c;
        if (deferredDeeplinkParametersListener != null) {
            if (i == 0) {
                throw null;
            }
            int i3 = i - 1;
            deferredDeeplinkParametersListener.onError(i3 != 0 ? i3 != 1 ? i3 != 2 ? DeferredDeeplinkParametersListener.Error.UNKNOWN : DeferredDeeplinkParametersListener.Error.NO_REFERRER : DeferredDeeplinkParametersListener.Error.PARSE_ERROR : DeferredDeeplinkParametersListener.Error.NOT_A_FIRST_LAUNCH, (String) WrapUtils.getOrDefault(str, ""));
            this.c = null;
        }
    }

    public final void a() {
        H7 h7 = this.d;
        if (h7 != null) {
            String str = h7.b;
            if (str != null) {
                DeferredDeeplinkListener deferredDeeplinkListener = this.b;
                if (deferredDeeplinkListener != null) {
                    deferredDeeplinkListener.onDeeplinkLoaded(str);
                    this.b = null;
                }
                if (!hn.a(this.d.a)) {
                    Map<String, String> map = this.d.a;
                    DeferredDeeplinkParametersListener deferredDeeplinkParametersListener = this.c;
                    if (deferredDeeplinkParametersListener != null) {
                        deferredDeeplinkParametersListener.onParametersLoaded(map);
                        this.c = null;
                        return;
                    }
                    return;
                }
                String str2 = this.d.c;
                DeferredDeeplinkParametersListener deferredDeeplinkParametersListener2 = this.c;
                if (deferredDeeplinkParametersListener2 != null) {
                    deferredDeeplinkParametersListener2.onError(DeferredDeeplinkParametersListener.Error.PARSE_ERROR, (String) WrapUtils.getOrDefault(str2, ""));
                    this.c = null;
                    return;
                }
                return;
            }
            if (h7.c != null) {
                a(2);
            } else {
                a(3);
            }
        }
    }
}
