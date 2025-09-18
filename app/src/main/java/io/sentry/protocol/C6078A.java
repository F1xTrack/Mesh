package io.sentry.protocol;

import com.yandex.varioqub.config.model.ConfigValue;
import io.sentry.AbstractC5811V0;
import io.sentry.AbstractC6008d;
import io.sentry.C5786M1;
import io.sentry.C5795P1;
import io.sentry.C5798Q1;
import io.sentry.C5820Y0;
import io.sentry.ILogger;
import io.sentry.InterfaceC5749A0;
import io.sentry.InterfaceC6058l0;
import io.sentry.config.AbstractC6003a;
import io.sentry.metrics.C6064b;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.A */
/* loaded from: classes2.dex */
public final class C6078A extends AbstractC5811V0 implements InterfaceC6058l0 {

    /* renamed from: p */
    public String f34277p;

    /* renamed from: q */
    public Double f34278q;

    /* renamed from: r */
    public Double f34279r;

    /* renamed from: s */
    public final ArrayList f34280s;

    /* renamed from: t */
    public final HashMap f34281t;

    /* renamed from: u */
    public Map f34282u;

    /* renamed from: v */
    public C6079B f34283v;

    /* renamed from: w */
    public ConcurrentHashMap f34284w;

    public C6078A(ArrayList arrayList, HashMap map, C6079B c6079b) {
        Double dValueOf = Double.valueOf(ConfigValue.DOUBLE_DEFAULT_VALUE);
        ArrayList arrayList2 = new ArrayList();
        this.f34280s = arrayList2;
        HashMap map2 = new HashMap();
        this.f34281t = map2;
        this.f34277p = "";
        this.f34278q = dValueOf;
        this.f34279r = null;
        arrayList2.addAll(arrayList);
        map2.putAll(map);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f34281t.putAll(((C6107w) it.next()).f34462l);
        }
        this.f34283v = c6079b;
        this.f34282u = null;
    }

    @Override // io.sentry.InterfaceC6058l0
    public final void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) {
        interfaceC5749A0.mo13824q();
        if (this.f34277p != null) {
            interfaceC5749A0.mo13828u("transaction").mo13811d(this.f34277p);
        }
        InterfaceC5749A0 interfaceC5749A0Mo13828u = interfaceC5749A0.mo13828u("start_timestamp");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(this.f34278q.doubleValue());
        RoundingMode roundingMode = RoundingMode.DOWN;
        interfaceC5749A0Mo13828u.mo13825r(iLogger, bigDecimalValueOf.setScale(6, roundingMode));
        if (this.f34279r != null) {
            interfaceC5749A0.mo13828u("timestamp").mo13825r(iLogger, BigDecimal.valueOf(this.f34279r.doubleValue()).setScale(6, roundingMode));
        }
        ArrayList arrayList = this.f34280s;
        if (!arrayList.isEmpty()) {
            interfaceC5749A0.mo13828u("spans").mo13825r(iLogger, arrayList);
        }
        interfaceC5749A0.mo13828u("type").mo13811d("transaction");
        HashMap map = this.f34281t;
        if (!map.isEmpty()) {
            interfaceC5749A0.mo13828u("measurements").mo13825r(iLogger, map);
        }
        Map map2 = this.f34282u;
        if (map2 != null && !map2.isEmpty()) {
            interfaceC5749A0.mo13828u("_metrics_summary").mo13825r(iLogger, this.f34282u);
        }
        interfaceC5749A0.mo13828u("transaction_info").mo13825r(iLogger, this.f34283v);
        AbstractC6003a.m21736E(this, interfaceC5749A0, iLogger);
        ConcurrentHashMap concurrentHashMap = this.f34284w;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC6008d.m21773c(this.f34284w, str, interfaceC5749A0, str, iLogger);
            }
        }
        interfaceC5749A0.mo13817j();
    }

    public C6078A(C5786M1 c5786m1) {
        super(c5786m1.f33326a);
        this.f34280s = new ArrayList();
        this.f34281t = new HashMap();
        C5795P1 c5795p1 = c5786m1.f33327b;
        this.f34278q = Double.valueOf(c5795p1.f33365a.mo21497d() / 1.0E9d);
        this.f34279r = Double.valueOf(c5795p1.f33365a.mo21496c(c5795p1.f33366b) / 1.0E9d);
        this.f34277p = c5786m1.f33330e;
        Iterator it = c5786m1.f33328c.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C5795P1 c5795p12 = (C5795P1) it.next();
            Boolean bool = Boolean.TRUE;
            C5820Y0 c5820y0 = c5795p12.f33367c.f33382d;
            if (bool.equals(c5820y0 != null ? (Boolean) c5820y0.f33441a : null)) {
                this.f34280s.add(new C6107w(c5795p12));
            }
        }
        C6087c c6087c = this.f33417b;
        c6087c.putAll(c5786m1.f33341p);
        C5798Q1 c5798q1 = c5795p1.f33367c;
        c6087c.m21851c(new C5798Q1(c5798q1.f33379a, c5798q1.f33380b, c5798q1.f33381c, c5798q1.f33383e, c5798q1.f33384f, c5798q1.f33382d, c5798q1.f33385g, c5798q1.f33387i));
        for (Map.Entry entry : c5798q1.f33386h.entrySet()) {
            m21473a((String) entry.getKey(), (String) entry.getValue());
        }
        ConcurrentHashMap concurrentHashMap = c5795p1.f33374j;
        if (concurrentHashMap != null) {
            for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                String str = (String) entry2.getKey();
                Object value = entry2.getValue();
                if (this.f33430o == null) {
                    this.f33430o = new HashMap();
                }
                this.f33430o.put(str, value);
            }
        }
        this.f34283v = new C6079B(c5786m1.f33339n.apiName());
        C6064b c6064b = (C6064b) c5795p1.f33376l.m21880a();
        if (c6064b != null) {
            this.f34282u = c6064b.m21839a();
        } else {
            this.f34282u = null;
        }
    }
}
