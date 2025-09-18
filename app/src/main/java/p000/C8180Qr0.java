package p000;

import expo.modules.kotlin.exception.CodedException;

/* renamed from: Qr0 */
/* loaded from: classes2.dex */
public final class C8180Qr0 extends CodedException {
    /* JADX WARN: Illegal instructions before constructor call */
    public C8180Qr0(String str, String str2, String str3, Throwable th) {
        O90.m5968f(str2, "key");
        O90.m5968f(str3, "keychain");
        str = str == null ? "unknown" : str;
        StringBuilder sbM2541x = F91.m2541x("An error occurred when writing to key: '", str2, "' under keychain: '", str3, "'. Caused by: ");
        sbM2541x.append(str);
        super(sbM2541x.toString(), th);
    }

    public C8180Qr0(String str) {
        super("Unable to download asset from url: ".concat(str), null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8180Qr0(int i) {
        super("Method does not exist.", null);
        switch (i) {
            case 3:
                super("Cannot assigned null to not nullable type.", null);
                break;
            case 4:
                super("SecureStore keys must not be null", null);
                break;
            case 5:
                super("Promise passed to 'unknown' was already settled. It will lead to a crash in the production environment!", null);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8180Qr0(InterfaceC11317uf0 interfaceC11317uf0) {
        super("Cannot find type converter for '" + interfaceC11317uf0 + "'.", null);
        O90.m5968f(interfaceC11317uf0, "forType");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8180Qr0(InterfaceC8412Vd0 interfaceC8412Vd0) {
        super("Unsupported type: '" + interfaceC8412Vd0 + "'", null);
        O90.m5968f(interfaceC8412Vd0, "clazz");
    }
}
