package p000;

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

/* renamed from: H8 */
/* loaded from: classes2.dex */
public final class C0450H8 extends AbstractC0673Kg {

    /* renamed from: c */
    public final /* synthetic */ int f4137c;

    /* renamed from: d */
    public final InterfaceC11317uf0 f4138d;

    /* renamed from: e */
    public final Object f4139e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0450H8(C8413Vd1 c8413Vd1, InterfaceC11317uf0 interfaceC11317uf0, int i) {
        C11572wf0 c11572wf0;
        super(interfaceC11317uf0.mo8537e(), 1);
        this.f4137c = i;
        switch (i) {
            case 1:
                O90.m5968f(interfaceC11317uf0, "listType");
                super(interfaceC11317uf0.mo8537e(), 1);
                this.f4138d = interfaceC11317uf0;
                C11572wf0 c11572wf02 = ((C7376Bf0) AbstractC7167xu.m25955A(interfaceC11317uf0.mo8538h())).f969b;
                if (c11572wf02 == null) {
                    throw new IllegalArgumentException("The list type should contain the type of elements.");
                }
                this.f4139e = c8413Vd1.m8524b(c11572wf02);
                return;
            case 2:
                O90.m5968f(interfaceC11317uf0, "mapType");
                super(interfaceC11317uf0.mo8537e(), 1);
                this.f4138d = interfaceC11317uf0;
                C11572wf0 c11572wf03 = ((C7376Bf0) AbstractC7167xu.m25955A(interfaceC11317uf0.mo8538h())).f969b;
                if (!O90.m5963a(c11572wf03 != null ? c11572wf03.mo8539i() : null, BP0.f799a.mo3846b(String.class))) {
                    throw new IllegalArgumentException(("The map key type should be String, but received " + AbstractC7167xu.m25955A(interfaceC11317uf0.mo8538h()) + ".").toString());
                }
                C7376Bf0 c7376Bf0 = (C7376Bf0) AbstractC7167xu.m25958D(1, interfaceC11317uf0.mo8538h());
                c11572wf0 = c7376Bf0 != null ? c7376Bf0.f969b : null;
                if (c11572wf0 == null) {
                    throw new IllegalArgumentException("The map type should contain the key type.");
                }
                this.f4139e = c8413Vd1.m8524b(c11572wf0);
                return;
            case 3:
                O90.m5968f(interfaceC11317uf0, "setType");
                super(interfaceC11317uf0.mo8537e(), 1);
                this.f4138d = interfaceC11317uf0;
                C11572wf0 c11572wf04 = ((C7376Bf0) AbstractC7167xu.m25955A(interfaceC11317uf0.mo8538h())).f969b;
                if (c11572wf04 == null) {
                    throw new IllegalArgumentException("The set type should contain the type of elements.");
                }
                this.f4139e = c8413Vd1.m8524b(c11572wf04);
                return;
            case 4:
                O90.m5968f(interfaceC11317uf0, "pairType");
                super(interfaceC11317uf0.mo8537e(), 1);
                this.f4138d = interfaceC11317uf0;
                C7376Bf0 c7376Bf02 = (C7376Bf0) AbstractC7167xu.m25958D(0, interfaceC11317uf0.mo8538h());
                C11572wf0 c11572wf05 = c7376Bf02 != null ? c7376Bf02.f969b : null;
                if (c11572wf05 == null) {
                    throw new IllegalArgumentException("The pair type should contain the type of the first parameter.");
                }
                AbstractC8309Td1 abstractC8309Td1M8524b = c8413Vd1.m8524b(c11572wf05);
                C7376Bf0 c7376Bf03 = (C7376Bf0) AbstractC7167xu.m25958D(1, interfaceC11317uf0.mo8538h());
                c11572wf0 = c7376Bf03 != null ? c7376Bf03.f969b : null;
                if (c11572wf0 == null) {
                    throw new IllegalArgumentException("The pair type should contain the type of the second parameter.");
                }
                this.f4139e = AbstractC7230yu.m26275f(abstractC8309Td1M8524b, c8413Vd1.m8524b(c11572wf0));
                return;
            default:
                O90.m5968f(interfaceC11317uf0, "arrayType");
                this.f4138d = interfaceC11317uf0;
                C11572wf0 c11572wf06 = ((C7376Bf0) AbstractC7167xu.m25955A(interfaceC11317uf0.mo8538h())).f969b;
                if (c11572wf06 == null) {
                    throw new IllegalArgumentException("The array type should contain the type of the elements.");
                }
                this.f4139e = c8413Vd1.m8524b(c11572wf06);
                return;
        }
    }

    @Override // p000.AbstractC0673Kg, p000.AbstractC8309Td1
    /* renamed from: b */
    public final ExpectedType mo3313b() {
        Object obj = this.f4139e;
        switch (this.f4137c) {
            case 0:
                ExpectedType expectedTypeMo3313b = ((AbstractC8309Td1) obj).mo3313b();
                O90.m5968f(expectedTypeMo3313b, "parameterType");
                return new ExpectedType(new SingleType(EnumC1635Zz.f15257o, new ExpectedType[]{expectedTypeMo3313b}));
            case 1:
                ExpectedType expectedTypeMo3313b2 = ((AbstractC8309Td1) obj).mo3313b();
                O90.m5968f(expectedTypeMo3313b2, "parameterType");
                return new ExpectedType(new SingleType(EnumC1635Zz.f15258p, new ExpectedType[]{expectedTypeMo3313b2}));
            case 2:
                ExpectedType expectedTypeMo3313b3 = ((AbstractC8309Td1) obj).mo3313b();
                O90.m5968f(expectedTypeMo3313b3, "valueType");
                return new ExpectedType(new SingleType(EnumC1635Zz.f15259q, new ExpectedType[]{expectedTypeMo3313b3}));
            case 3:
                ExpectedType expectedTypeMo3313b4 = ((AbstractC8309Td1) obj).mo3313b();
                O90.m5968f(expectedTypeMo3313b4, "parameterType");
                return new ExpectedType(new SingleType(EnumC1635Zz.f15258p, new ExpectedType[]{expectedTypeMo3313b4}));
            default:
                return new ExpectedType(new SingleType(EnumC1635Zz.f15253k, null));
        }
    }

    @Override // p000.AbstractC0673Kg, p000.AbstractC8309Td1
    /* renamed from: c */
    public final boolean mo3314c() {
        switch (this.f4137c) {
        }
        return ((AbstractC8309Td1) this.f4139e).mo3314c();
    }

    @Override // p000.AbstractC0673Kg
    /* renamed from: e */
    public final Object mo3315e(Object obj) throws C6281k8 {
        Object next;
        C6281k8 c6281k8;
        switch (this.f4137c) {
            case 0:
                O90.m5968f(obj, "value");
                AbstractC8309Td1 abstractC8309Td1 = (AbstractC8309Td1) this.f4139e;
                if (abstractC8309Td1.mo3314c()) {
                    return (Object[]) obj;
                }
                Object[] objArr = (Object[]) obj;
                ArrayList arrayList = new ArrayList(objArr.length);
                for (Object obj2 : objArr) {
                    try {
                        arrayList.add(abstractC8309Td1.mo7706a(obj2, null));
                    } catch (Throwable th) {
                        CodedException codedException = !(th instanceof CodedException) ? th instanceof AbstractC6266ju ? new CodedException(((AbstractC6266ju) th).mo2811a(), th.getMessage(), th.getCause()) : new UnexpectedException(th.toString(), th) : (CodedException) th;
                        InterfaceC11317uf0 interfaceC11317uf0 = this.f4138d;
                        C11572wf0 c11572wf0 = ((C7376Bf0) AbstractC7167xu.m25955A(interfaceC11317uf0.mo8538h())).f969b;
                        O90.m5965c(c11572wf0);
                        O90.m5965c(obj2);
                        throw new C6281k8(interfaceC11317uf0, c11572wf0, BP0.f799a.mo3846b(obj2.getClass()), codedException);
                    }
                }
                return arrayList.toArray(new Object[0]);
            case 1:
                O90.m5968f(obj, "value");
                AbstractC8309Td1 abstractC8309Td12 = (AbstractC8309Td1) this.f4139e;
                if (abstractC8309Td12.mo3314c()) {
                    return (List) obj;
                }
                List list = (List) obj;
                ArrayList arrayList2 = new ArrayList(AbstractC7293zu.m26586k(list));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    next = it.next();
                    try {
                        arrayList2.add(abstractC8309Td12.mo7706a(next, null));
                    } finally {
                    }
                }
                return arrayList2;
            case 2:
                O90.m5968f(obj, "value");
                AbstractC8309Td1 abstractC8309Td13 = (AbstractC8309Td1) this.f4139e;
                if (abstractC8309Td13.mo3314c()) {
                    return (Map) obj;
                }
                Map map = (Map) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC11205tn0.m24983b(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    try {
                        linkedHashMap.put(key, abstractC8309Td13.mo7706a(value, null));
                    } catch (Throwable th2) {
                        CodedException codedException2 = !(th2 instanceof CodedException) ? th2 instanceof AbstractC6266ju ? new CodedException(((AbstractC6266ju) th2).mo2811a(), th2.getMessage(), th2.getCause()) : new UnexpectedException(th2.toString(), th2) : (CodedException) th2;
                        InterfaceC11317uf0 interfaceC11317uf02 = this.f4138d;
                        C11572wf0 c11572wf02 = ((C7376Bf0) interfaceC11317uf02.mo8538h().get(1)).f969b;
                        O90.m5965c(c11572wf02);
                        O90.m5965c(value);
                        throw new C6281k8(interfaceC11317uf02, c11572wf02, BP0.f799a.mo3846b(value.getClass()), codedException2);
                    }
                }
                return linkedHashMap;
            case 3:
                O90.m5968f(obj, "value");
                AbstractC8309Td1 abstractC8309Td14 = (AbstractC8309Td1) this.f4139e;
                if (abstractC8309Td14.mo3314c()) {
                    return AbstractC7167xu.m25987g0((List) obj);
                }
                List list2 = (List) obj;
                ArrayList arrayList3 = new ArrayList(AbstractC7293zu.m26586k(list2));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    next = it2.next();
                    try {
                        arrayList3.add(abstractC8309Td14.mo7706a(next, null));
                    } finally {
                    }
                }
                return AbstractC7167xu.m25987g0(arrayList3);
            default:
                O90.m5968f(obj, "value");
                if (!(obj instanceof ReadableArray)) {
                    return (Pair) obj;
                }
                ReadableArray readableArray = (ReadableArray) obj;
                return new Pair(m3317h(readableArray, 0), m3317h(readableArray, 1));
        }
    }

    @Override // p000.AbstractC0673Kg
    /* renamed from: f */
    public final Object mo3316f(Dynamic dynamic) throws NegativeArraySizeException {
        Dynamic dynamic2;
        switch (this.f4137c) {
            case 0:
                O90.m5968f(dynamic, "value");
                ReadableArray readableArrayAsArray = dynamic.asArray();
                int size = readableArrayAsArray.size();
                C11572wf0 c11572wf0 = ((C7376Bf0) AbstractC7167xu.m25955A(this.f4138d.mo8538h())).f969b;
                O90.m5965c(c11572wf0);
                InterfaceC9779ie0 interfaceC9779ie0Mo8539i = c11572wf0.mo8539i();
                O90.m5966d(interfaceC9779ie0Mo8539i, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
                Object objNewInstance = Array.newInstance((Class<?>) P22.m6213b((InterfaceC8412Vd0) interfaceC9779ie0Mo8539i), size);
                O90.m5966d(objNewInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                Object[] objArr = (Object[]) objNewInstance;
                int size2 = readableArrayAsArray.size();
                for (int i = 0; i < size2; i++) {
                    dynamic2 = readableArrayAsArray.getDynamic(i);
                    try {
                        Object objMo7706a = ((AbstractC8309Td1) this.f4139e).mo7706a(dynamic2, null);
                        dynamic2.recycle();
                        objArr[i] = objMo7706a;
                    } finally {
                    }
                }
                return objArr;
            case 1:
                O90.m5968f(dynamic, "value");
                ReadableArray readableArrayAsArray2 = dynamic.asArray();
                int size3 = readableArrayAsArray2.size();
                ArrayList arrayList = new ArrayList(size3);
                for (int i2 = 0; i2 < size3; i2++) {
                    Dynamic dynamic3 = readableArrayAsArray2.getDynamic(i2);
                    try {
                        Object objMo7706a2 = ((AbstractC8309Td1) this.f4139e).mo7706a(dynamic3, null);
                        dynamic3.recycle();
                        arrayList.add(objMo7706a2);
                    } finally {
                        try {
                            CodedException codedException = !(th instanceof CodedException) ? th instanceof AbstractC6266ju ? new CodedException(((AbstractC6266ju) th).mo2811a(), th.getMessage(), th.getCause()) : new UnexpectedException(th.toString(), th) : (CodedException) th;
                            InterfaceC11317uf0 interfaceC11317uf0 = this.f4138d;
                            C11572wf0 c11572wf02 = ((C7376Bf0) AbstractC7167xu.m25955A(interfaceC11317uf0.mo8538h())).f969b;
                            O90.m5965c(c11572wf02);
                            throw new C6281k8(interfaceC11317uf0, c11572wf02, dynamic3.getType(), codedException);
                        } finally {
                        }
                    }
                }
                return arrayList;
            case 2:
                O90.m5968f(dynamic, "value");
                ReadableMap readableMapAsMap = dynamic.asMap();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator<Map.Entry<String, Object>> entryIterator = readableMapAsMap.getEntryIterator();
                while (entryIterator.hasNext()) {
                    Map.Entry<String, Object> next = entryIterator.next();
                    String key = next.getKey();
                    DynamicFromObject dynamicFromObject = new DynamicFromObject(next.getValue());
                    try {
                        linkedHashMap.put(key, ((AbstractC8309Td1) this.f4139e).mo7706a(dynamicFromObject, null));
                        dynamicFromObject.recycle();
                    } finally {
                    }
                }
                return linkedHashMap;
            case 3:
                O90.m5968f(dynamic, "value");
                ReadableArray readableArrayAsArray3 = dynamic.asArray();
                int size4 = readableArrayAsArray3.size();
                ArrayList arrayList2 = new ArrayList(size4);
                for (int i3 = 0; i3 < size4; i3++) {
                    dynamic2 = readableArrayAsArray3.getDynamic(i3);
                    try {
                        Object objMo7706a3 = ((AbstractC8309Td1) this.f4139e).mo7706a(dynamic2, null);
                        dynamic2.recycle();
                        arrayList2.add(objMo7706a3);
                    } finally {
                    }
                }
                return AbstractC7167xu.m25987g0(arrayList2);
            default:
                O90.m5968f(dynamic, "value");
                ReadableArray readableArrayAsArray4 = dynamic.asArray();
                return new Pair(m3317h(readableArrayAsArray4, 0), m3317h(readableArrayAsArray4, 1));
        }
    }

    /* renamed from: h */
    public Object m3317h(ReadableArray readableArray, int i) {
        Dynamic dynamic = readableArray.getDynamic(i);
        try {
            Object objMo7706a = ((AbstractC8309Td1) ((List) this.f4139e).get(i)).mo7706a(dynamic, null);
            dynamic.recycle();
            return objMo7706a;
        } catch (Throwable th) {
            try {
                CodedException codedException = !(th instanceof CodedException) ? th instanceof AbstractC6266ju ? new CodedException(((AbstractC6266ju) th).mo2811a(), th.getMessage(), th.getCause()) : new UnexpectedException(th.toString(), th) : (CodedException) th;
                InterfaceC11317uf0 interfaceC11317uf0 = this.f4138d;
                C11572wf0 c11572wf0 = ((C7376Bf0) interfaceC11317uf0.mo8538h().get(i)).f969b;
                O90.m5965c(c11572wf0);
                throw new C6281k8(interfaceC11317uf0, c11572wf0, dynamic.getType(), codedException);
            } catch (Throwable th2) {
                dynamic.recycle();
                throw th2;
            }
        }
    }
}
