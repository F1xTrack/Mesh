package p000;

import expo.modules.kotlin.exception.CodedException;
import expo.modules.securestore.SecureStoreOptions;

/* renamed from: rX0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10917rX0 extends AbstractC8418Vg0 implements InterfaceC6497nZ {

    /* renamed from: e */
    public final /* synthetic */ int f41721e;

    /* renamed from: f */
    public final /* synthetic */ C11429vX0 f41722f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10917rX0(C11429vX0 c11429vX0, int i) {
        super(1);
        this.f41721e = i;
        this.f41722f = c11429vX0;
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) throws Throwable {
        boolean z;
        X11 x11;
        switch (this.f41721e) {
            case 0:
                Object[] objArr = (Object[]) obj;
                O90.m5968f(objArr, "<name for destructuring parameter 0>");
                Object obj2 = objArr[0];
                SecureStoreOptions secureStoreOptions = (SecureStoreOptions) objArr[1];
                String str = (String) obj2;
                try {
                    this.f41722f.m25433f(str, secureStoreOptions);
                    return C8313Tf1.f11463a;
                } catch (CodedException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new C6861t2(e2.getMessage(), str, secureStoreOptions.getKeychainService(), e2, 3);
                }
            case 1:
                Object[] objArr2 = (Object[]) obj;
                O90.m5968f(objArr2, "<name for destructuring parameter 0>");
                Object obj3 = objArr2[0];
                Object obj4 = objArr2[1];
                SecureStoreOptions secureStoreOptions2 = (SecureStoreOptions) objArr2[2];
                String str2 = (String) obj4;
                String str3 = (String) obj3;
                if (str2 == null) {
                    throw new C8180Qr0(4);
                }
                AbstractC9366fP1.m18231c(new C10533oX0(this.f41722f, str2, str3, secureStoreOptions2, null));
                return C8313Tf1.f11463a;
            case 2:
                Object[] objArr3 = (Object[]) obj;
                O90.m5968f(objArr3, "<name for destructuring parameter 0>");
                Object obj5 = objArr3[0];
                SecureStoreOptions secureStoreOptions3 = (SecureStoreOptions) objArr3[1];
                return (String) AbstractC9366fP1.m18231c(new C10661pX0(this.f41722f, (String) obj5, secureStoreOptions3, null));
            default:
                O90.m5968f((Object[]) obj, "it");
                try {
                    x11 = this.f41722f.f44406f;
                } catch (C1547Ya unused) {
                    z = false;
                }
                if (x11 == null) {
                    O90.m5977o("authenticationHelper");
                    throw null;
                }
                x11.m8917d();
                z = true;
                return Boolean.valueOf(z);
        }
    }
}
