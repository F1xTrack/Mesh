package com.my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.C0532Go1;

/* loaded from: classes2.dex */
public final class j0 {
    private i0 a;
    boolean b = false;

    public class a implements c {
        final /* synthetic */ q1 a;

        public a(q1 q1Var) {
            this.a = q1Var;
        }

        @Override // com.my.tracker.obfuscated.j0.c
        public void a() {
            y2.a("FirebaseAppInstanceIdProvider: retrieving firebase app instance id finished unsuccessfully");
        }

        @Override // com.my.tracker.obfuscated.j0.c
        public void a(String str) {
            j0.this.a = new i0(str);
            this.a.j(str);
            y2.a("FirebaseAppInstanceIdProvider: retrieved firebase app instance id %" + j0.this.a.a);
        }
    }

    public static final class b {
        public static final boolean a;

        static {
            boolean zEquals;
            try {
                zEquals = FirebaseAnalytics.class.equals(FirebaseAnalytics.class);
            } catch (Throwable th) {
                y2.a("FirebaseHelper: error occurred while working with FirebaseAnalytics", th);
                zEquals = false;
            }
            a = zEquals;
        }

        public static void a(Context context, c cVar) {
            try {
                y2.a("FirebaseHelper: retrieving firebase app instance id");
                FirebaseAnalytics.getInstance(context).a().m(m.b, new C0532Go1(8, cVar));
            } catch (Throwable th) {
                y2.a("FirebaseHelper: retrieving firebase app instance id error", th);
                cVar.a();
            }
        }

        public static /* synthetic */ void a(c cVar, Task task) {
            if (task.j() && task.k()) {
                cVar.a((String) task.i());
            } else {
                cVar.a();
            }
        }
    }

    public interface c {
        void a();

        void a(String str);
    }

    public i0 a(Context context) {
        if (this.b) {
            return this.a;
        }
        q1 q1VarA = q1.a(context);
        String strI = q1VarA.i();
        if (!TextUtils.isEmpty(strI)) {
            y2.a("FirebaseAppInstanceIdProvider: retrieved cached firebase app instance id " + strI);
        }
        if (b.a) {
            b.a(context, new a(q1VarA));
            this.b = true;
            return this.a;
        }
        y2.a("FirebaseAppInstanceIdProvider: firebase analytics is not available, use cached value '" + strI + "'");
        i0 i0Var = new i0(strI);
        this.a = i0Var;
        return i0Var;
    }
}
