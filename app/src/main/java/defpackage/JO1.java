package defpackage;

import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public final /* synthetic */ class JO1 implements InterfaceC6587q61 {
    public /* synthetic */ Context a;

    @Override // defpackage.InterfaceC6587q61
    public final Object get() {
        AbstractC0093Ay0 abstractC0093Ay0D;
        Context contextCreateDeviceProtectedStorageContext = this.a;
        AbstractC0093Ay0 abstractC0093Ay0 = AbstractC5686lO1.a;
        if (abstractC0093Ay0 == null) {
            synchronized (AbstractC5686lO1.class) {
                try {
                    abstractC0093Ay0 = AbstractC5686lO1.a;
                    if (abstractC0093Ay0 == null) {
                        String str = Build.TYPE;
                        String str2 = Build.TAGS;
                        C7925x8 c7925x8 = AbstractC7022sO1.a;
                        if ((str.equals("eng") || str.equals("userdebug")) && (str2.contains("dev-keys") || str2.contains("test-keys"))) {
                            if (AbstractC6828rN1.a() && !contextCreateDeviceProtectedStorageContext.isDeviceProtectedStorage()) {
                                contextCreateDeviceProtectedStorageContext = contextCreateDeviceProtectedStorageContext.createDeviceProtectedStorageContext();
                            }
                            abstractC0093Ay0D = AbstractC7909x22.d(contextCreateDeviceProtectedStorageContext);
                        } else {
                            abstractC0093Ay0D = C7707w.a;
                        }
                        AbstractC5686lO1.a = abstractC0093Ay0D;
                        abstractC0093Ay0 = abstractC0093Ay0D;
                    }
                } finally {
                }
            }
        }
        return abstractC0093Ay0;
    }
}
