package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C2566E;
import com.yandex.metrica.impl.p022ob.C2766M;
import java.util.List;
import p000.AbstractC11153tN0;

/* renamed from: com.yandex.metrica.impl.ob.id */
/* loaded from: classes2.dex */
public class C3337id {

    /* renamed from: a */
    public final List<C2766M.b.a> f23645a;

    /* renamed from: b */
    public final List<C2566E.a> f23646b;

    public C3337id(List<C2766M.b.a> list, List<C2566E.a> list2) {
        this.f23645a = list;
        this.f23646b = list2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Preconditions{possibleChargeTypes=");
        sb.append(this.f23645a);
        sb.append(", appStatuses=");
        return AbstractC11153tN0.m24883A(sb, this.f23646b, '}');
    }
}
