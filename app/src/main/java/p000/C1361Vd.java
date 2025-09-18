package p000;

import android.media.MediaCodec;
import android.media.MediaMuxer;
import android.util.Size;
import android.view.Surface;
import io.sentry.C5759D1;
import io.sentry.EnumC6069n1;
import io.sentry.android.replay.video.C5967a;
import io.sentry.android.replay.video.C5968b;
import io.sentry.android.replay.video.C5969c;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;

/* renamed from: Vd */
/* loaded from: classes.dex */
public final class C1361Vd {

    /* renamed from: a */
    public Object f12660a;

    /* renamed from: b */
    public Object f12661b;

    /* renamed from: c */
    public Object f12662c;

    /* renamed from: d */
    public Object f12663d;

    /* renamed from: e */
    public Object f12664e;

    /* renamed from: f */
    public Object f12665f;

    /* renamed from: g */
    public Object f12666g;

    /* renamed from: h */
    public Object f12667h;

    /* renamed from: i */
    public Object f12668i;

    public C1361Vd(C5759D1 c5759d1, C5967a c5967a) {
        O90.m5968f(c5759d1, "options");
        this.f12662c = c5759d1;
        this.f12663d = c5967a;
        this.f12664e = null;
        EnumC9659hi0 enumC9659hi0 = EnumC9659hi0.f28539c;
        Lazy lazyM4916c = AbstractC0705LB.m4916c(enumC9659hi0, C5969c.f34054e);
        this.f12661b = lazyM4916c;
        MediaCodec mediaCodecCreateByCodecName = ((Boolean) lazyM4916c.getValue()).booleanValue() ? MediaCodec.createByCodecName("c2.android.avc.encoder") : MediaCodec.createEncoderByType(c5967a.f34047f);
        O90.m5967e(mediaCodecCreateByCodecName, "if (hasExynosCodec) {\n  …onfig.mimeType)\n        }");
        this.f12665f = mediaCodecCreateByCodecName;
        this.f12666g = AbstractC0705LB.m4916c(enumC9659hi0, new S51(11, this));
        this.f12660a = new MediaCodec.BufferInfo();
        String absolutePath = c5967a.f34042a.getAbsolutePath();
        O90.m5967e(absolutePath, "muxerConfig.file.absolutePath");
        this.f12667h = new C5968b(absolutePath, c5967a.f34045d);
    }

    /* renamed from: a */
    public C1362Ve m8516a() {
        String strM26232i = ((String) this.f12660a) == null ? " mimeType" : "";
        if (((Integer) this.f12661b) == null) {
            strM26232i = strM26232i.concat(" profile");
        }
        if (((EnumC11690xa1) this.f12662c) == null) {
            strM26232i = AbstractC7222ym.m26232i(strM26232i, " inputTimebase");
        }
        if (((Size) this.f12663d) == null) {
            strM26232i = AbstractC7222ym.m26232i(strM26232i, " resolution");
        }
        if (((Integer) this.f12664e) == null) {
            strM26232i = AbstractC7222ym.m26232i(strM26232i, " colorFormat");
        }
        if (((C1425We) this.f12665f) == null) {
            strM26232i = AbstractC7222ym.m26232i(strM26232i, " dataSpace");
        }
        if (((Integer) this.f12666g) == null) {
            strM26232i = AbstractC7222ym.m26232i(strM26232i, " frameRate");
        }
        if (((Integer) this.f12667h) == null) {
            strM26232i = AbstractC7222ym.m26232i(strM26232i, " IFrameInterval");
        }
        if (((Integer) this.f12668i) == null) {
            strM26232i = AbstractC7222ym.m26232i(strM26232i, " bitrate");
        }
        if (strM26232i.isEmpty()) {
            return new C1362Ve((String) this.f12660a, ((Integer) this.f12661b).intValue(), (EnumC11690xa1) this.f12662c, (Size) this.f12663d, ((Integer) this.f12664e).intValue(), (C1425We) this.f12665f, ((Integer) this.f12666g).intValue(), ((Integer) this.f12667h).intValue(), ((Integer) this.f12668i).intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strM26232i));
    }

    /* renamed from: b */
    public C1361Vd m8517b(InterfaceC0140CD interfaceC0140CD, List list, InterfaceC8392Ut0 interfaceC8392Ut0, C10226m71 c10226m71, C7383Bi1 c7383Bi1, AbstractC6902th abstractC6902th) {
        O90.m5968f(list, "typeParameterProtos");
        O90.m5968f(interfaceC8392Ut0, "nameResolver");
        O90.m5968f(c10226m71, "typeTable");
        O90.m5968f(c7383Bi1, "versionRequirementTable");
        O90.m5968f(abstractC6902th, "metadataVersion");
        int i = abstractC6902th.f43217b;
        return new C1361Vd((C7129xI) this.f12662c, interfaceC8392Ut0, interfaceC0140CD, c10226m71, ((i != 1 || abstractC6902th.f43218c < 4) && i <= 1) ? (C7383Bi1) this.f12665f : c7383Bi1, abstractC6902th, (C10673pd0) this.f12660a, (C8569Yd1) this.f12667h, list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x014a, code lost:
    
        throw new java.lang.RuntimeException(p000.AbstractC7222ym.m26230g(r5, "encoderOutputBuffer ", " was null"));
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m8518d(boolean r13) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1361Vd.m8518d(boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x001c  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m8519e(android.graphics.Bitmap r4) {
        /*
            r3 = this;
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "MANUFACTURER"
            p000.O90.m5967e(r0, r1)
            java.lang.String r1 = "xiaomi"
            r2 = 1
            boolean r0 = p000.AbstractC11374v51.m25351p(r0, r1, r2)
            r1 = 0
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r3.f12668i
            android.view.Surface r0 = (android.view.Surface) r0
            if (r0 == 0) goto L1c
            android.graphics.Canvas r0 = r0.lockCanvas(r1)
            goto L28
        L1c:
            r0 = r1
            goto L28
        L1e:
            java.lang.Object r0 = r3.f12668i
            android.view.Surface r0 = (android.view.Surface) r0
            if (r0 == 0) goto L1c
            android.graphics.Canvas r0 = r0.lockHardwareCanvas()
        L28:
            if (r0 == 0) goto L2e
            r2 = 0
            r0.drawBitmap(r4, r2, r2, r1)
        L2e:
            java.lang.Object r4 = r3.f12668i
            android.view.Surface r4 = (android.view.Surface) r4
            if (r4 == 0) goto L37
            r4.unlockCanvasAndPost(r0)
        L37:
            r4 = 0
            r3.m8518d(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1361Vd.m8519e(android.graphics.Bitmap):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x003f A[Catch: Exception -> 0x0082, TryCatch #4 {Exception -> 0x0082, blocks: (B:48:0x0002, B:50:0x0008, B:62:0x0031, B:67:0x003f, B:69:0x004f, B:71:0x005e, B:73:0x007a, B:70:0x0057, B:63:0x0035, B:64:0x0038, B:65:0x0039), top: B:81:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p000.BZ0 m8520f(int r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = 2
            boolean r1 = p000.AbstractC7222ym.m26226c(r1, r7)     // Catch: java.lang.Exception -> L82
            if (r1 != 0) goto L82
            java.lang.Object r1 = r6.f12665f     // Catch: java.lang.Exception -> L82
            Bm1 r1 = (p000.C7391Bm1) r1     // Catch: java.lang.Exception -> L82
            r1.getClass()     // Catch: java.lang.Exception -> L82
            java.lang.Object r1 = r1.f1022b     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2d
            java.io.File r1 = (java.io.File) r1     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2d
            boolean r2 = r1.exists()     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2d
            if (r2 == 0) goto L2f
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2d
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2d
            java.lang.String r1 = p000.AbstractC1378Vu.m8631p(r2)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L39
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
            p000.AbstractC1378Vu.m8619d(r2)     // Catch: java.lang.Exception -> L82
            goto L3d
        L35:
            p000.AbstractC1378Vu.m8619d(r2)     // Catch: java.lang.Exception -> L82
            throw r7     // Catch: java.lang.Exception -> L82
        L39:
            p000.AbstractC1378Vu.m8619d(r2)     // Catch: java.lang.Exception -> L82
            r3 = r0
        L3d:
            if (r3 == 0) goto L82
            java.lang.Object r1 = r6.f12664e     // Catch: java.lang.Exception -> L82
            rT0 r1 = (p000.C10909rT0) r1     // Catch: java.lang.Exception -> L82
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
            java.lang.Object r1 = r1.f41672a     // Catch: java.lang.Exception -> L82
            OJ1 r1 = (p000.OJ1) r1     // Catch: java.lang.Exception -> L82
            BZ0 r1 = r2.mo3083k(r1, r3)     // Catch: java.lang.Exception -> L82
            r3.toString()     // Catch: java.lang.Exception -> L82
            java.lang.Object r2 = r6.f12661b     // Catch: java.lang.Exception -> L82
            OJ1 r2 = (p000.OJ1) r2     // Catch: java.lang.Exception -> L82
            r2.getClass()     // Catch: java.lang.Exception -> L82
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L82
            boolean r7 = p000.AbstractC7222ym.m26226c(r4, r7)     // Catch: java.lang.Exception -> L82
            if (r7 != 0) goto L81
            long r4 = r1.f906c     // Catch: java.lang.Exception -> L82
            int r7 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r7 >= 0) goto L81
            goto L82
        L81:
            r0 = r1
        L82:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1361Vd.m8520f(int):BZ0");
    }

    /* renamed from: g */
    public BZ0 m8521g() {
        return (BZ0) ((AtomicReference) this.f12667h).get();
    }

    /* renamed from: h */
    public void m8522h() {
        MediaCodec mediaCodec = (MediaCodec) this.f12665f;
        try {
            InterfaceC6434mZ interfaceC6434mZ = (InterfaceC6434mZ) this.f12664e;
            if (interfaceC6434mZ != null) {
                interfaceC6434mZ.invoke();
            }
            m8518d(true);
            mediaCodec.stop();
            mediaCodec.release();
            Surface surface = (Surface) this.f12668i;
            if (surface != null) {
                surface.release();
            }
            MediaMuxer mediaMuxer = ((C5968b) this.f12667h).f34049b;
            mediaMuxer.stop();
            mediaMuxer.release();
        } catch (Throwable th) {
            ((C5759D1) this.f12662c).getLogger().mo21406d(EnumC6069n1.DEBUG, "Failed to properly release video encoder", th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1361Vd(p000.C7129xI r2, p000.InterfaceC8392Ut0 r3, p000.InterfaceC0140CD r4, p000.C10226m71 r5, p000.C7383Bi1 r6, p000.AbstractC6902th r7, p000.C10673pd0 r8, p000.C8569Yd1 r9, java.util.List r10) {
        /*
            r1 = this;
            java.lang.String r0 = "components"
            p000.O90.m5968f(r2, r0)
            java.lang.String r0 = "nameResolver"
            p000.O90.m5968f(r3, r0)
            java.lang.String r0 = "containingDeclaration"
            p000.O90.m5968f(r4, r0)
            java.lang.String r0 = "typeTable"
            p000.O90.m5968f(r5, r0)
            java.lang.String r0 = "versionRequirementTable"
            p000.O90.m5968f(r6, r0)
            java.lang.String r0 = "metadataVersion"
            p000.O90.m5968f(r7, r0)
            java.lang.String r0 = "typeParameters"
            p000.O90.m5968f(r10, r0)
            r1.<init>()
            r1.f12662c = r2
            r1.f12663d = r3
            r1.f12664e = r4
            r1.f12661b = r5
            r1.f12665f = r6
            r1.f12666g = r7
            r1.f12660a = r8
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
            As r3 = r8.m23824a()
            KX r3 = r3.m359b()
            java.lang.String r3 = r3.m4654b()
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
            r1.f12667h = r0
            gq0 r2 = new gq0
            r2.<init>(r1)
            r1.f12668i = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1361Vd.<init>(xI, Ut0, CD, m71, Bi1, th, pd0, Yd1, java.util.List):void");
    }
}
