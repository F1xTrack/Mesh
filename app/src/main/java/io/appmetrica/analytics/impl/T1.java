package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class T1 implements InterfaceC4728n {
    public final ArrayList a = new ArrayList();
    public volatile C5023z7 b = null;

    public final void a(C5023z7 c5023z7) {
        ArrayList arrayListA;
        synchronized (this) {
            this.b = c5023z7;
            arrayListA = a();
        }
        Iterator it = arrayListA.iterator();
        while (it.hasNext()) {
            ((InterfaceC4933vd) it.next()).consume(c5023z7);
        }
    }

    public final void b() {
        C4805q4.h().e.a(this, EnumC4704m.CREATED);
    }

    public final void c() {
        C4805q4.h().e.b(this, EnumC4704m.CREATED);
    }

    public final synchronized ArrayList a() {
        ArrayList arrayList;
        arrayList = new ArrayList(this.a);
        this.a.clear();
        return arrayList;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4728n
    public final void a(Activity activity, EnumC4704m enumC4704m) {
        Intent intent = (Intent) SystemServiceUtils.accessSystemServiceSafely(activity, "getting intent", "activity", new R1());
        String dataString = intent == null ? null : intent.getDataString();
        if (TextUtils.isEmpty(dataString)) {
            return;
        }
        S1 s1 = new S1(dataString);
        synchronized (this) {
            try {
                C5023z7 c5023z7 = this.b;
                if (c5023z7 == null) {
                    this.a.add(s1);
                } else {
                    ((C4953w9) C4805q4.h().c.a()).b.post(new Q1(s1, c5023z7));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
