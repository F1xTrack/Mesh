package com.yandex.metrica.impl.ob;

import android.app.Activity;
import com.yandex.metrica.impl.ob.C3217y;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3192x implements C3217y.b {
    private final Set<b> a = new HashSet();
    private final InterfaceExecutorC3086sn b;

    /* renamed from: com.yandex.metrica.impl.ob.x$a */
    public class a implements Runnable {
        final /* synthetic */ Activity a;

        public a(Activity activity) {
            this.a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3192x.this.a(this.a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.x$b */
    public interface b {
        void a(Activity activity);
    }

    public C3192x(C3217y c3217y, InterfaceExecutorC3086sn interfaceExecutorC3086sn) {
        this.b = interfaceExecutorC3086sn;
        c3217y.a(this, new C3217y.a[0]);
    }

    public synchronized void a(b bVar) {
        this.a.add(bVar);
    }

    public void a(Activity activity) {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.a);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(activity);
        }
    }

    @Override // com.yandex.metrica.impl.ob.C3217y.b
    public void a(Activity activity, C3217y.a aVar) {
        ((C3061rn) this.b).execute(new a(activity));
    }
}
