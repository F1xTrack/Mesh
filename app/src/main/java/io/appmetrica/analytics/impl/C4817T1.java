package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.T1 */
/* loaded from: classes2.dex */
public final class C4817T1 implements InterfaceC5308n {

    /* renamed from: a */
    public final ArrayList f30758a = new ArrayList();

    /* renamed from: b */
    public volatile C5616z7 f30759b = null;

    /* renamed from: a */
    public final void m19826a(C5616z7 c5616z7) {
        ArrayList arrayListM19825a;
        synchronized (this) {
            this.f30759b = c5616z7;
            arrayListM19825a = m19825a();
        }
        Iterator it = arrayListM19825a.iterator();
        while (it.hasNext()) {
            ((InterfaceC5522vd) it.next()).consume(c5616z7);
        }
    }

    /* renamed from: b */
    public final void m19827b() {
        C5388q4.m20928h().f32422e.m20894a(this, EnumC5283m.CREATED);
    }

    /* renamed from: c */
    public final void m19828c() {
        C5388q4.m20928h().f32422e.m20896b(this, EnumC5283m.CREATED);
    }

    /* renamed from: a */
    public final synchronized ArrayList m19825a() {
        ArrayList arrayList;
        arrayList = new ArrayList(this.f30758a);
        this.f30758a.clear();
        return arrayList;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5308n
    /* renamed from: a */
    public final void mo6433a(Activity activity, EnumC5283m enumC5283m) {
        Intent intent = (Intent) SystemServiceUtils.accessSystemServiceSafely(activity, "getting intent", "activity", new C4769R1());
        String dataString = intent == null ? null : intent.getDataString();
        if (TextUtils.isEmpty(dataString)) {
            return;
        }
        C4793S1 c4793s1 = new C4793S1(dataString);
        synchronized (this) {
            try {
                C5616z7 c5616z7 = this.f30759b;
                if (c5616z7 == null) {
                    this.f30758a.add(c4793s1);
                } else {
                    ((C5543w9) C5388q4.m20928h().f32420c.m20407a()).f32761b.post(new RunnableC4746Q1(c4793s1, c5616z7));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
