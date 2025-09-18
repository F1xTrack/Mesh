package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: Wk0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1766Wk0 implements InterfaceC6099nZ {
    public final C1922Yk0 a;
    public final ConcurrentHashMap b;
    public final InterfaceC6099nZ c;

    public C1766Wk0(C1922Yk0 c1922Yk0, ConcurrentHashMap concurrentHashMap, InterfaceC6099nZ interfaceC6099nZ) {
        if (c1922Yk0 == null) {
            a(0);
            throw null;
        }
        this.a = c1922Yk0;
        this.b = concurrentHashMap;
        this.c = interfaceC6099nZ;
    }

    public static /* synthetic */ void a(int i) {
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

    public final AssertionError e(Object obj, Object obj2) {
        AssertionError assertionError = new AssertionError("Inconsistent key detected. " + EnumC1844Xk0.b + " is expected, was: " + obj2 + ", most probably race condition detected on input " + obj + " under " + this.a);
        C1922Yk0.e(assertionError);
        return assertionError;
    }

    public final AssertionError f(Object obj, Object obj2) {
        AssertionError assertionError = new AssertionError("Race condition detected on input " + obj + ". Old value is " + obj2 + " under " + this.a);
        C1922Yk0.e(assertionError);
        return assertionError;
    }

    public final AssertionError g(Object obj, Throwable th) {
        AssertionError assertionError = new AssertionError("Unable to remove " + obj + " under " + this.a, th);
        C1922Yk0.e(assertionError);
        return assertionError;
    }

    @Override // defpackage.InterfaceC6099nZ
    public Object invoke(Object obj) throws Throwable {
        AssertionError assertionErrorG;
        ConcurrentHashMap concurrentHashMap = this.b;
        Object obj2 = concurrentHashMap.get(obj);
        EnumC1844Xk0 enumC1844Xk0 = EnumC1844Xk0.b;
        Object obj3 = AbstractC7201tK1.a;
        if (obj2 != null && obj2 != enumC1844Xk0) {
            AbstractC7201tK1.d(obj2);
            if (obj2 == obj3) {
                return null;
            }
            return obj2;
        }
        C1922Yk0 c1922Yk0 = this.a;
        V01 v01 = c1922Yk0.a;
        V01 v012 = c1922Yk0.a;
        v01.lock();
        try {
            Object obj4 = concurrentHashMap.get(obj);
            EnumC1844Xk0 enumC1844Xk02 = EnumC1844Xk0.c;
            if (obj4 == enumC1844Xk0) {
                C1135Oi c1135OiD = c1922Yk0.d(obj, "");
                if (c1135OiD == null) {
                    a(3);
                    throw null;
                }
                if (!c1135OiD.b) {
                    Object obj5 = c1135OiD.c;
                    v012.unlock();
                    return obj5;
                }
                obj4 = enumC1844Xk02;
            }
            if (obj4 == enumC1844Xk02) {
                C1135Oi c1135OiD2 = c1922Yk0.d(obj, "");
                if (c1135OiD2 == null) {
                    a(3);
                    throw null;
                }
                if (!c1135OiD2.b) {
                    Object obj6 = c1135OiD2.c;
                    v012.unlock();
                    return obj6;
                }
            }
            if (obj4 != null) {
                AbstractC7201tK1.d(obj4);
                assertionErrorF = obj4 != obj3 ? obj4 : null;
                v012.unlock();
                return assertionErrorF;
            }
            try {
                concurrentHashMap.put(obj, enumC1844Xk0);
                Object objInvoke = this.c.invoke(obj);
                if (objInvoke != null) {
                    obj3 = objInvoke;
                }
                Object objPut = concurrentHashMap.put(obj, obj3);
                if (objPut == enumC1844Xk0) {
                    v012.unlock();
                    return objInvoke;
                }
                assertionErrorF = f(obj, objPut);
                throw assertionErrorF;
            } catch (Throwable th) {
                if (H02.a(th)) {
                    try {
                        Object objRemove = concurrentHashMap.remove(obj);
                        if (objRemove != enumC1844Xk0) {
                            throw e(obj, objRemove);
                        }
                        throw th;
                    } finally {
                    }
                }
                C7304tt c7304tt = c1922Yk0.b;
                if (th == assertionErrorF) {
                    try {
                        concurrentHashMap.remove(obj);
                        c7304tt.getClass();
                        throw th;
                    } finally {
                    }
                }
                Object objPut2 = concurrentHashMap.put(obj, new C4227hp1(th));
                if (objPut2 != enumC1844Xk0) {
                    throw f(obj, objPut2);
                }
                c7304tt.getClass();
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
