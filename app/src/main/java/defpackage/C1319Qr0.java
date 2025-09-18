package defpackage;

import expo.modules.kotlin.exception.CodedException;

/* renamed from: Qr0 */
/* loaded from: classes2.dex */
public final class C1319Qr0 extends CodedException {
    /* JADX WARN: Illegal instructions before constructor call */
    public C1319Qr0(String str, String str2, String str3, Throwable th) {
        O90.f(str2, "key");
        O90.f(str3, "keychain");
        str = str == null ? "unknown" : str;
        StringBuilder sbX = F91.x("An error occurred when writing to key: '", str2, "' under keychain: '", str3, "'. Caused by: ");
        sbX.append(str);
        super(sbX.toString(), th);
    }

    public C1319Qr0(String str) {
        super("Unable to download asset from url: ".concat(str), null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1319Qr0(int i) {
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
    public C1319Qr0(InterfaceC7454uf0 interfaceC7454uf0) {
        super("Cannot find type converter for '" + interfaceC7454uf0 + "'.", null);
        O90.f(interfaceC7454uf0, "forType");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1319Qr0(InterfaceC1667Vd0 interfaceC1667Vd0) {
        super("Unsupported type: '" + interfaceC1667Vd0 + "'", null);
        O90.f(interfaceC1667Vd0, "clazz");
    }
}
