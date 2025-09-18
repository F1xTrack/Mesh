package defpackage;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class F8 extends AbstractC6876rd1 {
    public static final D8 d = new D8(0);
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;

    public F8(C2226aw c2226aw, AbstractC6876rd1 abstractC6876rd1, Class cls) {
        this.b = new C7640vd1(c2226aw, abstractC6876rd1, cls);
        this.c = cls;
    }

    @Override // defpackage.AbstractC6876rd1
    public final Object a(C8206yc0 c8206yc0) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        switch (this.a) {
            case 0:
                if (c8206yc0.p0() == 9) {
                    c8206yc0.i0();
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                c8206yc0.m();
                while (c8206yc0.J()) {
                    arrayList.add(((AbstractC6876rd1) ((C7640vd1) this.b).c).a(c8206yc0));
                }
                c8206yc0.w();
                int size = arrayList.size();
                Class cls = (Class) this.c;
                if (!cls.isPrimitive()) {
                    return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
                }
                Object objNewInstance = Array.newInstance((Class<?>) cls, size);
                for (int i = 0; i < size; i++) {
                    Array.set(objNewInstance, i, arrayList.get(i));
                }
                return objNewInstance;
            case 1:
                if (c8206yc0.p0() == 9) {
                    c8206yc0.i0();
                    return null;
                }
                Collection collection = (Collection) ((InterfaceC1490Sw0) this.c).c();
                c8206yc0.m();
                while (c8206yc0.J()) {
                    collection.add(((AbstractC6876rd1) ((C7640vd1) this.b).c).a(c8206yc0));
                }
                c8206yc0.w();
                return collection;
            default:
                Object objA = ((C8020xd1) this.b).c.a(c8206yc0);
                if (objA != null) {
                    Class cls2 = (Class) this.c;
                    if (!cls2.isInstance(objA)) {
                        throw new C6682qc0("Expected a " + cls2.getName() + " but was " + objA.getClass().getName() + "; at path " + c8206yc0.D(true));
                    }
                }
                return objA;
        }
    }

    @Override // defpackage.AbstractC6876rd1
    public final void b(C0807Kc0 c0807Kc0, Object obj) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        switch (this.a) {
            case 0:
                if (obj == null) {
                    c0807Kc0.J();
                    break;
                } else {
                    c0807Kc0.n();
                    int length = Array.getLength(obj);
                    for (int i = 0; i < length; i++) {
                        ((C7640vd1) this.b).b(c0807Kc0, Array.get(obj, i));
                    }
                    c0807Kc0.w();
                    break;
                }
            case 1:
                Collection collection = (Collection) obj;
                if (collection == null) {
                    c0807Kc0.J();
                    break;
                } else {
                    c0807Kc0.n();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        ((C7640vd1) this.b).b(c0807Kc0, it.next());
                    }
                    c0807Kc0.w();
                    break;
                }
            default:
                ((C8020xd1) this.b).c.b(c0807Kc0, obj);
                break;
        }
    }

    public F8(C2226aw c2226aw, Type type, AbstractC6876rd1 abstractC6876rd1, InterfaceC1490Sw0 interfaceC1490Sw0) {
        this.b = new C7640vd1(c2226aw, abstractC6876rd1, type);
        this.c = interfaceC1490Sw0;
    }

    public F8(C8020xd1 c8020xd1, Class cls) {
        this.b = c8020xd1;
        this.c = cls;
    }
}
