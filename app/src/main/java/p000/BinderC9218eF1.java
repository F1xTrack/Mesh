package p000;

import android.os.Bundle;
import android.os.Parcel;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: eF1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC9218eF1 extends AbstractBinderC10876rC1 implements InterfaceC11266uF1 {

    /* renamed from: a */
    public final AtomicReference f26620a;

    /* renamed from: b */
    public boolean f26621b;

    public BinderC9218eF1() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        this.f26620a = new AtomicReference();
    }

    /* renamed from: I */
    public static Object m17887I(Bundle bundle, Class cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        return cls.cast(obj);
    }

    @Override // p000.AbstractBinderC10876rC1
    /* renamed from: G */
    public final boolean mo734G(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) AbstractC10364nC1.m23100a(parcel, Bundle.CREATOR);
        AbstractC10364nC1.m23103d(parcel);
        zza(bundle);
        parcel2.writeNoException();
        return true;
    }

    /* renamed from: H */
    public final Bundle m17888H(long j) {
        Bundle bundle;
        synchronized (this.f26620a) {
            if (!this.f26621b) {
                try {
                    this.f26620a.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f26620a.get();
        }
        return bundle;
    }

    /* renamed from: J */
    public final String m17889J(long j) {
        return (String) m17887I(m17888H(j), String.class);
    }

    @Override // p000.InterfaceC11266uF1
    public final void zza(Bundle bundle) {
        synchronized (this.f26620a) {
            try {
                try {
                    this.f26620a.set(bundle);
                    this.f26621b = true;
                } finally {
                    this.f26620a.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
