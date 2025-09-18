package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.o1 */
/* loaded from: classes2.dex */
public class C3481o1 {

    /* renamed from: a */
    private final InterfaceC3022W6 f24333a;

    /* renamed from: b */
    private final C3197d3 f24334b;

    /* renamed from: c */
    private final C2716K f24335c;

    /* renamed from: d */
    private final C2566E f24336d;

    /* renamed from: e */
    private final List<InterfaceC2594F2> f24337e;

    public C3481o1(Context context, InterfaceExecutorC3607sn interfaceExecutorC3607sn) {
        this(C2968U2.m15243a(21) ? new C3047X6(context) : new C3072Y6(), new C3197d3(context, interfaceExecutorC3607sn), new C2716K(context, interfaceExecutorC3607sn), new C2566E());
    }

    /* renamed from: a */
    public synchronized void m16500a(InterfaceC2594F2 interfaceC2594F2) {
        this.f24337e.add(interfaceC2594F2);
    }

    /* renamed from: b */
    public C2716K m16501b() {
        return this.f24335c;
    }

    /* renamed from: c */
    public InterfaceC3022W6 m16502c() {
        return this.f24333a;
    }

    /* renamed from: d */
    public C3197d3 m16503d() {
        return this.f24334b;
    }

    /* renamed from: e */
    public synchronized void m16504e() {
        Iterator<InterfaceC2594F2> it = this.f24337e.iterator();
        while (it.hasNext()) {
            it.next().mo14019a();
        }
    }

    /* renamed from: f */
    public synchronized void m16505f() {
        Iterator<InterfaceC2594F2> it = this.f24337e.iterator();
        while (it.hasNext()) {
            it.next().mo14021b();
        }
    }

    /* renamed from: a */
    public C2566E m16499a() {
        return this.f24336d;
    }

    public C3481o1(InterfaceC3022W6 interfaceC3022W6, C3197d3 c3197d3, C2716K c2716k, C2566E c2566e) {
        ArrayList arrayList = new ArrayList();
        this.f24337e = arrayList;
        this.f24333a = interfaceC3022W6;
        arrayList.add(interfaceC3022W6);
        this.f24334b = c3197d3;
        arrayList.add(c3197d3);
        this.f24335c = c2716k;
        arrayList.add(c2716k);
        this.f24336d = c2566e;
        arrayList.add(c2566e);
    }
}
