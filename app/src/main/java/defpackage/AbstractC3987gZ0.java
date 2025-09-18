package defpackage;

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
public abstract class AbstractC3987gZ0 {
    public HandlerThread c;
    public final HashSet f;
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final ArrayList d = new ArrayList();
    public final Object e = new Object();
    public int g = -1;

    public AbstractC3987gZ0(List list) {
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
        this.f = hashSet;
    }

    public static C4178hZ0 a(InterfaceC3646en interfaceC3646en, HashMap map) {
        if (interfaceC3646en instanceof C0734Je) {
            return new C4178hZ0(((C0734Je) interfaceC3646en).a, ((C0734Je) interfaceC3646en).e);
        }
        if (!(interfaceC3646en instanceof C1042Nd)) {
            if (interfaceC3646en instanceof C2172ae) {
                throw new UnsupportedOperationException("MultiResolutionImageReader not supported yet");
            }
            throw new UnsupportedOperationException("Unsupported Camera2OutputConfig:" + interfaceC3646en);
        }
        C1042Nd c1042Nd = (C1042Nd) interfaceC3646en;
        ImageReader imageReaderNewInstance = ImageReader.newInstance(c1042Nd.e.getWidth(), c1042Nd.e.getHeight(), c1042Nd.f, c1042Nd.g);
        C1042Nd c1042Nd2 = (C1042Nd) interfaceC3646en;
        map.put(Integer.valueOf(c1042Nd2.a), imageReaderNewInstance);
        C4178hZ0 c4178hZ0 = new C4178hZ0(c1042Nd2.a, imageReaderNewInstance.getSurface());
        AbstractC1500Sz1.l(c4178hZ0.e).d(new RunnableC1577Tz0(23, imageReaderNewInstance), QR1.a());
        return c4178hZ0;
    }

    public abstract void b();

    public abstract Map c(Size size);

    public final C8194yY0 d(C0368Em c0368Em, C4001ge c4001ge) {
        Iterator it;
        C4409in c4409inE = e(c0368Em.e(), T02.a(c0368Em), c4001ge);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashSet hashSet = new HashSet();
        C0468Ft0.b();
        ArrayList arrayList = new ArrayList();
        C0858Kt0 c0858Kt0A = C0858Kt0.a();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        synchronized (this.e) {
            try {
                Iterator it2 = c4409inE.d.iterator();
                while (it2.hasNext()) {
                    InterfaceC3646en interfaceC3646en = (InterfaceC3646en) it2.next();
                    C4178hZ0 c4178hZ0A = a(interfaceC3646en, this.a);
                    this.d.add(c4178hZ0A);
                    this.b.put(Integer.valueOf(interfaceC3646en.getId()), interfaceC3646en);
                    C1241Pr0 c1241Pr0A = C8211ye.a(c4178hZ0A);
                    c1241Pr0A.c = interfaceC3646en.b();
                    c1241Pr0A.e = Integer.valueOf(interfaceC3646en.a());
                    List<InterfaceC3646en> listC = interfaceC3646en.c();
                    if (listC == null || listC.isEmpty()) {
                        it = it2;
                    } else {
                        ArrayList arrayList5 = new ArrayList();
                        for (InterfaceC3646en interfaceC3646en2 : listC) {
                            this.b.put(Integer.valueOf(interfaceC3646en2.getId()), interfaceC3646en2);
                            arrayList5.add(a(interfaceC3646en2, this.a));
                            it2 = it2;
                        }
                        it = it2;
                        c1241Pr0A.b = arrayList5;
                    }
                    C8211ye c8211yeL = c1241Pr0A.l();
                    linkedHashSet.add(c8211yeL);
                    hashSet.add(c8211yeL.a);
                    Iterator it3 = c8211yeL.b.iterator();
                    while (it3.hasNext()) {
                        hashSet.add((AbstractC4314iH) it3.next());
                    }
                    it2 = it;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C0468Ft0 c0468Ft0B = C0468Ft0.b();
        for (CaptureRequest.Key key : c4409inE.c.keySet()) {
            c0468Ft0B.e(new C0572Hc("camera2.captureRequest.option." + key.getName(), Object.class, key), c4409inE.c.get(key));
        }
        C0873Ky0 c0873Ky0A = C0873Ky0.a(c0468Ft0B);
        C1016Mu0 c1016Mu0 = new C1016Mu0(28);
        c1016Mu0.b = c0873Ky0A;
        C0468Ft0 c0468Ft0C = C0468Ft0.c(c1016Mu0);
        int i = c4409inE.a;
        int i2 = c4409inE.b;
        HandlerThread handlerThread = new HandlerThread("CameraX-extensions_image_reader");
        this.c = handlerThread;
        handlerThread.start();
        AbstractC0759Jm0.f("SessionProcessorBase");
        ArrayList arrayList6 = new ArrayList(linkedHashSet);
        ArrayList arrayList7 = new ArrayList(arrayList2);
        ArrayList arrayList8 = new ArrayList(arrayList3);
        ArrayList arrayList9 = new ArrayList(arrayList4);
        ArrayList arrayList10 = new ArrayList(hashSet);
        C0873Ky0 c0873Ky0A2 = C0873Ky0.a(c0468Ft0C);
        ArrayList arrayList11 = new ArrayList(arrayList);
        C6974s81 c6974s81 = C6974s81.b;
        ArrayMap arrayMap = new ArrayMap();
        for (String str : c0858Kt0A.a.keySet()) {
            arrayMap.put(str, c0858Kt0A.a.get(str));
        }
        return new C8194yY0(arrayList6, arrayList7, arrayList8, arrayList9, new C1702Vp(arrayList10, c0873Ky0A2, i, false, arrayList11, false, new C6974s81(arrayMap), null), null, null, i2, null);
    }

    public abstract C4409in e(String str, LinkedHashMap linkedHashMap, C4001ge c4001ge);

    public abstract void f();

    public abstract void g(C4219hn c4219hn);

    public final void h(final int i, final InterfaceC3712f70 interfaceC3712f70) {
        ImageReader imageReader;
        final String strB;
        synchronized (this.e) {
            imageReader = (ImageReader) this.a.get(Integer.valueOf(i));
            InterfaceC3646en interfaceC3646en = (InterfaceC3646en) this.b.get(Integer.valueOf(i));
            strB = interfaceC3646en == null ? null : interfaceC3646en.b();
        }
        if (imageReader != null) {
            imageReader.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: eZ0
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader2) {
                    InterfaceC3712f70 interfaceC3712f702 = interfaceC3712f70;
                    int i2 = i;
                    String str = strB;
                    try {
                        Image imageAcquireNextImage = imageReader2.acquireNextImage();
                        interfaceC3712f702.onNextImageAvailable(i2, imageAcquireNextImage.getTimestamp(), new C3796fZ0(imageAcquireNextImage), str);
                    } catch (IllegalStateException unused) {
                        AbstractC0759Jm0.f("SessionProcessorBase");
                    }
                }
            }, new Handler(this.c.getLooper()));
        }
    }

    public abstract void i(C3456dn c3456dn);

    public abstract int j(boolean z, C6974s81 c6974s81, VY vy);

    public abstract int k(C6974s81 c6974s81, InterfaceC3415dZ0 interfaceC3415dZ0);

    public abstract int l(C1562Tu0 c1562Tu0, C6974s81 c6974s81, VY vy);

    public abstract void m();
}
