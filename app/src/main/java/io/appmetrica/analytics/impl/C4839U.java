package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.U */
/* loaded from: classes2.dex */
public final class C4839U implements ProtobufConverter {

    /* renamed from: a */
    public final C5481tm f30796a;

    public C4839U(C5481tm c5481tm) {
        this.f30796a = c5481tm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a */
    public final C4869V5 fromModel(C4815T c4815t) {
        C4869V5 c4869v5 = new C4869V5();
        C5456sm c5456sm = c4815t.f30752a;
        if (c5456sm != null) {
            c4869v5.f30845a = this.f30796a.fromModel(c5456sm);
        }
        c4869v5.f30846b = new C5090e6[c4815t.f30753b.size()];
        Iterator it = c4815t.f30753b.iterator();
        int i = 0;
        while (it.hasNext()) {
            c4869v5.f30846b[i] = this.f30796a.fromModel((C5456sm) it.next());
            i++;
        }
        String str = c4815t.f30754c;
        if (str != null) {
            c4869v5.f30847c = str;
        }
        return c4869v5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final C4815T m19880a(C4869V5 c4869v5) {
        throw new UnsupportedOperationException();
    }
}
