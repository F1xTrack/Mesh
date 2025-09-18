package p000;

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
public final class C8993cX1 implements LU1 {

    /* renamed from: h */
    public static final ZE1 f17589h;

    /* renamed from: a */
    public boolean f17590a;

    /* renamed from: b */
    public boolean f17591b;

    /* renamed from: c */
    public boolean f17592c;

    /* renamed from: d */
    public final Context f17593d;

    /* renamed from: e */
    public final C0357Ff f17594e;

    /* renamed from: f */
    public final C10218m32 f17595f;

    /* renamed from: g */
    public L32 f17596g;

    static {
        CD1 cd1 = KD1.f5947b;
        Object[] objArr = {"com.google.android.gms.vision.barcode", "com.google.android.gms.tflite_dynamite"};
        for (int i = 0; i < 2; i++) {
            if (objArr[i] == null) {
                throw new NullPointerException(AbstractC11153tN0.m24909u(i, "at index "));
            }
        }
        f17589h = new ZE1(2, objArr);
    }

    public C8993cX1(Context context, C0357Ff c0357Ff, C10218m32 c10218m32) {
        this.f17593d = context;
        this.f17594e = c0357Ff;
        this.f17595f = c10218m32;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x00d1 A[LOOP:0: B:82:0x00cb->B:84:0x00d1, LOOP_END] */
    @Override // p000.LU1
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList mo5008a(p000.E80 r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8993cX1.mo5008a(E80):java.util.ArrayList");
    }

    /* renamed from: b */
    public final L32 m10754b(InterfaceC0716LM interfaceC0716LM, String str, String str2) {
        IInterface m32;
        Context context = this.f17593d;
        IBinder iBinderM5348b = C0778MM.m5342c(context, interfaceC0716LM, str).m5348b(str2);
        int i = N32.f7483b;
        L32 l32 = null;
        if (iBinderM5348b == null) {
            m32 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinderM5348b.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
            m32 = iInterfaceQueryLocalInterface instanceof O32 ? (O32) iInterfaceQueryLocalInterface : new M32(iBinderM5348b, "com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator", 1);
        }
        BinderC8916bx0 binderC8916bx0 = new BinderC8916bx0(context);
        K32 k32 = new K32(this.f17594e.f3376a, false);
        M32 m322 = (M32) m32;
        Parcel parcelM23900I = m322.m23900I();
        NC1.m5582a(parcelM23900I, binderC8916bx0);
        parcelM23900I.writeInt(1);
        k32.writeToParcel(parcelM23900I, 0);
        Parcel parcelM23902K = m322.m23902K(1, parcelM23900I);
        IBinder strongBinder = parcelM23902K.readStrongBinder();
        if (strongBinder != null) {
            IInterface iInterfaceQueryLocalInterface2 = strongBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
            l32 = iInterfaceQueryLocalInterface2 instanceof L32 ? (L32) iInterfaceQueryLocalInterface2 : new L32(strongBinder, "com.google.mlkit.vision.barcode.aidls.IBarcodeScanner", 1);
        }
        parcelM23902K.recycle();
        return l32;
    }

    @Override // p000.LU1
    public final void zzb() {
        L32 l32 = this.f17596g;
        if (l32 != null) {
            try {
                l32.m23904M(2, l32.m23900I());
            } catch (RemoteException unused) {
            }
            this.f17596g = null;
            this.f17590a = false;
        }
    }

    @Override // p000.LU1
    public final boolean zzc() throws Throwable {
        boolean zAreModulesAvailable;
        if (this.f17596g != null) {
            return this.f17591b;
        }
        Context context = this.f17593d;
        boolean z = C0778MM.m5341a(context, ModuleDescriptor.MODULE_ID) > 0;
        C10218m32 c10218m32 = this.f17595f;
        if (z) {
            this.f17591b = true;
            try {
                this.f17596g = m10754b(C0778MM.f7101c, ModuleDescriptor.MODULE_ID, "com.google.mlkit.vision.barcode.bundled.internal.ThickBarcodeScannerCreator");
            } catch (C0590JM e) {
                throw new C9039cs0("Failed to load the bundled barcode module.", e);
            } catch (RemoteException e2) {
                throw new C9039cs0("Failed to create thick barcode scanner.", e2);
            }
        } else {
            this.f17591b = false;
            Feature[] featureArr = AbstractC7414By0.f1103a;
            int apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(context);
            ZE1 ze1 = f17589h;
            if (apkVersion >= 221500000) {
                try {
                    Task taskAreModulesAvailable = ModuleInstall.getClient(context).areModulesAvailable(new C9766iX1(AbstractC7414By0.m932b(AbstractC7414By0.f1106d, ze1), 1));
                    C9604hG1 c9604hG1 = new C9604hG1(4);
                    C9450g32 c9450g32 = (C9450g32) taskAreModulesAvailable;
                    c9450g32.getClass();
                    c9450g32.mo11137d(Y81.f14171a, c9604hG1);
                    zAreModulesAvailable = ((ModuleAvailabilityResponse) AbstractC9376fU1.m18240a(c9450g32)).areModulesAvailable();
                } catch (C0590JM | InterruptedException | ExecutionException unused) {
                    zAreModulesAvailable = false;
                }
            } else {
                CD1 cd1ListIterator = ze1.listIterator(0);
                while (cd1ListIterator.hasNext()) {
                    C0778MM.m5342c(context, C0778MM.f7100b, (String) cd1ListIterator.next());
                }
                zAreModulesAvailable = true;
            }
            if (!zAreModulesAvailable) {
                if (!this.f17592c) {
                    Object[] objArr = {"barcode", "tflite_dynamite"};
                    for (int i = 0; i < 2; i++) {
                        if (objArr[i] == null) {
                            throw new NullPointerException(AbstractC11153tN0.m24909u(i, "at index "));
                        }
                    }
                    AbstractC7414By0.m931a(context, new ZE1(2, objArr));
                    this.f17592c = true;
                }
                IA1.m3778b(c10218m32, EnumC10465o02.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new C9039cs0("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            try {
                this.f17596g = m10754b(C0778MM.f7100b, "com.google.android.gms.vision.barcode", "com.google.android.gms.vision.barcode.mlkit.BarcodeScannerCreator");
            } catch (C0590JM | RemoteException e3) {
                IA1.m3778b(c10218m32, EnumC10465o02.OPTIONAL_MODULE_INIT_ERROR);
                throw new C9039cs0("Failed to create thin barcode scanner.", e3);
            }
        }
        IA1.m3778b(c10218m32, EnumC10465o02.NO_ERROR);
        return this.f17591b;
    }
}
