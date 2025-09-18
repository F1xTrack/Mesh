package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;

/* renamed from: io.appmetrica.analytics.impl.Ll */
/* loaded from: classes2.dex */
public final class C4646Ll extends AbstractC4813Sl {
    @Override // io.appmetrica.analytics.impl.AbstractC4813Sl
    /* renamed from: a */
    public final ProtobufStateStorage mo19602a(Context context, IBinaryDataHelper iBinaryDataHelper) {
        byte[] bArrM21182a;
        byte[] bArrM21182a2;
        C5630zl c5630zl = new C5630zl();
        try {
            bArrM21182a = AbstractC5552wi.m21182a(context.getPackageName());
        } catch (Throwable unused) {
            bArrM21182a = new byte[16];
        }
        try {
            bArrM21182a2 = AbstractC5552wi.m21182a(new StringBuilder(context.getPackageName()).reverse().toString());
        } catch (Throwable unused2) {
            bArrM21182a2 = new byte[16];
        }
        return new C5024bf("startup_state", iBinaryDataHelper, new C5567x8(c5630zl, new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, bArrM21182a, bArrM21182a2)), new C5180hl());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4813Sl
    /* renamed from: c */
    public final IBinaryDataHelper mo19603c(Context context) {
        C5237k3 c5237k3;
        C4966Z6 c4966z6M20064a = C4966Z6.m20064a(context);
        synchronized (c4966z6M20064a) {
            try {
                if (c4966z6M20064a.f31170i == null) {
                    c4966z6M20064a.f31170i = new C5237k3(c4966z6M20064a.m20074g());
                }
                c5237k3 = c4966z6M20064a.f31170i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c5237k3;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4813Sl
    /* renamed from: d */
    public final IBinaryDataHelper mo19604d(Context context) {
        IBinaryDataHelper iBinaryDataHelperM20074g;
        C4966Z6 c4966z6M20064a = C4966Z6.m20064a(context);
        synchronized (c4966z6M20064a) {
            iBinaryDataHelperM20074g = c4966z6M20064a.m20074g();
        }
        return iBinaryDataHelperM20074g;
    }
}
