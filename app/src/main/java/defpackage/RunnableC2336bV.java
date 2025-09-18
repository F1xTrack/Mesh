package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessaging;

/* renamed from: bV, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2336bV implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FirebaseMessaging b;
    public final /* synthetic */ S81 c;

    public /* synthetic */ RunnableC2336bV(FirebaseMessaging firebaseMessaging, S81 s81, int i) {
        this.a = i;
        this.b = firebaseMessaging;
        this.c = s81;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                S81 s81 = this.c;
                LL0 ll0 = FirebaseMessaging.l;
                FirebaseMessaging firebaseMessaging = this.b;
                firebaseMessaging.getClass();
                try {
                    s81.b(firebaseMessaging.a());
                    return;
                } catch (Exception e) {
                    s81.a(e);
                    return;
                }
            default:
                FirebaseMessaging firebaseMessaging2 = this.b;
                S81 s812 = this.c;
                LL0 ll02 = FirebaseMessaging.l;
                firebaseMessaging2.getClass();
                try {
                    C1241Pr0 c1241Pr0 = firebaseMessaging2.c;
                    c1241Pr0.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putString("delete", "1");
                    AbstractC3782fU1.a(c1241Pr0.o(c1241Pr0.B(C0462Fr0.c((MU) c1241Pr0.a), "*", bundle)));
                    LL0 ll0D = FirebaseMessaging.d(firebaseMessaging2.b);
                    String strE = firebaseMessaging2.e();
                    String strC = C0462Fr0.c(firebaseMessaging2.a);
                    synchronized (ll0D) {
                        String strA = LL0.a(strE, strC);
                        SharedPreferences.Editor editorEdit = ll0D.a.edit();
                        editorEdit.remove(strA);
                        editorEdit.commit();
                    }
                    s812.b(null);
                    return;
                } catch (Exception e2) {
                    s812.a(e2);
                    return;
                }
        }
    }
}
