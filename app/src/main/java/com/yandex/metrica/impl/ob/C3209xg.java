package com.yandex.metrica.impl.ob;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.xg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3209xg {
    public com.yandex.metrica.y a(com.yandex.metrica.y yVar) {
        if (!U2.a(yVar.maxReportsInDatabaseCount)) {
            return yVar;
        }
        com.yandex.metrica.x xVarA = com.yandex.metrica.y.a(yVar);
        xVarA.b = new ArrayList();
        U2.a((Object) null);
        Map map = yVar.a;
        if (U2.a((Object) map) && U2.a((Object) null)) {
            xVarA.d = map;
        }
        Integer num = yVar.c;
        if (U2.a(num)) {
            if (num.intValue() < 0) {
                throw new IllegalArgumentException(String.format(Locale.US, "Invalid %1$s. %1$s should be positive.", "App Build Number"));
            }
            xVarA.c = num;
        }
        Integer num2 = yVar.d;
        if (U2.a(num2)) {
            num2.getClass();
            xVarA.e = num2;
        }
        Integer num3 = yVar.e;
        if (U2.a(num3)) {
            num3.getClass();
            xVarA.f = num3;
        }
        U2.a((Object) null);
        Map map2 = yVar.f;
        if (U2.a((Object) map2)) {
            for (Map.Entry entry : map2.entrySet()) {
                xVarA.g.put((String) entry.getKey(), (String) entry.getValue());
            }
        }
        Boolean bool = yVar.g;
        if (U2.a(bool)) {
            bool.getClass();
            xVarA.h = bool;
        }
        List list = yVar.b;
        if (U2.a((Object) list)) {
            xVarA.b = list;
        }
        Boolean bool2 = yVar.h;
        if (U2.a(bool2)) {
            bool2.getClass();
            xVarA.i = bool2;
        }
        xVarA.a.withMaxReportsInDatabaseCount(a(yVar.maxReportsInDatabaseCount, yVar.apiKey));
        return new com.yandex.metrica.y(xVarA);
    }

    public com.yandex.metrica.u a(com.yandex.metrica.u uVar) {
        if (!U2.a(uVar.maxReportsInDatabaseCount)) {
            return uVar;
        }
        com.yandex.metrica.t tVar = new com.yandex.metrica.t(uVar.apiKey);
        if (U2.a(uVar.sessionTimeout)) {
            tVar.a.withSessionTimeout(uVar.sessionTimeout.intValue());
        }
        if (U2.a(uVar.logs) && uVar.logs.booleanValue()) {
            tVar.a.withLogs();
        }
        if (U2.a(uVar.statisticsSending)) {
            tVar.a.withStatisticsSending(uVar.statisticsSending.booleanValue());
        }
        if (U2.a(uVar.maxReportsInDatabaseCount)) {
            tVar.a.withMaxReportsInDatabaseCount(uVar.maxReportsInDatabaseCount.intValue());
        }
        if (!U2.a((Object) null) && !U2.a((Object) null)) {
            Map map = uVar.a;
            if (U2.a((Object) map)) {
                for (Map.Entry entry : map.entrySet()) {
                    tVar.b.put((String) entry.getKey(), (String) entry.getValue());
                }
            }
            if (U2.a((Object) uVar.userProfileID)) {
                tVar.a.withUserProfileID(uVar.userProfileID);
            }
            tVar.a.withMaxReportsInDatabaseCount(a(uVar.maxReportsInDatabaseCount, uVar.apiKey));
            return new com.yandex.metrica.u(tVar);
        }
        throw null;
    }

    private int a(Integer num, String str) {
        if (num.intValue() < 100) {
            AbstractC3265zm.b(str).c("Value passed as maxReportsInDatabaseCount is invalid. Should be greater than or equal to %d, but was: %d. Default value (%d) will be used", 100, num, 100);
            return 100;
        }
        if (num.intValue() > 10000) {
            AbstractC3265zm.b(str).c("Value passed as maxReportsInDatabaseCount is invalid. Should be less than or equal to %d, but was: %d. Default value (%d) will be used", 10000, num, 10000);
            return 10000;
        }
        return num.intValue();
    }
}
