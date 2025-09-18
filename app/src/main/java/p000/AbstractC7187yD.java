package p000;

import androidx.lifecycle.C1742a;
import androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1;
import androidx.lifecycle.SavedStateHandleController;
import java.util.HashMap;
import kotlin.KotlinVersion;

/* renamed from: yD */
/* loaded from: classes2.dex */
public abstract class AbstractC7187yD {

    /* renamed from: a */
    public static final int[] f46141a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* renamed from: a */
    public static final void m26095a(AbstractC8375Uk1 abstractC8375Uk1, C10145lV0 c10145lV0, AbstractC7538Ei0 abstractC7538Ei0) {
        Object obj;
        O90.m5968f(c10145lV0, "registry");
        O90.m5968f(abstractC7538Ei0, "lifecycle");
        HashMap map = abstractC8375Uk1.f12019a;
        if (map == null) {
            obj = null;
        } else {
            synchronized (map) {
                obj = abstractC8375Uk1.f12019a.get("androidx.lifecycle.savedstate.vm.tag");
            }
        }
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
        if (savedStateHandleController == null || savedStateHandleController.f16306c) {
            return;
        }
        savedStateHandleController.m10123a(abstractC7538Ei0, c10145lV0);
        EnumC7434Ci0 enumC7434Ci0 = ((C1742a) abstractC7538Ei0).f16309c;
        if (enumC7434Ci0 == EnumC7434Ci0.f1587b || enumC7434Ci0.compareTo(EnumC7434Ci0.f1589d) >= 0) {
            c10145lV0.m22444d();
        } else {
            abstractC7538Ei0.mo2368a(new LegacySavedStateHandleController$tryToAddRecreator$1(abstractC7538Ei0, c10145lV0));
        }
    }

    /* renamed from: b */
    public static void m26096b(int i, C9591hA0 c9591hA0) {
        c9591hA0.m18738D(7);
        byte[] bArr = c9591hA0.f28293a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[5] = (byte) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[6] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    /* renamed from: c */
    public static final String m26097c(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x008b  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000.C7112x1 m26098d(p000.C0683Kq r9) {
        /*
            r0 = 16
            int r1 = r9.m4752l(r0)
            int r0 = r9.m4752l(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r9.m4752l(r0)
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
            int r2 = r9.m4752l(r1)
            r4 = 3
            if (r2 != r4) goto L32
        L29:
            r9.m4752l(r1)
            boolean r2 = r9.m4751k()
            if (r2 != 0) goto L29
        L32:
            r2 = 10
            int r2 = r9.m4752l(r2)
            boolean r5 = r9.m4751k()
            if (r5 == 0) goto L47
            int r5 = r9.m4752l(r4)
            if (r5 <= 0) goto L47
            r9.m4763w(r1)
        L47:
            boolean r5 = r9.m4751k()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r5 == 0) goto L55
            r5 = r7
            goto L56
        L55:
            r5 = r6
        L56:
            int r9 = r9.m4752l(r3)
            int[] r8 = p000.AbstractC7187yD.f46141a
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
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC7187yD.m26098d(Kq):x1");
    }

    /* renamed from: e */
    public static final String m26099e(InterfaceC1382Vy interfaceC1382Vy) {
        Object objM7015b;
        if (interfaceC1382Vy instanceof C7131xK) {
            return ((C7131xK) interfaceC1382Vy).toString();
        }
        try {
            objM7015b = interfaceC1382Vy + '@' + m26097c(interfaceC1382Vy);
        } catch (Throwable th) {
            objM7015b = RQ1.m7015b(th);
        }
        if (PS0.m6365a(objM7015b) != null) {
            objM7015b = interfaceC1382Vy.getClass().getName() + '@' + m26097c(interfaceC1382Vy);
        }
        return (String) objM7015b;
    }
}
