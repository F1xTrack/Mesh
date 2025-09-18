package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;

/* renamed from: Nh1 */
/* loaded from: classes2.dex */
public final class C8005Nh1 implements InterfaceC0615Jl {

    /* renamed from: a */
    public final boolean f7960a;

    /* renamed from: b */
    public final InterfaceC0615Jl f7961b;

    /* renamed from: c */
    public final Member f7962c;

    /* renamed from: d */
    public final C10910rT1 f7963d;

    /* renamed from: e */
    public final C9461g90[] f7964e;

    /* renamed from: f */
    public final boolean f7965f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:198:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0243  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C8005Nh1(p000.InterfaceC0615Jl r11, p000.InterfaceC0036AZ r12, boolean r13) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 788
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8005Nh1.<init>(Jl, AZ, boolean):void");
    }

    @Override // p000.InterfaceC0615Jl
    /* renamed from: a */
    public final List mo3319a() {
        return this.f7961b.mo3319a();
    }

    @Override // p000.InterfaceC0615Jl
    /* renamed from: b */
    public final Member mo3320b() {
        return this.f7962c;
    }

    @Override // p000.InterfaceC0615Jl
    public final Object call(Object[] objArr) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method;
        Object objInvoke;
        Object objM2753e;
        Object objM2753e2;
        O90.m5968f(objArr, "args");
        C10910rT1 c10910rT1 = this.f7963d;
        C9461g90 c9461g90 = (C9461g90) c10910rT1.f41678b;
        List[] listArr = (List[]) c10910rT1.f41679c;
        if (!c9461g90.isEmpty()) {
            boolean z = this.f7965f;
            int i = c9461g90.f26570b;
            int i2 = c9461g90.f26569a;
            if (z) {
                C10685pj0 c10685pj0 = new C10685pj0(objArr.length);
                for (int i3 = 0; i3 < i2; i3++) {
                    c10685pj0.add(objArr[i3]);
                }
                if (i2 <= i) {
                    while (true) {
                        List<Method> list = listArr[i2];
                        Object obj = objArr[i2];
                        if (list != null) {
                            for (Method method2 : list) {
                                if (obj != null) {
                                    objM2753e2 = method2.invoke(obj, null);
                                } else {
                                    Class<?> returnType = method2.getReturnType();
                                    O90.m5967e(returnType, "getReturnType(...)");
                                    objM2753e2 = AbstractC7589Fh1.m2753e(returnType);
                                }
                                c10685pj0.add(objM2753e2);
                            }
                        } else {
                            c10685pj0.add(obj);
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
                        c10685pj0.add(objArr[i4]);
                        if (i4 == length) {
                            break;
                        }
                        i4++;
                    }
                }
                objArr = AbstractC7230yu.m26271b(c10685pj0).toArray(new Object[0]);
            } else {
                int length2 = objArr.length;
                Object[] objArr2 = new Object[length2];
                for (int i5 = 0; i5 < length2; i5++) {
                    if (i5 > i || i2 > i5) {
                        objM2753e = objArr[i5];
                    } else {
                        List list2 = listArr[i5];
                        Method method3 = list2 != null ? (Method) AbstractC7167xu.m25972R(list2) : null;
                        objM2753e = objArr[i5];
                        if (method3 != null) {
                            if (objM2753e != null) {
                                objM2753e = method3.invoke(objM2753e, null);
                            } else {
                                Class<?> returnType2 = method3.getReturnType();
                                O90.m5967e(returnType2, "getReturnType(...)");
                                objM2753e = AbstractC7589Fh1.m2753e(returnType2);
                            }
                        }
                    }
                    objArr2[i5] = objM2753e;
                }
                objArr = objArr2;
            }
        }
        Object objCall = this.f7961b.call(objArr);
        return (objCall == EnumC0817Mz.f7418a || (method = (Method) c10910rT1.f41680d) == null || (objInvoke = method.invoke(null, objCall)) == null) ? objCall : objInvoke;
    }

    @Override // p000.InterfaceC0615Jl
    public final Type getReturnType() {
        return this.f7961b.getReturnType();
    }
}
