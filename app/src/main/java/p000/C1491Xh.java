package p000;

import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.InputStream;
import java.util.ArrayDeque;

/* renamed from: Xh */
/* loaded from: classes.dex */
public final class C1491Xh implements InterfaceC10395nS0 {

    /* renamed from: a */
    public final /* synthetic */ int f13918a;

    /* renamed from: b */
    public final Object f13919b;

    /* renamed from: c */
    public final Object f13920c;

    public /* synthetic */ C1491Xh(Object obj, int i, Object obj2) {
        this.f13918a = i;
        this.f13919b = obj;
        this.f13920c = obj2;
    }

    @Override // p000.InterfaceC10395nS0
    /* renamed from: a */
    public final boolean mo9107a(Object obj, C7830Jy0 c7830Jy0) {
        switch (this.f13918a) {
            case 0:
                return ((InterfaceC10395nS0) this.f13919b).mo9107a(obj, c7830Jy0);
            case 1:
                return "android.resource".equals(((Uri) obj).getScheme());
            default:
                ((C3984eL) this.f13919b).getClass();
                return true;
        }
    }

    @Override // p000.InterfaceC10395nS0
    /* renamed from: b */
    public final InterfaceC10011kS0 mo9108b(Object obj, int i, int i2, C7830Jy0 c7830Jy0) throws PackageManager.NameNotFoundException, NumberFormatException {
        boolean z;
        C10515oO0 c10515oO0;
        C1284UP c1284up;
        switch (this.f13918a) {
            case 0:
                InterfaceC10011kS0 interfaceC10011kS0Mo9108b = ((InterfaceC10395nS0) this.f13919b).mo9108b(obj, i, i2, c7830Jy0);
                if (interfaceC10011kS0Mo9108b == null) {
                    return null;
                }
                return new C6506ni((Resources) this.f13920c, interfaceC10011kS0Mo9108b);
            case 1:
                InterfaceC10011kS0 interfaceC10011kS0M23789c = ((C10651pS0) this.f13919b).m23789c((Uri) obj, c7830Jy0);
                if (interfaceC10011kS0M23789c == null) {
                    return null;
                }
                return AbstractC11205tn0.m24982a((InterfaceC6443mi) this.f13920c, (Drawable) ((C9314f10) interfaceC10011kS0M23789c).get(), i, i2);
            default:
                InputStream inputStream = (InputStream) obj;
                if (inputStream instanceof C10515oO0) {
                    c10515oO0 = (C10515oO0) inputStream;
                    z = false;
                } else {
                    z = true;
                    c10515oO0 = new C10515oO0(inputStream, (C11967zm0) this.f13920c);
                }
                ArrayDeque arrayDeque = C1284UP.f11771c;
                synchronized (arrayDeque) {
                    c1284up = (C1284UP) arrayDeque.poll();
                }
                if (c1284up == null) {
                    c1284up = new C1284UP();
                }
                c1284up.f11772a = c10515oO0;
                C0505I0 c0505i0 = new C0505I0(c1284up);
                C0827N8 c0827n8 = new C0827N8(c10515oO0, 22, c1284up);
                try {
                    C3984eL c3984eL = (C3984eL) this.f13919b;
                    return c3984eL.m17918a(new C8539Xo1(c0505i0, c3984eL.f26674d, c3984eL.f26673c), i, i2, c7830Jy0, c0827n8);
                } finally {
                    c1284up.release();
                    if (z) {
                        c10515oO0.release();
                    }
                }
        }
    }

    public C1491Xh(Resources resources, InterfaceC10395nS0 interfaceC10395nS0) {
        this.f13918a = 0;
        this.f13920c = resources;
        this.f13919b = interfaceC10395nS0;
    }
}
