package p000;

import android.hardware.camera2.CaptureRequest;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.ArrayMap;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: gZ0 */
/* loaded from: classes.dex */
public abstract class AbstractC9513gZ0 {

    /* renamed from: c */
    public HandlerThread f27844c;

    /* renamed from: f */
    public final HashSet f27847f;

    /* renamed from: a */
    public final HashMap f27842a = new HashMap();

    /* renamed from: b */
    public final HashMap f27843b = new HashMap();

    /* renamed from: d */
    public final ArrayList f27845d = new ArrayList();

    /* renamed from: e */
    public final Object f27846e = new Object();

    /* renamed from: g */
    public int f27848g = -1;

    public AbstractC9513gZ0(List list) {
        HashSet hashSet = new HashSet();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            if (list.contains(CaptureRequest.CONTROL_ZOOM_RATIO) || list.contains(CaptureRequest.SCALER_CROP_REGION)) {
                hashSet.add(0);
            }
        } else if (list.contains(CaptureRequest.SCALER_CROP_REGION)) {
            hashSet.add(0);
        }
        if (list.containsAll(Arrays.asList(CaptureRequest.CONTROL_AF_TRIGGER, CaptureRequest.CONTROL_AF_MODE))) {
            hashSet.add(1);
        }
        if (list.contains(CaptureRequest.CONTROL_AF_REGIONS)) {
            hashSet.add(2);
        }
        if (list.contains(CaptureRequest.CONTROL_AE_REGIONS)) {
            hashSet.add(3);
        }
        if (list.contains(CaptureRequest.CONTROL_AWB_REGIONS)) {
            hashSet.add(4);
        }
        CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
        if (list.containsAll(Arrays.asList(key, CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER))) {
            hashSet.add(5);
        }
        if (list.containsAll(Arrays.asList(key, CaptureRequest.FLASH_MODE))) {
            hashSet.add(6);
        }
        if (list.contains(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION)) {
            hashSet.add(7);
        }
        if (i >= 34 && list.contains(CaptureRequest.EXTENSION_STRENGTH)) {
            hashSet.add(8);
        }
        this.f27847f = hashSet;
    }

    /* renamed from: a */
    public static C9641hZ0 m18577a(InterfaceC4012en interfaceC4012en, HashMap map) {
        if (interfaceC4012en instanceof C0608Je) {
            return new C9641hZ0(((C0608Je) interfaceC4012en).f5654a, ((C0608Je) interfaceC4012en).f5658e);
        }
        if (!(interfaceC4012en instanceof C0858Nd)) {
            if (interfaceC4012en instanceof C1677ae) {
                throw new UnsupportedOperationException("MultiResolutionImageReader not supported yet");
            }
            throw new UnsupportedOperationException("Unsupported Camera2OutputConfig:" + interfaceC4012en);
        }
        C0858Nd c0858Nd = (C0858Nd) interfaceC4012en;
        ImageReader imageReaderNewInstance = ImageReader.newInstance(c0858Nd.f7917e.getWidth(), c0858Nd.f7917e.getHeight(), c0858Nd.f7918f, c0858Nd.f7919g);
        C0858Nd c0858Nd2 = (C0858Nd) interfaceC4012en;
        map.put(Integer.valueOf(c0858Nd2.f7913a), imageReaderNewInstance);
        C9641hZ0 c9641hZ0 = new C9641hZ0(c0858Nd2.f7913a, imageReaderNewInstance.getSurface());
        AbstractC8301Sz1.m7489l(c9641hZ0.f29023e).mo2494d(new RunnableC8352Tz0(23, imageReaderNewInstance), QR1.m6703a());
        return c9641hZ0;
    }

    /* renamed from: b */
    public abstract void mo9910b();

    /* renamed from: c */
    public abstract Map mo9911c(Size size);

    /* renamed from: d */
    public final C11812yY0 m18578d(C0301Em c0301Em, C4129ge c4129ge) {
        Iterator it;
        C4264in c4264inMo9912e = mo9912e(c0301Em.mo2393e(), T02.m7517a(c0301Em), c4129ge);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashSet hashSet = new HashSet();
        C7612Ft0.m2812b();
        ArrayList arrayList = new ArrayList();
        C7872Kt0 c7872Kt0M4776a = C7872Kt0.m4776a();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        synchronized (this.f27846e) {
            try {
                Iterator it2 = c4264inMo9912e.f29450d.iterator();
                while (it2.hasNext()) {
                    InterfaceC4012en interfaceC4012en = (InterfaceC4012en) it2.next();
                    C9641hZ0 c9641hZ0M18577a = m18577a(interfaceC4012en, this.f27842a);
                    this.f27845d.add(c9641hZ0M18577a);
                    this.f27843b.put(Integer.valueOf(interfaceC4012en.getId()), interfaceC4012en);
                    C8128Pr0 c8128Pr0M26209a = C7214ye.m26209a(c9641hZ0M18577a);
                    c8128Pr0M26209a.f9305c = interfaceC4012en.mo4381b();
                    c8128Pr0M26209a.f9307e = Integer.valueOf(interfaceC4012en.mo4380a());
                    List<InterfaceC4012en> listMo4382c = interfaceC4012en.mo4382c();
                    if (listMo4382c == null || listMo4382c.isEmpty()) {
                        it = it2;
                    } else {
                        ArrayList arrayList5 = new ArrayList();
                        for (InterfaceC4012en interfaceC4012en2 : listMo4382c) {
                            this.f27843b.put(Integer.valueOf(interfaceC4012en2.getId()), interfaceC4012en2);
                            arrayList5.add(m18577a(interfaceC4012en2, this.f27842a));
                            it2 = it2;
                        }
                        it = it2;
                        c8128Pr0M26209a.f9304b = arrayList5;
                    }
                    C7214ye c7214yeM6450l = c8128Pr0M26209a.m6450l();
                    linkedHashSet.add(c7214yeM6450l);
                    hashSet.add(c7214yeM6450l.f46367a);
                    Iterator it3 = c7214yeM6450l.f46368b.iterator();
                    while (it3.hasNext()) {
                        hashSet.add((AbstractC4232iH) it3.next());
                    }
                    it2 = it;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C7612Ft0 c7612Ft0M2812b = C7612Ft0.m2812b();
        for (CaptureRequest.Key key : c4264inMo9912e.f29449c.keySet()) {
            c7612Ft0M2812b.m2815e(new C0480Hc("camera2.captureRequest.option." + key.getName(), Object.class, key), c4264inMo9912e.f29449c.get(key));
        }
        C7882Ky0 c7882Ky0M4786a = C7882Ky0.m4786a(c7612Ft0M2812b);
        C7978Mu0 c7978Mu0 = new C7978Mu0(28);
        c7978Mu0.f7393b = c7882Ky0M4786a;
        C7612Ft0 c7612Ft0M2813c = C7612Ft0.m2813c(c7978Mu0);
        int i = c4264inMo9912e.f29447a;
        int i2 = c4264inMo9912e.f29448b;
        HandlerThread handlerThread = new HandlerThread("CameraX-extensions_image_reader");
        this.f27844c = handlerThread;
        handlerThread.start();
        AbstractC7806Jm0.m4412f("SessionProcessorBase");
        ArrayList arrayList6 = new ArrayList(linkedHashSet);
        ArrayList arrayList7 = new ArrayList(arrayList2);
        ArrayList arrayList8 = new ArrayList(arrayList3);
        ArrayList arrayList9 = new ArrayList(arrayList4);
        ArrayList arrayList10 = new ArrayList(hashSet);
        C7882Ky0 c7882Ky0M4786a2 = C7882Ky0.m4786a(c7612Ft0M2813c);
        ArrayList arrayList11 = new ArrayList(arrayList);
        C10996s81 c10996s81 = C10996s81.f42278b;
        ArrayMap arrayMap = new ArrayMap();
        for (String str : c7872Kt0M4776a.f42279a.keySet()) {
            arrayMap.put(str, c7872Kt0M4776a.f42279a.get(str));
        }
        return new C11812yY0(arrayList6, arrayList7, arrayList8, arrayList9, new C1373Vp(arrayList10, c7882Ky0M4786a2, i, false, arrayList11, false, new C10996s81(arrayMap), null), null, null, i2, null);
    }

    /* renamed from: e */
    public abstract C4264in mo9912e(String str, LinkedHashMap linkedHashMap, C4129ge c4129ge);

    /* renamed from: f */
    public abstract void mo9913f();

    /* renamed from: g */
    public abstract void mo9914g(C4201hn c4201hn);

    /* renamed from: h */
    public final void m18579h(final int i, final InterfaceC9329f70 interfaceC9329f70) {
        ImageReader imageReader;
        final String strMo4381b;
        synchronized (this.f27846e) {
            imageReader = (ImageReader) this.f27842a.get(Integer.valueOf(i));
            InterfaceC4012en interfaceC4012en = (InterfaceC4012en) this.f27843b.get(Integer.valueOf(i));
            strMo4381b = interfaceC4012en == null ? null : interfaceC4012en.mo4381b();
        }
        if (imageReader != null) {
            imageReader.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: eZ0
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader2) {
                    InterfaceC9329f70 interfaceC9329f702 = interfaceC9329f70;
                    int i2 = i;
                    String str = strMo4381b;
                    try {
                        Image imageAcquireNextImage = imageReader2.acquireNextImage();
                        interfaceC9329f702.onNextImageAvailable(i2, imageAcquireNextImage.getTimestamp(), new C9385fZ0(imageAcquireNextImage), str);
                    } catch (IllegalStateException unused) {
                        AbstractC7806Jm0.m4412f("SessionProcessorBase");
                    }
                }
            }, new Handler(this.f27844c.getLooper()));
        }
    }

    /* renamed from: i */
    public abstract void mo9915i(C3950dn c3950dn);

    /* renamed from: j */
    public abstract int mo9916j(boolean z, C10996s81 c10996s81, C1356VY c1356vy);

    /* renamed from: k */
    public abstract int mo9917k(C10996s81 c10996s81, InterfaceC9129dZ0 interfaceC9129dZ0);

    /* renamed from: l */
    public abstract int mo9918l(C8342Tu0 c8342Tu0, C10996s81 c10996s81, C1356VY c1356vy);

    /* renamed from: m */
    public abstract void mo9919m();
}
