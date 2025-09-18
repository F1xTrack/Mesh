package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.yandex.metrica.impl.ob.C2839j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.d3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2693d3 implements F2 {
    private final List<Tm<Context, Intent, Void>> a;
    private boolean b;
    private boolean c;
    private final Context d;
    private final C2839j0 e;

    /* renamed from: com.yandex.metrica.impl.ob.d3$a */
    public class a implements Sm<Context, Intent> {
        public a() {
        }

        @Override // com.yandex.metrica.impl.ob.Sm
        public void a(Context context, Intent intent) {
            C2693d3.a(C2693d3.this, context, intent);
        }
    }

    public C2693d3(Context context, InterfaceExecutorC3086sn interfaceExecutorC3086sn) {
        this(context, interfaceExecutorC3086sn, new C2839j0.a());
    }

    @Override // com.yandex.metrica.impl.ob.F2
    public synchronized void a() {
        this.c = true;
        if (!this.a.isEmpty()) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.SCAN_RESULTS");
            this.e.a(this.d, intentFilter);
            this.b = true;
        }
    }

    @Override // com.yandex.metrica.impl.ob.F2
    public synchronized void b() {
        this.c = false;
        if (this.b) {
            this.e.a(this.d);
            this.b = false;
        }
    }

    public C2693d3(Context context, InterfaceExecutorC3086sn interfaceExecutorC3086sn, C2839j0.a aVar) {
        this.a = new ArrayList();
        this.b = false;
        this.c = false;
        this.d = context;
        this.e = aVar.a(new C3011pm(new a(), interfaceExecutorC3086sn));
    }

    public synchronized void b(Tm<Context, Intent, Void> tm) {
        this.a.remove(tm);
        if (this.a.isEmpty() && this.b) {
            this.e.a(this.d);
            this.b = false;
        }
    }

    public synchronized void a(Tm<Context, Intent, Void> tm) {
        this.a.add(tm);
        if (this.c && !this.b) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.SCAN_RESULTS");
            this.e.a(this.d, intentFilter);
            this.b = true;
        }
    }

    public static void a(C2693d3 c2693d3, Context context, Intent intent) {
        synchronized (c2693d3) {
            Iterator<Tm<Context, Intent, Void>> it = c2693d3.a.iterator();
            while (it.hasNext()) {
                it.next().a(context, intent);
            }
        }
    }
}
