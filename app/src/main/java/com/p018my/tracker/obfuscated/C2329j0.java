package com.p018my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import p000.C7655Go1;

/* renamed from: com.my.tracker.obfuscated.j0 */
/* loaded from: classes2.dex */
public final class C2329j0 {

    /* renamed from: a */
    private C2325i0 f19990a;

    /* renamed from: b */
    boolean f19991b = false;

    /* renamed from: com.my.tracker.obfuscated.j0$a */
    public class a implements c {

        /* renamed from: a */
        final /* synthetic */ C2358q1 f19992a;

        public a(C2358q1 c2358q1) {
            this.f19992a = c2358q1;
        }

        @Override // com.p018my.tracker.obfuscated.C2329j0.c
        /* renamed from: a */
        public void mo13209a() {
            AbstractC2391y2.m13568a("FirebaseAppInstanceIdProvider: retrieving firebase app instance id finished unsuccessfully");
        }

        @Override // com.p018my.tracker.obfuscated.C2329j0.c
        /* renamed from: a */
        public void mo13210a(String str) {
            C2329j0.this.f19990a = new C2325i0(str);
            this.f19992a.m13435j(str);
            AbstractC2391y2.m13568a("FirebaseAppInstanceIdProvider: retrieved firebase app instance id %" + C2329j0.this.f19990a.f19981a);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.j0$b */
    public static final class b {

        /* renamed from: a */
        public static final boolean f19994a;

        static {
            boolean zEquals;
            try {
                zEquals = FirebaseAnalytics.class.equals(FirebaseAnalytics.class);
            } catch (Throwable th) {
                AbstractC2391y2.m13569a("FirebaseHelper: error occurred while working with FirebaseAnalytics", th);
                zEquals = false;
            }
            f19994a = zEquals;
        }

        /* renamed from: a */
        public static void m13211a(Context context, c cVar) {
            try {
                AbstractC2391y2.m13568a("FirebaseHelper: retrieving firebase app instance id");
                FirebaseAnalytics.getInstance(context).m11296a().m18386m(AbstractC2340m.f20023b, new C7655Go1(8, cVar));
            } catch (Throwable th) {
                AbstractC2391y2.m13569a("FirebaseHelper: retrieving firebase app instance id error", th);
                cVar.mo13209a();
            }
        }

        /* renamed from: a */
        public static /* synthetic */ void m13212a(c cVar, Task task) {
            if (task.mo11143j() && task.mo11144k()) {
                cVar.mo13210a((String) task.mo11142i());
            } else {
                cVar.mo13209a();
            }
        }
    }

    /* renamed from: com.my.tracker.obfuscated.j0$c */
    public interface c {
        /* renamed from: a */
        void mo13209a();

        /* renamed from: a */
        void mo13210a(String str);
    }

    /* renamed from: a */
    public C2325i0 m13208a(Context context) {
        if (this.f19991b) {
            return this.f19990a;
        }
        C2358q1 c2358q1M13407a = C2358q1.m13407a(context);
        String strM13432i = c2358q1M13407a.m13432i();
        if (!TextUtils.isEmpty(strM13432i)) {
            AbstractC2391y2.m13568a("FirebaseAppInstanceIdProvider: retrieved cached firebase app instance id " + strM13432i);
        }
        if (b.f19994a) {
            b.m13211a(context, new a(c2358q1M13407a));
            this.f19991b = true;
            return this.f19990a;
        }
        AbstractC2391y2.m13568a("FirebaseAppInstanceIdProvider: firebase analytics is not available, use cached value '" + strM13432i + "'");
        C2325i0 c2325i0 = new C2325i0(strM13432i);
        this.f19990a = c2325i0;
        return c2325i0;
    }
}
