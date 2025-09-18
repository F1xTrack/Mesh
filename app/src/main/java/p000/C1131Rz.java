package p000;

/* renamed from: Rz */
/* loaded from: classes2.dex */
public final class C1131Rz extends Error {
    public C1131Rz() {
        super("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1131Rz(String str, int i) {
        super(str);
        switch (i) {
            case 3:
                O90.m5968f(str, "message");
                super(str);
                break;
            default:
                O90.m5968f(str, "message");
                break;
        }
    }
}
