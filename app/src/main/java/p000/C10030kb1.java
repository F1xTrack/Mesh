package p000;

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
public final class C10030kb1 implements InterfaceC7430Cg0 {

    /* renamed from: h */
    public static volatile C10030kb1 f36560h;

    /* renamed from: a */
    public final Object f36561a;

    /* renamed from: b */
    public final Object f36562b;

    /* renamed from: c */
    public Object f36563c;

    /* renamed from: d */
    public final Object f36564d;

    /* renamed from: e */
    public final Object f36565e;

    /* renamed from: f */
    public final Object f36566f;

    /* renamed from: g */
    public final Object f36567g;

    public C10030kb1(Context context, Map map) {
        this.f36561a = context;
        this.f36562b = map;
        this.f36563c = AbstractC0705LB.m4915b(new C9682ht1(this, 1));
        this.f36564d = AbstractC0705LB.m4915b(new C9682ht1(this, 2));
        this.f36565e = AbstractC0705LB.m4915b(C7719Hu1.f4581H);
        this.f36566f = AbstractC0705LB.m4915b(new C9682ht1(this, 0));
        this.f36567g = AbstractC0705LB.m4915b(new C9682ht1(this, 3));
    }

    /* renamed from: a */
    public void m22221a(int i, long j) {
        if (i == 0) {
            m22224d(new C7016vV("Unable to fetch the latest version of the template.", 4));
            return;
        }
        ((ScheduledExecutorService) this.f36566f).schedule(new RunnableC6980uw(this, i, j), ((Random) this.f36567g).nextInt(4), TimeUnit.SECONDS);
    }

    /* renamed from: b */
    public void m22222b(InputStream inputStream) throws JSONException, IOException {
        JSONObject jSONObject;
        boolean zIsEmpty;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        String strM26232i = "";
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            strM26232i = AbstractC7222ym.m26232i(strM26232i, line);
            if (line.contains("}")) {
                int iIndexOf = strM26232i.indexOf(123);
                int iLastIndexOf = strM26232i.lastIndexOf(125);
                String strSubstring = "";
                if (iIndexOf >= 0 && iLastIndexOf >= 0 && iIndexOf < iLastIndexOf) {
                    strSubstring = strM26232i.substring(iIndexOf, iLastIndexOf + 1);
                }
                strM26232i = strSubstring;
                if (!strM26232i.isEmpty()) {
                    try {
                        jSONObject = new JSONObject(strM26232i);
                    } catch (JSONException e) {
                        m22224d(new C6684qV(e.getCause()));
                    }
                    if (jSONObject.has("featureDisabled") && jSONObject.getBoolean("featureDisabled")) {
                        ((C0500Hw) this.f36565e).m3651a(new C7016vV("The server is temporarily unavailable. Try again in a few minutes.", 5));
                        break;
                    }
                    synchronized (this) {
                        zIsEmpty = ((LinkedHashSet) this.f36561a).isEmpty();
                    }
                    if (zIsEmpty) {
                        break;
                    }
                    if (jSONObject.has("latestTemplateVersionNumber")) {
                        long j = ((C0248Dw) this.f36563c).f2320h.f8136a.getLong("last_template_version", 0L);
                        long j2 = jSONObject.getLong("latestTemplateVersionNumber");
                        if (j2 > j) {
                            m22221a(3, j2);
                        }
                    }
                    strM26232i = "";
                } else {
                    continue;
                }
            }
        }
        bufferedReader.close();
        inputStream.close();
    }

    /* renamed from: c */
    public void m22223c() {
        HttpURLConnection httpURLConnection = (HttpURLConnection) this.f36562b;
        if (httpURLConnection == null) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            m22222b(inputStream);
            inputStream.close();
        } catch (IOException unused) {
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
        httpURLConnection.disconnect();
    }

    /* renamed from: d */
    public synchronized void m22224d(C6747rV c6747rV) {
        Iterator it = ((LinkedHashSet) this.f36561a).iterator();
        while (it.hasNext()) {
            ((C0500Hw) it.next()).m3651a(c6747rV);
        }
    }

    @Override // p000.InterfaceC7430Cg0
    /* renamed from: k */
    public void mo1263k() {
        HashMap map = (HashMap) this.f36562b;
        U41 u41 = (U41) this.f36563c;
        u41.getClass();
        C0055As c0055As = (C0055As) this.f36565e;
        O90.m5968f(map, "arguments");
        boolean zM7889x = false;
        if (c0055As.equals(AbstractC9833j31.f34895b)) {
            Object obj = map.get(C8340Tt0.m7798e("value"));
            C9651he0 c9651he0 = obj instanceof C9651he0 ? (C9651he0) obj : null;
            if (c9651he0 != null) {
                Object obj2 = c9651he0.f2329a;
                C9395fe0 c9395fe0 = obj2 instanceof C9395fe0 ? (C9395fe0) obj2 : null;
                if (c9395fe0 != null) {
                    zM7889x = u41.m7889x(c9395fe0.f27308a.f1732a);
                }
            }
        }
        if (zM7889x || u41.m7889x(c0055As)) {
            return;
        }
        ((List) this.f36566f).add(new C7179y5(((InterfaceC6976us) this.f36564d).mo1492m(), map, (W21) this.f36567g));
    }

    @Override // p000.InterfaceC7430Cg0
    /* renamed from: l */
    public void mo1264l(C8340Tt0 c8340Tt0, Object obj) {
        ((HashMap) this.f36562b).put(c8340Tt0, U41.m7873n((U41) this.f36561a, c8340Tt0, obj));
    }

    @Override // p000.InterfaceC7430Cg0
    /* renamed from: n */
    public void mo1265n(C8340Tt0 c8340Tt0, C0181Cs c0181Cs) {
        ((HashMap) this.f36562b).put(c8340Tt0, new C9651he0(new C9395fe0(c0181Cs)));
    }

    @Override // p000.InterfaceC7430Cg0
    /* renamed from: o */
    public InterfaceC7482Dg0 mo1266o(C8340Tt0 c8340Tt0) {
        U41 u41 = (U41) this.f36561a;
        T71 t71 = new T71();
        t71.f11174b = u41;
        t71.f11175c = c8340Tt0;
        t71.f11176d = this;
        t71.f11173a = new ArrayList();
        return t71;
    }

    @Override // p000.InterfaceC7430Cg0
    /* renamed from: p */
    public void mo1267p(C8340Tt0 c8340Tt0, C0055As c0055As, C8340Tt0 c8340Tt02) {
        ((HashMap) this.f36562b).put(c8340Tt0, new C1220TO(c0055As, c8340Tt02));
    }

    @Override // p000.InterfaceC7430Cg0
    /* renamed from: r */
    public InterfaceC7430Cg0 mo1268r(C0055As c0055As, C8340Tt0 c8340Tt0) {
        ArrayList arrayList = new ArrayList();
        C10030kb1 c10030kb1M7891z = ((U41) this.f36561a).m7891z(c0055As, W21.f12940O0, arrayList);
        C6479nH c6479nH = new C6479nH();
        c6479nH.f38228b = c10030kb1M7891z;
        c6479nH.f38230d = this;
        c6479nH.f38231e = c8340Tt0;
        c6479nH.f38229c = arrayList;
        c6479nH.f38227a = c10030kb1M7891z;
        return c6479nH;
    }

    public C10030kb1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f36564d = layoutParams;
        this.f36565e = new Rect();
        this.f36566f = new int[2];
        this.f36567g = new int[2];
        this.f36561a = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f36562b = viewInflate;
        this.f36563c = (TextView) viewInflate.findViewById(R.id.message);
        layoutParams.setTitle(C10030kb1.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    public C10030kb1(HttpURLConnection httpURLConnection, C0248Dw c0248Dw, C7169xw c7169xw, LinkedHashSet linkedHashSet, C0500Hw c0500Hw, ScheduledExecutorService scheduledExecutorService) {
        this.f36562b = httpURLConnection;
        this.f36563c = c0248Dw;
        this.f36564d = c7169xw;
        this.f36561a = linkedHashSet;
        this.f36565e = c0500Hw;
        this.f36566f = scheduledExecutorService;
        this.f36567g = new Random();
    }

    public C10030kb1(String str, C0471HT c0471ht, C10910rT1 c10910rT1) {
        this.f36564d = new C1338VG(this, false);
        this.f36565e = new C1338VG(this, true);
        this.f36566f = new C10141lT0();
        this.f36567g = new AtomicMarkableReference(null, false);
        this.f36563c = str;
        this.f36561a = new C7504Dr0(c0471ht);
        this.f36562b = c10910rT1;
    }

    public C10030kb1(U41 u41, InterfaceC6976us interfaceC6976us, C0055As c0055As, List list, W21 w21) {
        this.f36563c = u41;
        this.f36564d = interfaceC6976us;
        this.f36565e = c0055As;
        this.f36566f = list;
        this.f36567g = w21;
        this.f36561a = u41;
        this.f36562b = new HashMap();
    }
}
