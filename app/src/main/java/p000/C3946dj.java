package p000;

import android.content.IntentFilter;
import android.os.Build;
import com.facebook.react.bridge.ReactApplicationContext;

/* renamed from: dj */
/* loaded from: classes2.dex */
public final class C3946dj extends AbstractC6981ux {

    /* renamed from: j */
    public final C1865cj f26224j;

    public C3946dj(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.f26224j = new C1865cj(this);
    }

    @Override // p000.AbstractC6981ux
    /* renamed from: c */
    public final void mo6180c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        int i = Build.VERSION.SDK_INT;
        ReactApplicationContext reactApplicationContext = this.f44038d;
        C1865cj c1865cj = this.f26224j;
        if (i < 34 || reactApplicationContext.getApplicationInfo().targetSdkVersion < 34) {
            reactApplicationContext.registerReceiver(c1865cj, intentFilter);
        } else {
            reactApplicationContext.registerReceiver(c1865cj, intentFilter, 4);
        }
        c1865cj.f17695a = true;
        m17730f();
    }

    @Override // p000.AbstractC6981ux
    /* renamed from: d */
    public final void mo6181d() {
        C1865cj c1865cj = this.f26224j;
        if (c1865cj.f17695a) {
            this.f44038d.unregisterReceiver(c1865cj);
            c1865cj.f17695a = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x003c A[Catch: SecurityException -> 0x0056, TRY_LEAVE, TryCatch #1 {SecurityException -> 0x0056, blocks: (B:9:0x0016, B:27:0x003c), top: B:44:0x0016 }] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m17730f() {
        /*
            r9 = this;
            r0 = 0
            r1 = 5
            android.net.ConnectivityManager r2 = r9.f44035a     // Catch: java.lang.SecurityException -> L52
            android.net.NetworkInfo r2 = r2.getActiveNetworkInfo()     // Catch: java.lang.SecurityException -> L52
            r3 = 4
            if (r2 == 0) goto L54
            boolean r4 = r2.isConnected()     // Catch: java.lang.SecurityException -> L52
            if (r4 != 0) goto L12
            goto L54
        L12:
            boolean r4 = r2.isConnected()     // Catch: java.lang.SecurityException -> L52
            int r5 = r2.getType()     // Catch: java.lang.SecurityException -> L56
            r6 = 3
            r7 = 1
            if (r5 == 0) goto L3c
            r8 = 6
            if (r5 == r7) goto L3a
            if (r5 == r3) goto L3c
            r2 = 9
            if (r5 == r2) goto L38
            r2 = 17
            if (r5 == r2) goto L35
            r2 = 7
            if (r5 == r8) goto L33
            if (r5 == r2) goto L31
            goto L56
        L31:
            r1 = r7
            goto L56
        L33:
            r1 = r2
            goto L56
        L35:
            r1 = 8
            goto L56
        L38:
            r1 = r6
            goto L56
        L3a:
            r1 = r8
            goto L56
        L3c:
            int r1 = r2.getSubtype()     // Catch: java.lang.SecurityException -> L56
            r2 = 20
            r5 = 2
            if (r1 == r2) goto L4f
            switch(r1) {
                case 1: goto L4d;
                case 2: goto L4d;
                case 3: goto L4b;
                case 4: goto L4d;
                case 5: goto L4b;
                case 6: goto L4b;
                case 7: goto L4d;
                case 8: goto L4b;
                case 9: goto L4b;
                case 10: goto L4b;
                case 11: goto L4d;
                case 12: goto L4b;
                case 13: goto L49;
                case 14: goto L4b;
                case 15: goto L49;
                default: goto L48;
            }
        L48:
            goto L50
        L49:
            r0 = r6
            goto L50
        L4b:
            r0 = r5
            goto L50
        L4d:
            r0 = r7
            goto L50
        L4f:
            r0 = r3
        L50:
            r1 = r5
            goto L56
        L52:
            r4 = r0
            goto L56
        L54:
            r4 = r0
            r1 = r3
        L56:
            r9.m25290e(r1, r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C3946dj.m17730f():void");
    }
}
