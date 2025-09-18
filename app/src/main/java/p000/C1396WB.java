package p000;

import android.content.Intent;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.util.Base64;
import android.view.Surface;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.network.NetworkingModule;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Pattern;

/* renamed from: WB */
/* loaded from: classes.dex */
public final class C1396WB implements InterfaceC7758Io0, InterfaceC6883tO, InterfaceC0111Bl {

    /* renamed from: a */
    public boolean f13033a;

    /* renamed from: b */
    public int f13034b;

    /* renamed from: c */
    public final Object f13035c;

    /* renamed from: d */
    public final Object f13036d;

    /* renamed from: e */
    public Object f13037e;

    public C1396WB(String str, C9196e41 c9196e41) throws NumberFormatException {
        boolean z;
        int i;
        this.f13036d = new HashMap();
        this.f13035c = str;
        try {
            i = Integer.parseInt(str);
            z = true;
        } catch (NumberFormatException unused) {
            AbstractC7806Jm0.m4412f("Camera2EncoderProfilesProvider");
            z = false;
            i = -1;
        }
        this.f13033a = z;
        this.f13034b = i;
        this.f13037e = c9196e41;
    }

    /* renamed from: e */
    public static void m8704e(C1396WB c1396wb, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        C0073B9 c0073b9 = (C0073B9) c1396wb.f13036d;
        YN1.m9281f(c0073b9.f592c == null);
        HandlerThread handlerThread = c0073b9.f591b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = (MediaCodec) c1396wb.f13035c;
        mediaCodec.setCallback(c0073b9, handler);
        c0073b9.f592c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        Trace.endSection();
        ((InterfaceC7914Lo0) c1396wb.f13037e).start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        c1396wb.f13034b = 1;
    }

    /* renamed from: g */
    public static String m8705g(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // p000.InterfaceC0111Bl
    /* renamed from: Z */
    public void mo851Z(InterfaceC6843sl interfaceC6843sl, HS0 hs0) {
        String str;
        InterfaceC10325mv0 interfaceC10325mv0;
        NetworkingModule networkingModule = (NetworkingModule) this.f13037e;
        if (networkingModule.mShuttingDown) {
            return;
        }
        int i = this.f13034b;
        networkingModule.removeRequest(i);
        K20 k20 = hs0.f4300f;
        WritableMap writableMapTranslateHeaders = NetworkingModule.translateHeaders(k20);
        C10777qR0 c10777qR0 = hs0.f4295a;
        String str2 = c10777qR0.f40870a.f1835h;
        WritableArray writableArrayCreateArray = Arguments.createArray();
        writableArrayCreateArray.pushInt(i);
        writableArrayCreateArray.pushInt(hs0.f4298d);
        writableArrayCreateArray.pushMap(writableMapTranslateHeaders);
        writableArrayCreateArray.pushString(str2);
        ReactApplicationContext reactApplicationContext = (ReactApplicationContext) this.f13035c;
        if (reactApplicationContext != null) {
            reactApplicationContext.emitDeviceEvent("didReceiveNetworkResponse", writableArrayCreateArray);
        }
        try {
            IS0 hn0 = hs0.f4301g;
            String strM4524b = k20.m4524b("Content-Encoding");
            C8540Xp0 c8540Xp0M25570c = null;
            if (strM4524b == null) {
                strM4524b = null;
            }
            if ("gzip".equalsIgnoreCase(strM4524b) && hn0 != null) {
                C9829j20 c9829j20 = new C9829j20(hn0.mo3385w());
                String strM4524b2 = k20.m4524b("Content-Type");
                if (strM4524b2 == null) {
                    strM4524b2 = null;
                }
                if (strM4524b2 != null) {
                    Pattern pattern = C8540Xp0.f13986d;
                    c8540Xp0M25570c = AbstractC11511wA1.m25570c(strM4524b2);
                }
                hn0 = new HN0(c8540Xp0M25570c, -1L, JI1.m4274b(c9829j20), 1);
            }
            Iterator it = networkingModule.mResponseHandlers.iterator();
            do {
                boolean zHasNext = it.hasNext();
                str = (String) this.f13036d;
                if (!zHasNext) {
                    if (this.f13033a && str.equals("text")) {
                        networkingModule.readWithProgress(i, hn0);
                        NQ1.m5675c(reactApplicationContext, i);
                        return;
                    }
                    String strM3878x = "";
                    if (str.equals("text")) {
                        try {
                            strM3878x = hn0.m3878x();
                        } catch (IOException e) {
                            if (!c10777qR0.f40871b.equalsIgnoreCase("HEAD")) {
                                NQ1.m5674b(reactApplicationContext, i, e.getMessage(), e);
                            }
                        }
                    } else if (str.equals("base64")) {
                        strM3878x = Base64.encodeToString(hn0.m3877n(), 2);
                    }
                    WritableArray writableArrayCreateArray2 = Arguments.createArray();
                    writableArrayCreateArray2.pushInt(i);
                    writableArrayCreateArray2.pushString(strM3878x);
                    if (reactApplicationContext != null) {
                        reactApplicationContext.emitDeviceEvent("didReceiveNetworkData", writableArrayCreateArray2);
                    }
                    NQ1.m5675c(reactApplicationContext, i);
                    return;
                }
                interfaceC10325mv0 = (InterfaceC10325mv0) it.next();
                ((C0045Ai) interfaceC10325mv0).getClass();
            } while (!"blob".equals(str));
            byte[] bArrM3877n = hn0.m3877n();
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("blobId", ((C0045Ai) interfaceC10325mv0).f336a.store(bArrM3877n));
            writableMapCreateMap.putInt("offset", 0);
            writableMapCreateMap.putInt("size", bArrM3877n.length);
            WritableArray writableArrayCreateArray3 = Arguments.createArray();
            writableArrayCreateArray3.pushInt(i);
            writableArrayCreateArray3.pushMap(writableMapCreateMap);
            if (reactApplicationContext != null) {
                reactApplicationContext.emitDeviceEvent("didReceiveNetworkData", writableArrayCreateArray3);
            }
            NQ1.m5675c(reactApplicationContext, i);
        } catch (IOException e2) {
            NQ1.m5674b(reactApplicationContext, i, e2.getMessage(), e2);
        }
    }

    @Override // p000.InterfaceC7758Io0
    /* renamed from: a */
    public void mo4007a(Bundle bundle) {
        ((InterfaceC7914Lo0) this.f13037e).mo87a(bundle);
    }

    @Override // p000.InterfaceC7758Io0
    /* renamed from: b */
    public void mo4008b(int i, C6536oB c6536oB, long j, int i2) {
        ((InterfaceC7914Lo0) this.f13037e).mo88b(i, c6536oB, j, i2);
    }

    @Override // p000.InterfaceC7758Io0
    /* renamed from: c */
    public void mo4009c(int i, int i2, int i3, long j) {
        ((InterfaceC7914Lo0) this.f13037e).mo89c(i, i2, i3, j);
    }

    @Override // p000.InterfaceC7758Io0
    /* renamed from: d */
    public boolean mo4010d(C8278So0 c8278So0) {
        C0073B9 c0073b9 = (C0073B9) this.f13036d;
        synchronized (c0073b9.f590a) {
            c0073b9.f604o = c8278So0;
        }
        return true;
    }

    @Override // p000.InterfaceC7758Io0
    /* renamed from: f */
    public MediaFormat mo4011f() {
        MediaFormat mediaFormat;
        C0073B9 c0073b9 = (C0073B9) this.f13036d;
        synchronized (c0073b9.f590a) {
            try {
                mediaFormat = c0073b9.f597h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // p000.InterfaceC7758Io0
    public void flush() {
        ((InterfaceC7914Lo0) this.f13037e).flush();
        ((MediaCodec) this.f13035c).flush();
        C0073B9 c0073b9 = (C0073B9) this.f13036d;
        synchronized (c0073b9.f590a) {
            c0073b9.f601l++;
            Handler handler = c0073b9.f592c;
            int i = AbstractC7485Dh1.f2166a;
            handler.post(new RunnableC0383G4(1, c0073b9));
        }
        ((MediaCodec) this.f13035c).start();
    }

    @Override // p000.InterfaceC6883tO
    /* renamed from: h */
    public boolean mo5443h(int i) {
        return this.f13033a && mo5444i(i) != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01af  */
    @Override // p000.InterfaceC6883tO
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p000.InterfaceC6946uO mo5444i(int r20) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1396WB.mo5444i(int):uO");
    }

    @Override // p000.InterfaceC7758Io0
    /* renamed from: j */
    public void mo4012j(int i, long j) {
        ((MediaCodec) this.f13035c).releaseOutputBuffer(i, j);
    }

    @Override // p000.InterfaceC7758Io0
    /* renamed from: k */
    public int mo4013k() {
        int i;
        ((InterfaceC7914Lo0) this.f13037e).mo90i();
        C0073B9 c0073b9 = (C0073B9) this.f13036d;
        synchronized (c0073b9.f590a) {
            try {
                IllegalStateException illegalStateException = c0073b9.f603n;
                if (illegalStateException != null) {
                    c0073b9.f603n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = c0073b9.f599j;
                if (codecException != null) {
                    c0073b9.f599j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = c0073b9.f600k;
                if (cryptoException != null) {
                    c0073b9.f600k = null;
                    throw cryptoException;
                }
                i = -1;
                if (!(c0073b9.f601l > 0 || c0073b9.f602m)) {
                    C6327ks c6327ks = c0073b9.f593d;
                    int i2 = c6327ks.f36730a;
                    int i3 = c6327ks.f36731b;
                    if (!(i2 == i3)) {
                        if (i2 == i3) {
                            throw new ArrayIndexOutOfBoundsException();
                        }
                        i = c6327ks.f36732c[i2];
                        c6327ks.f36730a = (i2 + 1) & c6327ks.f36733d;
                    }
                }
            } finally {
            }
        }
        return i;
    }

    @Override // p000.InterfaceC7758Io0
    /* renamed from: l */
    public void mo4014l(C9033cp0 c9033cp0, Handler handler) {
        ((MediaCodec) this.f13035c).setOnFrameRenderedListener(new C7120x9(this, c9033cp0, 0), handler);
    }

    @Override // p000.InterfaceC7758Io0
    /* renamed from: m */
    public int mo4015m(MediaCodec.BufferInfo bufferInfo) {
        int i;
        ((InterfaceC7914Lo0) this.f13037e).mo90i();
        C0073B9 c0073b9 = (C0073B9) this.f13036d;
        synchronized (c0073b9.f590a) {
            try {
                IllegalStateException illegalStateException = c0073b9.f603n;
                if (illegalStateException != null) {
                    c0073b9.f603n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = c0073b9.f599j;
                if (codecException != null) {
                    c0073b9.f599j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = c0073b9.f600k;
                if (cryptoException != null) {
                    c0073b9.f600k = null;
                    throw cryptoException;
                }
                i = -1;
                if (!(c0073b9.f601l > 0 || c0073b9.f602m)) {
                    C6327ks c6327ks = c0073b9.f594e;
                    int i2 = c6327ks.f36730a;
                    int i3 = c6327ks.f36731b;
                    if (!(i2 == i3)) {
                        if (i2 == i3) {
                            throw new ArrayIndexOutOfBoundsException();
                        }
                        i = c6327ks.f36732c[i2];
                        c6327ks.f36730a = c6327ks.f36733d & (i2 + 1);
                        if (i >= 0) {
                            YN1.m9283h(c0073b9.f597h);
                            MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) c0073b9.f595f.remove();
                            bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                        } else if (i == -2) {
                            c0073b9.f597h = (MediaFormat) c0073b9.f596g.remove();
                        }
                    }
                }
            } finally {
            }
        }
        return i;
    }

    @Override // p000.InterfaceC7758Io0
    /* renamed from: o */
    public void mo4016o(int i, boolean z) {
        ((MediaCodec) this.f13035c).releaseOutputBuffer(i, z);
    }

    @Override // p000.InterfaceC7758Io0
    /* renamed from: q */
    public void mo4017q(int i) {
        ((MediaCodec) this.f13035c).setVideoScalingMode(i);
    }

    @Override // p000.InterfaceC7758Io0
    public void release() {
        try {
            if (this.f13034b == 1) {
                ((InterfaceC7914Lo0) this.f13037e).shutdown();
                C0073B9 c0073b9 = (C0073B9) this.f13036d;
                synchronized (c0073b9.f590a) {
                    c0073b9.f602m = true;
                    c0073b9.f591b.quit();
                    c0073b9.m529a();
                }
            }
            this.f13034b = 2;
            if (this.f13033a) {
                return;
            }
            try {
                int i = AbstractC7485Dh1.f2166a;
                if (i >= 30 && i < 33) {
                    ((MediaCodec) this.f13035c).stop();
                }
            } finally {
            }
        } catch (Throwable th) {
            if (!this.f13033a) {
                try {
                    int i2 = AbstractC7485Dh1.f2166a;
                    if (i2 >= 30 && i2 < 33) {
                        ((MediaCodec) this.f13035c).stop();
                    }
                } finally {
                }
            }
            throw th;
        }
    }

    @Override // p000.InterfaceC7758Io0
    /* renamed from: t */
    public ByteBuffer mo4018t(int i) {
        return ((MediaCodec) this.f13035c).getInputBuffer(i);
    }

    @Override // p000.InterfaceC7758Io0
    /* renamed from: u */
    public void mo4019u(Surface surface) {
        ((MediaCodec) this.f13035c).setOutputSurface(surface);
    }

    @Override // p000.InterfaceC7758Io0
    /* renamed from: v */
    public ByteBuffer mo4020v(int i) {
        return ((MediaCodec) this.f13035c).getOutputBuffer(i);
    }

    @Override // p000.InterfaceC0111Bl
    /* renamed from: w0 */
    public void mo852w0(InterfaceC6843sl interfaceC6843sl, IOException iOException) {
        NetworkingModule networkingModule = (NetworkingModule) this.f13037e;
        if (networkingModule.mShuttingDown) {
            return;
        }
        int i = this.f13034b;
        networkingModule.removeRequest(i);
        NQ1.m5674b((ReactApplicationContext) this.f13035c, i, iOException.getMessage() != null ? iOException.getMessage() : "Error while executing request: ".concat(iOException.getClass().getSimpleName()), iOException);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1396WB(android.content.Context r10) {
        /*
            r9 = this;
            r9.<init>()
            if (r10 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            android.content.Context r0 = r10.getApplicationContext()
        Lb:
            r9.f13035c = r0
            int r0 = p000.AbstractC7485Dh1.f2166a
            if (r10 == 0) goto L2a
            java.lang.String r0 = "phone"
            java.lang.Object r10 = r10.getSystemService(r0)
            android.telephony.TelephonyManager r10 = (android.telephony.TelephonyManager) r10
            if (r10 == 0) goto L2a
            java.lang.String r10 = r10.getNetworkCountryIso()
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L2a
            java.lang.String r10 = p000.PN1.m6358d(r10)
            goto L36
        L2a:
            java.util.Locale r10 = java.util.Locale.getDefault()
            java.lang.String r10 = r10.getCountry()
            java.lang.String r10 = p000.PN1.m6358d(r10)
        L36:
            int[] r10 = p000.C0959PE.m6269a(r10)
            java.util.HashMap r0 = new java.util.HashMap
            r1 = 8
            r0.<init>(r1)
            r1 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r3 = 1000000(0xf4240, double:4.940656E-318)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0.put(r2, r3)
            r2 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            fQ0 r4 = p000.C0959PE.f8910n
            r5 = r10[r1]
            java.lang.Object r5 = r4.get(r5)
            java.lang.Long r5 = (java.lang.Long) r5
            r0.put(r3, r5)
            r3 = 3
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            fQ0 r6 = p000.C0959PE.f8911o
            r7 = 1
            r8 = r10[r7]
            java.lang.Object r6 = r6.get(r8)
            java.lang.Long r6 = (java.lang.Long) r6
            r0.put(r5, r6)
            r5 = 4
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            fQ0 r8 = p000.C0959PE.f8912p
            r2 = r10[r2]
            java.lang.Object r2 = r8.get(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            r0.put(r6, r2)
            r2 = 5
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            fQ0 r8 = p000.C0959PE.f8913q
            r3 = r10[r3]
            java.lang.Object r3 = r8.get(r3)
            java.lang.Long r3 = (java.lang.Long) r3
            r0.put(r6, r3)
            r3 = 10
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            fQ0 r6 = p000.C0959PE.f8914r
            r5 = r10[r5]
            java.lang.Object r5 = r6.get(r5)
            java.lang.Long r5 = (java.lang.Long) r5
            r0.put(r3, r5)
            r3 = 9
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            fQ0 r5 = p000.C0959PE.f8915s
            r2 = r10[r2]
            java.lang.Object r2 = r5.get(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            r0.put(r3, r2)
            r2 = 7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r10 = r10[r1]
            java.lang.Object r10 = r4.get(r10)
            java.lang.Long r10 = (java.lang.Long) r10
            r0.put(r2, r10)
            r9.f13036d = r0
            r10 = 2000(0x7d0, float:2.803E-42)
            r9.f13034b = r10
            M71 r10 = p000.M71.f6997a
            r9.f13037e = r10
            r9.f13033a = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1396WB.<init>(android.content.Context):void");
    }

    public C1396WB(MediaCodec mediaCodec, HandlerThread handlerThread, InterfaceC7914Lo0 interfaceC7914Lo0) {
        this.f13035c = mediaCodec;
        this.f13036d = new C0073B9(handlerThread);
        this.f13037e = interfaceC7914Lo0;
        this.f13034b = 0;
    }

    public C1396WB(NetworkingModule networkingModule, int i, ReactApplicationContext reactApplicationContext, String str, boolean z) {
        this.f13037e = networkingModule;
        this.f13034b = i;
        this.f13035c = reactApplicationContext;
        this.f13036d = str;
        this.f13033a = z;
    }

    public C1396WB() {
        this.f13035c = new Intent("android.intent.action.VIEW");
        this.f13036d = new OL0(11);
        this.f13034b = 0;
        this.f13033a = true;
    }
}
