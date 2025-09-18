package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.we, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4958we implements ProtobufConverter {
    public final Ie a;
    public final C4838re b;

    public C4958we() {
        this(new Ie(), new C4838re());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ee fromModel(C4910ue c4910ue) {
        Ee ee = new Ee();
        ee.a = this.a.fromModel(c4910ue.a);
        ee.b = new De[c4910ue.b.size()];
        Iterator<C4886te> it = c4910ue.b.iterator();
        int i = 0;
        while (it.hasNext()) {
            ee.b[i] = this.b.fromModel(it.next());
            i++;
        }
        return ee;
    }

    public C4958we(Ie ie, C4838re c4838re) {
        this.a = ie;
        this.b = c4838re;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4910ue toModel(Ee ee) {
        He model;
        ArrayList arrayList = new ArrayList(ee.b.length);
        for (De de : ee.b) {
            arrayList.add(this.b.toModel(de));
        }
        Ce ce = ee.a;
        if (ce == null) {
            model = this.a.toModel(new Ce());
        } else {
            model = this.a.toModel(ce);
        }
        return new C4910ue(model, arrayList);
    }
}
