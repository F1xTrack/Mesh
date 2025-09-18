package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;
import android.app.Activity;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

@SuppressLint({"UseSparseArrays"})
/* loaded from: classes2.dex */
class Nk implements InterfaceC2687cm {
    private final W0 a;
    private final Al b;
    private final Om c;
    private Map<Long, Long> d;

    public Nk() {
        this(Oh.a(), new Al(), new Nm());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2687cm
    public void a(Activity activity, boolean z) {
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2637am
    public void a(Throwable th, C2662bm c2662bm) {
    }

    public Nk(W0 w0, Al al, Om om) {
        this.d = new HashMap();
        this.a = w0;
        this.b = al;
        this.c = om;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2637am
    public boolean a(Il il) {
        return false;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2687cm
    public synchronized void a(Activity activity, long j) {
        this.d.put(Long.valueOf(j), Long.valueOf(this.c.a()));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2637am
    public synchronized void a(long j, Activity activity, Gl gl, List<Wl> list, Il il, C2686cl c2686cl) {
        try {
            long jA = this.c.a();
            Long l = this.d.get(Long.valueOf(j));
            if (l != null) {
                this.d.remove(Long.valueOf(j));
                W0 w0 = this.a;
                Al al = this.b;
                long jLongValue = jA - l.longValue();
                al.getClass();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("time_millis", jLongValue);
                } catch (Throwable unused) {
                }
                w0.reportEvent("ui_parsing_time", jSONObject.toString());
            } else {
                this.a.reportError("ui_parsing_diagnostics", new IllegalStateException("Unexpected situation: no start time"));
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
