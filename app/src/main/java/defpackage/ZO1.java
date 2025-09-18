package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* loaded from: classes.dex */
public final /* synthetic */ class ZO1 implements Runnable {
    public final /* synthetic */ int a;
    public /* synthetic */ FR1 b;

    public /* synthetic */ ZO1(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.S1();
                break;
            case 1:
                FR1 fr1 = this.b;
                fr1.v1();
                if (fr1.t1().v.b()) {
                    fr1.n().n.d("Deferred Deep Link already retrieved. Not fetching again.");
                    break;
                } else {
                    long jG = fr1.t1().w.g();
                    fr1.t1().w.h(1 + jG);
                    if (jG >= 5) {
                        fr1.n().j.d("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                        fr1.t1().v.a(true);
                        break;
                    } else {
                        if (fr1.u == null) {
                            fr1.u = new AS1(fr1, (C3386dP1) fr1.b, 3);
                        }
                        fr1.u.b(0L);
                        break;
                    }
                }
            case 2:
                this.b.S1();
                break;
            case 3:
                C7409uQ0 c7409uQ0 = this.b.s;
                C3386dP1 c3386dP1 = (C3386dP1) c7409uQ0.a;
                C7595vO1 c7595vO1 = c3386dP1.j;
                C3386dP1.e(c7595vO1);
                c7595vO1.v1();
                if (c7409uQ0.n()) {
                    boolean zO = c7409uQ0.o();
                    FR1 fr12 = c3386dP1.p;
                    UM1 um1 = c3386dP1.h;
                    if (zO) {
                        C3386dP1.b(um1);
                        um1.y.t(null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
                        bundle.putLong("_cc", 1L);
                        C3386dP1.c(fr12);
                        fr12.X1("auto", "_cmpx", bundle);
                    } else {
                        C3386dP1.b(um1);
                        String strO = um1.y.o();
                        if (TextUtils.isEmpty(strO)) {
                            OL1 ol1 = c3386dP1.i;
                            C3386dP1.e(ol1);
                            ol1.h.d("Cache still valid but referrer not found");
                        } else {
                            C3386dP1.b(um1);
                            long jG2 = ((um1.z.g() / 3600000) - 1) * 3600000;
                            Uri uri = Uri.parse(strO);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(uri.getPath(), bundle2);
                            for (String str : uri.getQueryParameterNames()) {
                                bundle2.putString(str, uri.getQueryParameter(str));
                            }
                            ((Bundle) pair.second).putLong("_cc", jG2);
                            Object obj = pair.first;
                            String str2 = obj == null ? "app" : (String) obj;
                            C3386dP1.c(fr12);
                            fr12.X1(str2, "_cmp", (Bundle) pair.second);
                        }
                        C3386dP1.b(um1);
                        um1.y.t(null);
                    }
                    C3386dP1.b(um1);
                    um1.z.h(0L);
                    break;
                }
                break;
            default:
                this.b.S1();
                break;
        }
    }

    public ZO1(FR1 fr1) {
        this.a = 3;
        this.b = fr1;
    }
}
