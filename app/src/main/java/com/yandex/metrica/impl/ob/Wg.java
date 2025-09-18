package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Ug;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public class Wg implements Ug.a {
    private final Set<Eg> a;
    private boolean b;
    private Fg c;

    public Wg() {
        this(P0.i().o());
    }

    @Override // com.yandex.metrica.impl.ob.Ug.a
    public synchronized void a(Fg fg) {
        try {
            this.c = fg;
            this.b = true;
            Iterator<Eg> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().a(this.c);
            }
            this.a.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public Wg(Ug ug) {
        this.a = new HashSet();
        ug.a(new C2632ah(this));
        ug.b();
    }

    public synchronized void a(Eg eg) {
        this.a.add(eg);
        if (this.b) {
            eg.a(this.c);
            this.a.remove(eg);
        }
    }
}
