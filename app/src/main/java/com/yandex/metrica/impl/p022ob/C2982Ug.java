package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p000.O90;

/* renamed from: com.yandex.metrica.impl.ob.Ug */
/* loaded from: classes2.dex */
public class C2982Ug {

    /* renamed from: a */
    private final Set<C3007Vg> f22480a;

    /* renamed from: b */
    private C2608Fg f22481b;

    /* renamed from: c */
    private boolean f22482c;

    /* renamed from: d */
    private final C2650H8 f22483d;

    /* renamed from: e */
    private final Context f22484e;

    /* renamed from: com.yandex.metrica.impl.ob.Ug$a */
    public interface a {
        /* renamed from: a */
        void mo15281a(C2608Fg c2608Fg);
    }

    public C2982Ug(Context context) {
        this(context, C2842P0.m14728i().m14754y().m14471a());
    }

    /* renamed from: a */
    public synchronized void m15278a(C2608Fg c2608Fg) {
        this.f22481b = c2608Fg;
        this.f22482c = true;
        this.f22483d.m14235a(c2608Fg);
        this.f22483d.m14238a(true);
        C2608Fg c2608Fg2 = this.f22481b;
        synchronized (this) {
            Iterator<C3007Vg> it = this.f22480a.iterator();
            while (it.hasNext()) {
                it.next().m15326a(c2608Fg2);
            }
        }
    }

    /* renamed from: b */
    public void m15280b() {
        if (this.f22482c) {
            return;
        }
        Context context = this.f22484e;
        C2842P0 c2842p0M14728i = C2842P0.m14728i();
        O90.m5967e(c2842p0M14728i, "GlobalServiceLocator.getInstance()");
        C3789zn c3789znM14748s = c2842p0M14728i.m14748s();
        O90.m5967e(c3789znM14748s, "GlobalServiceLocator.get…).serviceExecutorProvider");
        new C2833Og(this, new C3082Yg(context, c3789znM14748s.m17349b()), new C2683Ig(context), new C3107Zg(context, null, 0 == true ? 1 : 0, 6)).m14709b();
    }

    public C2982Ug(Context context, C2650H8 c2650h8) {
        this.f22480a = new HashSet();
        this.f22484e = context;
        this.f22483d = c2650h8;
        this.f22481b = c2650h8.m14244g();
        this.f22482c = c2650h8.m14245h();
    }

    /* renamed from: a */
    public C2608Fg m15277a() {
        return this.f22481b;
    }

    /* renamed from: a */
    public synchronized void m15279a(C3007Vg c3007Vg) {
        this.f22480a.add(c3007Vg);
        if (this.f22482c) {
            c3007Vg.m15326a(this.f22481b);
        }
    }
}
