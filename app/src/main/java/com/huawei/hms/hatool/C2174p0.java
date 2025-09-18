package com.huawei.hms.hatool;

import java.util.Calendar;
import java.util.UUID;

/* renamed from: com.huawei.hms.hatool.p0 */
/* loaded from: classes.dex */
public class C2174p0 {

    /* renamed from: a */
    private long f19265a = 1800000;

    /* renamed from: b */
    private volatile boolean f19266b = false;

    /* renamed from: c */
    private a f19267c = null;

    /* renamed from: com.huawei.hms.hatool.p0$a */
    public class a {

        /* renamed from: a */
        String f19268a = UUID.randomUUID().toString().replace("-", "");

        /* renamed from: b */
        boolean f19269b;

        /* renamed from: c */
        private long f19270c;

        public a(long j) {
            this.f19268a += "_" + j;
            this.f19270c = j;
            this.f19269b = true;
            C2174p0.this.f19266b = false;
        }

        /* renamed from: b */
        private void m12170b(long j) {
            C2186v.m12271c("hmsSdk", "getNewSession() session is flush!");
            String string = UUID.randomUUID().toString();
            this.f19268a = string;
            this.f19268a = string.replace("-", "");
            this.f19268a += "_" + j;
            this.f19270c = j;
            this.f19269b = true;
        }

        /* renamed from: a */
        public void m12172a(long j) {
            if (C2174p0.this.f19266b) {
                C2174p0.this.f19266b = false;
                m12170b(j);
            } else if (m12171b(this.f19270c, j) || m12169a(this.f19270c, j)) {
                m12170b(j);
            } else {
                this.f19270c = j;
                this.f19269b = false;
            }
        }

        /* renamed from: a */
        private boolean m12169a(long j, long j2) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(j2);
            return (calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6)) ? false : true;
        }

        /* renamed from: b */
        private boolean m12171b(long j, long j2) {
            return j2 - j >= C2174p0.this.f19265a;
        }
    }

    /* renamed from: a */
    public String m12166a() {
        a aVar = this.f19267c;
        if (aVar != null) {
            return aVar.f19268a;
        }
        C2186v.m12276f("hmsSdk", "getSessionName(): session not prepared. onEvent() must be called first.");
        return "";
    }

    /* renamed from: a */
    public void m12167a(long j) {
        a aVar = this.f19267c;
        if (aVar != null) {
            aVar.m12172a(j);
        } else {
            C2186v.m12271c("hmsSdk", "Session is first flush");
            this.f19267c = new a(j);
        }
    }

    /* renamed from: b */
    public boolean m12168b() {
        a aVar = this.f19267c;
        if (aVar != null) {
            return aVar.f19269b;
        }
        C2186v.m12276f("hmsSdk", "isFirstEvent(): session not prepared. onEvent() must be called first.");
        return false;
    }
}
