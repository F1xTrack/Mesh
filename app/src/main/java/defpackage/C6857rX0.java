package defpackage;

import expo.modules.kotlin.exception.CodedException;
import expo.modules.securestore.SecureStoreOptions;

/* renamed from: rX0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6857rX0 extends AbstractC1676Vg0 implements InterfaceC6099nZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ C7621vX0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6857rX0(C7621vX0 c7621vX0, int i) {
        super(1);
        this.e = i;
        this.f = c7621vX0;
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) throws Throwable {
        boolean z;
        X11 x11;
        switch (this.e) {
            case 0:
                Object[] objArr = (Object[]) obj;
                O90.f(objArr, "<name for destructuring parameter 0>");
                Object obj2 = objArr[0];
                SecureStoreOptions secureStoreOptions = (SecureStoreOptions) objArr[1];
                String str = (String) obj2;
                try {
                    this.f.f(str, secureStoreOptions);
                    return C1518Tf1.a;
                } catch (CodedException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new C7143t2(e2.getMessage(), str, secureStoreOptions.getKeychainService(), e2, 3);
                }
            case 1:
                Object[] objArr2 = (Object[]) obj;
                O90.f(objArr2, "<name for destructuring parameter 0>");
                Object obj3 = objArr2[0];
                Object obj4 = objArr2[1];
                SecureStoreOptions secureStoreOptions2 = (SecureStoreOptions) objArr2[2];
                String str2 = (String) obj4;
                String str3 = (String) obj3;
                if (str2 == null) {
                    throw new C1319Qr0(4);
                }
                AbstractC3767fP1.c(new C6285oX0(this.f, str2, str3, secureStoreOptions2, null));
                return C1518Tf1.a;
            case 2:
                Object[] objArr3 = (Object[]) obj;
                O90.f(objArr3, "<name for destructuring parameter 0>");
                Object obj5 = objArr3[0];
                SecureStoreOptions secureStoreOptions3 = (SecureStoreOptions) objArr3[1];
                return (String) AbstractC3767fP1.c(new C6476pX0(this.f, (String) obj5, secureStoreOptions3, null));
            default:
                O90.f((Object[]) obj, "it");
                try {
                    x11 = this.f.f;
                } catch (C1891Ya unused) {
                    z = false;
                }
                if (x11 == null) {
                    O90.o("authenticationHelper");
                    throw null;
                }
                x11.d();
                z = true;
                return Boolean.valueOf(z);
        }
    }
}
