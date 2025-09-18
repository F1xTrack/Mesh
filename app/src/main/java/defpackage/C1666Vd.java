package defpackage;

import android.media.MediaCodec;
import android.media.MediaMuxer;
import android.util.Size;
import android.view.Surface;
import io.sentry.D1;
import io.sentry.EnumC5148n1;
import io.sentry.android.replay.video.a;
import io.sentry.android.replay.video.b;
import io.sentry.android.replay.video.c;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;

/* renamed from: Vd */
/* loaded from: classes.dex */
public final class C1666Vd {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public C1666Vd(D1 d1, a aVar) {
        O90.f(d1, "options");
        this.c = d1;
        this.d = aVar;
        this.e = null;
        EnumC4205hi0 enumC4205hi0 = EnumC4205hi0.c;
        Lazy lazyC = LB.c(enumC4205hi0, c.e);
        this.b = lazyC;
        MediaCodec mediaCodecCreateByCodecName = ((Boolean) lazyC.getValue()).booleanValue() ? MediaCodec.createByCodecName("c2.android.avc.encoder") : MediaCodec.createEncoderByType(aVar.f);
        O90.e(mediaCodecCreateByCodecName, "if (hasExynosCodec) {\n  …onfig.mimeType)\n        }");
        this.f = mediaCodecCreateByCodecName;
        this.g = LB.c(enumC4205hi0, new S51(11, this));
        this.a = new MediaCodec.BufferInfo();
        String absolutePath = aVar.a.getAbsolutePath();
        O90.e(absolutePath, "muxerConfig.file.absolutePath");
        this.h = new b(absolutePath, aVar.d);
    }

    public C1669Ve a() {
        String strI = ((String) this.a) == null ? " mimeType" : "";
        if (((Integer) this.b) == null) {
            strI = strI.concat(" profile");
        }
        if (((EnumC8011xa1) this.c) == null) {
            strI = AbstractC8235ym.i(strI, " inputTimebase");
        }
        if (((Size) this.d) == null) {
            strI = AbstractC8235ym.i(strI, " resolution");
        }
        if (((Integer) this.e) == null) {
            strI = AbstractC8235ym.i(strI, " colorFormat");
        }
        if (((C1747We) this.f) == null) {
            strI = AbstractC8235ym.i(strI, " dataSpace");
        }
        if (((Integer) this.g) == null) {
            strI = AbstractC8235ym.i(strI, " frameRate");
        }
        if (((Integer) this.h) == null) {
            strI = AbstractC8235ym.i(strI, " IFrameInterval");
        }
        if (((Integer) this.i) == null) {
            strI = AbstractC8235ym.i(strI, " bitrate");
        }
        if (strI.isEmpty()) {
            return new C1669Ve((String) this.a, ((Integer) this.b).intValue(), (EnumC8011xa1) this.c, (Size) this.d, ((Integer) this.e).intValue(), (C1747We) this.f, ((Integer) this.g).intValue(), ((Integer) this.h).intValue(), ((Integer) this.i).intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strI));
    }

    public C1666Vd b(CD cd, List list, InterfaceC1637Ut0 interfaceC1637Ut0, C5826m71 c5826m71, C0124Bi1 c0124Bi1, AbstractC7268th abstractC7268th) {
        O90.f(list, "typeParameterProtos");
        O90.f(interfaceC1637Ut0, "nameResolver");
        O90.f(c5826m71, "typeTable");
        O90.f(c0124Bi1, "versionRequirementTable");
        O90.f(abstractC7268th, "metadataVersion");
        int i = abstractC7268th.b;
        return new C1666Vd((C7955xI) this.c, interfaceC1637Ut0, cd, c5826m71, ((i != 1 || abstractC7268th.c < 4) && i <= 1) ? (C0124Bi1) this.f : c0124Bi1, abstractC7268th, (C6494pd0) this.a, (C1902Yd1) this.h, list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x014a, code lost:
    
        throw new java.lang.RuntimeException(defpackage.AbstractC8235ym.g(r5, "encoderOutputBuffer ", " was null"));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(boolean r13) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1666Vd.d(boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(android.graphics.Bitmap r4) {
        /*
            r3 = this;
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "MANUFACTURER"
            defpackage.O90.e(r0, r1)
            java.lang.String r1 = "xiaomi"
            r2 = 1
            boolean r0 = defpackage.AbstractC7538v51.p(r0, r1, r2)
            r1 = 0
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r3.i
            android.view.Surface r0 = (android.view.Surface) r0
            if (r0 == 0) goto L1c
            android.graphics.Canvas r0 = r0.lockCanvas(r1)
            goto L28
        L1c:
            r0 = r1
            goto L28
        L1e:
            java.lang.Object r0 = r3.i
            android.view.Surface r0 = (android.view.Surface) r0
            if (r0 == 0) goto L1c
            android.graphics.Canvas r0 = r0.lockHardwareCanvas()
        L28:
            if (r0 == 0) goto L2e
            r2 = 0
            r0.drawBitmap(r4, r2, r2, r1)
        L2e:
            java.lang.Object r4 = r3.i
            android.view.Surface r4 = (android.view.Surface) r4
            if (r4 == 0) goto L37
            r4.unlockCanvasAndPost(r0)
        L37:
            r4 = 0
            r3.d(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1666Vd.e(android.graphics.Bitmap):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x003f A[Catch: Exception -> 0x0082, TryCatch #4 {Exception -> 0x0082, blocks: (B:48:0x0002, B:50:0x0008, B:62:0x0031, B:67:0x003f, B:69:0x004f, B:71:0x005e, B:73:0x007a, B:70:0x0057, B:63:0x0035, B:64:0x0038, B:65:0x0039), top: B:81:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.BZ0 f(int r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = 2
            boolean r1 = defpackage.AbstractC8235ym.c(r1, r7)     // Catch: java.lang.Exception -> L82
            if (r1 != 0) goto L82
            java.lang.Object r1 = r6.f     // Catch: java.lang.Exception -> L82
            Bm1 r1 = (defpackage.C0136Bm1) r1     // Catch: java.lang.Exception -> L82
            r1.getClass()     // Catch: java.lang.Exception -> L82
            java.lang.Object r1 = r1.b     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2d
            java.io.File r1 = (java.io.File) r1     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2d
            boolean r2 = r1.exists()     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2d
            if (r2 == 0) goto L2f
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2d
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2d
            java.lang.String r1 = defpackage.AbstractC1717Vu.p(r2)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L39
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L39
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L39
            goto L31
        L28:
            r7 = move-exception
            goto L35
        L2a:
            r7 = move-exception
            r2 = r0
            goto L35
        L2d:
            r2 = r0
            goto L39
        L2f:
            r2 = r0
            r3 = r2
        L31:
            defpackage.AbstractC1717Vu.d(r2)     // Catch: java.lang.Exception -> L82
            goto L3d
        L35:
            defpackage.AbstractC1717Vu.d(r2)     // Catch: java.lang.Exception -> L82
            throw r7     // Catch: java.lang.Exception -> L82
        L39:
            defpackage.AbstractC1717Vu.d(r2)     // Catch: java.lang.Exception -> L82
            r3 = r0
        L3d:
            if (r3 == 0) goto L82
            java.lang.Object r1 = r6.e     // Catch: java.lang.Exception -> L82
            rT0 r1 = (defpackage.C6845rT0) r1     // Catch: java.lang.Exception -> L82
            r1.getClass()     // Catch: java.lang.Exception -> L82
            java.lang.String r2 = "settings_version"
            int r2 = r3.getInt(r2)     // Catch: java.lang.Exception -> L82
            r4 = 3
            if (r2 == r4) goto L57
            jt0 r2 = new jt0     // Catch: java.lang.Exception -> L82
            r5 = 12
            r2.<init>(r5)     // Catch: java.lang.Exception -> L82
            goto L5e
        L57:
            fN r2 = new fN     // Catch: java.lang.Exception -> L82
            r5 = 21
            r2.<init>(r5)     // Catch: java.lang.Exception -> L82
        L5e:
            java.lang.Object r1 = r1.a     // Catch: java.lang.Exception -> L82
            OJ1 r1 = (defpackage.OJ1) r1     // Catch: java.lang.Exception -> L82
            BZ0 r1 = r2.k(r1, r3)     // Catch: java.lang.Exception -> L82
            r3.toString()     // Catch: java.lang.Exception -> L82
            java.lang.Object r2 = r6.b     // Catch: java.lang.Exception -> L82
            OJ1 r2 = (defpackage.OJ1) r2     // Catch: java.lang.Exception -> L82
            r2.getClass()     // Catch: java.lang.Exception -> L82
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L82
            boolean r7 = defpackage.AbstractC8235ym.c(r4, r7)     // Catch: java.lang.Exception -> L82
            if (r7 != 0) goto L81
            long r4 = r1.c     // Catch: java.lang.Exception -> L82
            int r7 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r7 >= 0) goto L81
            goto L82
        L81:
            r0 = r1
        L82:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1666Vd.f(int):BZ0");
    }

    public BZ0 g() {
        return (BZ0) ((AtomicReference) this.h).get();
    }

    public void h() {
        MediaCodec mediaCodec = (MediaCodec) this.f;
        try {
            InterfaceC5908mZ interfaceC5908mZ = (InterfaceC5908mZ) this.e;
            if (interfaceC5908mZ != null) {
                interfaceC5908mZ.invoke();
            }
            d(true);
            mediaCodec.stop();
            mediaCodec.release();
            Surface surface = (Surface) this.i;
            if (surface != null) {
                surface.release();
            }
            MediaMuxer mediaMuxer = ((b) this.h).b;
            mediaMuxer.stop();
            mediaMuxer.release();
        } catch (Throwable th) {
            ((D1) this.c).getLogger().d(EnumC5148n1.DEBUG, "Failed to properly release video encoder", th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1666Vd(defpackage.C7955xI r2, defpackage.InterfaceC1637Ut0 r3, defpackage.CD r4, defpackage.C5826m71 r5, defpackage.C0124Bi1 r6, defpackage.AbstractC7268th r7, defpackage.C6494pd0 r8, defpackage.C1902Yd1 r9, java.util.List r10) {
        /*
            r1 = this;
            java.lang.String r0 = "components"
            defpackage.O90.f(r2, r0)
            java.lang.String r0 = "nameResolver"
            defpackage.O90.f(r3, r0)
            java.lang.String r0 = "containingDeclaration"
            defpackage.O90.f(r4, r0)
            java.lang.String r0 = "typeTable"
            defpackage.O90.f(r5, r0)
            java.lang.String r0 = "versionRequirementTable"
            defpackage.O90.f(r6, r0)
            java.lang.String r0 = "metadataVersion"
            defpackage.O90.f(r7, r0)
            java.lang.String r0 = "typeParameters"
            defpackage.O90.f(r10, r0)
            r1.<init>()
            r1.c = r2
            r1.d = r3
            r1.e = r4
            r1.b = r5
            r1.f = r6
            r1.g = r7
            r1.a = r8
            Yd1 r0 = new Yd1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Deserializer for \""
            r2.<init>(r3)
            Tt0 r3 = r4.getName()
            r2.append(r3)
            r3 = 34
            r2.append(r3)
            java.lang.String r6 = r2.toString()
            if (r8 == 0) goto L73
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Class '"
            r2.<init>(r3)
            As r3 = r8.a()
            KX r3 = r3.b()
            java.lang.String r3 = r3.b()
            r2.append(r3)
            r3 = 39
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            if (r2 != 0) goto L71
            goto L73
        L71:
            r7 = r2
            goto L76
        L73:
            java.lang.String r2 = "[container not found]"
            goto L71
        L76:
            r2 = r0
            r3 = r1
            r4 = r9
            r5 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            r1.h = r0
            gq0 r2 = new gq0
            r2.<init>(r1)
            r1.i = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1666Vd.<init>(xI, Ut0, CD, m71, Bi1, th, pd0, Yd1, java.util.List):void");
    }
}
