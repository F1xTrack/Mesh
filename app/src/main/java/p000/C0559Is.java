package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: Is */
/* loaded from: classes.dex */
public final class C0559Is {

    /* renamed from: a */
    public final HashMap f5187a = new HashMap();

    /* renamed from: b */
    public final HashMap f5188b;

    public C0559Is(HashMap map) {
        this.f5188b = map;
        for (Map.Entry entry : map.entrySet()) {
            EnumC7382Bi0 enumC7382Bi0 = (EnumC7382Bi0) entry.getValue();
            List arrayList = (List) this.f5187a.get(enumC7382Bi0);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f5187a.put(enumC7382Bi0, arrayList);
            }
            arrayList.add((C0622Js) entry.getKey());
        }
    }

    /* renamed from: a */
    public static void m4057a(List list, InterfaceC7902Li0 interfaceC7902Li0, EnumC7382Bi0 enumC7382Bi0, InterfaceC7850Ki0 interfaceC7850Ki0) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0622Js c0622Js = (C0622Js) list.get(size);
                c0622Js.getClass();
                try {
                    int i = c0622Js.f5760a;
                    Method method = c0622Js.f5761b;
                    if (i == 0) {
                        method.invoke(interfaceC7850Ki0, null);
                    } else if (i == 1) {
                        method.invoke(interfaceC7850Ki0, interfaceC7902Li0);
                    } else if (i == 2) {
                        method.invoke(interfaceC7850Ki0, interfaceC7902Li0, enumC7382Bi0);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException("Failed to call observer method", e2.getCause());
                }
            }
        }
    }
}
