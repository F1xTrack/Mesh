package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicMarkableReference;
import org.json.JSONException;
import org.json.JSONObject;
import ru.mes.dnevnik.R;

/* renamed from: kb1 */
/* loaded from: classes.dex */
public final class C5534kb1 implements InterfaceC0195Cg0 {
    public static volatile C5534kb1 h;
    public final Object a;
    public final Object b;
    public Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public C5534kb1(Context context, Map map) {
        this.a = context;
        this.b = map;
        this.c = LB.b(new C4239ht1(this, 1));
        this.d = LB.b(new C4239ht1(this, 2));
        this.e = LB.b(C0628Hu1.H);
        this.f = LB.b(new C4239ht1(this, 0));
        this.g = LB.b(new C4239ht1(this, 3));
    }

    public void a(int i, long j) {
        if (i == 0) {
            d(new C7614vV("Unable to fetch the latest version of the template.", 4));
            return;
        }
        ((ScheduledExecutorService) this.f).schedule(new RunnableC7504uw(this, i, j), ((Random) this.g).nextInt(4), TimeUnit.SECONDS);
    }

    public void b(InputStream inputStream) throws JSONException, IOException {
        JSONObject jSONObject;
        boolean zIsEmpty;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        String strI = "";
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            strI = AbstractC8235ym.i(strI, line);
            if (line.contains("}")) {
                int iIndexOf = strI.indexOf(123);
                int iLastIndexOf = strI.lastIndexOf(125);
                String strSubstring = "";
                if (iIndexOf >= 0 && iLastIndexOf >= 0 && iIndexOf < iLastIndexOf) {
                    strSubstring = strI.substring(iIndexOf, iLastIndexOf + 1);
                }
                strI = strSubstring;
                if (!strI.isEmpty()) {
                    try {
                        jSONObject = new JSONObject(strI);
                    } catch (JSONException e) {
                        d(new C6660qV(e.getCause()));
                    }
                    if (jSONObject.has("featureDisabled") && jSONObject.getBoolean("featureDisabled")) {
                        ((C0632Hw) this.e).a(new C7614vV("The server is temporarily unavailable. Try again in a few minutes.", 5));
                        break;
                    }
                    synchronized (this) {
                        zIsEmpty = ((LinkedHashSet) this.a).isEmpty();
                    }
                    if (zIsEmpty) {
                        break;
                    }
                    if (jSONObject.has("latestTemplateVersionNumber")) {
                        long j = ((C0320Dw) this.c).h.a.getLong("last_template_version", 0L);
                        long j2 = jSONObject.getLong("latestTemplateVersionNumber");
                        if (j2 > j) {
                            a(3, j2);
                        }
                    }
                    strI = "";
                } else {
                    continue;
                }
            }
        }
        bufferedReader.close();
        inputStream.close();
    }

    public void c() {
        HttpURLConnection httpURLConnection = (HttpURLConnection) this.b;
        if (httpURLConnection == null) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            b(inputStream);
            inputStream.close();
        } catch (IOException unused) {
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
        httpURLConnection.disconnect();
    }

    public synchronized void d(C6850rV c6850rV) {
        Iterator it = ((LinkedHashSet) this.a).iterator();
        while (it.hasNext()) {
            ((C0632Hw) it.next()).a(c6850rV);
        }
    }

    @Override // defpackage.InterfaceC0195Cg0
    public void k() {
        HashMap map = (HashMap) this.b;
        U41 u41 = (U41) this.c;
        u41.getClass();
        C0074As c0074As = (C0074As) this.e;
        O90.f(map, "arguments");
        boolean zX = false;
        if (c0074As.equals(AbstractC5240j31.b)) {
            Object obj = map.get(C1559Tt0.e("value"));
            C4193he0 c4193he0 = obj instanceof C4193he0 ? (C4193he0) obj : null;
            if (c4193he0 != null) {
                Object obj2 = c4193he0.a;
                C3811fe0 c3811fe0 = obj2 instanceof C3811fe0 ? (C3811fe0) obj2 : null;
                if (c3811fe0 != null) {
                    zX = u41.x(c3811fe0.a.a);
                }
            }
        }
        if (zX || u41.x(c0074As)) {
            return;
        }
        ((List) this.f).add(new C8106y5(((InterfaceC7492us) this.d).m(), map, (W21) this.g));
    }

    @Override // defpackage.InterfaceC0195Cg0
    public void l(C1559Tt0 c1559Tt0, Object obj) {
        ((HashMap) this.b).put(c1559Tt0, U41.n((U41) this.a, c1559Tt0, obj));
    }

    @Override // defpackage.InterfaceC0195Cg0
    public void n(C1559Tt0 c1559Tt0, C0230Cs c0230Cs) {
        ((HashMap) this.b).put(c1559Tt0, new C4193he0(new C3811fe0(c0230Cs)));
    }

    @Override // defpackage.InterfaceC0195Cg0
    public InterfaceC0273Dg0 o(C1559Tt0 c1559Tt0) {
        U41 u41 = (U41) this.a;
        T71 t71 = new T71();
        t71.b = u41;
        t71.c = c1559Tt0;
        t71.d = this;
        t71.a = new ArrayList();
        return t71;
    }

    @Override // defpackage.InterfaceC0195Cg0
    public void p(C1559Tt0 c1559Tt0, C0074As c0074As, C1559Tt0 c1559Tt02) {
        ((HashMap) this.b).put(c1559Tt0, new TO(c0074As, c1559Tt02));
    }

    @Override // defpackage.InterfaceC0195Cg0
    public InterfaceC0195Cg0 r(C0074As c0074As, C1559Tt0 c1559Tt0) {
        ArrayList arrayList = new ArrayList();
        C5534kb1 c5534kb1Z = ((U41) this.a).z(c0074As, W21.O0, arrayList);
        C6045nH c6045nH = new C6045nH();
        c6045nH.b = c5534kb1Z;
        c6045nH.d = this;
        c6045nH.e = c1559Tt0;
        c6045nH.c = arrayList;
        c6045nH.a = c5534kb1Z;
        return c6045nH;
    }

    public C5534kb1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.d = layoutParams;
        this.e = new Rect();
        this.f = new int[2];
        this.g = new int[2];
        this.a = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.b = viewInflate;
        this.c = (TextView) viewInflate.findViewById(R.id.message);
        layoutParams.setTitle(C5534kb1.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    public C5534kb1(HttpURLConnection httpURLConnection, C0320Dw c0320Dw, C8075xw c8075xw, LinkedHashSet linkedHashSet, C0632Hw c0632Hw, ScheduledExecutorService scheduledExecutorService) {
        this.b = httpURLConnection;
        this.c = c0320Dw;
        this.d = c8075xw;
        this.a = linkedHashSet;
        this.e = c0632Hw;
        this.f = scheduledExecutorService;
        this.g = new Random();
    }

    public C5534kb1(String str, HT ht, C6846rT1 c6846rT1) {
        this.d = new VG(this, false);
        this.e = new VG(this, true);
        this.f = new C5700lT0();
        this.g = new AtomicMarkableReference(null, false);
        this.c = str;
        this.a = new C0306Dr0(ht);
        this.b = c6846rT1;
    }

    public C5534kb1(U41 u41, InterfaceC7492us interfaceC7492us, C0074As c0074As, List list, W21 w21) {
        this.c = u41;
        this.d = interfaceC7492us;
        this.e = c0074As;
        this.f = list;
        this.g = w21;
        this.a = u41;
        this.b = new HashMap();
    }
}
