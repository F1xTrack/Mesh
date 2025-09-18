package defpackage;

import android.hardware.camera2.CameraDevice;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import android.view.View;
import androidx.fragment.app.d;
import androidx.fragment.app.f;
import androidx.fragment.app.v;
import io.sentry.AbstractC5149o;
import io.sentry.C5146n;
import io.sentry.EnumC5134j;
import io.sentry.EnumC5148n1;
import io.sentry.ILogger;
import io.sentry.W1;
import io.sentry.config.a;
import io.sentry.transport.m;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;

/* renamed from: zG */
/* loaded from: classes.dex */
public final /* synthetic */ class C8329zG implements InterfaceC0845Kp, InterfaceC6021n9, InterfaceC0443Fl {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C8329zG(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public void a() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        int i6 = 1;
        File file = (File) this.e;
        EnumC5148n1 enumC5148n1 = EnumC5148n1.DEBUG;
        String str = (String) this.c;
        ILogger iLogger = (ILogger) this.b;
        iLogger.k(enumC5148n1, "Started processing cached files from %s", str);
        AbstractC5149o abstractC5149o = (AbstractC5149o) this.d;
        ILogger iLogger2 = abstractC5149o.b;
        try {
            iLogger2.k(enumC5148n1, "Processing dir. %s", file.getAbsolutePath());
            if (!file.exists()) {
                iLogger2.k(EnumC5148n1.WARNING, "Directory '%s' doesn't exist. No cached events to send.", file.getAbsolutePath());
            } else if (file.isDirectory()) {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null) {
                    File[] fileArrListFiles2 = file.listFiles(new GT(1, abstractC5149o));
                    iLogger2.k(enumC5148n1, "Processing %d items from cache dir %s", Integer.valueOf(fileArrListFiles2 != null ? fileArrListFiles2.length : 0), file.getAbsolutePath());
                    int length = fileArrListFiles.length;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= length) {
                            break;
                        }
                        File file2 = fileArrListFiles[i7];
                        if (file2.isFile()) {
                            String absolutePath = file2.getAbsolutePath();
                            W1 w1 = abstractC5149o.d;
                            if (!w1.contains(absolutePath)) {
                                m mVarQ = abstractC5149o.a.q();
                                if (mVarQ != null && mVarQ.c(EnumC5134j.All)) {
                                    iLogger2.k(EnumC5148n1.INFO, "DirectoryProcessor, rate limiting active.", new Object[i5]);
                                    break;
                                }
                                EnumC5148n1 enumC5148n12 = EnumC5148n1.DEBUG;
                                i3 = length;
                                Object[] objArr = new Object[i6];
                                objArr[i5] = absolutePath;
                                iLogger2.k(enumC5148n12, "Processing file: %s", objArr);
                                abstractC5149o.b(file2, a.b(new C5146n(abstractC5149o.c, abstractC5149o.b, absolutePath, w1)));
                                Thread.sleep(100L);
                                i4 = 1;
                                i7 += i4;
                                i6 = i4;
                                length = i3;
                                i5 = 0;
                            } else {
                                EnumC5148n1 enumC5148n13 = EnumC5148n1.DEBUG;
                                Object[] objArr2 = new Object[i6];
                                objArr2[i5] = absolutePath;
                                iLogger2.k(enumC5148n13, "File '%s' has already been processed so it will not be processed again.", objArr2);
                            }
                        } else {
                            EnumC5148n1 enumC5148n14 = EnumC5148n1.DEBUG;
                            Object[] objArr3 = new Object[i6];
                            objArr3[i5] = file2.getAbsolutePath();
                            iLogger2.k(enumC5148n14, "File %s is not a File.", objArr3);
                        }
                        i3 = length;
                        i4 = i6;
                        i7 += i4;
                        i6 = i4;
                        length = i3;
                        i5 = 0;
                    }
                } else {
                    iLogger2.k(EnumC5148n1.ERROR, "Cache dir %s is null.", file.getAbsolutePath());
                }
            } else {
                iLogger2.k(EnumC5148n1.ERROR, "Cache dir %s is not a directory.", file.getAbsolutePath());
            }
            i2 = i5;
            i = i6;
        } catch (Throwable th) {
            EnumC5148n1 enumC5148n15 = EnumC5148n1.ERROR;
            String absolutePath2 = file.getAbsolutePath();
            i = 1;
            i2 = 0;
            iLogger2.c(enumC5148n15, th, "Failed processing '%s'", absolutePath2);
        }
        EnumC5148n1 enumC5148n16 = EnumC5148n1.DEBUG;
        Object[] objArr4 = new Object[i];
        objArr4[i2] = str;
        iLogger.k(enumC5148n16, "Finished processing cached files from %s", objArr4);
    }

    @Override // defpackage.InterfaceC6021n9
    public InterfaceFutureC0750Jj0 apply(Object obj) {
        C3810fe c3810fe;
        InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0D;
        InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0L;
        switch (this.a) {
            case 1:
                List list = (List) obj;
                JD0 jd0 = (JD0) this.b;
                jd0.getClass();
                AbstractC0759Jm0.f("ProcessingCaptureSession");
                if (jd0.j == 5) {
                    return new F70(1, new IllegalStateException("SessionProcessorCaptureSession is closed."));
                }
                AbstractC4314iH abstractC4314iH = null;
                boolean zContains = list.contains(null);
                C8194yY0 c8194yY0 = (C8194yY0) this.c;
                if (zContains) {
                    interfaceFutureC0750Jj0D = new F70(1, new C4123hH((AbstractC4314iH) c8194yY0.b().get(list.indexOf(null)), "Surface closed"));
                } else {
                    boolean z = false;
                    C3810fe c3810fe2 = null;
                    C3810fe c3810fe3 = null;
                    C3810fe c3810fe4 = null;
                    for (int i = 0; i < c8194yY0.b().size(); i++) {
                        AbstractC4314iH abstractC4314iH2 = (AbstractC4314iH) c8194yY0.b().get(i);
                        boolean zEquals = Objects.equals(abstractC4314iH2.j, C3349dD0.class);
                        int i2 = abstractC4314iH2.i;
                        Size size = abstractC4314iH2.h;
                        if (zEquals || Objects.equals(abstractC4314iH2.j, C5438k51.class)) {
                            c3810fe2 = new C3810fe((Surface) abstractC4314iH2.c().get(), size, i2);
                        } else if (Objects.equals(abstractC4314iH2.j, C7349u60.class)) {
                            c3810fe3 = new C3810fe((Surface) abstractC4314iH2.c().get(), size, i2);
                        } else if (Objects.equals(abstractC4314iH2.j, C4282i60.class)) {
                            c3810fe4 = new C3810fe((Surface) abstractC4314iH2.c().get(), size, i2);
                        }
                    }
                    C8211ye c8211ye = c8194yY0.b;
                    if (c8211ye != null) {
                        abstractC4314iH = c8211ye.a;
                        c3810fe = new C3810fe((Surface) abstractC4314iH.c().get(), abstractC4314iH.h, abstractC4314iH.i);
                    } else {
                        c3810fe = null;
                    }
                    jd0.j = 2;
                    try {
                        ArrayList arrayList = new ArrayList(jd0.f);
                        if (abstractC4314iH != null) {
                            arrayList.add(abstractC4314iH);
                        }
                        AbstractC7818wZ1.c(arrayList);
                        AbstractC0759Jm0.f("ProcessingCaptureSession");
                        try {
                            C8194yY0 c8194yY0D = jd0.a.d(jd0.b, new C4001ge(c3810fe2, c3810fe3, c3810fe4, c3810fe));
                            jd0.i = c8194yY0D;
                            AbstractC1500Sz1.l(((AbstractC4314iH) c8194yY0D.b().get(0)).e).d(new RQ(jd0, 26, abstractC4314iH), QR1.a());
                            Iterator it = jd0.i.b().iterator();
                            while (true) {
                                boolean zHasNext = it.hasNext();
                                ExecutorC5715lY0 executorC5715lY0 = jd0.c;
                                if (zHasNext) {
                                    AbstractC4314iH abstractC4314iH3 = (AbstractC4314iH) it.next();
                                    JD0.o.add(abstractC4314iH3);
                                    AbstractC1500Sz1.l(abstractC4314iH3.e).d(new RunnableC3932gH(abstractC4314iH3, 1), executorC5715lY0);
                                } else {
                                    C8004xY0 c8004xY0 = new C8004xY0();
                                    c8004xY0.a(c8194yY0);
                                    c8004xY0.a.clear();
                                    ((HashSet) c8004xY0.b.d).clear();
                                    c8004xY0.a(jd0.i);
                                    if (c8004xY0.l && c8004xY0.k) {
                                        z = true;
                                    }
                                    AbstractC3377dM1.d("Cannot transform the SessionConfig", z);
                                    C8194yY0 c8194yY0B = c8004xY0.b();
                                    CameraDevice cameraDevice = (CameraDevice) this.d;
                                    cameraDevice.getClass();
                                    interfaceFutureC0750Jj0D = jd0.e.d(c8194yY0B, cameraDevice, (E71) this.e);
                                    AbstractC1500Sz1.a(interfaceFutureC0750Jj0D, new C1304Qm0(27, jd0), executorC5715lY0);
                                }
                            }
                        } catch (Throwable th) {
                            AbstractC0759Jm0.f("ProcessingCaptureSession");
                            AbstractC7818wZ1.b(jd0.f);
                            if (abstractC4314iH != null) {
                                abstractC4314iH.b();
                            }
                            throw th;
                        }
                    } catch (C4123hH e) {
                        return new F70(1, e);
                    }
                }
                return interfaceFutureC0750Jj0D;
            default:
                E71 e71 = (E71) this.b;
                CameraDevice cameraDevice2 = (CameraDevice) this.c;
                DY0 dy0 = (DY0) this.d;
                List list2 = (List) this.e;
                if (e71.v.a) {
                    Iterator it2 = e71.b.s().iterator();
                    while (it2.hasNext()) {
                        ((E71) it2.next()).k();
                    }
                }
                E71.m();
                synchronized (e71.a) {
                    try {
                        if (e71.m) {
                            interfaceFutureC0750Jj0L = new F70(1, new CancellationException("Opener is disabled"));
                        } else {
                            e71.b.D(e71);
                            C0599Hl c0599HlB = AbstractC8171yQ1.b(new C8329zG(e71, list2, new C0136Bm1(cameraDevice2, e71.c), dy0, 2));
                            e71.h = c0599HlB;
                            AbstractC1500Sz1.a(c0599HlB, new GQ0(3, e71), QR1.a());
                            interfaceFutureC0750Jj0L = AbstractC1500Sz1.l(e71.h);
                        }
                    } finally {
                    }
                }
                return interfaceFutureC0750Jj0L;
        }
    }

    @Override // defpackage.InterfaceC0845Kp
    public void e() {
        f fVar = (f) this.c;
        O90.f(fVar, "this$0");
        d dVar = (d) this.d;
        O90.f(dVar, "$animationInfo");
        v vVar = (v) this.e;
        O90.f(vVar, "$operation");
        View view = (View) this.b;
        view.clearAnimation();
        fVar.a.endViewTransition(view);
        dVar.a();
        if (Log.isLoggable("FragmentManager", 2)) {
            vVar.toString();
        }
    }

    @Override // defpackage.InterfaceC0443Fl
    public Object h0(C0365El c0365El) {
        String str;
        E71 e71 = (E71) this.b;
        List list = (List) this.c;
        C0136Bm1 c0136Bm1 = (C0136Bm1) this.d;
        DY0 dy0 = (DY0) this.e;
        synchronized (e71.a) {
            e71.n(list);
            AbstractC3377dM1.i(e71.i == null, "The openCaptureSessionCompleter can only set once!");
            e71.i = c0365El;
            ((C4332iN) c0136Bm1.b).r(dy0);
            str = "openCaptureSession[session=" + e71 + "]";
        }
        return str;
    }
}
