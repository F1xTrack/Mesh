package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.huawei.hms.framework.common.ExceptionCode;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* renamed from: MM */
/* loaded from: classes.dex */
public final class C0778MM {

    /* renamed from: f */
    public static Boolean f7104f = null;

    /* renamed from: g */
    public static String f7105g = null;

    /* renamed from: h */
    public static boolean f7106h = false;

    /* renamed from: i */
    public static int f7107i = -1;

    /* renamed from: j */
    public static Boolean f7108j;

    /* renamed from: n */
    public static C11813yY1 f7112n;

    /* renamed from: o */
    public static KZ1 f7113o;

    /* renamed from: a */
    public final Context f7114a;

    /* renamed from: k */
    public static final ThreadLocal f7109k = new ThreadLocal();

    /* renamed from: l */
    public static final C6809sD f7110l = new C6809sD(14);

    /* renamed from: m */
    public static final C9604hG1 f7111m = new C9604hG1(0);

    /* renamed from: b */
    public static final C9606hH1 f7100b = new C9606hH1(1);

    /* renamed from: c */
    public static final C11140tG1 f7101c = new C11140tG1(3);

    /* renamed from: d */
    public static final SG1 f7102d = new SG1(3);

    /* renamed from: e */
    public static final C8833bH1 f7103e = new C8833bH1(3);

    public C0778MM(Context context) {
        Preconditions.checkNotNull(context);
        this.f7114a = context;
    }

    /* renamed from: a */
    public static int m5341a(Context context, String str) {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (Objects.equal(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String.valueOf(declaredField.get(null));
            return 0;
        } catch (ClassNotFoundException unused) {
            return 0;
        } catch (Exception e) {
            "Failed to load module descriptor class: ".concat(String.valueOf(e.getMessage()));
            return 0;
        }
    }

    /*  JADX ERROR: Types fix failed
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
        */
    /* JADX WARN: Not initialized variable reg: 19, insn: 0x01bb: MOVE (r7 I:??[OBJECT, ARRAY]) = (r19 I:??[OBJECT, ARRAY]) (LINE:444), block:B:295:0x01bb */
    /* JADX WARN: Not initialized variable reg: 19, insn: 0x0210: MOVE (r7 I:??[OBJECT, ARRAY]) = (r19 I:??[OBJECT, ARRAY]) (LINE:529), block:B:319:0x0210 */
    /* renamed from: c */
    public static p000.C0778MM m5342c(android.content.Context r20, p000.InterfaceC0716LM r21, java.lang.String r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 640
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0778MM.m5342c(android.content.Context, LM, java.lang.String):MM");
    }

    /* JADX WARN: Removed duplicated region for block: B:207:0x00af A[Catch: all -> 0x0037, TryCatch #10 {, blocks: (B:166:0x0027, B:168:0x0033, B:208:0x00b8, B:173:0x003c, B:175:0x0043, B:177:0x0049, B:182:0x004f, B:184:0x0053, B:187:0x005c, B:189:0x0064, B:192:0x006b, B:199:0x0097, B:200:0x009f, B:195:0x0072, B:197:0x0078, B:198:0x0089, B:203:0x00a2, B:206:0x00a5, B:207:0x00af, B:174:0x003f), top: B:300:0x0027, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0153 A[Catch: all -> 0x00d4, TRY_ENTER, TryCatch #6 {all -> 0x00d4, blocks: (B:160:0x0002, B:220:0x00c9, B:222:0x00cf, B:229:0x00dc, B:261:0x0153, B:270:0x0162, B:285:0x01b5, B:286:0x01b8, B:281:0x01ae, B:227:0x00d8, B:288:0x01ba, B:161:0x0003, B:164:0x000a, B:165:0x0026, B:218:0x00c6, B:178:0x004a, B:201:0x00a0, B:204:0x00a3, B:211:0x00bb, B:219:0x00c8, B:217:0x00c1), top: B:297:0x0002, inners: #4, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x01b5 A[Catch: all -> 0x00d4, TryCatch #6 {all -> 0x00d4, blocks: (B:160:0x0002, B:220:0x00c9, B:222:0x00cf, B:229:0x00dc, B:261:0x0153, B:270:0x0162, B:285:0x01b5, B:286:0x01b8, B:281:0x01ae, B:227:0x00d8, B:288:0x01ba, B:161:0x0003, B:164:0x000a, B:165:0x0026, B:218:0x00c6, B:178:0x004a, B:201:0x00a0, B:204:0x00a3, B:211:0x00bb, B:219:0x00c8, B:217:0x00c1), top: B:297:0x0002, inners: #4, #9 }] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m5343d(android.content.Context r11, java.lang.String r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0778MM.m5343d(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:220:0x0134 A[PHI: r14
  0x0134: PHI (r14v5 boolean) = (r14v4 boolean), (r14v7 boolean) binds: [B:193:0x00ec, B:218:0x0131] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x00e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m5344e(boolean r12, boolean r13, java.lang.String r14, android.content.Context r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0778MM.m5344e(boolean, boolean, java.lang.String, android.content.Context):int");
    }

    /* renamed from: f */
    public static void m5345f(ClassLoader classLoader) throws C0590JM {
        try {
            KZ1 kz1 = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                kz1 = iInterfaceQueryLocalInterface instanceof KZ1 ? (KZ1) iInterfaceQueryLocalInterface : new KZ1(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
            }
            f7113o = kz1;
        } catch (ClassNotFoundException e) {
            e = e;
            throw new C0590JM("Failed to instantiate dynamite loader", e);
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new C0590JM("Failed to instantiate dynamite loader", e);
        } catch (InstantiationException e3) {
            e = e3;
            throw new C0590JM("Failed to instantiate dynamite loader", e);
        } catch (NoSuchMethodException e4) {
            e = e4;
            throw new C0590JM("Failed to instantiate dynamite loader", e);
        } catch (InvocationTargetException e5) {
            e = e5;
            throw new C0590JM("Failed to instantiate dynamite loader", e);
        }
    }

    /* renamed from: g */
    public static boolean m5346g(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f7108j)) {
            return true;
        }
        boolean z = false;
        if (f7108j == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", true != PlatformVersion.isAtLeastQ() ? 0 : 268435456);
            if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, ExceptionCode.CRASH_EXCEPTION) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z = true;
            }
            f7108j = Boolean.valueOf(z);
            if (z && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                f7106h = true;
            }
        }
        return z;
    }

    /* renamed from: h */
    public static C11813yY1 m5347h(Context context) {
        C11813yY1 c11813yY1;
        synchronized (C0778MM.class) {
            C11813yY1 c11813yY12 = f7112n;
            if (c11813yY12 != null) {
                return c11813yY12;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    c11813yY1 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    c11813yY1 = iInterfaceQueryLocalInterface instanceof C11813yY1 ? (C11813yY1) iInterfaceQueryLocalInterface : new C11813yY1(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
                }
                if (c11813yY1 != null) {
                    f7112n = c11813yY1;
                    return c11813yY1;
                }
            } catch (Exception e) {
                e.getMessage();
            }
            return null;
        }
    }

    /* renamed from: b */
    public final IBinder m5348b(String str) {
        try {
            return (IBinder) this.f7114a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new C0590JM("Failed to instantiate module class: ".concat(str), e);
        }
    }
}
