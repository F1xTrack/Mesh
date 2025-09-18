package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import java.io.File;
import java.util.Set;
import org.json.JSONObject;
import p000.AbstractC6366lU;
import p000.AbstractC8418Vg0;
import p000.InterfaceC6497nZ;
import p000.O90;

/* renamed from: com.yandex.metrica.impl.ob.J8 */
/* loaded from: classes2.dex */
public abstract class AbstractC2700J8 {

    /* renamed from: a */
    private JSONObject f21499a;

    /* renamed from: b */
    private final Context f21500b;

    /* renamed from: c */
    private final String f21501c;

    /* renamed from: d */
    private final C2742L0 f21502d;

    /* renamed from: com.yandex.metrica.impl.ob.J8$a */
    public static final class a extends AbstractC8418Vg0 implements InterfaceC6497nZ {
        public a() {
            super(1);
        }

        @Override // p000.InterfaceC6497nZ
        public Object invoke(Object obj) {
            return Boolean.valueOf(!AbstractC2700J8.this.mo14232a().contains((String) obj));
        }
    }

    public AbstractC2700J8(Context context, String str, C2742L0 c2742l0) {
        this.f21500b = context;
        this.f21501c = str;
        this.f21502d = c2742l0;
    }

    /* renamed from: a */
    public abstract Set<String> mo14232a();

    /* renamed from: a */
    public final synchronized void m14421a(JSONObject jSONObject) {
        try {
            File fileM14500a = this.f21502d.m14500a(this.f21500b, this.f21501c);
            if (fileM14500a != null) {
                String string = jSONObject.toString();
                O90.m5967e(string, "contents.toString()");
                AbstractC6366lU.m22438h(fileM14500a, string);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x005d A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x005f A[Catch: all -> 0x004a, TRY_ENTER, TryCatch #1 {, blocks: (B:36:0x0001, B:52:0x0057, B:53:0x0059, B:57:0x005f, B:58:0x0065, B:50:0x004c, B:51:0x0052, B:38:0x0005, B:40:0x0013, B:43:0x001a, B:44:0x003a, B:46:0x0040), top: B:61:0x0001, inners: #3 }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized org.json.JSONObject m14422b() {
        /*
            r5 = this;
            monitor-enter(r5)
            org.json.JSONObject r0 = r5.f21499a     // Catch: java.lang.Throwable -> L4a
            if (r0 != 0) goto L59
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L4c java.io.FileNotFoundException -> L52
            com.yandex.metrica.impl.ob.L0 r1 = r5.f21502d     // Catch: java.lang.Throwable -> L4c java.io.FileNotFoundException -> L52
            android.content.Context r2 = r5.f21500b     // Catch: java.lang.Throwable -> L4c java.io.FileNotFoundException -> L52
            java.lang.String r3 = r5.f21501c     // Catch: java.lang.Throwable -> L4c java.io.FileNotFoundException -> L52
            java.io.File r1 = r1.m14500a(r2, r3)     // Catch: java.lang.Throwable -> L4c java.io.FileNotFoundException -> L52
            if (r1 == 0) goto L18
            java.lang.String r1 = p000.AbstractC6366lU.m22436f(r1)     // Catch: java.lang.Throwable -> L4c java.io.FileNotFoundException -> L52
            goto L1a
        L18:
            java.lang.String r1 = "{}"
        L1a:
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L4c java.io.FileNotFoundException -> L52
            java.util.Iterator r1 = r0.keys()     // Catch: java.lang.Throwable -> L4c java.io.FileNotFoundException -> L52
            java.lang.String r2 = "json.keys()"
            p000.O90.m5967e(r1, r2)     // Catch: java.lang.Throwable -> L4c java.io.FileNotFoundException -> L52
            dY0 r1 = p000.AbstractC9639hY0.m18825d(r1)     // Catch: java.lang.Throwable -> L4c java.io.FileNotFoundException -> L52
            com.yandex.metrica.impl.ob.J8$a r2 = new com.yandex.metrica.impl.ob.J8$a     // Catch: java.lang.Throwable -> L4c java.io.FileNotFoundException -> L52
            r2.<init>()     // Catch: java.lang.Throwable -> L4c java.io.FileNotFoundException -> L52
            xU r3 = new xU     // Catch: java.lang.Throwable -> L4c java.io.FileNotFoundException -> L52
            r4 = 1
            r3.<init>(r1, r4, r2)     // Catch: java.lang.Throwable -> L4c java.io.FileNotFoundException -> L52
            wU r1 = new wU     // Catch: java.lang.Throwable -> L4c java.io.FileNotFoundException -> L52
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L4c java.io.FileNotFoundException -> L52
        L3a:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L4c java.io.FileNotFoundException -> L52
            if (r2 == 0) goto L57
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L4c java.io.FileNotFoundException -> L52
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L4c java.io.FileNotFoundException -> L52
            r0.remove(r2)     // Catch: java.lang.Throwable -> L4c java.io.FileNotFoundException -> L52
            goto L3a
        L4a:
            r0 = move-exception
            goto L66
        L4c:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L4a
            r0.<init>()     // Catch: java.lang.Throwable -> L4a
            goto L57
        L52:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L4a
            r0.<init>()     // Catch: java.lang.Throwable -> L4a
        L57:
            r5.f21499a = r0     // Catch: java.lang.Throwable -> L4a
        L59:
            org.json.JSONObject r0 = r5.f21499a     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto L5f
            monitor-exit(r5)
            return r0
        L5f:
            java.lang.String r0 = "fileContents"
            p000.O90.m5977o(r0)     // Catch: java.lang.Throwable -> L4a
            r0 = 0
            throw r0     // Catch: java.lang.Throwable -> L4a
        L66:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p022ob.AbstractC2700J8.m14422b():org.json.JSONObject");
    }
}
