package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.C3801t;
import com.yandex.metrica.C3802u;
import com.yandex.metrica.C3805x;
import com.yandex.metrica.C3806y;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.xg */
/* loaded from: classes2.dex */
public class C3730xg {
    /* renamed from: a */
    public C3806y m17184a(C3806y c3806y) {
        if (!C2968U2.m15244a(c3806y.maxReportsInDatabaseCount)) {
            return c3806y;
        }
        C3805x c3805xM17378a = C3806y.m17378a(c3806y);
        c3805xM17378a.f25533b = new ArrayList();
        C2968U2.m15244a((Object) null);
        Map map = c3806y.f25541a;
        if (C2968U2.m15244a((Object) map) && C2968U2.m15244a((Object) null)) {
            c3805xM17378a.f25535d = map;
        }
        Integer num = c3806y.f25543c;
        if (C2968U2.m15244a(num)) {
            if (num.intValue() < 0) {
                throw new IllegalArgumentException(String.format(Locale.US, "Invalid %1$s. %1$s should be positive.", "App Build Number"));
            }
            c3805xM17378a.f25534c = num;
        }
        Integer num2 = c3806y.f25544d;
        if (C2968U2.m15244a(num2)) {
            num2.getClass();
            c3805xM17378a.f25536e = num2;
        }
        Integer num3 = c3806y.f25545e;
        if (C2968U2.m15244a(num3)) {
            num3.getClass();
            c3805xM17378a.f25537f = num3;
        }
        C2968U2.m15244a((Object) null);
        Map map2 = c3806y.f25546f;
        if (C2968U2.m15244a((Object) map2)) {
            for (Map.Entry entry : map2.entrySet()) {
                c3805xM17378a.f25538g.put((String) entry.getKey(), (String) entry.getValue());
            }
        }
        Boolean bool = c3806y.f25547g;
        if (C2968U2.m15244a(bool)) {
            bool.getClass();
            c3805xM17378a.f25539h = bool;
        }
        List list = c3806y.f25542b;
        if (C2968U2.m15244a((Object) list)) {
            c3805xM17378a.f25533b = list;
        }
        Boolean bool2 = c3806y.f25548h;
        if (C2968U2.m15244a(bool2)) {
            bool2.getClass();
            c3805xM17378a.f25540i = bool2;
        }
        c3805xM17378a.f25532a.withMaxReportsInDatabaseCount(m17182a(c3806y.maxReportsInDatabaseCount, c3806y.apiKey));
        return new C3806y(c3805xM17378a);
    }

    /* renamed from: a */
    public C3802u m17183a(C3802u c3802u) {
        if (!C2968U2.m15244a(c3802u.maxReportsInDatabaseCount)) {
            return c3802u;
        }
        C3801t c3801t = new C3801t(c3802u.apiKey);
        if (C2968U2.m15244a(c3802u.sessionTimeout)) {
            c3801t.f25519a.withSessionTimeout(c3802u.sessionTimeout.intValue());
        }
        if (C2968U2.m15244a(c3802u.logs) && c3802u.logs.booleanValue()) {
            c3801t.f25519a.withLogs();
        }
        if (C2968U2.m15244a(c3802u.statisticsSending)) {
            c3801t.f25519a.withStatisticsSending(c3802u.statisticsSending.booleanValue());
        }
        if (C2968U2.m15244a(c3802u.maxReportsInDatabaseCount)) {
            c3801t.f25519a.withMaxReportsInDatabaseCount(c3802u.maxReportsInDatabaseCount.intValue());
        }
        if (!C2968U2.m15244a((Object) null) && !C2968U2.m15244a((Object) null)) {
            Map map = c3802u.f25521a;
            if (C2968U2.m15244a((Object) map)) {
                for (Map.Entry entry : map.entrySet()) {
                    c3801t.f25520b.put((String) entry.getKey(), (String) entry.getValue());
                }
            }
            if (C2968U2.m15244a((Object) c3802u.userProfileID)) {
                c3801t.f25519a.withUserProfileID(c3802u.userProfileID);
            }
            c3801t.f25519a.withMaxReportsInDatabaseCount(m17182a(c3802u.maxReportsInDatabaseCount, c3802u.apiKey));
            return new C3802u(c3801t);
        }
        throw null;
    }

    /* renamed from: a */
    private int m17182a(Integer num, String str) {
        if (num.intValue() < 100) {
            AbstractC3788zm.m17346b(str).m17369c("Value passed as maxReportsInDatabaseCount is invalid. Should be greater than or equal to %d, but was: %d. Default value (%d) will be used", 100, num, 100);
            return 100;
        }
        if (num.intValue() > 10000) {
            AbstractC3788zm.m17346b(str).m17369c("Value passed as maxReportsInDatabaseCount is invalid. Should be less than or equal to %d, but was: %d. Default value (%d) will be used", 10000, num, 10000);
            return 10000;
        }
        return num.intValue();
    }
}
