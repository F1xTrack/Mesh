package androidx.camera.extensions;

import android.content.Context;
import androidx.camera.extensions.impl.InitializerImpl;
import com.facebook.react.bridge.ReactContext;
import defpackage.AbstractC0759Jm0;
import defpackage.AbstractC1500Sz1;
import defpackage.AbstractC3782fU1;
import defpackage.AbstractC7792wR;
import defpackage.AbstractC8171yQ1;
import defpackage.C0365El;
import defpackage.C0599Hl;
import defpackage.C0686Io;
import defpackage.C0887Ld;
import defpackage.C1591Ue;
import defpackage.C3664et;
import defpackage.C4290i9;
import defpackage.C6799rE;
import defpackage.C7982xR;
import defpackage.CD0;
import defpackage.InterfaceC0046Ai1;
import defpackage.InterfaceC0296Do;
import defpackage.InterfaceC0761Jn;
import defpackage.InterfaceC6335oo;
import defpackage.InterfaceC6907ro;
import defpackage.InterfaceFutureC0750Jj0;
import defpackage.MR;
import defpackage.N8;
import defpackage.QR1;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class a {
    public static final Object c = new Object();
    public static C0599Hl d;
    public static a e;
    public final ExtensionsManager$ExtensionsAvailability a;
    public final N8 b;

    public a(ExtensionsManager$ExtensionsAvailability extensionsManager$ExtensionsAvailability, InterfaceC0296Do interfaceC0296Do) {
        this.a = extensionsManager$ExtensionsAvailability;
        this.b = new N8(interfaceC0296Do);
    }

    public static InterfaceFutureC0750Jj0 b(ReactContext reactContext, CD0 cd0) {
        InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0G;
        C3664et c3664et = C3664et.b;
        synchronized (c) {
            try {
                if (MR.d() == null) {
                    interfaceFutureC0750Jj0G = AbstractC1500Sz1.g(c(ExtensionsManager$ExtensionsAvailability.NONE, cd0));
                } else {
                    C1591Ue c1591Ue = C1591Ue.e;
                    if (C3664et.c(c1591Ue) || MR.g(c1591Ue)) {
                        interfaceFutureC0750Jj0G = AbstractC1500Sz1.g(c(ExtensionsManager$ExtensionsAvailability.LIBRARY_AVAILABLE, cd0));
                    } else {
                        if (d == null) {
                            d = AbstractC8171yQ1.b(new C4290i9(c3664et, reactContext, cd0, 9));
                        }
                        interfaceFutureC0750Jj0G = d;
                    }
                }
            } finally {
            }
        }
        return interfaceFutureC0750Jj0G;
    }

    public static a c(ExtensionsManager$ExtensionsAvailability extensionsManager$ExtensionsAvailability, InterfaceC0296Do interfaceC0296Do) {
        synchronized (c) {
            try {
                a aVar = e;
                if (aVar != null) {
                    return aVar;
                }
                a aVar2 = new a(extensionsManager$ExtensionsAvailability, interfaceC0296Do);
                e = aVar2;
                return aVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void f(C3664et c3664et, ReactContext reactContext, final CD0 cd0, final C0365El c0365El) {
        try {
            InitializerImpl.init(c3664et.e(), AbstractC3782fU1.f(reactContext), new InitializerImpl.OnExtensionsInitializedCallback() { // from class: androidx.camera.extensions.ExtensionsManager$1
                public void onFailure(int i) {
                    AbstractC0759Jm0.f("ExtensionsManager");
                    c0365El.b(a.c(ExtensionsManager$ExtensionsAvailability.LIBRARY_UNAVAILABLE_ERROR_LOADING, cd0));
                }

                public void onSuccess() {
                    AbstractC0759Jm0.f("ExtensionsManager");
                    c0365El.b(a.c(ExtensionsManager$ExtensionsAvailability.LIBRARY_AVAILABLE, cd0));
                }
            }, QR1.a());
        } catch (AbstractMethodError e2) {
            e = e2;
            e.toString();
            AbstractC0759Jm0.b("ExtensionsManager");
            c0365El.b(c(ExtensionsManager$ExtensionsAvailability.LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION, cd0));
        } catch (NoClassDefFoundError e3) {
            e = e3;
            e.toString();
            AbstractC0759Jm0.b("ExtensionsManager");
            c0365El.b(c(ExtensionsManager$ExtensionsAvailability.LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION, cd0));
        } catch (NoSuchMethodError e4) {
            e = e4;
            e.toString();
            AbstractC0759Jm0.b("ExtensionsManager");
            c0365El.b(c(ExtensionsManager$ExtensionsAvailability.LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION, cd0));
        } catch (RuntimeException e5) {
            e5.toString();
            AbstractC0759Jm0.b("ExtensionsManager");
            c0365El.b(c(ExtensionsManager$ExtensionsAvailability.LIBRARY_UNAVAILABLE_ERROR_LOADING, cd0));
        }
    }

    public final C0686Io a(C0686Io c0686Io, final int i) {
        if (i == 0) {
            return c0686Io;
        }
        if (this.a != ExtensionsManager$ExtensionsAvailability.LIBRARY_AVAILABLE) {
            throw new IllegalArgumentException("This device doesn't support extensions function! isExtensionAvailable should be checked first before calling getExtensionEnabledCameraSelector.");
        }
        final N8 n8 = this.b;
        n8.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(c0686Io.a);
        linkedHashSet.add(new C7982xR(N8.p(i), C6799rE.c(i)));
        if (new C0686Io(linkedHashSet).a(((InterfaceC0296Do) n8.b).g()).isEmpty()) {
            throw new IllegalArgumentException("No camera can be found to support the specified extensions mode! isExtensionAvailable should be checked first before calling getExtensionEnabledCameraSelector.");
        }
        Iterator it = c0686Io.a.iterator();
        while (it.hasNext()) {
            if (((InterfaceC6335oo) it.next()) instanceof C7982xR) {
                throw new IllegalArgumentException("An extension is already applied to the base CameraSelector.");
            }
        }
        final C0887Ld c0887Ld = new C0887Ld(N8.p(i));
        if (AbstractC7792wR.a(c0887Ld) == InterfaceC0761Jn.a) {
            InterfaceC0761Jn interfaceC0761Jn = new InterfaceC0761Jn() { // from class: OR
                @Override // defpackage.InterfaceC0761Jn
                public final InterfaceC0605Hn a(InterfaceC6907ro interfaceC6907ro, Context context) {
                    Object obj = n8.c;
                    int i2 = i;
                    InterfaceC0046Ai1 interfaceC0046Ai1C = C6799rE.c(i2);
                    interfaceC0046Ai1C.e(interfaceC6907ro);
                    PR pr = new PR(interfaceC0046Ai1C);
                    C0468Ft0 c0468Ft0B = C0468Ft0.b();
                    c0468Ft0B.e(NR.b, Integer.valueOf(i2));
                    c0468Ft0B.e(InterfaceC0605Hn.f0, pr);
                    c0468Ft0B.e(InterfaceC0605Hn.g0, c0887Ld);
                    c0468Ft0B.e(InterfaceC0605Hn.j0, Boolean.TRUE);
                    c0468Ft0B.e(InterfaceC0605Hn.k0, Boolean.valueOf(interfaceC0046Ai1C.i()));
                    c0468Ft0B.e(InterfaceC0605Hn.l0, Boolean.valueOf(interfaceC0046Ai1C.c()));
                    c0468Ft0B.e(InterfaceC0605Hn.h0, 1);
                    AbstractC3987gZ0 abstractC3987gZ0G = interfaceC0046Ai1C.g(context);
                    if (abstractC3987gZ0G != null) {
                        c0468Ft0B.e(InterfaceC0605Hn.i0, abstractC3987gZ0G);
                    }
                    return new NR(c0468Ft0B);
                }
            };
            synchronized (AbstractC7792wR.a) {
                AbstractC7792wR.b.put(c0887Ld, interfaceC0761Jn);
            }
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(c0686Io.a);
        linkedHashSet2.add(new C7982xR(N8.p(i), C6799rE.c(i)));
        return new C0686Io(linkedHashSet2);
    }

    public final boolean d(C0686Io c0686Io, int i) {
        if (i == 0) {
            return true;
        }
        if (this.a != ExtensionsManager$ExtensionsAvailability.LIBRARY_AVAILABLE) {
            return false;
        }
        this.b.getClass();
        new LinkedHashSet(c0686Io.a).add(new C7982xR(N8.p(i), C6799rE.c(i)));
        return !new C0686Io(r2).a(((InterfaceC0296Do) r1.b).g()).isEmpty();
    }

    public final boolean e(C0686Io c0686Io, int i) {
        if (i == 0) {
            return true;
        }
        if (this.a != ExtensionsManager$ExtensionsAvailability.LIBRARY_AVAILABLE) {
            return false;
        }
        N8 n8 = this.b;
        n8.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(c0686Io.a);
        linkedHashSet.add(new C7982xR(N8.p(i), C6799rE.c(i)));
        List listA = new C0686Io(linkedHashSet).a(((InterfaceC0296Do) n8.b).g());
        if (listA.isEmpty()) {
            return false;
        }
        InterfaceC6907ro interfaceC6907ro = (InterfaceC6907ro) listA.get(0);
        InterfaceC0046Ai1 interfaceC0046Ai1C = C6799rE.c(i);
        interfaceC0046Ai1C.e(interfaceC6907ro);
        return interfaceC0046Ai1C.f().length > 0;
    }
}
