package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* renamed from: io.appmetrica.analytics.impl.n5 */
/* loaded from: classes2.dex */
public final class C5314n5 implements InterfaceC5582xn {

    /* renamed from: a */
    public final List f32243a;

    public C5314n5(List<? extends Pair<String, ? extends InterfaceC5582xn>> list) {
        this.f32243a = list;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5582xn
    /* renamed from: a */
    public final String mo20031a() {
        Iterator it = this.f32243a.iterator();
        while (it.hasNext()) {
            String strMo20031a = ((InterfaceC5582xn) ((Pair) it.next()).f36703b).mo20031a();
            if (strMo20031a != null && strMo20031a.length() > 0) {
                return strMo20031a;
            }
        }
        return null;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5582xn
    /* renamed from: a */
    public final void mo20032a(String str) {
        Iterator it = this.f32243a.iterator();
        while (it.hasNext()) {
            ((InterfaceC5582xn) ((Pair) it.next()).f36703b).mo20032a(str);
        }
    }
}
