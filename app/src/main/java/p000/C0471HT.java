package p000;

import android.content.Context;
import android.os.Trace;
import androidx.camera.lifecycle.C1708b;
import androidx.camera.lifecycle.LifecycleCamera;
import com.yandex.metrica.impl.p022ob.C3349j;
import com.yandex.metrica.impl.p022ob.C3375k;
import com.yandex.metrica.impl.p022ob.C3505p;
import com.yandex.metrica.impl.p022ob.InterfaceC3531q;
import com.yandex.metrica.impl.p022ob.InterfaceC3557r;
import com.yandex.metrica.impl.p022ob.InterfaceC3583s;
import com.yandex.metrica.impl.p022ob.InterfaceC3609t;
import com.yandex.metrica.impl.p022ob.InterfaceC3661v;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: HT */
/* loaded from: classes.dex */
public final class C0471HT implements InterfaceC0240Do, InterfaceC3557r, InterfaceC3531q {

    /* renamed from: a */
    public Object f4309a;

    /* renamed from: b */
    public Object f4310b;

    /* renamed from: c */
    public Object f4311c;

    /* renamed from: d */
    public Object f4312d;

    /* renamed from: e */
    public Object f4313e;

    /* renamed from: f */
    public Object f4314f;

    /* renamed from: g */
    public Object f4315g;

    public C0471HT(Context context) {
        String string;
        String str = ((C4254id) C11370v32.f44127f.m25318z(context)).f29372a;
        this.f4309a = str;
        File filesDir = context.getFilesDir();
        this.f4310b = filesDir;
        if (str.isEmpty()) {
            string = ".com.google.firebase.crashlytics.files.v1";
        } else {
            StringBuilder sb = new StringBuilder(".crashlytics.v3");
            sb.append(File.separator);
            sb.append(str.length() > 40 ? AbstractC1378Vu.m8630o(str) : str.replaceAll("[^a-zA-Z0-9.]", "_"));
            string = sb.toString();
        }
        File file = new File(filesDir, string);
        m3437k(file);
        this.f4311c = file;
        File file2 = new File(file, "open-sessions");
        m3437k(file2);
        this.f4312d = file2;
        File file3 = new File(file, "reports");
        m3437k(file3);
        this.f4313e = file3;
        File file4 = new File(file, "priority-reports");
        m3437k(file4);
        this.f4314f = file4;
        File file5 = new File(file, "native-reports");
        m3437k(file5);
        this.f4315g = file5;
    }

    /* renamed from: k */
    public static synchronized void m3437k(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return;
                }
                file.toString();
                file.delete();
            }
            if (!file.mkdirs()) {
                file.toString();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: l */
    public static boolean m3438l(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                m3438l(file2);
            }
        }
        return file.delete();
    }

    /* renamed from: m */
    public static List m3439m(Object[] objArr) {
        return objArr == null ? Collections.emptyList() : Arrays.asList(objArr);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3557r
    /* renamed from: a */
    public synchronized void mo3441a(C3505p c3505p) {
        this.f4315g = c3505p;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3557r
    /* renamed from: b */
    public void mo3442b() {
        C3505p c3505p = (C3505p) this.f4315g;
        if (c3505p != null) {
            ((Executor) this.f4311c).execute(new C9680hs1(this, c3505p));
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3531q
    /* renamed from: c */
    public Executor mo3443c() {
        return (Executor) this.f4311c;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3531q
    /* renamed from: d */
    public InterfaceC3609t mo3444d() {
        return (InterfaceC3609t) this.f4314f;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3531q
    /* renamed from: e */
    public InterfaceC3583s mo3445e() {
        return (C3349j) this.f4312d;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3531q
    /* renamed from: f */
    public InterfaceC3661v mo3447f() {
        return (C3375k) this.f4313e;
    }

    @Override // p000.InterfaceC0240Do
    /* renamed from: g */
    public ArrayList mo1118g() {
        Trace.beginSection(OY1.m6088f("CX:getAvailableCameraInfos"));
        try {
            ArrayList arrayList = new ArrayList();
            C7162xp c7162xp = (C7162xp) this.f4313e;
            O90.m5965c(c7162xp);
            Iterator it = c7162xp.f45802a.m25144x().iterator();
            while (it.hasNext()) {
                InterfaceC6766ro interfaceC6766roMo1328b = ((InterfaceC6972uo) it.next()).mo1328b();
                O90.m5967e(interfaceC6766roMo1328b, "camera.cameraInfo");
                arrayList.add(interfaceC6766roMo1328b);
            }
            return arrayList;
        } finally {
            Trace.endSection();
        }
    }

    /* renamed from: h */
    public KS0 m3448h(C0555Io c0555Io) {
        Object ks0;
        O90.m5968f(c0555Io, "cameraSelector");
        Trace.beginSection(OY1.m6088f("CX:getCameraInfo"));
        try {
            C7162xp c7162xp = (C7162xp) this.f4313e;
            O90.m5965c(c7162xp);
            InterfaceC6766ro interfaceC6766roMo1341o = c0555Io.m4006c(c7162xp.f45802a.m25144x()).mo1341o();
            O90.m5967e(interfaceC6766roMo1341o, "cameraSelector.select(ca…meras).cameraInfoInternal");
            InterfaceC0491Hn interfaceC0491HnM3435c = m3435c(this, c0555Io, interfaceC6766roMo1341o);
            C0165Cc c0165Cc = new C0165Cc(interfaceC6766roMo1341o.mo2393e(), interfaceC0491HnM3435c.mo3594j0());
            synchronized (this.f4309a) {
                ks0 = ((HashMap) this.f4315g).get(c0165Cc);
                if (ks0 == null) {
                    ks0 = new KS0(interfaceC6766roMo1341o, interfaceC0491HnM3435c);
                    ((HashMap) this.f4315g).put(c0165Cc, ks0);
                }
            }
            return (KS0) ks0;
        } finally {
            Trace.endSection();
        }
    }

    /* renamed from: i */
    public File m3449i(String str) {
        File file = new File((File) this.f4312d, str);
        file.mkdirs();
        File file2 = new File(file, "native");
        file2.mkdirs();
        return file2;
    }

    /* renamed from: j */
    public File m3450j(String str, String str2) {
        File file = new File((File) this.f4312d, str);
        file.mkdirs();
        return new File(file, str2);
    }

    /* renamed from: c */
    public static final InterfaceC0491Hn m3435c(C0471HT c0471ht, C0555Io c0555Io, InterfaceC6766ro interfaceC6766ro) {
        c0471ht.getClass();
        Iterator it = c0555Io.f5156a.iterator();
        InterfaceC0491Hn interfaceC0491Hn = null;
        while (it.hasNext()) {
            Object next = it.next();
            O90.m5967e(next, "cameraSelector.cameraFilterSet");
            InterfaceC6575oo interfaceC6575oo = (InterfaceC6575oo) next;
            if (!O90.m5963a(interfaceC6575oo.getIdentifier(), InterfaceC6575oo.f39271a)) {
                InterfaceC0617Jn interfaceC0617JnM25617a = AbstractC7075wR.m25617a(interfaceC6575oo.getIdentifier());
                Context context = (Context) c0471ht.f4314f;
                O90.m5965c(context);
                InterfaceC0491Hn interfaceC0491HnMo4003a = interfaceC0617JnM25617a.mo4003a(interfaceC6766ro, context);
                if (interfaceC0491HnMo4003a == null) {
                    continue;
                } else {
                    if (interfaceC0491Hn != null) {
                        throw new IllegalArgumentException("Cannot apply multiple extended camera configs at the same time.");
                    }
                    interfaceC0491Hn = interfaceC0491HnMo4003a;
                }
            }
        }
        return interfaceC0491Hn == null ? AbstractC0680Kn.f6285a : interfaceC0491Hn;
    }

    /* renamed from: d */
    public static final void m3436d(C0471HT c0471ht, int i) {
        C7162xp c7162xp = (C7162xp) c0471ht.f4313e;
        if (c7162xp == null) {
            return;
        }
        C8875bc1 c8875bc1 = c7162xp.m25942b().f40378b;
        if (i != c8875bc1.f17088a) {
            Iterator it = ((ArrayList) c8875bc1.f17089b).iterator();
            while (it.hasNext()) {
                C1246To c1246To = (C1246To) it.next();
                int i2 = c8875bc1.f17088a;
                synchronized (c1246To.f11518b) {
                    boolean z = true;
                    c1246To.f11519c = i == 2 ? 2 : 1;
                    boolean z2 = i2 != 2 && i == 2;
                    if (i2 != 2 || i == 2) {
                        z = false;
                    }
                    if (z2 || z) {
                        c1246To.m7774b();
                    }
                }
            }
        }
        if (c8875bc1.f17088a == 2 && i != 2) {
            ((ArrayList) c8875bc1.f17091d).clear();
        }
        c8875bc1.f17088a = i;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3531q
    /* renamed from: a */
    public Executor mo3440a() {
        return (Executor) this.f4310b;
    }

    /* renamed from: e */
    public void m3446e(String str) {
        File file = new File((File) this.f4310b, str);
        if (file.exists() && m3438l(file)) {
            file.getPath();
        }
    }

    /* renamed from: b */
    public static final LifecycleCamera m3434b(C0471HT c0471ht, C0743Lo c0743Lo, C0555Io c0555Io, AbstractC9402fh1... abstractC9402fh1Arr) {
        LifecycleCamera lifecycleCameraM9935b;
        Trace.beginSection(OY1.m6088f("CX:bindToLifecycle-internal"));
        try {
            DV1.m1716a();
            C7162xp c7162xp = (C7162xp) c0471ht.f4313e;
            O90.m5965c(c7162xp);
            InterfaceC6972uo interfaceC6972uoM4006c = c0555Io.m4006c(c7162xp.f45802a.m25144x());
            O90.m5967e(interfaceC6972uoM4006c, "primaryCameraSelector.se…cameraRepository.cameras)");
            interfaceC6972uoM4006c.mo1340n(true);
            KS0 ks0M3448h = c0471ht.m3448h(c0555Io);
            C1708b c1708b = (C1708b) c0471ht.f4312d;
            C0165Cc c0165CcM9362v = C1561Yo.m9362v(ks0M3448h, null);
            synchronized (c1708b.f16036a) {
                lifecycleCameraM9935b = (LifecycleCamera) c1708b.f16037b.get(new C1298Ud(c0743Lo, c0165CcM9362v));
            }
            Collection collectionM9937d = ((C1708b) c0471ht.f4312d).m9937d();
            Iterator it = AbstractC0576J8.m4186m(abstractC9402fh1Arr).iterator();
            while (it.hasNext()) {
                AbstractC9402fh1 abstractC9402fh1 = (AbstractC9402fh1) it.next();
                for (Object obj : collectionM9937d) {
                    O90.m5967e(obj, "lifecycleCameras");
                    LifecycleCamera lifecycleCamera = (LifecycleCamera) obj;
                    if (lifecycleCamera.m9929q(abstractC9402fh1) && !lifecycleCamera.equals(lifecycleCameraM9935b)) {
                        throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", Arrays.copyOf(new Object[]{abstractC9402fh1}, 1)));
                    }
                }
            }
            if (lifecycleCameraM9935b == null) {
                C1708b c1708b2 = (C1708b) c0471ht.f4312d;
                C7162xp c7162xp2 = (C7162xp) c0471ht.f4313e;
                O90.m5965c(c7162xp2);
                C8875bc1 c8875bc1 = c7162xp2.m25942b().f40378b;
                C7162xp c7162xp3 = (C7162xp) c0471ht.f4313e;
                O90.m5965c(c7162xp3);
                C9108dO1 c9108dO1 = c7162xp3.f45809h;
                if (c9108dO1 != null) {
                    C7162xp c7162xp4 = (C7162xp) c0471ht.f4313e;
                    O90.m5965c(c7162xp4);
                    C6322kn c6322kn = c7162xp4.f45810i;
                    if (c6322kn != null) {
                        lifecycleCameraM9935b = c1708b2.m9935b(c0743Lo, new C1561Yo(interfaceC6972uoM4006c, null, ks0M3448h, null, c8875bc1, c9108dO1, c6322kn));
                    } else {
                        throw new IllegalStateException("CameraX not initialized yet.");
                    }
                } else {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
            }
            if (abstractC9402fh1Arr.length != 0) {
                C1708b c1708b3 = (C1708b) c0471ht.f4312d;
                List listM26275f = AbstractC7230yu.m26275f(Arrays.copyOf(abstractC9402fh1Arr, abstractC9402fh1Arr.length));
                C7162xp c7162xp5 = (C7162xp) c0471ht.f4313e;
                O90.m5965c(c7162xp5);
                c1708b3.m9934a(lifecycleCameraM9935b, listM26275f, c7162xp5.m25942b().f40378b);
            }
            return lifecycleCameraM9935b;
        } finally {
            Trace.endSection();
        }
    }
}
