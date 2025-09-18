package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstall;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ExecutionException;

/* renamed from: cX1 */
/* loaded from: classes.dex */
public final class C2534cX1 implements LU1 {
    public static final ZE1 h;
    public boolean a;
    public boolean b;
    public boolean c;
    public final Context d;
    public final C0425Ff e;
    public final C5814m32 f;
    public L32 g;

    static {
        CD1 cd1 = KD1.b;
        Object[] objArr = {"com.google.android.gms.vision.barcode", "com.google.android.gms.tflite_dynamite"};
        for (int i = 0; i < 2; i++) {
            if (objArr[i] == null) {
                throw new NullPointerException(AbstractC7209tN0.u(i, "at index "));
            }
        }
        h = new ZE1(2, objArr);
    }

    public C2534cX1(Context context, C0425Ff c0425Ff, C5814m32 c5814m32) {
        this.d = context;
        this.e = c0425Ff;
        this.f = c5814m32;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x00d1 A[LOOP:0: B:82:0x00cb->B:84:0x00d1, LOOP_END] */
    @Override // defpackage.LU1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList a(defpackage.E80 r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2534cX1.a(E80):java.util.ArrayList");
    }

    public final L32 b(LM lm, String str, String str2) {
        IInterface m32;
        Context context = this.d;
        IBinder iBinderB = MM.c(context, lm, str).b(str2);
        int i = N32.b;
        L32 l32 = null;
        if (iBinderB == null) {
            m32 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
            m32 = iInterfaceQueryLocalInterface instanceof O32 ? (O32) iInterfaceQueryLocalInterface : new M32(iBinderB, "com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator", 1);
        }
        BinderC2421bx0 binderC2421bx0 = new BinderC2421bx0(context);
        K32 k32 = new K32(this.e.a, false);
        M32 m322 = (M32) m32;
        Parcel parcelI = m322.I();
        NC1.a(parcelI, binderC2421bx0);
        parcelI.writeInt(1);
        k32.writeToParcel(parcelI, 0);
        Parcel parcelK = m322.K(1, parcelI);
        IBinder strongBinder = parcelK.readStrongBinder();
        if (strongBinder != null) {
            IInterface iInterfaceQueryLocalInterface2 = strongBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
            l32 = iInterfaceQueryLocalInterface2 instanceof L32 ? (L32) iInterfaceQueryLocalInterface2 : new L32(strongBinder, "com.google.mlkit.vision.barcode.aidls.IBarcodeScanner", 1);
        }
        parcelK.recycle();
        return l32;
    }

    @Override // defpackage.LU1
    public final void zzb() {
        L32 l32 = this.g;
        if (l32 != null) {
            try {
                l32.M(2, l32.I());
            } catch (RemoteException unused) {
            }
            this.g = null;
            this.a = false;
        }
    }

    @Override // defpackage.LU1
    public final boolean zzc() throws Throwable {
        boolean zAreModulesAvailable;
        if (this.g != null) {
            return this.b;
        }
        Context context = this.d;
        boolean z = MM.a(context, ModuleDescriptor.MODULE_ID) > 0;
        C5814m32 c5814m32 = this.f;
        if (z) {
            this.b = true;
            try {
                this.g = b(MM.c, ModuleDescriptor.MODULE_ID, "com.google.mlkit.vision.barcode.bundled.internal.ThickBarcodeScannerCreator");
            } catch (JM e) {
                throw new C3281cs0("Failed to load the bundled barcode module.", e);
            } catch (RemoteException e2) {
                throw new C3281cs0("Failed to create thick barcode scanner.", e2);
            }
        } else {
            this.b = false;
            Feature[] featureArr = AbstractC0171By0.a;
            int apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(context);
            ZE1 ze1 = h;
            if (apkVersion >= 221500000) {
                try {
                    Task taskAreModulesAvailable = ModuleInstall.getClient(context).areModulesAvailable(new C4364iX1(AbstractC0171By0.b(AbstractC0171By0.d, ze1), 1));
                    C4122hG1 c4122hG1 = new C4122hG1(4);
                    C3892g32 c3892g32 = (C3892g32) taskAreModulesAvailable;
                    c3892g32.getClass();
                    c3892g32.d(Y81.a, c4122hG1);
                    zAreModulesAvailable = ((ModuleAvailabilityResponse) AbstractC3782fU1.a(c3892g32)).areModulesAvailable();
                } catch (JM | InterruptedException | ExecutionException unused) {
                    zAreModulesAvailable = false;
                }
            } else {
                CD1 cd1ListIterator = ze1.listIterator(0);
                while (cd1ListIterator.hasNext()) {
                    MM.c(context, MM.b, (String) cd1ListIterator.next());
                }
                zAreModulesAvailable = true;
            }
            if (!zAreModulesAvailable) {
                if (!this.c) {
                    Object[] objArr = {"barcode", "tflite_dynamite"};
                    for (int i = 0; i < 2; i++) {
                        if (objArr[i] == null) {
                            throw new NullPointerException(AbstractC7209tN0.u(i, "at index "));
                        }
                    }
                    AbstractC0171By0.a(context, new ZE1(2, objArr));
                    this.c = true;
                }
                IA1.b(c5814m32, EnumC6184o02.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new C3281cs0("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            try {
                this.g = b(MM.b, "com.google.android.gms.vision.barcode", "com.google.android.gms.vision.barcode.mlkit.BarcodeScannerCreator");
            } catch (JM | RemoteException e3) {
                IA1.b(c5814m32, EnumC6184o02.OPTIONAL_MODULE_INIT_ERROR);
                throw new C3281cs0("Failed to create thin barcode scanner.", e3);
            }
        }
        IA1.b(c5814m32, EnumC6184o02.NO_ERROR);
        return this.b;
    }
}
