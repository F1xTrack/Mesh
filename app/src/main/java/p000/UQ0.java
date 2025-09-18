package p000;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class UQ0 {

    /* renamed from: a */
    public final InterfaceC1478XU f11781a;

    /* renamed from: b */
    public final C10189lr0 f11782b;

    /* renamed from: c */
    public final F71 f11783c;

    /* renamed from: d */
    public final C8028Nt0 f11784d = SA1.m7187a();

    public UQ0(InterfaceC0125Bz interfaceC0125Bz, InterfaceC1478XU interfaceC1478XU, C1766b8 c1766b8, C10189lr0 c10189lr0, InterfaceC4039fD interfaceC4039fD) {
        this.f11781a = interfaceC1478XU;
        this.f11782b = c10189lr0;
        this.f11783c = AbstractC0705LB.m4915b(new C10801qd0(21, interfaceC4039fD));
    }

    /* renamed from: c */
    public static String m8012c(String str) {
        Pattern patternCompile = Pattern.compile("/");
        O90.m5967e(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(str).replaceAll("");
        O90.m5967e(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    /* renamed from: a */
    public final Boolean m8013a() {
        C11939zY0 c11939zY0 = m8014b().f3314b;
        if (c11939zY0 != null) {
            return c11939zY0.f46865a;
        }
        O90.m5977o("sessionConfigs");
        throw null;
    }

    /* renamed from: b */
    public final FZ0 m8014b() {
        return (FZ0) this.f11783c.getValue();
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
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8015d(p000.InterfaceC1382Vy r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.UQ0.m8015d(Vy):java.lang.Object");
    }
}
