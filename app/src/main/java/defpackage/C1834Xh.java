package defpackage;

import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.InputStream;
import java.util.ArrayDeque;

/* renamed from: Xh */
/* loaded from: classes.dex */
public final class C1834Xh implements InterfaceC6079nS0 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ C1834Xh(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.InterfaceC6079nS0
    public final boolean a(Object obj, C0795Jy0 c0795Jy0) {
        switch (this.a) {
            case 0:
                return ((InterfaceC6079nS0) this.b).a(obj, c0795Jy0);
            case 1:
                return "android.resource".equals(((Uri) obj).getScheme());
            default:
                ((C3562eL) this.b).getClass();
                return true;
        }
    }

    @Override // defpackage.InterfaceC6079nS0
    public final InterfaceC5506kS0 b(Object obj, int i, int i2, C0795Jy0 c0795Jy0) throws PackageManager.NameNotFoundException, NumberFormatException {
        boolean z;
        C6258oO0 c6258oO0;
        UP up;
        switch (this.a) {
            case 0:
                InterfaceC5506kS0 interfaceC5506kS0B = ((InterfaceC6079nS0) this.b).b(obj, i, i2, c0795Jy0);
                if (interfaceC5506kS0B == null) {
                    return null;
                }
                return new C6126ni((Resources) this.c, interfaceC5506kS0B);
            case 1:
                InterfaceC5506kS0 interfaceC5506kS0C = ((C6461pS0) this.b).c((Uri) obj, c0795Jy0);
                if (interfaceC5506kS0C == null) {
                    return null;
                }
                return AbstractC7287tn0.a((InterfaceC5935mi) this.c, (Drawable) ((C3691f10) interfaceC5506kS0C).get(), i, i2);
            default:
                InputStream inputStream = (InputStream) obj;
                if (inputStream instanceof C6258oO0) {
                    c6258oO0 = (C6258oO0) inputStream;
                    z = false;
                } else {
                    z = true;
                    c6258oO0 = new C6258oO0(inputStream, (C8426zm0) this.c);
                }
                ArrayDeque arrayDeque = UP.c;
                synchronized (arrayDeque) {
                    up = (UP) arrayDeque.poll();
                }
                if (up == null) {
                    up = new UP();
                }
                up.a = c6258oO0;
                I0 i0 = new I0(up);
                N8 n8 = new N8(c6258oO0, 22, up);
                try {
                    C3562eL c3562eL = (C3562eL) this.b;
                    return c3562eL.a(new C1857Xo1(i0, c3562eL.d, c3562eL.c), i, i2, c0795Jy0, n8);
                } finally {
                    up.release();
                    if (z) {
                        c6258oO0.release();
                    }
                }
        }
    }

    public C1834Xh(Resources resources, InterfaceC6079nS0 interfaceC6079nS0) {
        this.a = 0;
        this.c = resources;
        this.b = interfaceC6079nS0;
    }
}
