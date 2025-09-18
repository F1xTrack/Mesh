package com.yandex.metrica.impl.ob;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.yandex.metrica.impl.ob.d4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2694d4 {
    private final List<E4> a = new CopyOnWriteArrayList();

    public void a(E4 e4) {
        this.a.add(e4);
    }

    public void b(E4 e4) {
        this.a.remove(e4);
    }

    public List<E4> a() {
        return this.a;
    }
}
