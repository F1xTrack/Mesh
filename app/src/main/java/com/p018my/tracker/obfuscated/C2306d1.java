package com.p018my.tracker.obfuscated;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import com.p018my.tracker.ads.AdEvent;
import com.p018my.tracker.miniapps.MiniAppEvent;
import com.p018my.tracker.obfuscated.C2313f0;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import p000.C10066kt1;

/* renamed from: com.my.tracker.obfuscated.d1 */
/* loaded from: classes2.dex */
public final class C2306d1 {

    /* renamed from: a */
    final AtomicBoolean f19873a = new AtomicBoolean();

    /* renamed from: b */
    final C2395z2 f19874b;

    /* renamed from: c */
    final Application f19875c;

    /* renamed from: d */
    final C2313f0 f19876d;

    /* renamed from: e */
    final C2289a f19877e;

    /* renamed from: f */
    final C2344n f19878f;

    /* renamed from: g */
    final C2392z f19879g;

    /* renamed from: h */
    final C2370t1 f19880h;

    /* renamed from: i */
    final C2386x1 f19881i;

    /* renamed from: j */
    C2350o1 f19882j;

    /* renamed from: k */
    protected C2374u1 f19883k;

    /* renamed from: com.my.tracker.obfuscated.d1$a */
    public final class a implements C2313f0.b {
        public a() {
        }

        @Override // com.p018my.tracker.obfuscated.C2313f0.b
        /* renamed from: a */
        public void mo12866a() {
            C2306d1.this.f19877e.m12772e();
        }

        @Override // com.p018my.tracker.obfuscated.C2313f0.b
        /* renamed from: a */
        public void mo12867a(String str) {
            C2306d1.this.f19878f.m13323b(str);
        }
    }

    public C2306d1(C2395z2 c2395z2, Application application) {
        this.f19874b = c2395z2;
        this.f19875c = application;
        AbstractC2391y2.m13574c("MyTracker created, version: 3.3.2");
        C2313f0 c2313f0M12980a = C2313f0.m12980a(c2395z2, new a(), application);
        this.f19876d = c2313f0M12980a;
        C2386x1 c2386x1M13535a = C2386x1.m13535a(c2313f0M12980a, c2395z2.m13584a(), application);
        this.f19881i = c2386x1M13535a;
        this.f19877e = C2289a.m12758a(c2313f0M12980a, c2395z2, c2386x1M13535a, application);
        this.f19878f = C2344n.m13317a(c2395z2, application);
        this.f19879g = C2392z.m13575a(c2313f0M12980a);
        this.f19880h = C2370t1.m13503a(c2313f0M12980a, application);
        this.f19883k = C2374u1.m13514a();
    }

    /* renamed from: a */
    public static C2306d1 m12845a(String str, C2395z2 c2395z2, Application application) {
        c2395z2.m13594b(str);
        return new C2306d1(c2395z2, application);
    }

    /* renamed from: b */
    public boolean m12865b() {
        boolean z = this.f19873a.get();
        boolean z2 = !z;
        if (!z) {
            AbstractC2391y2.m13572b("MyTracker error: tracker hasn't been initialized");
        }
        return z2;
    }

    /* renamed from: a */
    public void m12847a() {
        if (m12865b()) {
            return;
        }
        this.f19876d.m13052a();
    }

    /* renamed from: b */
    public void m12862b(int i, boolean z) {
        if (m12865b()) {
            return;
        }
        C2343m2.m13309e().mo13315b(i, z);
    }

    /* renamed from: a */
    public String m12846a(Intent intent) {
        return this.f19879g.m13576a(intent);
    }

    /* renamed from: b */
    public void m12864b(Map map) {
        if (m12865b()) {
            return;
        }
        this.f19876d.m13088d(map);
    }

    /* renamed from: a */
    public void m12848a(int i) {
        if (m12865b()) {
            return;
        }
        C2343m2.m13309e().mo13311a(i);
    }

    /* renamed from: b */
    public void m12863b(String str, String str2, Map map) {
        if (m12865b()) {
            return;
        }
        this.f19876d.m13080b(str, str2, map);
    }

    /* renamed from: a */
    public void m12859a(List list) {
        if (!this.f19873a.compareAndSet(false, true)) {
            AbstractC2391y2.m13568a("MyTracker: tracker has already been initialized");
            return;
        }
        AbstractC2391y2.m13574c("MyTracker is initialized with id: " + this.f19874b.m13607g());
        AbstractC2301c1.m12808c(this.f19875c);
        this.f19876d.m13085d();
        AbstractC2385x0.m13533a(this.f19874b, this.f19876d, this.f19881i, this.f19875c);
        C2357q0.m13393a(this.f19876d, this.f19878f, this.f19875c);
        C2381w0.m13523a(this.f19876d, this.f19878f, this.f19875c);
        C2343m2.m13308d().mo13313a(this.f19874b, this.f19875c);
        this.f19877e.m12767a();
        this.f19880h.m13504a();
        if (!list.isEmpty()) {
            C2350o1 c2350o1M13366a = C2350o1.m13366a(this.f19876d, this.f19875c);
            this.f19882j = c2350o1M13366a;
            c2350o1M13366a.m13369a(list);
        }
        C2374u1 c2374u1 = this.f19883k;
        Application application = this.f19875c;
        C2313f0 c2313f0 = this.f19876d;
        Objects.requireNonNull(c2313f0);
        c2374u1.m13515a(application, new C10066kt1(c2313f0, 0));
    }

    /* renamed from: a */
    public void m12849a(int i, Intent intent) {
        if (m12865b()) {
            return;
        }
        if (this.f19874b.m13619s()) {
            this.f19880h.m13509b(i, intent);
        } else {
            AbstractC2391y2.m13568a("MyTracker: autotrackingPurchase is disabled, you should enable it before using onActivityResult(*) method");
        }
    }

    /* renamed from: a */
    public void m12850a(int i, List list) {
        if (m12865b()) {
            return;
        }
        if (this.f19874b.m13619s()) {
            this.f19880h.m13506a(i, list);
        } else {
            AbstractC2391y2.m13568a("MyTracker: autotrackingPurchase is disabled, you should enable it before using onPurchasesUpdated(*) method");
        }
    }

    /* renamed from: a */
    public void m12852a(int i, boolean z) {
        if (m12865b()) {
            return;
        }
        C2343m2.m13309e().mo13312a(i, z);
    }

    /* renamed from: a */
    public void m12854a(AdEvent adEvent) {
        if (m12865b()) {
            return;
        }
        this.f19876d.m13058a(adEvent);
    }

    /* renamed from: a */
    public void m12856a(Object obj, String str, String str2, String str3, Map map) {
        if (m12865b()) {
            return;
        }
        if (this.f19874b.m13619s()) {
            AbstractC2391y2.m13568a("MyTracker: autotrackingPurchase is enabled, you mustn't use trackAppGalleryPurchase(*) method");
        } else {
            this.f19880h.m13507a(obj, str, str2, str3, map);
        }
    }

    /* renamed from: a */
    public void m12858a(String str, Map map) {
        if (m12865b()) {
            return;
        }
        this.f19876d.m13067a(str, map);
    }

    /* renamed from: a */
    public void m12861a(JSONObject jSONObject, JSONObject jSONObject2, String str, Map map) {
        if (m12865b()) {
            return;
        }
        if (this.f19874b.m13619s()) {
            AbstractC2391y2.m13568a("MyTracker: autotrackingPurchase is enabled, you mustn't use trackPurchase(*) method");
        } else {
            this.f19880h.m13508a(jSONObject, jSONObject2, str, map);
        }
    }

    /* renamed from: a */
    public void m12860a(Map map) {
        if (m12865b()) {
            return;
        }
        this.f19876d.m13084c(map);
    }

    /* renamed from: a */
    public void m12853a(Activity activity) {
        if (m12865b()) {
            return;
        }
        this.f19877e.m12771d(activity);
    }

    /* renamed from: a */
    public void m12851a(int i, Map map) {
        if (m12865b()) {
            return;
        }
        this.f19876d.m13055a(i, map);
    }

    /* renamed from: a */
    public void m12857a(String str, String str2, Map map) {
        if (m12865b()) {
            return;
        }
        this.f19876d.m13066a(str, str2, map);
    }

    /* renamed from: a */
    public void m12855a(MiniAppEvent miniAppEvent) {
        if (m12865b()) {
            return;
        }
        this.f19876d.m13059a(miniAppEvent);
    }
}
