package defpackage;

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
public final class VQ0 extends AbstractC4286i71 implements Function2 {
    public int a;
    public final /* synthetic */ C5772lr0 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ SQ0 d;
    public final /* synthetic */ TQ0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VQ0(C5772lr0 c5772lr0, Map map, SQ0 sq0, TQ0 tq0, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.b = c5772lr0;
        this.c = map;
        this.d = sq0;
        this.e = tq0;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new VQ0(this.b, this.c, this.d, this.e, interfaceC1729Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((VQ0) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) throws IOException {
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        int i = this.a;
        TQ0 tq0 = this.e;
        C1518Tf1 c1518Tf1 = C1518Tf1.a;
        try {
            if (i == 0) {
                RQ1.d(obj);
                URLConnection uRLConnectionOpenConnection = C5772lr0.z(this.b).openConnection();
                O90.d(uRLConnectionOpenConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
                httpsURLConnection.setRequestMethod("GET");
                httpsURLConnection.setRequestProperty("Accept", "application/json");
                for (Map.Entry entry : this.c.entrySet()) {
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
                    SQ0 sq0 = this.d;
                    this.a = 1;
                    if (sq0.invoke(jSONObject, this) == enumC1030Mz) {
                        return enumC1030Mz;
                    }
                } else {
                    this.a = 2;
                    tq0.invoke("Bad response code: " + responseCode, this);
                    if (c1518Tf1 == enumC1030Mz) {
                        return enumC1030Mz;
                    }
                }
            } else {
                if (i != 1 && i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                RQ1.d(obj);
            }
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = e.toString();
            }
            this.a = 3;
            tq0.invoke(message, this);
            if (c1518Tf1 == enumC1030Mz) {
                return enumC1030Mz;
            }
        }
        return c1518Tf1;
    }
}
