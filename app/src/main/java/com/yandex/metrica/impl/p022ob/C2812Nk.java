package com.yandex.metrica.impl.p022ob;

import android.annotation.SuppressLint;
import android.app.Activity;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

@SuppressLint({"UseSparseArrays"})
/* renamed from: com.yandex.metrica.impl.ob.Nk */
/* loaded from: classes2.dex */
class C2812Nk implements InterfaceC3190cm {

    /* renamed from: a */
    private final InterfaceC3016W0 f21827a;

    /* renamed from: b */
    private final C2488Al f21828b;

    /* renamed from: c */
    private final InterfaceC2839Om f21829c;

    /* renamed from: d */
    private Map<Long, Long> f21830d;

    public C2812Nk() {
        this(C2834Oh.m14711a(), new C2488Al(), new C2814Nm());
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3190cm
    /* renamed from: a */
    public void mo14672a(Activity activity, boolean z) {
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3138am
    /* renamed from: a */
    public void mo14269a(Throwable th, C3164bm c3164bm) {
    }

    public C2812Nk(InterfaceC3016W0 interfaceC3016W0, C2488Al c2488Al, InterfaceC2839Om interfaceC2839Om) {
        this.f21830d = new HashMap();
        this.f21827a = interfaceC3016W0;
        this.f21828b = c2488Al;
        this.f21829c = interfaceC2839Om;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3138am
    /* renamed from: a */
    public boolean mo14270a(C2688Il c2688Il) {
        return false;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3190cm
    /* renamed from: a */
    public synchronized void mo14671a(Activity activity, long j) {
        this.f21830d.put(Long.valueOf(j), Long.valueOf(this.f21829c.mo14674a()));
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3138am
    /* renamed from: a */
    public synchronized void mo14268a(long j, Activity activity, C2638Gl c2638Gl, List<C3037Wl> list, C2688Il c2688Il, C3189cl c3189cl) {
        try {
            long jMo14674a = this.f21829c.mo14674a();
            Long l = this.f21830d.get(Long.valueOf(j));
            if (l != null) {
                this.f21830d.remove(Long.valueOf(j));
                InterfaceC3016W0 interfaceC3016W0 = this.f21827a;
                C2488Al c2488Al = this.f21828b;
                long jLongValue = jMo14674a - l.longValue();
                c2488Al.getClass();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("time_millis", jLongValue);
                } catch (Throwable unused) {
                }
                interfaceC3016W0.reportEvent("ui_parsing_time", jSONObject.toString());
            } else {
                this.f21827a.reportError("ui_parsing_diagnostics", new IllegalStateException("Unexpected situation: no start time"));
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
