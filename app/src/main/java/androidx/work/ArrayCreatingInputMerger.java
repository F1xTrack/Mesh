package androidx.work;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import p000.C7249zC;
import p000.C7621Fx1;
import p000.F80;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m22267d2 = {"Landroidx/work/ArrayCreatingInputMerger;", "LF80;", "<init>", "()V", "work-runtime_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes.dex */
public final class ArrayCreatingInputMerger extends F80 {
    @Override // p000.F80
    /* renamed from: a */
    public final C7249zC mo2495a(ArrayList arrayList) throws Throwable {
        Object objNewInstance;
        C7621Fx1 c7621Fx1 = new C7621Fx1(13);
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map mapUnmodifiableMap = Collections.unmodifiableMap(((C7249zC) it.next()).f46722a);
            O90.m5967e(mapUnmodifiableMap, "input.keyValueMap");
            for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                Class cls = value != null ? value.getClass() : String.class;
                Object obj = map.get(str);
                O90.m5967e(str, "key");
                if (obj != null) {
                    Class<?> cls2 = obj.getClass();
                    if (cls2.equals(cls)) {
                        O90.m5967e(value, "value");
                        int length = Array.getLength(obj);
                        int length2 = Array.getLength(value);
                        Class<?> componentType = obj.getClass().getComponentType();
                        O90.m5965c(componentType);
                        Object objNewInstance2 = Array.newInstance(componentType, length + length2);
                        System.arraycopy(obj, 0, objNewInstance2, 0, length);
                        System.arraycopy(value, 0, objNewInstance2, length, length2);
                        O90.m5967e(objNewInstance2, "newArray");
                        value = objNewInstance2;
                    } else {
                        if (!O90.m5963a(cls2.getComponentType(), cls)) {
                            throw new IllegalArgumentException();
                        }
                        int length3 = Array.getLength(obj);
                        objNewInstance = Array.newInstance(cls, length3 + 1);
                        System.arraycopy(obj, 0, objNewInstance, 0, length3);
                        Array.set(objNewInstance, length3, value);
                        O90.m5967e(objNewInstance, "newArray");
                        value = objNewInstance;
                    }
                } else if (!cls.isArray()) {
                    objNewInstance = Array.newInstance(cls, 1);
                    Array.set(objNewInstance, 0, value);
                    O90.m5967e(objNewInstance, "newArray");
                    value = objNewInstance;
                }
                O90.m5967e(value, "if (existingValue == nul…      }\n                }");
                map.put(str, value);
            }
        }
        c7621Fx1.m2859w(map);
        C7249zC c7249zC = new C7249zC((HashMap) c7621Fx1.f3494a);
        C7249zC.m26327c(c7249zC);
        return c7249zC;
    }
}
