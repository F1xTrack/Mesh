package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.E;
import com.yandex.metrica.impl.ob.M;
import defpackage.AbstractC7209tN0;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.id, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2828id {
    public final List<M.b.a> a;
    public final List<E.a> b;

    public C2828id(List<M.b.a> list, List<E.a> list2) {
        this.a = list;
        this.b = list2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Preconditions{possibleChargeTypes=");
        sb.append(this.a);
        sb.append(", appStatuses=");
        return AbstractC7209tN0.A(sb, this.b, '}');
    }
}
