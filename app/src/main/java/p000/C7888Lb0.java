package p000;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: Lb0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7888Lb0 implements InvocationHandler {

    /* renamed from: a */
    public final ArrayList f6746a;

    /* renamed from: b */
    public boolean f6747b;

    /* renamed from: c */
    public String f6748c;

    public C7888Lb0(ArrayList arrayList) {
        this.f6746a = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        O90.m5968f(obj, "proxy");
        O90.m5968f(method, "method");
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (O90.m5963a(name, "supports") && O90.m5963a(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (O90.m5963a(name, "unsupported") && O90.m5963a(Void.TYPE, returnType)) {
            this.f6747b = true;
            return null;
        }
        boolean zM5963a = O90.m5963a(name, "protocols");
        ArrayList arrayList = this.f6746a;
        if (zM5963a && objArr.length == 0) {
            return arrayList;
        }
        if ((O90.m5963a(name, "selectProtocol") || O90.m5963a(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                O90.m5966d(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                List list = (List) obj2;
                int size = list.size();
                if (size >= 0) {
                    int i = 0;
                    while (true) {
                        Object obj3 = list.get(i);
                        O90.m5966d(obj3, "null cannot be cast to non-null type kotlin.String");
                        String str = (String) obj3;
                        if (!arrayList.contains(str)) {
                            if (i == size) {
                                break;
                            }
                            i++;
                        } else {
                            this.f6748c = str;
                            return str;
                        }
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.f6748c = str2;
                return str2;
            }
        }
        if ((!O90.m5963a(name, "protocolSelected") && !O90.m5963a(name, "selected")) || objArr.length != 1) {
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
        Object obj4 = objArr[0];
        O90.m5966d(obj4, "null cannot be cast to non-null type kotlin.String");
        this.f6748c = (String) obj4;
        return null;
    }
}
