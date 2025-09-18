package defpackage;

import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Handler;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.provider.MediaStore;
import android.util.Pair;
import android.widget.TextView;
import androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk;
import androidx.work.impl.WorkDatabase;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.tasks.Task;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import com.vk.push.core.remote.config.omicron.util.UrlEncoder;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Stack;

/* renamed from: fw1 */
/* loaded from: classes2.dex */
public final class C3866fw1 implements InterfaceC4182ha1, InterfaceC3677ex0, InterfaceC8300z60, InterfaceC1646Uw0, InterfaceC5369jk0, PZ, InterfaceC4347iS, InterfaceC0443Fl, InterfaceC0131Bl, InterfaceC5878mP, InterfaceC1103Nx0, InterfaceC0195Cg0 {
    public static final String[] c = {"_data"};
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ C3866fw1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC5878mP
    public boolean X(int i, String str) {
        VB0 vb0 = (VB0) this.b;
        if (!str.equals(vb0.b)) {
            return false;
        }
        switch (str) {
            case "topPointerDown":
            case "topPointerMove":
            case "topPointerOver":
            case "topPointerUp":
            case "topPointerCancel":
            case "topPointerOut":
                UB0 ub0 = vb0.e;
                Iterator it = ((List) ub0.f.get(Integer.valueOf(ub0.b))).iterator();
                while (it.hasNext()) {
                    if (((C8204yb1) it.next()).a == i) {
                        break;
                    }
                }
                break;
            default:
                if (vb0.getViewTag() != i) {
                    break;
                }
                break;
        }
        return false;
    }

    @Override // defpackage.InterfaceC0131Bl
    public void Z(InterfaceC7089sl interfaceC7089sl, HS0 hs0) {
        C7817wZ0 c7817wZ0 = (C7817wZ0) this.b;
        if (AbstractC5608l0.f.b(c7817wZ0, null, hs0)) {
            AbstractC5608l0.c(c7817wZ0);
        }
    }

    public void a(Object obj, String str) {
        StringBuilder sb = (StringBuilder) this.b;
        if (sb.length() > 0) {
            sb.append('&');
        }
        sb.append(str);
        sb.append('=');
        sb.append(UrlEncoder.encodeUtf8(obj));
    }

    /* JADX WARN: Code restructure failed: missing block: B:277:0x0258, code lost:
    
        throw defpackage.C5643lA0.a(null, "EBML lacing sample size out of range.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(int r20, int r21, defpackage.C7566vF r22) throws defpackage.C5643lA0, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 776
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3866fw1.b(int, int, vF):void");
    }

    @Override // defpackage.InterfaceC1646Uw0
    public Object c() {
        Type type = (Type) this.b;
        if (!(type instanceof ParameterizedType)) {
            throw new C7074sg("Invalid EnumSet type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return EnumSet.noneOf((Class) type2);
        }
        throw new C7074sg("Invalid EnumSet type: " + type.toString());
    }

    public void d(AbstractC0596Hk abstractC0596Hk) {
        if (!abstractC0596Hk.q()) {
            if (!(abstractC0596Hk instanceof C8179yT0)) {
                String strValueOf = String.valueOf(abstractC0596Hk.getClass());
                throw new IllegalArgumentException(AbstractC1705Vq.l(new StringBuilder(strValueOf.length() + 49), "Has a new type of ByteString been created? Found ", strValueOf));
            }
            C8179yT0 c8179yT0 = (C8179yT0) abstractC0596Hk;
            d(c8179yT0.c);
            d(c8179yT0.d);
            return;
        }
        int size = abstractC0596Hk.size();
        int[] iArr = C8179yT0.h;
        int iBinarySearch = Arrays.binarySearch(iArr, size);
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        int i = iArr[iBinarySearch + 1];
        Stack stack = (Stack) this.b;
        if (stack.isEmpty() || ((AbstractC0596Hk) stack.peek()).size() >= i) {
            stack.push(abstractC0596Hk);
            return;
        }
        int i2 = iArr[iBinarySearch];
        AbstractC0596Hk c8179yT02 = (AbstractC0596Hk) stack.pop();
        while (!stack.isEmpty() && ((AbstractC0596Hk) stack.peek()).size() < i2) {
            c8179yT02 = new C8179yT0((AbstractC0596Hk) stack.pop(), c8179yT02);
        }
        C8179yT0 c8179yT03 = new C8179yT0(c8179yT02, abstractC0596Hk);
        while (!stack.isEmpty()) {
            int[] iArr2 = C8179yT0.h;
            int iBinarySearch2 = Arrays.binarySearch(iArr2, c8179yT03.b);
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (((AbstractC0596Hk) stack.peek()).size() >= iArr2[iBinarySearch2 + 1]) {
                break;
            } else {
                c8179yT03 = new C8179yT0((AbstractC0596Hk) stack.pop(), c8179yT03);
            }
        }
        stack.push(c8179yT03);
    }

    public int e(byte[] bArr) {
        int i;
        byte b;
        if (((LargeJpegImageQuirk) this.b) == null || !(("Samsung".equalsIgnoreCase(Build.BRAND) && LargeJpegImageQuirk.a.contains(Build.MODEL.toUpperCase(Locale.US))) || LargeJpegImageQuirk.d() || bArr.length > 10000000)) {
            return bArr.length;
        }
        int i2 = 2;
        while (true) {
            if (i2 + 4 <= bArr.length && (b = bArr[i2]) == -1) {
                int i3 = i2 + 2;
                int i4 = ((bArr[i3] & 255) << 8) | (bArr[i2 + 3] & 255);
                if (b == -1 && bArr[i2 + 1] == -38) {
                    while (true) {
                        i = i3 + 2;
                        if (i <= bArr.length) {
                            if (bArr[i3] == -1 && bArr[i3 + 1] == -39) {
                                break;
                            }
                            i3++;
                        } else {
                            break;
                        }
                    }
                } else {
                    i2 += i4 + 2;
                }
            } else {
                break;
            }
        }
        i = -1;
        return i != -1 ? i : bArr.length;
    }

    public void f(int i, long j) throws C5643lA0 {
        C7481uo0 c7481uo0 = (C7481uo0) this.b;
        c7481uo0.getClass();
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw C5643lA0.a(null, "ContentEncodingOrder " + j + " not supported");
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw C5643lA0.a(null, "ContentEncodingScope " + j + " not supported");
        }
        switch (i) {
            case 131:
                c7481uo0.c(i);
                c7481uo0.w.d = (int) j;
                return;
            case ModuleDescriptor.MODULE_VERSION /* 136 */:
                c7481uo0.c(i);
                c7481uo0.w.W = j == 1;
                return;
            case 155:
                c7481uo0.K = c7481uo0.m(j);
                return;
            case 159:
                c7481uo0.c(i);
                c7481uo0.w.P = (int) j;
                return;
            case 176:
                c7481uo0.c(i);
                c7481uo0.w.m = (int) j;
                return;
            case 179:
                c7481uo0.a(i);
                c7481uo0.E.c(c7481uo0.m(j));
                return;
            case 186:
                c7481uo0.c(i);
                c7481uo0.w.n = (int) j;
                return;
            case 215:
                c7481uo0.c(i);
                c7481uo0.w.c = (int) j;
                return;
            case 231:
                c7481uo0.D = c7481uo0.m(j);
                return;
            case 238:
                c7481uo0.R = (int) j;
                return;
            case 241:
                if (c7481uo0.G) {
                    return;
                }
                c7481uo0.a(i);
                c7481uo0.F.c(j);
                c7481uo0.G = true;
                return;
            case 251:
                c7481uo0.S = true;
                return;
            case 16871:
                c7481uo0.c(i);
                c7481uo0.w.g = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw C5643lA0.a(null, "ContentCompAlgo " + j + " not supported");
            case 17029:
                if (j < 1 || j > 2) {
                    throw C5643lA0.a(null, "DocTypeReadVersion " + j + " not supported");
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw C5643lA0.a(null, "EBMLReadVersion " + j + " not supported");
            case 18401:
                if (j == 5) {
                    return;
                }
                throw C5643lA0.a(null, "ContentEncAlgo " + j + " not supported");
            case 18408:
                if (j == 1) {
                    return;
                }
                throw C5643lA0.a(null, "AESSettingsCipherMode " + j + " not supported");
            case 21420:
                c7481uo0.z = j + c7481uo0.s;
                return;
            case 21432:
                int i2 = (int) j;
                c7481uo0.c(i);
                if (i2 == 0) {
                    c7481uo0.w.x = 0;
                    return;
                }
                if (i2 == 1) {
                    c7481uo0.w.x = 2;
                    return;
                } else if (i2 == 3) {
                    c7481uo0.w.x = 1;
                    return;
                } else {
                    if (i2 != 15) {
                        return;
                    }
                    c7481uo0.w.x = 3;
                    return;
                }
            case 21680:
                c7481uo0.c(i);
                c7481uo0.w.p = (int) j;
                return;
            case 21682:
                c7481uo0.c(i);
                c7481uo0.w.r = (int) j;
                return;
            case 21690:
                c7481uo0.c(i);
                c7481uo0.w.q = (int) j;
                return;
            case 21930:
                c7481uo0.c(i);
                c7481uo0.w.V = j == 1;
                return;
            case 21938:
                c7481uo0.c(i);
                C7290to0 c7290to0 = c7481uo0.w;
                c7290to0.y = true;
                c7290to0.o = (int) j;
                return;
            case 21998:
                c7481uo0.c(i);
                c7481uo0.w.f = (int) j;
                return;
            case 22186:
                c7481uo0.c(i);
                c7481uo0.w.S = j;
                return;
            case 22203:
                c7481uo0.c(i);
                c7481uo0.w.T = j;
                return;
            case 25188:
                c7481uo0.c(i);
                c7481uo0.w.Q = (int) j;
                return;
            case 30114:
                c7481uo0.T = j;
                return;
            case 30321:
                c7481uo0.c(i);
                int i3 = (int) j;
                if (i3 == 0) {
                    c7481uo0.w.s = 0;
                    return;
                }
                if (i3 == 1) {
                    c7481uo0.w.s = 1;
                    return;
                } else if (i3 == 2) {
                    c7481uo0.w.s = 2;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    c7481uo0.w.s = 3;
                    return;
                }
            case 2352003:
                c7481uo0.c(i);
                c7481uo0.w.e = (int) j;
                return;
            case 2807729:
                c7481uo0.t = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        c7481uo0.c(i);
                        int i4 = (int) j;
                        if (i4 == 1) {
                            c7481uo0.w.B = 2;
                            return;
                        } else {
                            if (i4 != 2) {
                                return;
                            }
                            c7481uo0.w.B = 1;
                            return;
                        }
                    case 21946:
                        c7481uo0.c(i);
                        int iG = C0470Fu.g((int) j);
                        if (iG != -1) {
                            c7481uo0.w.A = iG;
                            return;
                        }
                        return;
                    case 21947:
                        c7481uo0.c(i);
                        c7481uo0.w.y = true;
                        int iF = C0470Fu.f((int) j);
                        if (iF != -1) {
                            c7481uo0.w.z = iF;
                            return;
                        }
                        return;
                    case 21948:
                        c7481uo0.c(i);
                        c7481uo0.w.C = (int) j;
                        return;
                    case 21949:
                        c7481uo0.c(i);
                        c7481uo0.w.D = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    public void g() {
        ((WX) this.b).d.N();
    }

    @Override // javax.inject.Provider
    public Object get() {
        String packageName = ((Context) ((C0552Gv0) this.b).a).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.InterfaceC4182ha1
    public Cursor h(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        return ((ContentResolver) this.b).query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, c, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, null);
    }

    @Override // defpackage.InterfaceC0443Fl
    public Object h0(C0365El c0365El) {
        C8227yj0 c8227yj0 = (C8227yj0) this.b;
        AbstractC3377dM1.i(c8227yj0.f == null, "The result can only set once!");
        c8227yj0.f = c0365El;
        return "ListFuture[" + this + "]";
    }

    public void i(C2489cI1 c2489cI1) {
        CG1 cg1 = (CG1) this.b;
        cg1.getClass();
        Preconditions.checkNotNull(c2489cI1);
        synchronized (cg1.e) {
            for (int i = 0; i < cg1.e.size(); i++) {
                try {
                    if (c2489cI1.equals(((Pair) cg1.e.get(i)).first)) {
                        return;
                    }
                } finally {
                }
            }
            BinderC8141yG1 binderC8141yG1 = new BinderC8141yG1(c2489cI1);
            cg1.e.add(new Pair(c2489cI1, binderC8141yG1));
            if (cg1.h != null) {
                try {
                    cg1.h.registerOnMeasurementEventListener(binderC8141yG1);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                }
            }
            cg1.f(new C4316iH1(cg1, binderC8141yG1, 2));
        }
    }

    public void j(int i, long j, long j2) throws C5643lA0 {
        C7481uo0 c7481uo0 = (C7481uo0) this.b;
        YN1.h(c7481uo0.d0);
        if (i == 160) {
            c7481uo0.S = false;
            c7481uo0.T = 0L;
            return;
        }
        if (i != 174) {
            if (i == 187) {
                c7481uo0.G = false;
                return;
            }
            if (i == 19899) {
                c7481uo0.y = -1;
                c7481uo0.z = -1L;
                return;
            }
            if (i == 20533) {
                c7481uo0.c(i);
                c7481uo0.w.h = true;
                return;
            }
            if (i == 21968) {
                c7481uo0.c(i);
                c7481uo0.w.y = true;
                return;
            }
            if (i == 408125543) {
                long j3 = c7481uo0.s;
                if (j3 != -1 && j3 != j) {
                    throw C5643lA0.a(null, "Multiple Segment elements not supported");
                }
                c7481uo0.s = j;
                c7481uo0.r = j2;
                return;
            }
            if (i == 475249515) {
                c7481uo0.E = new C1204Pf(10, (byte) 0);
                c7481uo0.F = new C1204Pf(10, (byte) 0);
                return;
            } else {
                if (i == 524531317 && !c7481uo0.x) {
                    if (c7481uo0.d && c7481uo0.B != -1) {
                        c7481uo0.A = true;
                        return;
                    } else {
                        c7481uo0.d0.x(new C4004gf(c7481uo0.v));
                        c7481uo0.x = true;
                        return;
                    }
                }
                return;
            }
        }
        C7290to0 c7290to0 = new C7290to0();
        c7290to0.m = -1;
        c7290to0.n = -1;
        c7290to0.o = -1;
        c7290to0.p = -1;
        c7290to0.q = -1;
        c7290to0.r = 0;
        c7290to0.s = -1;
        c7290to0.t = 0.0f;
        c7290to0.u = 0.0f;
        c7290to0.v = 0.0f;
        c7290to0.w = null;
        c7290to0.x = -1;
        c7290to0.y = false;
        c7290to0.z = -1;
        c7290to0.A = -1;
        c7290to0.B = -1;
        c7290to0.C = 1000;
        c7290to0.D = 200;
        c7290to0.E = -1.0f;
        c7290to0.F = -1.0f;
        c7290to0.G = -1.0f;
        c7290to0.H = -1.0f;
        c7290to0.I = -1.0f;
        c7290to0.J = -1.0f;
        c7290to0.K = -1.0f;
        c7290to0.L = -1.0f;
        c7290to0.M = -1.0f;
        c7290to0.N = -1.0f;
        c7290to0.P = 1;
        c7290to0.Q = -1;
        c7290to0.R = JosStatusCodes.RTN_CODE_COMMON_ERROR;
        c7290to0.S = 0L;
        c7290to0.T = 0L;
        c7290to0.W = true;
        c7290to0.X = "eng";
        c7481uo0.w = c7290to0;
    }

    @Override // defpackage.InterfaceC0195Cg0
    public void l(C1559Tt0 c1559Tt0, Object obj) {
        String strB = c1559Tt0.b();
        boolean zEquals = "k".equals(strB);
        C6827rN0 c6827rN0 = (C6827rN0) this.b;
        if (zEquals) {
            if (obj instanceof Integer) {
                EnumC0039Ag0.b.getClass();
                EnumC0039Ag0 enumC0039Ag0 = (EnumC0039Ag0) EnumC0039Ag0.c.get((Integer) obj);
                if (enumC0039Ag0 == null) {
                    enumC0039Ag0 = EnumC0039Ag0.d;
                }
                c6827rN0.g = enumC0039Ag0;
                return;
            }
            return;
        }
        if ("mv".equals(strB)) {
            if (obj instanceof int[]) {
                c6827rN0.a = (int[]) obj;
                return;
            }
            return;
        }
        if ("xs".equals(strB)) {
            if (obj instanceof String) {
                String str = (String) obj;
                if (str.isEmpty()) {
                    return;
                }
                c6827rN0.b = str;
                return;
            }
            return;
        }
        if ("xi".equals(strB)) {
            if (obj instanceof Integer) {
                c6827rN0.c = ((Integer) obj).intValue();
            }
        } else if ("pn".equals(strB) && (obj instanceof String) && !((String) obj).isEmpty()) {
            c6827rN0.getClass();
        }
    }

    @Override // defpackage.InterfaceC5369jk0
    public void m(InterfaceC5751lk0 interfaceC5751lk0, long j, long j2, boolean z) {
        ((C7937xC) this.b).x((C6025nA0) interfaceC5751lk0, j, j2);
    }

    @Override // defpackage.InterfaceC0195Cg0
    public void n(C1559Tt0 c1559Tt0, C0230Cs c0230Cs) {
    }

    @Override // defpackage.InterfaceC0195Cg0
    public InterfaceC0273Dg0 o(C1559Tt0 c1559Tt0) {
        String strB = c1559Tt0.b();
        if ("d1".equals(strB)) {
            return new C6255oN0(this, 0);
        }
        if ("d2".equals(strB)) {
            return new C6255oN0(this, 1);
        }
        return null;
    }

    @Override // defpackage.InterfaceC5369jk0
    public C3829fk0 o0(InterfaceC5751lk0 interfaceC5751lk0, long j, long j2, IOException iOException, int i) {
        C6025nA0 c6025nA0 = (C6025nA0) interfaceC5751lk0;
        C7937xC c7937xC = (C7937xC) this.b;
        c7937xC.getClass();
        long j3 = c6025nA0.a;
        Uri uri = c6025nA0.d.c;
        c7937xC.r.P(new C4020gk0(j2), c6025nA0.c, iOException, true);
        c7937xC.n.getClass();
        c7937xC.y(iOException);
        return C1857Xo1.h;
    }

    @Override // defpackage.InterfaceC1103Nx0
    public void onComplete(Task task) {
        if (!task.k()) {
            task.h();
            return;
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("deviceToken", (String) task.i());
        ((C3554eI0) this.b).b("remoteNotificationsRegistered", writableMapCreateMap);
    }

    @Override // defpackage.PZ
    public void onFailure(Throwable th) {
        switch (this.a) {
            case 13:
                boolean z = th instanceof MediaCodec.CodecException;
                C0481Fx1 c0481Fx1 = (C0481Fx1) this.b;
                if (!z) {
                    ((C7020sO) c0481Fx1.a).b(0, th.getMessage(), th);
                    break;
                } else {
                    C7020sO c7020sO = (C7020sO) c0481Fx1.a;
                    MediaCodec.CodecException codecException = (MediaCodec.CodecException) th;
                    c7020sO.getClass();
                    c7020sO.b(1, codecException.getMessage(), codecException);
                    break;
                }
            default:
                ((C0365El) this.b).d(th);
                break;
        }
    }

    @Override // defpackage.PZ
    public void onSuccess(Object obj) {
        switch (this.a) {
            case 13:
                break;
            default:
                C0365El c0365El = (C0365El) this.b;
                try {
                    c0365El.b(obj);
                    break;
                } catch (Throwable th) {
                    c0365El.d(th);
                }
        }
    }

    @Override // defpackage.InterfaceC0195Cg0
    public void p(C1559Tt0 c1559Tt0, C0074As c0074As, C1559Tt0 c1559Tt02) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0073, code lost:
    
        if (r2 >= 26) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0078, code lost:
    
        if (r2 >= 34) goto L96;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int q(defpackage.C6666qX r7) {
        /*
            r6 = this;
            r0 = 4
            r1 = 1
            java.lang.String r2 = r7.m
            r3 = 0
            if (r2 == 0) goto L84
            boolean r2 = defpackage.AbstractC1865Xr0.k(r2)
            if (r2 != 0) goto Lf
            goto L84
        Lf:
            int r2 = defpackage.AbstractC0277Dh1.a
            java.lang.String r7 = r7.m
            r7.getClass()
            int r2 = defpackage.AbstractC0277Dh1.a
            r4 = -1
            int r5 = r7.hashCode()
            switch(r5) {
                case -1487656890: goto L63;
                case -1487464693: goto L58;
                case -1487464690: goto L4d;
                case -1487394660: goto L42;
                case -1487018032: goto L37;
                case -879272239: goto L2c;
                case -879258763: goto L21;
                default: goto L20;
            }
        L20:
            goto L6d
        L21:
            java.lang.String r5 = "image/png"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L2a
            goto L6d
        L2a:
            r4 = 6
            goto L6d
        L2c:
            java.lang.String r5 = "image/bmp"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L35
            goto L6d
        L35:
            r4 = 5
            goto L6d
        L37:
            java.lang.String r5 = "image/webp"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L40
            goto L6d
        L40:
            r4 = r0
            goto L6d
        L42:
            java.lang.String r5 = "image/jpeg"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L4b
            goto L6d
        L4b:
            r4 = 3
            goto L6d
        L4d:
            java.lang.String r5 = "image/heif"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L56
            goto L6d
        L56:
            r4 = 2
            goto L6d
        L58:
            java.lang.String r5 = "image/heic"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L61
            goto L6d
        L61:
            r4 = r1
            goto L6d
        L63:
            java.lang.String r5 = "image/avif"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L6c
            goto L6d
        L6c:
            r4 = r3
        L6d:
            switch(r4) {
                case 0: goto L76;
                case 1: goto L71;
                case 2: goto L71;
                case 3: goto L7a;
                case 4: goto L7a;
                case 5: goto L7a;
                case 6: goto L7a;
                default: goto L70;
            }
        L70:
            goto L7f
        L71:
            r7 = 26
            if (r2 < r7) goto L7f
            goto L7a
        L76:
            r7 = 34
            if (r2 < r7) goto L7f
        L7a:
            int r7 = defpackage.AbstractC7209tN0.m(r0, r3, r3, r3)
            goto L83
        L7f:
            int r7 = defpackage.AbstractC7209tN0.m(r1, r3, r3, r3)
        L83:
            return r7
        L84:
            int r7 = defpackage.AbstractC7209tN0.m(r3, r3, r3, r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3866fw1.q(qX):int");
    }

    @Override // defpackage.InterfaceC0195Cg0
    public InterfaceC0195Cg0 r(C0074As c0074As, C1559Tt0 c1559Tt0) {
        return null;
    }

    @Override // defpackage.InterfaceC3677ex0
    public void r0(Object obj) {
        switch (this.a) {
            case 3:
                CharSequence charSequence = (CharSequence) obj;
                if (charSequence != null) {
                    C0431Fh c0431Fh = (C0431Fh) this.b;
                    if (c0431Fh.u()) {
                        c0431Fh.y(charSequence);
                    }
                    c0431Fh.b.e(null);
                    break;
                }
                break;
            default:
                CharSequence charSequence2 = (CharSequence) obj;
                CU cu = (CU) this.b;
                Handler handler = cu.a;
                GR0 gr0 = cu.b;
                handler.removeCallbacks(gr0);
                TextView textView = cu.g;
                if (textView != null) {
                    textView.setText(charSequence2);
                }
                cu.a.postDelayed(gr0, 2000L);
                break;
        }
    }

    @Override // defpackage.InterfaceC5369jk0
    public void v(InterfaceC5751lk0 interfaceC5751lk0, long j, long j2) {
        C6025nA0 c6025nA0 = (C6025nA0) interfaceC5751lk0;
        C7937xC c7937xC = (C7937xC) this.b;
        c7937xC.getClass();
        long j3 = c6025nA0.a;
        Uri uri = c6025nA0.d.c;
        C4020gk0 c4020gk0 = new C4020gk0(j2);
        c7937xC.n.getClass();
        c7937xC.r.L(c4020gk0, c6025nA0.c);
        c7937xC.M = ((Long) c6025nA0.f).longValue() - j;
        c7937xC.z(true);
    }

    @Override // defpackage.InterfaceC0131Bl
    public void w0(InterfaceC7089sl interfaceC7089sl, IOException iOException) {
        C7817wZ0 c7817wZ0 = (C7817wZ0) this.b;
        if (AbstractC5608l0.f.b(c7817wZ0, null, new U(iOException))) {
            AbstractC5608l0.c(c7817wZ0);
        }
    }

    public C3866fw1(Application application, C3738fG c3738fG) {
        this.a = 0;
        this.b = c3738fG;
    }

    public C3866fw1(WorkDatabase workDatabase) {
        this.a = 18;
        O90.f(workDatabase, "workDatabase");
        this.b = workDatabase;
    }

    public C3866fw1(int i) {
        this.a = i;
        switch (i) {
            case 19:
                this.b = C2223av.a();
                break;
            case 20:
                this.b = (LargeJpegImageQuirk) AbstractC7005sJ.a.z0(LargeJpegImageQuirk.class);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                this.b = new StringBuilder();
                break;
            case 29:
                this.b = new Stack();
                break;
            default:
                this.b = new C4403il(4);
                break;
        }
    }

    public C3866fw1(OB ob) {
        this.a = 9;
        this.b = ob.a;
    }

    @Override // defpackage.InterfaceC0195Cg0
    public void k() {
    }
}
