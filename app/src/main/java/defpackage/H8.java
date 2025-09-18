package defpackage;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.SingleType;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class H8 extends AbstractC0818Kg {
    public final /* synthetic */ int c;
    public final InterfaceC7454uf0 d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H8(C1668Vd1 c1668Vd1, InterfaceC7454uf0 interfaceC7454uf0, int i) {
        C7835wf0 c7835wf0;
        super(interfaceC7454uf0.e(), 1);
        this.c = i;
        switch (i) {
            case 1:
                O90.f(interfaceC7454uf0, "listType");
                super(interfaceC7454uf0.e(), 1);
                this.d = interfaceC7454uf0;
                C7835wf0 c7835wf02 = ((C0114Bf0) AbstractC8069xu.A(interfaceC7454uf0.h())).b;
                if (c7835wf02 == null) {
                    throw new IllegalArgumentException("The list type should contain the type of elements.");
                }
                this.e = c1668Vd1.b(c7835wf02);
                return;
            case 2:
                O90.f(interfaceC7454uf0, "mapType");
                super(interfaceC7454uf0.e(), 1);
                this.d = interfaceC7454uf0;
                C7835wf0 c7835wf03 = ((C0114Bf0) AbstractC8069xu.A(interfaceC7454uf0.h())).b;
                if (!O90.a(c7835wf03 != null ? c7835wf03.i() : null, BP0.a.b(String.class))) {
                    throw new IllegalArgumentException(("The map key type should be String, but received " + AbstractC8069xu.A(interfaceC7454uf0.h()) + ".").toString());
                }
                C0114Bf0 c0114Bf0 = (C0114Bf0) AbstractC8069xu.D(1, interfaceC7454uf0.h());
                c7835wf0 = c0114Bf0 != null ? c0114Bf0.b : null;
                if (c7835wf0 == null) {
                    throw new IllegalArgumentException("The map type should contain the key type.");
                }
                this.e = c1668Vd1.b(c7835wf0);
                return;
            case 3:
                O90.f(interfaceC7454uf0, "setType");
                super(interfaceC7454uf0.e(), 1);
                this.d = interfaceC7454uf0;
                C7835wf0 c7835wf04 = ((C0114Bf0) AbstractC8069xu.A(interfaceC7454uf0.h())).b;
                if (c7835wf04 == null) {
                    throw new IllegalArgumentException("The set type should contain the type of elements.");
                }
                this.e = c1668Vd1.b(c7835wf04);
                return;
            case 4:
                O90.f(interfaceC7454uf0, "pairType");
                super(interfaceC7454uf0.e(), 1);
                this.d = interfaceC7454uf0;
                C0114Bf0 c0114Bf02 = (C0114Bf0) AbstractC8069xu.D(0, interfaceC7454uf0.h());
                C7835wf0 c7835wf05 = c0114Bf02 != null ? c0114Bf02.b : null;
                if (c7835wf05 == null) {
                    throw new IllegalArgumentException("The pair type should contain the type of the first parameter.");
                }
                AbstractC1512Td1 abstractC1512Td1B = c1668Vd1.b(c7835wf05);
                C0114Bf0 c0114Bf03 = (C0114Bf0) AbstractC8069xu.D(1, interfaceC7454uf0.h());
                c7835wf0 = c0114Bf03 != null ? c0114Bf03.b : null;
                if (c7835wf0 == null) {
                    throw new IllegalArgumentException("The pair type should contain the type of the second parameter.");
                }
                this.e = AbstractC8259yu.f(abstractC1512Td1B, c1668Vd1.b(c7835wf0));
                return;
            default:
                O90.f(interfaceC7454uf0, "arrayType");
                this.d = interfaceC7454uf0;
                C7835wf0 c7835wf06 = ((C0114Bf0) AbstractC8069xu.A(interfaceC7454uf0.h())).b;
                if (c7835wf06 == null) {
                    throw new IllegalArgumentException("The array type should contain the type of the elements.");
                }
                this.e = c1668Vd1.b(c7835wf06);
                return;
        }
    }

    @Override // defpackage.AbstractC0818Kg, defpackage.AbstractC1512Td1
    public final ExpectedType b() {
        Object obj = this.e;
        switch (this.c) {
            case 0:
                ExpectedType expectedTypeB = ((AbstractC1512Td1) obj).b();
                O90.f(expectedTypeB, "parameterType");
                return new ExpectedType(new SingleType(EnumC2044Zz.o, new ExpectedType[]{expectedTypeB}));
            case 1:
                ExpectedType expectedTypeB2 = ((AbstractC1512Td1) obj).b();
                O90.f(expectedTypeB2, "parameterType");
                return new ExpectedType(new SingleType(EnumC2044Zz.p, new ExpectedType[]{expectedTypeB2}));
            case 2:
                ExpectedType expectedTypeB3 = ((AbstractC1512Td1) obj).b();
                O90.f(expectedTypeB3, "valueType");
                return new ExpectedType(new SingleType(EnumC2044Zz.q, new ExpectedType[]{expectedTypeB3}));
            case 3:
                ExpectedType expectedTypeB4 = ((AbstractC1512Td1) obj).b();
                O90.f(expectedTypeB4, "parameterType");
                return new ExpectedType(new SingleType(EnumC2044Zz.p, new ExpectedType[]{expectedTypeB4}));
            default:
                return new ExpectedType(new SingleType(EnumC2044Zz.k, null));
        }
    }

    @Override // defpackage.AbstractC0818Kg, defpackage.AbstractC1512Td1
    public final boolean c() {
        switch (this.c) {
        }
        return ((AbstractC1512Td1) this.e).c();
    }

    @Override // defpackage.AbstractC0818Kg
    public final Object e(Object obj) throws C5445k8 {
        Object next;
        C5445k8 c5445k8;
        switch (this.c) {
            case 0:
                O90.f(obj, "value");
                AbstractC1512Td1 abstractC1512Td1 = (AbstractC1512Td1) this.e;
                if (abstractC1512Td1.c()) {
                    return (Object[]) obj;
                }
                Object[] objArr = (Object[]) obj;
                ArrayList arrayList = new ArrayList(objArr.length);
                for (Object obj2 : objArr) {
                    try {
                        arrayList.add(abstractC1512Td1.a(obj2, null));
                    } catch (Throwable th) {
                        CodedException codedException = !(th instanceof CodedException) ? th instanceof AbstractC5398ju ? new CodedException(((AbstractC5398ju) th).a(), th.getMessage(), th.getCause()) : new UnexpectedException(th.toString(), th) : (CodedException) th;
                        InterfaceC7454uf0 interfaceC7454uf0 = this.d;
                        C7835wf0 c7835wf0 = ((C0114Bf0) AbstractC8069xu.A(interfaceC7454uf0.h())).b;
                        O90.c(c7835wf0);
                        O90.c(obj2);
                        throw new C5445k8(interfaceC7454uf0, c7835wf0, BP0.a.b(obj2.getClass()), codedException);
                    }
                }
                return arrayList.toArray(new Object[0]);
            case 1:
                O90.f(obj, "value");
                AbstractC1512Td1 abstractC1512Td12 = (AbstractC1512Td1) this.e;
                if (abstractC1512Td12.c()) {
                    return (List) obj;
                }
                List list = (List) obj;
                ArrayList arrayList2 = new ArrayList(AbstractC8449zu.k(list));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    next = it.next();
                    try {
                        arrayList2.add(abstractC1512Td12.a(next, null));
                    } finally {
                    }
                }
                return arrayList2;
            case 2:
                O90.f(obj, "value");
                AbstractC1512Td1 abstractC1512Td13 = (AbstractC1512Td1) this.e;
                if (abstractC1512Td13.c()) {
                    return (Map) obj;
                }
                Map map = (Map) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7287tn0.b(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    try {
                        linkedHashMap.put(key, abstractC1512Td13.a(value, null));
                    } catch (Throwable th2) {
                        CodedException codedException2 = !(th2 instanceof CodedException) ? th2 instanceof AbstractC5398ju ? new CodedException(((AbstractC5398ju) th2).a(), th2.getMessage(), th2.getCause()) : new UnexpectedException(th2.toString(), th2) : (CodedException) th2;
                        InterfaceC7454uf0 interfaceC7454uf02 = this.d;
                        C7835wf0 c7835wf02 = ((C0114Bf0) interfaceC7454uf02.h().get(1)).b;
                        O90.c(c7835wf02);
                        O90.c(value);
                        throw new C5445k8(interfaceC7454uf02, c7835wf02, BP0.a.b(value.getClass()), codedException2);
                    }
                }
                return linkedHashMap;
            case 3:
                O90.f(obj, "value");
                AbstractC1512Td1 abstractC1512Td14 = (AbstractC1512Td1) this.e;
                if (abstractC1512Td14.c()) {
                    return AbstractC8069xu.g0((List) obj);
                }
                List list2 = (List) obj;
                ArrayList arrayList3 = new ArrayList(AbstractC8449zu.k(list2));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    next = it2.next();
                    try {
                        arrayList3.add(abstractC1512Td14.a(next, null));
                    } finally {
                    }
                }
                return AbstractC8069xu.g0(arrayList3);
            default:
                O90.f(obj, "value");
                if (!(obj instanceof ReadableArray)) {
                    return (Pair) obj;
                }
                ReadableArray readableArray = (ReadableArray) obj;
                return new Pair(h(readableArray, 0), h(readableArray, 1));
        }
    }

    @Override // defpackage.AbstractC0818Kg
    public final Object f(Dynamic dynamic) throws NegativeArraySizeException {
        Dynamic dynamic2;
        switch (this.c) {
            case 0:
                O90.f(dynamic, "value");
                ReadableArray readableArrayAsArray = dynamic.asArray();
                int size = readableArrayAsArray.size();
                C7835wf0 c7835wf0 = ((C0114Bf0) AbstractC8069xu.A(this.d.h())).b;
                O90.c(c7835wf0);
                InterfaceC4384ie0 interfaceC4384ie0I = c7835wf0.i();
                O90.d(interfaceC4384ie0I, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
                Object objNewInstance = Array.newInstance((Class<?>) P22.b((InterfaceC1667Vd0) interfaceC4384ie0I), size);
                O90.d(objNewInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                Object[] objArr = (Object[]) objNewInstance;
                int size2 = readableArrayAsArray.size();
                for (int i = 0; i < size2; i++) {
                    dynamic2 = readableArrayAsArray.getDynamic(i);
                    try {
                        Object objA = ((AbstractC1512Td1) this.e).a(dynamic2, null);
                        dynamic2.recycle();
                        objArr[i] = objA;
                    } finally {
                    }
                }
                return objArr;
            case 1:
                O90.f(dynamic, "value");
                ReadableArray readableArrayAsArray2 = dynamic.asArray();
                int size3 = readableArrayAsArray2.size();
                ArrayList arrayList = new ArrayList(size3);
                for (int i2 = 0; i2 < size3; i2++) {
                    Dynamic dynamic3 = readableArrayAsArray2.getDynamic(i2);
                    try {
                        Object objA2 = ((AbstractC1512Td1) this.e).a(dynamic3, null);
                        dynamic3.recycle();
                        arrayList.add(objA2);
                    } finally {
                        try {
                            CodedException codedException = !(th instanceof CodedException) ? th instanceof AbstractC5398ju ? new CodedException(((AbstractC5398ju) th).a(), th.getMessage(), th.getCause()) : new UnexpectedException(th.toString(), th) : (CodedException) th;
                            InterfaceC7454uf0 interfaceC7454uf0 = this.d;
                            C7835wf0 c7835wf02 = ((C0114Bf0) AbstractC8069xu.A(interfaceC7454uf0.h())).b;
                            O90.c(c7835wf02);
                            throw new C5445k8(interfaceC7454uf0, c7835wf02, dynamic3.getType(), codedException);
                        } finally {
                        }
                    }
                }
                return arrayList;
            case 2:
                O90.f(dynamic, "value");
                ReadableMap readableMapAsMap = dynamic.asMap();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator<Map.Entry<String, Object>> entryIterator = readableMapAsMap.getEntryIterator();
                while (entryIterator.hasNext()) {
                    Map.Entry<String, Object> next = entryIterator.next();
                    String key = next.getKey();
                    DynamicFromObject dynamicFromObject = new DynamicFromObject(next.getValue());
                    try {
                        linkedHashMap.put(key, ((AbstractC1512Td1) this.e).a(dynamicFromObject, null));
                        dynamicFromObject.recycle();
                    } finally {
                    }
                }
                return linkedHashMap;
            case 3:
                O90.f(dynamic, "value");
                ReadableArray readableArrayAsArray3 = dynamic.asArray();
                int size4 = readableArrayAsArray3.size();
                ArrayList arrayList2 = new ArrayList(size4);
                for (int i3 = 0; i3 < size4; i3++) {
                    dynamic2 = readableArrayAsArray3.getDynamic(i3);
                    try {
                        Object objA3 = ((AbstractC1512Td1) this.e).a(dynamic2, null);
                        dynamic2.recycle();
                        arrayList2.add(objA3);
                    } finally {
                    }
                }
                return AbstractC8069xu.g0(arrayList2);
            default:
                O90.f(dynamic, "value");
                ReadableArray readableArrayAsArray4 = dynamic.asArray();
                return new Pair(h(readableArrayAsArray4, 0), h(readableArrayAsArray4, 1));
        }
    }

    public Object h(ReadableArray readableArray, int i) {
        Dynamic dynamic = readableArray.getDynamic(i);
        try {
            Object objA = ((AbstractC1512Td1) ((List) this.e).get(i)).a(dynamic, null);
            dynamic.recycle();
            return objA;
        } catch (Throwable th) {
            try {
                CodedException codedException = !(th instanceof CodedException) ? th instanceof AbstractC5398ju ? new CodedException(((AbstractC5398ju) th).a(), th.getMessage(), th.getCause()) : new UnexpectedException(th.toString(), th) : (CodedException) th;
                InterfaceC7454uf0 interfaceC7454uf0 = this.d;
                C7835wf0 c7835wf0 = ((C0114Bf0) interfaceC7454uf0.h().get(i)).b;
                O90.c(c7835wf0);
                throw new C5445k8(interfaceC7454uf0, c7835wf0, dynamic.getType(), codedException);
            } catch (Throwable th2) {
                dynamic.recycle();
                throw th2;
            }
        }
    }
}
