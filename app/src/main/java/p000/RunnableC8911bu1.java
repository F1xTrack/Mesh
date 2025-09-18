package p000;

import com.p018my.tracker.obfuscated.C2313f0;
import java.io.IOException;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: bu1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC8911bu1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f17216a = 0;

    /* renamed from: b */
    public final /* synthetic */ C2313f0 f17217b;

    /* renamed from: c */
    public final /* synthetic */ String f17218c;

    /* renamed from: d */
    public final /* synthetic */ String f17219d;

    /* renamed from: e */
    public final /* synthetic */ String f17220e;

    /* renamed from: f */
    public final /* synthetic */ long f17221f;

    /* renamed from: g */
    public final /* synthetic */ Object f17222g;

    /* renamed from: h */
    public final /* synthetic */ Object f17223h;

    public /* synthetic */ RunnableC8911bu1(C2313f0 c2313f0, String str, String str2, String str3, String str4, String str5, long j) {
        this.f17217b = c2313f0;
        this.f17218c = str;
        this.f17219d = str2;
        this.f17220e = str3;
        this.f17222g = str4;
        this.f17223h = str5;
        this.f17221f = j;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        switch (this.f17216a) {
            case 0:
                this.f17217b.m13001a(this.f17218c, this.f17219d, this.f17220e, (String) this.f17222g, (String) this.f17223h, this.f17221f);
                break;
            default:
                this.f17217b.m13007a((Map) this.f17222g, (JSONObject) this.f17223h, this.f17218c, this.f17219d, this.f17220e, this.f17221f);
                break;
        }
    }

    public /* synthetic */ RunnableC8911bu1(C2313f0 c2313f0, Map map, JSONObject jSONObject, String str, String str2, String str3, long j) {
        this.f17217b = c2313f0;
        this.f17222g = map;
        this.f17223h = jSONObject;
        this.f17218c = str;
        this.f17219d = str2;
        this.f17220e = str3;
        this.f17221f = j;
    }
}
