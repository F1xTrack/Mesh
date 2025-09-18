package defpackage;

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

/* loaded from: classes.dex */
public final class WB implements InterfaceC0687Io0, InterfaceC7211tO, InterfaceC0131Bl {
    public boolean a;
    public int b;
    public final Object c;
    public final Object d;
    public Object e;

    public WB(String str, C3513e41 c3513e41) throws NumberFormatException {
        boolean z;
        int i;
        this.d = new HashMap();
        this.c = str;
        try {
            i = Integer.parseInt(str);
            z = true;
        } catch (NumberFormatException unused) {
            AbstractC0759Jm0.f("Camera2EncoderProfilesProvider");
            z = false;
            i = -1;
        }
        this.a = z;
        this.b = i;
        this.e = c3513e41;
    }

    public static void e(WB wb, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        B9 b9 = (B9) wb.d;
        YN1.f(b9.c == null);
        HandlerThread handlerThread = b9.b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = (MediaCodec) wb.c;
        mediaCodec.setCallback(b9, handler);
        b9.c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        Trace.endSection();
        ((InterfaceC0921Lo0) wb.e).start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        wb.b = 1;
    }

    public static String g(int i, String str) {
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

    @Override // defpackage.InterfaceC0131Bl
    public void Z(InterfaceC7089sl interfaceC7089sl, HS0 hs0) {
        String str;
        InterfaceC5975mv0 interfaceC5975mv0;
        NetworkingModule networkingModule = (NetworkingModule) this.e;
        if (networkingModule.mShuttingDown) {
            return;
        }
        int i = this.b;
        networkingModule.removeRequest(i);
        K20 k20 = hs0.f;
        WritableMap writableMapTranslateHeaders = NetworkingModule.translateHeaders(k20);
        C6649qR0 c6649qR0 = hs0.a;
        String str2 = c6649qR0.a.h;
        WritableArray writableArrayCreateArray = Arguments.createArray();
        writableArrayCreateArray.pushInt(i);
        writableArrayCreateArray.pushInt(hs0.d);
        writableArrayCreateArray.pushMap(writableMapTranslateHeaders);
        writableArrayCreateArray.pushString(str2);
        ReactApplicationContext reactApplicationContext = (ReactApplicationContext) this.c;
        if (reactApplicationContext != null) {
            reactApplicationContext.emitDeviceEvent("didReceiveNetworkResponse", writableArrayCreateArray);
        }
        try {
            IS0 hn0 = hs0.g;
            String strB = k20.b("Content-Encoding");
            C1859Xp0 c1859Xp0C = null;
            if (strB == null) {
                strB = null;
            }
            if ("gzip".equalsIgnoreCase(strB) && hn0 != null) {
                C5235j20 c5235j20 = new C5235j20(hn0.w());
                String strB2 = k20.b("Content-Type");
                if (strB2 == null) {
                    strB2 = null;
                }
                if (strB2 != null) {
                    Pattern pattern = C1859Xp0.d;
                    c1859Xp0C = AbstractC7743wA1.c(strB2);
                }
                hn0 = new HN0(c1859Xp0C, -1L, JI1.b(c5235j20), 1);
            }
            Iterator it = networkingModule.mResponseHandlers.iterator();
            do {
                boolean zHasNext = it.hasNext();
                str = (String) this.d;
                if (!zHasNext) {
                    if (this.a && str.equals("text")) {
                        networkingModule.readWithProgress(i, hn0);
                        NQ1.c(reactApplicationContext, i);
                        return;
                    }
                    String strX = "";
                    if (str.equals("text")) {
                        try {
                            strX = hn0.x();
                        } catch (IOException e) {
                            if (!c6649qR0.b.equalsIgnoreCase("HEAD")) {
                                NQ1.b(reactApplicationContext, i, e.getMessage(), e);
                            }
                        }
                    } else if (str.equals("base64")) {
                        strX = Base64.encodeToString(hn0.n(), 2);
                    }
                    WritableArray writableArrayCreateArray2 = Arguments.createArray();
                    writableArrayCreateArray2.pushInt(i);
                    writableArrayCreateArray2.pushString(strX);
                    if (reactApplicationContext != null) {
                        reactApplicationContext.emitDeviceEvent("didReceiveNetworkData", writableArrayCreateArray2);
                    }
                    NQ1.c(reactApplicationContext, i);
                    return;
                }
                interfaceC5975mv0 = (InterfaceC5975mv0) it.next();
                ((C0044Ai) interfaceC5975mv0).getClass();
            } while (!"blob".equals(str));
            byte[] bArrN = hn0.n();
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("blobId", ((C0044Ai) interfaceC5975mv0).a.store(bArrN));
            writableMapCreateMap.putInt("offset", 0);
            writableMapCreateMap.putInt("size", bArrN.length);
            WritableArray writableArrayCreateArray3 = Arguments.createArray();
            writableArrayCreateArray3.pushInt(i);
            writableArrayCreateArray3.pushMap(writableMapCreateMap);
            if (reactApplicationContext != null) {
                reactApplicationContext.emitDeviceEvent("didReceiveNetworkData", writableArrayCreateArray3);
            }
            NQ1.c(reactApplicationContext, i);
        } catch (IOException e2) {
            NQ1.b(reactApplicationContext, i, e2.getMessage(), e2);
        }
    }

    @Override // defpackage.InterfaceC0687Io0
    public void a(Bundle bundle) {
        ((InterfaceC0921Lo0) this.e).a(bundle);
    }

    @Override // defpackage.InterfaceC0687Io0
    public void b(int i, C6218oB c6218oB, long j, int i2) {
        ((InterfaceC0921Lo0) this.e).b(i, c6218oB, j, i2);
    }

    @Override // defpackage.InterfaceC0687Io0
    public void c(int i, int i2, int i3, long j) {
        ((InterfaceC0921Lo0) this.e).c(i, i2, i3, j);
    }

    @Override // defpackage.InterfaceC0687Io0
    public boolean d(C1466So0 c1466So0) {
        B9 b9 = (B9) this.d;
        synchronized (b9.a) {
            b9.o = c1466So0;
        }
        return true;
    }

    @Override // defpackage.InterfaceC0687Io0
    public MediaFormat f() {
        MediaFormat mediaFormat;
        B9 b9 = (B9) this.d;
        synchronized (b9.a) {
            try {
                mediaFormat = b9.h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // defpackage.InterfaceC0687Io0
    public void flush() {
        ((InterfaceC0921Lo0) this.e).flush();
        ((MediaCodec) this.c).flush();
        B9 b9 = (B9) this.d;
        synchronized (b9.a) {
            b9.l++;
            Handler handler = b9.c;
            int i = AbstractC0277Dh1.a;
            handler.post(new G4(1, b9));
        }
        ((MediaCodec) this.c).start();
    }

    @Override // defpackage.InterfaceC7211tO
    public boolean h(int i) {
        return this.a && i(i) != null;
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
    @Override // defpackage.InterfaceC7211tO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.InterfaceC7402uO i(int r20) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.WB.i(int):uO");
    }

    @Override // defpackage.InterfaceC0687Io0
    public void j(int i, long j) {
        ((MediaCodec) this.c).releaseOutputBuffer(i, j);
    }

    @Override // defpackage.InterfaceC0687Io0
    public int k() {
        int i;
        ((InterfaceC0921Lo0) this.e).i();
        B9 b9 = (B9) this.d;
        synchronized (b9.a) {
            try {
                IllegalStateException illegalStateException = b9.n;
                if (illegalStateException != null) {
                    b9.n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = b9.j;
                if (codecException != null) {
                    b9.j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = b9.k;
                if (cryptoException != null) {
                    b9.k = null;
                    throw cryptoException;
                }
                i = -1;
                if (!(b9.l > 0 || b9.m)) {
                    C5583ks c5583ks = b9.d;
                    int i2 = c5583ks.a;
                    int i3 = c5583ks.b;
                    if (!(i2 == i3)) {
                        if (i2 == i3) {
                            throw new ArrayIndexOutOfBoundsException();
                        }
                        i = c5583ks.c[i2];
                        c5583ks.a = (i2 + 1) & c5583ks.d;
                    }
                }
            } finally {
            }
        }
        return i;
    }

    @Override // defpackage.InterfaceC0687Io0
    public void l(C3272cp0 c3272cp0, Handler handler) {
        ((MediaCodec) this.c).setOnFrameRenderedListener(new C7928x9(this, c3272cp0, 0), handler);
    }

    @Override // defpackage.InterfaceC0687Io0
    public int m(MediaCodec.BufferInfo bufferInfo) {
        int i;
        ((InterfaceC0921Lo0) this.e).i();
        B9 b9 = (B9) this.d;
        synchronized (b9.a) {
            try {
                IllegalStateException illegalStateException = b9.n;
                if (illegalStateException != null) {
                    b9.n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = b9.j;
                if (codecException != null) {
                    b9.j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = b9.k;
                if (cryptoException != null) {
                    b9.k = null;
                    throw cryptoException;
                }
                i = -1;
                if (!(b9.l > 0 || b9.m)) {
                    C5583ks c5583ks = b9.e;
                    int i2 = c5583ks.a;
                    int i3 = c5583ks.b;
                    if (!(i2 == i3)) {
                        if (i2 == i3) {
                            throw new ArrayIndexOutOfBoundsException();
                        }
                        i = c5583ks.c[i2];
                        c5583ks.a = c5583ks.d & (i2 + 1);
                        if (i >= 0) {
                            YN1.h(b9.h);
                            MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) b9.f.remove();
                            bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                        } else if (i == -2) {
                            b9.h = (MediaFormat) b9.g.remove();
                        }
                    }
                }
            } finally {
            }
        }
        return i;
    }

    @Override // defpackage.InterfaceC0687Io0
    public void o(int i, boolean z) {
        ((MediaCodec) this.c).releaseOutputBuffer(i, z);
    }

    @Override // defpackage.InterfaceC0687Io0
    public void q(int i) {
        ((MediaCodec) this.c).setVideoScalingMode(i);
    }

    @Override // defpackage.InterfaceC0687Io0
    public void release() {
        try {
            if (this.b == 1) {
                ((InterfaceC0921Lo0) this.e).shutdown();
                B9 b9 = (B9) this.d;
                synchronized (b9.a) {
                    b9.m = true;
                    b9.b.quit();
                    b9.a();
                }
            }
            this.b = 2;
            if (this.a) {
                return;
            }
            try {
                int i = AbstractC0277Dh1.a;
                if (i >= 30 && i < 33) {
                    ((MediaCodec) this.c).stop();
                }
            } finally {
            }
        } catch (Throwable th) {
            if (!this.a) {
                try {
                    int i2 = AbstractC0277Dh1.a;
                    if (i2 >= 30 && i2 < 33) {
                        ((MediaCodec) this.c).stop();
                    }
                } finally {
                }
            }
            throw th;
        }
    }

    @Override // defpackage.InterfaceC0687Io0
    public ByteBuffer t(int i) {
        return ((MediaCodec) this.c).getInputBuffer(i);
    }

    @Override // defpackage.InterfaceC0687Io0
    public void u(Surface surface) {
        ((MediaCodec) this.c).setOutputSurface(surface);
    }

    @Override // defpackage.InterfaceC0687Io0
    public ByteBuffer v(int i) {
        return ((MediaCodec) this.c).getOutputBuffer(i);
    }

    @Override // defpackage.InterfaceC0131Bl
    public void w0(InterfaceC7089sl interfaceC7089sl, IOException iOException) {
        NetworkingModule networkingModule = (NetworkingModule) this.e;
        if (networkingModule.mShuttingDown) {
            return;
        }
        int i = this.b;
        networkingModule.removeRequest(i);
        NQ1.b((ReactApplicationContext) this.c, i, iOException.getMessage() != null ? iOException.getMessage() : "Error while executing request: ".concat(iOException.getClass().getSimpleName()), iOException);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public WB(android.content.Context r10) {
        /*
            r9 = this;
            r9.<init>()
            if (r10 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            android.content.Context r0 = r10.getApplicationContext()
        Lb:
            r9.c = r0
            int r0 = defpackage.AbstractC0277Dh1.a
            if (r10 == 0) goto L2a
            java.lang.String r0 = "phone"
            java.lang.Object r10 = r10.getSystemService(r0)
            android.telephony.TelephonyManager r10 = (android.telephony.TelephonyManager) r10
            if (r10 == 0) goto L2a
            java.lang.String r10 = r10.getNetworkCountryIso()
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L2a
            java.lang.String r10 = defpackage.PN1.d(r10)
            goto L36
        L2a:
            java.util.Locale r10 = java.util.Locale.getDefault()
            java.lang.String r10 = r10.getCountry()
            java.lang.String r10 = defpackage.PN1.d(r10)
        L36:
            int[] r10 = defpackage.PE.a(r10)
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
            fQ0 r4 = defpackage.PE.n
            r5 = r10[r1]
            java.lang.Object r5 = r4.get(r5)
            java.lang.Long r5 = (java.lang.Long) r5
            r0.put(r3, r5)
            r3 = 3
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            fQ0 r6 = defpackage.PE.o
            r7 = 1
            r8 = r10[r7]
            java.lang.Object r6 = r6.get(r8)
            java.lang.Long r6 = (java.lang.Long) r6
            r0.put(r5, r6)
            r5 = 4
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            fQ0 r8 = defpackage.PE.p
            r2 = r10[r2]
            java.lang.Object r2 = r8.get(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            r0.put(r6, r2)
            r2 = 5
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            fQ0 r8 = defpackage.PE.q
            r3 = r10[r3]
            java.lang.Object r3 = r8.get(r3)
            java.lang.Long r3 = (java.lang.Long) r3
            r0.put(r6, r3)
            r3 = 10
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            fQ0 r6 = defpackage.PE.r
            r5 = r10[r5]
            java.lang.Object r5 = r6.get(r5)
            java.lang.Long r5 = (java.lang.Long) r5
            r0.put(r3, r5)
            r3 = 9
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            fQ0 r5 = defpackage.PE.s
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
            r9.d = r0
            r10 = 2000(0x7d0, float:2.803E-42)
            r9.b = r10
            M71 r10 = defpackage.M71.a
            r9.e = r10
            r9.a = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.WB.<init>(android.content.Context):void");
    }

    public WB(MediaCodec mediaCodec, HandlerThread handlerThread, InterfaceC0921Lo0 interfaceC0921Lo0) {
        this.c = mediaCodec;
        this.d = new B9(handlerThread);
        this.e = interfaceC0921Lo0;
        this.b = 0;
    }

    public WB(NetworkingModule networkingModule, int i, ReactApplicationContext reactApplicationContext, String str, boolean z) {
        this.e = networkingModule;
        this.b = i;
        this.c = reactApplicationContext;
        this.d = str;
        this.a = z;
    }

    public WB() {
        this.c = new Intent("android.intent.action.VIEW");
        this.d = new OL0(11);
        this.b = 0;
        this.a = true;
    }
}
