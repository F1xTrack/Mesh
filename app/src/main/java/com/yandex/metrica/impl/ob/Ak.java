package com.yandex.metrica.impl.ob;

import java.util.List;

/* loaded from: classes2.dex */
public final class Ak {
    private final List<C3133uk> a;
    private final Vj b;
    private final int c;

    public Ak(InterfaceC3263zk<Vj> interfaceC3263zk, InterfaceC3263zk<List<C3133uk>> interfaceC3263zk2, InterfaceC3263zk<Integer> interfaceC3263zk3) {
        this.b = (Vj) ((Xj) interfaceC3263zk).b();
        this.a = (List) ((C3163vk) interfaceC3263zk2).b();
        this.c = ((Integer) ((Sj) interfaceC3263zk3).a()).intValue();
    }

    public int a() {
        return this.c;
    }

    public Vj b() {
        return this.b;
    }

    public List<C3133uk> c() {
        return this.a;
    }
}
