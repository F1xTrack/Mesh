package defpackage;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class UQ0 {
    public final XU a;
    public final C5772lr0 b;
    public final F71 c;
    public final C1091Nt0 d = SA1.a();

    public UQ0(InterfaceC0173Bz interfaceC0173Bz, XU xu, C2267b8 c2267b8, C5772lr0 c5772lr0, InterfaceC3729fD interfaceC3729fD) {
        this.a = xu;
        this.b = c5772lr0;
        this.c = LB.b(new C6685qd0(21, interfaceC3729fD));
    }

    public static String c(String str) {
        Pattern patternCompile = Pattern.compile("/");
        O90.e(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(str).replaceAll("");
        O90.e(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public final Boolean a() {
        C8384zY0 c8384zY0 = b().b;
        if (c8384zY0 != null) {
            return c8384zY0.a;
        }
        O90.o("sessionConfigs");
        throw null;
    }

    public final FZ0 b() {
        return (FZ0) this.c.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00b2 A[Catch: all -> 0x0051, TRY_LEAVE, TryCatch #0 {all -> 0x0051, blocks: (B:81:0x004d, B:102:0x00a5, B:105:0x00b2, B:95:0x0084, B:99:0x0094), top: B:116:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x001b  */
    /* JADX WARN: Type inference failed for: r8v0, types: [int] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v11, types: [Lt0] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.InterfaceC1729Vy r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.UQ0.d(Vy):java.lang.Object");
    }
}
