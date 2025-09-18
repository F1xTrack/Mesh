package defpackage;

import java.lang.reflect.Field;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class WP0 extends UP0 {
    public final InterfaceC1490Sw0 b;

    public WP0(InterfaceC1490Sw0 interfaceC1490Sw0, LinkedHashMap linkedHashMap) {
        super(linkedHashMap);
        this.b = interfaceC1490Sw0;
    }

    @Override // defpackage.UP0
    public final Object c() {
        return this.b.c();
    }

    @Override // defpackage.UP0
    public final void e(Object obj, C8206yc0 c8206yc0, SP0 sp0) throws IllegalAccessException, IllegalArgumentException {
        Object objA = sp0.i.a(c8206yc0);
        if (objA == null && sp0.l) {
            return;
        }
        Field field = sp0.b;
        if (sp0.f) {
            C2131aQ0.b(obj, field);
        } else if (sp0.m) {
            throw new C6682qc0(AbstractC8235ym.v("Cannot set value of 'static final' ", OP0.d(field, false)));
        }
        field.set(obj, objA);
    }

    @Override // defpackage.UP0
    public final Object d(Object obj) {
        return obj;
    }
}
