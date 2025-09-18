package com.yandex.metrica.impl.p022ob;

import android.app.Activity;
import com.yandex.metrica.impl.p022ob.C3739y;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.x */
/* loaded from: classes2.dex */
public class C3713x implements C3739y.b {

    /* renamed from: a */
    private final Set<b> f25212a = new HashSet();

    /* renamed from: b */
    private final InterfaceExecutorC3607sn f25213b;

    /* renamed from: com.yandex.metrica.impl.ob.x$a */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Activity f25214a;

        public a(Activity activity) {
            this.f25214a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3713x.this.m17155a(this.f25214a);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.x$b */
    public interface b {
        /* renamed from: a */
        void mo17157a(Activity activity);
    }

    public C3713x(C3739y c3739y, InterfaceExecutorC3607sn interfaceExecutorC3607sn) {
        this.f25213b = interfaceExecutorC3607sn;
        c3739y.m17203a(this, new C3739y.a[0]);
    }

    /* renamed from: a */
    public synchronized void m17156a(b bVar) {
        this.f25212a.add(bVar);
    }

    /* renamed from: a */
    public void m17155a(Activity activity) {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f25212a);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((b) it.next()).mo17157a(activity);
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.C3739y.b
    /* renamed from: a */
    public void mo13943a(Activity activity, C3739y.a aVar) {
        ((C3581rn) this.f25213b).execute(new a(activity));
    }
}
