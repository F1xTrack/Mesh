package defpackage;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ProcessUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.util.Map;

/* renamed from: bM1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2311bM1 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final int b;
    public final String c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public RunnableC2311bM1(String str, InterfaceC5680lM1 interfaceC5680lM1, int i, IOException iOException, byte[] bArr, Map map) {
        Preconditions.checkNotNull(interfaceC5680lM1);
        this.d = interfaceC5680lM1;
        this.b = i;
        this.e = iOException;
        this.f = bArr;
        this.c = str;
        this.g = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                UM1 um1 = ((C3386dP1) ((OL1) this.g).b).h;
                C3386dP1.b(um1);
                if (!um1.c) {
                    ((OL1) this.g).I1();
                    return;
                }
                OL1 ol1 = (OL1) this.g;
                if (ol1.d == 0) {
                    C1263Py1 c1263Py1 = ((C3386dP1) ol1.b).g;
                    if (c1263Py1.f == null) {
                        synchronized (c1263Py1) {
                            try {
                                if (c1263Py1.f == null) {
                                    ApplicationInfo applicationInfo = ((C3386dP1) c1263Py1.b).a.getApplicationInfo();
                                    String myProcessName = ProcessUtils.getMyProcessName();
                                    if (applicationInfo != null) {
                                        String str = applicationInfo.processName;
                                        c1263Py1.f = Boolean.valueOf(str != null && str.equals(myProcessName));
                                    }
                                    if (c1263Py1.f == null) {
                                        c1263Py1.f = Boolean.TRUE;
                                        c1263Py1.n().g.d("My process not in the list of running processes");
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    if (c1263Py1.f.booleanValue()) {
                        ((OL1) this.g).d = 'C';
                    } else {
                        ((OL1) this.g).d = 'c';
                    }
                }
                OL1 ol12 = (OL1) this.g;
                if (ol12.e < 0) {
                    ol12.e = 114010L;
                }
                char cCharAt = "01VDIWEA?".charAt(this.b);
                OL1 ol13 = (OL1) this.g;
                char c = ol13.d;
                long j = ol13.e;
                String strA1 = OL1.A1(true, this.c, this.d, this.e, this.f);
                StringBuilder sb = new StringBuilder("2");
                sb.append(cCharAt);
                sb.append(c);
                sb.append(j);
                String strL = AbstractC1705Vq.l(sb, StringUtils.PROCESS_POSTFIX_DELIMITER, strA1);
                if (strL.length() > 1024) {
                    strL = this.c.substring(0, 1024);
                }
                C7008sK c7008sK = um1.g;
                if (c7008sK != null) {
                    UM1 um12 = (UM1) c7008sK.e;
                    um12.v1();
                    if (((UM1) c7008sK.e).C1().getLong((String) c7008sK.b, 0L) == 0) {
                        c7008sK.h();
                    }
                    if (strL == null) {
                        strL = "";
                    }
                    SharedPreferences sharedPreferencesC1 = um12.C1();
                    String str2 = (String) c7008sK.c;
                    long j2 = sharedPreferencesC1.getLong(str2, 0L);
                    String str3 = (String) c7008sK.d;
                    if (j2 <= 0) {
                        SharedPreferences.Editor editorEdit = um12.C1().edit();
                        editorEdit.putString(str3, strL);
                        editorEdit.putLong(str2, 1L);
                        editorEdit.apply();
                        return;
                    }
                    long j3 = j2 + 1;
                    boolean z = (um12.u1().J2().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j3;
                    SharedPreferences.Editor editorEdit2 = um12.C1().edit();
                    if (z) {
                        editorEdit2.putString(str3, strL);
                    }
                    editorEdit2.putLong(str2, j3);
                    editorEdit2.apply();
                    return;
                }
                return;
            default:
                ((InterfaceC5680lM1) this.d).a(this.c, this.b, (IOException) this.e, (byte[]) this.f, (Map) this.g);
                return;
        }
    }

    public RunnableC2311bM1(OL1 ol1, int i, String str, Object obj, Object obj2, Object obj3) {
        this.b = i;
        this.c = str;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.g = ol1;
    }
}
