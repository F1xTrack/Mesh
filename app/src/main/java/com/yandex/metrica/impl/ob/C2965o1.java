package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.o1 */
/* loaded from: classes2.dex */
public class C2965o1 {
    private final W6 a;
    private final C2693d3 b;
    private final K c;
    private final E d;
    private final List<F2> e;

    public C2965o1(Context context, InterfaceExecutorC3086sn interfaceExecutorC3086sn) {
        this(U2.a(21) ? new X6(context) : new Y6(), new C2693d3(context, interfaceExecutorC3086sn), new K(context, interfaceExecutorC3086sn), new E());
    }

    public synchronized void a(F2 f2) {
        this.e.add(f2);
    }

    public K b() {
        return this.c;
    }

    public W6 c() {
        return this.a;
    }

    public C2693d3 d() {
        return this.b;
    }

    public synchronized void e() {
        Iterator<F2> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public synchronized void f() {
        Iterator<F2> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public E a() {
        return this.d;
    }

    public C2965o1(W6 w6, C2693d3 c2693d3, K k, E e) {
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.a = w6;
        arrayList.add(w6);
        this.b = c2693d3;
        arrayList.add(c2693d3);
        this.c = k;
        arrayList.add(k);
        this.d = e;
        arrayList.add(e);
    }
}
