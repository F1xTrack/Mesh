package com.yandex.metrica.impl.ob;

import java.util.List;

/* loaded from: classes2.dex */
public class Fd extends AbstractC2690d0 {
    private final C2668c3 b;

    public Fd(AbstractC2690d0 abstractC2690d0, C2668c3 c2668c3) {
        super(null);
        this.b = c2668c3;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2690d0
    public void b(Object obj) {
        List list = (List) obj;
        if (list != null) {
            this.b.b((C2668c3) list);
        }
    }
}
