package defpackage;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class ZO0 extends XO0 implements InterfaceC1268Qa0 {
    public final Object[] b;

    public ZO0(C1559Tt0 c1559Tt0, Object[] objArr) {
        super(c1559Tt0);
        this.b = objArr;
    }

    public final ArrayList a() {
        Object[] objArr = this.b;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            O90.c(obj);
            Class<?> cls = obj.getClass();
            List list = VO0.a;
            arrayList.add(Enum.class.isAssignableFrom(cls) ? new C5688lP0(null, (Enum) obj) : obj instanceof Annotation ? new YO0(null, (Annotation) obj) : obj instanceof Object[] ? new ZO0(null, (Object[]) obj) : obj instanceof Class ? new C4148hP0(null, (Class) obj) : new C6070nP0(null, obj));
        }
        return arrayList;
    }
}
