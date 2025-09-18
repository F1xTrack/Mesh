package p000;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: F8 */
/* loaded from: classes2.dex */
public final class C0324F8 extends AbstractC10930rd1 {

    /* renamed from: d */
    public static final C0198D8 f3075d = new C0198D8(0);

    /* renamed from: a */
    public final /* synthetic */ int f3076a = 1;

    /* renamed from: b */
    public final Object f3077b;

    /* renamed from: c */
    public final Object f3078c;

    public C0324F8(C1753aw c1753aw, AbstractC10930rd1 abstractC10930rd1, Class cls) {
        this.f3077b = new C11442vd1(c1753aw, abstractC10930rd1, cls);
        this.f3078c = cls;
    }

    @Override // p000.AbstractC10930rd1
    /* renamed from: a */
    public final Object mo480a(C11820yc0 c11820yc0) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        switch (this.f3076a) {
            case 0:
                if (c11820yc0.m26194p0() == 9) {
                    c11820yc0.m26186i0();
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                c11820yc0.m26187m();
                while (c11820yc0.m26177J()) {
                    arrayList.add(((AbstractC10930rd1) ((C11442vd1) this.f3077b).f44459c).mo480a(c11820yc0));
                }
                c11820yc0.m26201w();
                int size = arrayList.size();
                Class cls = (Class) this.f3078c;
                if (!cls.isPrimitive()) {
                    return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
                }
                Object objNewInstance = Array.newInstance((Class<?>) cls, size);
                for (int i = 0; i < size; i++) {
                    Array.set(objNewInstance, i, arrayList.get(i));
                }
                return objNewInstance;
            case 1:
                if (c11820yc0.m26194p0() == 9) {
                    c11820yc0.m26186i0();
                    return null;
                }
                Collection collection = (Collection) ((InterfaceC8294Sw0) this.f3078c).mo386c();
                c11820yc0.m26187m();
                while (c11820yc0.m26177J()) {
                    collection.add(((AbstractC10930rd1) ((C11442vd1) this.f3077b).f44459c).mo480a(c11820yc0));
                }
                c11820yc0.m26201w();
                return collection;
            default:
                Object objMo480a = ((C11696xd1) this.f3077b).f45721c.mo480a(c11820yc0);
                if (objMo480a != null) {
                    Class cls2 = (Class) this.f3078c;
                    if (!cls2.isInstance(objMo480a)) {
                        throw new C10799qc0("Expected a " + cls2.getName() + " but was " + objMo480a.getClass().getName() + "; at path " + c11820yc0.m26176D(true));
                    }
                }
                return objMo480a;
        }
    }

    @Override // p000.AbstractC10930rd1
    /* renamed from: b */
    public final void mo481b(C7838Kc0 c7838Kc0, Object obj) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        switch (this.f3076a) {
            case 0:
                if (obj == null) {
                    c7838Kc0.m4680J();
                    break;
                } else {
                    c7838Kc0.m4690n();
                    int length = Array.getLength(obj);
                    for (int i = 0; i < length; i++) {
                        ((C11442vd1) this.f3077b).mo481b(c7838Kc0, Array.get(obj, i));
                    }
                    c7838Kc0.m4693w();
                    break;
                }
            case 1:
                Collection collection = (Collection) obj;
                if (collection == null) {
                    c7838Kc0.m4680J();
                    break;
                } else {
                    c7838Kc0.m4690n();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        ((C11442vd1) this.f3077b).mo481b(c7838Kc0, it.next());
                    }
                    c7838Kc0.m4693w();
                    break;
                }
            default:
                ((C11696xd1) this.f3077b).f45721c.mo481b(c7838Kc0, obj);
                break;
        }
    }

    public C0324F8(C1753aw c1753aw, Type type, AbstractC10930rd1 abstractC10930rd1, InterfaceC8294Sw0 interfaceC8294Sw0) {
        this.f3077b = new C11442vd1(c1753aw, abstractC10930rd1, type);
        this.f3078c = interfaceC8294Sw0;
    }

    public C0324F8(C11696xd1 c11696xd1, Class cls) {
        this.f3077b = c11696xd1;
        this.f3078c = cls;
    }
}
