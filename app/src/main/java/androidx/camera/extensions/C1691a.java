package androidx.camera.extensions;

import android.content.Context;
import androidx.camera.extensions.impl.InitializerImpl;
import com.facebook.react.bridge.ReactContext;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import p000.AbstractC0783MR;
import p000.AbstractC11797yQ1;
import p000.AbstractC7075wR;
import p000.AbstractC7806Jm0;
import p000.AbstractC8301Sz1;
import p000.AbstractC9376fU1;
import p000.C0300El;
import p000.C0489Hl;
import p000.C0555Io;
import p000.C0732Ld;
import p000.C0827N8;
import p000.C1299Ue;
import p000.C4018et;
import p000.C4224i9;
import p000.C6730rE;
import p000.C7138xR;
import p000.CD0;
import p000.InterfaceC0240Do;
import p000.InterfaceC0617Jn;
import p000.InterfaceC6575oo;
import p000.InterfaceC6766ro;
import p000.InterfaceC7331Ai1;
import p000.InterfaceFutureC7800Jj0;
import p000.QR1;

/* renamed from: androidx.camera.extensions.a */
/* loaded from: classes.dex */
public final class C1691a {

    /* renamed from: c */
    public static final Object f15963c = new Object();

    /* renamed from: d */
    public static C0489Hl f15964d;

    /* renamed from: e */
    public static C1691a f15965e;

    /* renamed from: a */
    public final ExtensionsManager$ExtensionsAvailability f15966a;

    /* renamed from: b */
    public final C0827N8 f15967b;

    public C1691a(ExtensionsManager$ExtensionsAvailability extensionsManager$ExtensionsAvailability, InterfaceC0240Do interfaceC0240Do) {
        this.f15966a = extensionsManager$ExtensionsAvailability;
        this.f15967b = new C0827N8(interfaceC0240Do);
    }

    /* renamed from: b */
    public static InterfaceFutureC7800Jj0 m9899b(ReactContext reactContext, CD0 cd0) {
        InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0M7484g;
        C4018et c4018et = C4018et.f26925b;
        synchronized (f15963c) {
            try {
                if (AbstractC0783MR.m5366d() == null) {
                    interfaceFutureC7800Jj0M7484g = AbstractC8301Sz1.m7484g(m9900c(ExtensionsManager$ExtensionsAvailability.NONE, cd0));
                } else {
                    C1299Ue c1299Ue = C1299Ue.f11944e;
                    if (C4018et.m18063c(c1299Ue) || AbstractC0783MR.m5367g(c1299Ue)) {
                        interfaceFutureC7800Jj0M7484g = AbstractC8301Sz1.m7484g(m9900c(ExtensionsManager$ExtensionsAvailability.LIBRARY_AVAILABLE, cd0));
                    } else {
                        if (f15964d == null) {
                            f15964d = AbstractC11797yQ1.m26149b(new C4224i9(c4018et, reactContext, cd0, 9));
                        }
                        interfaceFutureC7800Jj0M7484g = f15964d;
                    }
                }
            } finally {
            }
        }
        return interfaceFutureC7800Jj0M7484g;
    }

    /* renamed from: c */
    public static C1691a m9900c(ExtensionsManager$ExtensionsAvailability extensionsManager$ExtensionsAvailability, InterfaceC0240Do interfaceC0240Do) {
        synchronized (f15963c) {
            try {
                C1691a c1691a = f15965e;
                if (c1691a != null) {
                    return c1691a;
                }
                C1691a c1691a2 = new C1691a(extensionsManager$ExtensionsAvailability, interfaceC0240Do);
                f15965e = c1691a2;
                return c1691a2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: f */
    public static /* synthetic */ void m9901f(C4018et c4018et, ReactContext reactContext, final CD0 cd0, final C0300El c0300El) {
        try {
            InitializerImpl.init(c4018et.m18066e(), AbstractC9376fU1.m18245f(reactContext), new InitializerImpl.OnExtensionsInitializedCallback() { // from class: androidx.camera.extensions.ExtensionsManager$1
                public void onFailure(int i) {
                    AbstractC7806Jm0.m4412f("ExtensionsManager");
                    c0300El.m2375b(C1691a.m9900c(ExtensionsManager$ExtensionsAvailability.LIBRARY_UNAVAILABLE_ERROR_LOADING, cd0));
                }

                public void onSuccess() {
                    AbstractC7806Jm0.m4412f("ExtensionsManager");
                    c0300El.m2375b(C1691a.m9900c(ExtensionsManager$ExtensionsAvailability.LIBRARY_AVAILABLE, cd0));
                }
            }, QR1.m6703a());
        } catch (AbstractMethodError e) {
            e = e;
            e.toString();
            AbstractC7806Jm0.m4408b("ExtensionsManager");
            c0300El.m2375b(m9900c(ExtensionsManager$ExtensionsAvailability.LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION, cd0));
        } catch (NoClassDefFoundError e2) {
            e = e2;
            e.toString();
            AbstractC7806Jm0.m4408b("ExtensionsManager");
            c0300El.m2375b(m9900c(ExtensionsManager$ExtensionsAvailability.LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION, cd0));
        } catch (NoSuchMethodError e3) {
            e = e3;
            e.toString();
            AbstractC7806Jm0.m4408b("ExtensionsManager");
            c0300El.m2375b(m9900c(ExtensionsManager$ExtensionsAvailability.LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION, cd0));
        } catch (RuntimeException e4) {
            e4.toString();
            AbstractC7806Jm0.m4408b("ExtensionsManager");
            c0300El.m2375b(m9900c(ExtensionsManager$ExtensionsAvailability.LIBRARY_UNAVAILABLE_ERROR_LOADING, cd0));
        }
    }

    /* renamed from: a */
    public final C0555Io m9902a(C0555Io c0555Io, final int i) {
        if (i == 0) {
            return c0555Io;
        }
        if (this.f15966a != ExtensionsManager$ExtensionsAvailability.LIBRARY_AVAILABLE) {
            throw new IllegalArgumentException("This device doesn't support extensions function! isExtensionAvailable should be checked first before calling getExtensionEnabledCameraSelector.");
        }
        final C0827N8 c0827n8 = this.f15967b;
        c0827n8.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(c0555Io.f5156a);
        linkedHashSet.add(new C7138xR(C0827N8.m5554p(i), C6730rE.m24241c(i)));
        if (new C0555Io(linkedHashSet).m4004a(((InterfaceC0240Do) c0827n8.f7523b).mo1118g()).isEmpty()) {
            throw new IllegalArgumentException("No camera can be found to support the specified extensions mode! isExtensionAvailable should be checked first before calling getExtensionEnabledCameraSelector.");
        }
        Iterator it = c0555Io.f5156a.iterator();
        while (it.hasNext()) {
            if (((InterfaceC6575oo) it.next()) instanceof C7138xR) {
                throw new IllegalArgumentException("An extension is already applied to the base CameraSelector.");
            }
        }
        final C0732Ld c0732Ld = new C0732Ld(C0827N8.m5554p(i));
        if (AbstractC7075wR.m25617a(c0732Ld) == InterfaceC0617Jn.f5693a) {
            InterfaceC0617Jn interfaceC0617Jn = new InterfaceC0617Jn() { // from class: OR
                @Override // p000.InterfaceC0617Jn
                /* renamed from: a */
                public final InterfaceC0491Hn mo4003a(InterfaceC6766ro interfaceC6766ro, Context context) {
                    Object obj = c0827n8.f7524c;
                    int i2 = i;
                    InterfaceC7331Ai1 interfaceC7331Ai1M24241c = C6730rE.m24241c(i2);
                    interfaceC7331Ai1M24241c.mo295e(interfaceC6766ro);
                    C0972PR c0972pr = new C0972PR(interfaceC7331Ai1M24241c);
                    C7612Ft0 c7612Ft0M2812b = C7612Ft0.m2812b();
                    c7612Ft0M2812b.m2815e(C0846NR.f7775b, Integer.valueOf(i2));
                    c7612Ft0M2812b.m2815e(InterfaceC0491Hn.f4498f0, c0972pr);
                    c7612Ft0M2812b.m2815e(InterfaceC0491Hn.f4499g0, c0732Ld);
                    c7612Ft0M2812b.m2815e(InterfaceC0491Hn.f4502j0, Boolean.TRUE);
                    c7612Ft0M2812b.m2815e(InterfaceC0491Hn.f4503k0, Boolean.valueOf(interfaceC7331Ai1M24241c.mo299i()));
                    c7612Ft0M2812b.m2815e(InterfaceC0491Hn.f4504l0, Boolean.valueOf(interfaceC7331Ai1M24241c.mo293c()));
                    c7612Ft0M2812b.m2815e(InterfaceC0491Hn.f4500h0, 1);
                    AbstractC9513gZ0 abstractC9513gZ0Mo297g = interfaceC7331Ai1M24241c.mo297g(context);
                    if (abstractC9513gZ0Mo297g != null) {
                        c7612Ft0M2812b.m2815e(InterfaceC0491Hn.f4501i0, abstractC9513gZ0Mo297g);
                    }
                    return new C0846NR(c7612Ft0M2812b);
                }
            };
            synchronized (AbstractC7075wR.f44864a) {
                AbstractC7075wR.f44865b.put(c0732Ld, interfaceC0617Jn);
            }
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(c0555Io.f5156a);
        linkedHashSet2.add(new C7138xR(C0827N8.m5554p(i), C6730rE.m24241c(i)));
        return new C0555Io(linkedHashSet2);
    }

    /* renamed from: d */
    public final boolean m9903d(C0555Io c0555Io, int i) {
        if (i == 0) {
            return true;
        }
        if (this.f15966a != ExtensionsManager$ExtensionsAvailability.LIBRARY_AVAILABLE) {
            return false;
        }
        this.f15967b.getClass();
        new LinkedHashSet(c0555Io.f5156a).add(new C7138xR(C0827N8.m5554p(i), C6730rE.m24241c(i)));
        return !new C0555Io(r2).m4004a(((InterfaceC0240Do) r1.f7523b).mo1118g()).isEmpty();
    }

    /* renamed from: e */
    public final boolean m9904e(C0555Io c0555Io, int i) {
        if (i == 0) {
            return true;
        }
        if (this.f15966a != ExtensionsManager$ExtensionsAvailability.LIBRARY_AVAILABLE) {
            return false;
        }
        C0827N8 c0827n8 = this.f15967b;
        c0827n8.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(c0555Io.f5156a);
        linkedHashSet.add(new C7138xR(C0827N8.m5554p(i), C6730rE.m24241c(i)));
        List listM4004a = new C0555Io(linkedHashSet).m4004a(((InterfaceC0240Do) c0827n8.f7523b).mo1118g());
        if (listM4004a.isEmpty()) {
            return false;
        }
        InterfaceC6766ro interfaceC6766ro = (InterfaceC6766ro) listM4004a.get(0);
        InterfaceC7331Ai1 interfaceC7331Ai1M24241c = C6730rE.m24241c(i);
        interfaceC7331Ai1M24241c.mo295e(interfaceC6766ro);
        return interfaceC7331Ai1M24241c.mo296f().length > 0;
    }
}
