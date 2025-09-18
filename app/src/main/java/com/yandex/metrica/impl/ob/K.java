package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.yandex.metrica.impl.ob.C2839j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class K implements F2 {
    private final List<Um<Intent>> a;
    private Intent b;
    private final Context c;
    private final C2839j0 d;

    public class a implements Sm<Context, Intent> {
        public a() {
        }

        @Override // com.yandex.metrica.impl.ob.Sm
        public void a(Context context, Intent intent) {
            Intent intent2 = intent;
            synchronized (K.this) {
                K.this.b = intent2;
                K.this.a(intent2);
            }
        }
    }

    public K(Context context, InterfaceExecutorC3086sn interfaceExecutorC3086sn) {
        this(context, interfaceExecutorC3086sn, new C2839j0.a());
    }

    public synchronized Intent c(Um<Intent> um) {
        this.a.add(um);
        return this.b;
    }

    public K(Context context, InterfaceExecutorC3086sn interfaceExecutorC3086sn, C2839j0.a aVar) {
        this.a = new ArrayList();
        this.b = null;
        this.c = context;
        this.d = aVar.a(new C3011pm(new a(), interfaceExecutorC3086sn));
    }

    @Override // com.yandex.metrica.impl.ob.F2
    public synchronized void a() {
        Intent intentA = this.d.a(this.c, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        this.b = intentA;
        a(intentA);
    }

    @Override // com.yandex.metrica.impl.ob.F2
    public synchronized void b() {
        this.b = null;
        this.d.a(this.c);
        a(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Intent intent) {
        Iterator<Um<Intent>> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().b(intent);
        }
    }
}
