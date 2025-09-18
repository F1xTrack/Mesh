package p000;

import android.hardware.camera2.CameraDevice;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import android.view.View;
import androidx.fragment.app.C1722d;
import androidx.fragment.app.C1724f;
import androidx.fragment.app.C1740v;
import io.sentry.AbstractC6070o;
import io.sentry.C5815W1;
import io.sentry.C6067n;
import io.sentry.EnumC6051j;
import io.sentry.EnumC6069n1;
import io.sentry.ILogger;
import io.sentry.config.AbstractC6003a;
import io.sentry.transport.C6161m;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;

/* renamed from: zG */
/* loaded from: classes.dex */
public final /* synthetic */ class C7253zG implements InterfaceC0682Kp, InterfaceC6471n9, InterfaceC0363Fl {

    /* renamed from: a */
    public final /* synthetic */ int f46761a;

    /* renamed from: b */
    public final /* synthetic */ Object f46762b;

    /* renamed from: c */
    public final /* synthetic */ Object f46763c;

    /* renamed from: d */
    public final /* synthetic */ Object f46764d;

    /* renamed from: e */
    public final /* synthetic */ Object f46765e;

    public /* synthetic */ C7253zG(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f46761a = i;
        this.f46762b = obj;
        this.f46763c = obj2;
        this.f46764d = obj3;
        this.f46765e = obj4;
    }

    /* renamed from: a */
    public void m26353a() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        int i6 = 1;
        File file = (File) this.f46765e;
        EnumC6069n1 enumC6069n1 = EnumC6069n1.DEBUG;
        String str = (String) this.f46763c;
        ILogger iLogger = (ILogger) this.f46762b;
        iLogger.mo21407k(enumC6069n1, "Started processing cached files from %s", str);
        AbstractC6070o abstractC6070o = (AbstractC6070o) this.f46764d;
        ILogger iLogger2 = abstractC6070o.f34258b;
        try {
            iLogger2.mo21407k(enumC6069n1, "Processing dir. %s", file.getAbsolutePath());
            if (!file.exists()) {
                iLogger2.mo21407k(EnumC6069n1.WARNING, "Directory '%s' doesn't exist. No cached events to send.", file.getAbsolutePath());
            } else if (file.isDirectory()) {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null) {
                    File[] fileArrListFiles2 = file.listFiles(new C0408GT(1, abstractC6070o));
                    iLogger2.mo21407k(enumC6069n1, "Processing %d items from cache dir %s", Integer.valueOf(fileArrListFiles2 != null ? fileArrListFiles2.length : 0), file.getAbsolutePath());
                    int length = fileArrListFiles.length;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= length) {
                            break;
                        }
                        File file2 = fileArrListFiles[i7];
                        if (file2.isFile()) {
                            String absolutePath = file2.getAbsolutePath();
                            C5815W1 c5815w1 = abstractC6070o.f34260d;
                            if (!c5815w1.contains(absolutePath)) {
                                C6161m c6161mMo21372q = abstractC6070o.f34257a.mo21372q();
                                if (c6161mMo21372q != null && c6161mMo21372q.m21873c(EnumC6051j.All)) {
                                    iLogger2.mo21407k(EnumC6069n1.INFO, "DirectoryProcessor, rate limiting active.", new Object[i5]);
                                    break;
                                }
                                EnumC6069n1 enumC6069n12 = EnumC6069n1.DEBUG;
                                i3 = length;
                                Object[] objArr = new Object[i6];
                                objArr[i5] = absolutePath;
                                iLogger2.mo21407k(enumC6069n12, "Processing file: %s", objArr);
                                abstractC6070o.mo21360b(file2, AbstractC6003a.m21743b(new C6067n(abstractC6070o.f34259c, abstractC6070o.f34258b, absolutePath, c5815w1)));
                                Thread.sleep(100L);
                                i4 = 1;
                                i7 += i4;
                                i6 = i4;
                                length = i3;
                                i5 = 0;
                            } else {
                                EnumC6069n1 enumC6069n13 = EnumC6069n1.DEBUG;
                                Object[] objArr2 = new Object[i6];
                                objArr2[i5] = absolutePath;
                                iLogger2.mo21407k(enumC6069n13, "File '%s' has already been processed so it will not be processed again.", objArr2);
                            }
                        } else {
                            EnumC6069n1 enumC6069n14 = EnumC6069n1.DEBUG;
                            Object[] objArr3 = new Object[i6];
                            objArr3[i5] = file2.getAbsolutePath();
                            iLogger2.mo21407k(enumC6069n14, "File %s is not a File.", objArr3);
                        }
                        i3 = length;
                        i4 = i6;
                        i7 += i4;
                        i6 = i4;
                        length = i3;
                        i5 = 0;
                    }
                } else {
                    iLogger2.mo21407k(EnumC6069n1.ERROR, "Cache dir %s is null.", file.getAbsolutePath());
                }
            } else {
                iLogger2.mo21407k(EnumC6069n1.ERROR, "Cache dir %s is not a directory.", file.getAbsolutePath());
            }
            i2 = i5;
            i = i6;
        } catch (Throwable th) {
            EnumC6069n1 enumC6069n15 = EnumC6069n1.ERROR;
            String absolutePath2 = file.getAbsolutePath();
            i = 1;
            i2 = 0;
            iLogger2.mo21405c(enumC6069n15, th, "Failed processing '%s'", absolutePath2);
        }
        EnumC6069n1 enumC6069n16 = EnumC6069n1.DEBUG;
        Object[] objArr4 = new Object[i];
        objArr4[i2] = str;
        iLogger.mo21407k(enumC6069n16, "Finished processing cached files from %s", objArr4);
    }

    @Override // p000.InterfaceC6471n9
    public InterfaceFutureC7800Jj0 apply(Object obj) {
        C4066fe c4066fe;
        InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0Mo4249d;
        InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0M7489l;
        switch (this.f46761a) {
            case 1:
                List list = (List) obj;
                JD0 jd0 = (JD0) this.f46762b;
                jd0.getClass();
                AbstractC7806Jm0.m4412f("ProcessingCaptureSession");
                if (jd0.f5393j == 5) {
                    return new F70(1, new IllegalStateException("SessionProcessorCaptureSession is closed."));
                }
                AbstractC4232iH abstractC4232iH = null;
                boolean zContains = list.contains(null);
                C11812yY0 c11812yY0 = (C11812yY0) this.f46763c;
                if (zContains) {
                    interfaceFutureC7800Jj0Mo4249d = new F70(1, new C4169hH((AbstractC4232iH) c11812yY0.m26164b().get(list.indexOf(null)), "Surface closed"));
                } else {
                    boolean z = false;
                    C4066fe c4066fe2 = null;
                    C4066fe c4066fe3 = null;
                    C4066fe c4066fe4 = null;
                    for (int i = 0; i < c11812yY0.m26164b().size(); i++) {
                        AbstractC4232iH abstractC4232iH2 = (AbstractC4232iH) c11812yY0.m26164b().get(i);
                        boolean zEquals = Objects.equals(abstractC4232iH2.f29028j, C9085dD0.class);
                        int i2 = abstractC4232iH2.f29027i;
                        Size size = abstractC4232iH2.f29026h;
                        if (zEquals || Objects.equals(abstractC4232iH2.f29028j, C9966k51.class)) {
                            c4066fe2 = new C4066fe((Surface) abstractC4232iH2.m18992c().get(), size, i2);
                        } else if (Objects.equals(abstractC4232iH2.f29028j, C11247u60.class)) {
                            c4066fe3 = new C4066fe((Surface) abstractC4232iH2.m18992c().get(), size, i2);
                        } else if (Objects.equals(abstractC4232iH2.f29028j, C9711i60.class)) {
                            c4066fe4 = new C4066fe((Surface) abstractC4232iH2.m18992c().get(), size, i2);
                        }
                    }
                    C7214ye c7214ye = c11812yY0.f46299b;
                    if (c7214ye != null) {
                        abstractC4232iH = c7214ye.f46367a;
                        c4066fe = new C4066fe((Surface) abstractC4232iH.m18992c().get(), abstractC4232iH.f29026h, abstractC4232iH.f29027i);
                    } else {
                        c4066fe = null;
                    }
                    jd0.f5393j = 2;
                    try {
                        ArrayList arrayList = new ArrayList(jd0.f5389f);
                        if (abstractC4232iH != null) {
                            arrayList.add(abstractC4232iH);
                        }
                        AbstractC11561wZ1.m25650c(arrayList);
                        AbstractC7806Jm0.m4412f("ProcessingCaptureSession");
                        try {
                            C11812yY0 c11812yY0M18578d = jd0.f5384a.m18578d(jd0.f5385b, new C4129ge(c4066fe2, c4066fe3, c4066fe4, c4066fe));
                            jd0.f5392i = c11812yY0M18578d;
                            AbstractC8301Sz1.m7489l(((AbstractC4232iH) c11812yY0M18578d.m26164b().get(0)).f29023e).mo2494d(new RunnableC1096RQ(jd0, 26, abstractC4232iH), QR1.m6703a());
                            Iterator it = jd0.f5392i.m26164b().iterator();
                            while (true) {
                                boolean zHasNext = it.hasNext();
                                ExecutorC10151lY0 executorC10151lY0 = jd0.f5386c;
                                if (zHasNext) {
                                    AbstractC4232iH abstractC4232iH3 = (AbstractC4232iH) it.next();
                                    JD0.f5382o.add(abstractC4232iH3);
                                    AbstractC8301Sz1.m7489l(abstractC4232iH3.f29023e).mo2494d(new RunnableC4106gH(abstractC4232iH3, 1), executorC10151lY0);
                                } else {
                                    C11685xY0 c11685xY0 = new C11685xY0();
                                    c11685xY0.m25911a(c11812yY0);
                                    c11685xY0.f43133a.clear();
                                    ((HashSet) c11685xY0.f43134b.f15116d).clear();
                                    c11685xY0.m25911a(jd0.f5392i);
                                    if (c11685xY0.f45675l && c11685xY0.f45674k) {
                                        z = true;
                                    }
                                    AbstractC9104dM1.m17545d("Cannot transform the SessionConfig", z);
                                    C11812yY0 c11812yY0M25912b = c11685xY0.m25912b();
                                    CameraDevice cameraDevice = (CameraDevice) this.f46764d;
                                    cameraDevice.getClass();
                                    interfaceFutureC7800Jj0Mo4249d = jd0.f5388e.mo4249d(c11812yY0M25912b, cameraDevice, (E71) this.f46765e);
                                    AbstractC8301Sz1.m7478a(interfaceFutureC7800Jj0Mo4249d, new C8170Qm0(27, jd0), executorC10151lY0);
                                }
                            }
                        } catch (Throwable th) {
                            AbstractC7806Jm0.m4412f("ProcessingCaptureSession");
                            AbstractC11561wZ1.m25649b(jd0.f5389f);
                            if (abstractC4232iH != null) {
                                abstractC4232iH.m18991b();
                            }
                            throw th;
                        }
                    } catch (C4169hH e) {
                        return new F70(1, e);
                    }
                }
                return interfaceFutureC7800Jj0Mo4249d;
            default:
                E71 e71 = (E71) this.f46762b;
                CameraDevice cameraDevice2 = (CameraDevice) this.f46763c;
                DY0 dy0 = (DY0) this.f46764d;
                List list2 = (List) this.f46765e;
                if (e71.f2500v.f3086a) {
                    Iterator it2 = e71.f2480b.m7884s().iterator();
                    while (it2.hasNext()) {
                        ((E71) it2.next()).m2038k();
                    }
                }
                E71.m2035m();
                synchronized (e71.f2479a) {
                    try {
                        if (e71.f2491m) {
                            interfaceFutureC7800Jj0M7489l = new F70(1, new CancellationException("Opener is disabled"));
                        } else {
                            e71.f2480b.m7879D(e71);
                            C0489Hl c0489HlM26149b = AbstractC11797yQ1.m26149b(new C7253zG(e71, list2, new C7391Bm1(cameraDevice2, e71.f2481c), dy0, 2));
                            e71.f2486h = c0489HlM26149b;
                            AbstractC8301Sz1.m7478a(c0489HlM26149b, new GQ0(3, e71), QR1.m6703a());
                            interfaceFutureC7800Jj0M7489l = AbstractC8301Sz1.m7489l(e71.f2486h);
                        }
                    } finally {
                    }
                }
                return interfaceFutureC7800Jj0M7489l;
        }
    }

    @Override // p000.InterfaceC0682Kp
    /* renamed from: e */
    public void mo3136e() {
        C1724f c1724f = (C1724f) this.f46763c;
        O90.m5968f(c1724f, "this$0");
        C1722d c1722d = (C1722d) this.f46764d;
        O90.m5968f(c1722d, "$animationInfo");
        C1740v c1740v = (C1740v) this.f46765e;
        O90.m5968f(c1740v, "$operation");
        View view = (View) this.f46762b;
        view.clearAnimation();
        c1724f.f16183a.endViewTransition(view);
        c1722d.m10020a();
        if (Log.isLoggable("FragmentManager", 2)) {
            c1740v.toString();
        }
    }

    @Override // p000.InterfaceC0363Fl
    /* renamed from: h0 */
    public Object mo411h0(C0300El c0300El) {
        String str;
        E71 e71 = (E71) this.f46762b;
        List list = (List) this.f46763c;
        C7391Bm1 c7391Bm1 = (C7391Bm1) this.f46764d;
        DY0 dy0 = (DY0) this.f46765e;
        synchronized (e71.f2479a) {
            e71.m2040n(list);
            AbstractC9104dM1.m17550i(e71.f2487i == null, "The openCaptureSessionCompleter can only set once!");
            e71.f2487i = c0300El;
            ((C4238iN) c7391Bm1.f1022b).mo10521r(dy0);
            str = "openCaptureSession[session=" + e71 + "]";
        }
        return str;
    }
}
