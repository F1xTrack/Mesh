package com.my.tracker.obfuscated;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import com.my.tracker.ads.AdEvent;
import com.my.tracker.miniapps.MiniAppEvent;
import com.my.tracker.obfuscated.f0;
import defpackage.C5588kt1;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class d1 {
    final AtomicBoolean a = new AtomicBoolean();
    final z2 b;
    final Application c;
    final f0 d;
    final C2612a e;
    final n f;
    final z g;
    final t1 h;
    final x1 i;
    o1 j;
    protected u1 k;

    public final class a implements f0.b {
        public a() {
        }

        @Override // com.my.tracker.obfuscated.f0.b
        public void a() {
            d1.this.e.e();
        }

        @Override // com.my.tracker.obfuscated.f0.b
        public void a(String str) {
            d1.this.f.b(str);
        }
    }

    public d1(z2 z2Var, Application application) {
        this.b = z2Var;
        this.c = application;
        y2.c("MyTracker created, version: 3.3.2");
        f0 f0VarA = f0.a(z2Var, new a(), application);
        this.d = f0VarA;
        x1 x1VarA = x1.a(f0VarA, z2Var.a(), application);
        this.i = x1VarA;
        this.e = C2612a.a(f0VarA, z2Var, x1VarA, application);
        this.f = n.a(z2Var, application);
        this.g = z.a(f0VarA);
        this.h = t1.a(f0VarA, application);
        this.k = u1.a();
    }

    public static d1 a(String str, z2 z2Var, Application application) {
        z2Var.b(str);
        return new d1(z2Var, application);
    }

    public boolean b() {
        boolean z = this.a.get();
        boolean z2 = !z;
        if (!z) {
            y2.b("MyTracker error: tracker hasn't been initialized");
        }
        return z2;
    }

    public void a() {
        if (b()) {
            return;
        }
        this.d.a();
    }

    public void b(int i, boolean z) {
        if (b()) {
            return;
        }
        m2.e().b(i, z);
    }

    public String a(Intent intent) {
        return this.g.a(intent);
    }

    public void b(Map map) {
        if (b()) {
            return;
        }
        this.d.d(map);
    }

    public void a(int i) {
        if (b()) {
            return;
        }
        m2.e().a(i);
    }

    public void b(String str, String str2, Map map) {
        if (b()) {
            return;
        }
        this.d.b(str, str2, map);
    }

    public void a(List list) {
        if (!this.a.compareAndSet(false, true)) {
            y2.a("MyTracker: tracker has already been initialized");
            return;
        }
        y2.c("MyTracker is initialized with id: " + this.b.g());
        c1.c(this.c);
        this.d.d();
        x0.a(this.b, this.d, this.i, this.c);
        q0.a(this.d, this.f, this.c);
        w0.a(this.d, this.f, this.c);
        m2.d().a(this.b, this.c);
        this.e.a();
        this.h.a();
        if (!list.isEmpty()) {
            o1 o1VarA = o1.a(this.d, this.c);
            this.j = o1VarA;
            o1VarA.a(list);
        }
        u1 u1Var = this.k;
        Application application = this.c;
        f0 f0Var = this.d;
        Objects.requireNonNull(f0Var);
        u1Var.a(application, new C5588kt1(f0Var, 0));
    }

    public void a(int i, Intent intent) {
        if (b()) {
            return;
        }
        if (this.b.s()) {
            this.h.b(i, intent);
        } else {
            y2.a("MyTracker: autotrackingPurchase is disabled, you should enable it before using onActivityResult(*) method");
        }
    }

    public void a(int i, List list) {
        if (b()) {
            return;
        }
        if (this.b.s()) {
            this.h.a(i, list);
        } else {
            y2.a("MyTracker: autotrackingPurchase is disabled, you should enable it before using onPurchasesUpdated(*) method");
        }
    }

    public void a(int i, boolean z) {
        if (b()) {
            return;
        }
        m2.e().a(i, z);
    }

    public void a(AdEvent adEvent) {
        if (b()) {
            return;
        }
        this.d.a(adEvent);
    }

    public void a(Object obj, String str, String str2, String str3, Map map) {
        if (b()) {
            return;
        }
        if (this.b.s()) {
            y2.a("MyTracker: autotrackingPurchase is enabled, you mustn't use trackAppGalleryPurchase(*) method");
        } else {
            this.h.a(obj, str, str2, str3, map);
        }
    }

    public void a(String str, Map map) {
        if (b()) {
            return;
        }
        this.d.a(str, map);
    }

    public void a(JSONObject jSONObject, JSONObject jSONObject2, String str, Map map) {
        if (b()) {
            return;
        }
        if (this.b.s()) {
            y2.a("MyTracker: autotrackingPurchase is enabled, you mustn't use trackPurchase(*) method");
        } else {
            this.h.a(jSONObject, jSONObject2, str, map);
        }
    }

    public void a(Map map) {
        if (b()) {
            return;
        }
        this.d.c(map);
    }

    public void a(Activity activity) {
        if (b()) {
            return;
        }
        this.e.d(activity);
    }

    public void a(int i, Map map) {
        if (b()) {
            return;
        }
        this.d.a(i, map);
    }

    public void a(String str, String str2, Map map) {
        if (b()) {
            return;
        }
        this.d.a(str, str2, map);
    }

    public void a(MiniAppEvent miniAppEvent) {
        if (b()) {
            return;
        }
        this.d.a(miniAppEvent);
    }
}
