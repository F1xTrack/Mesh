package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: eF1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC3546eF1 extends AbstractBinderC6795rC1 implements InterfaceC7377uF1 {
    public final AtomicReference a;
    public boolean b;

    public BinderC3546eF1() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        this.a = new AtomicReference();
    }

    public static Object I(Bundle bundle, Class cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        return cls.cast(obj);
    }

    @Override // defpackage.AbstractBinderC6795rC1
    public final boolean G(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) AbstractC6032nC1.a(parcel, Bundle.CREATOR);
        AbstractC6032nC1.d(parcel);
        zza(bundle);
        parcel2.writeNoException();
        return true;
    }

    public final Bundle H(long j) {
        Bundle bundle;
        synchronized (this.a) {
            if (!this.b) {
                try {
                    this.a.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.a.get();
        }
        return bundle;
    }

    public final String J(long j) {
        return (String) I(H(j), String.class);
    }

    @Override // defpackage.InterfaceC7377uF1
    public final void zza(Bundle bundle) {
        synchronized (this.a) {
            try {
                try {
                    this.a.set(bundle);
                    this.b = true;
                } finally {
                    this.a.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
