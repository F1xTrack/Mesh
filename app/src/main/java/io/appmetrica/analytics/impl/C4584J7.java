package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.J7 */
/* loaded from: classes2.dex */
public final class C4584J7 {

    /* renamed from: a */
    public final boolean f30333a;

    /* renamed from: b */
    public DeferredDeeplinkListener f30334b;

    /* renamed from: c */
    public DeferredDeeplinkParametersListener f30335c;

    /* renamed from: d */
    public C4536H7 f30336d;

    public C4584J7(boolean z) {
        this.f30333a = z;
    }

    /* renamed from: a */
    public final void m19530a(int i) {
        C4536H7 c4536h7 = this.f30336d;
        String str = c4536h7 == null ? null : c4536h7.f30244c;
        DeferredDeeplinkListener deferredDeeplinkListener = this.f30334b;
        if (deferredDeeplinkListener != null) {
            if (i == 0) {
                throw null;
            }
            int i2 = i - 1;
            deferredDeeplinkListener.onError(i2 != 0 ? i2 != 1 ? i2 != 2 ? DeferredDeeplinkListener.Error.UNKNOWN : DeferredDeeplinkListener.Error.NO_REFERRER : DeferredDeeplinkListener.Error.PARSE_ERROR : DeferredDeeplinkListener.Error.NOT_A_FIRST_LAUNCH, (String) WrapUtils.getOrDefault(str, ""));
            this.f30334b = null;
        }
        DeferredDeeplinkParametersListener deferredDeeplinkParametersListener = this.f30335c;
        if (deferredDeeplinkParametersListener != null) {
            if (i == 0) {
                throw null;
            }
            int i3 = i - 1;
            deferredDeeplinkParametersListener.onError(i3 != 0 ? i3 != 1 ? i3 != 2 ? DeferredDeeplinkParametersListener.Error.UNKNOWN : DeferredDeeplinkParametersListener.Error.NO_REFERRER : DeferredDeeplinkParametersListener.Error.PARSE_ERROR : DeferredDeeplinkParametersListener.Error.NOT_A_FIRST_LAUNCH, (String) WrapUtils.getOrDefault(str, ""));
            this.f30335c = null;
        }
    }

    /* renamed from: a */
    public final void m19529a() {
        C4536H7 c4536h7 = this.f30336d;
        if (c4536h7 != null) {
            String str = c4536h7.f30243b;
            if (str != null) {
                DeferredDeeplinkListener deferredDeeplinkListener = this.f30334b;
                if (deferredDeeplinkListener != null) {
                    deferredDeeplinkListener.onDeeplinkLoaded(str);
                    this.f30334b = null;
                }
                if (!AbstractC5182hn.m20514a(this.f30336d.f30242a)) {
                    Map<String, String> map = this.f30336d.f30242a;
                    DeferredDeeplinkParametersListener deferredDeeplinkParametersListener = this.f30335c;
                    if (deferredDeeplinkParametersListener != null) {
                        deferredDeeplinkParametersListener.onParametersLoaded(map);
                        this.f30335c = null;
                        return;
                    }
                    return;
                }
                String str2 = this.f30336d.f30244c;
                DeferredDeeplinkParametersListener deferredDeeplinkParametersListener2 = this.f30335c;
                if (deferredDeeplinkParametersListener2 != null) {
                    deferredDeeplinkParametersListener2.onError(DeferredDeeplinkParametersListener.Error.PARSE_ERROR, (String) WrapUtils.getOrDefault(str2, ""));
                    this.f30335c = null;
                    return;
                }
                return;
            }
            if (c4536h7.f30244c != null) {
                m19530a(2);
            } else {
                m19530a(3);
            }
        }
    }
}
