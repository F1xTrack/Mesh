package p000;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: Sk0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8270Sk0 extends C8478Wk0 {

    /* renamed from: d */
    public final /* synthetic */ int f10957d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8270Sk0(C8582Yk0 c8582Yk0, ConcurrentHashMap concurrentHashMap, InterfaceC6497nZ interfaceC6497nZ, int i) {
        super(c8582Yk0, concurrentHashMap, interfaceC6497nZ);
        this.f10957d = i;
    }

    /* renamed from: a */
    public static /* synthetic */ void m7448a(int i) {
        String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 3 ? 3 : 2];
        if (i == 1) {
            objArr[0] = "map";
        } else if (i == 2) {
            objArr[0] = "computation";
        } else if (i != 3) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
        }
        if (i != 3) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
        } else {
            objArr[1] = "computeIfAbsent";
        }
        if (i == 2) {
            objArr[2] = "computeIfAbsent";
        } else if (i != 3) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i == 3) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // p000.C8478Wk0, p000.InterfaceC6497nZ
    public Object invoke(Object obj) throws Throwable {
        switch (this.f10957d) {
            case 1:
                Object objInvoke = super.invoke(obj);
                if (objInvoke != null) {
                    return objInvoke;
                }
                throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull", "invoke"));
            default:
                return super.invoke(obj);
        }
    }
}
