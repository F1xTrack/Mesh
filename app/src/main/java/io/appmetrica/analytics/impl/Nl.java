package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;

/* loaded from: classes2.dex */
public final class Nl extends Sl {
    @Override // io.appmetrica.analytics.impl.Sl
    public final ProtobufStateStorage a(Context context, IBinaryDataHelper iBinaryDataHelper) {
        byte[] bArrA;
        byte[] bArrA2;
        C5030ze c5030ze = new C5030ze();
        try {
            bArrA = AbstractC4962wi.a(context.getPackageName());
        } catch (Throwable unused) {
            bArrA = new byte[16];
        }
        try {
            bArrA2 = AbstractC4962wi.a(new StringBuilder(context.getPackageName()).reverse().toString());
        } catch (Throwable unused2) {
            bArrA2 = new byte[16];
        }
        return new C4454bf("preload_info_data", iBinaryDataHelper, new C4976x8(c5030ze, new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, bArrA, bArrA2)), new C4958we());
    }

    @Override // io.appmetrica.analytics.impl.Sl
    public final IBinaryDataHelper c(Context context) {
        C4660k3 c4660k3;
        Z6 z6A = Z6.a(context);
        synchronized (z6A) {
            try {
                if (z6A.i == null) {
                    z6A.i = new C4660k3(z6A.g());
                }
                c4660k3 = z6A.i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4660k3;
    }

    @Override // io.appmetrica.analytics.impl.Sl
    public final IBinaryDataHelper d(Context context) {
        IBinaryDataHelper iBinaryDataHelperG;
        Z6 z6A = Z6.a(context);
        synchronized (z6A) {
            iBinaryDataHelperG = z6A.g();
        }
        return iBinaryDataHelperG;
    }
}
