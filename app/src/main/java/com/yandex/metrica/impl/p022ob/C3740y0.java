package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.y0 */
/* loaded from: classes2.dex */
public class C3740y0 {

    /* renamed from: a */
    private boolean f25277a;

    /* renamed from: b */
    private DeferredDeeplinkListener f25278b;

    /* renamed from: c */
    private DeferredDeeplinkParametersListener f25279c;

    /* renamed from: d */
    private C3714x0 f25280d;

    /* renamed from: com.yandex.metrica.impl.ob.y0$a */
    public enum a {
        NOT_A_FIRST_LAUNCH,
        PARSE_ERROR,
        NO_REFERRER
    }

    public C3740y0(boolean z) {
        this.f25277a = z;
    }

    /* renamed from: a */
    public void m17209a(C3714x0 c3714x0) {
        this.f25280d = c3714x0;
        m17204a();
    }

    /* renamed from: a */
    private void m17205a(a aVar) {
        DeferredDeeplinkListener.Error error;
        C3714x0 c3714x0 = this.f25280d;
        String str = c3714x0 == null ? null : c3714x0.f25218c;
        DeferredDeeplinkListener deferredDeeplinkListener = this.f25278b;
        if (deferredDeeplinkListener != null) {
            int iOrdinal = aVar.ordinal();
            if (iOrdinal == 0) {
                error = DeferredDeeplinkListener.Error.NOT_A_FIRST_LAUNCH;
            } else if (iOrdinal == 1) {
                error = DeferredDeeplinkListener.Error.PARSE_ERROR;
            } else if (iOrdinal != 2) {
                error = DeferredDeeplinkListener.Error.UNKNOWN;
            } else {
                error = DeferredDeeplinkListener.Error.NO_REFERRER;
            }
            deferredDeeplinkListener.onError(error, str == null ? "" : str);
            this.f25278b = null;
        }
        m17206a(aVar, str);
    }

    /* renamed from: a */
    public void m17208a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.f25279c = deferredDeeplinkParametersListener;
        if (this.f25277a) {
            m17205a(a.NOT_A_FIRST_LAUNCH);
        } else {
            m17204a();
        }
    }

    /* renamed from: a */
    public void m17207a(DeferredDeeplinkListener deferredDeeplinkListener) {
        this.f25278b = deferredDeeplinkListener;
        if (this.f25277a) {
            m17205a(a.NOT_A_FIRST_LAUNCH);
        } else {
            m17204a();
        }
    }

    /* renamed from: a */
    private void m17204a() {
        C3714x0 c3714x0 = this.f25280d;
        if (c3714x0 != null) {
            String str = c3714x0.f25217b;
            if (str != null) {
                DeferredDeeplinkListener deferredDeeplinkListener = this.f25278b;
                if (deferredDeeplinkListener != null) {
                    deferredDeeplinkListener.onDeeplinkLoaded(str);
                    this.f25278b = null;
                }
                if (!C2968U2.m15250b(this.f25280d.f25216a)) {
                    Map<String, String> map = this.f25280d.f25216a;
                    DeferredDeeplinkParametersListener deferredDeeplinkParametersListener = this.f25279c;
                    if (deferredDeeplinkParametersListener != null) {
                        deferredDeeplinkParametersListener.onParametersLoaded(map);
                        this.f25279c = null;
                        return;
                    }
                    return;
                }
                m17206a(a.PARSE_ERROR, this.f25280d.f25218c);
                return;
            }
            if (c3714x0.f25218c != null) {
                m17205a(a.PARSE_ERROR);
            } else {
                m17205a(a.NO_REFERRER);
            }
        }
    }

    /* renamed from: a */
    private void m17206a(a aVar, String str) {
        DeferredDeeplinkParametersListener.Error error;
        DeferredDeeplinkParametersListener deferredDeeplinkParametersListener = this.f25279c;
        if (deferredDeeplinkParametersListener != null) {
            int iOrdinal = aVar.ordinal();
            if (iOrdinal == 0) {
                error = DeferredDeeplinkParametersListener.Error.NOT_A_FIRST_LAUNCH;
            } else if (iOrdinal == 1) {
                error = DeferredDeeplinkParametersListener.Error.PARSE_ERROR;
            } else if (iOrdinal != 2) {
                error = DeferredDeeplinkParametersListener.Error.UNKNOWN;
            } else {
                error = DeferredDeeplinkParametersListener.Error.NO_REFERRER;
            }
            if (str == null) {
                str = "";
            }
            deferredDeeplinkParametersListener.onError(error, str);
            this.f25279c = null;
        }
    }
}
