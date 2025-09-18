package p000;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.hms.support.api.entity.core.CommonCode;

/* loaded from: classes.dex */
public final /* synthetic */ class ZO1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f14877a;

    /* renamed from: b */
    public /* synthetic */ FR1 f14878b;

    public /* synthetic */ ZO1(int i) {
        this.f14877a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14877a) {
            case 0:
                this.f14878b.m2648S1();
                break;
            case 1:
                FR1 fr1 = this.f14878b;
                fr1.mo7681v1();
                if (fr1.m7851t1().f11761v.m17921b()) {
                    fr1.mo6070n().f8385n.m24555d("Deferred Deep Link already retrieved. Not fetching again.");
                    break;
                } else {
                    long jM18962g = fr1.m7851t1().f11762w.m18962g();
                    fr1.m7851t1().f11762w.m18963h(1 + jM18962g);
                    if (jM18962g >= 5) {
                        fr1.mo6070n().f8381j.m24555d("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                        fr1.m7851t1().f11761v.m17920a(true);
                        break;
                    } else {
                        if (fr1.f3222u == null) {
                            fr1.f3222u = new AS1(fr1, (C9110dP1) fr1.f11615b, 3);
                        }
                        fr1.f3222u.m8322b(0L);
                        break;
                    }
                }
            case 2:
                this.f14878b.m2648S1();
                break;
            case 3:
                C11287uQ0 c11287uQ0 = this.f14878b.f3220s;
                C9110dP1 c9110dP1 = (C9110dP1) c11287uQ0.f43693a;
                C11412vO1 c11412vO1 = c9110dP1.f26040j;
                C9110dP1.m17592e(c11412vO1);
                c11412vO1.mo7681v1();
                if (c11287uQ0.m25194n()) {
                    boolean zM25195o = c11287uQ0.m25195o();
                    FR1 fr12 = c9110dP1.f26046p;
                    UM1 um1 = c9110dP1.f26038h;
                    if (zM25195o) {
                        C9110dP1.m17589b(um1);
                        um1.f11764y.m8354t(null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
                        bundle.putLong("_cc", 1L);
                        C9110dP1.m17590c(fr12);
                        fr12.m2653X1("auto", "_cmpx", bundle);
                    } else {
                        C9110dP1.m17589b(um1);
                        String strM8350o = um1.f11764y.m8350o();
                        if (TextUtils.isEmpty(strM8350o)) {
                            OL1 ol1 = c9110dP1.f26039i;
                            C9110dP1.m17592e(ol1);
                            ol1.f8379h.m24555d("Cache still valid but referrer not found");
                        } else {
                            C9110dP1.m17589b(um1);
                            long jM18962g2 = ((um1.f11765z.m18962g() / 3600000) - 1) * 3600000;
                            Uri uri = Uri.parse(strM8350o);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(uri.getPath(), bundle2);
                            for (String str : uri.getQueryParameterNames()) {
                                bundle2.putString(str, uri.getQueryParameter(str));
                            }
                            ((Bundle) pair.second).putLong("_cc", jM18962g2);
                            Object obj = pair.first;
                            String str2 = obj == null ? "app" : (String) obj;
                            C9110dP1.m17590c(fr12);
                            fr12.m2653X1(str2, "_cmp", (Bundle) pair.second);
                        }
                        C9110dP1.m17589b(um1);
                        um1.f11764y.m8354t(null);
                    }
                    C9110dP1.m17589b(um1);
                    um1.f11765z.m18963h(0L);
                    break;
                }
                break;
            default:
                this.f14878b.m2648S1();
                break;
        }
    }

    public ZO1(FR1 fr1) {
        this.f14877a = 3;
        this.f14878b = fr1;
    }
}
