package p000;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import com.huawei.hms.adapter.internal.AvailableCode;
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
public final class C11370v32 implements InterfaceC8119Pm1, InterfaceC10548oe1, BI1, InterfaceC7486Di0, InterfaceC1127Rv, InterfaceC8294Sw0, InterfaceC3922dL, InterfaceC6238jS, InterfaceC10907rS0, InterfaceC0030AT, InterfaceC1538YR, InterfaceC4243iS, InterfaceC8527Xi1, InterfaceC8088Ox0, InterfaceC0750Lv, InterfaceC10378nJ1 {

    /* renamed from: b */
    public static C11370v32 f44123b;

    /* renamed from: c */
    public static final C11370v32 f44124c = new C11370v32(1);

    /* renamed from: d */
    public static final String[] f44125d = new String[0];

    /* renamed from: e */
    public static final C11370v32 f44126e = new C11370v32(3);

    /* renamed from: f */
    public static final C11370v32 f44127f = new C11370v32(4);

    /* renamed from: g */
    public static final C11370v32 f44128g = new C11370v32(5);

    /* renamed from: h */
    public static final C11370v32 f44129h = new C11370v32(6);

    /* renamed from: a */
    public final /* synthetic */ int f44130a;

    public /* synthetic */ C11370v32(int i) {
        this.f44130a = i;
    }

    /* renamed from: B */
    public static synchronized void m25314B() {
        if (f44123b == null) {
            f44123b = new C11370v32(0);
        }
    }

    /* renamed from: v */
    public static C4254id m25315v(C11370v32 c11370v32, String str, int i, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        c11370v32.getClass();
        O90.m5968f(str, "processName");
        C4191hd c4191hd = new C4191hd();
        c4191hd.f28482a = str;
        c4191hd.f28483b = i;
        byte b = (byte) (c4191hd.f28486e | 1);
        c4191hd.f28484c = i2;
        c4191hd.f28485d = false;
        c4191hd.f28486e = (byte) (((byte) (b | 2)) | 4);
        return c4191hd.m18842a();
    }

    /* renamed from: y */
    public static ArrayList m25316y(Context context) {
        O90.m5968f(context, "context");
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        if (runningAppProcesses == null) {
            runningAppProcesses = C0779MN.f7117a;
        }
        List listM25997y = AbstractC7167xu.m25997y(runningAppProcesses);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM25997y) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC7293zu.m26586k(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) it.next();
            C4191hd c4191hd = new C4191hd();
            String str2 = runningAppProcessInfo.processName;
            if (str2 == null) {
                throw new NullPointerException("Null processName");
            }
            c4191hd.f28482a = str2;
            c4191hd.f28483b = runningAppProcessInfo.pid;
            byte b = (byte) (c4191hd.f28486e | 1);
            c4191hd.f28484c = runningAppProcessInfo.importance;
            c4191hd.f28486e = (byte) (b | 2);
            c4191hd.f28485d = O90.m5963a(str2, str);
            c4191hd.f28486e = (byte) (c4191hd.f28486e | 4);
            arrayList2.add(c4191hd.m18842a());
        }
        return arrayList2;
    }

    /* renamed from: A */
    public VL0 m25317A() {
        VL0 vl0 = VL0.f12524d;
        if (vl0 == null) {
            synchronized (this) {
                vl0 = VL0.f12524d;
                if (vl0 == null) {
                    vl0 = new VL0();
                    vl0.f12525a = new ArrayList();
                    vl0.f12526b = new ArrayList();
                    VL0.f12524d = vl0;
                }
            }
        }
        return vl0;
    }

    @Override // p000.BI1
    /* renamed from: b */
    public C11910zJ1 mo577b(Class cls) {
        if (!QG1.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (C11910zJ1) QG1.m6618e(cls.asSubclass(QG1.class)).mo180m(3, null);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }

    @Override // p000.InterfaceC8294Sw0
    /* renamed from: c */
    public Object mo386c() {
        return new LinkedHashMap();
    }

    @Override // p000.InterfaceC6238jS
    public Object create() {
        return new ArrayList();
    }

    @Override // p000.BI1
    /* renamed from: d */
    public boolean mo578d(Class cls) {
        return QG1.class.isAssignableFrom(cls);
    }

    @Override // p000.InterfaceC0030AT
    /* renamed from: f */
    public String mo142f() {
        return null;
    }

    @Override // p000.InterfaceC0750Lv
    /* renamed from: g */
    public Object mo390g(C8128Pr0 c8128Pr0) {
        Set<PQ0> setM6460z = c8128Pr0.m6460z(PQ0.class);
        QQ0 qq0 = new QQ0();
        qq0.f9619a = new HashMap();
        for (PQ0 pq0 : setM6460z) {
            HashMap map = (HashMap) qq0.f9619a;
            pq0.getClass();
            map.put(AbstractC0705LB.class, pq0.f9068a);
        }
        return qq0;
    }

    @Override // javax.inject.Provider
    public Object get() {
        C8326Tm0 c8326Tm0 = new C8326Tm0(23);
        HashMap map = new HashMap();
        EnumC11261uD0 enumC11261uD0 = EnumC11261uD0.f43594a;
        Set setEmptySet = Collections.emptySet();
        if (setEmptySet == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(enumC11261uD0, new C7151xe(30000L, 86400000L, setEmptySet));
        EnumC11261uD0 enumC11261uD02 = EnumC11261uD0.f43596c;
        Set setEmptySet2 = Collections.emptySet();
        if (setEmptySet2 == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(enumC11261uD02, new C7151xe(1000L, 86400000L, setEmptySet2));
        EnumC11261uD0 enumC11261uD03 = EnumC11261uD0.f43595b;
        if (Collections.emptySet() == null) {
            throw new NullPointerException("Null flags");
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(AV0.f213b)));
        if (setUnmodifiableSet == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(enumC11261uD03, new C7151xe(86400000L, 86400000L, setUnmodifiableSet));
        if (map.keySet().size() < EnumC11261uD0.values().length) {
            throw new IllegalStateException("Not all priorities have been configured");
        }
        new HashMap();
        return new C7088we(c8326Tm0, map);
    }

    @Override // p000.InterfaceC1127Rv
    public int getId() {
        return 1;
    }

    @Override // p000.InterfaceC8119Pm1
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // p000.InterfaceC1127Rv
    /* renamed from: h */
    public boolean mo7128h(ArrayList arrayList, long j) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC6700ql interfaceC6700ql = (InterfaceC6700ql) it.next();
            if (interfaceC6700ql != null && interfaceC6700ql.mo7464S(j)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC0030AT
    /* renamed from: i */
    public byte[] mo143i() {
        return null;
    }

    @Override // p000.InterfaceC7486Di0
    /* renamed from: k */
    public void mo1844k(InterfaceC7798Ji0 interfaceC7798Ji0) {
        interfaceC7798Ji0.onStart();
    }

    @Override // p000.InterfaceC10548oe1
    /* renamed from: l */
    public InterfaceC10292me1 mo10472l(C11285uP0 c11285uP0) {
        O90.m5968f(c11285uP0, "javaTypeParameter");
        return null;
    }

    @Override // p000.InterfaceC1782bO
    /* renamed from: n */
    public boolean mo397n(Object obj, File file, C7830Jy0 c7830Jy0) throws Throwable {
        try {
            AbstractC7031vk.m25481d(((C10082l10) ((C9186e10) ((InterfaceC10011kS0) obj).get()).f26481a.f17293b).f36805a.f38073d.asReadOnlyBuffer(), file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // p000.InterfaceC8527Xi1
    /* renamed from: o */
    public void mo5749o(MediaMetadataRetriever mediaMetadataRetriever, Object obj) throws IllegalArgumentException {
        mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
    }

    @Override // p000.InterfaceC8119Pm1
    /* renamed from: q */
    public String[] mo6426q() {
        return f44125d;
    }

    @Override // p000.InterfaceC10907rS0
    /* renamed from: r */
    public int mo401r(C7830Jy0 c7830Jy0) {
        return 1;
    }

    @Override // p000.InterfaceC8119Pm1
    /* renamed from: u */
    public WebViewProviderBoundaryInterface mo6427u(C9733iH0 c9733iH0) {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // p000.InterfaceC1538YR
    /* renamed from: w */
    public InterfaceC8357Ub1 mo2005w(int i, int i2) {
        return new C1404WJ();
    }

    /* renamed from: z */
    public AbstractC0515IA m25318z(Context context) {
        Object next;
        String processName;
        O90.m5968f(context, "context");
        int iMyPid = Process.myPid();
        Iterator it = m25316y(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C4254id) ((AbstractC0515IA) next)).f29373b == iMyPid) {
                break;
            }
        }
        AbstractC0515IA abstractC0515IA = (AbstractC0515IA) next;
        if (abstractC0515IA != null) {
            return abstractC0515IA;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            processName = Process.myProcessName();
            O90.m5967e(processName, "{\n      Process.myProcessName()\n    }");
        } else if (i < 28 || (processName = Application.getProcessName()) == null) {
            processName = "";
        }
        return m25315v(this, processName, iMyPid, 0, 12);
    }

    @Override // p000.InterfaceC10378nJ1
    public Object zza() {
        switch (this.f44130a) {
            case 27:
                PW1.f9104b.get();
                Long l = (Long) UW1.f11843K.m8754a();
                l.getClass();
                return l;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                PW1.f9104b.get();
                Long l2 = (Long) UW1.f11882l0.m8754a();
                l2.getClass();
                return l2;
            default:
                PW1.f9104b.get();
                return Integer.valueOf((int) ((Long) UW1.f11887o.m8754a()).longValue());
        }
    }

    public C11370v32(C1068Qy c1068Qy) {
        this.f44130a = 24;
    }

    @Override // p000.InterfaceC0030AT
    /* renamed from: a */
    public void mo141a() {
    }

    @Override // p000.InterfaceC0030AT
    /* renamed from: j */
    public void mo144j() {
    }

    @Override // p000.InterfaceC3922dL
    /* renamed from: m */
    public void mo5561m() {
    }

    @Override // p000.InterfaceC1538YR
    /* renamed from: p */
    public void mo2003p() {
    }

    @Override // p000.InterfaceC7486Di0
    /* renamed from: e */
    public void mo1843e(InterfaceC7798Ji0 interfaceC7798Ji0) {
    }

    @Override // p000.InterfaceC8088Ox0
    public void onComplete(Throwable th) {
    }

    @Override // p000.InterfaceC1538YR
    /* renamed from: x */
    public void mo2006x(CX0 cx0) {
    }

    @Override // p000.InterfaceC3922dL
    /* renamed from: s */
    public void mo5565s(InterfaceC6443mi interfaceC6443mi, Bitmap bitmap) {
    }

    @Override // p000.InterfaceC0030AT
    /* renamed from: t */
    public void mo145t(long j, String str) {
    }
}
