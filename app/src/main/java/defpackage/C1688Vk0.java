package defpackage;

/* renamed from: Vk0 */
/* loaded from: classes2.dex */
public class C1688Vk0 extends C1610Uk0 implements InterfaceC1331Qv0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1688Vk0(C1922Yk0 c1922Yk0, InterfaceC5908mZ interfaceC5908mZ) {
        super(c1922Yk0, interfaceC5908mZ);
        if (c1922Yk0 != null) {
        } else {
            a(0);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i) {
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

    @Override // defpackage.C1610Uk0, defpackage.InterfaceC5908mZ
    public final Object invoke() throws Throwable {
        Object objInvoke = super.invoke();
        if (objInvoke != null) {
            return objInvoke;
        }
        a(2);
        throw null;
    }
}
