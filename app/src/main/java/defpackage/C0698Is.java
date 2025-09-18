package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: Is, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0698Is {
    public final HashMap a = new HashMap();
    public final HashMap b;

    public C0698Is(HashMap map) {
        this.b = map;
        for (Map.Entry entry : map.entrySet()) {
            EnumC0123Bi0 enumC0123Bi0 = (EnumC0123Bi0) entry.getValue();
            List arrayList = (List) this.a.get(enumC0123Bi0);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.a.put(enumC0123Bi0, arrayList);
            }
            arrayList.add((C0776Js) entry.getKey());
        }
    }

    public static void a(List list, InterfaceC0903Li0 interfaceC0903Li0, EnumC0123Bi0 enumC0123Bi0, InterfaceC0825Ki0 interfaceC0825Ki0) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0776Js c0776Js = (C0776Js) list.get(size);
                c0776Js.getClass();
                try {
                    int i = c0776Js.a;
                    Method method = c0776Js.b;
                    if (i == 0) {
                        method.invoke(interfaceC0825Ki0, null);
                    } else if (i == 1) {
                        method.invoke(interfaceC0825Ki0, interfaceC0903Li0);
                    } else if (i == 2) {
                        method.invoke(interfaceC0825Ki0, interfaceC0903Li0, enumC0123Bi0);
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
