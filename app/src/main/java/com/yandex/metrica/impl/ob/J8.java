package com.yandex.metrica.impl.ob;

import android.content.Context;
import defpackage.AbstractC1676Vg0;
import defpackage.AbstractC5702lU;
import defpackage.InterfaceC6099nZ;
import defpackage.O90;
import java.io.File;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class J8 {
    private JSONObject a;
    private final Context b;
    private final String c;
    private final L0 d;

    public static final class a extends AbstractC1676Vg0 implements InterfaceC6099nZ {
        public a() {
            super(1);
        }

        @Override // defpackage.InterfaceC6099nZ
        public Object invoke(Object obj) {
            return Boolean.valueOf(!J8.this.a().contains((String) obj));
        }
    }

    public J8(Context context, String str, L0 l0) {
        this.b = context;
        this.c = str;
        this.d = l0;
    }

    public abstract Set<String> a();

    public final synchronized void a(JSONObject jSONObject) {
        try {
            File fileA = this.d.a(this.b, this.c);
            if (fileA != null) {
                String string = jSONObject.toString();
                O90.e(string, "contents.toString()");
                AbstractC5702lU.h(fileA, string);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x005d A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x005f A[Catch: all -> 0x004a, TRY_ENTER, TryCatch #1 {, blocks: (B:36:0x0001, B:52:0x0057, B:53:0x0059, B:57:0x005f, B:58:0x0065, B:50:0x004c, B:51:0x0052, B:38:0x0005, B:40:0x0013, B:43:0x001a, B:44:0x003a, B:46:0x0040), top: B:61:0x0001, inners: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized org.json.JSONObject b() {
        /*
            r5 = this;
            monitor-enter(r5)
            org.json.JSONObject r0 = r5.a     // Catch: java.lang.Throwable -> L4a
            if (r0 != 0) goto L59
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L4c java.io.FileNotFoundException -> L52
            com.yandex.metrica.impl.ob.L0 r1 = r5.d     // Catch: java.lang.Throwable -> L4c java.io.FileNotFoundException -> L52
            android.content.Context r2 = r5.b     // Catch: java.lang.Throwable -> L4c java.io.FileNotFoundException -> L52
            java.lang.String r3 = r5.c     // Catch: java.lang.Throwable -> L4c java.io.FileNotFoundException -> L52
            java.io.File r1 = r1.a(r2, r3)     // Catch: java.lang.Throwable -> L4c java.io.FileNotFoundException -> L52
            if (r1 == 0) goto L18
            java.lang.String r1 = defpackage.AbstractC5702lU.f(r1)     // Catch: java.lang.Throwable -> L4c java.io.FileNotFoundException -> L52
            goto L1a
        L18:
            java.lang.String r1 = "{}"
        L1a:
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L4c java.io.FileNotFoundException -> L52
            java.util.Iterator r1 = r0.keys()     // Catch: java.lang.Throwable -> L4c java.io.FileNotFoundException -> L52
            java.lang.String r2 = "json.keys()"
            defpackage.O90.e(r1, r2)     // Catch: java.lang.Throwable -> L4c java.io.FileNotFoundException -> L52
            dY0 r1 = defpackage.AbstractC4175hY0.d(r1)     // Catch: java.lang.Throwable -> L4c java.io.FileNotFoundException -> L52
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
            r5.a = r0     // Catch: java.lang.Throwable -> L4a
        L59:
            org.json.JSONObject r0 = r5.a     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto L5f
            monitor-exit(r5)
            return r0
        L5f:
            java.lang.String r0 = "fileContents"
            defpackage.O90.o(r0)     // Catch: java.lang.Throwable -> L4a
            r0 = 0
            throw r0     // Catch: java.lang.Throwable -> L4a
        L66:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.J8.b():org.json.JSONObject");
    }
}
