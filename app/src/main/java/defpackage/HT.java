package defpackage;

import android.content.Context;
import android.os.Trace;
import androidx.camera.lifecycle.LifecycleCamera;
import androidx.camera.lifecycle.b;
import com.yandex.metrica.impl.ob.C2838j;
import com.yandex.metrica.impl.ob.C2863k;
import com.yandex.metrica.impl.ob.C2988p;
import com.yandex.metrica.impl.ob.InterfaceC3013q;
import com.yandex.metrica.impl.ob.InterfaceC3062s;
import com.yandex.metrica.impl.ob.InterfaceC3087t;
import com.yandex.metrica.impl.ob.InterfaceC3137v;
import com.yandex.metrica.impl.ob.r;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class HT implements InterfaceC0296Do, r, InterfaceC3013q {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public HT(Context context) {
        String string;
        String str = ((C4380id) C7532v32.f.z(context)).a;
        this.a = str;
        File filesDir = context.getFilesDir();
        this.b = filesDir;
        if (str.isEmpty()) {
            string = ".com.google.firebase.crashlytics.files.v1";
        } else {
            StringBuilder sb = new StringBuilder(".crashlytics.v3");
            sb.append(File.separator);
            sb.append(str.length() > 40 ? AbstractC1717Vu.o(str) : str.replaceAll("[^a-zA-Z0-9.]", "_"));
            string = sb.toString();
        }
        File file = new File(filesDir, string);
        k(file);
        this.c = file;
        File file2 = new File(file, "open-sessions");
        k(file2);
        this.d = file2;
        File file3 = new File(file, "reports");
        k(file3);
        this.e = file3;
        File file4 = new File(file, "priority-reports");
        k(file4);
        this.f = file4;
        File file5 = new File(file, "native-reports");
        k(file5);
        this.g = file5;
    }

    public static synchronized void k(File file) {
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

    public static boolean l(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                l(file2);
            }
        }
        return file.delete();
    }

    public static List m(Object[] objArr) {
        return objArr == null ? Collections.emptyList() : Arrays.asList(objArr);
    }

    @Override // com.yandex.metrica.impl.ob.r
    public synchronized void a(C2988p c2988p) {
        this.g = c2988p;
    }

    @Override // com.yandex.metrica.impl.ob.r
    public void b() {
        C2988p c2988p = (C2988p) this.g;
        if (c2988p != null) {
            ((Executor) this.c).execute(new C4236hs1(this, c2988p));
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3013q
    public Executor c() {
        return (Executor) this.c;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3013q
    public InterfaceC3087t d() {
        return (InterfaceC3087t) this.f;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3013q
    public InterfaceC3062s e() {
        return (C2838j) this.d;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3013q
    public InterfaceC3137v f() {
        return (C2863k) this.e;
    }

    @Override // defpackage.InterfaceC0296Do
    public ArrayList g() {
        Trace.beginSection(OY1.f("CX:getAvailableCameraInfos"));
        try {
            ArrayList arrayList = new ArrayList();
            C8054xp c8054xp = (C8054xp) this.e;
            O90.c(c8054xp);
            Iterator it = c8054xp.a.x().iterator();
            while (it.hasNext()) {
                InterfaceC6907ro interfaceC6907roB = ((InterfaceC7480uo) it.next()).b();
                O90.e(interfaceC6907roB, "camera.cameraInfo");
                arrayList.add(interfaceC6907roB);
            }
            return arrayList;
        } finally {
            Trace.endSection();
        }
    }

    public KS0 h(C0686Io c0686Io) {
        Object ks0;
        O90.f(c0686Io, "cameraSelector");
        Trace.beginSection(OY1.f("CX:getCameraInfo"));
        try {
            C8054xp c8054xp = (C8054xp) this.e;
            O90.c(c8054xp);
            InterfaceC6907ro interfaceC6907roO = c0686Io.c(c8054xp.a.x()).o();
            O90.e(interfaceC6907roO, "cameraSelector.select(ca…meras).cameraInfoInternal");
            InterfaceC0605Hn interfaceC0605HnC = c(this, c0686Io, interfaceC6907roO);
            C0182Cc c0182Cc = new C0182Cc(interfaceC6907roO.e(), interfaceC0605HnC.j0());
            synchronized (this.a) {
                ks0 = ((HashMap) this.g).get(c0182Cc);
                if (ks0 == null) {
                    ks0 = new KS0(interfaceC6907roO, interfaceC0605HnC);
                    ((HashMap) this.g).put(c0182Cc, ks0);
                }
            }
            return (KS0) ks0;
        } finally {
            Trace.endSection();
        }
    }

    public File i(String str) {
        File file = new File((File) this.d, str);
        file.mkdirs();
        File file2 = new File(file, "native");
        file2.mkdirs();
        return file2;
    }

    public File j(String str, String str2) {
        File file = new File((File) this.d, str);
        file.mkdirs();
        return new File(file, str2);
    }

    public static final InterfaceC0605Hn c(HT ht, C0686Io c0686Io, InterfaceC6907ro interfaceC6907ro) {
        ht.getClass();
        Iterator it = c0686Io.a.iterator();
        InterfaceC0605Hn interfaceC0605Hn = null;
        while (it.hasNext()) {
            Object next = it.next();
            O90.e(next, "cameraSelector.cameraFilterSet");
            InterfaceC6335oo interfaceC6335oo = (InterfaceC6335oo) next;
            if (!O90.a(interfaceC6335oo.getIdentifier(), InterfaceC6335oo.a)) {
                InterfaceC0761Jn interfaceC0761JnA = AbstractC7792wR.a(interfaceC6335oo.getIdentifier());
                Context context = (Context) ht.f;
                O90.c(context);
                InterfaceC0605Hn interfaceC0605HnA = interfaceC0761JnA.a(interfaceC6907ro, context);
                if (interfaceC0605HnA == null) {
                    continue;
                } else {
                    if (interfaceC0605Hn != null) {
                        throw new IllegalArgumentException("Cannot apply multiple extended camera configs at the same time.");
                    }
                    interfaceC0605Hn = interfaceC0605HnA;
                }
            }
        }
        return interfaceC0605Hn == null ? AbstractC0839Kn.a : interfaceC0605Hn;
    }

    public static final void d(HT ht, int i) {
        C8054xp c8054xp = (C8054xp) ht.e;
        if (c8054xp == null) {
            return;
        }
        C2359bc1 c2359bc1 = c8054xp.b().b;
        if (i != c2359bc1.a) {
            Iterator it = ((ArrayList) c2359bc1.b).iterator();
            while (it.hasNext()) {
                C1543To c1543To = (C1543To) it.next();
                int i2 = c2359bc1.a;
                synchronized (c1543To.b) {
                    boolean z = true;
                    c1543To.c = i == 2 ? 2 : 1;
                    boolean z2 = i2 != 2 && i == 2;
                    if (i2 != 2 || i == 2) {
                        z = false;
                    }
                    if (z2 || z) {
                        c1543To.b();
                    }
                }
            }
        }
        if (c2359bc1.a == 2 && i != 2) {
            ((ArrayList) c2359bc1.d).clear();
        }
        c2359bc1.a = i;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3013q
    public Executor a() {
        return (Executor) this.b;
    }

    public void e(String str) {
        File file = new File((File) this.b, str);
        if (file.exists() && l(file)) {
            file.getPath();
        }
    }

    public static final LifecycleCamera b(HT ht, C0920Lo c0920Lo, C0686Io c0686Io, AbstractC3821fh1... abstractC3821fh1Arr) {
        LifecycleCamera lifecycleCameraB;
        Trace.beginSection(OY1.f("CX:bindToLifecycle-internal"));
        try {
            DV1.a();
            C8054xp c8054xp = (C8054xp) ht.e;
            O90.c(c8054xp);
            InterfaceC7480uo interfaceC7480uoC = c0686Io.c(c8054xp.a.x());
            O90.e(interfaceC7480uoC, "primaryCameraSelector.se…cameraRepository.cameras)");
            interfaceC7480uoC.n(true);
            KS0 ks0H = ht.h(c0686Io);
            b bVar = (b) ht.d;
            C0182Cc c0182CcV = C1933Yo.v(ks0H, null);
            synchronized (bVar.a) {
                lifecycleCameraB = (LifecycleCamera) bVar.b.get(new C1588Ud(c0920Lo, c0182CcV));
            }
            Collection collectionD = ((b) ht.d).d();
            Iterator it = J8.m(abstractC3821fh1Arr).iterator();
            while (it.hasNext()) {
                AbstractC3821fh1 abstractC3821fh1 = (AbstractC3821fh1) it.next();
                for (Object obj : collectionD) {
                    O90.e(obj, "lifecycleCameras");
                    LifecycleCamera lifecycleCamera = (LifecycleCamera) obj;
                    if (lifecycleCamera.q(abstractC3821fh1) && !lifecycleCamera.equals(lifecycleCameraB)) {
                        throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", Arrays.copyOf(new Object[]{abstractC3821fh1}, 1)));
                    }
                }
            }
            if (lifecycleCameraB == null) {
                b bVar2 = (b) ht.d;
                C8054xp c8054xp2 = (C8054xp) ht.e;
                O90.c(c8054xp2);
                C2359bc1 c2359bc1 = c8054xp2.b().b;
                C8054xp c8054xp3 = (C8054xp) ht.e;
                O90.c(c8054xp3);
                C3383dO1 c3383dO1 = c8054xp3.h;
                if (c3383dO1 != null) {
                    C8054xp c8054xp4 = (C8054xp) ht.e;
                    O90.c(c8054xp4);
                    C5568kn c5568kn = c8054xp4.i;
                    if (c5568kn != null) {
                        lifecycleCameraB = bVar2.b(c0920Lo, new C1933Yo(interfaceC7480uoC, null, ks0H, null, c2359bc1, c3383dO1, c5568kn));
                    } else {
                        throw new IllegalStateException("CameraX not initialized yet.");
                    }
                } else {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
            }
            if (abstractC3821fh1Arr.length != 0) {
                b bVar3 = (b) ht.d;
                List listF = AbstractC8259yu.f(Arrays.copyOf(abstractC3821fh1Arr, abstractC3821fh1Arr.length));
                C8054xp c8054xp5 = (C8054xp) ht.e;
                O90.c(c8054xp5);
                bVar3.a(lifecycleCameraB, listF, c8054xp5.b().b);
            }
            return lifecycleCameraB;
        } finally {
            Trace.endSection();
        }
    }
}
