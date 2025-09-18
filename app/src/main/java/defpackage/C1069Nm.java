package defpackage;

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
public final /* synthetic */ class C1069Nm implements InterfaceC6021n9, InterfaceC1739Wb0, InterfaceC1373Rj0, InterfaceC0196Cg1, InterfaceC8304z71 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C1069Nm(int i, HB0 hb0, HB0 hb02) {
        this.a = i;
        this.b = hb0;
        this.c = hb02;
    }

    @Override // defpackage.InterfaceC0196Cg1
    public Object a() {
        Class cls = (Class) this.c;
        O90.f(cls, "$clazz");
        return ((Method) this.b).invoke(null, cls, Integer.valueOf(this.a));
    }

    @Override // defpackage.InterfaceC6021n9
    public InterfaceFutureC0750Jj0 apply(Object obj) {
        InterfaceC3903g70 interfaceC3903g70;
        C1303Qm c1303Qm = (C1303Qm) this.b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((ArrayList) this.c).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            C6329om c6329om = c1303Qm.d;
            if (!zHasNext) {
                c6329om.l(arrayList2);
                return AbstractC1500Sz1.b(arrayList);
            }
            C1702Vp c1702Vp = (C1702Vp) it.next();
            C2005Zm c2005Zm = new C2005Zm(c1702Vp);
            InterfaceC7668vn interfaceC7668vn = null;
            int i = c1702Vp.c;
            if (i == 5) {
                C1704Vp1 c1704Vp1 = c6329om.k;
                if (!c1704Vp1.d && !c1704Vp1.c) {
                    try {
                        interfaceC3903g70 = (InterfaceC3903g70) c1704Vp1.b.a();
                    } catch (NoSuchElementException unused) {
                        AbstractC0759Jm0.f("ZslControlImpl");
                        interfaceC3903g70 = null;
                    }
                    if (interfaceC3903g70 != null) {
                        C1704Vp1 c1704Vp12 = c6329om.k;
                        c1704Vp12.getClass();
                        Image imageZ = interfaceC3903g70.Z();
                        ImageWriter imageWriter = c1704Vp12.j;
                        if (imageWriter != null && imageZ != null) {
                            try {
                                imageWriter.queueInputImage(imageZ);
                                K60 k60P = interfaceC3903g70.P();
                                if (k60P instanceof C7858wn) {
                                    interfaceC7668vn = ((C7858wn) k60P).a;
                                }
                            } catch (IllegalStateException e) {
                                e.getMessage();
                                AbstractC0759Jm0.f("ZslControlImpl");
                            }
                        }
                    }
                }
            }
            if (interfaceC7668vn != null) {
                c2005Zm.h = interfaceC7668vn;
            } else {
                int i2 = (c1303Qm.a != 3 || c1303Qm.f) ? (i == -1 || i == 5) ? 2 : -1 : 4;
                if (i2 != -1) {
                    c2005Zm.a = i2;
                }
            }
            C1036Nb c1036Nb = c1303Qm.e;
            if (c1036Nb.b && this.a == 0 && c1036Nb.a) {
                C0468Ft0 c0468Ft0B = C0468Ft0.b();
                c0468Ft0B.e(C3456dn.L0(CaptureRequest.CONTROL_AE_MODE), 3);
                c2005Zm.c(new C3456dn(6, C0873Ky0.a(c0468Ft0B)));
            }
            arrayList.add(AbstractC8171yQ1.b(new B7(c1303Qm, c2005Zm)));
            arrayList2.add(c2005Zm.e());
        }
    }

    @Override // defpackage.InterfaceC8304z71
    public Object execute() {
        ((C1911Yg1) this.b).d.a((C1513Te) this.c, this.a + 1, false);
        return null;
    }

    @Override // defpackage.InterfaceC1373Rj0
    public void invoke(Object obj) {
        GB0 gb0 = (GB0) obj;
        gb0.getClass();
        gb0.r(this.a, (HB0) this.b, (HB0) this.c);
    }

    @Override // defpackage.InterfaceC1739Wb0
    public void v(EncodedImage encodedImage, int i) throws Throwable {
        int i2;
        boolean z;
        String str;
        String str2;
        String str3;
        long j;
        String str4;
        InterfaceC7876wt interfaceC7876wt;
        InterfaceC7876wt interfaceC7876wt2;
        InterfaceC7876wt interfaceC7876wtP;
        UE ue;
        int i3 = i;
        TD td = (TD) this.b;
        O90.f(td, "this$0");
        UD ud = (UD) this.c;
        O90.f(ud, "this$1");
        if (encodedImage != null) {
            RD0 rd0 = td.c;
            C7647vg c7647vg = (C7647vg) rd0;
            C6589q70 c6589q70 = c7647vg.a;
            c7647vg.i(encodedImage.getImageFormat().a, "image_format");
            Uri uri = c6589q70.b;
            encodedImage.setSource(uri != null ? uri.toString() : null);
            boolean zL = AbstractC1516Tf.l(i3, 16);
            int i4 = ud.e;
            if ((i4 == 1 || (i4 == 2 && !zL)) && (ud.f || !AbstractC2374bh1.d(c6589q70.b))) {
                CT0 ct0 = c6589q70.i;
                O90.e(ct0, "request.rotationOptions");
                encodedImage.setSampleSize(AbstractC2242b02.e(ct0, c6589q70.h, encodedImage, this.a));
            }
            c7647vg.l.t.getClass();
            int i5 = td.i;
            if ((encodedImage.getImageFormat() == KF.a || !AbstractC1516Tf.b(i)) && !td.g && EncodedImage.isValid(encodedImage)) {
                boolean zA = O90.a(encodedImage.getImageFormat(), KF.c);
                E90 e90 = td.e;
                if (zA) {
                    long width = encodedImage.getWidth();
                    long height = encodedImage.getHeight();
                    C8110y60 c8110y60 = td.f;
                    if (width * height * AbstractC6699qi.b(c8110y60.a) > 104857600) {
                        StringBuilder sbM = AbstractC1705Vq.m("Image is too big to attempt decoding: w = ", ", h = ", encodedImage.getWidth(), encodedImage.getHeight(), ", pixel config = ");
                        sbM.append(c8110y60.a);
                        sbM.append(", max bitmap size = 104857600");
                        IllegalStateException illegalStateException = new IllegalStateException(sbM.toString());
                        e90.e(rd0, "DecodeProducer", illegalStateException, null);
                        td.q(true);
                        td.b.e(illegalStateException);
                        return;
                    }
                }
                D60 imageFormat = encodedImage.getImageFormat();
                String str5 = imageFormat != null ? imageFormat.a : "unknown";
                String str6 = encodedImage.getWidth() + "x" + encodedImage.getHeight();
                String strValueOf = String.valueOf(encodedImage.getSampleSize());
                boolean zA2 = AbstractC1516Tf.a(i);
                if (!zA2 || AbstractC1516Tf.l(i3, 8)) {
                    i2 = 4;
                    z = false;
                } else {
                    i2 = 4;
                    z = true;
                }
                boolean zL2 = AbstractC1516Tf.l(i3, i2);
                C3394dS0 c3394dS0 = c7647vg.a.h;
                if (c3394dS0 != null) {
                    str = c3394dS0.a + "x" + c3394dS0.b;
                } else {
                    str = "unknown";
                }
                try {
                    C1817Xb0 c1817Xb0 = td.h;
                    synchronized (c1817Xb0) {
                        str2 = str;
                        str3 = str5;
                        j = c1817Xb0.i - c1817Xb0.h;
                    }
                    String string = ((C7647vg) rd0).a.b.toString();
                    O90.e(string, "producerContext.imageRequest.sourceUri.toString()");
                    int size = (z || zL2) ? encodedImage.getSize() : td.n(encodedImage);
                    T70 t70O = (z || zL2) ? T70.d : td.o();
                    e90.j(rd0, "DecodeProducer");
                    try {
                        O90.e(t70O, "quality");
                        interfaceC7876wtP = td.p(encodedImage, size, t70O);
                    } catch (LD e) {
                        str4 = "DecodeProducer";
                        interfaceC7876wt = null;
                        try {
                            EncodedImage encodedImage2 = e.a;
                            AbstractC3393dS.q(td.d, "%s, {uri: %s, firstEncodedBytes: %s, length: %d}", e.getMessage(), string, encodedImage2.getFirstBytesAsHexString(10), Integer.valueOf(encodedImage2.getSize()));
                            throw e;
                        } catch (Exception e2) {
                            e = e2;
                            interfaceC7876wt2 = interfaceC7876wt;
                            O90.e(t70O, "quality");
                            e90.e(rd0, str4, e, td.m(interfaceC7876wt2, j, t70O, zA2, str3, str6, str2, strValueOf));
                            td.q(true);
                            td.b.e(e);
                            EncodedImage.closeSafely(encodedImage);
                        }
                    } catch (Exception e3) {
                        e = e3;
                        str4 = "DecodeProducer";
                        interfaceC7876wt = null;
                        interfaceC7876wt2 = interfaceC7876wt;
                        O90.e(t70O, "quality");
                        e90.e(rd0, str4, e, td.m(interfaceC7876wt2, j, t70O, zA2, str3, str6, str2, strValueOf));
                        td.q(true);
                        td.b.e(e);
                        EncodedImage.closeSafely(encodedImage);
                    }
                    try {
                        if (encodedImage.getSampleSize() != 1) {
                            i3 |= 16;
                        }
                        e90.a(rd0, "DecodeProducer", td.m(interfaceC7876wtP, j, t70O, zA2, str3, str6, str2, strValueOf));
                        td.r(encodedImage, interfaceC7876wtP, i5);
                        G10 g10 = (G10) td.j.i.b;
                        if (interfaceC7876wtP == null) {
                            ue = null;
                        } else {
                            OL0 ol0 = AbstractC8446zt.e;
                            g10.g();
                            boolean z2 = interfaceC7876wtP instanceof Bitmap;
                            ue = new UE(interfaceC7876wtP, ol0, g10, null, true);
                        }
                        try {
                            td.q(AbstractC1516Tf.a(i3));
                            td.b.g(i3, ue);
                            EncodedImage.closeSafely(encodedImage);
                        } finally {
                            AbstractC8446zt.p(ue);
                        }
                    } catch (Exception e4) {
                        e = e4;
                        str4 = "DecodeProducer";
                        interfaceC7876wt2 = interfaceC7876wtP;
                        O90.e(t70O, "quality");
                        e90.e(rd0, str4, e, td.m(interfaceC7876wt2, j, t70O, zA2, str3, str6, str2, strValueOf));
                        td.q(true);
                        td.b.e(e);
                        EncodedImage.closeSafely(encodedImage);
                    }
                } catch (Throwable th) {
                    EncodedImage.closeSafely(encodedImage);
                    throw th;
                }
            }
        }
    }

    public /* synthetic */ C1069Nm(Object obj, int i, Object obj2) {
        this.b = obj;
        this.c = obj2;
        this.a = i;
    }
}
