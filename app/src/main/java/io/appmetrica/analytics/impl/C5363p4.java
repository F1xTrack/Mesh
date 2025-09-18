package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.p4 */
/* loaded from: classes2.dex */
public final class C5363p4 {

    /* renamed from: a */
    public final Object f32375a;

    /* renamed from: b */
    public final C5289m5 f32376b;

    /* renamed from: c */
    public final HashMap f32377c;

    /* renamed from: d */
    public final C5294ma f32378d;

    /* renamed from: e */
    public final Context f32379e;

    /* renamed from: f */
    public final C5538w4 f32380f;

    public C5363p4(Context context, C5289m5 c5289m5) {
        this(context, c5289m5, new C5538w4());
    }

    /* renamed from: a */
    public final InterfaceC5463t4 m20901a(C5088e4 c5088e4, C4436D4 c4436d4) {
        InterfaceC5463t4 interfaceC5463t4Mo19283a;
        synchronized (this.f32375a) {
            try {
                interfaceC5463t4Mo19283a = (InterfaceC5463t4) this.f32377c.get(c5088e4);
                if (interfaceC5463t4Mo19283a == null) {
                    this.f32380f.getClass();
                    interfaceC5463t4Mo19283a = C5538w4.m21169a(c5088e4).mo19283a(this.f32379e, this.f32376b, c5088e4, c4436d4);
                    this.f32377c.put(c5088e4, interfaceC5463t4Mo19283a);
                    this.f32378d.m20705a(new C5338o4(c5088e4.f31525b, c5088e4.f31526c, c5088e4.f31527d), c5088e4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC5463t4Mo19283a;
    }

    public C5363p4(Context context, C5289m5 c5289m5, C5538w4 c5538w4) {
        this.f32375a = new Object();
        this.f32377c = new HashMap();
        this.f32378d = new C5294ma();
        this.f32379e = context.getApplicationContext();
        this.f32376b = c5289m5;
        this.f32380f = c5538w4;
    }

    /* renamed from: a */
    public final void m20902a(int i, String str, String str2) {
        Integer numValueOf = Integer.valueOf(i);
        synchronized (this.f32375a) {
            try {
                C5294ma c5294ma = this.f32378d;
                Collection collection = (Collection) c5294ma.f32190a.remove(new C5338o4(str, numValueOf, str2));
                if (!AbstractC5182hn.m20513a(collection)) {
                    collection.size();
                    ArrayList arrayList = new ArrayList(collection.size());
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        arrayList.add((InterfaceC5463t4) this.f32377c.remove((C5088e4) it.next()));
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC5463t4) it2.next()).mo19486a();
                    }
                }
            } finally {
            }
        }
    }
}
