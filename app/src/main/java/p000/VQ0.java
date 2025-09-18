package p000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class VQ0 extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public int f12558a;

    /* renamed from: b */
    public final /* synthetic */ C10189lr0 f12559b;

    /* renamed from: c */
    public final /* synthetic */ Object f12560c;

    /* renamed from: d */
    public final /* synthetic */ SQ0 f12561d;

    /* renamed from: e */
    public final /* synthetic */ TQ0 f12562e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VQ0(C10189lr0 c10189lr0, Map map, SQ0 sq0, TQ0 tq0, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f12559b = c10189lr0;
        this.f12560c = map;
        this.f12561d = sq0;
        this.f12562e = tq0;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        return new VQ0(this.f12559b, this.f12560c, this.f12561d, this.f12562e, interfaceC1382Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((VQ0) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.Map] */
    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) throws IOException {
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        int i = this.f12558a;
        TQ0 tq0 = this.f12562e;
        C8313Tf1 c8313Tf1 = C8313Tf1.f11463a;
        try {
            if (i == 0) {
                RQ1.m7017d(obj);
                URLConnection uRLConnectionOpenConnection = C10189lr0.m22543z(this.f12559b).openConnection();
                O90.m5966d(uRLConnectionOpenConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
                httpsURLConnection.setRequestMethod("GET");
                httpsURLConnection.setRequestProperty("Accept", "application/json");
                for (Map.Entry entry : this.f12560c.entrySet()) {
                    httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                int responseCode = httpsURLConnection.getResponseCode();
                if (responseCode == 200) {
                    InputStream inputStream = httpsURLConnection.getInputStream();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb.append(line);
                    }
                    bufferedReader.close();
                    inputStream.close();
                    JSONObject jSONObject = new JSONObject(sb.toString());
                    SQ0 sq0 = this.f12561d;
                    this.f12558a = 1;
                    if (sq0.invoke(jSONObject, this) == enumC0817Mz) {
                        return enumC0817Mz;
                    }
                } else {
                    this.f12558a = 2;
                    tq0.invoke("Bad response code: " + responseCode, this);
                    if (c8313Tf1 == enumC0817Mz) {
                        return enumC0817Mz;
                    }
                }
            } else {
                if (i != 1 && i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                RQ1.m7017d(obj);
            }
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = e.toString();
            }
            this.f12558a = 3;
            tq0.invoke(message, this);
            if (c8313Tf1 == enumC0817Mz) {
                return enumC0817Mz;
            }
        }
        return c8313Tf1;
    }
}
