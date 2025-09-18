package p000;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessaging;

/* renamed from: bV */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1789bV implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f17049a;

    /* renamed from: b */
    public final /* synthetic */ FirebaseMessaging f17050b;

    /* renamed from: c */
    public final /* synthetic */ S81 f17051c;

    public /* synthetic */ RunnableC1789bV(FirebaseMessaging firebaseMessaging, S81 s81, int i) {
        this.f17049a = i;
        this.f17050b = firebaseMessaging;
        this.f17051c = s81;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17049a) {
            case 0:
                S81 s81 = this.f17051c;
                LL0 ll0 = FirebaseMessaging.f18465l;
                FirebaseMessaging firebaseMessaging = this.f17050b;
                firebaseMessaging.getClass();
                try {
                    s81.m7184b(firebaseMessaging.m11309a());
                    return;
                } catch (Exception e) {
                    s81.m7183a(e);
                    return;
                }
            default:
                FirebaseMessaging firebaseMessaging2 = this.f17050b;
                S81 s812 = this.f17051c;
                LL0 ll02 = FirebaseMessaging.f18465l;
                firebaseMessaging2.getClass();
                try {
                    C8128Pr0 c8128Pr0 = firebaseMessaging2.f18470c;
                    c8128Pr0.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putString("delete", "1");
                    AbstractC9376fU1.m18240a(c8128Pr0.m6452o(c8128Pr0.m6445B(C7608Fr0.m2794c((C0786MU) c8128Pr0.f9303a), "*", bundle)));
                    LL0 ll0M11308d = FirebaseMessaging.m11308d(firebaseMessaging2.f18469b);
                    String strM11310e = firebaseMessaging2.m11310e();
                    String strM2794c = C7608Fr0.m2794c(firebaseMessaging2.f18468a);
                    synchronized (ll0M11308d) {
                        String strM4955a = LL0.m4955a(strM11310e, strM2794c);
                        SharedPreferences.Editor editorEdit = ll0M11308d.f6615a.edit();
                        editorEdit.remove(strM4955a);
                        editorEdit.commit();
                    }
                    s812.m7184b(null);
                    return;
                } catch (Exception e2) {
                    s812.m7183a(e2);
                    return;
                }
        }
    }
}
