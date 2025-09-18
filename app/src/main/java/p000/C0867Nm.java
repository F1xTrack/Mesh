package p000;

import android.graphics.Bitmap;
import android.hardware.camera2.CaptureRequest;
import android.media.Image;
import android.media.ImageWriter;
import android.net.Uri;
import com.facebook.imagepipeline.image.EncodedImage;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: Nm */
/* loaded from: classes.dex */
public final /* synthetic */ class C0867Nm implements InterfaceC6471n9, InterfaceC8460Wb0, InterfaceC8216Rj0, InterfaceC7431Cg1, InterfaceC11886z71 {

    /* renamed from: a */
    public final /* synthetic */ int f7990a;

    /* renamed from: b */
    public final /* synthetic */ Object f7991b;

    /* renamed from: c */
    public final /* synthetic */ Object f7992c;

    public /* synthetic */ C0867Nm(int i, HB0 hb0, HB0 hb02) {
        this.f7990a = i;
        this.f7991b = hb0;
        this.f7992c = hb02;
    }

    @Override // p000.InterfaceC7431Cg1
    /* renamed from: a */
    public Object mo1269a() {
        Class cls = (Class) this.f7992c;
        O90.m5968f(cls, "$clazz");
        return ((Method) this.f7991b).invoke(null, cls, Integer.valueOf(this.f7990a));
    }

    @Override // p000.InterfaceC6471n9
    public InterfaceFutureC7800Jj0 apply(Object obj) {
        InterfaceC9457g70 interfaceC9457g70;
        C1056Qm c1056Qm = (C1056Qm) this.f7991b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((ArrayList) this.f7992c).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            C6573om c6573om = c1056Qm.f9772d;
            if (!zHasNext) {
                c6573om.m23551l(arrayList2);
                return AbstractC8301Sz1.m7479b(arrayList);
            }
            C1373Vp c1373Vp = (C1373Vp) it.next();
            C1622Zm c1622Zm = new C1622Zm(c1373Vp);
            InterfaceC7034vn interfaceC7034vn = null;
            int i = c1373Vp.f12780c;
            if (i == 5) {
                C8437Vp1 c8437Vp1 = c6573om.f39239k;
                if (!c8437Vp1.f12793d && !c8437Vp1.f12792c) {
                    try {
                        interfaceC9457g70 = (InterfaceC9457g70) c8437Vp1.f12791b.m953a();
                    } catch (NoSuchElementException unused) {
                        AbstractC7806Jm0.m4412f("ZslControlImpl");
                        interfaceC9457g70 = null;
                    }
                    if (interfaceC9457g70 != null) {
                        C8437Vp1 c8437Vp12 = c6573om.f39239k;
                        c8437Vp12.getClass();
                        Image imageMo18404Z = interfaceC9457g70.mo18404Z();
                        ImageWriter imageWriter = c8437Vp12.f12799j;
                        if (imageWriter != null && imageMo18404Z != null) {
                            try {
                                imageWriter.queueInputImage(imageMo18404Z);
                                K60 k60Mo18403P = interfaceC9457g70.mo18403P();
                                if (k60Mo18403P instanceof C7097wn) {
                                    interfaceC7034vn = ((C7097wn) k60Mo18403P).f45097a;
                                }
                            } catch (IllegalStateException e) {
                                e.getMessage();
                                AbstractC7806Jm0.m4412f("ZslControlImpl");
                            }
                        }
                    }
                }
            }
            if (interfaceC7034vn != null) {
                c1622Zm.f15120h = interfaceC7034vn;
            } else {
                int i2 = (c1056Qm.f9769a != 3 || c1056Qm.f9774f) ? (i == -1 || i == 5) ? 2 : -1 : 4;
                if (i2 != -1) {
                    c1622Zm.f15113a = i2;
                }
            }
            C0856Nb c0856Nb = c1056Qm.f9773e;
            if (c0856Nb.f7895b && this.f7990a == 0 && c0856Nb.f7894a) {
                C7612Ft0 c7612Ft0M2812b = C7612Ft0.m2812b();
                c7612Ft0M2812b.m2815e(C3950dn.m17743L0(CaptureRequest.CONTROL_AE_MODE), 3);
                c1622Zm.m9590c(new C3950dn(6, C7882Ky0.m4786a(c7612Ft0M2812b)));
            }
            arrayList.add(AbstractC11797yQ1.m26149b(new C0071B7(c1056Qm, c1622Zm)));
            arrayList2.add(c1622Zm.m9592e());
        }
    }

    @Override // p000.InterfaceC11886z71
    public Object execute() {
        ((C8575Yg1) this.f7991b).f14446d.m7045a((C1236Te) this.f7992c, this.f7990a + 1, false);
        return null;
    }

    @Override // p000.InterfaceC8216Rj0
    public void invoke(Object obj) {
        GB0 gb0 = (GB0) obj;
        gb0.getClass();
        gb0.mo2959r(this.f7990a, (HB0) this.f7991b, (HB0) this.f7992c);
    }

    @Override // p000.InterfaceC8460Wb0
    /* renamed from: v */
    public void mo5831v(EncodedImage encodedImage, int i) throws Throwable {
        int i2;
        boolean z;
        String str;
        String str2;
        String str3;
        long j;
        String str4;
        InterfaceC7103wt interfaceC7103wt;
        InterfaceC7103wt interfaceC7103wt2;
        InterfaceC7103wt interfaceC7103wtM7626p;
        C1273UE c1273ue;
        int i3 = i;
        AbstractC1209TD abstractC1209TD = (AbstractC1209TD) this.f7991b;
        O90.m5968f(abstractC1209TD, "this$0");
        C1272UD c1272ud = (C1272UD) this.f7992c;
        O90.m5968f(c1272ud, "this$1");
        if (encodedImage != null) {
            RD0 rd0 = abstractC1209TD.f11198c;
            C7027vg c7027vg = (C7027vg) rd0;
            C10737q70 c10737q70 = c7027vg.f44473a;
            c7027vg.m25467i(encodedImage.getImageFormat().f1844a, "image_format");
            Uri uri = c10737q70.f40609b;
            encodedImage.setSource(uri != null ? uri.toString() : null);
            boolean zM7716l = AbstractC1237Tf.m7716l(i3, 16);
            int i4 = c1272ud.f11689e;
            if ((i4 == 1 || (i4 == 2 && !zM7716l)) && (c1272ud.f11690f || !AbstractC8885bh1.m10483d(c10737q70.f40609b))) {
                CT0 ct0 = c10737q70.f40616i;
                O90.m5967e(ct0, "request.rotationOptions");
                encodedImage.setSampleSize(AbstractC8796b02.m10405e(ct0, c10737q70.f40615h, encodedImage, this.f7990a));
            }
            c7027vg.f44484l.f16804t.getClass();
            int i5 = abstractC1209TD.f11204i;
            if ((encodedImage.getImageFormat() == AbstractC0646KF.f5957a || !AbstractC1237Tf.m7715b(i)) && !abstractC1209TD.f11202g && EncodedImage.isValid(encodedImage)) {
                boolean zM5963a = O90.m5963a(encodedImage.getImageFormat(), AbstractC0646KF.f5959c);
                E90 e90 = abstractC1209TD.f11200e;
                if (zM5963a) {
                    long width = encodedImage.getWidth();
                    long height = encodedImage.getHeight();
                    C11756y60 c11756y60 = abstractC1209TD.f11201f;
                    if (width * height * AbstractC6697qi.m24049b(c11756y60.f46088a) > 104857600) {
                        StringBuilder sbM8594m = AbstractC1374Vq.m8594m("Image is too big to attempt decoding: w = ", ", h = ", encodedImage.getWidth(), encodedImage.getHeight(), ", pixel config = ");
                        sbM8594m.append(c11756y60.f46088a);
                        sbM8594m.append(", max bitmap size = 104857600");
                        IllegalStateException illegalStateException = new IllegalStateException(sbM8594m.toString());
                        e90.mo747e(rd0, "DecodeProducer", illegalStateException, null);
                        abstractC1209TD.m7627q(true);
                        abstractC1209TD.f46773b.m7718e(illegalStateException);
                        return;
                    }
                }
                D60 imageFormat = encodedImage.getImageFormat();
                String str5 = imageFormat != null ? imageFormat.f1844a : "unknown";
                String str6 = encodedImage.getWidth() + "x" + encodedImage.getHeight();
                String strValueOf = String.valueOf(encodedImage.getSampleSize());
                boolean zM7714a = AbstractC1237Tf.m7714a(i);
                if (!zM7714a || AbstractC1237Tf.m7716l(i3, 8)) {
                    i2 = 4;
                    z = false;
                } else {
                    i2 = 4;
                    z = true;
                }
                boolean zM7716l2 = AbstractC1237Tf.m7716l(i3, i2);
                C9115dS0 c9115dS0 = c7027vg.f44473a.f40615h;
                if (c9115dS0 != null) {
                    str = c9115dS0.f26115a + "x" + c9115dS0.f26116b;
                } else {
                    str = "unknown";
                }
                try {
                    C8512Xb0 c8512Xb0 = abstractC1209TD.f11203h;
                    synchronized (c8512Xb0) {
                        str2 = str;
                        str3 = str5;
                        j = c8512Xb0.f13866i - c8512Xb0.f13865h;
                    }
                    String string = ((C7027vg) rd0).f44473a.f40609b.toString();
                    O90.m5967e(string, "producerContext.imageRequest.sourceUri.toString()");
                    int size = (z || zM7716l2) ? encodedImage.getSize() : abstractC1209TD.mo6615n(encodedImage);
                    T70 t70Mo6616o = (z || zM7716l2) ? T70.f11167d : abstractC1209TD.mo6616o();
                    e90.mo752j(rd0, "DecodeProducer");
                    try {
                        O90.m5967e(t70Mo6616o, "quality");
                        interfaceC7103wtM7626p = abstractC1209TD.m7626p(encodedImage, size, t70Mo6616o);
                    } catch (C0707LD e) {
                        str4 = "DecodeProducer";
                        interfaceC7103wt = null;
                        try {
                            EncodedImage encodedImage2 = e.f6549a;
                            AbstractC3929dS.m17684q(abstractC1209TD.f11199d, "%s, {uri: %s, firstEncodedBytes: %s, length: %d}", e.getMessage(), string, encodedImage2.getFirstBytesAsHexString(10), Integer.valueOf(encodedImage2.getSize()));
                            throw e;
                        } catch (Exception e2) {
                            e = e2;
                            interfaceC7103wt2 = interfaceC7103wt;
                            O90.m5967e(t70Mo6616o, "quality");
                            e90.mo747e(rd0, str4, e, abstractC1209TD.m7625m(interfaceC7103wt2, j, t70Mo6616o, zM7714a, str3, str6, str2, strValueOf));
                            abstractC1209TD.m7627q(true);
                            abstractC1209TD.f46773b.m7718e(e);
                            EncodedImage.closeSafely(encodedImage);
                        }
                    } catch (Exception e3) {
                        e = e3;
                        str4 = "DecodeProducer";
                        interfaceC7103wt = null;
                        interfaceC7103wt2 = interfaceC7103wt;
                        O90.m5967e(t70Mo6616o, "quality");
                        e90.mo747e(rd0, str4, e, abstractC1209TD.m7625m(interfaceC7103wt2, j, t70Mo6616o, zM7714a, str3, str6, str2, strValueOf));
                        abstractC1209TD.m7627q(true);
                        abstractC1209TD.f46773b.m7718e(e);
                        EncodedImage.closeSafely(encodedImage);
                    }
                    try {
                        if (encodedImage.getSampleSize() != 1) {
                            i3 |= 16;
                        }
                        e90.mo743a(rd0, "DecodeProducer", abstractC1209TD.m7625m(interfaceC7103wtM7626p, j, t70Mo6616o, zM7714a, str3, str6, str2, strValueOf));
                        abstractC1209TD.m7628r(encodedImage, interfaceC7103wtM7626p, i5);
                        G10 g10 = (G10) abstractC1209TD.f11205j.f11693i.f7393b;
                        if (interfaceC7103wtM7626p == null) {
                            c1273ue = null;
                        } else {
                            OL0 ol0 = AbstractC7292zt.f47071e;
                            g10.mo2898g();
                            boolean z2 = interfaceC7103wtM7626p instanceof Bitmap;
                            c1273ue = new C1273UE(interfaceC7103wtM7626p, ol0, g10, null, true);
                        }
                        try {
                            abstractC1209TD.m7627q(AbstractC1237Tf.m7714a(i3));
                            abstractC1209TD.f46773b.m7719g(i3, c1273ue);
                            EncodedImage.closeSafely(encodedImage);
                        } finally {
                            AbstractC7292zt.m26569p(c1273ue);
                        }
                    } catch (Exception e4) {
                        e = e4;
                        str4 = "DecodeProducer";
                        interfaceC7103wt2 = interfaceC7103wtM7626p;
                        O90.m5967e(t70Mo6616o, "quality");
                        e90.mo747e(rd0, str4, e, abstractC1209TD.m7625m(interfaceC7103wt2, j, t70Mo6616o, zM7714a, str3, str6, str2, strValueOf));
                        abstractC1209TD.m7627q(true);
                        abstractC1209TD.f46773b.m7718e(e);
                        EncodedImage.closeSafely(encodedImage);
                    }
                } catch (Throwable th) {
                    EncodedImage.closeSafely(encodedImage);
                    throw th;
                }
            }
        }
    }

    public /* synthetic */ C0867Nm(Object obj, int i, Object obj2) {
        this.f7991b = obj;
        this.f7992c = obj2;
        this.f7990a = i;
    }
}
