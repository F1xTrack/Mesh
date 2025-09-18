package p000;

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
import com.p019vk.push.core.remote.config.omicron.util.UrlEncoder;
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
public final class C9432fw1 implements InterfaceC9644ha1, InterfaceC9305ex0, InterfaceC11883z60, InterfaceC8398Uw0, InterfaceC9919jk0, InterfaceC0980PZ, InterfaceC4243iS, InterfaceC0363Fl, InterfaceC0111Bl, InterfaceC6424mP, InterfaceC8036Nx0, InterfaceC7430Cg0 {

    /* renamed from: c */
    public static final String[] f27503c = {"_data"};

    /* renamed from: a */
    public final /* synthetic */ int f27504a;

    /* renamed from: b */
    public final Object f27505b;

    public /* synthetic */ C9432fw1(int i, Object obj) {
        this.f27504a = i;
        this.f27505b = obj;
    }

    @Override // p000.InterfaceC6424mP
    /* renamed from: X */
    public boolean mo17857X(int i, String str) {
        VB0 vb0 = (VB0) this.f27505b;
        if (!str.equals(vb0.f12399b)) {
            return false;
        }
        switch (str) {
            case "topPointerDown":
            case "topPointerMove":
            case "topPointerOver":
            case "topPointerUp":
            case "topPointerCancel":
            case "topPointerOut":
                UB0 ub0 = vb0.f12402e;
                Iterator it = ((List) ub0.f11678f.get(Integer.valueOf(ub0.f11674b))).iterator();
                while (it.hasNext()) {
                    if (((C11819yb1) it.next()).f46332a == i) {
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

    @Override // p000.InterfaceC0111Bl
    /* renamed from: Z */
    public void mo851Z(InterfaceC6843sl interfaceC6843sl, HS0 hs0) {
        C11560wZ0 c11560wZ0 = (C11560wZ0) this.f27505b;
        if (AbstractC6336l0.f36797f.mo9191b(c11560wZ0, null, hs0)) {
            AbstractC6336l0.m22322c(c11560wZ0);
        }
    }

    /* renamed from: a */
    public void m18331a(Object obj, String str) {
        StringBuilder sb = (StringBuilder) this.f27505b;
        if (sb.length() > 0) {
            sb.append('&');
        }
        sb.append(str);
        sb.append('=');
        sb.append(UrlEncoder.encodeUtf8(obj));
    }

    /* JADX WARN: Code restructure failed: missing block: B:277:0x0258, code lost:
    
        throw p000.C10103lA0.m22366a(null, "EBML lacing sample size out of range.");
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m18332b(int r20, int r21, p000.C7000vF r22) throws p000.C10103lA0, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 776
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C9432fw1.m18332b(int, int, vF):void");
    }

    @Override // p000.InterfaceC8398Uw0
    /* renamed from: c */
    public Object mo913c() {
        Type type = (Type) this.f27505b;
        if (!(type instanceof ParameterizedType)) {
            throw new C6838sg("Invalid EnumSet type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return EnumSet.noneOf((Class) type2);
        }
        throw new C6838sg("Invalid EnumSet type: " + type.toString());
    }

    /* renamed from: d */
    public void m18333d(AbstractC0488Hk abstractC0488Hk) {
        if (!abstractC0488Hk.mo3577q()) {
            if (!(abstractC0488Hk instanceof C11802yT0)) {
                String strValueOf = String.valueOf(abstractC0488Hk.getClass());
                throw new IllegalArgumentException(AbstractC1374Vq.m8593l(new StringBuilder(strValueOf.length() + 49), "Has a new type of ByteString been created? Found ", strValueOf));
            }
            C11802yT0 c11802yT0 = (C11802yT0) abstractC0488Hk;
            m18333d(c11802yT0.f46266c);
            m18333d(c11802yT0.f46267d);
            return;
        }
        int size = abstractC0488Hk.size();
        int[] iArr = C11802yT0.f46264h;
        int iBinarySearch = Arrays.binarySearch(iArr, size);
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        int i = iArr[iBinarySearch + 1];
        Stack stack = (Stack) this.f27505b;
        if (stack.isEmpty() || ((AbstractC0488Hk) stack.peek()).size() >= i) {
            stack.push(abstractC0488Hk);
            return;
        }
        int i2 = iArr[iBinarySearch];
        AbstractC0488Hk c11802yT02 = (AbstractC0488Hk) stack.pop();
        while (!stack.isEmpty() && ((AbstractC0488Hk) stack.peek()).size() < i2) {
            c11802yT02 = new C11802yT0((AbstractC0488Hk) stack.pop(), c11802yT02);
        }
        C11802yT0 c11802yT03 = new C11802yT0(c11802yT02, abstractC0488Hk);
        while (!stack.isEmpty()) {
            int[] iArr2 = C11802yT0.f46264h;
            int iBinarySearch2 = Arrays.binarySearch(iArr2, c11802yT03.f46265b);
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (((AbstractC0488Hk) stack.peek()).size() >= iArr2[iBinarySearch2 + 1]) {
                break;
            } else {
                c11802yT03 = new C11802yT0((AbstractC0488Hk) stack.pop(), c11802yT03);
            }
        }
        stack.push(c11802yT03);
    }

    /* renamed from: e */
    public int m18334e(byte[] bArr) {
        int i;
        byte b;
        if (((LargeJpegImageQuirk) this.f27505b) == null || !(("Samsung".equalsIgnoreCase(Build.BRAND) && LargeJpegImageQuirk.f15959a.contains(Build.MODEL.toUpperCase(Locale.US))) || LargeJpegImageQuirk.m9898d() || bArr.length > 10000000)) {
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

    /* renamed from: f */
    public void m18335f(int i, long j) throws C10103lA0 {
        C11335uo0 c11335uo0 = (C11335uo0) this.f27505b;
        c11335uo0.getClass();
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw C10103lA0.m22366a(null, "ContentEncodingOrder " + j + " not supported");
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw C10103lA0.m22366a(null, "ContentEncodingScope " + j + " not supported");
        }
        switch (i) {
            case 131:
                c11335uo0.m25241c(i);
                c11335uo0.f43923w.f43298d = (int) j;
                return;
            case ModuleDescriptor.MODULE_VERSION /* 136 */:
                c11335uo0.m25241c(i);
                c11335uo0.f43923w.f43291W = j == 1;
                return;
            case 155:
                c11335uo0.f43881K = c11335uo0.m25245m(j);
                return;
            case 159:
                c11335uo0.m25241c(i);
                c11335uo0.f43923w.f43284P = (int) j;
                return;
            case 176:
                c11335uo0.m25241c(i);
                c11335uo0.f43923w.f43307m = (int) j;
                return;
            case 179:
                c11335uo0.m25240a(i);
                c11335uo0.f43875E.m6394c(c11335uo0.m25245m(j));
                return;
            case 186:
                c11335uo0.m25241c(i);
                c11335uo0.f43923w.f43308n = (int) j;
                return;
            case 215:
                c11335uo0.m25241c(i);
                c11335uo0.f43923w.f43297c = (int) j;
                return;
            case 231:
                c11335uo0.f43874D = c11335uo0.m25245m(j);
                return;
            case 238:
                c11335uo0.f43888R = (int) j;
                return;
            case 241:
                if (c11335uo0.f43877G) {
                    return;
                }
                c11335uo0.m25240a(i);
                c11335uo0.f43876F.m6394c(j);
                c11335uo0.f43877G = true;
                return;
            case 251:
                c11335uo0.f43889S = true;
                return;
            case 16871:
                c11335uo0.m25241c(i);
                c11335uo0.f43923w.f43301g = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw C10103lA0.m22366a(null, "ContentCompAlgo " + j + " not supported");
            case 17029:
                if (j < 1 || j > 2) {
                    throw C10103lA0.m22366a(null, "DocTypeReadVersion " + j + " not supported");
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw C10103lA0.m22366a(null, "EBMLReadVersion " + j + " not supported");
            case 18401:
                if (j == 5) {
                    return;
                }
                throw C10103lA0.m22366a(null, "ContentEncAlgo " + j + " not supported");
            case 18408:
                if (j == 1) {
                    return;
                }
                throw C10103lA0.m22366a(null, "AESSettingsCipherMode " + j + " not supported");
            case 21420:
                c11335uo0.f43926z = j + c11335uo0.f43919s;
                return;
            case 21432:
                int i2 = (int) j;
                c11335uo0.m25241c(i);
                if (i2 == 0) {
                    c11335uo0.f43923w.f43318x = 0;
                    return;
                }
                if (i2 == 1) {
                    c11335uo0.f43923w.f43318x = 2;
                    return;
                } else if (i2 == 3) {
                    c11335uo0.f43923w.f43318x = 1;
                    return;
                } else {
                    if (i2 != 15) {
                        return;
                    }
                    c11335uo0.f43923w.f43318x = 3;
                    return;
                }
            case 21680:
                c11335uo0.m25241c(i);
                c11335uo0.f43923w.f43310p = (int) j;
                return;
            case 21682:
                c11335uo0.m25241c(i);
                c11335uo0.f43923w.f43312r = (int) j;
                return;
            case 21690:
                c11335uo0.m25241c(i);
                c11335uo0.f43923w.f43311q = (int) j;
                return;
            case 21930:
                c11335uo0.m25241c(i);
                c11335uo0.f43923w.f43290V = j == 1;
                return;
            case 21938:
                c11335uo0.m25241c(i);
                C11207to0 c11207to0 = c11335uo0.f43923w;
                c11207to0.f43319y = true;
                c11207to0.f43309o = (int) j;
                return;
            case 21998:
                c11335uo0.m25241c(i);
                c11335uo0.f43923w.f43300f = (int) j;
                return;
            case 22186:
                c11335uo0.m25241c(i);
                c11335uo0.f43923w.f43287S = j;
                return;
            case 22203:
                c11335uo0.m25241c(i);
                c11335uo0.f43923w.f43288T = j;
                return;
            case 25188:
                c11335uo0.m25241c(i);
                c11335uo0.f43923w.f43285Q = (int) j;
                return;
            case 30114:
                c11335uo0.f43890T = j;
                return;
            case 30321:
                c11335uo0.m25241c(i);
                int i3 = (int) j;
                if (i3 == 0) {
                    c11335uo0.f43923w.f43313s = 0;
                    return;
                }
                if (i3 == 1) {
                    c11335uo0.f43923w.f43313s = 1;
                    return;
                } else if (i3 == 2) {
                    c11335uo0.f43923w.f43313s = 2;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    c11335uo0.f43923w.f43313s = 3;
                    return;
                }
            case 2352003:
                c11335uo0.m25241c(i);
                c11335uo0.f43923w.f43299e = (int) j;
                return;
            case 2807729:
                c11335uo0.f43920t = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        c11335uo0.m25241c(i);
                        int i4 = (int) j;
                        if (i4 == 1) {
                            c11335uo0.f43923w.f43270B = 2;
                            return;
                        } else {
                            if (i4 != 2) {
                                return;
                            }
                            c11335uo0.f43923w.f43270B = 1;
                            return;
                        }
                    case 21946:
                        c11335uo0.m25241c(i);
                        int iM2821g = C0372Fu.m2821g((int) j);
                        if (iM2821g != -1) {
                            c11335uo0.f43923w.f43269A = iM2821g;
                            return;
                        }
                        return;
                    case 21947:
                        c11335uo0.m25241c(i);
                        c11335uo0.f43923w.f43319y = true;
                        int iM2820f = C0372Fu.m2820f((int) j);
                        if (iM2820f != -1) {
                            c11335uo0.f43923w.f43320z = iM2820f;
                            return;
                        }
                        return;
                    case 21948:
                        c11335uo0.m25241c(i);
                        c11335uo0.f43923w.f43271C = (int) j;
                        return;
                    case 21949:
                        c11335uo0.m25241c(i);
                        c11335uo0.f43923w.f43272D = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    /* renamed from: g */
    public void m18336g() {
        ((C1418WX) this.f27505b).f14959d.m10048N();
    }

    @Override // javax.inject.Provider
    public Object get() {
        String packageName = ((Context) ((C7668Gv0) this.f27505b).f3961a).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p000.InterfaceC9644ha1
    /* renamed from: h */
    public Cursor mo864h(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        return ((ContentResolver) this.f27505b).query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f27503c, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, null);
    }

    @Override // p000.InterfaceC0363Fl
    /* renamed from: h0 */
    public Object mo411h0(C0300El c0300El) {
        C11834yj0 c11834yj0 = (C11834yj0) this.f27505b;
        AbstractC9104dM1.m17550i(c11834yj0.f46431f == null, "The result can only set once!");
        c11834yj0.f46431f = c0300El;
        return "ListFuture[" + this + "]";
    }

    /* renamed from: i */
    public void m18337i(C8963cI1 c8963cI1) {
        CG1 cg1 = (CG1) this.f27505b;
        cg1.getClass();
        Preconditions.checkNotNull(c8963cI1);
        synchronized (cg1.f1291e) {
            for (int i = 0; i < cg1.f1291e.size(); i++) {
                try {
                    if (c8963cI1.equals(((Pair) cg1.f1291e.get(i)).first)) {
                        return;
                    }
                } finally {
                }
            }
            BinderC11777yG1 binderC11777yG1 = new BinderC11777yG1(c8963cI1);
            cg1.f1291e.add(new Pair(c8963cI1, binderC11777yG1));
            if (cg1.f1294h != null) {
                try {
                    cg1.f1294h.registerOnMeasurementEventListener(binderC11777yG1);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                }
            }
            cg1.m1136f(new C9734iH1(cg1, binderC11777yG1, 2));
        }
    }

    /* renamed from: j */
    public void m18338j(int i, long j, long j2) throws C10103lA0 {
        C11335uo0 c11335uo0 = (C11335uo0) this.f27505b;
        YN1.m9283h(c11335uo0.f43904d0);
        if (i == 160) {
            c11335uo0.f43889S = false;
            c11335uo0.f43890T = 0L;
            return;
        }
        if (i != 174) {
            if (i == 187) {
                c11335uo0.f43877G = false;
                return;
            }
            if (i == 19899) {
                c11335uo0.f43925y = -1;
                c11335uo0.f43926z = -1L;
                return;
            }
            if (i == 20533) {
                c11335uo0.m25241c(i);
                c11335uo0.f43923w.f43302h = true;
                return;
            }
            if (i == 21968) {
                c11335uo0.m25241c(i);
                c11335uo0.f43923w.f43319y = true;
                return;
            }
            if (i == 408125543) {
                long j3 = c11335uo0.f43919s;
                if (j3 != -1 && j3 != j) {
                    throw C10103lA0.m22366a(null, "Multiple Segment elements not supported");
                }
                c11335uo0.f43919s = j;
                c11335uo0.f43918r = j2;
                return;
            }
            if (i == 475249515) {
                c11335uo0.f43875E = new C0986Pf(10, (byte) 0);
                c11335uo0.f43876F = new C0986Pf(10, (byte) 0);
                return;
            } else {
                if (i == 524531317 && !c11335uo0.f43924x) {
                    if (c11335uo0.f43903d && c11335uo0.f43872B != -1) {
                        c11335uo0.f43871A = true;
                        return;
                    } else {
                        c11335uo0.f43904d0.mo2006x(new C4130gf(c11335uo0.f43922v));
                        c11335uo0.f43924x = true;
                        return;
                    }
                }
                return;
            }
        }
        C11207to0 c11207to0 = new C11207to0();
        c11207to0.f43307m = -1;
        c11207to0.f43308n = -1;
        c11207to0.f43309o = -1;
        c11207to0.f43310p = -1;
        c11207to0.f43311q = -1;
        c11207to0.f43312r = 0;
        c11207to0.f43313s = -1;
        c11207to0.f43314t = 0.0f;
        c11207to0.f43315u = 0.0f;
        c11207to0.f43316v = 0.0f;
        c11207to0.f43317w = null;
        c11207to0.f43318x = -1;
        c11207to0.f43319y = false;
        c11207to0.f43320z = -1;
        c11207to0.f43269A = -1;
        c11207to0.f43270B = -1;
        c11207to0.f43271C = 1000;
        c11207to0.f43272D = 200;
        c11207to0.f43273E = -1.0f;
        c11207to0.f43274F = -1.0f;
        c11207to0.f43275G = -1.0f;
        c11207to0.f43276H = -1.0f;
        c11207to0.f43277I = -1.0f;
        c11207to0.f43278J = -1.0f;
        c11207to0.f43279K = -1.0f;
        c11207to0.f43280L = -1.0f;
        c11207to0.f43281M = -1.0f;
        c11207to0.f43282N = -1.0f;
        c11207to0.f43284P = 1;
        c11207to0.f43285Q = -1;
        c11207to0.f43286R = JosStatusCodes.RTN_CODE_COMMON_ERROR;
        c11207to0.f43287S = 0L;
        c11207to0.f43288T = 0L;
        c11207to0.f43291W = true;
        c11207to0.f43292X = "eng";
        c11335uo0.f43923w = c11207to0;
    }

    @Override // p000.InterfaceC7430Cg0
    /* renamed from: l */
    public void mo1264l(C8340Tt0 c8340Tt0, Object obj) {
        String strM7801b = c8340Tt0.m7801b();
        boolean zEquals = "k".equals(strM7801b);
        C10897rN0 c10897rN0 = (C10897rN0) this.f27505b;
        if (zEquals) {
            if (obj instanceof Integer) {
                EnumC7326Ag0.f323b.getClass();
                EnumC7326Ag0 enumC7326Ag0 = (EnumC7326Ag0) EnumC7326Ag0.f324c.get((Integer) obj);
                if (enumC7326Ag0 == null) {
                    enumC7326Ag0 = EnumC7326Ag0.f325d;
                }
                c10897rN0.f41631g = enumC7326Ag0;
                return;
            }
            return;
        }
        if ("mv".equals(strM7801b)) {
            if (obj instanceof int[]) {
                c10897rN0.f41625a = (int[]) obj;
                return;
            }
            return;
        }
        if ("xs".equals(strM7801b)) {
            if (obj instanceof String) {
                String str = (String) obj;
                if (str.isEmpty()) {
                    return;
                }
                c10897rN0.f41626b = str;
                return;
            }
            return;
        }
        if ("xi".equals(strM7801b)) {
            if (obj instanceof Integer) {
                c10897rN0.f41627c = ((Integer) obj).intValue();
            }
        } else if ("pn".equals(strM7801b) && (obj instanceof String) && !((String) obj).isEmpty()) {
            c10897rN0.getClass();
        }
    }

    @Override // p000.InterfaceC9919jk0
    /* renamed from: m */
    public void mo2001m(InterfaceC10175lk0 interfaceC10175lk0, long j, long j2, boolean z) {
        ((C7123xC) this.f27505b).m25811x((C10359nA0) interfaceC10175lk0, j, j2);
    }

    @Override // p000.InterfaceC7430Cg0
    /* renamed from: n */
    public void mo1265n(C8340Tt0 c8340Tt0, C0181Cs c0181Cs) {
    }

    @Override // p000.InterfaceC7430Cg0
    /* renamed from: o */
    public InterfaceC7482Dg0 mo1266o(C8340Tt0 c8340Tt0) {
        String strM7801b = c8340Tt0.m7801b();
        if ("d1".equals(strM7801b)) {
            return new C10513oN0(this, 0);
        }
        if ("d2".equals(strM7801b)) {
            return new C10513oN0(this, 1);
        }
        return null;
    }

    @Override // p000.InterfaceC9919jk0
    /* renamed from: o0 */
    public C9407fk0 mo2002o0(InterfaceC10175lk0 interfaceC10175lk0, long j, long j2, IOException iOException, int i) {
        C10359nA0 c10359nA0 = (C10359nA0) interfaceC10175lk0;
        C7123xC c7123xC = (C7123xC) this.f27505b;
        c7123xC.getClass();
        long j3 = c10359nA0.f38158a;
        Uri uri = c10359nA0.f38161d.f6987c;
        c7123xC.f45465r.m8478P(new C9535gk0(j2), c10359nA0.f38160c, iOException, true);
        c7123xC.f45461n.getClass();
        c7123xC.m25812y(iOException);
        return C8539Xo1.f13978h;
    }

    @Override // p000.InterfaceC8036Nx0
    public void onComplete(Task task) {
        if (!task.mo11144k()) {
            task.mo11141h();
            return;
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("deviceToken", (String) task.mo11142i());
        ((C9223eI0) this.f27505b).m17898b("remoteNotificationsRegistered", writableMapCreateMap);
    }

    @Override // p000.InterfaceC0980PZ
    public void onFailure(Throwable th) {
        switch (this.f27504a) {
            case 13:
                boolean z = th instanceof MediaCodec.CodecException;
                C7621Fx1 c7621Fx1 = (C7621Fx1) this.f27505b;
                if (!z) {
                    ((C6820sO) c7621Fx1.f3494a).m24718b(0, th.getMessage(), th);
                    break;
                } else {
                    C6820sO c6820sO = (C6820sO) c7621Fx1.f3494a;
                    MediaCodec.CodecException codecException = (MediaCodec.CodecException) th;
                    c6820sO.getClass();
                    c6820sO.m24718b(1, codecException.getMessage(), codecException);
                    break;
                }
            default:
                ((C0300El) this.f27505b).m2377d(th);
                break;
        }
    }

    @Override // p000.InterfaceC0980PZ
    public void onSuccess(Object obj) {
        switch (this.f27504a) {
            case 13:
                break;
            default:
                C0300El c0300El = (C0300El) this.f27505b;
                try {
                    c0300El.m2375b(obj);
                    break;
                } catch (Throwable th) {
                    c0300El.m2377d(th);
                }
        }
    }

    @Override // p000.InterfaceC7430Cg0
    /* renamed from: p */
    public void mo1267p(C8340Tt0 c8340Tt0, C0055As c0055As, C8340Tt0 c8340Tt02) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0073, code lost:
    
        if (r2 >= 26) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0078, code lost:
    
        if (r2 >= 34) goto L96;
     */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int m18339q(p000.C6686qX r7) {
        /*
            r6 = this;
            r0 = 4
            r1 = 1
            java.lang.String r2 = r7.f40974m
            r3 = 0
            if (r2 == 0) goto L84
            boolean r2 = p000.AbstractC8544Xr0.m9168k(r2)
            if (r2 != 0) goto Lf
            goto L84
        Lf:
            int r2 = p000.AbstractC7485Dh1.f2166a
            java.lang.String r7 = r7.f40974m
            r7.getClass()
            int r2 = p000.AbstractC7485Dh1.f2166a
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
            int r7 = p000.AbstractC11153tN0.m24901m(r0, r3, r3, r3)
            goto L83
        L7f:
            int r7 = p000.AbstractC11153tN0.m24901m(r1, r3, r3, r3)
        L83:
            return r7
        L84:
            int r7 = p000.AbstractC11153tN0.m24901m(r3, r3, r3, r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C9432fw1.m18339q(qX):int");
    }

    @Override // p000.InterfaceC7430Cg0
    /* renamed from: r */
    public InterfaceC7430Cg0 mo1268r(C0055As c0055As, C8340Tt0 c8340Tt0) {
        return null;
    }

    @Override // p000.InterfaceC9305ex0
    /* renamed from: r0 */
    public void mo505r0(Object obj) {
        switch (this.f27504a) {
            case 3:
                CharSequence charSequence = (CharSequence) obj;
                if (charSequence != null) {
                    C0359Fh c0359Fh = (C0359Fh) this.f27505b;
                    if (c0359Fh.m2742u()) {
                        c0359Fh.m2746y(charSequence);
                    }
                    c0359Fh.f3389b.m6414e(null);
                    break;
                }
                break;
            default:
                CharSequence charSequence2 = (CharSequence) obj;
                C0157CU c0157cu = (C0157CU) this.f27505b;
                Handler handler = c0157cu.f1392a;
                GR0 gr0 = c0157cu.f1393b;
                handler.removeCallbacks(gr0);
                TextView textView = c0157cu.f1398g;
                if (textView != null) {
                    textView.setText(charSequence2);
                }
                c0157cu.f1392a.postDelayed(gr0, 2000L);
                break;
        }
    }

    @Override // p000.InterfaceC9919jk0
    /* renamed from: v */
    public void mo2004v(InterfaceC10175lk0 interfaceC10175lk0, long j, long j2) {
        C10359nA0 c10359nA0 = (C10359nA0) interfaceC10175lk0;
        C7123xC c7123xC = (C7123xC) this.f27505b;
        c7123xC.getClass();
        long j3 = c10359nA0.f38158a;
        Uri uri = c10359nA0.f38161d.f6987c;
        C9535gk0 c9535gk0 = new C9535gk0(j2);
        c7123xC.f45461n.getClass();
        c7123xC.f45465r.m8474L(c9535gk0, c10359nA0.f38160c);
        c7123xC.f45450M = ((Long) c10359nA0.f38163f).longValue() - j;
        c7123xC.m25813z(true);
    }

    @Override // p000.InterfaceC0111Bl
    /* renamed from: w0 */
    public void mo852w0(InterfaceC6843sl interfaceC6843sl, IOException iOException) {
        C11560wZ0 c11560wZ0 = (C11560wZ0) this.f27505b;
        if (AbstractC6336l0.f36797f.mo9191b(c11560wZ0, null, new C1258U(iOException))) {
            AbstractC6336l0.m22322c(c11560wZ0);
        }
    }

    public C9432fw1(Application application, C4042fG c4042fG) {
        this.f27504a = 0;
        this.f27505b = c4042fG;
    }

    public C9432fw1(WorkDatabase workDatabase) {
        this.f27504a = 18;
        O90.m5968f(workDatabase, "workDatabase");
        this.f27505b = workDatabase;
    }

    public C9432fw1(int i) {
        this.f27504a = i;
        switch (i) {
            case 19:
                this.f27505b = C1752av.m10357a();
                break;
            case 20:
                this.f27505b = (LargeJpegImageQuirk) AbstractC6815sJ.f42362a.m17864z0(LargeJpegImageQuirk.class);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                this.f27505b = new StringBuilder();
                break;
            case 29:
                this.f27505b = new Stack();
                break;
            default:
                this.f27505b = new C4262il(4);
                break;
        }
    }

    public C9432fw1(C0893OB c0893ob) {
        this.f27504a = 9;
        this.f27505b = c0893ob.f8267a;
    }

    @Override // p000.InterfaceC7430Cg0
    /* renamed from: k */
    public void mo1263k() {
    }
}
