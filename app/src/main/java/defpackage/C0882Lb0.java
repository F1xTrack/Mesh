package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: Lb0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0882Lb0 implements InvocationHandler {
    public final ArrayList a;
    public boolean b;
    public String c;

    public C0882Lb0(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        O90.f(obj, "proxy");
        O90.f(method, "method");
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (O90.a(name, "supports") && O90.a(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (O90.a(name, "unsupported") && O90.a(Void.TYPE, returnType)) {
            this.b = true;
            return null;
        }
        boolean zA = O90.a(name, "protocols");
        ArrayList arrayList = this.a;
        if (zA && objArr.length == 0) {
            return arrayList;
        }
        if ((O90.a(name, "selectProtocol") || O90.a(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                O90.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                List list = (List) obj2;
                int size = list.size();
                if (size >= 0) {
                    int i = 0;
                    while (true) {
                        Object obj3 = list.get(i);
                        O90.d(obj3, "null cannot be cast to non-null type kotlin.String");
                        String str = (String) obj3;
                        if (!arrayList.contains(str)) {
                            if (i == size) {
                                break;
                            }
                            i++;
                        } else {
                            this.c = str;
                            return str;
                        }
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.c = str2;
                return str2;
            }
        }
        if ((!O90.a(name, "protocolSelected") && !O90.a(name, "selected")) || objArr.length != 1) {
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
        Object obj4 = objArr[0];
        O90.d(obj4, "null cannot be cast to non-null type kotlin.String");
        this.c = (String) obj4;
        return null;
    }
}
