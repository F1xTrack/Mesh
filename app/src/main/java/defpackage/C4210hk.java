package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.media.Image;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: hk */
/* loaded from: classes.dex */
public final class C4210hk implements InterfaceC5944ml, LU1 {
    public static final SV f = new SV();
    public boolean a;
    public final Object b;
    public Object c;
    public Object d;
    public Object e;

    public C4210hk(Context context, C0425Ff c0425Ff, C5814m32 c5814m32) {
        C0562Gy1 c0562Gy1 = new C0562Gy1();
        this.c = c0562Gy1;
        this.b = context;
        c0562Gy1.a = c0425Ff.a;
        this.d = c5814m32;
    }

    public static int k(C5753ll c5753ll, int i) {
        int iHashCode = c5753ll.b.hashCode() + (c5753ll.a * 31);
        if (i >= 2) {
            return (iHashCode * 31) + c5753ll.e.hashCode();
        }
        long jA = AbstractC1705Vq.a(c5753ll.e);
        return (iHashCode * 31) + ((int) (jA ^ (jA >>> 32)));
    }

    public static C5753ll p(int i, DataInputStream dataInputStream) throws IOException {
        YE yeG;
        int i2 = dataInputStream.readInt();
        String utf = dataInputStream.readUTF();
        if (i < 2) {
            long j = dataInputStream.readLong();
            C3383dO1 c3383dO1 = new C3383dO1(9);
            c3383dO1.o(Long.valueOf(j), "exo_len");
            yeG = YE.c.a(c3383dO1);
        } else {
            yeG = C1241Pr0.g(dataInputStream);
        }
        return new C5753ll(i2, utf, yeG);
    }

    @Override // defpackage.LU1
    public ArrayList a(E80 e80) throws C3281cs0 {
        Y12[] y12ArrO;
        if (((C1653Uy1) this.e) == null) {
            zzc();
        }
        C1653Uy1 c1653Uy1 = (C1653Uy1) this.e;
        if (c1653Uy1 == null) {
            throw new C3281cs0("Error initializing the legacy barcode scanner.", 14);
        }
        C1653Uy1 c1653Uy12 = (C1653Uy1) Preconditions.checkNotNull(c1653Uy1);
        C7896wz1 c7896wz1 = new C7896wz1(e80.c, e80.d, 0L, 0, AbstractC7728w51.b(e80.e));
        try {
            int i = e80.f;
            if (i == -1) {
                BinderC2421bx0 binderC2421bx0 = new BinderC2421bx0(e80.a);
                Parcel parcelI = c1653Uy12.I();
                NC1.a(parcelI, binderC2421bx0);
                parcelI.writeInt(1);
                c7896wz1.writeToParcel(parcelI, 0);
                Parcel parcelK = c1653Uy12.K(2, parcelI);
                Y12[] y12Arr = (Y12[]) parcelK.createTypedArray(Y12.CREATOR);
                parcelK.recycle();
                y12ArrO = y12Arr;
            } else if (i == 17) {
                y12ArrO = c1653Uy12.O(new BinderC2421bx0(null), c7896wz1);
            } else if (i == 35) {
                Image.Plane[] planeArr = (Image.Plane[]) Preconditions.checkNotNull(e80.b());
                c7896wz1.a = planeArr[0].getRowStride();
                y12ArrO = c1653Uy12.O(new BinderC2421bx0(planeArr[0].getBuffer()), c7896wz1);
            } else {
                if (i != 842094169) {
                    throw new C3281cs0("Unsupported image format: " + e80.f, 3);
                }
                y12ArrO = c1653Uy12.O(new BinderC2421bx0(U12.a(e80)), c7896wz1);
            }
            ArrayList arrayList = new ArrayList();
            for (Y12 y12 : y12ArrO) {
                arrayList.add(new C0269Df(new YV1(y12, 1)));
            }
            return arrayList;
        } catch (RemoteException e) {
            throw new C3281cs0("Failed to detect with legacy barcode detector", e);
        }
    }

    @Override // defpackage.InterfaceC5944ml
    public void b(HashMap map) throws Throwable {
        ES1 es1 = (ES1) this.d;
        DataOutputStream dataOutputStream = null;
        try {
            M9 m9K = es1.K();
            C2521cT0 c2521cT0 = (C2521cT0) this.e;
            if (c2521cT0 == null) {
                this.e = new C2521cT0(m9K);
            } else {
                c2521cT0.a(m9K);
            }
            DataOutputStream dataOutputStream2 = new DataOutputStream((C2521cT0) this.e);
            try {
                dataOutputStream2.writeInt(2);
                dataOutputStream2.writeInt(0);
                dataOutputStream2.writeInt(map.size());
                int iK = 0;
                for (C5753ll c5753ll : map.values()) {
                    dataOutputStream2.writeInt(c5753ll.a);
                    dataOutputStream2.writeUTF(c5753ll.b);
                    C1241Pr0.i(c5753ll.e, dataOutputStream2);
                    iK += k(c5753ll, 2);
                }
                dataOutputStream2.writeInt(iK);
                dataOutputStream2.close();
                ((File) es1.c).delete();
                int i = AbstractC0277Dh1.a;
                this.a = false;
            } catch (Throwable th) {
                th = th;
                dataOutputStream = dataOutputStream2;
                AbstractC0277Dh1.h(dataOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.InterfaceC5944ml
    public void c(C5753ll c5753ll, boolean z) {
        this.a = true;
    }

    @Override // defpackage.InterfaceC5944ml
    public void d(C5753ll c5753ll) {
        this.a = true;
    }

    @Override // defpackage.InterfaceC5944ml
    public void delete() {
        ES1 es1 = (ES1) this.d;
        ((File) es1.b).delete();
        ((File) es1.c).delete();
    }

    @Override // defpackage.InterfaceC5944ml
    public boolean e() {
        ES1 es1 = (ES1) this.d;
        return ((File) es1.b).exists() || ((File) es1.c).exists();
    }

    @Override // defpackage.InterfaceC5944ml
    public void f(HashMap map) throws Throwable {
        if (this.a) {
            b(map);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0093 A[Catch: all -> 0x007c, IOException -> 0x007f, TRY_LEAVE, TryCatch #4 {IOException -> 0x007f, all -> 0x007c, blocks: (B:76:0x003f, B:81:0x0049, B:88:0x005d, B:89:0x0067, B:90:0x0070, B:97:0x0084, B:98:0x0089, B:99:0x008a, B:101:0x0093, B:103:0x0099, B:104:0x00a8), top: B:126:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00b4  */
    @Override // defpackage.InterfaceC5944ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h(java.util.HashMap r13, android.util.SparseArray r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4210hk.h(java.util.HashMap, android.util.SparseArray):void");
    }

    public void i() throws IOException {
        synchronized (((C1921Yk) this.e)) {
            if (this.a) {
                return;
            }
            this.a = true;
            AbstractC0199Ch1.d((Z11) this.c);
            try {
                ((VG) this.b).c();
            } catch (IOException unused) {
            }
        }
    }

    public IOException j(boolean z, boolean z2, IOException iOException) {
        if (iOException != null) {
            s(iOException);
        }
        DN0 dn0 = (DN0) this.b;
        if (z2) {
            if (iOException != null) {
                O90.f(dn0, "call");
            } else {
                O90.f(dn0, "call");
            }
        }
        if (z) {
            if (iOException != null) {
                O90.f(dn0, "call");
            } else {
                O90.f(dn0, "call");
            }
        }
        return dn0.k(this, z2, z, iOException);
    }

    public synchronized void l() {
        try {
            if (this.a) {
                return;
            }
            Boolean boolQ = q();
            this.d = boolQ;
            if (boolQ == null) {
                C3592eV c3592eV = new BP() { // from class: eV
                    public /* synthetic */ C3592eV() {
                    }

                    @Override // defpackage.BP
                    public final void a(C6069nP c6069nP) {
                        C4210hk c4210hk = this.a;
                        if (c4210hk.m()) {
                            LL0 ll0 = FirebaseMessaging.l;
                            ((FirebaseMessaging) c4210hk.e).j();
                        }
                    }
                };
                this.c = c3592eV;
                C7023sP c7023sP = (C7023sP) ((M51) this.b);
                c7023sP.c(c7023sP.c, c3592eV);
            }
            this.a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean m() {
        Boolean bool;
        try {
            l();
            bool = (Boolean) this.d;
        } catch (Throwable th) {
            throw th;
        }
        return bool != null ? bool.booleanValue() : ((FirebaseMessaging) this.e).a.j();
    }

    public C2405bs n() {
        DN0 dn0 = (DN0) this.b;
        if (dn0.j) {
            throw new IllegalStateException("Check failed.");
        }
        dn0.j = true;
        dn0.e.j();
        FN0 fn0G = ((XP) this.d).g();
        fn0G.getClass();
        Socket socket = fn0G.d;
        O90.c(socket);
        C8351zN0 c8351zN0 = fn0G.h;
        O90.c(c8351zN0);
        C8161yN0 c8161yN0 = fn0G.i;
        O90.c(c8161yN0);
        socket.setSoTimeout(0);
        fn0G.l();
        return new C2405bs(c8351zN0, c8161yN0, this);
    }

    public HN0 o(HS0 hs0) throws IOException {
        XP xp = (XP) this.d;
        try {
            String strB = hs0.f.b("Content-Type");
            if (strB == null) {
                strB = null;
            }
            long jD = xp.d(hs0);
            return new HN0(strB, jD, JI1.b(new WP(this, xp.a(hs0), jD)), 0);
        } catch (IOException e) {
            O90.f((DN0) this.b, "call");
            s(e);
            throw e;
        }
    }

    public Boolean q() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        MU mu = ((FirebaseMessaging) this.e).a;
        mu.a();
        Context context = mu.a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public GS0 r(boolean z) throws IOException {
        try {
            GS0 gs0F = ((XP) this.d).f(z);
            if (gs0F != null) {
                gs0F.m = this;
            }
            return gs0F;
        } catch (IOException e) {
            O90.f((DN0) this.b, "call");
            s(e);
            throw e;
        }
    }

    public void s(IOException iOException) {
        this.a = true;
        ((YP) this.c).c(iOException);
        FN0 fn0G = ((XP) this.d).g();
        DN0 dn0 = (DN0) this.b;
        synchronized (fn0G) {
            try {
                O90.f(dn0, "call");
                if (!(iOException instanceof C4280i51)) {
                    if (!(fn0G.g != null) || (iOException instanceof C6362ox)) {
                        fn0G.j = true;
                        if (fn0G.m == 0) {
                            FN0.d(dn0.a, fn0G.b, iOException);
                            fn0G.l++;
                        }
                    }
                } else if (((C4280i51) iOException).a == 8) {
                    int i = fn0G.n + 1;
                    fn0G.n = i;
                    if (i > 1) {
                        fn0G.j = true;
                        fn0G.l++;
                    }
                } else if (((C4280i51) iOException).a != 9 || !dn0.o) {
                    fn0G.j = true;
                    fn0G.l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.LU1
    public void zzb() {
        C1653Uy1 c1653Uy1 = (C1653Uy1) this.e;
        if (c1653Uy1 != null) {
            try {
                c1653Uy1.M(3, c1653Uy1.I());
            } catch (RemoteException unused) {
            }
            this.e = null;
        }
    }

    @Override // defpackage.LU1
    public boolean zzc() throws C3281cs0 {
        InterfaceC6561pz1 c2237az1;
        Context context = (Context) this.b;
        if (((C1653Uy1) this.e) == null) {
            try {
                IBinder iBinderB = MM.c(context, MM.b, "com.google.android.gms.vision.dynamite").b("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator");
                int i = AbstractBinderC5415jz1.b;
                if (iBinderB == null) {
                    c2237az1 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
                    c2237az1 = iInterfaceQueryLocalInterface instanceof InterfaceC6561pz1 ? (InterfaceC6561pz1) iInterfaceQueryLocalInterface : new C2237az1(iBinderB, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator", 1);
                }
                C1653Uy1 c1653Uy1O = ((C2237az1) c2237az1).O(new BinderC2421bx0(context), (C0562Gy1) this.c);
                this.e = c1653Uy1O;
                C5814m32 c5814m32 = (C5814m32) this.d;
                if (c1653Uy1O == null && !this.a) {
                    Feature[] featureArr = AbstractC0171By0.a;
                    C5221iy1 c5221iy1 = AbstractC7512uy1.b;
                    Object[] objArr = {"barcode"};
                    K12.d(1, objArr);
                    AbstractC0171By0.a(context, new C5224iz1(1, objArr));
                    this.a = true;
                    IA1.b(c5814m32, EnumC6184o02.OPTIONAL_MODULE_NOT_AVAILABLE);
                    throw new C3281cs0("Waiting for the barcode module to be downloaded. Please wait.", 14);
                }
                IA1.b(c5814m32, EnumC6184o02.NO_ERROR);
            } catch (JM e) {
                throw new C3281cs0("Failed to load deprecated vision dynamite module.", e);
            } catch (RemoteException e2) {
                throw new C3281cs0("Failed to create legacy barcode detector.", e2);
            }
        }
        return false;
    }

    public C4210hk(DN0 dn0, YP yp, XP xp) {
        O90.f(dn0, "call");
        O90.f(yp, "finder");
        this.b = dn0;
        this.c = yp;
        this.d = xp;
        this.e = xp.g();
    }

    public C4210hk(WR wr, C6666qX c6666qX, C0724Ja1 c0724Ja1, C0162Bv0 c0162Bv0, boolean z) {
        this.b = wr;
        this.c = c6666qX;
        this.d = c0724Ja1;
        this.e = c0162Bv0;
        this.a = z;
    }

    public C4210hk(C1921Yk c1921Yk, VG vg) {
        this.e = c1921Yk;
        this.b = vg;
        Z11 z11K = vg.k(1);
        this.c = z11K;
        this.d = new C1843Xk(c1921Yk, this, z11K);
    }

    public C4210hk(File file) {
        this.b = null;
        this.c = null;
        this.d = new ES1(file);
    }

    public C4210hk(FirebaseMessaging firebaseMessaging, M51 m51) {
        this.e = firebaseMessaging;
        this.b = m51;
    }

    @Override // defpackage.InterfaceC5944ml
    public void g(long j) {
    }
}
