package p000;

import java.lang.reflect.Field;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class WP0 extends UP0 {

    /* renamed from: b */
    public final InterfaceC8294Sw0 f13174b;

    public WP0(InterfaceC8294Sw0 interfaceC8294Sw0, LinkedHashMap linkedHashMap) {
        super(linkedHashMap);
        this.f13174b = interfaceC8294Sw0;
    }

    @Override // p000.UP0
    /* renamed from: c */
    public final Object mo8009c() {
        return this.f13174b.mo386c();
    }

    @Override // p000.UP0
    /* renamed from: e */
    public final void mo8011e(Object obj, C11820yc0 c11820yc0, SP0 sp0) throws IllegalAccessException, IllegalArgumentException {
        Object objMo480a = sp0.f10752i.mo480a(c11820yc0);
        if (objMo480a == null && sp0.f10755l) {
            return;
        }
        Field field = sp0.f10745b;
        if (sp0.f10749f) {
            C8722aQ0.m9729b(obj, field);
        } else if (sp0.f10756m) {
            throw new C10799qc0(AbstractC7222ym.m26245v("Cannot set value of 'static final' ", OP0.m6065d(field, false)));
        }
        field.set(obj, objMo480a);
    }

    @Override // p000.UP0
    /* renamed from: d */
    public final Object mo8010d(Object obj) {
        return obj;
    }
}
