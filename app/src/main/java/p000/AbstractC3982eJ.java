package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import com.facebook.soloader.SoLoader;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: eJ */
/* loaded from: classes.dex */
public abstract class AbstractC3982eJ {

    /* renamed from: a */
    public static volatile boolean f26653a;

    /* renamed from: b */
    public static final Object f26654b = null;

    /* renamed from: a */
    public static int m17899a(Context context, String str) {
        if (str != null) {
            return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : new C11479vw0(context).m25529a() ? 0 : -1;
        }
        throw new NullPointerException("permission must be non-null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0046, code lost:
    
        if (r5.f825c == r8.hashCode()) goto L72;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.content.res.ColorStateList m17900b(android.content.Context r8, int r9) throws android.content.res.Resources.NotFoundException {
        /*
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Resources$Theme r8 = r8.getTheme()
            CS0 r1 = new CS0
            r1.<init>(r0, r8)
            java.lang.Object r2 = p000.ES0.f2704c
            monitor-enter(r2)
            java.util.WeakHashMap r3 = p000.ES0.f2703b     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L3c
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L3c
            r4 = 0
            if (r3 == 0) goto L4f
            int r5 = r3.size()     // Catch: java.lang.Throwable -> L3c
            if (r5 <= 0) goto L4f
            java.lang.Object r5 = r3.get(r9)     // Catch: java.lang.Throwable -> L3c
            BS0 r5 = (p000.BS0) r5     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L4f
            android.content.res.Configuration r6 = r5.f824b     // Catch: java.lang.Throwable -> L3c
            android.content.res.Configuration r7 = r0.getConfiguration()     // Catch: java.lang.Throwable -> L3c
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L4c
            if (r8 != 0) goto L3e
            int r6 = r5.f825c     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L48
            goto L3e
        L3c:
            r8 = move-exception
            goto L89
        L3e:
            if (r8 == 0) goto L4c
            int r6 = r5.f825c     // Catch: java.lang.Throwable -> L3c
            int r7 = r8.hashCode()     // Catch: java.lang.Throwable -> L3c
            if (r6 != r7) goto L4c
        L48:
            android.content.res.ColorStateList r3 = r5.f823a     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            goto L51
        L4c:
            r3.remove(r9)     // Catch: java.lang.Throwable -> L3c
        L4f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            r3 = r4
        L51:
            if (r3 == 0) goto L54
            goto L88
        L54:
            java.lang.ThreadLocal r2 = p000.ES0.f2702a
            java.lang.Object r3 = r2.get()
            android.util.TypedValue r3 = (android.util.TypedValue) r3
            if (r3 != 0) goto L66
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r2.set(r3)
        L66:
            r2 = 1
            r0.getValue(r9, r3, r2)
            int r2 = r3.type
            r3 = 28
            if (r2 < r3) goto L75
            r3 = 31
            if (r2 > r3) goto L75
            goto L7d
        L75:
            android.content.res.XmlResourceParser r2 = r0.getXml(r9)
            android.content.res.ColorStateList r4 = p000.AbstractC0561Iu.m4063a(r0, r2, r8)     // Catch: java.lang.Exception -> L7d
        L7d:
            if (r4 == 0) goto L84
            p000.ES0.m2275a(r1, r9, r4, r8)
            r3 = r4
            goto L88
        L84:
            android.content.res.ColorStateList r3 = p000.AS0.m184b(r0, r9, r8)
        L88:
            return r3
        L89:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC3982eJ.m17900b(android.content.Context, int):android.content.res.ColorStateList");
    }

    /* renamed from: c */
    public static Executor m17901c(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? AbstractC0879Ny.m5915a(context) : new ExecutorC0233Dh(new Handler(context.getMainLooper()));
    }

    /* renamed from: d */
    public static String m17902d(Context context) {
        String str = context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (AbstractC9998kL1.m22191a(context, str) == 0) {
            return str;
        }
        throw new RuntimeException(AbstractC7222ym.m26234k("Permission ", str, " is required by your application to receive broadcasts, please add it to your manifest"));
    }

    /* renamed from: e */
    public static void m17903e(U51 u51, int i, InterfaceC6587oy interfaceC6587oy) {
        long jMo5856f = u51.mo5856f(i);
        List listMo5857h = u51.mo5857h(jMo5856f);
        if (listMo5857h.isEmpty()) {
            return;
        }
        if (i == u51.mo5858j() - 1) {
            throw new IllegalStateException();
        }
        long jMo5856f2 = u51.mo5856f(i + 1) - u51.mo5856f(i);
        if (jMo5856f2 > 0) {
            interfaceC6587oy.mo4000b(new C7122xB(listMo5857h, jMo5856f, jMo5856f2));
        }
    }

    /* renamed from: f */
    public static void m17904f(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        int i2 = i & 2;
        if (i2 == 0 && (i & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i2 != 0 && (i & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33) {
            AbstractC0942Oy.m6189a(context, broadcastReceiver, intentFilter, null, null, i);
            return;
        }
        if (i3 >= 26) {
            AbstractC0816My.m5487a(context, broadcastReceiver, intentFilter, null, null, i);
        } else if ((i & 4) != 0) {
            context.registerReceiver(broadcastReceiver, intentFilter, m17902d(context), null);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, null, null);
        }
    }

    /* renamed from: g */
    public static final synchronized void m17905g() {
        if (f26653a) {
            return;
        }
        SoLoader.m11076j("react_devsupportjni");
        f26653a = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0052  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m17906h(p000.U51 r13, p000.C9072d61 r14, p000.InterfaceC6587oy r15) {
        /*
            long r0 = r14.f25817b
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            if (r4 != 0) goto Le
            r4 = r5
            goto L27
        Le:
            int r4 = r13.mo5855c(r0)
            r6 = -1
            if (r4 != r6) goto L19
            int r4 = r13.mo5858j()
        L19:
            if (r4 <= 0) goto L27
            int r6 = r4 + (-1)
            long r6 = r13.mo5856f(r6)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 != 0) goto L27
            int r4 = r4 + (-1)
        L27:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L52
            int r2 = r13.mo5858j()
            if (r4 >= r2) goto L52
            java.util.List r7 = r13.mo5857h(r0)
            long r2 = r13.mo5856f(r4)
            boolean r6 = r7.isEmpty()
            if (r6 != 0) goto L52
            long r8 = r14.f25817b
            int r6 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r6 >= 0) goto L52
            xB r12 = new xB
            long r10 = r2 - r8
            r6 = r12
            r6.<init>(r7, r8, r10)
            r15.mo4000b(r12)
            r2 = 1
            goto L53
        L52:
            r2 = r5
        L53:
            r3 = r4
        L54:
            int r6 = r13.mo5858j()
            if (r3 >= r6) goto L60
            m17903e(r13, r3, r15)
            int r3 = r3 + 1
            goto L54
        L60:
            boolean r14 = r14.f25816a
            if (r14 == 0) goto L89
            if (r2 == 0) goto L68
            int r4 = r4 + (-1)
        L68:
            if (r5 >= r4) goto L70
            m17903e(r13, r5, r15)
            int r5 = r5 + 1
            goto L68
        L70:
            if (r2 == 0) goto L89
            xB r14 = new xB
            java.util.List r7 = r13.mo5857h(r0)
            long r8 = r13.mo5856f(r4)
            long r2 = r13.mo5856f(r4)
            long r10 = r0 - r2
            r6 = r14
            r6.<init>(r7, r8, r10)
            r15.mo4000b(r14)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC3982eJ.m17906h(U51, d61, oy):void");
    }
}
