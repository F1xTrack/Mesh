package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.we */
/* loaded from: classes2.dex */
public final class C5548we implements ProtobufConverter {

    /* renamed from: a */
    public final C4567Ie f32772a;

    /* renamed from: b */
    public final C5423re f32773b;

    public C5548we() {
        this(new C4567Ie(), new C5423re());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4471Ee fromModel(C5498ue c5498ue) {
        C4471Ee c4471Ee = new C4471Ee();
        c4471Ee.f30074a = this.f32772a.fromModel(c5498ue.f32689a);
        c4471Ee.f30075b = new C4446De[c5498ue.f32690b.size()];
        Iterator<C5473te> it = c5498ue.f32690b.iterator();
        int i = 0;
        while (it.hasNext()) {
            c4471Ee.f30075b[i] = this.f32773b.fromModel(it.next());
            i++;
        }
        return c4471Ee;
    }

    public C5548we(C4567Ie c4567Ie, C5423re c5423re) {
        this.f32772a = c4567Ie;
        this.f32773b = c5423re;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5498ue toModel(C4471Ee c4471Ee) {
        C4543He model;
        ArrayList arrayList = new ArrayList(c4471Ee.f30075b.length);
        for (C4446De c4446De : c4471Ee.f30075b) {
            arrayList.add(this.f32773b.toModel(c4446De));
        }
        C4421Ce c4421Ce = c4471Ee.f30074a;
        if (c4421Ce == null) {
            model = this.f32772a.toModel(new C4421Ce());
        } else {
            model = this.f32772a.toModel(c4421Ce);
        }
        return new C5498ue(model, arrayList);
    }
}
