package p000;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: Wk0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C8478Wk0 implements InterfaceC6497nZ {

    /* renamed from: a */
    public final C8582Yk0 f13368a;

    /* renamed from: b */
    public final ConcurrentHashMap f13369b;

    /* renamed from: c */
    public final InterfaceC6497nZ f13370c;

    public C8478Wk0(C8582Yk0 c8582Yk0, ConcurrentHashMap concurrentHashMap, InterfaceC6497nZ interfaceC6497nZ) {
        if (c8582Yk0 == null) {
            m8843a(0);
            throw null;
        }
        this.f13368a = c8582Yk0;
        this.f13369b = concurrentHashMap;
        this.f13370c = interfaceC6497nZ;
    }

    /* renamed from: a */
    public static /* synthetic */ void m8843a(int i) {
        String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 3 || i == 4) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "map";
        } else if (i == 2) {
            objArr[0] = "compute";
        } else if (i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 3) {
            objArr[1] = "recursionDetected";
        } else if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[1] = "raceCondition";
        }
        if (i != 3 && i != 4) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 3 && i != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* renamed from: e */
    public final AssertionError m8844e(Object obj, Object obj2) {
        AssertionError assertionError = new AssertionError("Inconsistent key detected. " + EnumC8530Xk0.f13943b + " is expected, was: " + obj2 + ", most probably race condition detected on input " + obj + " under " + this.f13368a);
        C8582Yk0.m9348e(assertionError);
        return assertionError;
    }

    /* renamed from: f */
    public final AssertionError m8845f(Object obj, Object obj2) {
        AssertionError assertionError = new AssertionError("Race condition detected on input " + obj + ". Old value is " + obj2 + " under " + this.f13368a);
        C8582Yk0.m9348e(assertionError);
        return assertionError;
    }

    /* renamed from: g */
    public final AssertionError m8846g(Object obj, Throwable th) {
        AssertionError assertionError = new AssertionError("Unable to remove " + obj + " under " + this.f13368a, th);
        C8582Yk0.m9348e(assertionError);
        return assertionError;
    }

    @Override // p000.InterfaceC6497nZ
    public Object invoke(Object obj) throws Throwable {
        AssertionError assertionErrorM8846g;
        ConcurrentHashMap concurrentHashMap = this.f13369b;
        Object obj2 = concurrentHashMap.get(obj);
        EnumC8530Xk0 enumC8530Xk0 = EnumC8530Xk0.f13943b;
        Object obj3 = AbstractC11148tK1.f42996a;
        if (obj2 != null && obj2 != enumC8530Xk0) {
            AbstractC11148tK1.m24879d(obj2);
            if (obj2 == obj3) {
                return null;
            }
            return obj2;
        }
        C8582Yk0 c8582Yk0 = this.f13368a;
        V01 v01 = c8582Yk0.f14498a;
        V01 v012 = c8582Yk0.f14498a;
        v01.lock();
        try {
            Object obj4 = concurrentHashMap.get(obj);
            EnumC8530Xk0 enumC8530Xk02 = EnumC8530Xk0.f13944c;
            if (obj4 == enumC8530Xk0) {
                C0926Oi c0926OiMo6421d = c8582Yk0.mo6421d(obj, "");
                if (c0926OiMo6421d == null) {
                    m8843a(3);
                    throw null;
                }
                if (!c0926OiMo6421d.f8575b) {
                    Object obj5 = c0926OiMo6421d.f8576c;
                    v012.unlock();
                    return obj5;
                }
                obj4 = enumC8530Xk02;
            }
            if (obj4 == enumC8530Xk02) {
                C0926Oi c0926OiMo6421d2 = c8582Yk0.mo6421d(obj, "");
                if (c0926OiMo6421d2 == null) {
                    m8843a(3);
                    throw null;
                }
                if (!c0926OiMo6421d2.f8575b) {
                    Object obj6 = c0926OiMo6421d2.f8576c;
                    v012.unlock();
                    return obj6;
                }
            }
            if (obj4 != null) {
                AbstractC11148tK1.m24879d(obj4);
                assertionErrorM8845f = obj4 != obj3 ? obj4 : null;
                v012.unlock();
                return assertionErrorM8845f;
            }
            try {
                concurrentHashMap.put(obj, enumC8530Xk0);
                Object objInvoke = this.f13370c.invoke(obj);
                if (objInvoke != null) {
                    obj3 = objInvoke;
                }
                Object objPut = concurrentHashMap.put(obj, obj3);
                if (objPut == enumC8530Xk0) {
                    v012.unlock();
                    return objInvoke;
                }
                assertionErrorM8845f = m8845f(obj, objPut);
                throw assertionErrorM8845f;
            } catch (Throwable th) {
                if (H02.m3208a(th)) {
                    try {
                        Object objRemove = concurrentHashMap.remove(obj);
                        if (objRemove != enumC8530Xk0) {
                            throw m8844e(obj, objRemove);
                        }
                        throw th;
                    } finally {
                    }
                }
                C6914tt c6914tt = c8582Yk0.f14499b;
                if (th == assertionErrorM8845f) {
                    try {
                        concurrentHashMap.remove(obj);
                        c6914tt.getClass();
                        throw th;
                    } finally {
                    }
                }
                Object objPut2 = concurrentHashMap.put(obj, new C9674hp1(th));
                if (objPut2 != enumC8530Xk0) {
                    throw m8845f(obj, objPut2);
                }
                c6914tt.getClass();
                throw th;
                v012.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            v012.unlock();
            throw th2;
        }
    }
}
