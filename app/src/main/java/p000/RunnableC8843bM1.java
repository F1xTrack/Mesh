package p000;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ProcessUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.util.Map;

/* renamed from: bM1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC8843bM1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f16990a = 0;

    /* renamed from: b */
    public final int f16991b;

    /* renamed from: c */
    public final String f16992c;

    /* renamed from: d */
    public final Object f16993d;

    /* renamed from: e */
    public final Object f16994e;

    /* renamed from: f */
    public final Object f16995f;

    /* renamed from: g */
    public final Object f16996g;

    public RunnableC8843bM1(String str, InterfaceC10128lM1 interfaceC10128lM1, int i, IOException iOException, byte[] bArr, Map map) {
        Preconditions.checkNotNull(interfaceC10128lM1);
        this.f16993d = interfaceC10128lM1;
        this.f16991b = i;
        this.f16994e = iOException;
        this.f16995f = bArr;
        this.f16992c = str;
        this.f16996g = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16990a) {
            case 0:
                UM1 um1 = ((C9110dP1) ((OL1) this.f16996g).f11615b).f26038h;
                C9110dP1.m17589b(um1);
                if (!um1.f10765c) {
                    ((OL1) this.f16996g).m6034I1();
                    return;
                }
                OL1 ol1 = (OL1) this.f16996g;
                if (ol1.f8375d == 0) {
                    C8143Py1 c8143Py1 = ((C9110dP1) ol1.f11615b).f26037g;
                    if (c8143Py1.f9379f == null) {
                        synchronized (c8143Py1) {
                            try {
                                if (c8143Py1.f9379f == null) {
                                    ApplicationInfo applicationInfo = ((C9110dP1) c8143Py1.f11615b).f26031a.getApplicationInfo();
                                    String myProcessName = ProcessUtils.getMyProcessName();
                                    if (applicationInfo != null) {
                                        String str = applicationInfo.processName;
                                        c8143Py1.f9379f = Boolean.valueOf(str != null && str.equals(myProcessName));
                                    }
                                    if (c8143Py1.f9379f == null) {
                                        c8143Py1.f9379f = Boolean.TRUE;
                                        c8143Py1.mo6070n().f8378g.m24555d("My process not in the list of running processes");
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    if (c8143Py1.f9379f.booleanValue()) {
                        ((OL1) this.f16996g).f8375d = 'C';
                    } else {
                        ((OL1) this.f16996g).f8375d = 'c';
                    }
                }
                OL1 ol12 = (OL1) this.f16996g;
                if (ol12.f8376e < 0) {
                    ol12.f8376e = 114010L;
                }
                char cCharAt = "01VDIWEA?".charAt(this.f16991b);
                OL1 ol13 = (OL1) this.f16996g;
                char c = ol13.f8375d;
                long j = ol13.f8376e;
                String strM6025A1 = OL1.m6025A1(true, this.f16992c, this.f16993d, this.f16994e, this.f16995f);
                StringBuilder sb = new StringBuilder("2");
                sb.append(cCharAt);
                sb.append(c);
                sb.append(j);
                String strM8593l = AbstractC1374Vq.m8593l(sb, StringUtils.PROCESS_POSTFIX_DELIMITER, strM6025A1);
                if (strM8593l.length() > 1024) {
                    strM8593l = this.f16992c.substring(0, 1024);
                }
                C6816sK c6816sK = um1.f11746g;
                if (c6816sK != null) {
                    UM1 um12 = (UM1) c6816sK.f42367e;
                    um12.mo7681v1();
                    if (((UM1) c6816sK.f42367e).m7993C1().getLong((String) c6816sK.f42364b, 0L) == 0) {
                        c6816sK.m24714h();
                    }
                    if (strM8593l == null) {
                        strM8593l = "";
                    }
                    SharedPreferences sharedPreferencesM7993C1 = um12.m7993C1();
                    String str2 = (String) c6816sK.f42365c;
                    long j2 = sharedPreferencesM7993C1.getLong(str2, 0L);
                    String str3 = (String) c6816sK.f42366d;
                    if (j2 <= 0) {
                        SharedPreferences.Editor editorEdit = um12.m7993C1().edit();
                        editorEdit.putString(str3, strM8593l);
                        editorEdit.putLong(str2, 1L);
                        editorEdit.apply();
                        return;
                    }
                    long j3 = j2 + 1;
                    boolean z = (um12.m7852u1().m22870J2().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j3;
                    SharedPreferences.Editor editorEdit2 = um12.m7993C1().edit();
                    if (z) {
                        editorEdit2.putString(str3, strM8593l);
                    }
                    editorEdit2.putLong(str2, j3);
                    editorEdit2.apply();
                    return;
                }
                return;
            default:
                ((InterfaceC10128lM1) this.f16993d).mo4870a(this.f16992c, this.f16991b, (IOException) this.f16994e, (byte[]) this.f16995f, (Map) this.f16996g);
                return;
        }
    }

    public RunnableC8843bM1(OL1 ol1, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f16991b = i;
        this.f16992c = str;
        this.f16993d = obj;
        this.f16994e = obj2;
        this.f16995f = obj3;
        this.f16996g = ol1;
    }
}
