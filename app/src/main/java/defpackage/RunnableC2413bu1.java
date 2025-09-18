package defpackage;

import com.my.tracker.obfuscated.f0;
import java.io.IOException;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: bu1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2413bu1 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ f0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ long f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ RunnableC2413bu1(f0 f0Var, String str, String str2, String str3, String str4, String str5, long j) {
        this.b = f0Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.g = str4;
        this.h = str5;
        this.f = j;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        switch (this.a) {
            case 0:
                this.b.a(this.c, this.d, this.e, (String) this.g, (String) this.h, this.f);
                break;
            default:
                this.b.a((Map) this.g, (JSONObject) this.h, this.c, this.d, this.e, this.f);
                break;
        }
    }

    public /* synthetic */ RunnableC2413bu1(f0 f0Var, Map map, JSONObject jSONObject, String str, String str2, String str3, long j) {
        this.b = f0Var;
        this.g = map;
        this.h = jSONObject;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = j;
    }
}
