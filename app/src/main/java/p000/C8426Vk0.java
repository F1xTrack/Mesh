package p000;

/* renamed from: Vk0 */
/* loaded from: classes2.dex */
public class C8426Vk0 extends C8374Uk0 implements InterfaceC8188Qv0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8426Vk0(C8582Yk0 c8582Yk0, InterfaceC6434mZ interfaceC6434mZ) {
        super(c8582Yk0, interfaceC6434mZ);
        if (c8582Yk0 != null) {
        } else {
            m8542a(0);
            throw null;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m8542a(int i) {
        String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 2 ? 3 : 2];
        if (i == 1) {
            objArr[0] = "computable";
        } else if (i != 2) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
        }
        if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
        } else {
            objArr[1] = "invoke";
        }
        if (i != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i == 2) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // p000.C8374Uk0, p000.InterfaceC6434mZ
    public final Object invoke() throws Throwable {
        Object objInvoke = super.invoke();
        if (objInvoke != null) {
            return objInvoke;
        }
        m8542a(2);
        throw null;
    }
}
