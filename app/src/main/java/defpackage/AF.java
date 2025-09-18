package defpackage;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class AF implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ BF b;

    public /* synthetic */ AF(BF bf, int i) {
        this.a = i;
        this.b = bf;
    }

    private final Object a() {
        String string;
        BF bf = this.b;
        synchronized (bf) {
            try {
                V20 v20 = (V20) bf.a.get();
                ArrayList arrayListC = v20.c();
                v20.b();
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < arrayListC.size(); i++) {
                    C0809Kd c0809Kd = (C0809Kd) arrayListC.get(i);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", c0809Kd.a);
                    jSONObject.put("dates", new JSONArray((Collection) c0809Kd.b));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        string = byteArrayOutputStream.toString("UTF-8");
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                return a();
            default:
                BF bf = this.b;
                synchronized (bf) {
                    ((V20) bf.a.get()).k(System.currentTimeMillis(), ((C3550eH) bf.c.get()).a());
                }
                return null;
        }
    }
}
