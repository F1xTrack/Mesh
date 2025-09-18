package io.sentry.android.core;

import android.content.Context;
import android.content.Intent;
import io.sentry.C5759D1;
import io.sentry.EnumC6069n1;
import io.sentry.protocol.C6097m;

/* renamed from: io.sentry.android.core.G */
/* loaded from: classes2.dex */
public final class C5835G {

    /* renamed from: h */
    public static volatile C5835G f33532h;

    /* renamed from: a */
    public final Context f33533a;

    /* renamed from: b */
    public final SentryAndroidOptions f33534b;

    /* renamed from: c */
    public final C5832D f33535c;

    /* renamed from: d */
    public final Boolean f33536d;

    /* renamed from: e */
    public final C5831C f33537e;

    /* renamed from: f */
    public final C6097m f33538f;

    /* renamed from: g */
    public final Long f33539g;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0083, code lost:
    
        r8 = "su";
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
    
        r8 = r7.f33769f.exec(new java.lang.String[]{"/system/xbin/which", "su"});
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0091, code lost:
    
        r9 = new java.io.BufferedReader(new java.io.InputStreamReader(r8.getInputStream(), io.sentry.android.core.internal.util.C5887g.f33763g));
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a5, code lost:
    
        if (r9.readLine() == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a7, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a9, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00aa, code lost:
    
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ad, code lost:
    
        r8.destroy();
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b1, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bf, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c0, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c2, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c4, code lost:
    
        r12.mo21406d(io.sentry.EnumC6069n1.DEBUG, "Error when trying to check if SU exists.", r0);
        r8 = r8;
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d3, code lost:
    
        r12.mo21407k(io.sentry.EnumC6069n1.DEBUG, "SU isn't found on this Device.", new java.lang.Object[0]);
        r8 = r8;
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00dc, code lost:
    
        if (r8 != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00df, code lost:
    
        r0 = false;
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e0, code lost:
    
        if (r0 != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e2, code lost:
    
        io.sentry.config.AbstractC6003a.m21735D(r12, "The ILogger object is required.");
        r0 = r7.f33764a.getPackageManager();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ed, code lost:
    
        if (r0 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ef, code lost:
    
        r7 = r7.f33768e;
        r8 = r7.length;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f5, code lost:
    
        r10 = r7[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00fb, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 33) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00fd, code lost:
    
        r0.getPackageInfo(r10, android.content.pm.PackageManager.PackageInfoFlags.of(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0105, code lost:
    
        r0.getPackageInfo(r10, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0108, code lost:
    
        r0 = true;
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x010a, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x010c, code lost:
    
        r0 = false;
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x010d, code lost:
    
        if (r0 != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0117, code lost:
    
        if (r8 != 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0119, code lost:
    
        r8.destroy();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x011c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cd A[DONT_GENERATE, PHI: r8
  0x00cd: PHI (r8v5 java.lang.Process) = (r8v26 java.lang.Process), (r8v27 java.lang.Process) binds: [B:45:0x00cb, B:50:0x00dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010f A[EDGE_INSN: B:90:0x010f->B:67:0x010f BREAK  A[LOOP:0: B:13:0x0062->B:21:0x0081], PHI: r8
  0x010f: PHI (r8v18 ??) = (r8v8 int), (r8v10 int), (r8v15 ??) binds: [B:53:0x00e0, B:66:0x010d, B:90:0x010f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0146  */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C5835G(android.content.Context r17, io.sentry.android.core.SentryAndroidOptions r18) throws android.content.pm.PackageManager.NameNotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.C5835G.<init>(android.content.Context, io.sentry.android.core.SentryAndroidOptions):void");
    }

    /* renamed from: b */
    public static Float m21525b(Intent intent, C5759D1 c5759d1) {
        try {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra != -1 && intExtra2 != -1) {
                return Float.valueOf((intExtra / intExtra2) * 100.0f);
            }
            return null;
        } catch (Throwable th) {
            c5759d1.getLogger().mo21406d(EnumC6069n1.ERROR, "Error getting device battery level.", th);
            return null;
        }
    }

    /* renamed from: c */
    public static C5835G m21526c(Context context, SentryAndroidOptions sentryAndroidOptions) {
        if (f33532h == null) {
            synchronized (C5835G.class) {
                try {
                    if (f33532h == null) {
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            context = applicationContext;
                        }
                        f33532h = new C5835G(context, sentryAndroidOptions);
                    }
                } finally {
                }
            }
        }
        return f33532h;
    }

    /* renamed from: d */
    public static Boolean m21527d(Intent intent, C5759D1 c5759d1) {
        try {
            int intExtra = intent.getIntExtra("plugged", -1);
            boolean z = true;
            if (intExtra != 1 && intExtra != 2) {
                z = false;
            }
            return Boolean.valueOf(z);
        } catch (Throwable th) {
            c5759d1.getLogger().mo21406d(EnumC6069n1.ERROR, "Error getting device charging state.", th);
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(32:0|2|(1:4)|5|167|6|(1:157)|(1:(23:9|(3:163|15|16)|24|(1:26)|27|148|28|(1:33)|161|34|38|(2:40|(1:42)(1:43))(0)|44|(3:152|46|50)|51|(1:53)|54|(1:56)|57|(1:59)|60|(15:64|(1:66)(1:67)|(5:69|150|70|(1:72)(1:76)|77)|78|(1:(1:81)(1:82))(1:83)|84|(1:87)|88|(7:90|159|91|95|154|96|100)|101|(1:107)(4:109|(4:(1:112)(1:113)|114|(2:116|(1:172)(2:173|125))|169)(1:126)|127|(4:129|(6:146|132|136|165|137|141)|142|(1:144))(1:130))|108|(0)|142|(0))|145)(1:10))(1:13)|156|(0)|24|(0)|27|148|28|(0)|161|34|38|(0)(0)|44|(0)|51|(0)|54|(0)|57|(0)|60|(12:62|64|(0)(0)|(0)|78|(0)(0)|84|(1:87)|88|(0)|101|(7:103|105|107|108|(0)|142|(0))(6:105|107|108|(0)|142|(0)))|145|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(32:0|2|(1:4)|5|167|6|157|(1:(23:9|(3:163|15|16)|24|(1:26)|27|148|28|(1:33)|161|34|38|(2:40|(1:42)(1:43))(0)|44|(3:152|46|50)|51|(1:53)|54|(1:56)|57|(1:59)|60|(15:64|(1:66)(1:67)|(5:69|150|70|(1:72)(1:76)|77)|78|(1:(1:81)(1:82))(1:83)|84|(1:87)|88|(7:90|159|91|95|154|96|100)|101|(1:107)(4:109|(4:(1:112)(1:113)|114|(2:116|(1:172)(2:173|125))|169)(1:126)|127|(4:129|(6:146|132|136|165|137|141)|142|(1:144))(1:130))|108|(0)|142|(0))|145)(1:10))(1:13)|156|(0)|24|(0)|27|148|28|(0)|161|34|38|(0)(0)|44|(0)|51|(0)|54|(0)|57|(0)|60|(12:62|64|(0)(0)|(0)|78|(0)(0)|84|(1:87)|88|(0)|101|(7:103|105|107|108|(0)|142|(0))(6:105|107|108|(0)|142|(0)))|145|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
    
        r7.mo21406d(io.sentry.EnumC6069n1.ERROR, "Error getting DisplayMetrics.", r8);
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ca, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cb, code lost:
    
        r1.getLogger().mo21405c(io.sentry.EnumC6069n1.ERROR, r7, "Error getting the device's boot time.", new java.lang.Object[0]);
        r7 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x010e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01f0  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.sentry.protocol.C6090f m21528a(boolean r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 763
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.C5835G.m21528a(boolean, boolean):io.sentry.protocol.f");
    }
}
