package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ValidationException;

/* renamed from: io.appmetrica.analytics.impl.Am */
/* loaded from: classes2.dex */
public class C4379Am implements InterfaceC5357on {

    /* renamed from: a */
    public final InterfaceC5357on f29877a;

    public C4379Am(InterfaceC5357on interfaceC5357on) {
        this.f29877a = interfaceC5357on;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5357on
    /* renamed from: a */
    public final C5307mn mo19211a(Object obj) {
        C5307mn c5307mnMo19211a = this.f29877a.mo19211a(obj);
        if (c5307mnMo19211a.f32232a) {
            return c5307mnMo19211a;
        }
        throw new ValidationException(c5307mnMo19211a.f32233b);
    }

    /* renamed from: a */
    public final InterfaceC5357on m19212a() {
        return this.f29877a;
    }
}
