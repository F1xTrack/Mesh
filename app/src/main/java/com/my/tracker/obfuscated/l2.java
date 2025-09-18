package com.my.tracker.obfuscated;

import android.content.Context;
import com.my.tracker.MyTracker;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.obfuscated.z2;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes2.dex */
public final class l2 extends r1 {
    private final r c = new r(65536);

    public synchronized byte[] a(z2.a aVar, b3 b3Var, r2 r2Var, String str, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider, Context context) {
        byte[] bArrC;
        if (context == null) {
            y2.b("TimeSpentMessageBuilder: context is empty");
            throw new Exception("TimeSpentMessageBuilder: context is empty");
        }
        try {
            g0 g0VarA = h0.a().a(aVar.m, aVar.g, aVar.e, str, okHttpClientProvider, context);
            this.c.a();
            a(this.c, aVar, b3Var, g0VarA, r2Var);
            bArrC = this.c.c();
            this.c.d();
            a();
        } catch (Exception e) {
            y2.b("TimeSpentMessageBuilder: something went wrong while generating tick packet", e);
            throw new Exception(e);
        }
        return bArrC;
    }

    private static void a(s1 s1Var, w[] wVarArr, r rVar) throws IOException {
        if (wVarArr != null) {
            for (w wVar : wVarArr) {
                rVar.a();
                rVar.a(1, wVar.a());
                rVar.a(2, wVar.d());
                s1Var.a(38, rVar);
            }
        }
    }

    private static void a(s1 s1Var, f2 f2Var, f2[] f2VarArr, r rVar) throws IOException {
        if (f2Var != null) {
            rVar.a();
            rVar.a(1, f2Var.a());
            rVar.a(2, f2Var.b());
            rVar.a(3, f2Var.c());
            s1Var.a(39, rVar);
        }
        if (f2VarArr != null) {
            for (f2 f2Var2 : f2VarArr) {
                rVar.a();
                rVar.a(1, f2Var2.a());
                rVar.a(2, f2Var2.b());
                rVar.a(3, f2Var2.c());
                s1Var.a(39, rVar);
            }
        }
    }

    private void a(s1 s1Var, z2.a aVar, b3 b3Var, g0 g0Var, r2 r2Var) throws IOException {
        String str;
        String str2;
        Map map = aVar.k.e;
        if (map.isEmpty()) {
            str = null;
            str2 = null;
        } else {
            String str3 = (String) map.get("android_id");
            str2 = (String) map.get("mac");
            str = str3;
        }
        s1Var.a(1, MyTracker.VERSION);
        s1Var.a(2, aVar.a);
        s1Var.a(3, r2Var.c());
        r1.a(s1Var, g0Var.a, g0Var.c, this.a, this.b);
        r1.a(s1Var, b3Var, this.a);
        r1.a(s1Var, str, str2, g0Var, this.a, this.b);
        r1.a(s1Var, g0Var.f, g0Var.b, g0Var.c, this.a);
        r1.a(s1Var, g0Var.g, this.a);
        a(s1Var, r2Var.b(), this.a);
        a(s1Var, r2Var.a(), r2Var.d(), this.a);
    }
}
