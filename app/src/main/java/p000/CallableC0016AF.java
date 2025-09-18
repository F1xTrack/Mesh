package p000;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: AF */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC0016AF implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f121a;

    /* renamed from: b */
    public final /* synthetic */ C0079BF f122b;

    public /* synthetic */ CallableC0016AF(C0079BF c0079bf, int i) {
        this.f121a = i;
        this.f122b = c0079bf;
    }

    /* renamed from: a */
    private final Object m125a() {
        String string;
        C0079BF c0079bf = this.f122b;
        synchronized (c0079bf) {
            try {
                V20 v20 = (V20) c0079bf.f674a.get();
                ArrayList arrayListM8275c = v20.m8275c();
                v20.m8274b();
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < arrayListM8275c.size(); i++) {
                    C0670Kd c0670Kd = (C0670Kd) arrayListM8275c.get(i);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", c0670Kd.f6235a);
                    jSONObject.put("dates", new JSONArray((Collection) c0670Kd.f6236b));
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
        switch (this.f121a) {
            case 0:
                return m125a();
            default:
                C0079BF c0079bf = this.f122b;
                synchronized (c0079bf) {
                    ((V20) c0079bf.f674a.get()).m8283k(System.currentTimeMillis(), ((C3980eH) c0079bf.f676c.get()).m17894a());
                }
                return null;
        }
    }
}
