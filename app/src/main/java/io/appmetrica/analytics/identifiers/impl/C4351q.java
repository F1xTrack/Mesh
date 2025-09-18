package io.appmetrica.analytics.identifiers.impl;

import android.content.Context;
import android.os.Parcel;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;

/* renamed from: io.appmetrica.analytics.identifiers.impl.q */
/* loaded from: classes2.dex */
public final class C4351q implements InterfaceC4336b {

    /* renamed from: a */
    public final C4340f f29830a;

    public C4351q(C4340f c4340f) {
        this.f29830a = c4340f;
    }

    @Override // io.appmetrica.analytics.identifiers.impl.InterfaceC4336b
    /* renamed from: a */
    public final C4337c mo19171a(Context context) {
        C4337c c4337c;
        try {
            try {
                try {
                    try {
                        C4337c c4337cM19181b = m19181b(context);
                        try {
                            this.f29830a.m19174b(context);
                            return c4337cM19181b;
                        } catch (Throwable unused) {
                            return c4337cM19181b;
                        }
                    } catch (C4346l e) {
                        String message = e.getMessage();
                        if (message == null) {
                            message = "No yandex adv_id service";
                        }
                        c4337c = new C4337c(IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, null, message, 2);
                        this.f29830a.m19174b(context);
                        return c4337c;
                    } catch (Throwable th) {
                        return new C4337c(IdentifierStatus.UNKNOWN, null, "exception while fetching yandex adv_id: " + th.getMessage(), 2);
                    }
                } catch (C4341g e2) {
                    String message2 = e2.getMessage();
                    if (message2 == null) {
                        message2 = "unknown exception while binding yandex adv_id service";
                    }
                    c4337c = new C4337c(IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, null, message2, 2);
                    this.f29830a.m19174b(context);
                    return c4337c;
                }
            } catch (Throwable unused2) {
                return c4337c;
            }
        } finally {
            try {
                this.f29830a.m19174b(context);
            } catch (Throwable unused3) {
            }
        }
    }

    /* renamed from: b */
    public final C4337c m19181b(Context context) {
        C4353s c4353s = (C4353s) ((InterfaceC4355u) this.f29830a.m19173a(context));
        c4353s.getClass();
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.yandex.android.advid.service.YandexAdvIdInterface");
            c4353s.f29832a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            String string = parcelObtain2.readString();
            parcelObtain2.recycle();
            parcelObtain.recycle();
            parcelObtain = Parcel.obtain();
            parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.yandex.android.advid.service.YandexAdvIdInterface");
                c4353s.f29832a.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                boolean z = parcelObtain2.readInt() != 0;
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return new C4337c(IdentifierStatus.OK, new C4335a("yandex", string, Boolean.valueOf(z)), null, 4);
            } finally {
            }
        } finally {
        }
    }

    public C4351q() {
        this(new C4340f(AbstractC4352r.f29831a, C4350p.f29829a, "yandex"));
    }
}
