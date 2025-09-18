package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;

/* renamed from: Nh1 */
/* loaded from: classes2.dex */
public final class C1056Nh1 implements InterfaceC0755Jl {
    public final boolean a;
    public final InterfaceC0755Jl b;
    public final Member c;
    public final C6846rT1 d;
    public final C3909g90[] e;
    public final boolean f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:198:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0243  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1056Nh1(defpackage.InterfaceC0755Jl r11, defpackage.AZ r12, boolean r13) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 788
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1056Nh1.<init>(Jl, AZ, boolean):void");
    }

    @Override // defpackage.InterfaceC0755Jl
    public final List a() {
        return this.b.a();
    }

    @Override // defpackage.InterfaceC0755Jl
    public final Member b() {
        return this.c;
    }

    @Override // defpackage.InterfaceC0755Jl
    public final Object call(Object[] objArr) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method;
        Object objInvoke;
        Object objE;
        Object objE2;
        O90.f(objArr, "args");
        C6846rT1 c6846rT1 = this.d;
        C3909g90 c3909g90 = (C3909g90) c6846rT1.b;
        List[] listArr = (List[]) c6846rT1.c;
        if (!c3909g90.isEmpty()) {
            boolean z = this.f;
            int i = c3909g90.b;
            int i2 = c3909g90.a;
            if (z) {
                C6512pj0 c6512pj0 = new C6512pj0(objArr.length);
                for (int i3 = 0; i3 < i2; i3++) {
                    c6512pj0.add(objArr[i3]);
                }
                if (i2 <= i) {
                    while (true) {
                        List<Method> list = listArr[i2];
                        Object obj = objArr[i2];
                        if (list != null) {
                            for (Method method2 : list) {
                                if (obj != null) {
                                    objE2 = method2.invoke(obj, null);
                                } else {
                                    Class<?> returnType = method2.getReturnType();
                                    O90.e(returnType, "getReturnType(...)");
                                    objE2 = AbstractC0433Fh1.e(returnType);
                                }
                                c6512pj0.add(objE2);
                            }
                        } else {
                            c6512pj0.add(obj);
                        }
                        if (i2 == i) {
                            break;
                        }
                        i2++;
                    }
                }
                int i4 = i + 1;
                int length = objArr.length - 1;
                if (i4 <= length) {
                    while (true) {
                        c6512pj0.add(objArr[i4]);
                        if (i4 == length) {
                            break;
                        }
                        i4++;
                    }
                }
                objArr = AbstractC8259yu.b(c6512pj0).toArray(new Object[0]);
            } else {
                int length2 = objArr.length;
                Object[] objArr2 = new Object[length2];
                for (int i5 = 0; i5 < length2; i5++) {
                    if (i5 > i || i2 > i5) {
                        objE = objArr[i5];
                    } else {
                        List list2 = listArr[i5];
                        Method method3 = list2 != null ? (Method) AbstractC8069xu.R(list2) : null;
                        objE = objArr[i5];
                        if (method3 != null) {
                            if (objE != null) {
                                objE = method3.invoke(objE, null);
                            } else {
                                Class<?> returnType2 = method3.getReturnType();
                                O90.e(returnType2, "getReturnType(...)");
                                objE = AbstractC0433Fh1.e(returnType2);
                            }
                        }
                    }
                    objArr2[i5] = objE;
                }
                objArr = objArr2;
            }
        }
        Object objCall = this.b.call(objArr);
        return (objCall == EnumC1030Mz.a || (method = (Method) c6846rT1.d) == null || (objInvoke = method.invoke(null, objCall)) == null) ? objCall : objInvoke;
    }

    @Override // defpackage.InterfaceC0755Jl
    public final Type getReturnType() {
        return this.b.getReturnType();
    }
}
