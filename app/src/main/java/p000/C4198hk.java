package p000;

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
public final class C4198hk implements InterfaceC6446ml, LU1 {

    /* renamed from: f */
    public static final C1164SV f28552f = new C1164SV();

    /* renamed from: a */
    public boolean f28553a;

    /* renamed from: b */
    public final Object f28554b;

    /* renamed from: c */
    public Object f28555c;

    /* renamed from: d */
    public Object f28556d;

    /* renamed from: e */
    public Object f28557e;

    public C4198hk(Context context, C0357Ff c0357Ff, C10218m32 c10218m32) {
        C7675Gy1 c7675Gy1 = new C7675Gy1();
        this.f28555c = c7675Gy1;
        this.f28554b = context;
        c7675Gy1.f3972a = c0357Ff.f3376a;
        this.f28556d = c10218m32;
    }

    /* renamed from: k */
    public static int m18852k(C6383ll c6383ll, int i) {
        int iHashCode = c6383ll.f37279b.hashCode() + (c6383ll.f37278a * 31);
        if (i >= 2) {
            return (iHashCode * 31) + c6383ll.f37282e.hashCode();
        }
        long jM8582a = AbstractC1374Vq.m8582a(c6383ll.f37282e);
        return (iHashCode * 31) + ((int) (jM8582a ^ (jM8582a >>> 32)));
    }

    /* renamed from: p */
    public static C6383ll m18853p(int i, DataInputStream dataInputStream) throws IOException {
        C1525YE c1525yeM6438g;
        int i2 = dataInputStream.readInt();
        String utf = dataInputStream.readUTF();
        if (i < 2) {
            long j = dataInputStream.readLong();
            C9108dO1 c9108dO1 = new C9108dO1(9);
            c9108dO1.m17571o(Long.valueOf(j), "exo_len");
            c1525yeM6438g = C1525YE.f14204c.m9241a(c9108dO1);
        } else {
            c1525yeM6438g = C8128Pr0.m6438g(dataInputStream);
        }
        return new C6383ll(i2, utf, c1525yeM6438g);
    }

    @Override // p000.LU1
    /* renamed from: a */
    public ArrayList mo5008a(E80 e80) throws C9039cs0 {
        Y12[] y12ArrM8207O;
        if (((C8403Uy1) this.f28557e) == null) {
            zzc();
        }
        C8403Uy1 c8403Uy1 = (C8403Uy1) this.f28557e;
        if (c8403Uy1 == null) {
            throw new C9039cs0("Error initializing the legacy barcode scanner.", 14);
        }
        C8403Uy1 c8403Uy12 = (C8403Uy1) Preconditions.checkNotNull(c8403Uy1);
        C11613wz1 c11613wz1 = new C11613wz1(e80.f2505c, e80.f2506d, 0L, 0, AbstractC11501w51.m25561b(e80.f2507e));
        try {
            int i = e80.f2508f;
            if (i == -1) {
                BinderC8916bx0 binderC8916bx0 = new BinderC8916bx0(e80.f2503a);
                Parcel parcelM23900I = c8403Uy12.m23900I();
                NC1.m5582a(parcelM23900I, binderC8916bx0);
                parcelM23900I.writeInt(1);
                c11613wz1.writeToParcel(parcelM23900I, 0);
                Parcel parcelM23902K = c8403Uy12.m23902K(2, parcelM23900I);
                Y12[] y12Arr = (Y12[]) parcelM23902K.createTypedArray(Y12.CREATOR);
                parcelM23902K.recycle();
                y12ArrM8207O = y12Arr;
            } else if (i == 17) {
                y12ArrM8207O = c8403Uy12.m8207O(new BinderC8916bx0(null), c11613wz1);
            } else if (i == 35) {
                Image.Plane[] planeArr = (Image.Plane[]) Preconditions.checkNotNull(e80.m2055b());
                c11613wz1.f45241a = planeArr[0].getRowStride();
                y12ArrM8207O = c8403Uy12.m8207O(new BinderC8916bx0(planeArr[0].getBuffer()), c11613wz1);
            } else {
                if (i != 842094169) {
                    throw new C9039cs0("Unsupported image format: " + e80.f2508f, 3);
                }
                y12ArrM8207O = c8403Uy12.m8207O(new BinderC8916bx0(U12.m7864a(e80)), c11613wz1);
            }
            ArrayList arrayList = new ArrayList();
            for (Y12 y12 : y12ArrM8207O) {
                arrayList.add(new C0231Df(new YV1(y12, 1)));
            }
            return arrayList;
        } catch (RemoteException e) {
            throw new C9039cs0("Failed to detect with legacy barcode detector", e);
        }
    }

    @Override // p000.InterfaceC6446ml
    /* renamed from: b */
    public void mo18854b(HashMap map) throws Throwable {
        ES1 es1 = (ES1) this.f28556d;
        DataOutputStream dataOutputStream = null;
        try {
            C0765M9 c0765m9M2288K = es1.m2288K();
            C8984cT0 c8984cT0 = (C8984cT0) this.f28557e;
            if (c8984cT0 == null) {
                this.f28557e = new C8984cT0(c0765m9M2288K);
            } else {
                c8984cT0.m10703a(c0765m9M2288K);
            }
            DataOutputStream dataOutputStream2 = new DataOutputStream((C8984cT0) this.f28557e);
            try {
                dataOutputStream2.writeInt(2);
                dataOutputStream2.writeInt(0);
                dataOutputStream2.writeInt(map.size());
                int iM18852k = 0;
                for (C6383ll c6383ll : map.values()) {
                    dataOutputStream2.writeInt(c6383ll.f37278a);
                    dataOutputStream2.writeUTF(c6383ll.f37279b);
                    C8128Pr0.m6439i(c6383ll.f37282e, dataOutputStream2);
                    iM18852k += m18852k(c6383ll, 2);
                }
                dataOutputStream2.writeInt(iM18852k);
                dataOutputStream2.close();
                ((File) es1.f2709c).delete();
                int i = AbstractC7485Dh1.f2166a;
                this.f28553a = false;
            } catch (Throwable th) {
                th = th;
                dataOutputStream = dataOutputStream2;
                AbstractC7485Dh1.m1823h(dataOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // p000.InterfaceC6446ml
    /* renamed from: c */
    public void mo18855c(C6383ll c6383ll, boolean z) {
        this.f28553a = true;
    }

    @Override // p000.InterfaceC6446ml
    /* renamed from: d */
    public void mo18856d(C6383ll c6383ll) {
        this.f28553a = true;
    }

    @Override // p000.InterfaceC6446ml
    public void delete() {
        ES1 es1 = (ES1) this.f28556d;
        ((File) es1.f2708b).delete();
        ((File) es1.f2709c).delete();
    }

    @Override // p000.InterfaceC6446ml
    /* renamed from: e */
    public boolean mo18857e() {
        ES1 es1 = (ES1) this.f28556d;
        return ((File) es1.f2708b).exists() || ((File) es1.f2709c).exists();
    }

    @Override // p000.InterfaceC6446ml
    /* renamed from: f */
    public void mo18858f(HashMap map) throws Throwable {
        if (this.f28553a) {
            mo18854b(map);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0093 A[Catch: all -> 0x007c, IOException -> 0x007f, TRY_LEAVE, TryCatch #4 {IOException -> 0x007f, all -> 0x007c, blocks: (B:76:0x003f, B:81:0x0049, B:88:0x005d, B:89:0x0067, B:90:0x0070, B:97:0x0084, B:98:0x0089, B:99:0x008a, B:101:0x0093, B:103:0x0099, B:104:0x00a8), top: B:126:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00b4  */
    @Override // p000.InterfaceC6446ml
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo18860h(java.util.HashMap r13, android.util.SparseArray r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4198hk.mo18860h(java.util.HashMap, android.util.SparseArray):void");
    }

    /* renamed from: i */
    public void m18861i() throws IOException {
        synchronized (((C1557Yk) this.f28557e)) {
            if (this.f28553a) {
                return;
            }
            this.f28553a = true;
            AbstractC7433Ch1.m1275d((Z11) this.f28555c);
            try {
                ((C1338VG) this.f28554b).m8340c();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: j */
    public IOException m18862j(boolean z, boolean z2, IOException iOException) {
        if (iOException != null) {
            m18869s(iOException);
        }
        DN0 dn0 = (DN0) this.f28554b;
        if (z2) {
            if (iOException != null) {
                O90.m5968f(dn0, "call");
            } else {
                O90.m5968f(dn0, "call");
            }
        }
        if (z) {
            if (iOException != null) {
                O90.m5968f(dn0, "call");
            } else {
                O90.m5968f(dn0, "call");
            }
        }
        return dn0.m1673k(this, z2, z, iOException);
    }

    /* renamed from: l */
    public synchronized void m18863l() {
        try {
            if (this.f28553a) {
                return;
            }
            Boolean boolM18867q = m18867q();
            this.f28556d = boolM18867q;
            if (boolM18867q == null) {
                C3994eV c3994eV = new InterfaceC0089BP() { // from class: eV
                    public /* synthetic */ C3994eV() {
                    }

                    @Override // p000.InterfaceC0089BP
                    /* renamed from: a */
                    public final void mo712a(C6487nP c6487nP) {
                        C4198hk c4198hk = this.f26724a;
                        if (c4198hk.m18864m()) {
                            LL0 ll0 = FirebaseMessaging.f18465l;
                            ((FirebaseMessaging) c4198hk.f28557e).m11315j();
                        }
                    }
                };
                this.f28555c = c3994eV;
                C6821sP c6821sP = (C6821sP) ((M51) this.f28554b);
                c6821sP.m24735c(c6821sP.f42420c, c3994eV);
            }
            this.f28553a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: m */
    public synchronized boolean m18864m() {
        Boolean bool;
        try {
            m18863l();
            bool = (Boolean) this.f28556d;
        } catch (Throwable th) {
            throw th;
        }
        return bool != null ? bool.booleanValue() : ((FirebaseMessaging) this.f28557e).f18468a.m5383j();
    }

    /* renamed from: n */
    public C1812bs m18865n() {
        DN0 dn0 = (DN0) this.f28554b;
        if (dn0.f1989j) {
            throw new IllegalStateException("Check failed.");
        }
        dn0.f1989j = true;
        dn0.f1984e.m25370j();
        FN0 fn0Mo9001g = ((InterfaceC1473XP) this.f28556d).mo9001g();
        fn0Mo9001g.getClass();
        Socket socket = fn0Mo9001g.f3176d;
        O90.m5965c(socket);
        C11917zN0 c11917zN0 = fn0Mo9001g.f3180h;
        O90.m5965c(c11917zN0);
        C11790yN0 c11790yN0 = fn0Mo9001g.f3181i;
        O90.m5965c(c11790yN0);
        socket.setSoTimeout(0);
        fn0Mo9001g.m2616l();
        return new C1812bs(c11917zN0, c11790yN0, this);
    }

    /* renamed from: o */
    public HN0 m18866o(HS0 hs0) throws IOException {
        InterfaceC1473XP interfaceC1473XP = (InterfaceC1473XP) this.f28556d;
        try {
            String strM4524b = hs0.f4300f.m4524b("Content-Type");
            if (strM4524b == null) {
                strM4524b = null;
            }
            long jMo8998d = interfaceC1473XP.mo8998d(hs0);
            return new HN0(strM4524b, jMo8998d, JI1.m4274b(new C1410WP(this, interfaceC1473XP.mo8995a(hs0), jMo8998d)), 0);
        } catch (IOException e) {
            O90.m5968f((DN0) this.f28554b, "call");
            m18869s(e);
            throw e;
        }
    }

    /* renamed from: q */
    public Boolean m18867q() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        C0786MU c0786mu = ((FirebaseMessaging) this.f28557e).f18468a;
        c0786mu.m5379a();
        Context context = c0786mu.f7174a;
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

    /* renamed from: r */
    public GS0 m18868r(boolean z) throws IOException {
        try {
            GS0 gs0Mo9000f = ((InterfaceC1473XP) this.f28556d).mo9000f(z);
            if (gs0Mo9000f != null) {
                gs0Mo9000f.f3753m = this;
            }
            return gs0Mo9000f;
        } catch (IOException e) {
            O90.m5968f((DN0) this.f28554b, "call");
            m18869s(e);
            throw e;
        }
    }

    /* renamed from: s */
    public void m18869s(IOException iOException) {
        this.f28553a = true;
        ((C1536YP) this.f28555c).m9293c(iOException);
        FN0 fn0Mo9001g = ((InterfaceC1473XP) this.f28556d).mo9001g();
        DN0 dn0 = (DN0) this.f28554b;
        synchronized (fn0Mo9001g) {
            try {
                O90.m5968f(dn0, "call");
                if (!(iOException instanceof C9710i51)) {
                    if (!(fn0Mo9001g.f3179g != null) || (iOException instanceof C6586ox)) {
                        fn0Mo9001g.f3182j = true;
                        if (fn0Mo9001g.f3185m == 0) {
                            FN0.m2605d(dn0.f1980a, fn0Mo9001g.f3174b, iOException);
                            fn0Mo9001g.f3184l++;
                        }
                    }
                } else if (((C9710i51) iOException).f28817a == 8) {
                    int i = fn0Mo9001g.f3186n + 1;
                    fn0Mo9001g.f3186n = i;
                    if (i > 1) {
                        fn0Mo9001g.f3182j = true;
                        fn0Mo9001g.f3184l++;
                    }
                } else if (((C9710i51) iOException).f28817a != 9 || !dn0.f1994o) {
                    fn0Mo9001g.f3182j = true;
                    fn0Mo9001g.f3184l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.LU1
    public void zzb() {
        C8403Uy1 c8403Uy1 = (C8403Uy1) this.f28557e;
        if (c8403Uy1 != null) {
            try {
                c8403Uy1.m23904M(3, c8403Uy1.m23900I());
            } catch (RemoteException unused) {
            }
            this.f28557e = null;
        }
    }

    @Override // p000.LU1
    public boolean zzc() throws C9039cs0 {
        InterfaceC10718pz1 c8793az1;
        Context context = (Context) this.f28554b;
        if (((C8403Uy1) this.f28557e) == null) {
            try {
                IBinder iBinderM5348b = C0778MM.m5342c(context, C0778MM.f7100b, "com.google.android.gms.vision.dynamite").m5348b("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator");
                int i = AbstractBinderC9950jz1.f35470b;
                if (iBinderM5348b == null) {
                    c8793az1 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinderM5348b.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
                    c8793az1 = iInterfaceQueryLocalInterface instanceof InterfaceC10718pz1 ? (InterfaceC10718pz1) iInterfaceQueryLocalInterface : new C8793az1(iBinderM5348b, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator", 1);
                }
                C8403Uy1 c8403Uy1M10398O = ((C8793az1) c8793az1).m10398O(new BinderC8916bx0(context), (C7675Gy1) this.f28555c);
                this.f28557e = c8403Uy1M10398O;
                C10218m32 c10218m32 = (C10218m32) this.f28556d;
                if (c8403Uy1M10398O == null && !this.f28553a) {
                    Feature[] featureArr = AbstractC7414By0.f1103a;
                    C9820iy1 c9820iy1 = AbstractC11356uy1.f44058b;
                    Object[] objArr = {"barcode"};
                    K12.m4523d(1, objArr);
                    AbstractC7414By0.m931a(context, new C9822iz1(1, objArr));
                    this.f28553a = true;
                    IA1.m3778b(c10218m32, EnumC10465o02.OPTIONAL_MODULE_NOT_AVAILABLE);
                    throw new C9039cs0("Waiting for the barcode module to be downloaded. Please wait.", 14);
                }
                IA1.m3778b(c10218m32, EnumC10465o02.NO_ERROR);
            } catch (C0590JM e) {
                throw new C9039cs0("Failed to load deprecated vision dynamite module.", e);
            } catch (RemoteException e2) {
                throw new C9039cs0("Failed to create legacy barcode detector.", e2);
            }
        }
        return false;
    }

    public C4198hk(DN0 dn0, C1536YP c1536yp, InterfaceC1473XP interfaceC1473XP) {
        O90.m5968f(dn0, "call");
        O90.m5968f(c1536yp, "finder");
        this.f28554b = dn0;
        this.f28555c = c1536yp;
        this.f28556d = interfaceC1473XP;
        this.f28557e = interfaceC1473XP.mo9001g();
    }

    public C4198hk(InterfaceC1412WR interfaceC1412WR, C6686qX c6686qX, C7783Ja1 c7783Ja1, C7408Bv0 c7408Bv0, boolean z) {
        this.f28554b = interfaceC1412WR;
        this.f28555c = c6686qX;
        this.f28556d = c7783Ja1;
        this.f28557e = c7408Bv0;
        this.f28553a = z;
    }

    public C4198hk(C1557Yk c1557Yk, C1338VG c1338vg) {
        this.f28557e = c1557Yk;
        this.f28554b = c1338vg;
        Z11 z11M8347k = c1338vg.m8347k(1);
        this.f28555c = z11M8347k;
        this.f28556d = new C1494Xk(c1557Yk, this, z11M8347k);
    }

    public C4198hk(File file) {
        this.f28554b = null;
        this.f28555c = null;
        this.f28556d = new ES1(file);
    }

    public C4198hk(FirebaseMessaging firebaseMessaging, M51 m51) {
        this.f28557e = firebaseMessaging;
        this.f28554b = m51;
    }

    @Override // p000.InterfaceC6446ml
    /* renamed from: g */
    public void mo18859g(long j) {
    }
}
