package defpackage;

import androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1;
import androidx.lifecycle.SavedStateHandleController;
import androidx.lifecycle.a;
import java.util.HashMap;
import kotlin.KotlinVersion;

/* renamed from: yD */
/* loaded from: classes2.dex */
public abstract class AbstractC8130yD {
    public static final int[] a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    public static final void a(AbstractC1611Uk1 abstractC1611Uk1, C5706lV0 c5706lV0, AbstractC0357Ei0 abstractC0357Ei0) {
        Object obj;
        O90.f(c5706lV0, "registry");
        O90.f(abstractC0357Ei0, "lifecycle");
        HashMap map = abstractC1611Uk1.a;
        if (map == null) {
            obj = null;
        } else {
            synchronized (map) {
                obj = abstractC1611Uk1.a.get("androidx.lifecycle.savedstate.vm.tag");
            }
        }
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
        if (savedStateHandleController == null || savedStateHandleController.c) {
            return;
        }
        savedStateHandleController.a(abstractC0357Ei0, c5706lV0);
        EnumC0201Ci0 enumC0201Ci0 = ((a) abstractC0357Ei0).c;
        if (enumC0201Ci0 == EnumC0201Ci0.b || enumC0201Ci0.compareTo(EnumC0201Ci0.d) >= 0) {
            c5706lV0.d();
        } else {
            abstractC0357Ei0.a(new LegacySavedStateHandleController$tryToAddRecreator$1(abstractC0357Ei0, c5706lV0));
        }
    }

    public static void b(int i, C4103hA0 c4103hA0) {
        c4103hA0.D(7);
        byte[] bArr = c4103hA0.a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[5] = (byte) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[6] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public static final String c(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.C7902x1 d(defpackage.C0848Kq r9) {
        /*
            r0 = 16
            int r1 = r9.l(r0)
            int r0 = r9.l(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r9.l(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r1 = 2
            int r2 = r9.l(r1)
            r4 = 3
            if (r2 != r4) goto L32
        L29:
            r9.l(r1)
            boolean r2 = r9.k()
            if (r2 != 0) goto L29
        L32:
            r2 = 10
            int r2 = r9.l(r2)
            boolean r5 = r9.k()
            if (r5 == 0) goto L47
            int r5 = r9.l(r4)
            if (r5 <= 0) goto L47
            r9.w(r1)
        L47:
            boolean r5 = r9.k()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r5 == 0) goto L55
            r5 = r7
            goto L56
        L55:
            r5 = r6
        L56:
            int r9 = r9.l(r3)
            int[] r8 = defpackage.AbstractC8130yD.a
            if (r5 != r6) goto L65
            r6 = 13
            if (r9 != r6) goto L65
            r9 = r8[r9]
            goto L93
        L65:
            if (r5 != r7) goto L92
            r6 = 14
            if (r9 >= r6) goto L92
            r6 = r8[r9]
            int r2 = r2 % 5
            r7 = 1
            r8 = 8
            if (r2 == r7) goto L8b
            r7 = 11
            if (r2 == r1) goto L86
            if (r2 == r4) goto L8b
            if (r2 == r3) goto L7d
            goto L90
        L7d:
            if (r9 == r4) goto L83
            if (r9 == r8) goto L83
            if (r9 != r7) goto L90
        L83:
            int r9 = r6 + 1
            goto L93
        L86:
            if (r9 == r8) goto L83
            if (r9 != r7) goto L90
            goto L83
        L8b:
            if (r9 == r4) goto L83
            if (r9 != r8) goto L90
            goto L83
        L90:
            r9 = r6
            goto L93
        L92:
            r9 = 0
        L93:
            x1 r1 = new x1
            r1.<init>(r5, r0, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC8130yD.d(Kq):x1");
    }

    public static final String e(InterfaceC1729Vy interfaceC1729Vy) {
        Object objB;
        if (interfaceC1729Vy instanceof C7961xK) {
            return ((C7961xK) interfaceC1729Vy).toString();
        }
        try {
            objB = interfaceC1729Vy + '@' + c(interfaceC1729Vy);
        } catch (Throwable th) {
            objB = RQ1.b(th);
        }
        if (PS0.a(objB) != null) {
            objB = interfaceC1729Vy.getClass().getName() + '@' + c(interfaceC1729Vy);
        }
        return (String) objB;
    }
}
