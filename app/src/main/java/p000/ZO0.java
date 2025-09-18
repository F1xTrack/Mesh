package p000;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class ZO0 extends XO0 implements InterfaceC8146Qa0 {

    /* renamed from: b */
    public final Object[] f14876b;

    public ZO0(C8340Tt0 c8340Tt0, Object[] objArr) {
        super(c8340Tt0);
        this.f14876b = objArr;
    }

    /* renamed from: a */
    public final ArrayList m9527a() {
        Object[] objArr = this.f14876b;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            O90.m5965c(obj);
            Class<?> cls = obj.getClass();
            List list = VO0.f12536a;
            arrayList.add(Enum.class.isAssignableFrom(cls) ? new C10133lP0(null, (Enum) obj) : obj instanceof Annotation ? new YO0(null, (Annotation) obj) : obj instanceof Object[] ? new ZO0(null, (Object[]) obj) : obj instanceof Class ? new C9621hP0(null, (Class) obj) : new C10389nP0(null, obj));
        }
        return arrayList;
    }
}
