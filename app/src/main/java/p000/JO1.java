package p000;

import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public final /* synthetic */ class JO1 implements InterfaceC10736q61 {

    /* renamed from: a */
    public /* synthetic */ Context f5509a;

    @Override // p000.InterfaceC10736q61
    public final Object get() {
        AbstractC7362Ay0 abstractC7362Ay0M25740d;
        Context contextCreateDeviceProtectedStorageContext = this.f5509a;
        AbstractC7362Ay0 abstractC7362Ay0 = AbstractC10132lO1.f37041a;
        if (abstractC7362Ay0 == null) {
            synchronized (AbstractC10132lO1.class) {
                try {
                    abstractC7362Ay0 = AbstractC10132lO1.f37041a;
                    if (abstractC7362Ay0 == null) {
                        String str = Build.TYPE;
                        String str2 = Build.TAGS;
                        C7119x8 c7119x8 = AbstractC11028sO1.f42417a;
                        if ((str.equals("eng") || str.equals("userdebug")) && (str2.contains("dev-keys") || str2.contains("test-keys"))) {
                            if (AbstractC10898rN1.m24324a() && !contextCreateDeviceProtectedStorageContext.isDeviceProtectedStorage()) {
                                contextCreateDeviceProtectedStorageContext = contextCreateDeviceProtectedStorageContext.createDeviceProtectedStorageContext();
                            }
                            abstractC7362Ay0M25740d = AbstractC11622x22.m25740d(contextCreateDeviceProtectedStorageContext);
                        } else {
                            abstractC7362Ay0M25740d = C7047w.f44631a;
                        }
                        AbstractC10132lO1.f37041a = abstractC7362Ay0M25740d;
                        abstractC7362Ay0 = abstractC7362Ay0M25740d;
                    }
                } finally {
                }
            }
        }
        return abstractC7362Ay0;
    }
}
