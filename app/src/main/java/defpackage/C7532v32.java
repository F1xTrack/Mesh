package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* renamed from: v32 */
/* loaded from: classes.dex */
public final class C7532v32 implements InterfaceC1227Pm1, InterfaceC6307oe1, BI1, InterfaceC0279Di0, InterfaceC1408Rv, InterfaceC1490Sw0, InterfaceC3372dL, InterfaceC5314jS, InterfaceC6842rS0, AT, YR, InterfaceC4347iS, InterfaceC1839Xi1, InterfaceC1181Ox0, InterfaceC0940Lv, InterfaceC6053nJ1 {
    public static C7532v32 b;
    public static final C7532v32 c = new C7532v32(1);
    public static final String[] d = new String[0];
    public static final C7532v32 e = new C7532v32(3);
    public static final C7532v32 f = new C7532v32(4);
    public static final C7532v32 g = new C7532v32(5);
    public static final C7532v32 h = new C7532v32(6);
    public final /* synthetic */ int a;

    public /* synthetic */ C7532v32(int i) {
        this.a = i;
    }

    public static synchronized void B() {
        if (b == null) {
            b = new C7532v32(0);
        }
    }

    public static C4380id v(C7532v32 c7532v32, String str, int i, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        c7532v32.getClass();
        O90.f(str, "processName");
        C4189hd c4189hd = new C4189hd();
        c4189hd.a = str;
        c4189hd.b = i;
        byte b2 = (byte) (c4189hd.e | 1);
        c4189hd.c = i2;
        c4189hd.d = false;
        c4189hd.e = (byte) (((byte) (b2 | 2)) | 4);
        return c4189hd.a();
    }

    public static ArrayList y(Context context) {
        O90.f(context, "context");
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        if (runningAppProcesses == null) {
            runningAppProcesses = MN.a;
        }
        List listY = AbstractC8069xu.y(runningAppProcesses);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listY) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC8449zu.k(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) it.next();
            C4189hd c4189hd = new C4189hd();
            String str2 = runningAppProcessInfo.processName;
            if (str2 == null) {
                throw new NullPointerException("Null processName");
            }
            c4189hd.a = str2;
            c4189hd.b = runningAppProcessInfo.pid;
            byte b2 = (byte) (c4189hd.e | 1);
            c4189hd.c = runningAppProcessInfo.importance;
            c4189hd.e = (byte) (b2 | 2);
            c4189hd.d = O90.a(str2, str);
            c4189hd.e = (byte) (c4189hd.e | 4);
            arrayList2.add(c4189hd.a());
        }
        return arrayList2;
    }

    public VL0 A() {
        VL0 vl0 = VL0.d;
        if (vl0 == null) {
            synchronized (this) {
                vl0 = VL0.d;
                if (vl0 == null) {
                    vl0 = new VL0();
                    vl0.a = new ArrayList();
                    vl0.b = new ArrayList();
                    VL0.d = vl0;
                }
            }
        }
        return vl0;
    }

    @Override // defpackage.BI1
    public C8340zJ1 b(Class cls) {
        if (!QG1.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (C8340zJ1) QG1.e(cls.asSubclass(QG1.class)).m(3, null);
        } catch (Exception e2) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e2);
        }
    }

    @Override // defpackage.InterfaceC1490Sw0
    public Object c() {
        return new LinkedHashMap();
    }

    @Override // defpackage.InterfaceC5314jS
    public Object create() {
        return new ArrayList();
    }

    @Override // defpackage.BI1
    public boolean d(Class cls) {
        return QG1.class.isAssignableFrom(cls);
    }

    @Override // defpackage.AT
    public String f() {
        return null;
    }

    @Override // defpackage.InterfaceC0940Lv
    public Object g(C1241Pr0 c1241Pr0) {
        Set<PQ0> setZ = c1241Pr0.z(PQ0.class);
        QQ0 qq0 = new QQ0();
        qq0.a = new HashMap();
        for (PQ0 pq0 : setZ) {
            HashMap map = (HashMap) qq0.a;
            pq0.getClass();
            map.put(LB.class, pq0.a);
        }
        return qq0;
    }

    @Override // javax.inject.Provider
    public Object get() {
        C1538Tm0 c1538Tm0 = new C1538Tm0(23);
        HashMap map = new HashMap();
        EnumC7370uD0 enumC7370uD0 = EnumC7370uD0.a;
        Set setEmptySet = Collections.emptySet();
        if (setEmptySet == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(enumC7370uD0, new C8021xe(30000L, 86400000L, setEmptySet));
        EnumC7370uD0 enumC7370uD02 = EnumC7370uD0.c;
        Set setEmptySet2 = Collections.emptySet();
        if (setEmptySet2 == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(enumC7370uD02, new C8021xe(1000L, 86400000L, setEmptySet2));
        EnumC7370uD0 enumC7370uD03 = EnumC7370uD0.b;
        if (Collections.emptySet() == null) {
            throw new NullPointerException("Null flags");
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(AV0.b)));
        if (setUnmodifiableSet == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(enumC7370uD03, new C8021xe(86400000L, 86400000L, setUnmodifiableSet));
        if (map.keySet().size() < EnumC7370uD0.values().length) {
            throw new IllegalStateException("Not all priorities have been configured");
        }
        new HashMap();
        return new C7831we(c1538Tm0, map);
    }

    @Override // defpackage.InterfaceC1408Rv
    public int getId() {
        return 1;
    }

    @Override // defpackage.InterfaceC1227Pm1
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // defpackage.InterfaceC1408Rv
    public boolean h(ArrayList arrayList, long j) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC6708ql interfaceC6708ql = (InterfaceC6708ql) it.next();
            if (interfaceC6708ql != null && interfaceC6708ql.S(j)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.AT
    public byte[] i() {
        return null;
    }

    @Override // defpackage.InterfaceC0279Di0
    public void k(InterfaceC0747Ji0 interfaceC0747Ji0) {
        interfaceC0747Ji0.onStart();
    }

    @Override // defpackage.InterfaceC6307oe1
    public InterfaceC5925me1 l(C7406uP0 c7406uP0) {
        O90.f(c7406uP0, "javaTypeParameter");
        return null;
    }

    @Override // defpackage.InterfaceC2315bO
    public boolean n(Object obj, File file, C0795Jy0 c0795Jy0) throws Throwable {
        try {
            AbstractC7659vk.d(((C5613l10) ((C3500e10) ((InterfaceC5506kS0) obj).get()).a.b).a.d.asReadOnlyBuffer(), file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // defpackage.InterfaceC1839Xi1
    public void o(MediaMetadataRetriever mediaMetadataRetriever, Object obj) throws IllegalArgumentException {
        mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
    }

    @Override // defpackage.InterfaceC1227Pm1
    public String[] q() {
        return d;
    }

    @Override // defpackage.InterfaceC6842rS0
    public int r(C0795Jy0 c0795Jy0) {
        return 1;
    }

    @Override // defpackage.InterfaceC1227Pm1
    public WebViewProviderBoundaryInterface u(C4315iH0 c4315iH0) {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // defpackage.YR
    public InterfaceC1584Ub1 w(int i, int i2) {
        return new WJ();
    }

    public IA z(Context context) {
        Object next;
        String processName;
        O90.f(context, "context");
        int iMyPid = Process.myPid();
        Iterator it = y(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C4380id) ((IA) next)).b == iMyPid) {
                break;
            }
        }
        IA ia = (IA) next;
        if (ia != null) {
            return ia;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            processName = Process.myProcessName();
            O90.e(processName, "{\n      Process.myProcessName()\n    }");
        } else if (i < 28 || (processName = Application.getProcessName()) == null) {
            processName = "";
        }
        return v(this, processName, iMyPid, 0, 12);
    }

    @Override // defpackage.InterfaceC6053nJ1
    public Object zza() {
        switch (this.a) {
            case 27:
                PW1.b.get();
                Long l = (Long) UW1.K.a();
                l.getClass();
                return l;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                PW1.b.get();
                Long l2 = (Long) UW1.l0.a();
                l2.getClass();
                return l2;
            default:
                PW1.b.get();
                return Integer.valueOf((int) ((Long) UW1.o.a()).longValue());
        }
    }

    public C7532v32(C1339Qy c1339Qy) {
        this.a = 24;
    }

    @Override // defpackage.AT
    public void a() {
    }

    @Override // defpackage.AT
    public void j() {
    }

    @Override // defpackage.InterfaceC3372dL
    public void m() {
    }

    @Override // defpackage.YR
    public void p() {
    }

    @Override // defpackage.InterfaceC0279Di0
    public void e(InterfaceC0747Ji0 interfaceC0747Ji0) {
    }

    @Override // defpackage.InterfaceC1181Ox0
    public void onComplete(Throwable th) {
    }

    @Override // defpackage.YR
    public void x(CX0 cx0) {
    }

    @Override // defpackage.InterfaceC3372dL
    public void s(InterfaceC5935mi interfaceC5935mi, Bitmap bitmap) {
    }

    @Override // defpackage.AT
    public void t(long j, String str) {
    }
}
