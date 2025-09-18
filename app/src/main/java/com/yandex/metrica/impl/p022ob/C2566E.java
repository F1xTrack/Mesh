package com.yandex.metrica.impl.p022ob;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.yandex.metrica.impl.ob.E */
/* loaded from: classes2.dex */
public class C2566E implements InterfaceC2594F2 {

    /* renamed from: a */
    private final Set<Integer> f21056a = new HashSet();

    /* renamed from: b */
    private final Set<Integer> f21057b = new HashSet();

    /* renamed from: c */
    private volatile a f21058c = a.UNKNOWN;

    /* renamed from: d */
    private final Set<b> f21059d = new CopyOnWriteArraySet();

    /* renamed from: com.yandex.metrica.impl.ob.E$a */
    public enum a {
        UNKNOWN("unknown"),
        BACKGROUND("background"),
        VISIBLE("visible");

        a(String str) {
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.E$b */
    public interface b {
        /* renamed from: a */
        void mo14025a(a aVar);
    }

    /* renamed from: d */
    private void m14017d() {
        a aVar = a.UNKNOWN;
        if (!this.f21056a.isEmpty()) {
            aVar = a.VISIBLE;
        } else if (!this.f21057b.isEmpty()) {
            aVar = a.BACKGROUND;
        }
        if (this.f21058c != aVar) {
            this.f21058c = aVar;
            Iterator<b> it = this.f21059d.iterator();
            while (it.hasNext()) {
                it.next().mo14025a(this.f21058c);
            }
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2594F2
    /* renamed from: a */
    public void mo14019a() {
        m14017d();
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2594F2
    /* renamed from: b */
    public void mo14021b() {
        if (this.f21058c == a.VISIBLE) {
            this.f21058c = a.BACKGROUND;
        }
    }

    /* renamed from: c */
    public a m14023c() {
        return this.f21058c;
    }

    /* renamed from: a */
    public a m14018a(b bVar) {
        this.f21059d.add(bVar);
        return this.f21058c;
    }

    /* renamed from: c */
    public void m14024c(int i) {
        this.f21056a.add(Integer.valueOf(i));
        this.f21057b.remove(Integer.valueOf(i));
        m14017d();
    }

    /* renamed from: b */
    public void m14022b(int i) {
        this.f21057b.add(Integer.valueOf(i));
        this.f21056a.remove(Integer.valueOf(i));
        m14017d();
    }

    /* renamed from: a */
    public void m14020a(int i) {
        this.f21056a.remove(Integer.valueOf(i));
        m14017d();
    }
}
