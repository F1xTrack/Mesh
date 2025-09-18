package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import ru.rustore.sdk.activitylauncher.RuStoreActivityLauncher;
import ru.rustore.sdk.review.model.ReviewInfo;

/* renamed from: jw1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5406jw1 extends AbstractC1676Vg0 implements InterfaceC6099nZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ C1296Qj1 f;
    public final /* synthetic */ ReviewInfo g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5406jw1(C1296Qj1 c1296Qj1, ReviewInfo reviewInfo, int i) {
        super(1);
        this.e = i;
        this.f = c1296Qj1;
        this.g = reviewInfo;
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        Object objB;
        Object objB2;
        C1518Tf1 c1518Tf1 = C1518Tf1.a;
        int i = 1;
        ReviewInfo reviewInfo = this.g;
        C1296Qj1 c1296Qj1 = this.f;
        switch (this.e) {
            case 0:
                C5423k11 c5423k11 = (C5423k11) obj;
                O90.f(c5423k11, "emitter");
                ReviewInfo reviewInfo2 = this.g;
                try {
                    Context context = (Context) c1296Qj1.a;
                    String str = (String) c1296Qj1.b;
                    O90.e(str, "applicationId");
                    C1296Qj1.c((Context) c1296Qj1.a, new C1800Wv1(c5423k11, 0), new ServiceConnectionC2019Zq1(context, reviewInfo2, str, new S51(15, c5423k11), new C1800Wv1(c5423k11, 1)));
                    objB = c1518Tf1;
                } catch (Throwable th) {
                    objB = RQ1.b(th);
                }
                Throwable thA = PS0.a(objB);
                if (thA != null) {
                    c5423k11.b(thA);
                }
                return c1518Tf1;
            case 1:
                C5423k11 c5423k112 = (C5423k11) obj;
                O90.f(c5423k112, "emitter");
                try {
                    Context context2 = (Context) c1296Qj1.a;
                    Intent intent = new Intent("ru.vk.store.RequestAppReview");
                    intent.putExtra("KEY_APPLICATION_ID", (String) c1296Qj1.b);
                    intent.putExtras(reviewInfo.toBundle$sdk_public_review_release());
                    C0532Go1 c0532Go1 = new C0532Go1(13, c5423k112);
                    int i2 = RuStoreActivityLauncher.b;
                    ResultReceiverC0287Dl resultReceiverC0287Dl = new ResultReceiverC0287Dl(c0532Go1);
                    Intent intent2 = new Intent(context2, (Class<?>) RuStoreActivityLauncher.class);
                    if (!(context2 instanceof Activity)) {
                        intent2.setFlags(268435456);
                    }
                    intent2.putExtra("RESULT_RECEIVER", resultReceiverC0287Dl);
                    intent2.putExtra("CONFIRMATION_PENDING_INTENT", PendingIntent.getActivity(context2, 0, intent, 1140850688));
                    context2.startActivity(intent2);
                    objB2 = c1518Tf1;
                } catch (Throwable th2) {
                    objB2 = RQ1.b(th2);
                }
                Throwable thA2 = PS0.a(objB2);
                if (thA2 != null) {
                    c5423k112.b(thA2);
                }
                return c1518Tf1;
            default:
                O90.f((C1518Tf1) obj, "it");
                c1296Qj1.getClass();
                return new C3311d11(new C5406jw1(c1296Qj1, reviewInfo, i));
        }
    }
}
